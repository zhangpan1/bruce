package com.zhang.bruce.xmlReport.test;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/1/11 16:05
 * @Description:
 */
public class TestAotimic {
    public static void main(String[] args) {
        // 计数器
        AtomicLong counter = new AtomicLong();
        for (int i = 0; i < 5 ;i ++) {
            counter.incrementAndGet();
            System.out.println(counter);
        }
    }
}
