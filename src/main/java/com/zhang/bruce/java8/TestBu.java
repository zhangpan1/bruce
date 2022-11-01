package com.zhang.bruce.java8;

import com.google.common.collect.Lists;
import org.apache.lucene.util.NamedThreadFactory;

import java.util.List;
import java.util.concurrent.*;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/8 6:47 下午
 */
public class TestBu {
    private final static ThreadPoolExecutor executor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
            Runtime.getRuntime().availableProcessors() * 3, 0, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<>(1000), new NamedThreadFactory("package-receipt-explain"));

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        doCreate();
        System.out.println("删除了");

    }

    private static void doCreate() throws ExecutionException, InterruptedException {
        List<CompletableFuture<Boolean>> all = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            CompletableFuture<Boolean> future = createExplainFuture(i);
            all.add(future);
        }

       CompletableFuture.allOf(all.toArray(new CompletableFuture[all.size()])).join();

    }

    private static CompletableFuture<Boolean> createExplainFuture(int i) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(40000);
                System.out.println(i);
            } catch (Exception e) {

                return false;
            }
            return true;
        }, executor);

    }
}
