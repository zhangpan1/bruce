package com.zhang.bruce.risktest.business;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/3/6 3:39 下午
 */
public class CheckListGenela {
    public static void main(String[] args) {
        System.out.println(buildCheckId("Mer","Par","s"));
    }
    /**
     *
     * @param type -- 生成类型，批次号还是序列号
     * @param keyPrefix
     * @param checkType
     * @return
     */
    public static String buildCheckId(String keyPrefix, String checkType, String type){
        if (StringUtils.isBlank(keyPrefix)) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        //当天的日期字符串
        String dateStr = sdf.format(new Date());
        String redisKey = keyPrefix + dateStr;
        Long checkId = 111L;
        int length = checkId.toString().length();
        //前面填充00
        String addStr = "";
        int total = 0;
        if (type.equals("event")) {
            total = 2;
        } else {
            // 总共4位
            total = 4;
        }
        for (int i = 0;i < total-length;i++){
            addStr += 0;
        }
        checkType = checkType == null ? "" : checkType;
        return checkType + dateStr + addStr + checkId;
    }
}
