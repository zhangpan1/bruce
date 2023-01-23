package com.zhang.bruce.strategy.day01;

/**
 * 涉罪类型枚举
 */
public enum CrimeTypeEnum {

    CHUAN("chuan", "涉嫌传销"),
    FEI("fei", "非法集资"),
    DU("du", "赌博"),
    DIAN("dian", "电信诈骗"),
    WEI("wei", "未定性但交易行为异常"),
    QI("qi", "其他");

    private String code;
    private String name;

    CrimeTypeEnum(final String code, final String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getNameByCode(String code) {
        String returnStr = code;
        for (CrimeTypeEnum dealType : CrimeTypeEnum.values()) {
            if (dealType.getCode().equals(code)) {
                returnStr = dealType.getName();
            }
        }
        return returnStr;
    }

    public static String getCodeByName(String name) {
        String returnStr = name;
        for (CrimeTypeEnum dealType : CrimeTypeEnum.values()) {
            if (dealType.getName().equals(name)) {
                returnStr = dealType.getCode();
            }
        }
        return returnStr;
    }

    public static void main(String[] args) {
//    	String textByCode = getNameByCode("STOP_RECEIPT");
        String textByCode = getCodeByName("电信诈骗");
    	/*String s = "止收、止付止结算";
        String s1 = s.replaceAll("、", ",");*/

        System.out.println(textByCode);
      /*  if (StringUtils.isNotEmpty(dealType)){
            String[] dealTypeArray = dealType.split("、");
            for (int i = 0; i < dealTypeArray.length; i++) {
                dealTypeArray[i] = "解除" + dealTypeArray[i];
            }
            String s = StringUtils.join(dealTypeArray, "、");
            System.out.println(s);
        }*/

      /*  for (int i = 0; i < riskDealA.length; i++) {
            if ("商户信息加黑".equals(riskDealA[i])){
                riskDealA[i] = "加入黑名单";
            }
        }

        System.out.println(Constants.externalReasonMap.get("JUDICIAL_INVESTIGATION"));*/



    }
}
