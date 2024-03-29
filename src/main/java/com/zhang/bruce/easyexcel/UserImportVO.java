package com.zhang.bruce.easyexcel;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: xueqimiao
 * @Date: 2022/9/28 10:10
 * 导入专用VO 所有数据类型均用String接收 避免用户随便乱输入 接收不同的类型报异常  比如 年龄是int类型  用户输入十三 后台就会报异常
 */
@Data
public class UserImportVO implements Serializable {
    /**
     * @ExcelIgnore 不导出此列
     */
    @ExcelIgnore
    private String id;


    /**
     * 业务方
     */
    @ExcelProperty(value = "ACCEPTANCE_TIME")
    private String acceptanceTime;

    /**
     * 支付方式
     */
    @ExcelProperty(value = "SOMPLAINT_SOURCE")
    private String somplaintSource;

    /**
     * 商户编号
     */
    @ExcelProperty(value = "MERCHANT_NO")
    private String merchantNo;

    /**
     * 表名
     */
    @ExcelProperty(value = "ORDER_NO")
    private String orderNo;

    /**
     * 交易总金额
     */
    @ExcelProperty(value = "TRANSACTION_AMOUNT")
    private String transactionAmount;

    /**
     * 总交易笔数
     */
    @ExcelProperty(value = "PAY_TIME")
    private String payTime;

    /**
     * 支付结果
     */
    @ExcelProperty(value = "SOMPLAINT_WAY")
    private String somplaintWay;

    /**
     * 拼接结果字段
     */
    @ExcelProperty(value = "REPORT_TYPE")
    private String reportType;

    /**
     * 月份字段
     */
    @ExcelProperty(value = "SOMPLAINT_REASON")
    private String somplaintReason;

    /**
     * 交易时间
     */
    @ExcelProperty(value = "SOMPLAINT_BY")
    private String somplaintBy;

    /**
     * 创建时间
     */
    @ExcelProperty(value = "CONTACT_WAY")
    private String contactWay;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "LAST_MODIFIED_BY")
    private String lastModifiedBy;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "LAST_MODIFIED_TIME")
    private String lastModifiedTime;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "SOMPLAINT_TYPE")
    private String somplaintType;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "BANK_ORDER_NO")
    private String bankOrderNo;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "SOMPLAINT_URL")
    private String somplaintUrl;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "WORK_ORDER_NO")
    private String workOrderNo;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "CREATE_TIME")
    private String createTime;

    @ExcelProperty(value = "ACCEPTANCE_DATE")
    private String acceptanceDate;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "CHANNEL")
    private String channel;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "COMPLAINT_NATURE")
    private String complaintNature;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "PROCESS_CONTENT")
    private String processContent;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "ORDER_CODE")
    private String orderCode;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "SOMPLAINT_DETAIL")
    private String somplaintDetail;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "SUPPLEMENT_COMMENT")
    private String supplementComment;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "YP_MEC_NO")
    private String ypMecNo;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "PUNISH_STATUS")
    private String punishStatus;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "CRD_NO")
    private String crdNo;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "ID_NO")
    private String idNo;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "USER_ID")
    private String userId;


    public String getAcceptanceDate() {
        return acceptanceDate;
    }

    public void setAcceptanceDate(String acceptanceDate) {
        this.acceptanceDate = acceptanceDate;
    }

    public String getAcceptanceTime() {
        return acceptanceTime;
    }

    public void setAcceptanceTime(String acceptanceTime) {
        this.acceptanceTime = acceptanceTime;
    }

    public String getSomplaintSource() {
        return somplaintSource;
    }

    public void setSomplaintSource(String somplaintSource) {
        this.somplaintSource = somplaintSource;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getSomplaintWay() {
        return somplaintWay;
    }

    public void setSomplaintWay(String somplaintWay) {
        this.somplaintWay = somplaintWay;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getSomplaintReason() {
        return somplaintReason;
    }

    public void setSomplaintReason(String somplaintReason) {
        this.somplaintReason = somplaintReason;
    }

    public String getSomplaintBy() {
        return somplaintBy;
    }

    public void setSomplaintBy(String somplaintBy) {
        this.somplaintBy = somplaintBy;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getSomplaintType() {
        return somplaintType;
    }

    public void setSomplaintType(String somplaintType) {
        this.somplaintType = somplaintType;
    }

    public String getBankOrderNo() {
        return bankOrderNo;
    }

    public void setBankOrderNo(String bankOrderNo) {
        this.bankOrderNo = bankOrderNo;
    }

    public String getSomplaintUrl() {
        return somplaintUrl;
    }

    public void setSomplaintUrl(String somplaintUrl) {
        this.somplaintUrl = somplaintUrl;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getComplaintNature() {
        return complaintNature;
    }

    public void setComplaintNature(String complaintNature) {
        this.complaintNature = complaintNature;
    }

    public String getProcessContent() {
        return processContent;
    }

    public void setProcessContent(String processContent) {
        this.processContent = processContent;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getSomplaintDetail() {
        return somplaintDetail;
    }

    public void setSomplaintDetail(String somplaintDetail) {
        this.somplaintDetail = somplaintDetail;
    }

    public String getSupplementComment() {
        return supplementComment;
    }

    public void setSupplementComment(String supplementComment) {
        this.supplementComment = supplementComment;
    }

    public String getYpMecNo() {
        return ypMecNo;
    }

    public void setYpMecNo(String ypMecNo) {
        this.ypMecNo = ypMecNo;
    }

    public String getPunishStatus() {
        return punishStatus;
    }

    public void setPunishStatus(String punishStatus) {
        this.punishStatus = punishStatus;
    }

    public String getCrdNo() {
        return crdNo;
    }

    public void setCrdNo(String crdNo) {
        this.crdNo = crdNo;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
