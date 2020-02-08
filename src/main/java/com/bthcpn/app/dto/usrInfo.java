package com.bthcpn.app.dto;

import lombok.Data;

@Data
public class usrInfo {


    private String seq;
    private String custNm;
    private String email;
    private String carrierCd;
    private String carrierNm;
    private String phoneNo;
    private String jboCd;
    private String jobNm;
    private String incmAmt;
    private String hopLoanAmt;

    public String getCustNm() {
        return custNm;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarrierCd() {
        return carrierCd;
    }

    public void setCarrierCd(String carrierCd) {
        this.carrierCd = carrierCd;
    }

    public String getCarrierNm() {
        return carrierNm;
    }

    public void setCarrierNm(String carrierNm) {
        this.carrierNm = carrierNm;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getJboCd() {
        return jboCd;
    }

    public void setJboCd(String jboCd) {
        this.jboCd = jboCd;
    }

    public String getJobNm() {
        return jobNm;
    }

    public void setJobNm(String jobNm) {
        this.jobNm = jobNm;
    }

    public String getIncmAmt() {
        return incmAmt;
    }

    public void setIncmAmt(String incmAmt) {
        this.incmAmt = incmAmt;
    }

    public String getHopLoanAmt() {
        return hopLoanAmt;
    }

    public void setHopLoanAmt(String hopLoanAmt) {
        this.hopLoanAmt = hopLoanAmt;
    }


}
