package com.zhang.bruce.java8.customer;

import com.yeepay.g3.utils.common.CollectionUtils;
import org.apache.commons.compress.utils.Lists;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.*;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/3/10 6:00 下午
 */
public class GenerateService {
    private static final ExecutorService EXECUTOR = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
            Runtime.getRuntime().availableProcessors() * 8,
            0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(100));
    public static void main(String[] args) {
        List<Long> newReport = Lists.newArrayList();
        List<Long> modifyReport = Lists.newArrayList();
        CompletableFuture<Object> newSubmit = null;
        CompletableFuture<Object> modifySubmit = null;
        if (CollectionUtils.isNotEmpty(newReport)) {
            newSubmit = submitReportTask(newReport,"李四");
        }
        if (CollectionUtils.isNotEmpty(modifyReport)) {
            modifySubmit = submitReportTask(modifyReport,"王灿");
        }
    }
    private static CompletableFuture<Object> submitReportTask(List<Long> params, String operator) {
        String taskId = UUID.randomUUID().toString();
        return CompletableFuture.supplyAsync(() -> {
            // TODO
            //
            return "success";
        }, EXECUTOR);
    }
}
