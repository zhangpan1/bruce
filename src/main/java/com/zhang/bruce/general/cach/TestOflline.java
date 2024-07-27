package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tcredit.streaming.core.api.Mergeable;
import com.tcredit.streaming.core.bean.CachedRecord;
import com.tcredit.streaming.core.bean.TimedItems;
import com.tcredit.streaming.core.bean.method.MergeableMapObject;
import com.tcredit.streaming.core.bean.method.SumNumber;
import com.tcredit.streaming.core.model.OfflineDSPayOrder;
import com.tcredit.streaming.core.norm.define.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.zhang.bruce.general.cach.TestDsPayOrder.getValueFromMapByBizAndProd;
import static com.zhang.bruce.general.cach.TestEngine.getCacheMap;
import static com.zhang.bruce.general.cach.TestEngine.notNull;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/4/1 3:29 下午
 */
public class TestOflline {
    public static void main(String[] args) throws ParseException, InterruptedException {
        List<Object> list = new ArrayList<Object>();
        OfflineDSPayOrder obj = new OfflineDSPayOrder();
        obj.setBackUp("orderType=MINI_PROGRAM,production=DS,occurTime=2023-05-09 11:27:11,payWay=B2B,sequenceId=2305091127111580893034539978,serverId=,bankMsg=,requestId=105_202305098309154301122460,paymentId=2305091127111580893034539978,bankTradeNo=,synConsumeTime=,appId=wxaf35009675aa0b2a,tradeError=,tradeResult=1,amount=5.00,paySystem=AGGPAY,bankChannelId=UNION_NET_OPEN_YLSJ6067,productId=FE,bizOrder=1013202305090000006239137885,bankError=,bankCardType=CFT,completeTime=2023-05-09 11:27:16,userId=oJJUI0T3REWhZYullVC6Wt3LMoys,synErrorCode=,transactionId=,bankId=CFT,tradeMsg=,bankOrderNo=5051380817230509,userType=MERCHANT,bankTradeId=,rmSequence=320bf5ee-0b95-4589-811a-9bdd347037b8,targetMerchantNo=10033534158");
        obj.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-01 11:12:32"));
        obj.setMerchantId("10033534158");
        obj.setProductId("OFFLINE");
        obj.setTransAmount(20000L);
        obj.setStatus("1");

        list.add(obj);
        Map<Class<?>, List<Object>> a = new HashMap<Class<?>, List<Object>>();
        a.put(OfflineDSPayOrder.class, list);
        Set<CachedRecord> calc = test1().calc(a);

        System.out.println(JSON.toJSONString(calc, SerializerFeature.DisableCircularReferenceDetect));

        Iterator it = calc.iterator();
        while (it.hasNext()) {
            CachedRecord cachedRecord = (CachedRecord) it.next();
            TimedItems timedItems = (TimedItems) cachedRecord.get("单商户近N小时内线下收单入金交易金额");
            System.out.println("分割线");
            System.out.println(JSON.toJSONString(timedItems, SerializerFeature.DisableCircularReferenceDetect));
            //                  1706703435738
            String transtime = "1711954755608";
            String duration = "24ph";
            System.out.println("二次割线");
            System.out.println(getValueFromMapByBizAndProd(getCacheMap(timedItems, transtime, duration),"MEC_BALANCE_PAYMENT_TRANSFER,MEC_BALANCE_PAYMENT_FE,OFFLINE"));
        }
    }

    public static NormDefine test1() {
        return NormDefineBuilder.createNorm("单商户近N小时内线下收单入金交易金额").selectCachedRecord("mchid", "PAY.OFFLINE")
                .setObjectType(OfflineDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((OfflineDSPayOrder) obj).getMerchantId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return notNull(order.getMerchantId()) && "1".equals(order.getStatus()) && "OFFLINE".equals(order.getProductId());
                    }
                }).setExpireMode("24ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((OfflineDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return new MergeableMapObject(order.getProductId(), new SumNumber(order.getTransAmount()));
                    }
                }).init();
    }
}
