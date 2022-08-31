package com.zhang.bruce.risk.xml.utils;


import java.util.Arrays;

/**
 * @author lijunhao
 * @date 2021/12/17 1:15 下午
 */
public enum AntiPackageBizEnum implements SpringConvertibleEnum {

    /**
     * 大额监控
     */
    LARGE_AMOUNT(1, "PH", "FD", "anti.large_amount", "大额监控"),
    /**
     * 排除可疑监控
     */
    // SUSPICIOUS(2, "PS", "anti.suspicious", "可疑监控");
    EXCLUDE_SUSPICIOUS(2, "BD", "FD", "anti.exclude_suspicious", "排除可疑监控"),
    /**
     * 可疑监控
     */
    SUSPICIOUS(3, "PS", "FD", "anti.suspicious", "可疑监控");

    /**
     * 代码
     */
    private final int code;
    /**
     * 报告标识
     */
    private final String dataPackageFlag;

    /**
     * 回执标识
     */
    private final String receiptPackageFlag;

    /**
     * redis 序列前缀
     */
    private final String redisKeyPrefix;

    /**
     * 描述信息
     */
    private final String desc;

    public static AntiPackageBizEnum of(Integer bizType) {
        return Arrays.stream(AntiPackageBizEnum.values())
                .filter(bizEnum -> bizEnum.code == bizType)
                .findFirst()
                .orElse(null);
    }

    AntiPackageBizEnum(int code, String dataPackageFlag, String receiptPackageFlag, String redisKeyPrefix, String desc) {
        this.code = code;
        this.dataPackageFlag = dataPackageFlag;
        this.receiptPackageFlag = receiptPackageFlag;
        this.redisKeyPrefix = redisKeyPrefix;
        this.desc = desc;
    }

    public String getDataPackageFlag() {
        return dataPackageFlag;
    }

    public String getRedisKeyPrefix() {
        return redisKeyPrefix;
    }

    @Override
    public int getValue() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    public String getReceiptPackageFlag() {
        return receiptPackageFlag;
    }
}
