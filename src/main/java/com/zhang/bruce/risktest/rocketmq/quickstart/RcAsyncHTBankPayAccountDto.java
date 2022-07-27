package com.zhang.bruce.risktest.rocketmq.quickstart;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @description: 华通银行支付账户信息同步
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/4 4:57 下午
 */
public class RcAsyncHTBankPayAccountDto implements Serializable {
    private static final long serialVersionUID = 7024665478299676074L;
    /**
     * 收单商户编号
     */
    private String merchantNo;
    /**
     * 实际收款商户签约名
     */
    private String realMerchantName;
    /**
     * 商户请求号
     */
    private String requestId;
    /**
     * 前端渠道名称
     */
    private String channelName;
    /**
     * 前端渠道交易订单号
     */
    private String channelOrderId;
    /**
     * 订单金额
     */
    private BigDecimal amount;
    /**
     * 实付金额
     */
    private BigDecimal paymentAmount;
    /**
     * 交易发起时间
     */
    private Date occurTime;
    /**
     * 交易完成时间
     */
    private Date completeTime;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 付款用户ID
     */
    private String memberId;
    /**
     * 支付方式
     */
    private String payWay;
    /**
     * 付款银行卡号
     */
    private String bankCardNo;
    /**
     * 卡类型
     */
    private String bankCardType;
    /**
     * 用户交易IP
     */
    private String userIp;
    /**
     * 交易类型
     */
    private String tradeType;


    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getRealMerchantName() {
        return realMerchantName;
    }

    public void setRealMerchantName(String realMerchantName) {
        this.realMerchantName = realMerchantName;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelOrderId() {
        return channelOrderId;
    }

    public void setChannelOrderId(String channelOrderId) {
        this.channelOrderId = channelOrderId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
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

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getBankCardType() {
        return bankCardType;
    }

    public void setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
}
