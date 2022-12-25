package com.zhang.bruce.rule;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tcredit.streaming.core.utils.LoggerUtil;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/12/15 11:40
 * @Description:
 */
public class Fuction {
    public static void main(String[] args) {
        String par = "{\"diff\":\"181\"#\"rules\":\"M_ESELLER_001\"}";
        String x = "180";
        String y = "M_ESELLER_001";
        System.out.println(merchantNotTriggerRules(par,x,y));
    }
    public static boolean merchantNotTriggerRules(Object jsonArrayObj, Object numDays, Object ruleCodes) {
        boolean  result = true;
        try {
            if (jsonArrayObj == null || numDays==null || ruleCodes==null) {
                return result;
            }
            String jsonArrayStr = jsonArrayObj.toString();
            if (!(jsonArrayStr.contains("{")&&jsonArrayStr.contains("}"))) {
                return result;
            }
            String jsonStr = jsonArrayStr.replace("#", ",").replace("\"\"", "\"").replace("\"{", "{").replace("}\"", "}");
            jsonStr = "["+jsonStr+"]";
            JSONArray jsonArray = JSON.parseArray(jsonStr);
            BigDecimal num = new BigDecimal(numDays.toString().trim());
            List<String> ruleCodeList = Arrays.asList(ruleCodes.toString().split(","));
            boolean  ruleTag = "all".equalsIgnoreCase(ruleCodes.toString())? true:false;
            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                BigDecimal diffNum  = jsonObject.getBigDecimal("diff");
                int a = num.compareTo(diffNum);
                if(a>=0){
                    if(ruleTag){
                        return !result;
                    }
                    for(String ruleCode : jsonObject.getString("rules").split(",")){
                        if(ruleCodeList.contains(ruleCode)){
                            return !result;
                        }
                    }
                }
            }
            return result;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getMerchantTriggerRulesResult 全局方法出现异常", e);
            return !result;
        }
    }
}
