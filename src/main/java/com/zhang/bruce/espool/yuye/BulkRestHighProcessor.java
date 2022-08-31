//package com.zhang.bruce.espool.yuye;
//
//import io.netty.util.HashedWheelTimer;
//import io.netty.util.Timeout;
//import io.netty.util.TimerTask;
//import org.apache.lucene.util.NamedThreadFactory;
//import org.elasticsearch.action.ActionRequestValidationException;
//import org.elasticsearch.action.DocWriteRequest;
//import org.elasticsearch.action.bulk.BulkRequest;
//import org.elasticsearch.action.bulk.BulkRequestBuilder;
//import org.elasticsearch.action.bulk.BulkResponse;
//import org.elasticsearch.action.index.IndexRequest;
//import org.elasticsearch.action.update.UpdateRequest;
//import org.elasticsearch.client.RequestOptions;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.elasticsearch.client.transport.TransportClient;
//import org.elasticsearch.common.unit.TimeValue;
//import org.elasticsearch.transport.ReceiveTimeoutTransportException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.Formatter;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.Executors;
//import java.util.concurrent.SynchronousQueue;
//import java.util.concurrent.ThreadPoolExecutor;
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.atomic.AtomicLong;
//import java.util.concurrent.atomic.DoubleAdder;
//import java.util.concurrent.atomic.LongAdder;
//
//public class BulkRestHighProcessor {
//
//    private static final Logger logger = LoggerFactory.getLogger(BulkRestHighProcessor.class);
//
//    private static final int MAX_BULK_ACTIONS = 10000;
//    private static final  int FLUSH_INTERVAL = 60;
//    private static final int CONCURRENT_REQUESTS = 10;
//    private final RestHighLevelClient client;
//    //private volatile BulkRequestBuilder bulkRequest;
//    private final AtomicLong idGenerate = new AtomicLong();
//    private final ThreadPoolExecutor threadPoolExecutor;
//    private final DoubleAdder costAdder = new DoubleAdder();
//    private final LongAdder executeCount = new LongAdder();
//    private long lastCommitCount = 0;
//    private double lastCost = 0;
//    private long lastExecuteCount = 0;
//    private volatile boolean isOverload = false;
//    private final static long defaultTickDuration = 10;
//    private final HashedWheelTimer hashedWheelTimer = new HashedWheelTimer(
//            new NamedThreadFactory("RequestHoldTimer" + defaultTickDuration),
//            defaultTickDuration, TimeUnit.SECONDS);
//    private final Map<String, BulkMetric> requestBuilderMap = new HashMap<>();
//    private static final String TIME_OUT_BUFFER = "time_out_buffer_es_safe";
//    private final ToKafka toKafka;
//
//    public BulkRestHighProcessor(RestHighLevelClient client, ToKafka toKafka) {
//        this.client = client;
//        this.toKafka = toKafka;
//        threadPoolExecutor =
//                new ThreadPoolExecutor(CONCURRENT_REQUESTS,
//                        CONCURRENT_REQUESTS * 2,
//                        1,
//                        TimeUnit.MINUTES,
//                        new SynchronousQueue<>(),
//                        new NamedThreadFactory("Bulk-thread-pool"));
//        threadPoolExecutor.setRejectedExecutionHandler((r, executor) -> {
//            try {
//                executor.getQueue().put(r);
//            } catch (InterruptedException e) {
//                logger.error("", e);
//            }
//        });
//        hashedWheelTimer.start();
//        Executors
//                .newSingleThreadScheduledExecutor(new NamedThreadFactory("over-load-thread"))
//                .scheduleAtFixedRate(this::overLoadCheck, FLUSH_INTERVAL, FLUSH_INTERVAL, TimeUnit.SECONDS);
//    }
//
//    private void overLoadCheck() {
//        long currentCount = idGenerate.longValue();
//        double currentCost = costAdder.doubleValue();
//        long currentExecuteCount = executeCount.longValue();
//        long count = currentCount - lastCommitCount;
//        double cost = currentCost - lastCost;
//        long execute = currentExecuteCount - lastExecuteCount;
//        double esSpeed = 0;
//        if (count != 0) {
//            esSpeed = cost / count * 1000 * CONCURRENT_REQUESTS * 2;
//        }
//        double kafkaSpeed = ((double) execute) / 60;
//        isOverload = (kafkaSpeed * 1.25) > esSpeed;
//        Formatter esFormatter = new Formatter();
//        String esPerformance = esFormatter.format("%.2f", esSpeed).toString();
//        Formatter kafkaFormatter = new Formatter();
//        String kafkaPerformance = kafkaFormatter.format("%.2f", (kafkaSpeed * 1.25)).toString();
//        logger.info("es speed:[{}], kafka speed: [{}]", esPerformance, kafkaPerformance);
//        lastCommitCount = currentCount;
//        lastCost = currentCost;
//        lastExecuteCount = currentExecuteCount;
//    }
//
//    private void execute(BulkRequest bulkRequest) {
//        if (bulkRequest == null) {
//            return;
//        }
//        logger.info("==============Thread pool status==============");
//        logger.info("active count:{}, core pool size:{}, pool size:{}", threadPoolExecutor.getActiveCount(),
//                threadPoolExecutor.getCorePoolSize(), threadPoolExecutor.getPoolSize());
//        if (bulkRequest.numberOfActions() <= 0) {
//            return;
//        }
//        threadPoolExecutor.execute(() -> flush(bulkRequest));
//    }
//
//    public boolean isOverload() {
//        return isOverload;
//    }
//
//    private void flush(BulkRequest request) {
//        long executeId = idGenerate.incrementAndGet();
//        logger.info("before bulk, executeId:{}, actionSize:{}, threadName:{}",
//                executeId, request.numberOfActions(), Thread.currentThread().getName());
//        try {
//            request.timeout(new TimeValue(60, TimeUnit.SECONDS));
//            BulkResponse bulkItemResponses = client.bulk(request, RequestOptions.DEFAULT);
//           /* BulkResponse bulkItemResponses = request.setTimeout(new TimeValue(60, TimeUnit.SECONDS))
//                    .get(new TimeValue(70, TimeUnit.SECONDS));*/
//            if (bulkItemResponses.hasFailures()) {
//                logger.info("bulk fail, executeId:{}, actionSize:{}, threadName:{}, cost:{}, because:{}",
//                        executeId, request.numberOfActions(), Thread.currentThread().getName(), bulkItemResponses.getTook().getMillis(), bulkItemResponses.buildFailureMessage());
//            } else {
//                logger.info("bulk success, executeId:{}, actionSize:{}, threadName:{}, cost:{}",
//                        executeId, request.numberOfActions(), Thread.currentThread().getName(), bulkItemResponses.getTook().getMillis());
//            }
//            costAdder.add(((double)request.numberOfActions())/bulkItemResponses.getTook().getMillis());
//        }catch (ActionRequestValidationException validationException){
//            logger.info("es validation exception:", validationException);
//        } catch (ReceiveTimeoutTransportException e) {
//            logger.info("timeout error:", e);
//            sendErrorRequest(request);
//        } catch (Throwable t) {
//            logger.error("UnExceptError:", t);
//            sendErrorRequest(request);
//        }
//    }
//
//    public void sendErrorRequest(BulkRequest request) {
//        costAdder.add(60 * 1000);
//        for (DocWriteRequest<?> docWriteRequest : request.requests()) {
//            if (docWriteRequest instanceof IndexRequest) {
//                IndexRequest indexRequest = (IndexRequest)docWriteRequest;
//                toKafka.sendToKafka(TIME_OUT_BUFFER, indexRequest.sourceAsMap());
//            } else if (docWriteRequest instanceof UpdateRequest) {
//                UpdateRequest updateRequest = (UpdateRequest)docWriteRequest;
//                toKafka.sendToKafka(TIME_OUT_BUFFER, updateRequest.doc().sourceAsMap());
//            }
//        }
//    }
//
//    private class BulkMetric implements TimerTask {
//        private volatile BulkRequest bulkRequest;
//        private final String tagName;
//        private int bulkCountPerMinute;
//        private volatile long uid;
//        public BulkMetric(String tagName) {
//            this.tagName = tagName;
//            this.bulkRequest = new BulkRequest();
//            this.uid = 0;
//        }
//        public void add(EsMessage esMessage) {
//            if (bulkRequest.numberOfActions() >= MAX_BULK_ACTIONS) {
//                synchronized (this){
//                    if(bulkRequest.numberOfActions() >= MAX_BULK_ACTIONS){
//                        executeAndNewBuilder();
//                    }
//                }
//            }
//            Object idObj = esMessage.getRecord().get("id");
//            bulkCountPerMinute ++;
//            if (idObj != null && String.valueOf(idObj).length() != 0)
//                bulkRequest
//                        .add(new IndexRequest(esMessage.getIndexName()).id(String.valueOf(idObj)).opType(DocWriteRequest.OpType.CREATE).source(esMessage.getRecord())).routing(uid + "");
//            else
//                bulkRequest
//                        .add(new IndexRequest(esMessage.getIndexName()).opType(DocWriteRequest.OpType.CREATE).source(esMessage.getRecord())).routing(uid + "");
//        }
//
//        private void executeAndNewBuilder() {
//            BulkRequest bulkRequestRe = this.bulkRequest;
//            this.bulkRequest = new BulkRequest();
//            execute(bulkRequestRe);
//            logger.info("bulk TagName is [{}]", tagName);
//            uid ++;
//        }
//
//        @Override
//        public void run(Timeout timeout) throws Exception {
//            executeAndNewBuilder();
//            logger.info("tagName: [{}], bulkCountPerMinute: [{}]", tagName, bulkCountPerMinute);
//            bulkCountPerMinute = 0;
//            hashedWheelTimer.newTimeout(this, 1, TimeUnit.MINUTES);
//        }
//    }
//
//    public synchronized void add(EsMessage esMessage) {
//        executeCount.increment();
//        BulkMetric bulkMetric = requestBuilderMap.computeIfAbsent(esMessage.getTagName(), k -> {
//            BulkMetric bulk = new BulkMetric(esMessage.getTagName());
//            hashedWheelTimer.newTimeout(bulk, 1, TimeUnit.MINUTES);
//            return bulk;
//        });
//        bulkMetric.add(esMessage);
//    }
//
//    public void close() {
//        hashedWheelTimer.stop();
//        threadPoolExecutor.shutdown();
//        logger.info("剩余任务个数为:[{}]", threadPoolExecutor.getQueue().size());
//    }
//}
