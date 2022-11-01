package com.zhang.bruce.springchain.business;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 钱包会员等级数据推送
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/24 7:47 下午
 */
public class WelletMemberLevelDataDto implements Serializable {

    private static final long serialVersionUID = 196572390709530839L;
    private String applyNo;

    private String memberNo;

    private String merchantNo;

    private String certficateType;

    private String certficateNo;

    private String mobile;

    private String memberName;

    private String applyLevel;

    private Date applyTime;

    private Date passTime;

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getCertficateType() {
        return certficateType;
    }

    public void setCertficateType(String certficateType) {
        this.certficateType = certficateType;
    }

    public String getCertficateNo() {
        return certficateNo;
    }

    public void setCertficateNo(String certficateNo) {
        this.certficateNo = certficateNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getApplyLevel() {
        return applyLevel;
    }

    public void setApplyLevel(String applyLevel) {
        this.applyLevel = applyLevel;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getPassTime() {
        return passTime;
    }

    public void setPassTime(Date passTime) {
        this.passTime = passTime;
    }
}
