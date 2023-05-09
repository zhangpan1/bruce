package com.zhang.bruce.util;


/**
 * 交易黑名单风险种类枚举
 * */
public enum TradeBlackRiskTagEnum {

	cardTheft("cardTheft", "盗卡"),
	aml("aml", "反洗钱"),
	regulatory("regulatory","监管要求"),
	cashFraud("cashFraud","套现"),
	maliciousResuse("maliciousResuse","恶意拒付"),
	maliciousComplaint("maliciousComplaint","恶意投诉"),
	scientist_digitalCollect("scientist_digitalCollect","科学家-数藏"),
	maliciousResuse_digitalCollect("maliciousResuse_digitalCollect","恶意拒付-数藏"),
	digitalCollect("digitalCollect","数藏限制用户");

	private String code;
	private String desc;

	private TradeBlackRiskTagEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public static TradeBlackRiskTagEnum codeOf(String code) {
		for (TradeBlackRiskTagEnum enumObj : values()) {
			if (enumObj.getCode().equals(code)){
				return enumObj;
			}
		}
		return null;
	}
	public static String getDescByCode(String code){
		String returnStr = code;
		for(TradeBlackRiskTagEnum dealType : TradeBlackRiskTagEnum.values()) {
			if (dealType.getCode().equals(code)) {
				returnStr = dealType.getDesc();
			}
		}
		return returnStr;
	}
}
