package com.zhang.bruce.risk.xml.utils;



import java.util.Arrays;

/**
 * 回执报文类型
 *
 * @author lijunhao
 * @date 2021/12/27 4:02 下午
 */
public enum ReceiptPacketEnum implements SpringConvertibleEnum {
    /**
     * 成功报文
     */
    SUCCESS(1, "SC", "正确回执"),
    /**
     * 补正
     */
    MODIFY(2, "RC", "警告回执"),
    /**
     * 警告报文
     */
    WARN(3, "AC", "警告回执"),
    /**
     * 错误报文
     */
    ERROR(4, "CF", "错误回执");

    /**
     * 编码
     */
    private final int code;
    /**
     * 标识
     */
    private final String flag;
    /**
     * 描述
     */
    private final String desc;

    ReceiptPacketEnum(int code, String flag, String desc) {
        this.code = code;
        this.flag = flag;
        this.desc = desc;
    }

    public static ReceiptPacketEnum of(Integer status) {
        if(status==null){
            return null;
        }
        return Arrays.stream(ReceiptPacketEnum.values()).filter(receiptPacketEnum -> receiptPacketEnum.code == status).findFirst().orElse(null);
    }

    @Override
    public int getValue() {
        return this.code;
    }

    public String getFlag() {
        return flag;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
