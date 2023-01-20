package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 出款交易订单表
 *
 * @author wcyong
 *
 * @date 2023-01-19
 */
public class GptRemitOrder {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 产品编码 PAYMENT:供应商付款  REMIT:未知出款  WITHDRAW:提现
     */
    private String productCode;

    /**
     * 业务方编码
     */
    private String businessCode;

    /**
     * 交易流水号
     */
    private String sequenceId;

    /**
     * 是否急速出款 1:是、0:否
     */
    private String allotType;

    /**
     * 数据来源 1:API 、2:商户后台
     */
    private String dataSource;

    /**
     * 商户订单号
     */
    private String requestId;

    /**
     * 商户编号
     */
    private String merchantNo;

    /**
     * 商户签约名
     */
    private String signName;

    /**
     * 商户英文名
     */
    private String signNameEn;

    /**
     * 商户kyc
     */
    private String merchantKyc;

    /**
     * 商户kyc 二级
     */
    private String merchantKycSub;

    /**
     * 会员编号
     */
    private String memberId;

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
     * 供应商姓名
     */
    private String supplierName;

    /**
     * 供应商姓名摘要
     */
    private String supplierNameDigest;

    /**
     * 申报订单号
     */
    private String declareId;

    /**
     * 贸易类型 1:货物贸易（有物流单号）2:服务贸易（无物流单号等信息）
     */
    private String tradeType;

    /**
     * 账户名称
     */
    private String accountName;

    /**
     * 交易模式 B2B 、B2C
     */
    private String tradeMode;

    /**
     * 是否结汇 Y:是 N:否
     */
    private String isSettlement;

    /**
     * 交易附言
     */
    private String tradeMomo;

    /**
     * 卖家名称
     */
    private String sellerName;

    /**
     * 卖家证件号
     */
    private String sellerIdCard;

    /**
     * 卖家证件号码归属地
     */
    private String sellerIdCardArea;

    /**
     * 平台用户信息
     */
    private String platformMemberId;

    /**
     * 收款人类型 0:个人 1:企业
     */
    private String receiverType;

    /**
     * 收款人证件类型
     */
    private String receiverIdType;

    /**
     * 收款人证件号码
     */
    private String receiverIdCard;

    /**
     * 收款人证件号码摘要
     */
    private String receiverIdCardDigest;

    /**
     * 收款人证件号码归属地
     */
    private String receiverIdCardArea;

    /**
     * 收款人姓名
     */
    private String receiverName;

    /**
     * 收款人姓名摘要
     */
    private String receiverNameDigest;

    /**
     * 收款方银行名称
     */
    private String receiverBankName;

    /**
     * 收款方银行账号
     */
    private String receiverBankCardId;

    /**
     * 收款方银行账号摘要
     */
    private String receiverBankCardIdDigest;

    /**
     * 收款方银行账号归属地
     */
    private String receiverBankCardArea;

    /**
     * 收款方银行卡卡品牌
     */
    private String receiverBankCardNameBs;

    /**
     * 收款方银行名称
     */
    private String receiverBankNameBs;

    /**
     * 收款方银行卡卡类型
     */
    private String receiverBankCardTypeBs;

    /**
     * 收款方支行
     */
    private String receiverBankBranch;

    /**
     * 收款方国家/地区数字代码
     */
    private String receiverCountryCode;

    /**
     * 收款方国家/地区英文简称
     */
    private String receiverCountryNameEn;

    /**
     * 收款方国家/地区中文简称
     */
    private String receiverCountryNameZh;

    /**
     * 收款方国家双字符代码
     */
    private String receiverCountryAlph2Code;

    /**
     * 收款方国家三字符代码
     */
    private String receiverCountryAlph3Code;

    /**
     * 收款人地址
     */
    private String receiverAddress;

    /**
     * 交易币种
     */
    private String currency;

    /**
     * 原币交易金额
     */
    private BigDecimal amount;

    /**
     * 人民币交易金额
     */
    private BigDecimal cnyAmount;

    /**
     * 异步通知地址
     */
    private String notifyUrl;

    /**
     * 交易附言
     */
    private String remark;

    /**
     * 申请时间
     */
    private Date occurTime;

    /**
     * 出款完成时间
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
     * 规则引擎返回的结果
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
