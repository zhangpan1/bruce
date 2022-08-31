package com.zhang.bruce.java8.mituan;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/8/3 7:37 下午
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("执行 step 1");
            return "step1  result";
        });

        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(()->{

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("执行 step 2");
            return "step2  result";
        });
        CompletableFuture<String> cf3 = cf1.thenApply(result1 -> {
            //result1为CF1的结果
            //......
            System.out.println("执行 step 3");
            return "result3";
        });

        CompletableFuture.allOf(cf1, cf2, cf3).join();
        String result1 = cf1.get();
        String result2 = cf2.get();
        String result3 = cf3.get();

        System.out.println("最终结果为"+result1+"----"+result2+"---"+result3);
    }
}
