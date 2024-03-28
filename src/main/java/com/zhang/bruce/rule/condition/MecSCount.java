package com.zhang.bruce.rule.condition;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tcredit.streaming.core.utils.LoggerUtil;

import java.math.BigDecimal;
import java.util.*;

import static com.zhang.bruce.rule.FunctionTest.isNull;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/8/4 3:00 下午
 */
public class MecSCount {
    public static void main(String[] args) {
        Object objStr = "{\"public_notlegal_private_cnt\":\"2\",\"legal_private_notlegal_private_cnt\":\"3\",\"public_legal_private_cnt\":\"4\",\"legal_private_cnt\":\"5\"}";
        Object allCnt = "100";
        String p = "all";
        String m = "不包含";
        System.out.println(getMerchantCountJsonValueByContains(objStr,allCnt,p,m));
    }

    static Object getMerchantCountJsonValueByContains(Object objStr,Object allCnt, String p, String m) {
        int count = 0;
        try {
            if (isNull(objStr) || isNull(p)  || isNull(m) ) {
                return count;
            }
            String jsonStr = objStr.toString();
            if (!(jsonStr.contains("{") && jsonStr.contains("}"))) {
                return "";
            }
            jsonStr = jsonStr.replace("#", ",").replace("\"{", "{").replace("}\"", "}");
            if (!(jsonStr.contains("{") && jsonStr.contains("}"))) {
                return count;
            }
            JSONObject jsonObj = JSON.parseObject(jsonStr);
            if (!(jsonObj != null && !jsonObj.keySet().isEmpty())) {
                return count;
            }
            List<String> list = Arrays.asList(p.toLowerCase().split(",|;"));
            Map prodMap = new HashMap();
            prodMap.put("非法人对私结算", "public_notlegal_private_cnt,legal_private_notlegal_private_cnt");
            prodMap.put("法人对私结算", "legal_private_notlegal_private_cnt,legal_private_cnt");
            prodMap.put("对公结算", "public_notlegal_private_cnt,public_legal_private_cnt");
            Set<String> prodListUse =  new HashSet();
            List<String> prodList = new ArrayList();
            if (list.contains("all")) {
                prodList.addAll(prodMap.values());
            } else {
                for (String var1 : list) {
                    prodList.add((String) prodMap.get(var1));
                }
            }
            for (String var : prodList){
                List<String> varList = Arrays.asList(var.split(","));
                prodListUse.addAll(varList);
            }
            if (prodListUse.size() == 0) {
                return count;
            }
            BigDecimal sum = new BigDecimal("0.0");
            for (String key : prodListUse) {
                String varmer = jsonObj.getString(key);
                sum = sum.add(new BigDecimal(varmer));
            }
            if ("包含".equals(m)) {
                return sum;
            } else if ("不包含".equals(m)){
                BigDecimal all = new BigDecimal(allCnt.toString());
                return all.subtract(sum);
            } else {
                return count;
            }
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getMerchantCountJsonValueByCondition 全局方法出现异常", e);
            return count;
        }
    }
}
