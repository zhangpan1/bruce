package com.zhang.bruce.util;


/**
 * 交易白名单枚举
 * */
public enum WhiteNameRuleEnum {

	MEC_NO("frms_mch_id", "商户号"),
	BANK_CARD_NO("frms_bank_card_no", "银行卡号"),
	PHONE_NO("frms_phone_no","手机号"),
	ID_NO("frms_id_no","身份证号"),
	IP_ADDR("frms_ip_addr","IP地址"),
	IP("frms_ip","IP");

	private String code;
	private String desc;

	private WhiteNameRuleEnum(String code, String desc) {
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

	public static WhiteNameRuleEnum codeOf(String code) {
		for (WhiteNameRuleEnum enumObj : values()) {
			if (enumObj.getCode().equals(code)){
				return enumObj;
			}
		}
		return null;
	}
	public static String getDescByCode(String code){
		String returnStr = code;
		for(WhiteNameRuleEnum dealType : WhiteNameRuleEnum.values()) {
			if (dealType.getCode().equals(code)) {
				returnStr = dealType.getDesc();
			}
		}
		return returnStr;
	}
}
