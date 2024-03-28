package com.zhang.bruce.rule.condition;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tcredit.streaming.core.utils.LoggerUtil;

import java.math.BigDecimal;
import java.util.*;

import static com.zhang.bruce.rule.FunctionTest.*;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/8/3 6:41 下午
 */
public class MecCount {
    public static void main(String[] args) {
        String jsonStr = "{\"10020307684\":{\"public\":{\"amt_remit_1\":\"0.00\",\"amt_remit_3\":\"0.00\",\"amt_remit_7\":\"2000\",\"amt_remit_14\":\"0.00\",\"amt_remit_30\":\"6020.88\"},\"legalPrivate\":{\"amt_remit_1\":\"0.00\",\"amt_remit_3\":\"0.00\",\"amt_remit_7\":\"2000\",\"amt_remit_14\":\"0.00\",\"amt_remit_30\":\"6020.88\"}},\"10034156901\":{\"legalPrivate\":{\"amt_remit_1\":\"76170.80\",\"amt_remit_3\":\"88752.94\",\"amt_remit_7\":\"99203.49\",\"amt_remit_14\":\"218073.80\",\"amt_remit_30\":\"386594.71\"}},\"10034156903\":{\"legalPrivate\":{\"amt_remit_1\":\"76170.80\",\"amt_remit_3\":\"88752.94\",\"amt_remit_7\":\"99203.49\",\"amt_remit_14\":\"218073.80\",\"amt_remit_30\":\"386594.71\"}}}";
        Object x = 1;
        String p = "all";
        String m = ">";
        Object n = 600;
        System.out.println(getMerchantCountJsonValueByCondition(jsonStr,x,p,m,n));

    }

    static Object getMerchantCountJsonValueByCondition(Object objStr, Object x, String p, String m, Object n) {
        int count = 0;
        try {
            if (isNull(objStr) || isNull(p) || isNull(x) || isNull(m) || isNull(n)) {
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
            prodMap.put("非法人对私结算", "unlegalPrivate");
            prodMap.put("法人对私结算", "legalPrivate");
            prodMap.put("对公结算", "public");
            List<String> prodList = new ArrayList<>();
            if (list.contains("all")) {
                prodList.addAll(prodMap.values());
            } else {
                for (String var1 : list) {
                    prodList.add((String) prodMap.get(var1));
                }
            }
            if (prodList.size() == 0) {
                return count;
            }
            Map attrMap = new HashMap();
            attrMap.put(1, "amt_remit_1");
            attrMap.put(3, "amt_remit_3");
            attrMap.put(7, "amt_remit_7");
            attrMap.put(14, "amt_remit_14");
            attrMap.put(30, "amt_remit_30");
            Integer x1 = (Integer) x;
            String attribute = (String) attrMap.get(x1);
            if (isNull(attribute)) {
                return count;
            }
            Set value = new HashSet();
            for (String key : jsonObj.keySet()) {
                String varmer = jsonObj.getString(key);
                JSONObject merchantObject = JSONObject.parseObject(varmer);
                BigDecimal sum = new BigDecimal("0.0");
                for (String property : prodList) {
                    if (merchantObject.containsKey(property)) {
                        JSONObject subObject = merchantObject.getJSONObject(property);
                        if (subObject.containsKey(attribute)) {
                            BigDecimal varValue = subObject.getBigDecimal(attribute);
                            sum = sum.add(varValue);
                        }
                    }
                }
                boolean conditionMet = operCond(sum, m, n);
                if (conditionMet) {
                    value.add(key);
                }
            }
            return value.size();
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getMerchantCountJsonValueByCondition 全局方法出现异常", e);
            return count;
        }
    }

    /**
     * 满足条件的商户数
     *
     * @param json
     * @param x
     * @param p
     * @param m
     * @param n
     * @return
     */
    public static List<String> getMerchantCountByCondition(String json, String x, String p, String m, String n) {
        JSONObject jsonObject = JSON.parseObject(json);
        List<String> xList = Arrays.asList(x.split(","));
        List<String> pList = Arrays.asList(p.split(","));
        double targetValue = Double.parseDouble(n);

        List<String> result = new ArrayList<>();

        for (String key : jsonObject.keySet()) {
            JSONObject merchantObject = jsonObject.getJSONObject(key);

            for (String property : pList) {
                if (merchantObject.containsKey(property)) {
                    JSONObject subObject = merchantObject.getJSONObject(property);

                    double sum = 0.0;
                    for (String attribute : xList) {
                        if (subObject.containsKey(attribute)) {
                            String value = subObject.getString(attribute);
                            double val = Double.parseDouble(value);
                            sum += val;
                        }
                    }

                    boolean conditionMet = checkCondition(sum, m, targetValue);
                    if (conditionMet) {
                        result.add(key);
                        break;
                    }
                }
            }
        }

        return result;
    }

    public static boolean checkCondition(double value, String operator, double target) {
        switch (operator) {
            case ">":
                return value > target;
            case "<":
                return value < target;
            case ">=":
                return value >= target;
            case "<=":
                return value <= target;
            case "==":
                return value == target;
            default:
                return false;
        }
    }


    static Object getCountByJsonKeysOnValueJsonKey(Object jsonArrayObj, String keys, String jsonKey) {
        int count = 0;
        try {
            if (isNull(jsonArrayObj) || isNull(keys) || isNull(jsonKey)) {
                return count;
            }
            String jsonStr = jsonArrayObj.toString();
            if (!(jsonStr.contains("{") && jsonStr.contains("}"))) {
                return count;
            }
            JSONObject jsonObj = JSON.parseObject(jsonStr);
            if (!(jsonObj != null && !jsonObj.keySet().isEmpty())) {
                return count;
            }
            List<String> list = Arrays.asList(keys.split(",|;"));
            for (String key : jsonObj.keySet()) {
                JSONObject object = jsonObj.getJSONObject(key);
                if ("all".equalsIgnoreCase(keys) && object.containsKey(jsonKey) && notNull(object.getString(jsonKey))) {
                    count += object.getInteger(jsonKey);
                } else if (list.contains(key) && object.containsKey(jsonKey) && notNull(object.getString(jsonKey))) {
                    count += object.getInteger(jsonKey);
                }
            }
            return count;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getCountByJsonKeysOnValueJsonKey 全局方法出现异常", e);
            return count;
        }
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
            JSONObject jsonObj = JSON.parseObject(jsonStr);
            Set value = new HashSet();
            for (String keyStr : keyArray) {
                if (jsonObj != null && jsonObj.containsKey(keyStr)) {
                    String result = jsonObj.getString(keyStr);
                    if (result.contains("[") && result.contains("]")) {
                        String var1 = result.replace("[", "");
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
            String[] keyArray = key.toString().split(",");
            JSONObject jsonObj =  JSON.parseObject(jsonStr);
            Integer result = 0;
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
            return result;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getCountByJsonKey 全局方法出现异常", e);
            return "";
        }
    }
}
