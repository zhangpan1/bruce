package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 申报明细订单详情表
 *
 * @author wcyong
 *
 * @date 2023-01-18
 */
public class GptDeclareOrderDetail {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 主订单号
     */
    private String orderId;

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
     * 申报明细订单号
     */
    private String requestId;

    /**
     * 申报订单号
     */
    private String declareidId;

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
     * 卖家网址
     */
    private String sellerWebsite;

    /**
     * 卖家网址域名
     */
    private String sellerWebsiteDomain;

    /**
     * 合同编号
     */
    private String contractNo;

    /**
     * 付款方证件号码
     */
    private String payerIdCard;

    /**
     * 付款方证件号码摘要
     */
    private String payerIdCardDigest;

    /**
     * 付款方证件号码归属地
     */
    private String payerIdCardArea;

    /**
     * 付款方名称
     */
    private String payerName;

    /**
     * 付款方名称摘要
     */
    private String payerNameDigest;

    /**
     * 付款方账户类型 0:对私  1:对公
     */
    private String payerType;

    /**
     * 付款方银行卡号
     */
    private String payerBankCardId;

    /**
     * 付款方银行卡号摘要
     */
    private String payerBankCardIdDigest;

    /**
     * 付款方银行卡号归属地
     */
    private String payerBankCardArea;

    /**
     * 付款方银行名称
     */
    private String payerBankNameBs;

    /**
     * 付款方银行卡卡品牌
     */
    private String payerBankCardNameBs;

    /**
     * 付款方银行卡类型
     */
    private String payerBankCardTypeBs;

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
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品类型
     */
    private String goodsType;

    /**
     * 商品数量
     */
    private Integer goodsQuantity;

    /**
     * 汇款目的
     */
    private String exchangeReason;

    /**
     * 结汇发起时间
     */
    private Date occurTime;

    /**
     * 物流公司
     */
    private String logisticsCompany;

    /**
     * 物流单号
     */
    private String logisticsNo;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

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
     * 申报状态 1:成功 0:失败
     */
    private String declareStatus;

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
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

    public String getDeclareidId() {
        return declareidId;
    }

    public void setDeclareidId(String declareidId) {
        this.declareidId = declareidId == null ? null : declareidId.trim();
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

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
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

    public String getPayerBankCardArea() {
        return payerBankCardArea;
    }

    public void setPayerBankCardArea(String payerBankCardArea) {
        this.payerBankCardArea = payerBankCardArea == null ? null : payerBankCardArea.trim();
    }

    public String getPayerBankNameBs() {
        return payerBankNameBs;
    }

    public void setPayerBankNameBs(String payerBankNameBs) {
        this.payerBankNameBs = payerBankNameBs == null ? null : payerBankNameBs.trim();
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

    public String getExchangeReason() {
        return exchangeReason;
    }

    public void setExchangeReason(String exchangeReason) {
        this.exchangeReason = exchangeReason == null ? null : exchangeReason.trim();
    }

    public Date getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Date occurTime) {
        this.occurTime = occurTime;
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

    public String getDeclareStatus() {
        return declareStatus;
    }

    public void setDeclareStatus(String declareStatus) {
        this.declareStatus = declareStatus == null ? null : declareStatus.trim();
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
