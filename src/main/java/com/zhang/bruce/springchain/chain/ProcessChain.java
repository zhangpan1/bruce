package com.zhang.bruce.springchain.chain;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 11:37 上午
 */
public abstract class ProcessChain {
    private ProcessChain next;

    public void doProcess(){
        String process = process();
        System.out.println(process);
        if (next != null) {
            next.doProcess();
        }
    }

    public void setNext(ProcessChain next) {
        this.next = next;
    }

    public abstract String process();
}
