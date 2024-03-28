package com.zhang.bruce.base.queue;


import com.google.common.util.concurrent.RateLimiter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;


/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/7/3 11:45 上午
 */
@Component
public class QueueGenerationService {
    // 日志监控
    private static final Logger log = LoggerFactory.getLogger(QueueGenerationService.class);
    // LinkedBlockingQueue构造的时候若没有指定大小，则默认大小为Integer.MAX_VALUE
    private final LinkedBlockingQueue<QueueTaskHandler> tasks = new LinkedBlockingQueue<QueueTaskHandler>(5000);
    // 类似于一个线程总管 保证所有的任务都在队列之中
    private ExecutorService service = Executors.newSingleThreadExecutor();

    private static RateLimiter limiter = RateLimiter.create(1);
    // 检查服务是否运行
    private volatile boolean running = true;
    //线程状态
    private Future<?> serviceThreadStatus = null;

    @PostConstruct
    public void init() {
        serviceThreadStatus = service.submit(new Thread(new Runnable() {
            @Override
            public void run() {
                while (running) {
                    try {
                        StopWatch sw = new StopWatch("test");
                        //开始一个任务
                        QueueTaskHandler task = tasks.take();
                        sw.start("task1");
                        try {
                            task.processData();
                            limiter.acquire(1);
                            sw.stop();
                            System.out.println("任务耗时为"+sw.getTotalTimeSeconds());
                        } catch (Exception e) {
                            log.error("任务处理发生错误", e);
                            log.error("AbroadSyncKafkaListener KAFKA save flow error:", e);
                        }
                    } catch (InterruptedException e) {
                        log.error("服务停止，退出", e);
                        running = false;
                    }
                }
            }
        }, "save data thread"));
    }

    public boolean addData(QueueTaskHandler dataHandler) {
        if (!running) {
            log.warn("service is stop");
            return false;
        }
        //offer 队列已经满了，无法再加入的情况下
        boolean success = tasks.offer(dataHandler);
        if (!success) {
            log.warn("添加任务到队列失败");
        }
        return success;
    }

    //判断队列是否有任务
    public boolean isEmpty() {
       return tasks.isEmpty();
    }

    public boolean checkServiceRun() {
        return running && !service.isShutdown() && !serviceThreadStatus.isDone();
    }

    public void activeService() {
        running = true;
        if (service.isShutdown()) {
            service = Executors.newSingleThreadExecutor();
            init();
            log.info("线程池关闭，重新初始化线程池及任务");
        }
        if (serviceThreadStatus.isDone()) {
            init();
            log.info("线程池任务结束，重新初始化任务");
        }
    }

    @PreDestroy
    public void destory() {
        running = false;
        service.shutdownNow();
    }
}

