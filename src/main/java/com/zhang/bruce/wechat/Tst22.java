package com.zhang.bruce.wechat;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import org.apache.commons.compress.utils.Lists;

import java.util.List;
import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/9/1 4:23 下午
 */
public class Tst22 {
    public static void main(String[] args) {
        List<Ds2> combinedPaymentDetail = Lists.newArrayList();
        for (int i = 0 ; i < 2; i ++) {
            Ds2 ds2 = new Ds2();
            ds2.setAmount("0.01");
            ds2.setFund_channel("BANKCARD");
            ds2.setFund_type("CREDIT_CARD");
            combinedPaymentDetail.add(ds2);
        }
         System.out.println(JSONObject.toJSONString(combinedPaymentDetail));
        Map<String,String> x = Maps.newHashMap();
        x.put("primaryProductCode","MERCHANT_SCAN");
        x.put("combinedPaymentDetail",JSONObject.toJSONString(combinedPaymentDetail));
        x.put("orderSource","POS_INTERNAL");
        x.put("terminalAddressInfo","");
        System.out.println(JSONObject.toJSONString(x));
    }
}
