package com.zhang.bruce.thread.day03;

import com.alibaba.fastjson.JSON;
import org.apache.commons.compress.utils.Lists;

import java.util.HashSet;
import java.util.Set;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/12/25 18:59
 * @Description:
 */
public class TestEntity {
    public static void main(String[] args) {
        AntiLaunderChecklistBean bean = new AntiLaunderChecklistBean();
        bean.setCheckAuditOperator("wen.li-1");
        bean.setCheckAuditTime("2022-05-05 17:40:46");
        bean.setCheckListTime("2022-05-05 17:40:46");
        bean.setFirstAuditOperator("wen.li-1");
        bean.setFirstAuditTime("2022-04-26 17:40:47");
        bean.setInvestigationInfo("测试，没有上传附件");
        bean.setMerchantNo("10086218164");
        bean.setRiskAnalysis("自动生成疑点分析可疑报告");
        bean.setRiskDeal("无需处理");
        Set<String> set = new HashSet<>();
        set.add("0704-涉嫌信用卡诈骗的可疑交易行为");
        set.add("1102-涉嫌非法经营（例如地下钱庄、非法买卖外汇、POS机套现及其他套现等）的可疑交易行为");
        bean.setRiskType(set);
        bean.setTriggerRules("MEC_D_Unintelligent_002");
        bean.setOccCustomerAction("自动生成疑点分析，推送可疑");
        bean.setUploadFileList(Lists.newArrayList());
        bean.setCreateTime("2022-04-26 17:40:47");
        System.out.println(JSON.toJSONString(bean));
    }
}
