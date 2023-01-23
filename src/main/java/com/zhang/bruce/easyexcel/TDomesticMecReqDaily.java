package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 复盘报告-按照商编统计当月交易结果
 *
 * @author wcyong
 *
 * @date 2023-01-01
 */
public class TDomesticMecReqDaily {
    /**
     * 数据库id增增
     */
    private Long id;

    /**
     * 产品编码
     */
    private String prod;

    /**
     * 业务方
     */
    private String biz;

    /**
     * 支付方式
     */
    private String payWay;

    /**
     * 商户编号
     */
    private String mecNo;

    /**
     * 表名商户编号
     */
    private String tableName;

    /**
     * 交易总金额
     */
    private BigDecimal amt;

    /**
     * 总交易笔数
     */
    private Long totalCount;

    /**
     * 支付结果
     */
    private String payResult;

    /**
     * 拼接结果字段
     */
    private String categoryResult;

    /**
     * 月份字段
     */
    private String monthStr;

    /**
     * 交易时间
     */
    private Date occTm;

    /**
     * 创建时间
     */
    private Date ctTm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod == null ? null : prod.trim();
    }

    public String getBiz() {
        return biz;
    }

    public void setBiz(String biz) {
        this.biz = biz == null ? null : biz.trim();
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public String getMecNo() {
        return mecNo;
    }

    public void setMecNo(String mecNo) {
        this.mecNo = mecNo == null ? null : mecNo.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public String getPayResult() {
        return payResult;
    }

    public void setPayResult(String payResult) {
        this.payResult = payResult == null ? null : payResult.trim();
    }

    public String getCategoryResult() {
        return categoryResult;
    }

    public void setCategoryResult(String categoryResult) {
        this.categoryResult = categoryResult == null ? null : categoryResult.trim();
    }

    public String getMonthStr() {
        return monthStr;
    }

    public void setMonthStr(String monthStr) {
        this.monthStr = monthStr == null ? null : monthStr.trim();
    }

    public Date getOccTm() {
        return occTm;
    }

    public void setOccTm(Date occTm) {
        this.occTm = occTm;
    }

    public Date getCtTm() {
        return ctTm;
    }

    public void setCtTm(Date ctTm) {
        this.ctTm = ctTm;
    }
}
