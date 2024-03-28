package com.zhang.bruce.risktest.business;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/3/12 5:56 下午
 */
public class RocketmqMsg {
    public static void main(String[] args) {
        Map<String,Object> mqMsg = Maps.newHashMap();
        mqMsg.put("batchId","Bat2024031203");
        // 立即处理标识
        mqMsg.put("handType","1");
        System.out.println(JSON.toJSONString(mqMsg));
     }
}
