//package com.zhang.bruce.risktest.utils;
//
//import com.google.common.base.Joiner;
//import com.google.common.base.Strings;
//import com.google.common.collect.Sets;
//import org.apache.commons.collections.map.CaseInsensitiveMap;
//
//import java.io.IOException;
//import java.io.StringReader;
//import java.util.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
///**
// * Util
// *
// * @author zhuyu_deng (zhuyu.deng@foxmail.com)
// * @date 5/10/16
// */
//public class RiskUtil {
//
//    private static Set<String> ruleFiltered = Sets.newHashSet();
////	private static final Set<String> ruleFiltered = Sets.newHashSet("fastPay-longconnrule039","fastPay-connrule099","fastPay-longconnrule033","fastPay-rule043","fastPay-connrule059","fastPay-connrule079","fastPay-connrule077","fastPay-rule042","fastPay-rule041","fastPay-rule040","fastPay-rule028","fastPay-connrule064","fastPay-connrule062","fastPay-rule030","fastPay-rule029","fastPay-rule026","fastPay-rule022","fastPay-connrule011");
//
//    public static void setRuleFiltered(Set<String> _ruleFiltered) {
//        ruleFiltered = _ruleFiltered;
//    }
//
//    /**
//     * @param info
//     * @return
//     * @throws IOException
//     */
//    @SuppressWarnings("unchecked")
//    public static Map<String, String> getKVfromReqIf(String info) throws IOException {
//
//        if (Strings.isNullOrEmpty(info)) {
//            return new HashMap<String, String>();
//        }
//
//        info = info.substring(info.indexOf("[") + 1, info.length());
//        info = info.replace("]", "");
//        info = info.replaceAll(",", "\n");
//        Properties properties = new Properties();
//        properties.load(new StringReader(info));
//        Map<String, String> map = new CaseInsensitiveMap((Map) properties);
//        map.remove("goodsInfo");
//        return map;
//    }
//
//    public static void main(String[] args) {
////       String info ="productId=NOCARDPAY,production=YJZF,merchantNo=10012934825,requestId=B201703230097537964,sequenceId=47827278216252994,amount=190.00,occurTime=2017-03-24 00:00:08,completeTime=2017-03-24 00:00:33,tradeResult=1,synConsumeTime=,synErrorCode=,rmSequence=4a78e555-4cad-4a8c-8659-2b7e69d33d02, paymentId=101703240000875960, goodsCode=9499, bankCardType=CREDIT, bankId=CCB, useTool=NCCASHIER, userId=501277942187, merchantLevel=, userType=MERCHANT,bindCardId=58468310, authLevel=, merchantBindWebSite=, refer=, bankCardName=庞家超, bankCardNo=6259650889411713, bankAccountNoArea=, idType=IDCARD,idNo=371502199211070312, idnoArea=, bankChannelId=JX_UNIONPAY_KUAIPAY_D_Z001, terminalIdentifyCode=, terminalType=, merchantIp=, merchantIpArea=,userIp=182.35.195.156, userIpArea=, merchantUserIp=, merchantUserIpArea=, userAgent=, serverId=sjsa-ncpay03, sessionId=, mac=, userPhone=15054587866, mobileArea=,firstPay=, useChannel=, virtualTerminalId=YJZF-WAP-USUAL, toolsInfo=null, shopman=, noshopman=, authResult=,subProductId=,goodsname=充值,bizOrder=411703238639895110,industryCode=3101,orderType=SALE,bankSeq=201703240000301252178,bankOrderNo=024375062792,isSendSms=true,smsSendType=YEEPAY,tradeError=0000,tradeMsg=成功,bankError=,bankMsg=成功[0000000],companyName=全民充值,frpCode=JX_UNIONPAY_KUAIPAY_D_Z001";
////    	String info =null;
////    	try {
////			System.out.println(getKVfromReqIf(info));
////			Map<String, String> map = getKVfromReqIf(info);
////			System.out.println("requestid: "+map.get("requestId"));
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//
//        //String goodsInfo = "{\"terminalinfo\":\"{\\\"terminalId\\\":\\\"AgiwV4jS2sgPwl8en7ThjILYp1da-hCQqKdMHZT1zTtz\\\",\\\"terminalType\\\":\\\"OTHER\\\"}\",\"userip\":\"182.35.195.156\"}";
////    	String goodsInfo = "{\"userIp\":\"172.16.0.58\",\"subBizcatName\":\"餐饮/娱乐场所\",\"bizcatName\":\"生活服务/商业服务\",\"tooluserip\":\"172.16.0.58\",\"signName\":\"刘碧\",\"bizcatCode\":\"129\",\"merchantRetCode\":\"0000\",\"industry\":\"新零售行业线—零售\",\"subBizcatCode\":\"129002\"}";
////    	String goodsInfo = "";
////    	try {
////			//System.out.println(getKVfromGoodif(goodsInfo));
////			Map<String, String> map = getNewKVfromGoodif(goodsInfo);
////			//Object str = map.get("BIZ_SYSTEM_CODE");
//////			if(StringUtils.getNotNullStr(String.valueOf(str))){
//////				map.put("TEST", StringUtils.removeOverlap(String.valueOf(str), 50));
//////			}
////			System.out.println("111:"+map);
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//
//        bsAESUtil("	Pwb2UClXs58hBJ7c9DupyIXZaFbUTsbNAblDwoyjTgU=");
//    }
//
//    /**
//     * 得到规则列表
//     *
//     * @param rulecode
//     * @return
//     */
//    public static String getRuleCodeInfo(String rulecode) {
//
//        List<String> list = new ArrayList<String>();
//        if (!Strings.isNullOrEmpty(rulecode)) {
//            Pattern pattern = Pattern.compile("match(.*?)\"\\:");
//            Matcher matcher = pattern.matcher(rulecode);
//            while (matcher.find()) {
//                list.add(matcher.group(1).trim());
//            }
//        }
//
//        Iterator<String> iter = list.iterator();
//        while (iter.hasNext()) {
//            String next = iter.next();
//            if (ruleFiltered.contains(next)) {//去掉80分以下的规则
//                iter.remove();
//            }
//        }
//
//        String ruleCodeJoined = Joiner.on(";").join(list);
//        if (Strings.isNullOrEmpty(ruleCodeJoined)) {
//            return null;
//        }
//        return ruleCodeJoined.replace(" ", "");
//    }
//
//    /**
//     * @param goodsInfo
//     * @return
//     * @throws IOException
//     */
//    @SuppressWarnings("unchecked")
//    public static Map<String, String> getKVfromGoodif(String goodsInfo) throws IOException {
//
//        if (Strings.isNullOrEmpty(goodsInfo)) {
//            return new TreeMap<String, String>();
//        }
//String
//        Map<String, String> map = new CaseInsensitiveMap((Map<String, String>) JSON.parse(goodsInfo));
//        return map;
//    }
//
//    @SuppressWarnings("unchecked")
//    public static Map<String, String> getNewKVfromReqIf(String info) throws IOException {
//
//        if (Strings.isNullOrEmpty(info)) {
//            return new HashMap<String, String>();
//        }
//
//        info = info.replaceAll(",", "\n");
//        Properties properties = new Properties();
//        properties.load(new StringReader(info));
//        Map<String, String> map = new CaseInsensitiveMap((Map) properties);
//        map.remove("goodsInfo");
//        return map;
//    }
//
//    @SuppressWarnings("unchecked")
//    public static Map<String, String> getNewKVfromGoodif(String goodsInfo) throws IOException {
//
//        if (Strings.isNullOrEmpty(goodsInfo)) {
//            return new TreeMap<String, String>();
//        }
//        try {
//            Map<String, String> map = (Map<String, String>) JSON.parse(goodsInfo);
//            return map;
//        } catch (Exception e) {
//            return new TreeMap<String, String>();
//        }
////        return map;
//    }
//
//    public static void bsAESUtil(String data) {
//        String bsData = EncodesUtils.decrypt(data, "s7UEhOqYecDL9oIUCH2+Rw==");
//
//        System.out.println(bsData);
//    }
//
//}
