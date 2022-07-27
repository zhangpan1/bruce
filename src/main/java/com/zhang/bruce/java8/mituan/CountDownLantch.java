package com.zhang.bruce.java8.mituan;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.*;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/27 8:55 下午
 */
public class CountDownLantch {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        final CountDownLatch latch = new CountDownLatch(2);

        ExecutorService executorService = Executors.newCachedThreadPool();

        Callable<Integer> deleteSySpuBySpuCode = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int num;
                try {
                    num = 66;
                } finally {
                    latch.countDown();
                }
                return num;
            }
        };
        Callable<Integer> deleteSySpuDetailsBySpuCode = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int num;
                try {
                    num = 88;
                } finally {
                    latch.countDown();
                }
                return num;
            }
        };

        List<Callable<Integer>> list = Lists.newArrayList();
        list.add(deleteSySpuBySpuCode);
        list.add(deleteSySpuDetailsBySpuCode);

        List<Future<Integer>> futureList = executorService.invokeAll(list, 5000, TimeUnit.MILLISECONDS);
        latch.await();

        for (Future<Integer> future : futureList) {
            System.out.println(future.get());
            if (future.get() < 0) {
                System.out.println("s");
            }
        }
    }
}
