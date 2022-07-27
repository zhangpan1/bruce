package com.zhang.bruce.java8.mituan;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/27 8:21 下午
 */
public class YilaiFutrue {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(()->{
            System.out.println("执行 step 1");
            return "step1  result";
        });

        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(()->{
            System.out.println("执行 step 2");
            return "step2  result";
        });

        CompletableFuture<String> cf3 = cf1.thenApply(result1 -> {
            //result1为CF1的结果
            //......
            System.out.println("执行 step 3");
            return "result3";
        });
        CompletableFuture<String> cf5 = cf2.thenApply(result2 -> {
            //result2为CF2的结果
            //......
            System.out.println("执行 step 5");
            return "result5";
        });

        CompletableFuture<String> cf4 = cf1.thenCombine(cf2, (result1, result2) -> {
            //result1和result2分别为cf1和cf2的结果
            return "result4";
        });
        CompletableFuture<Void> cf6 = CompletableFuture.allOf(cf3, cf4, cf5);
//        CompletableFuture.allOf(cf3, cf4, cf5).join();
//        String result3 = cf3.get();
//        String result4 = cf4.get();
//        String result5 = cf5.get();
//
//        System.out.println(result3+"--"+result5+"ssf"+result4);

        CompletableFuture<String> result = cf6.thenApply(v -> {
            //这里的join并不会阻塞，因为传给thenApply的函数是在CF3、CF4、CF5全部完成时，才会执行 。
            String result3 = cf3.join();
            String result4 = cf4.join();
            String result5 = cf5.join();
            //根据result3、result4、result5组装最终result;
            System.out.println(result3+result5+result4);
            return "result";
        });

    }
}
