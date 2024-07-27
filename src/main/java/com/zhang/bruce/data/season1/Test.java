package com.zhang.bruce.data.season1;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.google.gson.Gson;

import java.util.Map;

/**
 * @description: some desc
 * @author: bruce
 * @email: zhangpan380@gmail.com
 * @date: 2022/2/25 11:03 上午
 */
public class Test {
    public static void main(String[] args) {
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setAgentcode("1001");
        goodsInfo.setCreateUser("bruce");
        goodsInfo.setDealType("dele");

        Map<String,Object> god = Maps.newHashMap();
        god.put("sfs",1);
        god.put("ddff","sfs");
        Gson gson = new Gson();
        goodsInfo.setGoodInfo(gson.toJson(god));

        Gson gson1 = new Gson();
        String goodsIf = gson1.toJson(goodsInfo);

        try {
            Gson gson2 = new Gson();
            GoodsInfo goodsInfo1 = gson2.fromJson(goodsIf, GoodsInfo.class);
            String x = goodsInfo1.getGoodInfo();
            JSONObject object = JSON.parseObject(x);
            object.put("xxx",232);
            System.out.println(object);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
