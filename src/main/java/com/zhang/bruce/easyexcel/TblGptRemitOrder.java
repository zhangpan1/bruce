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
public class TblGptRemitOrder {
    private Long id;

    private String productCode;

    private String businessCode;

    private String sequenceId;

    private String allotType;

    private String dataSource;

    private String requestId;

    private String merchantNo;

    private String signName;

    private String signNameEn;

    private String merchantKyc;

    private String merchantKycSub;

    private String memberId;

    private String ipAddress;

    private String ipArea;

    private String ipProxy;

    private String supplierName;

    private String supplierNameDigest;

    private String declareId;

    private String tradeType;

    private String accountName;

    private String tradeMode;

    private String isSettlement;

    private String tradeMomo;

    private String sellerName;

    private String sellerIdCard;

    private String sellerIdCardArea;

    private String platformMemberId;

    private String receiverType;

    private String receiverIdType;

    private String receiverIdCard;

    private String receiverIdCardDigest;

    private String receiverIdCardArea;

    private String receiverName;

    private String receiverNameDigest;

    private String receiverBankName;

    private String receiverBankCardId;

    private String receiverBankCardIdDigest;

    private String receiverBankCardArea;

    private String receiverBankCardNameBs;

    private String receiverBankNameBs;

    private String receiverBankCardTypeBs;

    private String receiverBankBranch;

    private String receiverCountryCode;

    private String receiverCountryNameEn;

    private String receiverCountryNameZh;

    private String receiverCountryAlph2Code;

    private String receiverCountryAlph3Code;

    private String receiverAddress;

    private String currency;

    private BigDecimal amount;

    private BigDecimal cnyAmount;

    private String notifyUrl;

    private String remark;

    private Date occurTime;

    private Date completeTime;

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

    public String getAllotType() {
        return allotType;
    }

    public void setAllotType(String allotType) {
        this.allotType = allotType == null ? null : allotType.trim();
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
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

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
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

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getSupplierNameDigest() {
        return supplierNameDigest;
    }

    public void setSupplierNameDigest(String supplierNameDigest) {
        this.supplierNameDigest = supplierNameDigest == null ? null : supplierNameDigest.trim();
    }

    public String getDeclareId() {
        return declareId;
    }

    public void setDeclareId(String declareId) {
        this.declareId = declareId == null ? null : declareId.trim();
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getTradeMode() {
        return tradeMode;
    }

    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode == null ? null : tradeMode.trim();
    }

    public String getIsSettlement() {
        return isSettlement;
    }

    public void setIsSettlement(String isSettlement) {
        this.isSettlement = isSettlement == null ? null : isSettlement.trim();
    }

    public String getTradeMomo() {
        return tradeMomo;
    }

    public void setTradeMomo(String tradeMomo) {
        this.tradeMomo = tradeMomo == null ? null : tradeMomo.trim();
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public String getSellerIdCard() {
        return sellerIdCard;
    }

    public void setSellerIdCard(String sellerIdCard) {
        this.sellerIdCard = sellerIdCard == null ? null : sellerIdCard.trim();
    }

    public String getSellerIdCardArea() {
        return sellerIdCardArea;
    }

    public void setSellerIdCardArea(String sellerIdCardArea) {
        this.sellerIdCardArea = sellerIdCardArea == null ? null : sellerIdCardArea.trim();
    }

    public String getPlatformMemberId() {
        return platformMemberId;
    }

    public void setPlatformMemberId(String platformMemberId) {
        this.platformMemberId = platformMemberId == null ? null : platformMemberId.trim();
    }

    public String getReceiverType() {
        return receiverType;
    }

    public void setReceiverType(String receiverType) {
        this.receiverType = receiverType == null ? null : receiverType.trim();
    }

    public String getReceiverIdType() {
        return receiverIdType;
    }

    public void setReceiverIdType(String receiverIdType) {
        this.receiverIdType = receiverIdType == null ? null : receiverIdType.trim();
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

    public String getReceiverBankName() {
        return receiverBankName;
    }

    public void setReceiverBankName(String receiverBankName) {
        this.receiverBankName = receiverBankName == null ? null : receiverBankName.trim();
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

    public String getReceiverBankCardNameBs() {
        return receiverBankCardNameBs;
    }

    public void setReceiverBankCardNameBs(String receiverBankCardNameBs) {
        this.receiverBankCardNameBs = receiverBankCardNameBs == null ? null : receiverBankCardNameBs.trim();
    }

    public String getReceiverBankNameBs() {
        return receiverBankNameBs;
    }

    public void setReceiverBankNameBs(String receiverBankNameBs) {
        this.receiverBankNameBs = receiverBankNameBs == null ? null : receiverBankNameBs.trim();
    }

    public String getReceiverBankCardTypeBs() {
        return receiverBankCardTypeBs;
    }

    public void setReceiverBankCardTypeBs(String receiverBankCardTypeBs) {
        this.receiverBankCardTypeBs = receiverBankCardTypeBs == null ? null : receiverBankCardTypeBs.trim();
    }

    public String getReceiverBankBranch() {
        return receiverBankBranch;
    }

    public void setReceiverBankBranch(String receiverBankBranch) {
        this.receiverBankBranch = receiverBankBranch == null ? null : receiverBankBranch.trim();
    }

    public String getReceiverCountryCode() {
        return receiverCountryCode;
    }

    public void setReceiverCountryCode(String receiverCountryCode) {
        this.receiverCountryCode = receiverCountryCode == null ? null : receiverCountryCode.trim();
    }

    public String getReceiverCountryNameEn() {
        return receiverCountryNameEn;
    }

    public void setReceiverCountryNameEn(String receiverCountryNameEn) {
        this.receiverCountryNameEn = receiverCountryNameEn == null ? null : receiverCountryNameEn.trim();
    }

    public String getReceiverCountryNameZh() {
        return receiverCountryNameZh;
    }

    public void setReceiverCountryNameZh(String receiverCountryNameZh) {
        this.receiverCountryNameZh = receiverCountryNameZh == null ? null : receiverCountryNameZh.trim();
    }

    public String getReceiverCountryAlph2Code() {
        return receiverCountryAlph2Code;
    }

    public void setReceiverCountryAlph2Code(String receiverCountryAlph2Code) {
        this.receiverCountryAlph2Code = receiverCountryAlph2Code == null ? null : receiverCountryAlph2Code.trim();
    }

    public String getReceiverCountryAlph3Code() {
        return receiverCountryAlph3Code;
    }

    public void setReceiverCountryAlph3Code(String receiverCountryAlph3Code) {
        this.receiverCountryAlph3Code = receiverCountryAlph3Code == null ? null : receiverCountryAlph3Code.trim();
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
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
