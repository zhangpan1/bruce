package com.zhang.bruce.risk.xml.utils;



import java.util.Arrays;

/**
 * 报表生成类型枚举
 *
 * @author lijunhao
 * @date 2021/12/17 11:04 上午
 */
public enum AntiPackageOpTypeEnum implements SpringConvertibleEnum {

    /**
     * 创建
     */
    CREATE(1, "N", "创建"),
    /**
     * 修改
     */
    MODIFY(2, "C", "修改"),
    /**
     * 删除，目前只有大额有
     */
    DELETE(3, "D", "删除");

    private final int type;

    private final String code;

    private final String desc;

    AntiPackageOpTypeEnum(int type, String code, String desc) {
        this.type = type;
        this.code = code;
        this.desc = desc;
    }

    public static AntiPackageOpTypeEnum of(Integer optype) {
        if (optype == null) {
            return null;
        }
        return Arrays.stream(AntiPackageOpTypeEnum.values()).filter(antiPackageOpTypeEnum -> antiPackageOpTypeEnum.type == optype).findFirst().orElse(null);
    }


    @Override
    public int getValue() {
        return this.type;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    public String getCode() {
        return code;
    }
}
