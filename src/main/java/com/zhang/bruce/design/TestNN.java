package com.zhang.bruce.design;

import com.alibaba.fastjson.JSONObject;
import com.tcredit.streaming.core.utils.LoggerUtil;

import java.math.BigDecimal;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/1/13 6:24 下午
 */
public class TestNN {
    public static void main(String[] args) {
        String x = "{\"FE\":1499.0000}";
        System.out.println(getAllValue(x));
    }
    public static Double getAllValue(Object amount) {

        try{
            JSONObject json = JSONObject.parseObject((String)amount);
            BigDecimal result = new BigDecimal(0);
            if(json!=null) {
                for(String key:json.keySet()) {
                    BigDecimal value = json.getBigDecimal(key);
                    result = result.add(value);
                }
            }
            return result.doubleValue();
        }catch (Exception e){
            LoggerUtil.getLogger().error("全局方法出现异常,amount:"+amount, e);
            return 0.0;
        }

    }
}
