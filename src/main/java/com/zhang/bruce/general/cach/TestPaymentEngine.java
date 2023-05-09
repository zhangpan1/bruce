package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tcredit.streaming.core.api.Mergeable;
import com.tcredit.streaming.core.bean.CachedRecord;
import com.tcredit.streaming.core.bean.method.CountNumber;
import com.tcredit.streaming.core.bean.method.MergeableMapObject;
import com.tcredit.streaming.core.bean.method.SumNumber;
import com.tcredit.streaming.core.model.DSPayOrder;
import com.tcredit.streaming.core.model.RemitDSPayOrder;
import com.tcredit.streaming.core.norm.define.*;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.zhang.bruce.general.cach.TestEngine.notNull;
import static com.zhang.bruce.general.cach.TestRemitEngine.getBackUpValue;
import static com.zhang.bruce.general.cach.TestRemitEngine.getMapValue;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/3/15 3:01 下午
 */
public class TestPaymentEngine {
    public static void main(String[] args) throws Exception {
        List<Object> list = new ArrayList<Object>();
        DSPayOrder obj = new DSPayOrder();
        obj.setContactPhone("123899");
        obj.setPayCustCardNo("8984548545894");
        obj.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-04-25 19:12:32"));
        obj.setComamt(8900L);
        obj.setStatus("SUCCESS");

        DSPayOrder obj1 = new DSPayOrder();
        obj1.setContactPhone("123899");
        obj1.setPayCustCardNo("8984548545894");
        obj1.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-04-24 12:12:32"));
        obj1.setComamt(8900L);
        obj1.setStatus("SUCCESS");
        list.add(obj1);
        list.add(obj);
        Map<Class<?>, List<Object>> a = new HashMap<Class<?>, List<Object>>();
        a.put(DSPayOrder.class, list);
        Set<CachedRecord> calc = task().calc(a);

        System.out.println(JSON.toJSONString(calc, SerializerFeature.DisableCircularReferenceDetect));
    }

    public static NormDefine task() {
        return NormDefineBuilder.createNorm("同手机号在24小时内累积交易成功次数").selectCachedRecord("phone", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((DSPayOrder) obj).getContactPhone();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return "SUCCESS".equals(order.getStatus());
                    }
                }).setExpireMode("24ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        return new CountNumber(1L);
                    }
                }).init();
    }

    public static List<NormDefine> getAllTasks() {
        ArrayList<NormDefine> tasks = new ArrayList<NormDefine>(2);
        tasks.add(task());
        return tasks;
    }


    public static NormDefine test(){
        return NormDefineBuilder.createNorm("同出金主体（接收出款的归属人）近【N】小时在同商编下的出金金额").selectCachedRecord("mchid", "PAY.REMIT")
                .setObjectType(RemitDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((RemitDSPayOrder) obj).getMecNo();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        return notNull(order.getMecNo())
                                && ("RJT".equals(order.getProd()) || "DFDF".equals(order.getProd()) || "WITHDRAW".equals(order.getProd()) || "S0".equals(order.getProd()) || "D0".equals(order.getProd()) || "T1".equals(order.getProd()) || "D1".equals(order.getProd()) || "TN".equals(order.getProd()))
                                && "1".equals(order.getStatus());
                    }
                }).setExpireMode("73ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((RemitDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        String bankCardName = "blank";
                        long amt = order.getAmt();
                        if ("RJT".equals(order.getProd()) || "DFDF".equals(order.getProd())|| "WITHDRAW".equals(order.getProd())){
                            //代付类：DFDF、RJT：prodMsg中，bankCardNo为卡号，bankCardName为收款人姓名；
                            //提现类：WITHDRAW：prodMsg中，bankCardNo为卡号，bankCardName为收款人姓名；
                            bankCardName = getBackUpValue(order.getProdMsg(),"bankCardName");
                        }else {
                            //结算类：S0、D0、T1、D1、TN：只累计prodMsg中remitDetail有值的交易，其中bankCardNo为卡号，bankCardName为收款人姓名,remitAmount为实际到卡金额；
                            String remitDetail = getBackUpValue(order.getProdMsg(),"remitDetail");
                            if (remitDetail != null){
                                remitDetail = remitDetail.replaceAll("、",",");
                                JSONArray remitDetailArr = JSONObject.parseArray(remitDetail);
                                amt=0L;
                                for (Object o : remitDetailArr) {
                                    bankCardName = getMapValue(o.toString(),"bankCardName");
                                    String amtStr = getMapValue(o.toString(),"remitAmount");
                                    if(StringUtils.isNotBlank(amtStr)){
                                        BigDecimal tempBD = new BigDecimal(amtStr);
                                        Long tempTmL = tempBD.multiply(new BigDecimal(1000)).longValue();
                                        amt += tempTmL;
                                    }
                                }
                            }
                        }
                        return new MergeableMapObject(bankCardName, new SumNumber(amt));
                    }
                }).init();
    }

}
