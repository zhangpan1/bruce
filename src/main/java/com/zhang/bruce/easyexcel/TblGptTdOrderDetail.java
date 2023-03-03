package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * null
 *
 * @author wcyong
 *
 * @date 2023-02-05
 */
public class TblGptTdOrderDetail {
    private Long id;

    private String orderId;

    private String parentRequestId;

    private String productCode;

    private String businessCode;

    private String sequenceId;

    private String requestId;

    private String merchantNo;

    private String signName;

    private String signNameEn;

    private String merchantKyc;

    private String merchantKycSub;

    private String ipAddress;

    private String ipArea;

    private String ipProxy;

    private String sellerId;

    private String sellerWebsite;

    private String sellerWebsiteDomain;

    private String goodsName;

    private String goodsType;

    private Integer goodsQuantity;

    private String payerName;

    private String payerNameDigest;

    private String payerIdCard;

    private String payerIdCardDigest;

    private String payerIdCardArea;

    private String payerType;

    private String payerBankCardId;

    private String payerBankCardIdDigest;

    private String payerBankName;

    private String payerBankCardArea;

    private String payerBankCardNameBs;

    private String payerBankCardTypeBs;

    private String payerBankNameBs;

    private String receiverName;

    private String receiverNameDigest;

    private String receiverIdCard;

    private String receiverIdCardDigest;

    private String receiverIdCardArea;

    private String receiverBankCardId;

    private String receiverBankCardIdDigest;

    private String receiverBankCardArea;

    private String receiverBankName;

    private String receiverBankCardNameBs;

    private String receiverBankCardTypeBs;

    private String receiverBankNameBs;

    private String receiverPhone;

    private String receiverPhoneDigest;

    private String receiverPhoneArea;

    private String receiverPhoneRisk;

    private String receiverPhoneAlt;

    private String currency;

    private BigDecimal amount;

    private BigDecimal cnyAmount;

    private Date occurTime;

    private Date completeTime;

    private Date uploadTime;

    private String exchangeReason;

    private String tradePlatform;

    private String tradeParam;

    private String logisticsCompany;

    private String logisticsNo;

    private String status;

    private String remark;

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getParentRequestId() {
        return parentRequestId;
    }

    public void setParentRequestId(String parentRequestId) {
        this.parentRequestId = parentRequestId == null ? null : parentRequestId.trim();
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

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public String getSellerWebsite() {
        return sellerWebsite;
    }

    public void setSellerWebsite(String sellerWebsite) {
        this.sellerWebsite = sellerWebsite == null ? null : sellerWebsite.trim();
    }

    public String getSellerWebsiteDomain() {
        return sellerWebsiteDomain;
    }

    public void setSellerWebsiteDomain(String sellerWebsiteDomain) {
        this.sellerWebsiteDomain = sellerWebsiteDomain == null ? null : sellerWebsiteDomain.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public Integer getGoodsQuantity() {
        return goodsQuantity;
    }

    public void setGoodsQuantity(Integer goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
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

    public String getPayerIdCard() {
        return payerIdCard;
    }

    public void setPayerIdCard(String payerIdCard) {
        this.payerIdCard = payerIdCard == null ? null : payerIdCard.trim();
    }

    public String getPayerIdCardDigest() {
        return payerIdCardDigest;
    }

    public void setPayerIdCardDigest(String payerIdCardDigest) {
        this.payerIdCardDigest = payerIdCardDigest == null ? null : payerIdCardDigest.trim();
    }

    public String getPayerIdCardArea() {
        return payerIdCardArea;
    }

    public void setPayerIdCardArea(String payerIdCardArea) {
        this.payerIdCardArea = payerIdCardArea == null ? null : payerIdCardArea.trim();
    }

    public String getPayerType() {
        return payerType;
    }

    public void setPayerType(String payerType) {
        this.payerType = payerType == null ? null : payerType.trim();
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

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getReceiverNameDigest() {
        return receiverNameDigest;
    }

    public void setReceiverNameDigest(String receiverNameDigest) {
        this.receiverNameDigest = receiverNameDigest == null ? null : receiverNameDigest.trim();
    }

    public String getReceiverIdCard() {
        return receiverIdCard;
    }

    public void setReceiverIdCard(String receiverIdCard) {
        this.receiverIdCard = receiverIdCard == null ? null : receiverIdCard.trim();
    }

    public String getReceiverIdCardDigest() {
        return receiverIdCardDigest;
    }

    public void setReceiverIdCardDigest(String receiverIdCardDigest) {
        this.receiverIdCardDigest = receiverIdCardDigest == null ? null : receiverIdCardDigest.trim();
    }

    public String getReceiverIdCardArea() {
        return receiverIdCardArea;
    }

    public void setReceiverIdCardArea(String receiverIdCardArea) {
        this.receiverIdCardArea = receiverIdCardArea == null ? null : receiverIdCardArea.trim();
    }

    public String getReceiverBankCardId() {
        return receiverBankCardId;
    }

    public void setReceiverBankCardId(String receiverBankCardId) {
        this.receiverBankCardId = receiverBankCardId == null ? null : receiverBankCardId.trim();
    }

    public String getReceiverBankCardIdDigest() {
        return receiverBankCardIdDigest;
    }

    public void setReceiverBankCardIdDigest(String receiverBankCardIdDigest) {
        this.receiverBankCardIdDigest = receiverBankCardIdDigest == null ? null : receiverBankCardIdDigest.trim();
    }

    public String getReceiverBankCardArea() {
        return receiverBankCardArea;
    }

    public void setReceiverBankCardArea(String receiverBankCardArea) {
        this.receiverBankCardArea = receiverBankCardArea == null ? null : receiverBankCardArea.trim();
    }

    public String getReceiverBankName() {
        return receiverBankName;
    }

    public void setReceiverBankName(String receiverBankName) {
        this.receiverBankName = receiverBankName == null ? null : receiverBankName.trim();
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

    public String getReceiverBankNameBs() {
        return receiverBankNameBs;
    }

    public void setReceiverBankNameBs(String receiverBankNameBs) {
        this.receiverBankNameBs = receiverBankNameBs == null ? null : receiverBankNameBs.trim();
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    public String getReceiverPhoneDigest() {
        return receiverPhoneDigest;
    }

    public void setReceiverPhoneDigest(String receiverPhoneDigest) {
        this.receiverPhoneDigest = receiverPhoneDigest == null ? null : receiverPhoneDigest.trim();
    }

    public String getReceiverPhoneArea() {
        return receiverPhoneArea;
    }

    public void setReceiverPhoneArea(String receiverPhoneArea) {
        this.receiverPhoneArea = receiverPhoneArea == null ? null : receiverPhoneArea.trim();
    }

    public String getReceiverPhoneRisk() {
        return receiverPhoneRisk;
    }

    public void setReceiverPhoneRisk(String receiverPhoneRisk) {
        this.receiverPhoneRisk = receiverPhoneRisk == null ? null : receiverPhoneRisk.trim();
    }

    public String getReceiverPhoneAlt() {
        return receiverPhoneAlt;
    }

    public void setReceiverPhoneAlt(String receiverPhoneAlt) {
        this.receiverPhoneAlt = receiverPhoneAlt == null ? null : receiverPhoneAlt.trim();
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

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getExchangeReason() {
        return exchangeReason;
    }

    public void setExchangeReason(String exchangeReason) {
        this.exchangeReason = exchangeReason == null ? null : exchangeReason.trim();
    }

    public String getTradePlatform() {
        return tradePlatform;
    }

    public void setTradePlatform(String tradePlatform) {
        this.tradePlatform = tradePlatform == null ? null : tradePlatform.trim();
    }

    public String getTradeParam() {
        return tradeParam;
    }

    public void setTradeParam(String tradeParam) {
        this.tradeParam = tradeParam == null ? null : tradeParam.trim();
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany == null ? null : logisticsCompany.trim();
    }

    public String getLogisticsNo() {
        return logisticsNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo == null ? null : logisticsNo.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
