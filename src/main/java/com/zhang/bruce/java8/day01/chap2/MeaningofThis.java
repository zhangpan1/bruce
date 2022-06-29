package com.zhang.bruce.java8.day01.chap2;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/6/23 10:41 上午
 */
public class MeaningofThis {
    public final int value = 4;
    public void doIt(){
        int value = 6;
        Runnable r = new Runnable() {
            public final int value = 5;
            @Override
            public void run() {
                int value = 10;
                System.out.println(this.value);
            }
        };
        r.run();
    }

    public static void main(String[] args) {
        MeaningofThis m = new MeaningofThis();
        m.doIt();
    }
}
