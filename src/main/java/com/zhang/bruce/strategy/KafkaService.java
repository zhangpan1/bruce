package com.zhang.bruce.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/27 4:38 下午
 */
public class KafkaService {

    protected void onWork(String reqMsg) {
        Map<String,Object> reqMap = new HashMap<>();
        // AbsStateDelService.getInstance("").process();


//        LOGGER.info("recieve message by SideSnStateDealListener, reqMsg is:{}", reqMsg);
//        Map<String, Object> reqMap = parseParam(reqMsg);
//        AbsStateDealService.getInstance(MapUtils.getString(reqMap, FIELDS[0]), MapUtils.getString(reqMap, FIELDS[6])).process(reqMap);
//        LOGGER.info("exit SideSnStateDealListener, reqMsg is : {}", reqMsg);
    }
}
