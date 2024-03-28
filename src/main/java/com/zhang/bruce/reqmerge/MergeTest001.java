package com.zhang.bruce.reqmerge;

import com.alibaba.fastjson.JSONObject;
import com.yeepay.doorgod.utils.date.DateUtils;
import com.yeepay.doorgod.utils.log.LogUtil;
import com.yeepay.g3.utils.common.BeanUtils;
import com.yeepay.riskcontrol.facade.RcAsyncReqDto;
import com.yeepay.riskcontrol.facade.v2.RcAsyncEfPayReqDto;
import com.yeepay.riskcontrol.facade.v2.RcSyncEfPayReqDto;
import org.slf4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/11/2 10:30 上午
 */
public class MergeTest001 {
    private static final Logger logger = LogUtil.getLogger(MergeTest001.class);
    public static String getUUID(boolean isFilter) {
        if (isFilter) {
            return UUID.randomUUID().toString().replaceAll("-", "");
        }
        return UUID.randomUUID().toString();
    }
    public static void main(String[] args) {
        RcSyncEfPayReqDto param = new RcSyncEfPayReqDto();
        param.setAmount("0.9");
        param.setProductId("FE");
        param.setProduction("DS");
        param.setPaymentId("123");
        param.setUserId("null");
        param.setUserIp("121.199.51.196");//240e:83:9009:5::2
//		param.setUserId("200" + i);DS
//      param.setMerchantNo("10014012676");

        //10086171640,10086249365,10086269930
        param.setMerchantNo("10086269931");
//      param.setGoodsCode("7993");
//      param.setBankCardType("DEBIT");
//      param.setBankCardNo("659001197511031296");
//      param.setBankId("123");
        param.setSequenceId(getUUID(true));
        param.setRequestId(getUUID(true));
        param.setOccurTime(new Date());
        param.setBankChannelId("123123");
        param.setBizOrder("lk23333");
        param.setEventType("1");
        param.setModuleId("111111");
        param.setOrderType("online1");
        param.setRmSequence("22222222");
        param.setToolsInfo("API");
//        param.setUserId("oyL8u6exsds27SdsdfspUN33nOVEZqZsTKzEw");
//        param.setPayWay("UNIONPAY");
        param.setPayWay("WECHAT");
//      param.setUseTool("NCCASHIER");
//      param.setIdType("OTHER");
//      param.setIdNo("EX2020020700");//130528198710141969   210921197604224695
//      param.setUserPhone("010590173429");//13254289609   15801213599
//		param.setUserPhone("15676721184");
        param.setUserType("1");
//      param.setBindCardId("");
        param.setGoodsInfo("{\"isOpenAPI\":\"YES\",\"deviceUID\":\"20220213000UID\",\"memberId\":\"20220213000\",\"launchMode\":\"B2B\",\"signName\":\"中国联合网络通信有限公司\",\"systemMerchantNo\":\"10001060629\",\"merchantCreateTime\":\"2009-12-16 16:34:18\",\"legalIdNo\":\"\",\"subBizcatCode\":\"130001\",\"industry\":\"通信行业线\",\"smsNoStatus\":\"\",\"legalName\":\"\",\"subBizcatName\":\"电信运营商（移动，联通，电信，铁通等）\",\"bindIdUpdateTime\":1621913208314,\"merchantContactName\":\"杨鹏飞\",\"buyTel\":\"15810939967\",\"userIp\":\"172.10.103.33\",\"signType\":\"\",\"bizcatName\":\"通信\",\"bindIdCreateTime\":1621913208314,\"goodsName\":\"中国联通交费充值\",\"tidecardway\":\"Common\",\"bizcatCode\":\"130\",\"terminalAddressInfo\":\"{\\\"address\\\":\\\"万通中心\\\",\\\"province\\\":\\\"330000\\\",\\\"city\\\":\\\"330100\\\",\\\"district\\\":\\\"110101\\\"}\"}");

        RcAsyncEfPayReqDto originalReqDto = (RcAsyncEfPayReqDto) getAsyncReqDto(param);
        originalReqDto.setBankId("sdsd");
        originalReqDto.setAppId(null);
        String syncReqIf = "orderType=JSAPI,amount=29.00,paySystem=AGGPAY,bankChannelId=,productId=FE,bizOrder=1013202310310000008489852659,production=DS,occurTime=2023-10-31 21:22:13,payWay=WECHAT,sequenceId=2310312122132181330683349657,userId=oGImd50I1q-qkF87bCHM_KeuWSjQ,bankId=null,requestId=wd_Lq78sQb7e109bd,paymentId=2310312122132181330683349657,appId=wxba8e2a384ba4f6f1,userIp=27.27.12.205,userType=MERCHANT,bankCardName=,rmSequence=e64062b1-2f0f-4919-a8af-81c28e191511,merchantNo=10089387407";
        Map<String,Object> allSynReqIfMap  = MapUtils.transStringToMap(syncReqIf);
        allSynReqIfMap = Optional.ofNullable(allSynReqIfMap).orElse(new HashMap<>());
        // 合并直传参数-- 异步包含了goodsIf
        Map<String,Object> allAsyncReqIfMap  =  BeanUtils.getProperties(originalReqDto);
        allAsyncReqIfMap = Optional.ofNullable(allAsyncReqIfMap).orElse(new HashMap<>());
        // 合并map
        Map<String,Object> all = MapUtils.mergeSyncMapToAsync(allSynReqIfMap,allAsyncReqIfMap);
        // 转化成reqIf，对属性值赋值
        String reqIf = reqinfoToString(all);
        RcAsyncEfPayReqDto asyncReqDto = new RcAsyncEfPayReqDto();
        buildAsyncReq(reqIf,asyncReqDto);
        System.out.println(JSONObject.toJSONString(asyncReqDto));
        asyncReqDto.setAppId(null);
        asyncReqDto.setUserId(null);
        String requestIf = asyncReqDto.toString();
        System.out.println(requestIf);
    }

    /**
     * 对req_if字段中的敏感信息加密
     * @param params
     * @return
     */
    private static String reqinfoToString(Map<String,Object> params){
        if(params == null || params.size()==0){
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

    protected static void buildAsyncReq(String reqInfo, RcAsyncReqDto syncDto) {
        Class clz = syncDto.getClass();
        Method[] methods0 = clz.getMethods();
        Method[] methods1 = clz.getSuperclass().getMethods();
        Method[] methods = new Method[methods0.length + methods1.length];
        System.arraycopy(methods0, 0, methods, 0, methods0.length);
        System.arraycopy(methods1, 0, methods, methods0.length, methods1.length);
        Field[] fs0 = clz.getDeclaredFields();
        Field[] fs1 = clz.getSuperclass().getDeclaredFields();
        Field[] fs = new Field[fs0.length + fs1.length];
        System.arraycopy(fs0, 0, fs, 0, fs0.length);
        System.arraycopy(fs1, 0, fs, fs0.length, fs1.length);
        for (Field f : fs) {
            String fieldName = f.getName();
            String key = fieldName + "=";
            int start_idx = reqInfo.indexOf(key);
            if (start_idx < 0) {
                continue;
            }
            if (start_idx != 0) {
                start_idx = reqInfo.indexOf("," + key);
                key = "," + key;
            }
            if (start_idx < 0) {
                continue;
            }
            String reqDtoTmp = reqInfo.substring(start_idx + key.length());
            int end_idx = -1;
            if (reqDtoTmp.indexOf("{") == 0) {
                end_idx = reqDtoTmp.indexOf("}");
                if (end_idx > 0) {
                    end_idx = end_idx + 1;
                }
            } else {
                end_idx = reqDtoTmp.indexOf(",");
            }
            if (end_idx < 0 && StringUtils.isBlank(reqDtoTmp)) {
                continue;
            }
            String val = "";
            if (end_idx < 0 && StringUtils.isNotBlank(reqDtoTmp)) {
                val = reqDtoTmp;
            } else {
                val = reqDtoTmp.substring(0, end_idx);
            }
            if (val.indexOf("=") >= 0) {
                continue;
            }
            if (StringUtils.isBlank(val)) {
                continue;
            }
            for (Method method : methods) {
                if (method.getName().toLowerCase().equals(("set" + fieldName).toLowerCase()) && StringUtils.isNotBlank(val)) {
                    Class[] paramClzs = method.getParameterTypes();
                    Class paramClz = paramClzs[0];
                    if (paramClz.getSimpleName().equals("String") && !"null".equalsIgnoreCase(val)) {
                        if (StringUtils.isTimeFormat(val)) {
                            val = StringUtils.valueTimeFormat(val);
                        }
                        try {
                            method.invoke(syncDto, val);
                        } catch (IllegalArgumentException e) {
                            logger.error("", e);
                        } catch (IllegalAccessException e) {
                            logger.error("", e);
                        } catch (InvocationTargetException e) {
                            logger.error("", e);
                        }
                    }
                    if (paramClz.getSimpleName().equals("Date") && !"null".equalsIgnoreCase(val)) {
                        val = StringUtils.valueTimeFormat(val);
                        try {
                            method.invoke(syncDto, DateUtils.getDateFromString(val, "yyyy-MM-dd HH:mm:ss"));
                        } catch (IllegalArgumentException e) {
                            logger.error("", e);
                        } catch (IllegalAccessException e) {
                            logger.error("", e);
                        } catch (InvocationTargetException e) {
                            logger.error("", e);
                        }
                    }
                    if (paramClz.getSimpleName().equals("Long")) {
                        try {
                            method.invoke(syncDto, Long.parseLong(val));
                        } catch (IllegalArgumentException e) {
                            logger.error("", e);
                        } catch (IllegalAccessException e) {
                            logger.error("", e);
                        } catch (InvocationTargetException e) {
                            logger.error("", e);
                        }
                    }
                    break;
                }
            }
        }
    }

    public static RcAsyncReqDto getAsyncReqDto(RcSyncEfPayReqDto param){
        RcAsyncEfPayReqDto result = new RcAsyncEfPayReqDto();
        result.setRequestId(param.getRequestId());
//        result.setTradeResult("1");
        result.setCompleteTime(new Date());
        result.setAmount(param.getAmount());
        result.setBankChannelId(param.getBankChannelId());
        result.setMerchantNo(param.getMerchantNo());
        result.setOccurTime(param.getOccurTime());
        result.setPaymentId("11111");
        result.setProductId(param.getProductId());
        result.setProduction(param.getProduction());
//        result.setBankCardNo(param.getBankCardNo());
        result.setUserId(param.getUserId());
        result.setGoodsInfo("{\"isOpenAPI\":\"NO\",\"deviceUID\":\"2323232\",\"userIp\":\"172.2.10.44\",\"launchMode\":\"232\",\"signName\":\"中国联合网络通信有限公司\",\"systemMerchantNo\":\"10001060629\",\"merchantCreateTime\":\"2009-12-16 16:34:18\",\"legalIdNo\":\"\",\"subBizcatCode\":\"130001\",\"industry\":\"通信行业线\",\"smsNoStatus\":\"\",\"legalName\":\"\",\"subBizcatName\":\"电信运营商（移动，联通，电信，铁通等）\",\"bindIdUpdateTime\":1621913208314,\"merchantContactName\":\"杨鹏飞\",\"buyTel\":\"15810939967\",\"signType\":\"\",\"bizcatName\":\"通信\",\"bindIdCreateTime\":1621913208314,\"goodsName\":\"中国联通交费充值\",\"tidecardway\":\"Common\",\"bizcatCode\":\"130\",\"terminalAddressInfo\":\"{\\\"address\\\":\\\"万通中心\\\",\\\"province\\\":\\\"330000\\\",\\\"city\\\":\\\"330100\\\",\\\"district\\\":\\\"110101\\\"}\"}");
        result.setRmSequence(param.getRmSequence());

        result.setPaymentId("1154");
        result.setUserId("nu3232323ll");
        result.setBankId("45114");
        return result;
    }
}
