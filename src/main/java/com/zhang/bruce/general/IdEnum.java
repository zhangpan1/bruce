package com.zhang.bruce.general;

public enum IdEnum {


    
    SHENGYUOMS_ORDERID("SU", "", "SYOMS正向订单号"),
    SHENGYUOMS_REFUNDID("BD", "", "SYOMS退货请求号"),
    SHENGYUOMS_RETORDERID("", "3", "SYOMS逆向订单号"),

    SHENGYUCMMDTY_TOPSEARCHSORTID("05", "1", "热搜词编号");

    private String moduleNo;
    private String attribute;
    private String desc;

    IdEnum(String moduleNo, String attribute, String desc) {
        this.moduleNo = moduleNo;
        this.attribute = attribute;
        this.desc = desc;
    }

    public String getModuleNo() {
        return moduleNo;
    }

    public String getAttribute() {
        return attribute;
    }

    public String getDesc() {
        return desc;
    }
}
