package com.zhang.bruce.java8.mituan;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/27 8:14 下午
 * step 3 依赖 step1 与 step2 的结果
 */
public class CompleteFutureDemo1 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(()->{
            System.out.println("执行 step 1");
            return "step1  result";
        },executor);

        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(()->{
            System.out.println("执行 step 2");
            return "step2  result";
        },executor);

        cf1.thenCombine(cf2, (result1, result2) -> {
            System.out.println(result1 + " , " + result2);
            System.out.println("执行step 3");
            return "step3 result";
        }).thenAccept(result3 -> System.out.println(result3));
    }
}
