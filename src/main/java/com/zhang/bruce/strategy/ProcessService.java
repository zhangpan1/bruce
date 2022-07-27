package com.zhang.bruce.strategy;

import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/27 4:34 下午
 * 策略模式
 */
public interface ProcessService {
    void process(Map<String ,Object> reqMap);
}
