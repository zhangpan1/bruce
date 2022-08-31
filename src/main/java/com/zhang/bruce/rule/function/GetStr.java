package com.zhang.bruce.rule.function;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tcredit.streaming.core.utils.LoggerUtil;

import java.math.BigDecimal;
import java.util.*;

import static com.zhang.bruce.rule.FunctionTest.isNull;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/8/23 4:06 下午
 */
public class GetStr {
    public static void main(String[] args) {
        String json = "{\"mec_no\":\"12130184\",\"cnt\":17,\"crd_cnt\":9,\"idname_cnt\":9,\"idname_detail\":\"赖小红#王清#朱梦雪#刘光兵#肖远波#孙涛波#赵兰芳#程少祥#李会平\",\"suc_cnt\":17,\"suc_amt_sum\":2133071.39,\"suc_amt_max\":197686.87,\"suc_dtdiff_max\":4,\"suc_dtdiff_min\":3,\"suc_dt_cnt\":2,\"suc_dt_detail\":[\"2022-08-18\",\"2022-08-17\"],\"suc_crd_cnt\":9,\"suc_idname_cnt\":9,\"suc_idname_detail\":\"赖小红#王清#朱梦雪#刘光兵#肖远波#孙涛波#赵兰芳#程少祥#李会平\",\"pr_cnt\":17,\"pr_idname_detail\":\"赖小红#王清#朱梦雪#刘光兵#肖远波#孙涛波#赵兰芳#程少祥#李会平\",\"pu_cnt\":0,\"pu_idname_detail\":\"\",\"vals_cz\":\"{\\\"mec_no\\\":\\\"12130184\\\",\\\"suc_cnt\\\":2,\\\"suc_amt_sum\\\":2131240.13}\",\"suc_idname_detail_d_base_vals_dt30\":\"赖小红#朱梦雪#王清#刘光兵#肖远波#孙涛波#赵兰芳#程少祥#李会平\",\"vals_payment\":\"{\\\"mec_no\\\":\\\"12130184\\\",\\\"suc_cnt\\\":17,\\\"suc_amt_sum\\\":500.39,\\\"suc_amt_max\\\":197686.87,\\\"diff_max\\\":4,\\\"diff_min\\\":3,\\\"dt_cnt\\\":2,\\\"dt_detail\\\":[\\\"2022-08-18\\\",\\\"2022-08-17\\\"],\\\"suc_amt_p50\\\":150000.00,\\\"suc_amt_p75\\\":170000.00,\\\"suc_amt_p90\\\":190000.00,\\\"suc_amt_p99\\\":197686.87,\\\"suc_amt_less1w_cnt\\\":1,\\\"suc_amt_1w5w_cnt\\\":0,\\\"suc_amt_5w10w_cnt\\\":6,\\\"suc_amt_10w50w_cnt\\\":10,\\\"suc_amt_50w100w_cnt\\\":0,\\\"suc_amt_100w500w_cnt\\\":0,\\\"suc_amt_more500w_cnt\\\":0,\\\"suc_amt_less1w_amt\\\":9265.55,\\\"suc_amt_1w5w_amt\\\":0.00,\\\"suc_amt_5w10w_amt\\\":486004.49,\\\"suc_amt_10w50w_amt\\\":1637801.35,\\\"suc_amt_50w100w_amt\\\":0.00,\\\"suc_amt_100w500w_amt\\\":0.00,\\\"suc_amt_more500w_amt\\\":0.00,\\\"suc_amt_pmod1k_100_cnt\\\":10,\\\"suc_amt_pmod1k_p10_cnt\\\":11,\\\"suc_amt_pmod1k_100_amt_lastmon\\\":1420949.93,\\\"suc_amt_pmod1k_p10_amt\\\":1618636.80,\\\"suc_amt_std\\\":53258.68303851832,\\\"suc_amt_avg\\\":125474.787647,\\\"suc_amt_stdavg\\\":0.4245,\\\"suc_crd_cnt\\\":9,\\\"suc_idname_cnt\\\":100,\\\"suc_idname_detail\\\":\\\"赖小红#朱梦雪#王清#刘光兵#肖远波#孙涛波#赵兰芳#程少祥#李会平\\\",\\\"suc_pr_cnt\\\":17,\\\"suc_pr_idname_cnt\\\":9,\\\"suc_pr_idname_detail\\\":\\\"赖小红#朱梦雪#王清#刘光兵#肖远波#孙涛波#赵兰芳#程少祥#李会平\\\",\\\"suc_pu_crd_cnt\\\":0,\\\"suc_pu_idname_cnt\\\":0,\\\"suc_pu_idname_detail\\\":\\\"\\\"}\",\"vals_withdraw\":\"{\\\"mec_no\\\":\\\"12130184\\\",\\\"suc_cnt\\\":17,\\\"suc_amt_sum\\\":500.39,\\\"suc_amt_max\\\":197686.87,\\\"diff_max\\\":4,\\\"diff_min\\\":3,\\\"dt_cnt\\\":2,\\\"dt_detail\\\":[\\\"2022-08-18\\\",\\\"2022-08-17\\\"],\\\"suc_amt_p50\\\":150000.00,\\\"suc_amt_p75\\\":170000.00,\\\"suc_amt_p90\\\":190000.00,\\\"suc_amt_p99\\\":197686.87,\\\"suc_amt_less1w_cnt\\\":1,\\\"suc_amt_1w5w_cnt\\\":0,\\\"suc_amt_5w10w_cnt\\\":6,\\\"suc_amt_10w50w_cnt\\\":10,\\\"suc_amt_50w100w_cnt\\\":0,\\\"suc_amt_100w500w_cnt\\\":0,\\\"suc_amt_more500w_cnt\\\":0,\\\"suc_amt_less1w_amt\\\":9265.55,\\\"suc_amt_1w5w_amt\\\":0.00,\\\"suc_amt_5w10w_amt\\\":486004.49,\\\"suc_amt_10w50w_amt\\\":1637801.35,\\\"suc_amt_50w100w_amt\\\":0.00,\\\"suc_amt_100w500w_amt\\\":0.00,\\\"suc_amt_more500w_amt\\\":0.00,\\\"suc_amt_pmod1k_100_cnt\\\":10,\\\"suc_amt_pmod1k_p10_cnt\\\":11,\\\"suc_amt_pmod1k_100_amt_lastmon\\\":1420949.93,\\\"suc_amt_pmod1k_p10_amt\\\":1618636.80,\\\"suc_amt_std\\\":53258.68303851832,\\\"suc_amt_avg\\\":125474.787647,\\\"suc_amt_stdavg\\\":0.4245,\\\"suc_crd_cnt\\\":9,\\\"suc_idname_cnt\\\":50,\\\"suc_idname_detail\\\":\\\"赖小红#朱梦雪#王清#刘光兵#肖远波#孙涛波#赵兰芳#程少祥#李会平\\\",\\\"suc_pr_cnt\\\":17,\\\"suc_pr_idname_cnt\\\":9,\\\"suc_pr_idname_detail\\\":\\\"赖小红#朱梦雪#王清#刘光兵#肖远波#孙涛波#赵兰芳#程少祥#李会平\\\",\\\"suc_pu_crd_cnt\\\":0,\\\"suc_pu_idname_cnt\\\":0,\\\"suc_pu_idname_detail\\\":\\\"\\\"}\",\"max_crd_amt\":797686.87,\"suc_crd_amt_p50\":98574.78,\"suc_crd_amt_p75\":315810.92,\"suc_crd_amt_p90\":797686.87,\"suc_crd_amt_p99\":797686.87,\"suc_crd_pu_cnt\":0,\"suc_crd_pu_crdcnt\":0,\"suc_crd_pu_amt\":0.00,\"suc_crd_pu_amt_less1w_cnt\":0,\"suc_crd_pu_amt_1w5w_cnt\":0,\"suc_crd_pu_amt_5w10w_cnt\":0,\"suc_crd_pu_amt_10w50w_cnt\":0,\"suc_crd_pu_amt_50w100w_cnt\":0,\"suc_crd_pu_amt_100w500w_cnt\":0,\"suc_crd_pu_amt_more500w_cnt\":0,\"suc_crd_pu_amt_less1w_amt\":0.00,\"suc_crd_pu_amt_1w5w_amt\":0.00,\"suc_crd_pu_amt_5w10w_amt\":0.00,\"suc_crd_pu_amt_10w50w_amt\":0.00,\"suc_crd_pu_amt_50w100w_amt\":0.00,\"suc_crd_pu_amt_100w500w_amt\":0.00,\"suc_crd_pu_amt_more500w_amt\":0.00,\"suc_crd_pr_cnt\":17,\"suc_crd_pr_crdcnt\":9,\"suc_crd_pr_amt\":2133071.39,\"suc_max_crd_pr_amt\":797686.87,\"suc_crd_pr_amt_p50\":98574.78,\"suc_crd_pr_amt_p75\":315810.92,\"suc_crd_pr_amt_p90\":797686.87,\"suc_crd_pr_amt_p99\":797686.87,\"suc_crd_pr_amt_less1w_cnt\":1,\"suc_crd_pr_amt_1w5w_cnt\":0,\"suc_crd_pr_amt_5w10w_cnt\":4,\"suc_crd_pr_amt_10w50w_cnt\":3,\"suc_crd_pr_amt_50w100w_cnt\":1,\"suc_crd_pr_amt_100w500w_cnt\":0,\"suc_crd_pr_amt_500w1kw_cnt\":0,\"suc_crd_pr_amt_1kw5kw_cnt\":0,\"suc_crd_pr_amt_5kw1ww_cnt\":0,\"suc_crd_pr_amt_more1ww_cnt\":0,\"suc_crd_pr_amt_less1w_amt\":9265.55,\"suc_crd_pr_amt_1w5w_amt\":0.00,\"suc_crd_pr_amt_5w10w_amt\":306004.49,\"suc_crd_pr_amt_10w50w_amt\":1020114.48,\"suc_crd_pr_amt_50w100w_amt\":797686.87,\"suc_crd_pr_amt_100w500w_amt\":0.00,\"suc_crd_pr_amt_500w1kw_amt\":0.00,\"suc_crd_pr_amt_1kw5kw_amt\":0.00,\"suc_crd_pr_amt_5kw1ww_amt\":0.00,\"suc_crd_pr_amt_more1ww_amt\":0.00,\"suc_crd_pr_amt_std\":246544.24328954754,\"suc_crd_pr_amt_avg\":237007.932222,\"suc_crd_pr_amt_stdavg\":1.0402,\"suc_pu_idname_detail\":\"\",\"suc_pr_idname_detail\":\"赖小红#朱梦雪#王清#肖远波#刘光兵#孙涛波#赵兰芳#程少祥#李会平\",\"suc_sameamt_top3_cnt\":5,\"suc_sameamt_top3_amt\":857686,\"suc_crdamt_top3_amt\":1613497.79,\"suc_crdcnt_top3_cnt\":10,\"suc_crdamt_top3_cnt\":10}";
        String key = "DOMESTIC_PAYMENT";
        System.out.println( operCond(divisionByDecimal(getStringByTypeM1(json, "WITHDRAW"),getStringByTypeM1(json,"DOMESTIC_PAYMENT")),">=",30));
    }

    static Double getStringByType(Object jsonArrayObj, Object key) {
        try {
            if (isNull(jsonArrayObj) || isNull(key)) {
                return null;
            }
            List<String> types = Arrays.asList(key.toString().split(","));
            for (String type : types) {
                // 判断是否在这个范围
                if (!type.equals("DOMESTIC_PAYMENT") && !type.equals("WITHDRAW")) {
                    return null;
                }
            }
            Map<String, String> stringMap = new HashMap();
            stringMap.put("DOMESTIC_PAYMENT", "vals_payment");
            stringMap.put("WITHDRAW", "vals_withdraw");
            String jsonStr = jsonArrayObj.toString();
            JSONObject jsonObj = JSON.parseObject(jsonStr);
            if (types.size() > 1) {
                String key1 = stringMap.get(types.get(0)).toString();
                String key2 = stringMap.get(types.get(1)).toString();
                BigDecimal total = new BigDecimal(0);
                BigDecimal result1 = new BigDecimal(0);
                BigDecimal result2 = new BigDecimal(0);
                if (jsonObj != null && jsonObj.containsKey(key1)) {
                    String vals = jsonObj.getString(key1);
                    JSONObject jsonObjVal = JSON.parseObject(vals);
                    if (jsonObjVal != null && jsonObjVal.containsKey("suc_amt_sum")) {
                        if (jsonObjVal.getBigDecimal("suc_amt_sum") != null) {
                            result1 = jsonObj.getBigDecimal("suc_amt_sum");
                            total = total.add(result1);
                        }
                    }
                }
                if (jsonObj != null && jsonObj.containsKey(key2)) {
                    String vals = jsonObj.getString(key2);
                    JSONObject jsonObjVal = JSON.parseObject(vals);
                    if (jsonObjVal != null && jsonObjVal.containsKey("suc_amt_sum")) {
                        if (jsonObjVal.getBigDecimal("suc_amt_sum") != null) {
                            result2 = jsonObjVal.getBigDecimal("suc_amt_sum");
                            total = total.add(result2);
                        }
                    }
                }
                return total.doubleValue();

            } else {

                String keyStr = stringMap.get(types.get(0)).toString();
                if (jsonObj != null && jsonObj.containsKey(keyStr)) {
                    String vals = jsonObj.getString(keyStr);
                    JSONObject jsonObjVal = JSON.parseObject(vals);
                    if (jsonObjVal != null && jsonObjVal.containsKey("suc_amt_sum")) {
                        if (jsonObjVal.getBigDecimal("suc_amt_sum") != null) {
                            return jsonObjVal.getBigDecimal("suc_amt_sum").doubleValue();
                        } else {
                            return 0d;
                        }
                    }
                } else {
                    return 0d;
                }
            }
            return null;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getStringByType 全局方法出现异常", e);
            return null;
        }
    }

    static Double getStringByTypeM1(Object jsonArrayObj, Object key) {
        try {
            if (isNull(jsonArrayObj) || isNull(key)) {
                return null;
            }
            List<String> types = Arrays.asList(key.toString().split(","));
            for (String type : types) {
                // 判断是否在这个范围
                if (!type.equals("DOMESTIC_PAYMENT") && !type.equals("WITHDRAW")) {
                    return null;
                }
            }
            Map<String, String> stringMap = new HashMap();
            stringMap.put("DOMESTIC_PAYMENT", "vals_payment");
            stringMap.put("WITHDRAW", "vals_withdraw");
            String jsonStr = jsonArrayObj.toString();
            if (!(jsonStr.contains("{") && jsonStr.contains("}"))) {
                return null;
            }

            JSONObject jsonObj = JSON.parseObject(jsonStr);
            if (types.size() > 1) {
                String key1 = stringMap.get(types.get(0)).toString();
                String key2 = stringMap.get(types.get(1)).toString();
                BigDecimal total = new BigDecimal(0);
                BigDecimal result1 = new BigDecimal(0);
                BigDecimal result2 = new BigDecimal(0);
                if (jsonObj != null && jsonObj.containsKey(key1)) {
                    String vals = jsonObj.getString(key1);
                    JSONObject jsonObjVal = JSON.parseObject(vals);
                    if (jsonObjVal != null && jsonObjVal.containsKey("suc_idname_cnt")) {
                        if (jsonObjVal.getBigDecimal("suc_idname_cnt") != null) {
                            result1 = jsonObjVal.getBigDecimal("suc_idname_cnt");
                            total = total.add(result1);
                        }
                    }
                }
                if (jsonObj != null && jsonObj.containsKey(key2)) {
                    String vals = jsonObj.getString(key2);
                    JSONObject jsonObjVal = JSON.parseObject(vals);
                    if (jsonObjVal != null && jsonObjVal.containsKey("suc_idname_cnt")) {
                        if (jsonObjVal.getBigDecimal("suc_idname_cnt") != null) {
                            result2 = jsonObjVal.getBigDecimal("suc_idname_cnt");
                            total = total.add(result2);
                        }
                    }
                }
                return total.doubleValue();

            } else {

                String keyStr = stringMap.get(types.get(0)).toString();
                if (jsonObj != null && jsonObj.containsKey(keyStr)) {
                    String vals = jsonObj.getString(keyStr);
                    JSONObject jsonObjVal = JSON.parseObject(vals);
                    if (jsonObjVal != null && jsonObjVal.containsKey("suc_idname_cnt")) {
                        if (jsonObjVal.getBigDecimal("suc_idname_cnt") != null) {
                            return jsonObjVal.getBigDecimal("suc_idname_cnt").doubleValue();
                        } else {
                            return 0d;
                        }
                    }
                } else {
                    return 0d;
                }
            }
            return null;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getStringByTypeM1 全局方法出现异常", e);
            return null;
        }
    }
    static boolean operCond (Object obj,String x,Object obj2){
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            LoggerUtil.getLogger().debug("x == {}", x);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            Set<String> set = new HashSet<String>();
            set.add(">");
            set.add("<");
            set.add(">=");
            set.add("<=");
            set.add("==");
            set.add("!=");
            set.add("包含");
            set.add("不包含");
            if(obj != null&&obj2 != null&&set.contains(x)){
                if(obj instanceof String|| obj2 instanceof String ){
                    String s1 = obj.toString();
                    String s2 = obj2.toString();
                    if(s1.equals(s2)&&"==".equals(x)){
                        return true;
                    }
                    if(!s1.equals(s2)&&"!=".equals(x)){
                        return true;
                    }
                    if(!"".equals(s1)&&s1.contains(s2)&&"包含".equals(x)){
                        return true;
                    }
                    if(!"".equals(s1)&&!s1.contains(s2)&&"不包含".equals(x)){
                        return true;
                    }if(!("包含".equals(x)||"不包含".equals(x)||"==".equals(x)||"!=".equals(x))){
                        BigDecimal leftDecimal = new BigDecimal(obj.toString().trim());
                        BigDecimal rightDecimal = new BigDecimal(obj2.toString().trim());
                        int a = leftDecimal.compareTo(rightDecimal);
                        if(">".equals(x) && a>0){
                            return true;
                        }
                        if("<".equals(x) && a<0){
                            return true;
                        }
                        if(">=".equals(x) && a>=0){
                            return true;
                        }
                        if("<=".equals(x) && a<=0){
                            return true;
                        }
                    }
                    return false;
                }

                BigDecimal leftDecimal = new BigDecimal(obj.toString().trim());
                BigDecimal rightDecimal = new BigDecimal(obj2.toString().trim());
                int a = leftDecimal.compareTo(rightDecimal);
                if(">".equals(x) && a>0){
                    return true;
                }
                if("<".equals(x) && a<0){
                    return true;
                }
                if(">=".equals(x) && a>=0){
                    return true;
                }
                if("<=".equals(x) && a<=0){
                    return true;
                }
                if("==".equals(x) && a==0){
                    return true;
                }
                if("!=".equals(x) && a!=0){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
    }
    static double divisionByDecimal (Object fenziObj, Object fenmuObj){
        try {
            LoggerUtil.getLogger().debug("fenziObj == {}", fenziObj);
            LoggerUtil.getLogger().debug("fenmuObj == {}", fenmuObj);
            //两个数字相除
            if(fenziObj==null || fenmuObj==null)
                return -1;
            BigDecimal fenzi = new BigDecimal(fenziObj.toString());
            BigDecimal fenmu = new BigDecimal(fenmuObj.toString());
            if(fenmu.compareTo(BigDecimal.ZERO)==0)
                return -1;
            BigDecimal result = fenzi.multiply(new BigDecimal(100)).divide(fenmu,2,BigDecimal.ROUND_HALF_UP);
            return result.doubleValue();
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return -1;
        }
    }
}
