package com.zhang.bruce.espool;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.IdsQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Map;


/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/8/31 2:49 下午
 */
@Component
public class EsProcessUtil {
    private static final Logger logger = LoggerFactory.getLogger(EsProcessUtil.class);
    private final static String OPR_INDEX = "opr_order_db";

    private final static String esFieldParentMerchantNo = "parent_merchant_no";

    private final static String esFieldMerchantNo = "merchant_no";

    private final static String esFieldUniqueOrderNo = "unique_order_no";

    private final static String esFieldCreateDate = "create_date";

    /**
     * es里的全局dateformat
     */
    public final static String DateFormat = "yyyy-MM-dd HH:mm:ss.SSS";

    private static GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();

    static {
        poolConfig.setMaxIdle(20);
        poolConfig.setMaxTotal(5);
        poolConfig.setMinIdle(2);
        poolConfig.setMinEvictableIdleTimeMillis(180000);
    }

    private static EsClientPoolFactory esClientPoolFactory = new EsClientPoolFactory();

    private static GenericObjectPool<RestHighLevelClient> clientPool = new GenericObjectPool<RestHighLevelClient>(esClientPoolFactory, poolConfig);

    /**
     * 更新操作
     * @param dbIndex
     * @param id
     * @param data
     */
    public final static void update(String dbIndex, String id, Object data){
        RestHighLevelClient restClient = null;
        if (StringUtils.isBlank(dbIndex)){
            return;
        }
        try {
            restClient = getClient();
            UpdateRequest updateRequest = new UpdateRequest(dbIndex, id);
            String jsonData = data instanceof String ? (String) data : JSON.toJSONStringWithDateFormat(data, DateFormat, SerializerFeature.WriteDateUseDateFormat);
            logger.info("uniqueOrderNo:{},es-jsondata:{}", id, jsonData);
            // 若存在就执行该信息
            updateRequest.doc(jsonData, XContentType.JSON);
            // 若不存在就执行该信息
            updateRequest.upsert(jsonData, XContentType.JSON);
            restClient.update(updateRequest, RequestOptions.DEFAULT);
        } catch (Throwable ex){
            logger.error("es-update 出现未知异常！", ex);
        } finally {
            try {
                returnClient(restClient);
            } catch (Throwable e) {

            }
        }

    }


    /**
     * 生成空的查询体
     * @return
     */
    public final static SearchSourceBuilder createEmptyBuilder(){
        return new SearchSourceBuilder();
    }

    /**
     * 生成携带页码信息的查询体
     * @param page
     * @param size
     * @return
     */
    public final static SearchSourceBuilder createPageBuilder(long page, long size){
        return fillPageBuilder(createEmptyBuilder(), page, size);
    }

    /**
     * 生成携带页码信息的查询体
     * @param searchSourceBuilder
     * @param page
     * @param size
     * @return
     */
    public final static SearchSourceBuilder fillPageBuilder(SearchSourceBuilder searchSourceBuilder,
                                                            long page, long size){
        searchSourceBuilder = searchSourceBuilder == null ? createEmptyBuilder() : searchSourceBuilder;
        // 分页信息合法化
        page = page < 1 ? 1 : page;
        size = size < 1 ? 1 : size;
        long beginIndex = (page - 1) * size;
        return searchSourceBuilder.from((int) beginIndex)
                .size((int) size);
    }


    /**
     * 根据id查询es数据
     * @param dbIndex 索引
     * @param searchSourceBuilder 查询条件
     * @return
     */
    public static Map<String,Object> queryEsWithId(String dbIndex, SearchSourceBuilder searchSourceBuilder){
        RestHighLevelClient restClient = null;
        if (StringUtils.isBlank(dbIndex)){
            return null;
        }

        try {
            restClient = getClient();

            SearchRequest searchRequest = new SearchRequest();
            searchRequest.indices(dbIndex).source(searchSourceBuilder);
            SearchResponse searchResponse = restClient.search(searchRequest, RequestOptions.DEFAULT);
            if (searchResponse.isTimedOut()){
                logger.error("es查询超时,dbIndex:{}", dbIndex);
                return null;
            }
            SearchHits searchHits = searchResponse.getHits();
            Iterator<SearchHit> iterator = searchHits.iterator();
            while (iterator.hasNext()) {
                SearchHit next = iterator.next();
                return next.getSourceAsMap();
            }
        }catch (Throwable t){
            logger.error("查询es失败，t:{}",t);
        }finally {
            try {
                returnClient(restClient);
            }catch (Throwable throwable){

            }
        }
        return null;


    }

    /**
     * 根据id查询es信息，没有返回空
     * @param id
     * @return
     */
    public static Map<String,Object> queryWithId(String id){
        try {
            IdsQueryBuilder idsQueryBuilder = QueryBuilders.idsQuery();
            idsQueryBuilder.addIds(id);
            SearchSourceBuilder searchSourceBuilder = EsProcessUtil.createEmptyBuilder()
                    .query(idsQueryBuilder)
                    .timeout(TimeValue.timeValueMillis(1000));
            Map<String,Object> map = queryEsWithId(OPR_INDEX,searchSourceBuilder);
            if (MapUtils.isNotEmpty(map)){
                logger.info("从es中取出业务方自定义信息，map:{}",JSON.toJSONString(map));
                map.remove(esFieldParentMerchantNo);
                map.remove(esFieldCreateDate);
                map.remove(esFieldMerchantNo);
                map.remove(esFieldUniqueOrderNo);
            }
            return map;
        }catch (Exception e){
            logger.error("根据id查询es报错，id:{},e:{}",id,e);
        }
        return null;

    }

    /**
     * 获取链接
     * @return
     * @throws Exception
     */
    public static RestHighLevelClient getClient() throws Exception {
        return clientPool.borrowObject();
    }

    /**
     * 归还链接
     * @param restHighLevelClient
     * @throws Exception
     */
    public static void returnClient(RestHighLevelClient restHighLevelClient){
        clientPool.returnObject(restHighLevelClient);
    }
}
