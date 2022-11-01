package com.zhang.bruce.chain;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/13 6:38 下午
 */
public class LiabilityChain {
    public void runChain(){
        Task task3 = new Task3();
        Task task2 = new Task2(task3);
        Task task1 = new Task1(task2);
        task1.run();
    }
}
