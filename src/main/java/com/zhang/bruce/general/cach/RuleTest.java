package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSON;
import com.tcredit.streaming.core.bean.Risk;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.List;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/11/12 17:30
 * @Description:
 */
public class RuleTest {
    public static void main(String[] args) {
        String jsonString = "[\n" +
                "{\n" +
                "                \"comments\":\"\",\n" +
                "                \"createTime\":1668219603910,\n" +
                "                \"customization\":{\n" +
                "\n" +
                "                },\n" +
                "                \"handleStrategy\":{\n" +
                "                    \"closeOperatorDesc\":\"\",\n" +
                "                    \"handleStrategyBlackbus\":\"\",\n" +
                "                    \"handleStrategyClosepay\":\"\",\n" +
                "                    \"notifyStrategy\":\"\"\n" +
                "                },\n" +
                "                \"indate\":0,\n" +
                "                \"notifiedParty\":{\n" +
                "                    \"clientServerInterfaceMail\":\"\",\n" +
                "                    \"clientServerInterfaceNote\":\"\",\n" +
                "                    \"complianceMail\":\"\",\n" +
                "                    \"complianceNote\":\"\",\n" +
                "                    \"controlledCompanyMail\":\"\",\n" +
                "                    \"controlledCompanyNote\":\"\",\n" +
                "                    \"industryLineMail\":\"\",\n" +
                "                    \"industryLineNote\":\"\",\n" +
                "                    \"noticeType\":\"\",\n" +
                "                    \"salesMail\":\"\",\n" +
                "                    \"salesNote\":\"\",\n" +
                "                    \"salesSupervisorMail\":\"\",\n" +
                "                    \"salesSupervisorNote\":\"\"\n" +
                "                },\n" +
                "                \"ruleName\":\"6899 : MEC_D7_UR_AGENT_011 : 父商户监控（子商户结构-企业类）\",\n" +
                "                \"rulePackageName\":\"rule1049\",\n" +
                "                \"score\":700,\n" +
                "                \"uuid\":\"c3c1335d-2c1d-4881-a771-d30b889ba688\",\n" +
                "                \"weight\":0\n" +
                "            }\n" +
                "]\n" +
                "            \n" +
                "       ";
        List<Risk> riskList = JSON.parseArray(jsonString, Risk.class);
        String ruleCode = getTriggerRules(riskList);
        System.out.println(ruleCode);


    }

    public static   String getTriggerRules(Collection<Risk> risks) {
        StringBuilder triggerRules = new StringBuilder();
        if (!CollectionUtils.isEmpty(risks)) {
            for (Risk risk : risks) {
                triggerRules.append(risk.getRuleName().split(":")[1].trim());
                triggerRules.append(",");
            }
        }
        if (triggerRules.length() > 0) {
            triggerRules.deleteCharAt(triggerRules.length() - 1);
        }
        return triggerRules.toString();
    }
}
