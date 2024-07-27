package com.zhang.bruce.rule.parent;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tcredit.streaming.core.utils.LoggerUtil;

import java.util.*;

import static com.zhang.bruce.rule.FunctionTest.isNull;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/5/26 2:27 下午
 */
public class Condition0526 {
    public static void main(String[] args) {
//        String json = "{\"b2b非同名充值\":[10011240071],\"企业网银支付\":[10012420660,10012559100,10011240071],\"个人网银支付\":[10011240071]}";
//        System.out.println(getCountByJsonKey(json,"b2b非同名充值,企业网银支付"));
        // String json1 = "{\"MEC_D7_UR_081\":{\"agent_mec_cnt_1\":\"0\",\"agent_mec_cnt_7\":\"0\",\"agent_mec_cnt_14\":\"14\",\"agent_mec_cnt_30\":\"0\",\"agent_mec_cnt_60\":\"0\"},\"MEC_D7_E_022\":{\"agent_mec_cnt_1\":\"0\",\"agent_mec_cnt_7\":\"0\",\"agent_mec_cnt_14\":\"14\",\"agent_mec_cnt_30\":\"1\",\"agent_mec_cnt_60\":\"1\"},\"MEC_M_SC_044\":{\"agent_mec_cnt_1\":\"0\",\"agent_mec_cnt_7\":\"0\",\"agent_mec_cnt_14\":\"15\",\"agent_mec_cnt_30\":\"0\",\"agent_mec_cnt_60\":\"0\"}}";
       //  System.out.println(getCountByNumJsonKey(json1,"all","agent_mec_cnt_14"));
            String json2 = "{\"MEC_D7_UR_AGENT_011\":{\"parent_rule_cnt_1\":\"0\",\"parent_rule_cnt_7\":\"0\",\"parent_rule_cnt_14\":\"14\",\"parent_rule_cnt_30\":\"0\",\"parent_rule_cnt_60\":\"1\"},\"MEC_D7_UR_AGENT_012\":{\"parent_rule_cnt_1\":\"0\",\"parent_rule_cnt_7\":\"0\",\"parent_rule_cnt_14\":\"14\",\"parent_rule_cnt_30\":\"0\",\"parent_rule_cnt_60\":\"1\"}}";
       // System.out.println(isContainorNotEquals("是",0));

        String x = "否";
        String userua = "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.4";
        System.out.println(isContainorKjBank(x,userua));
    }
    static Object getCountByJsonKey(Object jsonArrayObj, Object key) {
        try {
            LoggerUtil.getLogger().error("getCountByJsonKey jsonArrayObj=={}", jsonArrayObj);
            LoggerUtil.getLogger().error("getCountByJsonKey key=={}", key);
            if (isNull(jsonArrayObj) || isNull(key)) {
                return "";
            }
            String jsonStr = jsonArrayObj.toString();
            if (!(jsonStr.contains("{") && jsonStr.contains("}"))) {
                return "";
            }
            jsonStr = jsonStr.replace("#", ",").replace("\"{", "{").replace("}\"", "}");
            String[] keyArray = key.toString().split(",");
            JSONObject jsonObj =  JSON.parseObject(jsonStr);
            Set value = new HashSet();
            for (String keyStr : keyArray){
                if (jsonObj != null && jsonObj.containsKey(keyStr)) {
                    String result = jsonObj.getString(keyStr);
                    if (result.contains("[") && result.contains("]")) {
                        String var1 = result.replace("[","");
                        List<String> mecNos = Arrays.asList(var1.replace("]", "").split(","));
                        if (mecNos.size() > 0) {
                            value.addAll(mecNos);
                        }
                     }
                }
            }
            return value.size();
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getCountByJsonKey 全局方法出现异常", e);
            return "";
        }
    }
    static Object getStringByJsonPro(Object jsonArrayObj, Object key) {
        try {
            LoggerUtil.getLogger().error("getCountByJsonKey jsonArrayObj=={}", jsonArrayObj);
            LoggerUtil.getLogger().error("getCountByJsonKey key=={}", key);
            if (isNull(jsonArrayObj) || isNull(key)) {
                return "";
            }
            String jsonStr = jsonArrayObj.toString();
            if (!(jsonStr.contains("{") && jsonStr.contains("}"))) {
                return "";
            }
            jsonStr = jsonStr.replace("#", ",").replace("\"{", "{").replace("}\"", "}");
            String keyStr = key.toString();
            JSONObject jsonObj =  JSON.parseObject(jsonStr);
            if (jsonObj != null && jsonObj.containsKey(keyStr)) {
                return jsonObj.getString(keyStr);
            }
            return "";
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getStringByJson 全局方法出现异常", e);
            return "";
        }
    }

    static Object getCountByNumJsonKey(Object jsonArrayObj, Object key,Object keynum) {
        try {
            LoggerUtil.getLogger().error("getCountByNumJsonKey jsonArrayObj=={}", jsonArrayObj);
            LoggerUtil.getLogger().error("getCountByNumJsonKey key=={}", key);
            LoggerUtil.getLogger().error("getCountByNumJsonKey keynum=={}", keynum);
            if (isNull(jsonArrayObj) || isNull(key) || isNull(keynum)) {
                return "";
            }
            String jsonStr = jsonArrayObj.toString();
            if (!(jsonStr.contains("{") && jsonStr.contains("}"))) {
                return "";
            }
            jsonStr = jsonStr.replace("#", ",").replace("\"{", "{").replace("}\"", "}");
            JSONObject jsonObj =  JSON.parseObject(jsonStr);
            Integer result = 0;
            if (key.equals("all")) {
                for (Map.Entry<String, Object> entry : jsonObj.entrySet()) {
                    String var2 = entry.getValue().toString();
                    JSONObject varObj1  =  JSON.parseObject(var2);
                    if (varObj1 != null && varObj1.containsKey(keynum)) {
                        Integer var3 = Integer.valueOf((String) varObj1.get(keynum)) ;
                        result = result + var3;
                    }
                }
            } else {
                String[] keyArray = key.toString().split(",");
                for (String keyStr : keyArray){
                    if (jsonObj != null && jsonObj.containsKey(keyStr)) {
                        String var1 = jsonObj.getString(keyStr);
                        JSONObject varObj  =  JSON.parseObject(var1);
                        if (varObj != null && varObj.containsKey(keynum)) {
                            Integer var2 = Integer.valueOf((String) varObj.get(keynum)) ;
                            result = result + var2;
                        }
                    }
                }
            }
            return result;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getCountByJsonKey 全局方法出现异常", e);
            return "";
        }
    }

    static boolean isContainorNotEquals(Object a, Object x) {
        try {
            if (a == null || x == null) {
                return false;
            }
            String as = (String) a;
            Integer xs = (Integer) x;
            int tag = 1;
            int tagNo = 0;
            if ("同".equals(as)) {
                if (tag == xs) {
                    return true;
                }
            }
            if ("不同".equals(as)) {
                if (tagNo == xs) {
                    return true;
                }
            }
            if ("是".equals(as)) {
                if (tag == xs) {
                    return true;
                }
            }
            if ("不是".equals(as)) {
                if (tagNo == xs) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("isContainorNotEquals", e);
            e.printStackTrace();
            return false;
        }
    }

    static boolean isContainorKjBank(Object a, Object x) {
        try {
            if (a == null || x == null) {
                return false;
            }
            String as = (String) a;
            String userua = (String) x;
            if ("是".equals(as)) {
               if (userua.startsWith("UnionPay") && userua.contains("3999")) {
                   return true;
               }
            }
            if ("否".equals(as)) {
                if (userua.startsWith("UnionPay") && userua.contains("3999")) {
                    return false;
                } else {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("isContainorKjBank", e);
            e.printStackTrace();
            return false;
        }
    }
}
