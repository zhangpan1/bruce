package com.zhang.bruce.java8.mituan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/27 8:28 下午
 */
public class YpfDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 查询父商户核查单总条数
        CompletableFuture<Object> countFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("得到总数量");
            return 0;
        });
        Map<String, CompletableFuture> futureMap = new HashMap<>();
        // 查询当前页的父商户核查单集合
        CompletableFuture<Object> pageFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("查询当前页的父商户核查单集合");
            return "new ArrayList<ParentMerchantCheckListBean>()";
        });
        futureMap.put("queryParentMerchantCheckListByPage", pageFuture);

        // 查询父商户角色集合
        CompletableFuture<Object> roleFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("查询父商户角色集合");
            return "new HashMap<String, String>()";
        });

        futureMap.put("CUSTOMER_ROLE", roleFuture);

        // 查询父商户处理结果集合
        CompletableFuture<Object> dealFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("查询父商户角色集合");
            return "查询父商户角色集合";
        });

        futureMap.put("PAR_DEAL_RESULT", dealFuture);

        // 查询父商户核查单状态集合
        CompletableFuture<Object> checkFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("查询父商户核查单状态集合");
            return "查询父商户核查单状态集合";
        });

        futureMap.put("PAR_CHECK_STATUS", checkFuture);

        // 查询风险等级配置
        CompletableFuture<Object> risklevconFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("查询风险等级配置");
            return "查询风险等级配置";
        });

        futureMap.put("RISKLEVCON", risklevconFuture);


        // 查询当前页的父商户核查单集合
        CompletableFuture<Object> pageFuture1 = futureMap.get("queryParentMerchantCheckListByPage");

        // 查询父商户角色集合
        CompletableFuture<Object> roleFuture1 = futureMap.get("CUSTOMER_ROLE");

        // 查询父商户核查单处理结果集合
        CompletableFuture<Object> dealFuture1 = futureMap.get("PAR_DEAL_RESULT");

        // 查询父商户核查单状态集合
        CompletableFuture<Object> checkFutur1 = futureMap.get("PAR_CHECK_STATUS");

        // 查询风险等级配置集合
        CompletableFuture<Object> risklevconFutur1 = futureMap.get("RISKLEVCON");

        CompletableFuture.allOf(countFuture, pageFuture1, roleFuture1, dealFuture1, checkFutur1, risklevconFutur1).join();

        String result1 = (String) roleFuture1.get();
        String result2 = (String) roleFuture1.get();
        String result3 = (String) roleFuture1.get();
        String result4 = (String) roleFuture1.get();

        System.out.println("处理后得到的最终结果，"+ result1 + result2 + result3 + result4);


    }
}
