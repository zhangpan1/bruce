package com.zhang.bruce.util;

import com.tcredit.streaming.core.utils.LoggerUtil;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static com.zhang.bruce.rule.FunctionTest.*;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/4/20 6:34 下午
 */
public class BurTe {
    public static void main(String[] args) {
        String goodInfo = "{\"orderSource\":\"NONORDER\",\"secondProductCode\":\"DEBIT\",\"posEntryModeCode\":\"021\",\"latitude\":\"+32.029829\",\"marketingProductCode\":\"BZSHSFK\",\"orderOrigin\":\"POS\",\"exemption\":\"N\",\"terminalId\":\"16000013\",\"scene\":\"OFFLINE\",\"serialNo\":\"00004304PB0H22CS20192\",\"primaryProductCode\":\"POS\",\"terminalAddressInfo\":{},\"userIp\":\"10.149.249.22\",\"userUa\":\"04\",\"goodsName\":\"商**\",\"longitude\":\"118.738276\"}";
        System.out.println( forLoop3(getMapValue(goodInfo,"agentNo"),"不包含","02"));
    }

    static boolean forLoop3(Object a, Object b,Object c) {
        try {
            LoggerUtil.getLogger().debug("a == {}", a);
            LoggerUtil.getLogger().debug("b == {}", b);
            LoggerUtil.getLogger().debug("c == {}", c);
            //a----游戏ID
            //b----逻辑运算符
            //c----被包含的值
            if (a == null || b == null || c==null) {
                return false;
            }
            String bs = (String) b;
            String cs = (String) c;
            String[] arr = null;
            if (cs.contains(",")) {
                arr = cs.split(",");
            } else if (cs.contains(";")) {
                arr = cs.split(";");
            } else {
                arr = cs.split(",");
            }
            int count = 0;
            int length = arr.length;
            for (String temp: arr) {
                if("包含".equals(bs)){
                    if(operCond(a,bs,temp)){
                        return true;
                    }
                }else if("不包含".equals(bs)){
                    if(operCond(a,bs,temp)){
                        count++;
                    }
                }else {
                    return false;
                }
            }
            if("不包含".equals(bs)){
                if(count == length){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
    }

    static boolean operConds (Object obj,String x,Object obj2){
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
            if(obj != null&&obj2 != null&&!"null".equals(obj)&&!"null".equals(obj2)&&set.contains(x)){
                if(obj instanceof String|| obj2 instanceof String ){
                    String s1 = obj.toString().trim();
                    String s2 = obj2.toString().trim();
                    if(s1.equals(s2)&&"==".equals(x)){
                        return true;
                    }
                    if(!s1.equals(s2)&&"!=".equals(x)){
                        return true;
                    }
                    //修复空字符串在contains判断返回true
                    if ("包含".equals(x) && "".equals(s2) && !"".equals(s1)){
                        return false;
                    }

                    String[] s3 = null;
                    if(s2 != null){
                        s3 = s2.split(",");
                    }
                    for(int i = 0;i<s3.length;i++){

                        if(!"".equals(s1)&&s1.contains(s3[i])&&"包含".equals(x)){
                            return true;
                        }else if(!"".equals(s1)&&!s1.contains(s3[i])&&"不包含".equals(x)){
                            return true;
                        }
                    }
                    if("包含".equals(x)||"不包含".equals(x)){
                        return false;
                    }
                    if(!(isNumeric(obj)&&isNumeric(obj2))){
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

                    return false;
                }
                if(!(isNumeric(obj)&&isNumeric(obj2))){
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

            LoggerUtil.getLogger().error("全局方法出现异常!obj:"+obj+", x:"+x+", obj2:"+obj2, e);
            return false;
        }
    }

    static String getMapValue (Object obj1, Object obj2){
        try {
            LoggerUtil.getLogger().debug("obj1 == {}", obj1);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            if(obj1 == null || obj2== null){
                return null;
            }
            String goodsInfo = obj1.toString();
            String key = obj2.toString();
            Map<String,String> map = transGoodsIfToMap(goodsInfo);
            if(map.get(key) != null){
                return map.get(key).toString();
            }
            return null;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }
}
