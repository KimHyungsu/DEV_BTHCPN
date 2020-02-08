package com.bthcpn.app.mapper;


import com.bthcpn.app.dto.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//interface로 만들면 함수 몸체를 구현하지 않아도 되기 때문에 interface로 만든다.
@Repository
@Mapper
public interface TestMapper{

    public List<Test> getAll() throws Exception;

    //user_account, email, phone_number, reg_dt, reg_user, mod_dt, mod_user

    void insertUser( @Param("user_account") String user_account
                    ,@Param("email") String email
                    ,@Param("phone_number") String phone_number
                    ,@Param("reg_user") String reg_user
                    ,@Param("mod_user") String mod_user);


}
