package com.zhang.bruce.general.cach;

import java.time.LocalDate;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/8/24 4:55 下午
 */
public class ShardTest {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022, 1, 1); // 开始日期

        LocalDate currentDate = LocalDate.now(); // 当前日期


        int daysBetween = (int) startDate.until(currentDate).getDays(); // 计算开始日期到当前日期的天数差


        int tableIndex = (daysBetween / 10) % 72; // 计算8月24日所在的表索引


        System.out.println("8月24日所在的表索引：" + tableIndex);
    }
}
