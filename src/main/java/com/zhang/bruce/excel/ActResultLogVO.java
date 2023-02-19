package com.zhang.bruce.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author bruce
 * @version 1.0
 * @date 2023/2/19 15:13
 * @Description:
 */
public class ActResultLogVO implements Serializable {


    @ExcelProperty(value = "onlineseqid",index = 0)
    private String onlineseqid;

    @ExcelProperty(value = "businessid",index = 1)
    private String businessid;

    @ExcelProperty(value = "becifno",index = 2)
    private String becifno;

    @ExcelProperty(value = "ivisresult",index = 3)
    private String ivisresult;

    @ExcelProperty(value = "createdby",index = 4)
    private String createdby;

    @ExcelProperty(value = "createddate",converter = EasyExcelLocalDateConvert.class)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate createddate;

    @ExcelProperty(value = "updateby",index = 6)
    private String updateby;

    @ExcelProperty(value = "updateddate",index = 7,converter = EasyExcelLocalDateConvert.class)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate updateddate;

    @ExcelProperty(value = "risklevel",index = 8)
    private String risklevel;

    public String getOnlineseqid() {
        return onlineseqid;
    }

    public void setOnlineseqid(String onlineseqid) {
        this.onlineseqid = onlineseqid;
    }

    public String getBusinessid() {
        return businessid;
    }

    public void setBusinessid(String businessid) {
        this.businessid = businessid;
    }

    public String getBecifno() {
        return becifno;
    }

    public void setBecifno(String becifno) {
        this.becifno = becifno;
    }

    public String getIvisresult() {
        return ivisresult;
    }

    public void setIvisresult(String ivisresult) {
        this.ivisresult = ivisresult;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public LocalDate getCreateddate() {
        return createddate;
    }

    public void setCreateddate(LocalDate createddate) {
        this.createddate = createddate;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

    public LocalDate getUpdateddate() {
        return updateddate;
    }

    public void setUpdateddate(LocalDate updateddate) {
        this.updateddate = updateddate;
    }

    public String getRisklevel() {
        return risklevel;
    }

    public void setRisklevel(String risklevel) {
        this.risklevel = risklevel;
    }
}
