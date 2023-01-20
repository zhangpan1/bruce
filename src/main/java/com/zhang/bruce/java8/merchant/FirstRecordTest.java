package com.zhang.bruce.java8.merchant;

import com.google.common.collect.Lists;
import com.yeepay.g3.utils.common.CollectionUtils;
import com.yeepay.g3.utils.common.DateUtils;
import org.apache.commons.lang.StringUtils;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/12/14 11:16
 * @Description:
 */
public class FirstRecordTest {
    public static void main(String[] args) {
        List<MerchantChecklistUpload> list = buildMerchant();
        if (CollectionUtils.isNotEmpty(list)) {
            // 按照时间过滤出有附件的数据，取最新的
            MerchantChecklistUpload firstRecord = list.stream()
                    .sorted(Comparator.comparing(MerchantChecklistUpload::getUpdateDate))
                    .filter(uploadRecord -> StringUtils.isNotEmpty(uploadRecord.getUploadName())).findFirst().orElse(null);
            if (firstRecord != null) {
                System.out.println(firstRecord.getUploadName());
            }
        }

    }

    private static List<MerchantChecklistUpload> buildMerchant() {
        List<MerchantChecklistUpload> list = Lists.newArrayList();
        MerchantChecklistUpload m1 = new MerchantChecklistUpload();
        MerchantChecklistUpload m2 = new MerchantChecklistUpload();
        MerchantChecklistUpload m3 = new MerchantChecklistUpload();
        MerchantChecklistUpload m4 = new MerchantChecklistUpload();
        m1.setUploadName("你好-m1");
        m1.setUpdateDate(DateUtils.addDay(new Date(),-1));
        m2.setUploadName("你好-m2");
        m2.setUpdateDate(DateUtils.addDay(new Date(),-2));
        m3.setUploadName("你好-m3");
        m3.setUpdateDate(DateUtils.addDay(new Date(),-3));
        m4.setUploadName("");
        m4.setUpdateDate(DateUtils.addDay(new Date(),4));
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        return list;
    }
}
