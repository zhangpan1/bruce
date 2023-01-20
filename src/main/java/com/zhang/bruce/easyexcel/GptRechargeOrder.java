package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 充值交易订单表
 *
 * @author wcyong
 *
 * @date 2023-01-18
 */
public class GptRechargeOrder {
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
     * 交易流水号
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
     * 商户签约名
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
     * 充值类型
     */
    private String rechargeType;

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
     * 付款方类型:0:个人 1:企业
     */
    private String payerType;

    /**
     * 付款方姓名
     */
    private String payerName;

    /**
     * 付款方姓名摘要
     */
    private String payerNameDigest;

    /**
     * 付款方银行账号
     */
    private String payerBankCardId;

    /**
     * 付款方银行账号摘要
     */
    private String payerBankCardIdDigest;

    /**
     * 付款方银行名称
     */
    private String payerBankName;

    /**
     * 付款方银行账号归属地
     */
    private String payerBankCardArea;

    /**
     * 付款方银行卡卡品牌
     */
    private String payerBankCardNameBs;

    /**
     * 付款方银行卡类型
     */
    private String payerBankCardTypeBs;

    /**
     * 付款方银行名称
     */
    private String payerBankNameBs;

    /**
     * 付款银行识别码
     */
    private String payerBankCode;

    /**
     * 付款方银行识别码类型:1:Swift Code 2:BIC Code 3:Bank Code
     */
    private String payerBankCodeType;

    /**
     * 付款方国家/地区数字代码
     */
    private String payerCountryCode;

    /**
     * 付款方国家/地区英文简称
     */
    private String payerCountryNameEn;

    /**
     * 付款方国家/地区中文简称
     */
    private String payerCountryNameZh;

    /**
     * 付款方国家双字符代码
     */
    private String payerCountryAlph2Code;

    /**
     * 付款方国家三字符代码
     */
    private String payerCountryAlph3Code;

    /**
     * 收款方银行编码
     */
    private String receiverBankCode;

    /**
     * 收款方银行账号
     */
    private String receiverBankCardId;

    /**
     * 收款方银行账号归属地
     */
    private String receiverBankCardArea;

    /**
     * 收款方银行名称
     */
    private String receiverBankNameBs;

    /**
     * 收款方银行卡卡品牌
     */
    private String receiverBankCardNameBs;

    /**
     * 收款方银行卡卡类型
     */
    private String receiverBankCardTypeBs;

    /**
     * 实际交易币种
     */
    private String currency;

    /**
     * 原币种交易金额
     */
    private BigDecimal amount;

    /**
     * 对应人民币金额
     */
    private BigDecimal cnyAmount;

    /**
     * 到账币种
     */
    private String targetCurrency;

    /**
     * 到账金额
     */
    private BigDecimal targetAmount;

    /**
     * 到账人民币金额
     */
    private BigDecimal targetCnyAmount;

    /**
     * 异步通知地址
     */
    private String notifyUrl;

    /**
     * 交易附言
     */
    private String remark;

    /**
     * 交易时间
     */
    private Date occurTime;

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
     * 支付结果 1:成功 0:失败 2:处理中
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
