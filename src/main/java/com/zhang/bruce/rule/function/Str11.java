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
        System.out.println(divisionByDecimal(300,150));

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


}
