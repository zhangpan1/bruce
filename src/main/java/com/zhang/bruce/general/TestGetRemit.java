package com.zhang.bruce.general;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tcredit.streaming.core.utils.LoggerUtil;
import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;
import java.util.Iterator;

import static java.util.Objects.isNull;

/**
 * @author bruce
 * @version 1.0
 * @date 2023/2/18 22:15
 * @Description:
 */
public class TestGetRemit {
    public static void main(String[] args) {
        String json = "{\" Compliance-Grey-KJ \":{\"trigger_sum_30\":14.0,\"trigger_sum_14\":1.0,\"trigger_sum_7\":1.0,\"trigger_sum_3\":1.0,\"trigger_sum_1\":0.0},\" CompBruce-KJ \":{\"trigger_sum_30\":1.0,\"trigger_sum_14\":1.0,\"trigger_sum_7\":1.0,\"trigger_sum_3\":1.0,\"trigger_sum_1\":0.0}}";
        String x = (String) getStringByJsonRuleKey(json,"all","trigger_sum_30");

        System.out.println(x);
    }


    static Object getStringByJsonRuleKey(Object jsonArrayObj,Object rule, Object key) {
        try {
            if (isNull(jsonArrayObj) || isNull(key)) {
                return null;
            }
            String jsonStr = jsonArrayObj.toString();
            if (!(jsonStr.contains("{") && jsonStr.contains("}"))) {
                return null;
            }
//            jsonStr = jsonStr.replace("#", ",").replace("\"{", "{").replace("}\"", "}");
            String ruleStr = rule.toString();
            String keyStr = key.toString();
            JSONObject jsonObj =  JSON.parseObject(jsonStr);

            if ("all".equals(ruleStr.trim()) || "ALL".equals(ruleStr.trim())) {
                BigDecimal total = new BigDecimal(0.0);
                Iterator<String> keys = jsonObj.keySet().iterator();// jsonObject.keys();
                while (keys.hasNext()) {
                    String ruleKey = keys.next().toString();
                    String valueJson = jsonObj.get(ruleKey).toString();
                    String x = JSON.parseObject(valueJson).getString(keyStr);
                    if (StringUtils.isNotBlank(x)) {
                        total = total.add(new BigDecimal(x));
                    }
                }
                return total.toString();
            } else {
                if (jsonObj.get(ruleStr) != null) {
                    String valueJson = jsonObj.get(ruleStr).toString();
                    JSONObject x = JSON.parseObject(valueJson);
                    return x;
                }
                return null;
            }
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getStringByJsonRuleKey 全局方法出现异常", e);
            return null;
        }
    }

}

