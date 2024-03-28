package com.zhang.bruce.service;

import com.yeepay.riskcontrol.facade.util.DateUtil;
import com.yeepay.riskcontrol.facade.util.ReqifPropFilterChar;

import java.util.Date;

/**
 * 异步请求基类
 *
 * @author wenbin.song
 *
 */
public abstract class RcAsyncReqDto implements java.io.Serializable {
	private static final long serialVersionUID = -8595962363531536293L;
	protected String productId="";// 产品ID 必传
	protected String merchantNo="";// 商编 必传
	protected String sequenceId="";// 请求序列号 必传
	protected String requestId="";// 交易请求号 必传
	protected Date occurTime;// 发生时间 必传
	protected String rmSequence="";// 统一接口流水号
	private String eventType="";// 事件类型 必传
	private String moduleId="";// 模块ID 必传
	private String amount="";// 下单金额 保留两位小数 必传
	private String production="";// 生产方：一键、epos 必传

	private String tradeResult="";// 支付结果： 1成功 0失败
	private Date completeTime;// 支付完成时间
	private String retCode="";// 支付应答码
	private String synConsumeTime="";// 调用同步接口耗时
	private String synErrorCode="";// 风控同步返回错误码

	public RcAsyncReqDto() {
		super();
	}

	public String getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(String sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public Date getOccurTime() {
		return occurTime;
	}

	public void setOccurTime(Date occurTime) {
		this.occurTime = occurTime;
	}

	public String getRmSequence() {
		return rmSequence;
	}

	public void setRmSequence(String rmSequence) {
		this.rmSequence = rmSequence;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTradeResult() {
		return tradeResult;
	}

	public void setTradeResult(String tradeResult) {
		this.tradeResult = tradeResult;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public Date getCompleteTime() {
		return completeTime;
	}

	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}

	public String getRetCode() {
		return retCode;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	public String getSynConsumeTime() {
		return synConsumeTime;
	}

	public void setSynConsumeTime(String synConsumeTime) {
		this.synConsumeTime = synConsumeTime;
	}

	public String getSynErrorCode() {
		return synErrorCode;
	}

	public void setSynErrorCode(String synErrorCode) {
		this.synErrorCode = synErrorCode;
	}

	@Override
	public String toString() {
		return  "productId=" + ReqifPropFilterChar.replaceSpecialChar(productId)
				+",production="+ ReqifPropFilterChar.replaceSpecialChar(production)
				+ ",merchantNo=" + (merchantNo !=null ? ReqifPropFilterChar.replaceSpecialChar(merchantNo) : "")
				+ ",requestId=" + ReqifPropFilterChar.replaceSpecialChar(requestId)
				+ ",sequenceId=" + (sequenceId!= null ? ReqifPropFilterChar.replaceSpecialChar(sequenceId) : "")
				+ ",amount="+amount
				+ ",occurTime=" + (occurTime!=null ? DateUtil.fromDateToString(occurTime, "yyyy-MM-dd HH:mm:ss") : DateUtil.getCurrentdateStringByPattern("yyyy-MM-dd HH:mm:ss"))
				+ ",completeTime=" + (completeTime!=null ? DateUtil.fromDateToString(completeTime, "yyyy-MM-dd HH:mm:ss") : DateUtil.getCurrentdateStringByPattern("yyyy-MM-dd HH:mm:ss"))
				+ ",tradeResult=" + ReqifPropFilterChar.replaceSpecialChar(tradeResult)
				+ ",synConsumeTime="+ReqifPropFilterChar.replaceSpecialChar(synConsumeTime)
				+ ",synErrorCode="+ReqifPropFilterChar.replaceSpecialChar(synErrorCode)
				+ ",rmSequence="+(rmSequence != null ? ReqifPropFilterChar.replaceSpecialChar(rmSequence) : "") ;
	}

}
