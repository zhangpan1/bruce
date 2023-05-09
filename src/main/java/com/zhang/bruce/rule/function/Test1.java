package com.zhang.bruce.rule.function;

import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/3/22 4:48 下午
 */
public class Test1 {
    public static void main(String[] args) {
        // 查询监控报告
        Integer reportStatus = 4;
        LargeReportStatusEnum reportStatusEnum = LargeReportStatusEnum.of(reportStatus);
        // 下一状态
        List<LargeReportStatusEnum> nextStatus = LargeReportStatusEnum.getNextStatus(reportStatusEnum);
        if (CollectionUtils.isEmpty(nextStatus)) {

        }
        LargeReportStatusEnum newReportStatus = nextStatus.get(0);
        System.out.println(newReportStatus.getValue());
    }
}
