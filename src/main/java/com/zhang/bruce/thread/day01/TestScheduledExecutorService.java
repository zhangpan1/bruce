package com.zhang.bruce.thread.day01;

import java.util.concurrent.*;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/6/29 6:08 下午
 */
public class TestScheduledExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(5);

        ScheduledFuture scheduledFuture =
                scheduledExecutorService.schedule(new Callable() {
                                                      public Object call() throws Exception {
                                                          System.out.println("Executed!");
                                                          return "Called!";
                                                      }
                                                  },
                        5,
                        TimeUnit.SECONDS);
    }
}
