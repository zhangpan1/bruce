package com.zhang.bruce.base.bru2;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/6/27 4:10 下午
 */
public class JsonBruce {
    public static void main(String[] args) {
        String location = "{\"status\":\"1\",\"info\":\"OK\",\"infocode\":\"10000\",\"regeocode\":{\"formatted_address\":[],\"addressComponent\":{\"country\":[],\"province\":[],\"city\":[],\"citycode\":[],\"district\":[],\"adcode\":[],\"township\":[],\"towncode\":[],\"streetNumber\":{\"street\":[],\"number\":[],\"location\":\"安阳,安阳\",\"direction\":[],\"distance\":[]}},\"pois\":[],\"roads\":[],\"roadinters\":[],\"aois\":[]}}{\"status\":\"1\",\"info\":\"OK\",\"infocode\":\"10000\",\"regeocode\":{\"formatted_address\":[],\"addressComponent\":{\"country\":[],\"province\":[],\"city\":[],\"citycode\":[],\"district\":[],\"adcode\":[],\"township\":[],\"towncode\":[],\"streetNumber\":{\"street\":[],\"number\":[],\"location\":\"安阳,安阳\",\"direction\":[],\"distance\":[]}},\"pois\":[],\"roads\":[],\"roadinters\":[],\"aois\":[]}}{\"status\":\"1\",\"regeocode\":{\"addressComponent\":{\"city\":[],\"province\":[],\"adcode\":\"900000\",\"district\":[],\"towncode\":[],\"streetNumber\":{\"number\":[],\"direction\":[],\"distance\":[],\"street\":[]},\"country\":\"中国\",\"township\":[],\"businessAreas\":[[]],\"building\":{\"name\":[],\"type\":[]},\"neighborhood\":{\"name\":[],\"type\":[]},\"citycode\":[]},\"formatted_address\":[]},\"info\":\"OK\",\"infocode\":\"10000\"}";
        Map<String,String> result = Maps.newHashMap();
        //把String对象反序列化为Json对象
        JSONObject result1 = JSONObject.parseObject(location);
        String status = result1.getString("status");
        result.put("status", status);
        String formatAddress ;
        if ((status.equals("1"))) {
            // 地址信息
            JSONObject info = result1.getJSONObject("regeocode");
            formatAddress = info.getString("formatted_address");
            System.out.println(formatAddress);
        }
    }
}
