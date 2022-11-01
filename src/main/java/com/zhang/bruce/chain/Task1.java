package com.zhang.bruce.chain;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/13 6:35 下午
 */
public class Task1 implements Task{
    private Task task;

    public Task1() {}

    public Task1(Task task){
        this.task = task;
    }
    @Override
    public void run() {
        System.out.println("task1 is run");
        if(task != null){
            task.run();
        }
    }
}
