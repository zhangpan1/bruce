package com.zhang.bruce.base.bru1;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/1/30 4:35 下午
 */
public class Bru2 {
    public static void main(String[] args) throws InterruptedException {
        Map resultMap  = Maps.newHashMap();
        resultMap.put("trueCount", 1);
        resultMap.put("falseCount", 2);
        //resultMap.put("isTure", isTure);
        String isTrue = (String) resultMap.get("isTure");
        if (isTrue != null) {
            System.out.println(isTrue);

        } else {
            System.out.println("你说放松放松放松");
        }

    }
}
