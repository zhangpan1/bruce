package com.zhang.bruce.rule.function;

import com.zhang.bruce.risk.xml.utils.SpringConvertibleEnum;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 大额交易报告状态枚举
 *
 * @author lijunhao
 * @date 2021/12/27 5:12 下午
 */
public enum LargeReportStatusEnum implements SpringConvertibleEnum {
    /**
     * 默认
     */
    DEFAULT(new Integer[]{}, -1, "默认"),
    /**
     * 待补录
     */
    WAIT_COMPLETE(new Integer[]{-1}, 1, "待补录"),
    /**
     * 待打包
     */
    WAIT_PACKAGE(new Integer[]{-1, 1, 4}, 2, "待打包"),
    /**
     * 已打包
     */
    PACKAGED(new Integer[]{8}, 3, "已打包"),
    /**
     * 打包中
     */
    PACKAGING(new Integer[]{2, 7}, 8, "打包中"),
    /**
     * 待修改
     */
    WAIT_MODIFY(new Integer[]{3}, 4, "待修改"),
    /**
     * 已完成
     */
    FINISH(new Integer[]{3}, 5, "已完成"),
    /**
     * 已撤销
     */
    CANCELED(new Integer[]{1, 2}, 6, "已撤销"),

    /**
     * 打包失败
     */
    PACKAGE_FAIL(new Integer[]{2}, 7, "打包失败");

    /**
     * 前置状态
     */
    private final Integer[] beforeStatues;

    /**
     * 编码
     */
    private final int code;
    /**
     * 描述信息
     */
    private final String desc;

    public static LargeReportStatusEnum of(Integer status) {
        if (status == null) {
            return null;
        }
        return Arrays.stream(LargeReportStatusEnum.values())
                .filter(largeReportStatusEnum -> largeReportStatusEnum.code == status)
                .findFirst().orElse(null);
    }

    /**
     * 获取下一状态
     *
     * @param statusEnum
     * @return
     */
    public static List<LargeReportStatusEnum> getNextStatus(LargeReportStatusEnum statusEnum) {
        return Arrays.stream(LargeReportStatusEnum.values())
                .filter(statusEnum1 -> ArrayUtils.contains(statusEnum1.beforeStatues, statusEnum.code))
                .filter(largeReportStatusEnum -> largeReportStatusEnum != CANCELED)
                .collect(Collectors.toList());
    }

    public LargeReportStatusEnum[] getBeforeStatues() {
        return Arrays.stream(beforeStatues).map(LargeReportStatusEnum::of)
                .filter(Objects::nonNull)
                .toArray(LargeReportStatusEnum[]::new);
    }


    @Override
    public String getDesc() {
        return desc;
    }

    LargeReportStatusEnum(Integer[] beforeStatues, int code, String desc) {
        this.beforeStatues = beforeStatues;
        this.code = code;
        this.desc = desc;
    }

    @Override
    public int getValue() {
        return this.code;
    }
}
