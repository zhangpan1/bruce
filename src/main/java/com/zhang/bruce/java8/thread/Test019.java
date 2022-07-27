package com.zhang.bruce.java8.thread;

import com.beust.jcommander.internal.Lists;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @description: CompletableFutrue--
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/26 11:58 上午
 */
public class Test019 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            List<Long> resultList = Lists.newArrayList();
            List<CompletableFuture<List<Long>>> tmp = Lists.newArrayList();
            for (int i = 0; i < 4; i ++) {
                CompletableFuture<List<Long>> resultFuture = CompletableFuture.supplyAsync(()->{
                    return doHandler();
                });
                tmp.add(resultFuture);
            }

            for (CompletableFuture<List<Long>> tmp2 : tmp) {
                resultList.addAll(tmp2.get());
            }

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
