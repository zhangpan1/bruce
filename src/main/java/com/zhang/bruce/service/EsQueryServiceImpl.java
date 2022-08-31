package com.zhang.bruce.service;

import com.alibaba.fastjson.JSON;
import com.zhang.bruce.espool.EsProcessUtil;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/8/31 3:23 下午
 */
@Service
public class EsQueryServiceImpl implements EsQueryService{
    @Override
    public String queryWithId() {
        SearchRequest searchRequest = new SearchRequest("hotel");//创建搜索请求
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.termsQuery("city", "北京", "天津"));
        Map<String, Object> hotel = EsProcessUtil.queryEsWithId("hotel", searchSourceBuilder);
        return JSON.toJSONString(hotel);
    }
}
