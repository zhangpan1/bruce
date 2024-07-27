package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSON;
import com.zhang.bruce.general.DateUtils;

import java.text.ParseException;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/4/19 10:36 上午
 */
public class TestParam {
    private static final String REPORT_FEE = "GONGYI,GONGJIAO,XIANXIA,XIANSHANG,JIEDAIFENLI,SHUYU,MINBANJIAOYU";

    public static void main(String[] args) throws ParseException {
        String[] reportFeeArray = REPORT_FEE.split(",");
        String startDay = "2024-04-18";
        for (String reportFee : reportFeeArray) {
            // 默认请求一个小时的数据
            QueryComplaintListParamDTO paramDTO = new QueryComplaintListParamDTO();
            paramDTO.setBeginDate(DateUtils.parseDate(startDay, "yyyy-MM-dd"));
            paramDTO.setEndDate(DateUtils.parseDate(startDay, "yyyy-MM-dd"));
            paramDTO.setReportFee(reportFee);

            System.out.println(JSON.toJSONString(paramDTO));

        }
    }
}
