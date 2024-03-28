package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tcredit.streaming.core.bean.CachedRecord;
import com.tcredit.streaming.core.bean.TimedItems;
import com.tcredit.streaming.core.model.DefaultModel;

import java.util.*;

import static com.zhang.bruce.general.cach.TestDefaultMode.test4;
import static com.zhang.bruce.general.cach.TestFE_1116.getCacheValue;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/3/19 4:47 下午
 */
public class TestAddDefault {
    public static void main(String[] args) throws InterruptedException {
        List<Object> list = new ArrayList<Object>();

        DefaultModel obj = new DefaultModel();
        obj.setTradeTableName("TBL_FREQUENCY_WITHDRAWAL");
        obj.put("LEDGERNO","10088811547");
        obj.put("CREATETIME","2024-03-19 15:22:11");

        DefaultModel obj1 = new DefaultModel();
        obj1.setTradeTableName("TBL_FREQUENCY_WITHDRAWAL");
        obj1.put("LEDGERNO","10088811547");

        obj1.put("CREATETIME","2024-03-19 15:22:11");

        DefaultModel obj2 = new DefaultModel();
        obj2.setTradeTableName("TBL_FREQUENCY_WITHDRAWAL");
        obj2.put("LEDGERNO","10088811547");
        obj2.put("CREATETIME","2024-03-19 15:22:11");

        list.add(obj1);
        list.add(obj);
        list.add(obj2);

        Map<Class<?>, List<Object>> a = new HashMap<Class<?>, List<Object>>();

        a.put(DefaultModel.class, list);
        Set<CachedRecord> calc = test4().calc(a);

        System.out.println(JSON.toJSONString(calc, SerializerFeature.DisableCircularReferenceDetect));

        Iterator it = calc.iterator();
        while (it.hasNext()) {
            CachedRecord cachedRecord = (CachedRecord) it.next();
            TimedItems timedItems = (TimedItems) cachedRecord.get("提现会员近24小时高频卖出同一藏品且分账接收金额大于2w");
            System.out.println("分割线");
            System.out.println(JSON.toJSONString(timedItems, SerializerFeature.DisableCircularReferenceDetect));
            //                  1706703435738
            String transtime = "1710838374248";
            String duration = "13ph";
            System.out.println("二次割线");
            System.out.println(getCacheValue(timedItems, transtime, duration));



        }
    }


}
