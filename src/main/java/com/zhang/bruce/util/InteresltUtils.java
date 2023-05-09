package com.zhang.bruce.util;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.google.common.collect.Maps;
import org.apache.commons.compress.utils.Lists;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/4/19 6:21 下午
 */
public class InteresltUtils {
    private static final Logger LOGGER = LogManager.getLogger(InteresltUtils.class);
    // AuditResult [score=0.0, verifyPolicy=null, notifyPolicy=null, uuid=9b2a7eef-0ef7-4bfe-8b8d-b1603571ecc6, risks=null, items=null, customization=null,ruleNameList=[],effectRisk=null,verifyPolicyList=null]

    /**
     * 解析规则结果
     *
     * @return
     */
    public static String analysisRuleResult(String bsResult) {
        if (StringUtils.isNotEmpty(bsResult) && bsResult.contains("effectRisk")) {
            //截取_之后字符串
            String str1 = bsResult.substring(0, bsResult.indexOf(",effectRisk="));
            if (StringUtils.isNotEmpty(str1)) {
                // 截取出effectRisl
                String str2 = bsResult.substring(str1.length() + 1, bsResult.length());
                if (StringUtils.isNotEmpty(str2)) {
                    //截取_之前字符串
                    String effectRisk = str2.substring(0, str2.indexOf(",verifyPolicyList="));
                    if (StringUtils.isNotEmpty(effectRisk) && effectRisk.contains("ruleName=")) {
                        //effectRisk=Risk [ruleName=13570 : wallet_rule_0033-2 : 国航钱包高频提现-2, rulePackageName=rule1052,
                        // 截取Risk [ 之后和ruleName之前的数据
                        try {
                            String var1 = effectRisk.substring(0, effectRisk.indexOf(", rulePackageName="));
                            String var2 = var1.substring(0, var1.indexOf("ruleName="));
                            String var3 = var1.substring(var2.length(), var1.length());
                            System.out.println("解析结果为+" + var3);
                            String[] arrs = var3.split(":");
                            String riskCode = arrs[1];
                            String riskName = arrs[2];
                            StringBuilder resultBuild = new StringBuilder();
                            resultBuild.append(riskCode).append(":").append(riskName);
                            return resultBuild.toString();
                        } catch (Exception e) {
                            System.out.println("报错了");
                        }
                        return "";
                    } else {
                        return "";
                    }
                } else {
                    return "";
                }
            } else {
                return "";
            }
        } else {
            return "";
        }
    }

    /**
     * 解析黑名单结果
     *
     * @param black
     */
    public static Map<String,String> analysisBlackResult(String black) {
        if (StringUtils.isNotEmpty(black) && black.contains("isStop=true")) {
            Map<String,String> result = Maps.newHashMap();
            try {
                // 拿到code
                String var1 = black.substring(0, black.indexOf(",code="));
                String var2 = black.substring(var1.length(), black.indexOf(",value="));

                // 拿到value
                String code = var2.replace(",code=", "");
                System.out.println(code);
                String resultCode = TradeBlackRiskTagEnum.getDescByCode(code);
                result.put("code",resultCode);
                // 拿到value值
                String var3 = black.substring(0, black.indexOf(",value="));
                String var4 = black.substring(var3.length(), black.indexOf(",ecode="));
                String value = var4.replace(",value=", "");
                System.out.println(value);
                String[] arrs = value.split(":");
                // 去掉前缀，拿到类型
                String type = arrs[0].replace("black_trade_", "");

                // 进行解密
                String resultValue = arrs[1];
                result.put(type,arrs[1]);

                return result;
            } catch (Exception e) {
                System.out.println("错了");
            }
            return null;
        } else {
            return null;
        }
    }

    /**
     * 解析限额结果
     *
     * @param limit
     */
    public static Map<String,String> analysisTradeLimitResult(String limit) {
        if (StringUtils.isNotEmpty(limit) && limit.contains("isStop=true")) {
            Map<String,String> result = Maps.newHashMap();
            try {
                String var1 = limit.substring(0, limit.indexOf(", supportCode="));
                String var2 = limit.substring(var1.length(), limit.indexOf(", rcd="));
                // 拿到supportCode
                String supportCode = var2.replace(", supportCode=", "");
                result.put("supportCode",supportCode);
                System.out.println("supportCode" + supportCode);

                String var3 = limit.substring(0, limit.indexOf(", rcd="));
                String var4 = limit.substring(var3.length(), limit.indexOf(", rcode="));
                // 拿到模版编码
                String rcd = var4.replace(", rcd=", "");
                System.out.println("rcd" + rcd);
                result.put("rcd",rcd);

                String var5 = limit.substring(0, limit.indexOf(", rcode="));
                String var6 = limit.substring(var5.length(), limit.indexOf(", rdate="));
                // 拿到rcode
                String rcode = var6.replace(", rcode=", "");
                System.out.println("rcode" + rcode);
                result.put("rcode",rcode);

                // 拿到rData
                String var7 = limit.substring(0, limit.indexOf(", rdate="));
                String var8 = limit.substring(var7.length(), limit.indexOf(", des="));

                String rData = var8.replace(", rdate=", "");
                System.out.println("rData" + rData);
                result.put("rData",rData);
                return result;
            } catch (Exception e) {
                System.out.println("错了");
            }
            return null;
        } else {
            return null;
        }
    }

    /**
     * 解析限额白名单
     *
     * @param limit
     */
    public static Map<String,String> analysisWhiteLimitResult(String limit) {
        if (StringUtils.isNotEmpty(limit) && limit.contains("isInWhiteList=true")) {
            try {
                String var1 = limit.substring(0, limit.indexOf(", value="));
                String var2 = limit.substring(var1.length(), limit.indexOf(", ecode="));
                // 拿到value
                String value = var2.replace(", value=", "");
                // 根据；号切分出维度
                List<String> arrList = Arrays.asList(value.split(";"));

                Map<String, String> result = Maps.newHashMap();
                // 取出维度和维度值
                for (String value1 : arrList) {
                    String varTme = value1.replace("white_limit_", "").replace("_limitType:trade", "");
                    // 如果包含下划线，说明是多个维度，继续切分处理
                    if (varTme.contains("_")) {
                        List<String> varTemp = Arrays.asList(varTme.split("_"));
                        List<String> key = Lists.newArrayList();
                        List<String> valueTemp = Lists.newArrayList();
                        for (String temp : varTemp) {
                            String[] varArr = temp.split(":");
                            if (varArr.length > 1) {
                                key.add(varArr[0]);
                                valueTemp.add(varArr[1]);
                            }
                        }
                        String key1 = key.stream().map(String::valueOf).collect(Collectors.joining(","));
                        String vale = valueTemp.stream().map(String::valueOf).collect(Collectors.joining(","));
                        result.put(key1, vale);
                    } else {
                        String[] varArr = varTme.split(":");
                        if (varArr.length > 1) {
                            result.put(varArr[0], varArr[1]);
                        }
                    }
                    System.out.println(result.toString());
                }
                return result;
            } catch (Exception e) {
                System.out.println("错了");
            }
            return null;
        } else {
            return null;
        }
    }



    /**
     * 解析规则白名单
     *
     * @param ruleWhite
     */
    public static String analysisWhiteRuleResult(String ruleWhite) {
        if (StringUtils.isNotEmpty(ruleWhite)) {
            try {

                StringBuilder returnResult = new StringBuilder();
                returnResult.append("规则白名单:");
                // 取出value值
                Map<String, String> params = JSONObject.parseObject(ruleWhite, new TypeReference<Map<String, String>>(){});
                for(Map.Entry<String, String> mm : params.entrySet()){
                    String key = mm.getKey();

                    // 包含破折号，说明是组合维度
                    if (key.contains("-")) {
                        List<String> vars = Arrays.asList(key.split("-"));
                        for (String var1 : vars){
                            String var2 = WhiteNameRuleEnum.getDescByCode(var1);
                            // 替换成中文
                            key = key.replace(var1,var2);
                        }
                    } else {
                        String var3 =  WhiteNameRuleEnum.getDescByCode(key);
                        key = key.replace(key,var3);
                    }
                    // String value = SMUtils.decrypt(mm.getValue());
                    String value = mm.getValue();
                    returnResult.append(key).append(":").append(value).append(",");
                }


                return returnResult.toString();
            } catch (Exception e) {
                System.out.println("错了");
            }
            return "";
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
//        String rule1 = "";
//        String rule2 = "CALL_RISKGOD_NOUSE";
//        String rule3 = "AuditResult [score=0.0, verifyPolicy=null, notifyPolicy=null, uuid=9b2a7eef-0ef7-4bfe-8b8d-b1603571ecc6, risks=null, items=null, customization=null,ruleNameList=[],effectRisk=null,verifyPolicyList=null]";
        String rule4 = "AuditResult [score=210.0, " +
                "verifyPolicy=VerifyPolicy [code=BLOCK, name=阻断, priority=160, succControl=, failControl=], notifyPolicy=NotifyPolicy [code=NO_HANDLE, name=无处置, priority=1], \n" +
                "uuid=78fce8d1-2d14-48ab-abeb-9659ad14ff16, " +
                "risks=null, " +
                "items=null," +
                "customization=null," +
                "ruleNameList=[国航钱包高频提现-2, 国航钱包高频提现不外呼]," +
                "effectRisk=Risk [ruleName=13570 : wallet_rule_0033-2 : 国航钱包高频提现-2, rulePackageName=rule1052, score=210, weight=0, comments=背景：持卡人被骗多张卡交替操作 20220609测试条件 20220613上线, notifyPolicy=NotifyPolicy [code=NO_HANDLE, name=无处置, priority=1], verifyPolicy=VerifyPolicy [code=BLOCK, name=阻断, priority=160, succControl=, failControl=], createTime=Mon Jan 02 15:07:09 CST 2023, ]," +
                "verifyPolicyList=null]";
        String black1 = "isStop=false,level=null,code=null,value=null,ecode=null,edes=null";
        String black2 = "isStop=true,level=1,code=maliciousComplaint,value=black_trade_bankCardNo:DG$1$QG6lIGQucGYwc4d2wTlOTDEH1iJ_ioFVd7CJtr3LdR8,ecode=null,edes=null";
        String black = "";
         System.out.println(analysisBlackResult(black2));
        // System.out.println(analysisRuleResult(rule4));
        String limit1 = "isStop=false, supportCode=0000, rcd=null, rcode=null, rdate=null, des=riskRuleIds:684,360,674, ecode=null, edes=null";
        String limit2 = "isStop=true, supportCode=6105, rcd=202009140037, rcode=MERCHANTNO, rdate=DG$1$wBEIGCSSGXV-8uFDTe1BIg, des=daycount stop,daycount:3,riskRuleIds:360,667, ecode=null, edes=null";

        //System.out.println(analysisTradeLimitResult(limit2));

        // 限额白名单
        String white = "isInWhiteList=true, code=null, value=white_limit_merchantNo:DG$1$ib44FqnWoNFYchyc1TUmLw_limitType:trade;white_limit_merchantNo:DG$1$ib44FqnWoNFYchyc1TUmLw_bankCardNo:DG$1$5rOUFO6qKFChwCz2l80UB0r1y6SJTVoPduXKOjsn4HU_limitType:trade;, ecode=null, edes=null, whiteType=null";
        // analysisWhiteLimitResult(white);
        // 规则白名单
        String ruleWhite = "{\"frms_bank_card_no-frms_phone_no-frms_ip_addr\":\"sdsdsds\",\"frms_mch_id\":\"sdsdsds\",\"frms_phone_no\":\"sdsdsds\",\"frms_ip_addr\":\"sdsdsds\"}";
        //System.out.println(analysisWhiteRuleResult(ruleWhite));
    }
}



