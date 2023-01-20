package com.zhang.bruce.easyexcel;

import java.util.Date;

/**
 *
 *
 * @author wcyong
 *
 * @date 2023-01-13
 */
public class MerchantSomplaint {
    private Long id;

    /**
     * acceptance_time的日期格式
     */
    private Date acceptanceDate;

    private Date acceptanceTime;

    private String somplaintSource;

    private String merchantNo;

    private String orderNo;

    private String transactionAmount;

    private Date payTime;

    private String somplaintWay;

    private String reportType;

    private String somplaintReason;

    private String somplaintBy;

    private String contactWay;

    private String lastModifiedBy;

    private Date lastModifiedTime;

    private String somplaintType;

    private String bankOrderNo;

    private String somplaintUrl;

    private String workOrderNo;

    /**
     * 创建时间
     */
    private Date createTime;

    private String channel;

    private String complaintNature;

    private String processContent;

    private String orderCode;

    private String somplaintDetail;

    private String supplementComment;

    private String ypMecNo;

    private Short punishStatus;

    /**
     * 银行卡号
     */
    private String crdNo;

    /**
     * 证件号
     */
    private String idNo;

    /**
     * 用户id
     */
    private String userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAcceptanceDate() {
        return acceptanceDate;
    }

    public void setAcceptanceDate(Date acceptanceDate) {
        this.acceptanceDate = acceptanceDate;
    }

    public Date getAcceptanceTime() {
        return acceptanceTime;
    }

    public void setAcceptanceTime(Date acceptanceTime) {
        this.acceptanceTime = acceptanceTime;
    }

    public String getSomplaintSource() {
        return somplaintSource;
    }

    public void setSomplaintSource(String somplaintSource) {
        this.somplaintSource = somplaintSource == null ? null : somplaintSource.trim();
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount == null ? null : transactionAmount.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getSomplaintWay() {
        return somplaintWay;
    }

    public void setSomplaintWay(String somplaintWay) {
        this.somplaintWay = somplaintWay == null ? null : somplaintWay.trim();
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType == null ? null : reportType.trim();
    }

    public String getSomplaintReason() {
        return somplaintReason;
    }

    public void setSomplaintReason(String somplaintReason) {
        this.somplaintReason = somplaintReason == null ? null : somplaintReason.trim();
    }

    public String getSomplaintBy() {
        return somplaintBy;
    }

    public void setSomplaintBy(String somplaintBy) {
        this.somplaintBy = somplaintBy == null ? null : somplaintBy.trim();
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay == null ? null : contactWay.trim();
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy == null ? null : lastModifiedBy.trim();
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getSomplaintType() {
        return somplaintType;
    }

    public void setSomplaintType(String somplaintType) {
        this.somplaintType = somplaintType == null ? null : somplaintType.trim();
    }

    public String getBankOrderNo() {
        return bankOrderNo;
    }

    public void setBankOrderNo(String bankOrderNo) {
        this.bankOrderNo = bankOrderNo == null ? null : bankOrderNo.trim();
    }

    public String getSomplaintUrl() {
        return somplaintUrl;
    }

    public void setSomplaintUrl(String somplaintUrl) {
        this.somplaintUrl = somplaintUrl == null ? null : somplaintUrl.trim();
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo == null ? null : workOrderNo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getComplaintNature() {
        return complaintNature;
    }

    public void setComplaintNature(String complaintNature) {
        this.complaintNature = complaintNature == null ? null : complaintNature.trim();
    }

    public String getProcessContent() {
        return processContent;
    }

    public void setProcessContent(String processContent) {
        this.processContent = processContent == null ? null : processContent.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getSomplaintDetail() {
        return somplaintDetail;
    }

    public void setSomplaintDetail(String somplaintDetail) {
        this.somplaintDetail = somplaintDetail == null ? null : somplaintDetail.trim();
    }

    public String getSupplementComment() {
        return supplementComment;
    }

    public void setSupplementComment(String supplementComment) {
        this.supplementComment = supplementComment == null ? null : supplementComment.trim();
    }

    public String getYpMecNo() {
        return ypMecNo;
    }

    public void setYpMecNo(String ypMecNo) {
        this.ypMecNo = ypMecNo == null ? null : ypMecNo.trim();
    }

    public Short getPunishStatus() {
        return punishStatus;
    }

    public void setPunishStatus(Short punishStatus) {
        this.punishStatus = punishStatus;
    }

    public String getCrdNo() {
        return crdNo;
    }

    public void setCrdNo(String crdNo) {
        this.crdNo = crdNo == null ? null : crdNo.trim();
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}
