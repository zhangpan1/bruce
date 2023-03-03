package com.zhang.bruce.base.bru1;

import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/1/30 4:16 下午
 */
public class Bru1Test {
    public static void main(String[] args) {
        List<Integer> reports = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        boolean lockAll = true;
        Integer reportNo = 0;
        List<Integer> locked = Lists.newArrayList();
        for (Integer report : reports) {
            boolean lock = (report%3 != 0) ;
            if (lock) {
                locked.add(report);
            } else {
                lockAll = false;
                reportNo =  report;
                // 跳出循环
                break;
            }
        }
        if (!lockAll) {
            // 释放已经加锁的报告
            if (CollectionUtils.isNotEmpty(locked)) {
                try {
                    for (Integer lock : locked){
                        System.out.println("释放锁" + lock);
                    }
                } catch (Exception e) {
                }
            }
            System.out.println("已经加锁的报告单为"+ reportNo);
        }
    }
}
