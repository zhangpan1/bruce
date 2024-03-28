package com.zhang.bruce.wechat;

import com.zhang.bruce.util.FastJsonUtils;

import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/9/1 4:08 下午
 */
public class Tst {
    public static void main(String[] args) {
        String goodInfo = "{\"orderSource\":\"POS_INTERNAL\"," +
                "\"secondProductCode\":\"WECHAT\"," +
                "\"latitude\":\"+36.123749\"," +
                "\"longitude\":\"115.068463\"," +
                "\"bsCountryCode\":\"460\"," +
                "\"bsLocationCode\":\"36882\"," +
                "\"bsAreaId\":\"166959472\"," +
                "\"bsNetworkNo\":\"00\"," +
                "\"bsSignal\":\"00099\"," +
                "\"marketingProductCode\":\"PTSSFK\"," +
                "\"orderOrigin\":\"MERCHANT_SCAN\"," +
                "\"terminalId\":\"15715820\"," +
                "\"scene\":\"Offline\"," +
                "\"serialNo\":\"00004304PB08224H40962\"," +
                "\"primaryProductCode\":\"MERCHANT_SCAN\"," +
                "\"combinedPaymentDetail\":\"[{\\\"amount\\\":\\\"0.01\\\",\\\"fund_channel\\\":\\\"BANKCARD\\\",\\\"fund_type\\\":\\\"CREDIT_CARD\\\"},{\\\"amount\\\":\\\"0.01\\\",\\\"fund_channel\\\":\\\"BANKCARD\\\",\\\"fund_type\\\":\\\"CREDIT_CARD\\\"}]\"," +
                "\"expireTime\":\"2023-06-21 17:05:36\"," +
                "\"terminalAddressInfo\":\"{\\\"address\\\":\\\"中山北路550号\\\",\\\"province\\\":\\\"320000\\\",\\\"city\\\":\\\"320100\\\",\\\"district\\\":\\\"320106\\\"}\",\"launchMode\":\"API\",\"cashierTypeRisk\":\"API\",\"userIp\":\"10.201.65.56\",\"goodsName\":\"上海君邸美容有限公司商品\",\"thirdProductCode\":\"OFFLINE\"}";


        Map<String,Object> goodsMap = (Map<String, Object>) FastJsonUtils.toBean(goodInfo);



    }
}
