package com.zhang.bruce.wechat;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import okhttp3.*;
import org.apache.log4j.Logger;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/8/17 6:34 下午
 */
public class WechatCompaint {
    private final Logger logger = Logger.getLogger(this.getClass());

    public static final MediaType JSON_TYPE = MediaType.parse("application/json; charset=utf-8");

    private static OkHttpClient wechatHttpClient = new OkHttpClient.Builder()
            .connectionPool( new ConnectionPool(50, 5, TimeUnit.MINUTES))
            .connectTimeout(4000, TimeUnit.MILLISECONDS)//设置连接超时时间
            .readTimeout(4000, TimeUnit.MILLISECONDS)//设置读取超时时间
            .writeTimeout(4000, TimeUnit.MILLISECONDS)
            .build();
    public static void main(String[] args) {
        Map<String,String> param = Maps.newHashMap();
        param.put("out_trade_no","5159709303200130");
        param.put("mec_no","10033216675");
        param.put("complaint_detail","&&&&&");
        String result =  executeWechartCompaint(param);
        Map<String,Object> resultMap = JSONObject.parseObject(result,Map.class);
        JSONObject object = (JSONObject)resultMap.get("data");
        System.out.println(object);
        System.out.println(JSONObject.toJSONString(resultMap));
        // String riskDesc = object.getString("complaint_reason");
        // System.out.println(riskDesc);
    }
    /**
     * 调用微信模型
     * @param param
     */
    public static String executeWechartCompaint(Map<String, String> param) {

        String responseJson = "";
        String requestJson = JSONObject.toJSONString(param);
        System.out.println("开始调用调用微信投诉模型接口，入参:{}"+requestJson);
        // String url = "http://qak8s.iaas.yp:31087/wechat_complaint";
        // String url = "http://nck8s.paas.yp:31087/wechat_complaint";
        String url = "http://risk.wechat-complaint.yp:31087/wechat_complaint";
        RequestBody requestBody = RequestBody.create(JSON_TYPE,requestJson);
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody) //post请求

                .addHeader("Connection", "keep-alive")
                .addHeader("User-Agent", "Apache-HttpClient/4.2.6 (java 1.5)")
                .addHeader("Content-Type","appliwechat_complaintcation/json;charset=utf-8")
                .build();
        try {
            final Call call =  wechatHttpClient.newCall(request);
            long t1 = System.currentTimeMillis();
            Response response = call.execute();
            responseJson = response.body().string();
            long t2 = System.currentTimeMillis();
            System.out.println("调用wechat投诉模型接口成功，耗时:{}"+(t2-t1));
        } catch (Exception e) {
            responseJson = "error";
            System.out.println("调用wechat投诉模型接口异常, errorInfo : {} "+ e);
        }
        return responseJson;
    }
}
