package com.zhang.bruce.data.season1;

import com.zhang.bruce.util.FastJsonUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/4/17 5:30 下午
 */
public class Test2 {
    public static void main(String[] args) {
        String reqIf = "{\"bizType\":\"WALLET_TRX\",\"userRegisterIdNoArea\":\"湖南;邵阳\",\"blackTime\":\"不超时\",\"userPhone\":\"DG$1$d8s2dICZavymD3SroCWo1A\",\"bankMobile\":\"15608479895\",\"bsTime\":\"不超时\",\"industry\":\"Web3.0行业线\",\"idNo\":\"DG$1$TlIxhqduTT_DRRJxptnWOjWvLkXmurWC9wGw2BdIg0Y\",\"userRegisterIdNoSex\":\"男\",\"marketType\":\"转卖（二级市场）\",\"collectionSeries\":\"水浒区\",\"collectionName\":\"白花蛇·杨春\",\"limitTime\":\"不超时\",\"subBizcatName\":\"综合平台\",\"couponAmount\":\"0\",\"idnoAge\":22,\"bizcatName\":\"数字藏品\",\"userRegisterMobile\":\"DG$1$d8s2dICZavymD3SroCWo1A\",\"collectionId\":\"1_0\",\"finalResultSub\":\"综合平台\",\"registTime\":\"2023-07-01 19:24:14\",\"registIp\":\"2408:843c:2010:5536:d461:e2ff:fe61:a748\",\"signName\":\"湖北数字宇宙科技有限公司\",\"systemMerchantNo\":\"\",\"idType\":\"IDENTITY_CARD\",\"isProxyIp\":false,\"userRegisterIdNoAge\":22,\"subBizcatCode\":\"135003\",\"registId\":\"cc_prod_oknd8315nb\",\"userId\":\"211448322259\",\"customerLevel\":\"1\",\"idnoArea\":\"湖南;邵阳\",\"userIp\":\"14.218.38.47\",\"userRegisterIdNo\":\"DG$1$TlIxhqduTT_DRRJxptnWOjWvLkXmurWC9wGw2BdIg0Y\",\"idnoSex\":\"男\",\"finalResult\":\"数字藏品\",\"bizcatCode\":\"135\",\"secondParentMerchantNo\":\"\"}";
        System.out.println(buildGoodsInfo(null,reqIf));

    }
    public static String buildGoodsInfo(String goodsInfo, String reqGoodsinfo) {
        try {
            // 解析出collectionName
            Map<String, Object> goodsInfoMap = new HashMap<String, Object>();
            if (StringUtils.isNotBlank(goodsInfo)) {
                goodsInfoMap = (Map<String, Object>) FastJsonUtils.toBean(goodsInfo);
            }
            if (StringUtils.isBlank(reqGoodsinfo)||"{}".equals(reqGoodsinfo)) {
                return goodsInfo;
            }else{
                Map<String,Object> goodsMap = (Map<String, Object>) FastJsonUtils.toBean(reqGoodsinfo);
                // 商品名称不为空,将商品名称加工，否则返回原值
                if (goodsMap.containsKey("collectionName") && StringUtils.isNotBlank((String) goodsMap.get("collectionName"))) {
                    goodsInfoMap.put("collectionName",(String) goodsMap.get("collectionName"));
                    return  FastJsonUtils.toJSONString(goodsInfoMap);
                }
                return  goodsInfo;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return goodsInfo;
    }
}
