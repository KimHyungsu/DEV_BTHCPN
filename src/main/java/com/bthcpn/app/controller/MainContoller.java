package com.bthcpn.app.controller;

import com.bthcpn.app.dto.Test;
import com.bthcpn.app.dto.usrInfo;
import com.bthcpn.app.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainContoller {

    @Autowired
    TestService testService;

    //대출정보지 개인정보 기입페이지
    @RequestMapping("/entLoanInfo")
    public String hello() throws Exception{
        return "entLoanInfo";
    }

    @RequestMapping("/index")
    public String index() throws Exception{
        return "index";
    }

    @RequestMapping("/entSaveUsrInfo")
    public String entSaveUsrInfo() throws Exception{
        return "entSaveUsrInfo";
    }

    @RequestMapping("/usrInfoTb")
    public String usrInfo(Model model) throws Exception{
        List<usrInfo> usrInfo = testService.usrInfo();

        model.addAttribute("usrInfo",usrInfo);

        return "usrInfoTb";
    }


    @RequestMapping(value = "/sendSaveUsrInfo", method= RequestMethod.POST)
    public String sendSaveUsrInfo(@RequestParam("name") String name,
                                  @RequestParam("email") String email,
                                  @RequestParam("phone") String phone,
                                  @RequestParam("r1") String r1,
                                  @RequestParam("inAmt") String inAmt,
                                  @RequestParam("outAmt") String outAmt,
                                  Model model) throws Exception{
        System.out.println(name+email+phone+inAmt+outAmt+r1);

        testService.insertUsrInfo(name, email, phone, r1, inAmt, outAmt);
        /*
        model.addAttribute("name",name);
        model.addAttribute("email",email);
        model.addAttribute("phone",phone);
        model.addAttribute("inAmt",inAmt);
        model.addAttribute("outAmt",outAmt);
         */
        return "entSaveUsrInfoCfm";
    }

}
