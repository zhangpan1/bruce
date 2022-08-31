package com.zhang.bruce.java8.mituan;

import com.yeepay.g3.utils.common.CollectionUtils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/8/4 11:45 上午
 */
public class java8Sort {
    public static void main(String[] args) {
//        // 取出最新的初审记录
//        // 升序 coDoctorVOList.sort(Comparator.comparing(GptReceiptChecklistAuditLog::getGmtModified));
//        // 降序 coDoctorVOList.sort((m1, m2) -> m2.getGmtModified().compareTo(m1.getGmtModified()));
//        List<GptReceiptChecklistAuditLog> recodeFirst = auditLogs.stream()
//                .filter((GptReceiptChecklistAuditLog record) -> record.getOperationType().equals(1))
//                .sorted(Comparator.comparing(GptReceiptChecklistAuditLog::getGmtModified)).collect(Collectors.toList());
//        List<GptReceiptChecklistAuditLog> recodeDouble = auditLogs.stream()
//                .filter((GptReceiptChecklistAuditLog record) -> record.getOperationType().equals(2))
//                .sorted(Comparator.comparing(GptReceiptChecklistAuditLog::getGmtModified)).collect(Collectors.toList());
//        if (CollectionUtils.isNotEmpty(recodeFirst)) {
//            firstAudit = recodeFirst.get(0);
//        }
//        if (CollectionUtils.isNotEmpty(recodeDouble)) {
//            doubleAudit = recodeDouble.get(0);
//        }

    }
}
