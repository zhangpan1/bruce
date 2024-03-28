package com.zhang.bruce.service;

import com.yeepay.doorgod.utils.date.DateUtils;
import com.yeepay.riskcontrol.facade.RcAsyncReqDto;
import com.yeepay.riskcontrol.facade.v2.RcAsyncEfPayReqDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/10/27 2:54 下午
 */
public class BuildReqIFService {
    private static final Logger logger = LoggerFactory.getLogger(BuildReqIFService.class);


    public static void main(String[] args) {
        RcAsyncEfPayReqDto asyncReqDto = new RcAsyncEfPayReqDto();
        String reqIf = "orderType=PASSIVESCAN,amount=0.05,paySystem=AGGPAY,bankChannelId=,productId=FE,bizOrder=1013202310270000008419948402,production=DS,occurTime=2023-10-27 13:35:14,payWay=WECHAT,sequenceId=2310271335140950878439110752,userId=null,bankId=null,requestId=combineOrder1698384913811,paymentId=2310271335140950878439110752,appId=null,userIp=127.0.0.1,userType=MERCHANT,bankCardName=,rmSequence=1802e607-03d3-4421-a85e-e414708bd4f5,merchantNo=10086039518";
        buildAsyncReq(reqIf,asyncReqDto);
    }

    public static void buildAsyncReq(String reqInfo, RcAsyncReqDto syncDto) {
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
                    if (paramClz.getSimpleName().equals("String")) {
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
}
