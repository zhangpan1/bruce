package com.zhang.bruce.chain;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/13 6:37 下午
 */
public class Task3 implements Task{
    private Task task;

    public Task3() {}

    public Task3(Task task){
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
