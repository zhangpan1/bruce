package com.zhang.bruce.rule;

import com.tcredit.streaming.core.utils.LoggerUtil;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/14 5:55 下午
 */
public class SumFunction {
    @Test
    public void testSum() {
        System.out.println(getSumScore("1.11","0.02","0.03","0.04","0.05","0.06","960").toString());
    }

    public static Double getSumScore(Object val1, Object val2, Object val3, Object val4, Object val5, Object val6, Object obj) {
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            if (obj != null && !"null".equals(obj)  && !"NaN".equals(obj)) {
                String[] scores = obj.toString().split(",");
                if (scores.length <= 0) {
                    return 0.0;
                }
                //950，960，970，980，990，1000
                BigDecimal result = new BigDecimal(0.00);
                for (String score : scores) {
                    if (score.equals("950") && val1 != null && !"null".equals(val1) && !"NaN".equals(val1)) {
                        BigDecimal val1Decimal = new BigDecimal(val1.toString().trim());
                        result.add(val1Decimal);
                    }
                    if (score.equals("960") && val2 != null && !"null".equals(val2) && !"NaN".equals(val2)) {
                        BigDecimal val2Decimal = new BigDecimal(val2.toString().trim());
                        result.add(val2Decimal);
                    }
                    if (score.equals("970") && val3 != null && !"null".equals(val3) && !"NaN".equals(val3)) {
                        BigDecimal val3Decimal = new BigDecimal(val3.toString().trim());
                        result.add(val3Decimal);
                    }
                    if (score.equals("980") && val4 != null && !"null".equals(val4) && !"NaN".equals(val4)) {
                        BigDecimal val4Decimal = new BigDecimal(val4.toString().trim());
                        result.add(val4Decimal);
                    }
                    if (score.equals("990") && val5 != null && !"null".equals(val5) && !"NaN".equals(val5)) {
                        BigDecimal val5Decimal = new BigDecimal(val5.toString().trim());
                        result.add(val5Decimal);
                    }
                    if (score.equals("1000") && val6 != null && !"null".equals(val6) && !"NaN".equals(val6)) {
                        BigDecimal val6Decimal = new BigDecimal(val6.toString().trim());
                        result.add(val6Decimal);
                    }
                }

                return result.doubleValue();
            }
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0.0;
        }
        return 0.0;
    }
}
