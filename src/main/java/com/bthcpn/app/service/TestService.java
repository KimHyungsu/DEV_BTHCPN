package com.bthcpn.app.service;



import com.bthcpn.app.dto.Test;
import com.bthcpn.app.dto.usrInfo;
import com.bthcpn.app.mapper.TestMapper;
import com.bthcpn.app.mapper.UsrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    TestMapper testMapper;

    @Autowired
    UsrMapper usrMapper;

    public List<usrInfo> usrInfo() throws Exception{
        System.out.println("2. 서비스 진입");
        return usrMapper.usrInfo();
    }

    public List<Test> getAll() throws Exception{
        System.out.println("2. 서비스 진입");
        return testMapper.getAll();
    }

    public void insertUser(String user_account
                         , String email
                         , String phone_number
                         , String reg_user
                         , String mod_user) throws  Exception{
        System.out.println("2. 서비스 진입(insertUser)");
        testMapper.insertUser(user_account,email,phone_number,reg_user,mod_user);
    }

    public void insertUsrInfo(String name,
                                String email,
                                String phone,
                                String r1,
                                String inAmt,
                                String outAmt) throws  Exception{
        System.out.println("2. 서비스 진입(insertUser)");
        usrMapper.insertUsrInfo(name,email,phone,r1,inAmt,outAmt);
    }
}
