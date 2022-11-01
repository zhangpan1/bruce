package com.zhang.bruce.chain;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/13 6:36 下午
 */
public class Task2 implements Task{
    private Task task;

    public Task2() {}

    public Task2(Task task){
        this.task = task;
    }
    @Override
    public void run() {
        System.out.println("task2 is run");
        if(task != null){
            task.run();
        }
    }
}
