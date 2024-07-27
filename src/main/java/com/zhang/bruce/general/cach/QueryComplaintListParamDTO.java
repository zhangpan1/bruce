package com.zhang.bruce.general.cach;

import java.util.Date;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/4/19 10:37 上午
 */
public class QueryComplaintListParamDTO {
    private String merchantNo;
    private String reportMerchantNo;
    private String reportFee;

    private Date beginDate;

    private Date endDate;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getReportMerchantNo() {
        return reportMerchantNo;
    }

    public void setReportMerchantNo(String reportMerchantNo) {
        this.reportMerchantNo = reportMerchantNo;
    }

    public String getReportFee() {
        return reportFee;
    }

    public void setReportFee(String reportFee) {
        this.reportFee = reportFee;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
