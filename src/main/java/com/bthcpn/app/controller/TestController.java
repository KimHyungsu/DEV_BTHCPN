package com.bthcpn.app.controller;



import com.bthcpn.app.dto.Test;
import com.bthcpn.app.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/query")
    public @ResponseBody List<Test> query() throws Exception{

        System.out.println("1. 컨트롤러 진입");
        return testService.getAll();
    }

    @RequestMapping(value = "/insertUser")
    public void insertUser() throws Exception{

        testService.insertUser("김형수수"
                                    ,"daa@naver.com"
                                    ,"0103322132"
                                    ,"admin"
                                    ,"admin");
    }


}
