package com.zhang.bruce.rule.function;

import com.tcredit.streaming.core.utils.LoggerUtil;

import java.math.BigDecimal;

import static com.zhang.bruce.rule.FunctionTest.isNull;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/8/23 8:47 下午
 */
public class Str11 {
    public static void main(String[] args) {
//        Map<String,String> requestMap = new HashMap();
//        requestMap.put("code","200");
//        Map<String,String> date = new HashMap();
//        date.put("mec_no","10000000060");
//        date.put("out_trade_no","5159709303200130");
//        date.put("complaint_reason","赌博");
//        requestMap.put("data",JSONObject.toJSONString(date));
//        requestMap.put("message","请求成功");
//        String requestJson = JSONObject.toJSONString(requestMap);
//        System.out.println(requestJson);
//        Map<String,String> requestMap = new HashMap();
//        requestMap.put("mec_no","10000000060");
//        requestMap.put("out_trade_no","5159709303200130");
//        requestMap.put("complaint_detail","查询不明扣费，退款致电用户，告知收款商家，表示自己没有借款是有个朋友在好分期借款了，商户经常打电话给用户找他朋友，并且现在已经造成实际扣费，已提示用户，如是朋友借款不会从用户银行卡扣费，建议联系商家查询清楚，用户表示不用处理了，就20多块钱，自己会冻结银行卡的，提示用户，如确认是信息泄露建议报警处理，用户认可 已邮件商户报备");
//        String requestJson = JSONObject.toJSONString(requestMap);
//        System.out.println(requestJson);

        System.out.println(divisionByDecimal(subtractByDecimal(1,2),2));

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

    static double subtractByDecimal(Object obj1, Object obj2){
        try {
            LoggerUtil.getLogger().debug("obj1 == {}", obj1);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            //两个数字相除
            if(isNull(obj1) || isNull(obj2))
                return 0;
            BigDecimal fenzi = new BigDecimal(obj1.toString());
            BigDecimal fenmu = new BigDecimal(obj2.toString());
            BigDecimal result = fenzi.subtract(fenmu);
            return result.doubleValue();
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常 subtractByDecimal", e);
            return 0;
        }
    }

    static Object getCityFromArea(Object obj1){
        try {
            LoggerUtil.getLogger().debug("obj1 == {}", obj1);
            if(obj1!=null){
                String str = obj1.toString();
                String[] split = str.split(";");
                if (split.length > 2) {
                    return split[2];
                }
            }
            return "";
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常 getCityFromArea", e);
            return "";
        }
    }


}
