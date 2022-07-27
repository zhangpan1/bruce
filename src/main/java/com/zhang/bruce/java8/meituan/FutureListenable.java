package com.zhang.bruce.java8.meituan;

import com.google.common.util.concurrent.*;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description: 回调地狱--使用future进行异步计算
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/5 3:34 下午
 */
public class FutureListenable {
    /**
     * future 用于异步计算的记过，使用阻塞和轮训的方式获取结果，不支持设计回调方法
     * @param args
     * 三个操作，step1/step2/step3存在依赖关系，step3依赖step1和step2
     */
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        ListeningExecutorService guavaExecutor = MoreExecutors.listeningDecorator(executor);
        ListenableFuture<String> future1 = guavaExecutor.submit(() -> {
            //step 1
            System.out.println("执行step 1");
            return "step1 result";
        });
        ListenableFuture<String> future2 = guavaExecutor.submit(() -> {
            //step 2
            System.out.println("执行step 2");
            return "step2 result";
        });
        ListenableFuture<List<String>> future1And2 = Futures.allAsList(future1, future2);
        Futures.addCallback(future1And2, new FutureCallback<List<String>>() {
            @Override
            public void onSuccess(@Nullable List<String> result) {
                System.out.println(result);
                ListenableFuture<String> future3 = guavaExecutor.submit(() -> {
                    System.out.println("执行step 3");
                    return "step3 result";
                });
                Futures.addCallback(future3, new FutureCallback<String>() {
                    @Override
                    public void onSuccess(String result) {
                        System.out.println(result);
                    }
                    @Override
                    public void onFailure(Throwable t) {
                    }
                }, guavaExecutor);
            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        },guavaExecutor);

    }

}
