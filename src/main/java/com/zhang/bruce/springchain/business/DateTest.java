package com.zhang.bruce.springchain.business;

import com.alibaba.fastjson.JSON;
import com.zhang.bruce.risk.xml.DateUtils;

import java.util.Date;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/24 11:58 上午
 */
public class DateTest {

    public static void main(String[] args) {
        WelletMemberLevelDataDto welletMemberLevelDataDto = new WelletMemberLevelDataDto();
        welletMemberLevelDataDto.setApplyNo("测试");
        welletMemberLevelDataDto.setMemberNo("10085632");
        welletMemberLevelDataDto.setMerchantNo("12347123311");
        welletMemberLevelDataDto.setCertficateType("身份证");
        welletMemberLevelDataDto.setCertficateNo("522636199632147682");
        welletMemberLevelDataDto.setMobile("16355369855");
        welletMemberLevelDataDto.setMemberName("张三李四");
        welletMemberLevelDataDto.setApplyLevel("高等级");
        welletMemberLevelDataDto.setApplyTime(DateUtils.getAfBeDayDate(new Date(),-1));
        welletMemberLevelDataDto.setPassTime(DateUtils.getAfBeDayDate(new Date(),-1));

        System.out.println(JSON.toJSONString(welletMemberLevelDataDto));
    }
}
