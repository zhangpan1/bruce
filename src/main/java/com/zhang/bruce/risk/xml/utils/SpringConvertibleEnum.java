package com.zhang.bruce.risk.xml.utils;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 支持spring转化的枚举
 *
 * @author lijunhao
 * @date 2022/1/10 2:39 下午
 */
public interface SpringConvertibleEnum {

    /**
     * 枚举值
     *
     * @return
     */
    @JsonValue
    int getValue();

    /**
     * 描述信息
     * @return
     */
    String getDesc();
}
