package com.zhang.bruce.springchain.business;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/31 5:01 下午
 */
public class DoDaaa {
    private static int MAX_TRADE_RECORD_NUM = 5;
    public static void main(String[] args) {


        // 计数器
        AtomicLong counter = new AtomicLong();
        AtomicLong rele = new AtomicLong();
        for (int i = 0 ; i < 15; i ++ ) {
            // 记录交易总数
            if (counter.incrementAndGet() >= MAX_TRADE_RECORD_NUM + 1) {
                break;
                // throw new RuntimeException("达到最大导出记录，max=" + MAX_TRADE_RECORD_NUM + ", curr:" + tradeCount.get());
            }
            System.out.println(rele.incrementAndGet() + "");
        }


        // 计数器

    }
}
