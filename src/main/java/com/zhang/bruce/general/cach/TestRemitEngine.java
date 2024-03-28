package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tcredit.streaming.core.api.Mergeable;
import com.tcredit.streaming.core.bean.CachedRecord;
import com.tcredit.streaming.core.bean.TimedItems;
import com.tcredit.streaming.core.bean.method.CountNumber;
import com.tcredit.streaming.core.bean.method.DistinctedCountNumber;
import com.tcredit.streaming.core.bean.method.DistinctedListObject;
import com.tcredit.streaming.core.bean.method.SumNumber;
import com.tcredit.streaming.core.model.DSPayOrder;
import com.tcredit.streaming.core.model.DefaultModel;
import com.tcredit.streaming.core.model.RemitDSPayOrder;
import com.tcredit.streaming.core.norm.define.*;
import com.tcredit.streaming.core.utils.LoggerUtil;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.zhang.bruce.general.cach.TestEngine.notNull;
import static com.zhang.bruce.general.cach.TestFE_1116.getCacheValue;
import static com.zhang.bruce.rule.FunctionTest.getValueFromGoodsIf;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/3/15 3:25 下午
 */
public class TestRemitEngine {
    public static void main(String[] args) throws Exception {
        List<Object> list = new ArrayList<Object>();
        RemitDSPayOrder obj = new RemitDSPayOrder();
        obj.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-04-25 19:12:32"));
        obj.setAmt(8900L);
        obj.setStatus("1");
        obj.setProd("RJT");
        obj.setMecNo("10088830018");
        obj.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2022-11-13 09:12:32"));
        obj.setBankCardNo("15454115455");
        obj.setProdMsg("\"prodMsg\":\"production=MERCHANTSETTLE,occurTime=2023-03-15 17:21:26,userPhone=DG$1$S3fcu2mvhEgn49zAD0OBWQ,\"bankCardNo\":\"11850000001056245\"remitDetail=[{\"bankCardNo\":\"11850000001056252\"、\"bankCardName\":\"北京科技有限公司\"、\"remitAmount\":\"21.54\"}]");

        RemitDSPayOrder obj1 = new RemitDSPayOrder();
        obj1.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-04-25 19:12:32"));
        obj1.setAmt(8900L);
        obj1.setStatus("1");
        obj1.setProd("RJT");
        obj1.setBankCardNo("1515154");
        obj1.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2022-11-13 10:12:32"));
        obj1.setMecNo("10088830018");
        obj1.setProdMsg("\"prodMsg\":\"production=MERCHANTSETTLE,occurTime=2023-03-15 17:21:26,\"bankCardNo\":\"118500000010562235\",userPhone=DG$1$S3fcu2mvhEgn49zAD0OBWQ,remitDetail=[{\"bankCardNo\":\"11850000001056245\"、\"bankCardName\":\"北京科技有限公司\"、\"remitAmount\":\"20.00\"}]");
        list.add(obj1);
        list.add(obj);
        Map<Class<?>, List<Object>> a = new HashMap<Class<?>, List<Object>>();
        a.put(RemitDSPayOrder.class, list);
        Set<CachedRecord> calc = test18().calc(a);

        System.out.println(JSON.toJSONString(calc, SerializerFeature.DisableCircularReferenceDetect));

        Iterator it = calc.iterator();
        while (it.hasNext()) {
            CachedRecord cachedRecord = (CachedRecord) it.next();
            TimedItems timedItems = (TimedItems) cachedRecord.get("同商户近X天代付出款卡数");
            System.out.println("分割线");
            System.out.println(JSON.toJSONString(timedItems, SerializerFeature.DisableCircularReferenceDetect));
            //                  1706703435738
            String transtime = "1668357028000";
            String duration = "90pd";
            System.out.println("二次割线");
            System.out.println(getCacheValue(timedItems, transtime, duration));
//            System.out.println("三次次割线");
//            System.out.println(getCacheCount(timedItems, transtime, duration));


        }
    }

    public static NormDefine test2(){
        return NormDefineBuilder.createNorm("单商户近N小时部分出款产品成功金额").selectCachedRecord("mchid", "PAY.REMIT")
                .setObjectType(RemitDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((RemitDSPayOrder) obj).getMecNo();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        return notNull(order.getMecNo())
                                && ("RJT".equals(order.getProd()) || ("DFDF".equals(order.getProd()) || "SUPPLIER".equals(order.getProd()) || "WITHDRAW".equals(order.getProd()) || "S0".equals(order.getProd()) || "D0".equals(order.getProd()) || "S1".equals(order.getProd()) || "D1".equals(order.getProd()))
                                && "1".equals(order.getStatus()));
                    }
                }).setExpireMode("73ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((RemitDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        long amt = 0L;
                        if ("RJT".equals(order.getProd()) || "DFDF".equals(order.getProd())|| "SUPPLIER".equals(order.getProd()) || "WITHDRAW".equals(order.getProd())){
                            amt = order.getAmt();
                        }else {
                            //结算类：S0、D0、T1、D1、TN：只累计prodMsg中remitDetail有值的交易，其中bankCardNo为卡号，bankCardName为收款人姓名,remitAmount为实际到卡金额；
                            String remitDetail = getBackUpValue(order.getProdMsg(),"remitDetail");
                            if (remitDetail != null){
                                remitDetail = remitDetail.replaceAll("、",",");
                                JSONArray remitDetailArr = JSONObject.parseArray(remitDetail);
                                for (Object o : remitDetailArr) {
                                    String amtStr = getMapValue(o.toString(),"remitAmount");
                                    if(StringUtils.isNotBlank(amtStr)){
                                        BigDecimal tempBD = new BigDecimal(amtStr);
                                        Long tempTmL = tempBD.multiply(new BigDecimal(1000)).longValue();
                                        amt += tempTmL;
                                    }
                                }
                            }
                        }
                        return new SumNumber(amt);
                    }
                }).init();
    }

    public static NormDefine test3(){
        return NormDefineBuilder.createNorm("任一乘机人证件号近x小时内对应持卡人证件号归属地个数").selectCachedRecord("idNo","PAY.YJZF")
                .setObjectType(DefaultModel.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return order.get("PASSENGER").toString();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return notNull(order.get("PASSENGER"))  && notNull(order.get("ID_NO_AREA"))
                                && notNull(order.get("TRANS_TIME")) && "TC_STREAMING_ENGINE".equals(order.get("TRADETABLENAME"));
                    }
                }).setExpireMode("72ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return new Date(Long.parseLong(order.get("TRANS_TIME").toString()));
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return new DistinctedListObject(order.get("ID_NO_AREA").toString());
                    }
                }).init();
    }
    public static NormDefine test4(){
        return NormDefineBuilder.createNorm("任一乘机人证件号近x小时内对应持卡人证件号个数").selectCachedRecord("idNo","PAY.YJZF")
                .setObjectType(DefaultModel.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return order.get("PASSENGERmchid").toString();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return notNull(order.get("PASSENGER"))  && notNull(order.get("ID_NO"))
                                && notNull(order.get("TRANS_TIME")) && "TC_STREAMING_ENGINE".equals(order.get("TRADETABLENAME"));
                    }
                }).setExpireMode("72ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return new Date(Long.parseLong(order.get("TRANS_TIME").toString()));
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return new DistinctedListObject(order.get("ID_NO").toString());
                    }
                }).init();
    }
    public static NormDefine test5(){
        return NormDefineBuilder.createNorm("任一乘机人证件号近x天内对应联系人手机号个数").selectCachedRecord("idNo","PAY.YJZF")
                .setObjectType(DefaultModel.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return order.get("PASSENGER").toString();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return notNull(order.get("PASSENGER"))  && notNull(order.get("CONTRACT_PHONE"))
                                && notNull(order.get("TRANS_TIME")) && "TC_STREAMING_ENGINE".equals(order.get("TRADETABLENAME"));
                    }
                }).setExpireMode("60pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return new Date(Long.parseLong(order.get("TRANS_TIME").toString()));
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return new DistinctedListObject(order.get("CONTRACT_PHONE").toString());
                    }
                }).init();
    }
    public static NormDefine test6(){
        return NormDefineBuilder.createNorm("任一乘机人证件号近x天内对应联系人姓名个数").selectCachedRecord("idNo","PAY.YJZF")
                .setObjectType(DefaultModel.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return order.get("PASSENGER").toString();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return notNull(order.get("PASSENGER"))  && notNull(order.get("CONTRACT_NAME"))
                                && notNull(order.get("TRANS_TIME")) && "TC_STREAMING_ENGINE".equals(order.get("TRADETABLENAME"));
                    }
                }).setExpireMode("60pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return new Date(Long.parseLong(order.get("TRANS_TIME").toString()));
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return new DistinctedListObject(order.get("CONTRACT_NAME").toString());
                    }
                }).init();
    }
    public static NormDefine test7(){
        return NormDefineBuilder.createNorm("同商户同终端近24小时线上交易经纬度去重列表").selectCachedRecord("mch-terminalId", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return order.getColCustUserId()+"_"+order.getPosId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return notNull(order.getColCustUserId())
                                && notNull(order.getPosId())
                                && notNull(getValueFromGoodsIf(order.getGoodsInfo(), "longitude"))
                                && notNull(getValueFromGoodsIf(order.getGoodsInfo(), "latitude"));
                    }
                }).setExpireMode("24ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return order.getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        BigDecimal lot = BigDecimal.valueOf(Double.parseDouble(getValueFromGoodsIf(order.getGoodsInfo(), "longitude")));
                        BigDecimal lat = BigDecimal.valueOf(Double.parseDouble(getValueFromGoodsIf(order.getGoodsInfo(), "latitude")));

                        BigDecimal newa = lot.setScale(2, RoundingMode.HALF_UP);
                        BigDecimal newb = lat.setScale(2,RoundingMode.HALF_UP);
                        String result = "";
                        if (newb.compareTo(BigDecimal.ZERO) >0){
                            result =  newa.toString()+",+"+newb.toString();
                        }else {
                            result =  newa.toString()+","+newb.toString();
                        }
                        return new DistinctedListObject(result);
                    }
                }).init();
    }
    public static NormDefine test9(){
        return NormDefineBuilder.createNorm("同联系人手机号近30天内对应联系人姓名个数").selectCachedRecord("phone","PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((DSPayOrder) obj).getContactPhone();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return notNull(order.getContactPhone()) && notNull(getValueFromGoodsIf(order.getGoodsInfo(), "contactName"));
                    }
                }).setExpireMode("60pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return new DistinctedListObject(getValueFromGoodsIf(order.getGoodsInfo(), "contactName"));
                    }
                }).init();
    }
    public static NormDefine test10(){
        return NormDefineBuilder.createNorm("同预定人手机号近30天内累积交易笔数").selectCachedRecord("phone","PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((DSPayOrder) obj).getPayToPhone();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return notNull(order.getPayToPhone()) &&  notNull(order.getTransTime());
                    }
                }).setExpireMode("30pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        return new CountNumber(1L);
                    }
                }).init();
    }
    public static NormDefine test11(){
        return NormDefineBuilder.createNorm("同预定人手机号近30天内累积成功交易金额").selectCachedRecord("phone","PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((DSPayOrder) obj).getPayToPhone();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return notNull(order.getPayToPhone()) &&  notNull(order.getTransTime()) &&  "1".equals(order.getStatus());
                    }
                }).setExpireMode("30pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return new SumNumber(order.getTransAmount());
                    }
                }).init();
    }
    public static NormDefine test12(){
        return NormDefineBuilder.createNorm("同商编近60天快捷非C网成功交易金额").selectCachedRecord("mchid","PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((DSPayOrder) obj).getColCustUserId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String productId = order.getProduct();
                        return notNull(order.getColCustUserId()) && "NOCARDPAY".equals(productId) &&  notNull(order.getTransTime()) &&  "1".equals(order.getStatus()) && "BANK".equals(getValueFromReqinfo(order.getBackUp(),"bankType")) ;
                    }
                }).setExpireMode("60pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return new SumNumber(order.getTransAmount());
                    }
                }).init();
    }
    public static NormDefine test13(){
        return NormDefineBuilder.createNorm("同商编近72小时快捷非C网成功交易金额").selectCachedRecord("mchid","PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((DSPayOrder) obj).getColCustUserId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String productId = order.getProduct();
                        return notNull(order.getColCustUserId()) && "NOCARDPAY".equals(productId) &&  notNull(order.getTransTime()) &&  "1".equals(order.getStatus()) && "BANK".equals(getValueFromReqinfo(order.getBackUp(),"bankType"));
                    }
                }).setExpireMode("72ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return new SumNumber(order.getTransAmount());
                    }
                }).init();
    }
    public static NormDefine test14(){
        return NormDefineBuilder.createNorm("同商编同身份证同金额近72小时成功交易笔数").selectCachedRecord("mch-idNo-amt","PAY.EPOS")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String mchId = order.getColCustUserId();
                        String idNo = order.getIdNo();
                        String amt = String.valueOf(order.getTransAmount());
                        return mchId+"_"+idNo+"_"+amt;
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String orderChnl = order.getOrderChnl();
                        return notNull(order.getColCustUserId()) && notNull(order.getIdNo())  && notNull(order.getTransAmount())
                                && "EPOS".equals(orderChnl) &&  notNull(order.getTransTime()) &&  "1".equals(order.getStatus())
                                && order.getTransAmount() >= 4000000 && order.getTransAmount() <= 20000000;
                    }
                }).setExpireMode("72ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        return new CountNumber(1);
                    }
                }).init();
    }
    public static NormDefine test15(){
        return NormDefineBuilder.createNorm("同商编同银行卡同金额近72小时成功交易笔数").selectCachedRecord("mch-card-amt","PAY.EPOS")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String mchId = order.getColCustUserId();
                        String card = order.getPayCustCardNo();
                        String amt = String.valueOf(order.getTransAmount());
                        return mchId+"_"+card+"_"+amt;
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String orderChnl = order.getOrderChnl();
                        return notNull(order.getColCustUserId()) && notNull(order.getPayCustCardNo()) && notNull(order.getTransAmount())
                                && "EPOS".equals(orderChnl) &&  notNull(order.getTransTime()) &&  "1".equals(order.getStatus())
                                && order.getTransAmount() >= 4000000 && order.getTransAmount() <= 20000000;
                    }
                }).setExpireMode("72ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        return new CountNumber(1);
                    }
                }).init();
    }
    public static NormDefine test16(){
        return NormDefineBuilder.createNorm("同商编同金额近72小时成功交易笔数").selectCachedRecord("mch-amt","PAY.EPOS")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String mchId = order.getColCustUserId();
                        String amt = String.valueOf(order.getTransAmount());
                        return mchId+"_"+amt;
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String orderChnl = order.getOrderChnl();
                        return notNull(order.getColCustUserId())  && notNull(order.getTransAmount())
                                && "EPOS".equals(orderChnl) &&  notNull(order.getTransTime()) &&  "1".equals(order.getStatus())
                                && order.getTransAmount() >= 4000000 && order.getTransAmount() <= 20000000;
                    }
                }).setExpireMode("72ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        return new CountNumber(1);
                    }
                }).init();
    }
    public static NormDefine test17(){
        return NormDefineBuilder.createNorm("同商编同金额近72小时累积交易银行卡去重数").selectCachedRecord("mch-amt","PAY.EPOS")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String mchId = order.getColCustUserId();
                        String amt = String.valueOf(order.getTransAmount());
                        return mchId+"_"+amt;
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String orderChnl = order.getOrderChnl();
                        return notNull(order.getColCustUserId())  && notNull(order.getTransAmount()) && notNull(order.getPayCustCardNo())
                                && "EPOS".equals(orderChnl) &&  notNull(order.getTransTime()) &&  "1".equals(order.getStatus())
                                && order.getTransAmount() >= 4000000 && order.getTransAmount() <= 20000000;
                    }
                }).setExpireMode("72ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return new DistinctedListObject(order.getPayCustCardNo());
                    }
                }).init();
    }

    public static NormDefine test18(){
        return NormDefineBuilder.createNorm("同商户近X天代付出款卡数")
                .selectCachedRecord("remit-mch", "PAY.REMIT")
                .setObjectType(RemitDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((RemitDSPayOrder) obj).getMecNo();
                    }
                }).setExpireMode("90pd")
                .setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        String bankcardno  = order.getBankCardNo();
                        return notNull(order.getMecNo()) && "1".equals(order.getStatus())
                                && notNull(bankcardno)
                                &&  ("RJT".equals(order.getProd()) || "DFDF".equals(order.getProd()) || "SUPPLIER".equals(order.getProd()));
                    }
                })
                .setObjectDate(new DateItem() {
                    @Override
                    public Date getDate(Object obj) {
                        return ((RemitDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    @Override
                    public Mergeable invoke(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        String bankcardno  = order.getBankCardNo();
                        return new DistinctedCountNumber(bankcardno);
                    }
                }).init();
    }

    public static NormDefine test1(){
        return NormDefineBuilder.createNorm("单商户近N小时部分出款产品成功金额").selectCachedRecord("mchid", "PAY.REMIT")
                .setObjectType(RemitDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((RemitDSPayOrder) obj).getMecNo();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        return notNull(order.getMecNo())
                                && ("RJT".equals(order.getProd()) || ("DFDF".equals(order.getProd()) || "SUPPLIER".equals(order.getProd()) || "WITHDRAW".equals(order.getProd()) || "S0".equals(order.getProd()) || "D0".equals(order.getProd()) || "S1".equals(order.getProd()) || "D1".equals(order.getProd()))
                                && "1".equals(order.getStatus()));
                    }
                }).setExpireMode("73ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((RemitDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        long amt = 0L;
                        if ("RJT".equals(order.getProd()) || "DFDF".equals(order.getProd())|| "SUPPLIER".equals(order.getProd()) || "WITHDRAW".equals(order.getProd())){
                            amt = order.getAmt();
                        }else {
                            //结算类：S0、D0、T1、D1、TN：只累计prodMsg中remitDetail有值的交易，其中bankCardNo为卡号，bankCardName为收款人姓名,remitAmount为实际到卡金额；
                            String remitDetail = getBackUpValue(order.getProdMsg(),"remitDetail");
                            if (remitDetail != null){
                                remitDetail = remitDetail.replaceAll("、",",");
                                JSONArray remitDetailArr = JSONObject.parseArray(remitDetail);
                                for (Object o : remitDetailArr) {
                                    String amtStr = getMapValue(o.toString(),"remitAmount");
                                    if(StringUtils.isNotBlank(amtStr)){
                                        BigDecimal tempBD = new BigDecimal(amtStr);
                                        Long tempTmL = tempBD.multiply(new BigDecimal(1000)).longValue();
                                        amt += tempTmL;
                                    }
                                }
                            }
                        }
                        return new SumNumber(amt);
                    }
                }).init();
    }
    static String getBackUpValue (Object obj1, Object obj2){
        try {
            LoggerUtil.getLogger().debug("obj1 == {}", obj1);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            if(obj1 == null || obj2== null){
                return null;
            }
            String backUp = obj1.toString();
            String key = obj2.toString();
            Map<String,String> map = backUpToMap(backUp);
            if(map.get(key) != null){
                return map.get(key).toString();
            }
            return null;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }
    static Map<String,String> backUpToMap (String reqInfo){
        try {
            Map<String, String> result = new HashMap<String, String>();
            if (com.yeepay.g3.utils.common.StringUtils.isBlank(reqInfo)) {
                return result;
            }
            reqInfo = filterJsonFromReqInfo(reqInfo, "goodsInfo=");
            reqInfo = filterJsonFromReqInfo(reqInfo, "toolsInfo=");
            String[] reqInfoArray = reqInfo.split(",");
            if (reqInfoArray != null && reqInfoArray.length > 0) {
                for (String req : reqInfoArray) {
                    String[] reqFactorArray = new String[2];
                    if (com.yeepay.g3.utils.common.StringUtils.isNotBlank(req)) {
                        if (req.indexOf("=") > 0) {
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
                }
            }
            return result;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }

    static String filterJsonFromReqInfo (String reqInfo, String jsonKey){
        try {
            LoggerUtil.getLogger().debug("reqInfo == {}", reqInfo);
            LoggerUtil.getLogger().debug("jsonKey == {}", jsonKey);
            String result = "";
            int goodsinfoIdx = reqInfo.indexOf(jsonKey);
            if (goodsinfoIdx > 0) {
                String goodsInfoPrefix = reqInfo.substring(0, goodsinfoIdx);
                String goodsInfoSuffix = reqInfo.substring(goodsinfoIdx
                        + jsonKey.length());
                if (goodsInfoSuffix.length() > 0) {
                    if ("{".equals(goodsInfoSuffix.substring(0, 1))) {
                        goodsInfoSuffix = goodsInfoSuffix.substring(1);
                        int goodsinfoEndIdx = goodsInfoSuffix.indexOf("}");
                        if (goodsinfoEndIdx >= 0) {
                            goodsInfoSuffix = goodsInfoSuffix
                                    .substring(goodsinfoEndIdx + 1);
                            result = goodsInfoPrefix + goodsInfoSuffix;
                        } else {
                            // 不需要过滤
                            result = reqInfo;
                        }
                    } else {
                        // 不需要过滤
                        result = reqInfo;
                    }
                } else {
                    // 不需要过滤
                    result = reqInfo;
                }
            } else {
                // 不需要过滤
                result = reqInfo;
            }
            return result;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }
    static String getMapValue (Object obj1, Object obj2){
        try {
            LoggerUtil.getLogger().debug("obj1 == {}", obj1);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            if(obj1 == null || obj2== null){
                return null;
            }
            String goodsInfo = obj1.toString();
            String key = obj2.toString();
            Map<String,String> map = transGoodsIfToMap(goodsInfo);
            if(map.get(key) != null){
                return map.get(key).toString();
            }
            return null;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }

    static   Map<String,String>  transGoodsIfToMap(Object obj){
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            Map<String,String> res = new HashMap<String, String>();
            if(obj==null||"".equals(obj.toString())){
                return res;
            }
            String goodsInfo = obj.toString();
            goodsInfo = goodsInfo.trim().substring(1,goodsInfo.length()-1);
            goodsInfo = goodsInfo.replaceAll("\"", "");
            String [] strings = goodsInfo.split(",");
            for (String s:strings) {
                String [] ss  = s.split(":");
                if(ss!=null&&ss.length>1 && s.indexOf(":")!=-1){
                    res.put(ss[0], s.substring(s.indexOf(":")+1));
                }
            }
            return res;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }


    static String getValueFromReqinfo(String reqInfo, String key) {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            if (null == reqInfo||reqInfo.isEmpty()||"null".equalsIgnoreCase(reqInfo)) {
                return null;
            }
            reqInfo = filterJsonFromReqInfo(reqInfo, "goodsInfo=");
            reqInfo = filterJsonFromReqInfo(reqInfo, "toolsInfo=");
            String[] reqInfoArray = reqInfo.split(",");
            if(reqInfoArray!=null&&reqInfoArray.length>0){
                for(String req : reqInfoArray){
                    String[] reqFactorArray = new String[2];
                    if(null != req&&!req.isEmpty()){
                        if(req.indexOf("=")>0){
                            String str1 = req.substring(0,req.indexOf("="));
                            String str2 = req.substring(req.indexOf("=")+1,req.length());
                            reqFactorArray[0]=str1;
                            reqFactorArray[1]=str2;
                            if(reqFactorArray!=null && reqFactorArray.length>0){
                                if(reqFactorArray.length==2){
                                    map.put(reqFactorArray[0].trim(), reqFactorArray[1].trim());
                                }else{
                                    map.put(reqFactorArray[0].trim(), "");
                                }
                            }
                        }
                    }
                }
            }
            return map.get(key) == null? null : map.get(key).toString();
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }
}
