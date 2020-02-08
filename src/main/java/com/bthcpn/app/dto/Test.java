package com.bthcpn.app.dto;

import lombok.Data;

@Data
public class Test {

    private String user_id;
    private String user_account;
    private String email;
    private String phone_number;
    private String reg_dt;
    private String reg_user;
    private String mod_dt;
    private String mod_user;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_account() {
        return user_account;
    }

    public void setUser_account(String user_account) {
        this.user_account = user_account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getReg_dt() {
        return reg_dt;
    }

    public void setReg_dt(String reg_dt) {
        this.reg_dt = reg_dt;
    }

    public String getReg_user() {
        return reg_user;
    }

    public void setReg_user(String reg_user) {
        this.reg_user = reg_user;
    }

    public String getMod_dt() {
        return mod_dt;
    }

    public void setMod_dt(String mod_dt) {
        this.mod_dt = mod_dt;
    }

    public String getMod_user() {
        return mod_user;
    }

    public void setMod_user(String mod_user) {
        this.mod_user = mod_user;
    }



}
