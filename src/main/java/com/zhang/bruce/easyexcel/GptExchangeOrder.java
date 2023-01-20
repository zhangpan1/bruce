package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 换汇交易订单表
 *
 * @author wcyong
 *
 * @date 2023-01-18
 */
public class GptExchangeOrder {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 产品编码
     */
    private String productCode;

    /**
     * 业务方编码
     */
    private String businessCode;

    /**
     * 请求风控流水号
     */
    private String sequenceId;

    /**
     * 商户订单号
     */
    private String requestId;

    /**
     * 商户编号
     */
    private String merchantNo;

    /**
     * 商户中文签约名
     */
    private String signName;

    /**
     * 商户英文名
     */
    private String signNameEn;

    /**
     * 会员编号
     */
    private String memberId;

    /**
     * 商户kyc
     */
    private String merchantKyc;

    /**
     * 商户kyc 二级
     */
    private String merchantKycSub;

    /**
     * IP地址
     */
    private String ipAddress;

    /**
     * IP归属地
     */
    private String ipArea;

    /**
     * 是否代理IP 0否 1是
     */
    private String ipProxy;

    /**
     * 原币种
     */
    private String currency;

    /**
     * 原币种金额
     */
    private BigDecimal amount;

    /**
     * 目标币种
     */
    private String targetCurrency;

    /**
     * 目标币种金额
     */
    private BigDecimal targetAmount;

    /**
     * 折合人民币金额
     */
    private BigDecimal cnyAmount;

    /**
     * 备注
     */
    private String remark;

    /**
     * 申请换汇时间
     */
    private Date occurTime;

    /**
     * 完成换汇时间
     */
    private Date completeTime;

    /**
     * 黑名单耗时
     */
    private String blackTm;

    /**
     * 命中的黑名单数据
     */
    private String blackResult;

    /**
     * 黑名单结果编码 1命中黑名单 0未命中黑名单
     */
    private String blackResultCode;

    /**
     * 白名单结果
     */
    private String whiteResult;

    /**
     * 总耗时
     */
    private String totalTm;

    /**
     * 规则系统耗时
     */
    private String ruleTm;

    /**
     * 规则结果
     */
    private String ruleResult;

    /**
     * 最终生效的规则
     */
    private String trigerRule;

    /**
     * 命中的规则编码集合,多个使用逗号分割
     */
    private String ruleCodes;

    /**
     * 建议操作码  8000:阻断  8001:放行  8007:处理中
     */
    private String supportOperateCode;

    /**
     * 阻断类型 1:gpt黑名单校验拒绝  99:交易规则验证拒绝
     */
    private String blockType;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误消息
     */
    private String errorMsg;

    /**
     * 回调状态 0未回调 1回调成功 2回调失败
     */
    private String notifyStatus;

    /**
     * 回调次数
     */
    private Byte notifyNum;

    /**
     * 回调结果编码
     */
    private String notifyResultCode;

    /**
     * 回调结果描述
     */
    private String notifyResultMsg;

    /**
     * 支付结果 1:成功 0:失败 空:处理中
     */
    private String payResult;

    /**
     * 扩展字段 json格式
     */
    private String goodsInfo;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId == null ? null : sequenceId.trim();
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId == null ? null : requestId.trim();
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName == null ? null : signName.trim();
    }

    public String getSignNameEn() {
        return signNameEn;
    }

    public void setSignNameEn(String signNameEn) {
        this.signNameEn = signNameEn == null ? null : signNameEn.trim();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getMerchantKyc() {
        return merchantKyc;
    }

    public void setMerchantKyc(String merchantKyc) {
        this.merchantKyc = merchantKyc == null ? null : merchantKyc.trim();
    }

    public String getMerchantKycSub() {
        return merchantKycSub;
    }

    public void setMerchantKycSub(String merchantKycSub) {
        this.merchantKycSub = merchantKycSub == null ? null : merchantKycSub.trim();
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public String getIpArea() {
        return ipArea;
    }

    public void setIpArea(String ipArea) {
        this.ipArea = ipArea == null ? null : ipArea.trim();
    }

    public String getIpProxy() {
        return ipProxy;
    }

    public void setIpProxy(String ipProxy) {
        this.ipProxy = ipProxy == null ? null : ipProxy.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency == null ? null : targetCurrency.trim();
    }

    public BigDecimal getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(BigDecimal targetAmount) {
        this.targetAmount = targetAmount;
    }

    public BigDecimal getCnyAmount() {
        return cnyAmount;
    }

    public void setCnyAmount(BigDecimal cnyAmount) {
        this.cnyAmount = cnyAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Date occurTime) {
        this.occurTime = occurTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public String getBlackTm() {
        return blackTm;
    }

    public void setBlackTm(String blackTm) {
        this.blackTm = blackTm == null ? null : blackTm.trim();
    }

    public String getBlackResult() {
        return blackResult;
    }

    public void setBlackResult(String blackResult) {
        this.blackResult = blackResult == null ? null : blackResult.trim();
    }

    public String getBlackResultCode() {
        return blackResultCode;
    }

    public void setBlackResultCode(String blackResultCode) {
        this.blackResultCode = blackResultCode == null ? null : blackResultCode.trim();
    }

    public String getWhiteResult() {
        return whiteResult;
    }

    public void setWhiteResult(String whiteResult) {
        this.whiteResult = whiteResult == null ? null : whiteResult.trim();
    }

    public String getTotalTm() {
        return totalTm;
    }

    public void setTotalTm(String totalTm) {
        this.totalTm = totalTm == null ? null : totalTm.trim();
    }

    public String getRuleTm() {
        return ruleTm;
    }

    public void setRuleTm(String ruleTm) {
        this.ruleTm = ruleTm == null ? null : ruleTm.trim();
    }

    public String getRuleResult() {
        return ruleResult;
    }

    public void setRuleResult(String ruleResult) {
        this.ruleResult = ruleResult == null ? null : ruleResult.trim();
    }

    public String getTrigerRule() {
        return trigerRule;
    }

    public void setTrigerRule(String trigerRule) {
        this.trigerRule = trigerRule == null ? null : trigerRule.trim();
    }

    public String getRuleCodes() {
        return ruleCodes;
    }

    public void setRuleCodes(String ruleCodes) {
        this.ruleCodes = ruleCodes == null ? null : ruleCodes.trim();
    }

    public String getSupportOperateCode() {
        return supportOperateCode;
    }

    public void setSupportOperateCode(String supportOperateCode) {
        this.supportOperateCode = supportOperateCode == null ? null : supportOperateCode.trim();
    }

    public String getBlockType() {
        return blockType;
    }

    public void setBlockType(String blockType) {
        this.blockType = blockType == null ? null : blockType.trim();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    public String getNotifyStatus() {
        return notifyStatus;
    }

    public void setNotifyStatus(String notifyStatus) {
        this.notifyStatus = notifyStatus == null ? null : notifyStatus.trim();
    }

    public Byte getNotifyNum() {
        return notifyNum;
    }

    public void setNotifyNum(Byte notifyNum) {
        this.notifyNum = notifyNum;
    }

    public String getNotifyResultCode() {
        return notifyResultCode;
    }

    public void setNotifyResultCode(String notifyResultCode) {
        this.notifyResultCode = notifyResultCode == null ? null : notifyResultCode.trim();
    }

    public String getNotifyResultMsg() {
        return notifyResultMsg;
    }

    public void setNotifyResultMsg(String notifyResultMsg) {
        this.notifyResultMsg = notifyResultMsg == null ? null : notifyResultMsg.trim();
    }

    public String getPayResult() {
        return payResult;
    }

    public void setPayResult(String payResult) {
        this.payResult = payResult == null ? null : payResult.trim();
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo == null ? null : goodsInfo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
