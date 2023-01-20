package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * null
 *
 * @author wcyong
 *
 * @date 2023-01-18
 */
public class TblGptRechargeOrder {
    private Long id;

    private String productCode;

    private String businessCode;

    private String sequenceId;

    private String requestId;

    private String merchantNo;

    private String signName;

    private String signNameEn;

    private String memberId;

    private String rechargeType;

    private String ipAddress;

    private String ipArea;

    private String ipProxy;

    private String payerType;

    private String payerName;

    private String payerNameDigest;

    private String payerBankCardId;

    private String payerBankCardIdDigest;

    private String payerBankName;

    private String payerBankCardArea;

    private String payerBankCardNameBs;

    private String payerBankCardTypeBs;

    private String payerBankNameBs;

    private String payerBankCode;

    private String payerBankCodeType;

    private String payerCountryCode;

    private String payerCountryNameEn;

    private String payerCountryNameZh;

    private String payerCountryAlph2Code;

    private String payerCountryAlph3Code;

    private String receiverBankCode;

    private String receiverBankCardId;

    private String receiverBankCardArea;

    private String receiverBankNameBs;

    private String receiverBankCardNameBs;

    private String receiverBankCardTypeBs;

    private String currency;

    private BigDecimal amount;

    private BigDecimal cnyAmount;

    private String targetCurrency;

    private BigDecimal targetAmount;

    private BigDecimal targetCnyAmount;

    private String notifyUrl;

    private String remark;

    private Date occurTime;

    private String blackTm;

    private String blackResult;

    private String blackResultCode;

    private String whiteResult;

    private String totalTm;

    private String ruleTm;

    private String ruleResult;

    private String trigerRule;

    private String ruleCodes;

    private String supportOperateCode;

    private String blockType;

    private String errorCode;

    private String errorMsg;

    private String notifyStatus;

    private Integer notifyNum;

    private String notifyResultCode;

    private String notifyResultMsg;

    private String payResult;

    private String goodsInfo;

    private Date createTime;

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

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType == null ? null : rechargeType.trim();
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

    public String getPayerType() {
        return payerType;
    }

    public void setPayerType(String payerType) {
        this.payerType = payerType == null ? null : payerType.trim();
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName == null ? null : payerName.trim();
    }

    public String getPayerNameDigest() {
        return payerNameDigest;
    }

    public void setPayerNameDigest(String payerNameDigest) {
        this.payerNameDigest = payerNameDigest == null ? null : payerNameDigest.trim();
    }

    public String getPayerBankCardId() {
        return payerBankCardId;
    }

    public void setPayerBankCardId(String payerBankCardId) {
        this.payerBankCardId = payerBankCardId == null ? null : payerBankCardId.trim();
    }

    public String getPayerBankCardIdDigest() {
        return payerBankCardIdDigest;
    }

    public void setPayerBankCardIdDigest(String payerBankCardIdDigest) {
        this.payerBankCardIdDigest = payerBankCardIdDigest == null ? null : payerBankCardIdDigest.trim();
    }

    public String getPayerBankName() {
        return payerBankName;
    }

    public void setPayerBankName(String payerBankName) {
        this.payerBankName = payerBankName == null ? null : payerBankName.trim();
    }

    public String getPayerBankCardArea() {
        return payerBankCardArea;
    }

    public void setPayerBankCardArea(String payerBankCardArea) {
        this.payerBankCardArea = payerBankCardArea == null ? null : payerBankCardArea.trim();
    }

    public String getPayerBankCardNameBs() {
        return payerBankCardNameBs;
    }

    public void setPayerBankCardNameBs(String payerBankCardNameBs) {
        this.payerBankCardNameBs = payerBankCardNameBs == null ? null : payerBankCardNameBs.trim();
    }

    public String getPayerBankCardTypeBs() {
        return payerBankCardTypeBs;
    }

    public void setPayerBankCardTypeBs(String payerBankCardTypeBs) {
        this.payerBankCardTypeBs = payerBankCardTypeBs == null ? null : payerBankCardTypeBs.trim();
    }

    public String getPayerBankNameBs() {
        return payerBankNameBs;
    }

    public void setPayerBankNameBs(String payerBankNameBs) {
        this.payerBankNameBs = payerBankNameBs == null ? null : payerBankNameBs.trim();
    }

    public String getPayerBankCode() {
        return payerBankCode;
    }

    public void setPayerBankCode(String payerBankCode) {
        this.payerBankCode = payerBankCode == null ? null : payerBankCode.trim();
    }

    public String getPayerBankCodeType() {
        return payerBankCodeType;
    }

    public void setPayerBankCodeType(String payerBankCodeType) {
        this.payerBankCodeType = payerBankCodeType == null ? null : payerBankCodeType.trim();
    }

    public String getPayerCountryCode() {
        return payerCountryCode;
    }

    public void setPayerCountryCode(String payerCountryCode) {
        this.payerCountryCode = payerCountryCode == null ? null : payerCountryCode.trim();
    }

    public String getPayerCountryNameEn() {
        return payerCountryNameEn;
    }

    public void setPayerCountryNameEn(String payerCountryNameEn) {
        this.payerCountryNameEn = payerCountryNameEn == null ? null : payerCountryNameEn.trim();
    }

    public String getPayerCountryNameZh() {
        return payerCountryNameZh;
    }

    public void setPayerCountryNameZh(String payerCountryNameZh) {
        this.payerCountryNameZh = payerCountryNameZh == null ? null : payerCountryNameZh.trim();
    }

    public String getPayerCountryAlph2Code() {
        return payerCountryAlph2Code;
    }

    public void setPayerCountryAlph2Code(String payerCountryAlph2Code) {
        this.payerCountryAlph2Code = payerCountryAlph2Code == null ? null : payerCountryAlph2Code.trim();
    }

    public String getPayerCountryAlph3Code() {
        return payerCountryAlph3Code;
    }

    public void setPayerCountryAlph3Code(String payerCountryAlph3Code) {
        this.payerCountryAlph3Code = payerCountryAlph3Code == null ? null : payerCountryAlph3Code.trim();
    }

    public String getReceiverBankCode() {
        return receiverBankCode;
    }

    public void setReceiverBankCode(String receiverBankCode) {
        this.receiverBankCode = receiverBankCode == null ? null : receiverBankCode.trim();
    }

    public String getReceiverBankCardId() {
        return receiverBankCardId;
    }

    public void setReceiverBankCardId(String receiverBankCardId) {
        this.receiverBankCardId = receiverBankCardId == null ? null : receiverBankCardId.trim();
    }

    public String getReceiverBankCardArea() {
        return receiverBankCardArea;
    }

    public void setReceiverBankCardArea(String receiverBankCardArea) {
        this.receiverBankCardArea = receiverBankCardArea == null ? null : receiverBankCardArea.trim();
    }

    public String getReceiverBankNameBs() {
        return receiverBankNameBs;
    }

    public void setReceiverBankNameBs(String receiverBankNameBs) {
        this.receiverBankNameBs = receiverBankNameBs == null ? null : receiverBankNameBs.trim();
    }

    public String getReceiverBankCardNameBs() {
        return receiverBankCardNameBs;
    }

    public void setReceiverBankCardNameBs(String receiverBankCardNameBs) {
        this.receiverBankCardNameBs = receiverBankCardNameBs == null ? null : receiverBankCardNameBs.trim();
    }

    public String getReceiverBankCardTypeBs() {
        return receiverBankCardTypeBs;
    }

    public void setReceiverBankCardTypeBs(String receiverBankCardTypeBs) {
        this.receiverBankCardTypeBs = receiverBankCardTypeBs == null ? null : receiverBankCardTypeBs.trim();
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

    public BigDecimal getCnyAmount() {
        return cnyAmount;
    }

    public void setCnyAmount(BigDecimal cnyAmount) {
        this.cnyAmount = cnyAmount;
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

    public BigDecimal getTargetCnyAmount() {
        return targetCnyAmount;
    }

    public void setTargetCnyAmount(BigDecimal targetCnyAmount) {
        this.targetCnyAmount = targetCnyAmount;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
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

    public Integer getNotifyNum() {
        return notifyNum;
    }

    public void setNotifyNum(Integer notifyNum) {
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
