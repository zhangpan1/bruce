package com.zhang.bruce.java8.thread;

import com.beust.jcommander.internal.Lists;

import java.util.List;
import java.util.concurrent.*;

/**
 * @description: countDownLatch 和 completablefutrue区别
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/26 11:43 上午
 */
public class TestDemo {
    /**
     * 线程池
     */
    private static final ExecutorService QUERY_POOL = new ThreadPoolExecutor(
            10, 10,
            60, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(10000),
            new ThreadPoolExecutor.DiscardPolicy());

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            List<Long> resultList = Lists.newArrayList();
            CountDownLatch countDownLatch = new CountDownLatch(4);
            for (int i = 0; i < 4; i++) {
                QUERY_POOL.execute(() -> {
                    try {
                        resultList.addAll(doHandler());
                    } finally {
                        countDownLatch.countDown();
                    }
                });

            }
            countDownLatch.await();
            System.out.println("结果：" + resultList + "耗时：" + (System.currentTimeMillis() - start));
        } catch (Exception e) {
            System.out.println("发生异常");
        }

    }

    public static List<Long> doHandler() {
        try {
            Thread.sleep(2500);
            return Lists.newArrayList(123L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
