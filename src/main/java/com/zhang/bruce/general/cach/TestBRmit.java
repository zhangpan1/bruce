package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tcredit.streaming.core.model.RemitDSPayOrder;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static com.zhang.bruce.general.cach.TestRemitEngine.*;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/3/15 3:56 下午
 */
public class TestBRmit {
    public static void main(String[] args) {

        RemitDSPayOrder obj = new RemitDSPayOrder();
//        List<RemitDetail> remitDetail = Lists.newArrayList();
//        RemitDetail remitDetail1 = new RemitDetail();
//        remitDetail1.setBankCardNo("370002****0921");
//        remitDetail1.setBankCardName("嘻嘻银行");
//        remitDetail1.setRemitAmount("1834.20");
//        remitDetail.add(remitDetail1);
//        Map<String,String> prodMsg = new HashMap<>();
//        prodMsg.put("dAmount","0");
//        prodMsg.put("remitWay","BANK");
//        prodMsg.put("remitDetail",JSONObject.toJSONString(remitDetail));
//        prodMsg.put("accountAmount","0");
        String prodMsg = "\"prodMsg\":\"production=MERCHANTSETTLE,occurTime=2023-03-15 17:21:26,userPhone=DG$1$S3fcu2mvhEgn49zAD0OBWQ,remitDetail=[{\"bankCardNo\":\"11850000001056245\"、\"bankCardName\":\"北京科技有限公司\"、\"remitAmount\":\"21336.54\"}]";
        obj.setProdMsg(decodeReqinfo(reqinfoParse(prodMsg)));

        Map<String,String> map = backUpToMap(obj.getProdMsg());
         System.out.println(map);

        long amt = 0L;
        String remitDetails = getBackUpValue(obj.getProdMsg(),"remitDetail");
        if (remitDetails != null){
             remitDetails = remitDetails.replaceAll("、",",");
            JSONArray remitDetailArr = JSONObject.parseArray(remitDetails);
            for (Object o : remitDetailArr) {
                String amtStr = getMapValue(o.toString(),"remitAmount");
                if(StringUtils.isNotBlank(amtStr)){
                    BigDecimal tempBD = new BigDecimal(amtStr);
                    Long tempTmL = tempBD.multiply(new BigDecimal(1000)).longValue();
                    amt += tempTmL;
                }
            }
        }
        System.out.println(amt);
    }
    public static String decodeReqinfo(Map<String,String> params){
        Map<String,String> reqinfoMap = params;
        if(reqinfoMap == null || reqinfoMap.size()==0){
            return "";
        }
        StringBuilder reqinfoBuilder = new StringBuilder();
        Set<String> keySet = params.keySet();
        Iterator<String> keyIter = keySet.iterator();
        while(keyIter.hasNext()){
            String key = keyIter.next();
            Object value = params.get(key);
            reqinfoBuilder.append(key+"="+value+",");
        }
        String result = reqinfoBuilder.toString();
        if(result.length()>0){
            result = result.substring(0, result.length()-1);
        }
        return result;
    }
    public static Map<String, String> reqinfoParse(String reqInfo) {
        Map<String, String> result = new HashMap();
        if (com.yeepay.doorgod.utils.string.StringUtils.isBlank(reqInfo)) {
            return result;
        } else {
            reqInfo = filterJsonFromReqInfo(reqInfo, ",goodsInfo=");
            reqInfo = filterJsonFromReqInfo(reqInfo, ",toolsInfo=");
            String[] reqInfoArray = reqInfo.split(",");
            if (reqInfoArray != null && reqInfoArray.length > 0) {
                String[] var3 = reqInfoArray;
                int var4 = reqInfoArray.length;

                for(int var5 = 0; var5 < var4; ++var5) {
                    String req = var3[var5];
                    String[] reqFactorArray = new String[2];
                    String str1 = req.substring(0, req.indexOf("="));
                    String str2 = req.substring(req.indexOf("=") + 1, req.length());
                    reqFactorArray[0] = str1;
                    reqFactorArray[1] = str2;
                    if (reqFactorArray != null && reqFactorArray.length > 0) {
                        if (reqFactorArray.length == 2) {
                            result.put(reqFactorArray[0].trim(), reqFactorArray[1].trim());
                        } else {
                            result.put(reqFactorArray[0].trim(), "");
                        }
                    }
                }
            }

            return result;
        }
    }

}
