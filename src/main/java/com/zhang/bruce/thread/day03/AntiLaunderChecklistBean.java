package com.zhang.bruce.thread.day03;

import java.util.List;
import java.util.Set;

public class AntiLaunderChecklistBean {
    /**
     * 核查单时间
     */
    private String checkListTime;
    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 风险类型|涉罪类型
     */
    private Set<String> riskType;

    /**
     * 风险分析|疑点分析
     */
    private String riskAnalysis;
    /**
     * 资金交易及客户行为情况-新增字段
     */
    private String occCustomerAction;
    /**
     * 商户处置
     */
    private String riskDeal;
    /**
     * 触发规则编码
     */
    private String triggerRules;
    /**
     * 查调信息
     */
    private String investigationInfo;

    /**
     * 初审人员
     */
    private String firstAuditOperator;
    /**
     * 初审时间
     */
    private String firstAuditTime;
    /**
     * 复核人员
     */
    private String checkAuditOperator;
    /**
     * 复核意见
     */
    private String checkAuditMessage;
    /**
     * 复核时间
     */
    private String checkAuditTime;
    /**
     * 附件
     */
    private List<String> uploadFileList;
    /**
     * 创建时间
     */
    private String createTime;

    /**
     *  签约类型
     */
    private  String signType;

    public String getCheckListTime() {
        return checkListTime;
    }

    public void setCheckListTime(String checkListTime) {
        this.checkListTime = checkListTime;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public Set<String> getRiskType() {
        return riskType;
    }

    public void setRiskType(Set<String> riskType) {
        this.riskType = riskType;
    }


    public String getRiskDeal() {
        return riskDeal;
    }

    public void setRiskDeal(String riskDeal) {
        this.riskDeal = riskDeal;
    }

    public String getTriggerRules() {
        return triggerRules;
    }

    public void setTriggerRules(String triggerRules) {
        this.triggerRules = triggerRules;
    }

    public String getInvestigationInfo() {
        return investigationInfo;
    }

    public void setInvestigationInfo(String investigationInfo) {
        this.investigationInfo = investigationInfo;
    }

    public String getFirstAuditOperator() {
        return firstAuditOperator;
    }

    public void setFirstAuditOperator(String firstAuditOperator) {
        this.firstAuditOperator = firstAuditOperator;
    }

    public String getFirstAuditTime() {
        return firstAuditTime;
    }

    public void setFirstAuditTime(String firstAuditTime) {
        this.firstAuditTime = firstAuditTime;
    }

    public String getCheckAuditOperator() {
        return checkAuditOperator;
    }

    public void setCheckAuditOperator(String checkAuditOperator) {
        this.checkAuditOperator = checkAuditOperator;
    }

    public String getCheckAuditMessage() {
        return checkAuditMessage;
    }

    public void setCheckAuditMessage(String checkAuditMessage) {
        this.checkAuditMessage = checkAuditMessage;
    }

    public String getCheckAuditTime() {
        return checkAuditTime;
    }

    public void setCheckAuditTime(String checkAuditTime) {
        this.checkAuditTime = checkAuditTime;
    }

    public List<String> getUploadFileList() {
        return uploadFileList;
    }

    public void setUploadFileList(List<String> uploadFileList) {
        this.uploadFileList = uploadFileList;
    }

    public String getRiskAnalysis() {
        return riskAnalysis;
    }

    public void setRiskAnalysis(String riskAnalysis) {
        this.riskAnalysis = riskAnalysis;
    }

    public String getOccCustomerAction() {
        return occCustomerAction;
    }

    public void setOccCustomerAction(String occCustomerAction) {
        this.occCustomerAction = occCustomerAction;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }
}
