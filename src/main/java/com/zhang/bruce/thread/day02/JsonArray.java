package com.zhang.bruce.thread.day02;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/1 10:45 上午
 */
public class JsonArray {
    public static void main(String[] args) {
        String json = "{\"checkAuditMessage\":\"通过\",\"checkAuditOperator\":\"guiyuan.liao\",\"checkAuditTime\":\"2022-06-29 20:17:28\",\"checkListTime\":\"2022-06-29 20:17:28\",\"createTime\":\"2022-06-29 20:14:23\",\"firstAuditOperator\":\"jiazheng.li\",\"firstAuditTime\":\"2022-06-29 20:16:29\",\"investigationInfo\":\"商户是米花下的盲盒商户，因米花和其合作终止，处置关闭该商户\",\"merchantNo\":\"10087566080\",\"riskAnalysis\":{\"出现集中投诉\":[]},\"riskDeal\":\"止收,止付可结算\",\"riskType\":[\"1402-涉嫌其他犯罪的可疑交易行为\"],\"signType\":\"企业\",\"triggerRules\":\"MEC_D_RE_001\",\"uploadFileList\":[]}";
        AntiLaunderChecklistBean checklistBean = (AntiLaunderChecklistBean) JSONObject.parseObject(json,AntiLaunderChecklistBean.class);
        // System.out.println(checklistBean);
        String  o = JSON.toJSONString(checklistBean);
        System.out.println(o);

        String json1 = "{\"checkAuditOperator\":\"guiyuan.liao\",\"checkAuditTime\":\"2022-06-29 18:50:35\",\"checkListTime\":\"2022-06-29 18:50:35\",\"createTime\":\"2022-06-29 18:50:35\",\"firstAuditOperator\":\"guiyuan.liao\",\"firstAuditTime\":\"2022-06-29 18:50:35\",\"investigationInfo\":\"交易行为异常，未回复核查邮件\",\"merchantNo\":\"10034380884\",\"riskAnalysis\":{},\"riskDeal\":\"止收,止付可结算\",\"riskType\":[\"1402-涉嫌其他犯罪的可疑交易行为\"],\"signType\":\"企业\",\"triggerRules\":\"MEC_D_Unintelligent_001\",\"uploadFileList\":[]}";
        AntiLaunderChecklistBean checklistBean1 = (AntiLaunderChecklistBean) JSONObject.parseObject(json1,AntiLaunderChecklistBean.class);
        // System.out.println(checklistBean);
        String  o1 = JSON.toJSONString(checklistBean1);
        System.out.println(o1);

        String json2 = "{\"checkAuditOperator\":\"jiazheng.li\",\"checkAuditTime\":\"2022-06-29 18:16:29\",\"checkListTime\":\"2022-06-29 18:16:29\",\"createTime\":\"2022-06-29 18:16:30\",\"firstAuditOperator\":\"jiazheng.li\",\"firstAuditTime\":\"2022-06-29 18:16:29\",\"investigationInfo\":\"人力资源公司，商户充值并非自己同主体充值，开通高危产品充值代付，销售未回复核查材料，处置关闭\",\"merchantNo\":\"10088219514\",\"riskAnalysis\":{},\"riskDeal\":\"止收,止付可结算\",\"riskType\":[\"1402-涉嫌其他犯罪的可疑交易行为\"],\"signType\":\"企业\",\"triggerRules\":\"MEC_D_Unintelligent_001\",\"uploadFileList\":[]}\n";
        AntiLaunderChecklistBean checklistBean2 = (AntiLaunderChecklistBean) JSONObject.parseObject(json2,AntiLaunderChecklistBean.class);
        // System.out.println(checklistBean);
        String  o2 = JSON.toJSONString(checklistBean2);
        System.out.println(o2);
    }
}
