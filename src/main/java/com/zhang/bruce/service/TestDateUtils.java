package com.zhang.bruce.service;

import com.tcredit.streaming.core.utils.LoggerUtil;
import com.zhang.bruce.general.DateUtils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static com.zhang.bruce.rule.FunctionTest.isNumeric;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/12/21 10:40 上午
 */
public class TestDateUtils {
    public static void main(String[] args) {
        Date startOfDay = DateUtils.getStartOfDay(new Date(),-1);
        Date date = DateUtils.getStartOfDay(new Date());
        System.out.println(operCond("343","不包含",""));
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
            if(obj != null&&obj2 != null&&!"null".equals(obj)&&!"null".equals(obj2)&&set.contains(x)){
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
                    }
                    if(!("包含".equals(x)||"不包含".equals(x)||"==".equals(x)||"!=".equals(x))){
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
}
