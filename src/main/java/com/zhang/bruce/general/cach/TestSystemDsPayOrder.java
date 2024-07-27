package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tcredit.streaming.core.api.Mergeable;
import com.tcredit.streaming.core.bean.CachedRecord;
import com.tcredit.streaming.core.bean.ConvenientHashMap;
import com.tcredit.streaming.core.bean.TimedItems;
import com.tcredit.streaming.core.bean.method.DistinctedListObject;
import com.tcredit.streaming.core.bean.method.MergeableMapObject;
import com.tcredit.streaming.core.bean.method.SumNumber;
import com.tcredit.streaming.core.model.DSPayOrder;
import com.tcredit.streaming.core.model.OfflineDSPayOrder;
import com.tcredit.streaming.core.norm.define.*;
import com.tcredit.streaming.core.utils.LoggerUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.zhang.bruce.general.cach.TestDsPayOrder.getMapValue;
import static com.zhang.bruce.general.cach.TestEngine.notNull;
import static com.zhang.bruce.rule.FunctionTest.getCacheMap;
import static com.zhang.bruce.rule.FunctionTest.isNull;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/4/30 7:58 下午
 */
public class TestSystemDsPayOrder {
    public static void main(String[] args) throws ParseException, InterruptedException {
        List<Object> list = new ArrayList<Object>();
        DSPayOrder obj = new DSPayOrder();
        obj.setProduct("NOCARDPAY");
        obj.setOrderChnl("MEC_BALANCE_PAYMENT_FE");
        obj.setColCustUserId("10033534158");
        obj.setGoodsInfo("{\"payerBankCardId\":\"DG$1$W05lWsIiPF5wNxEwHV2x8g\",\"merchantCreateTime\":\"2022-10-19 09:39:56\",\"systemMerchantNo\":\"10089467641\",\"parentSignName\":\"\",\"bsTime\":\"不超时\",\"industry\":\"金融行业线\",\"payerBankCode\":\"DG$1$ywbZKYXT-iRYYvTRe8hEXg\",\"legalName\":\"DG$1$OZ4gbr5Efv7cbnRlg87sFg\",\"limitTime\":\"不超时\",\"subBizcatName\":\"小贷/网贷\",\"merchantContactName\":\"傅奎阳\",\"signType\":\"ENTERPRISE\",\"payerName\":\"上海复其投资有限公司\",\"bizcatName\":\"金融\",\"finalResultSub\":\"消费金融\",\"salesType\":\"DIRECT_SALES\",\"merchantRole\":\"ORDINARY_MERCHANT\",\"merchantInfoAddress\":\"莱蒙都会2栋406\",\"signName\":\"南宁市鼎正小额贷款有限公司\",\"systemMerchantNo\":\"\",\"isProxyIp\":false,\"payerBankCardType\":\"PUBLIC_CARD\",\"legalIdNo\":\"DG$1$iFy-_eUue_fbNOwe04nXQsNlJxn53f_FpvSDik7qFYo\",\"accountType\":\"PaymentAccount\",\"signSubject\":\"南宁市鼎正小额贷款有限公司\",\"subBizcatCode\":\"127025\",\"smsNoStatus\":\"1\",\"uniCrdCode\":\"91450100MABYKBUK1F\",\"customerLevel\":\"1\",\"launchMode\":\"mecbackgd\",\"cashierTypeRisk\":\"page\",\"bizcatCode\":\"127\",\"finalResult\":\"金融\",\"secondParentMerchantNo\":\"\"}");
        obj.setBackUp("orderType=MINI_PROGRAM,production=DS,occurTime=2023-05-09 11:27:11,payWay=B2B,sequenceId=2305091127111580893034539978,serverId=,bankMsg=,requestId=105_202305098309154301122460,paymentId=2305091127111580893034539978,bankTradeNo=,synConsumeTime=,appId=wxaf35009675aa0b2a,tradeError=,tradeResult=1,amount=5.00,paySystem=AGGPAY,bankChannelId=UNION_NET_OPEN_YLSJ6067,productId=FE,bizOrder=1013202305090000006239137885,bankError=,bankCardType=CFT,completeTime=2023-05-09 11:27:16,userId=oJJUI0T3REWhZYullVC6Wt3LMoys,synErrorCode=,transactionId=,bankId=CFT,tradeMsg=,bankOrderNo=5051380817230509,userType=MERCHANT,bankTradeId=,rmSequence=320bf5ee-0b95-4589-811a-9bdd347037b8,targetMerchantNo=10033534158");
        obj.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-30 11:12:32"));
        obj.setTransAmount(786000L);
        obj.setStatus("1");
//
//        DSPayOrder obj1 = new DSPayOrder();
//        obj1.setProduct("FE");
//        obj1.setColCustUserId("10033534158");
//        obj1.setOrderChnl("MEC_BALANCE_PAYMENT_FE");
//        obj1.setGoodsInfo("{\"merchantInfoAddress\":\"海南省三亚市海棠区海棠南路X号\",\"signName\":\"张三\",\"payerName\":\"王五\"}");
//        obj1.setColCustUserId("10033534158");
//        obj1.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-01 11:12:32"));
//        obj1.setTransAmount(786000L);
//        obj1.setStatus("1");
//        list.add(obj1);
        list.add(obj);
        Map<Class<?>, List<Object>> a = new HashMap<Class<?>, List<Object>>();
        a.put(DSPayOrder.class, list);
        Set<CachedRecord> calc = test2().calc(a);

        // System.out.println(JSON.toJSONString(calc, SerializerFeature.DisableCircularReferenceDetect));

        Iterator it = calc.iterator();
        while (it.hasNext()) {
            CachedRecord cachedRecord = (CachedRecord) it.next();
            TimedItems timedItems = (TimedItems) cachedRecord.get("同父商户(直接)子商户近N小时线上累加产品交易成功金额");
            System.out.println("分割线");
            System.out.println(JSON.toJSONString(timedItems, SerializerFeature.DisableCircularReferenceDetect));
            //                  1706703435738
            String transtime = "1714481715569";
            String duration = "24ph";
            System.out.println("二次割线");
            System.out.println(getValueFromMapByKeySplit(getCacheMap(timedItems, transtime, duration), "OFFLINE"));


        }
    }

    public static NormDefine test2() {
        return NormDefineBuilder.createNorm("同父商户(直接)子商户近N小时线上累加产品交易成功金额").selectCachedRecord("sys-mchid", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String systemMerchantNo = getMapValue(order.getGoodsInfo(),"systemMerchantNo");
                        return systemMerchantNo;
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String systemMerchantNo = getMapValue(order.getGoodsInfo(),"systemMerchantNo");
                        return notNull(order.getColCustUserId()) && notNull(systemMerchantNo) && ("NOCARDPAY".equals(order.getProduct()) || "FE".equals(order.getOrderChnl())
                                ||"NOCARDPAY".equals(order.getProduct()) || "ACCOUNT_BOOKPAY".equals(order.getProduct())
                                || "BANK_TRANS_PAYMENT".equals(order.getProduct()) || "BANKACCOUNT_PAY".equals(order.getProduct()))
                                && "1".equals(order.getStatus());
                    }
                }).setExpireMode("72ph")
                .setObjectDate(new DateItem() {
                    @Override
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    @Override
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        Long transAmount = order.getTransAmount();
                        return new MergeableMapObject(order.getProduct(), new SumNumber(transAmount));
                    }
                }).init();
    }

    public static NormDefine test3() {
        return NormDefineBuilder.createNorm("同父商户(直接)子商户近N小时线下累加产品交易成功金额").selectCachedRecord("sys-mchid", "PAY.YJZF")
                .setObjectType(OfflineDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        String systemMerchantNo = getMapValue(order.getGoodsInfo(),"systemMerchantNo");
                        return systemMerchantNo;
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        String systemMerchantNo = getMapValue(order.getGoodsInfo(),"systemMerchantNo");
                        return notNull(order.getMerchantId())  && notNull(systemMerchantNo) && "1".equals(order.getStatus()) && "OFFLINE".equals(order.getProductId());
                    }
                }).setExpireMode("72ph")
                .setObjectDate(new DateItem() {
                    @Override
                    public Date getDate(Object obj) {
                        return ((OfflineDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    @Override
                    public Mergeable invoke(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return new MergeableMapObject(order.getProductId(), new SumNumber(order.getTransAmount()));
                    }
                }).init();
    }
    static long getValueFromMapByKeySplit(Object obj, Object key){
        try {

            LoggerUtil.getLogger().info("getValueFromMapByKeySplit,obj == {}", JSONObject.toJSONString(obj));
            LoggerUtil.getLogger().info("getValueFromMapByKeySplit,key == {}", JSONObject.toJSONString(key));
            long value = 0;
            if (obj == null || isNull(key)) return value;
            if (obj instanceof ConvenientHashMap) {
                ConvenientHashMap map = (ConvenientHashMap) obj;
                String keyStr = key.toString();
                if ("all".equalsIgnoreCase(keyStr)) {
                    for (Object o : map.values()) {
                        if ( o != null && o instanceof SumNumber ) {
                            value += ((SumNumber) o).longValue();
                        } else if ( o != null && o instanceof DistinctedListObject) {
                            value += ((DistinctedListObject) o).getSet().size();
                        }
                    }
                } else {
                    String[] keyArray = keyStr.trim().split(",|;");
                    for (String keyItme : keyArray) {
                        Object o = map.get(keyItme);
                        if (o != null && o instanceof SumNumber) {
                            value += ((SumNumber) o).longValue();
                        } else if ( o != null && o instanceof DistinctedListObject) {
                            value += ((DistinctedListObject) o).getSet().size();
                        }
                    }
                }
            }
            return value;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getValueFromMapByKeySplit 全局方法出现异常", e);
            return 0;
        }
    }

    public static NormDefine test7() {
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

    public static NormDefine test6() {
        return NormDefineBuilder.createNorm("单商户近N小时内线上收单某产品交易金额").selectCachedRecord("mchid", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return order.getColCustUserId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return notNull(order.getColCustUserId()) && ("NOCARDPAY".equals(order.getProduct()) || "FE".equals(order.getOrderChnl())
                                ||"NOCARDPAY".equals(order.getProduct()) || "ACCOUNT_BOOKPAY".equals(order.getProduct())
                                || "BANK_TRANS_PAYMENT".equals(order.getProduct()) || "BANKACCOUNT_PAY".equals(order.getProduct()))
                                && "1".equals(order.getStatus());
                    }
                }).setExpireMode("24ph")
                .setObjectDate(new DateItem() {
                    @Override
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    @Override
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        Long transAmount = order.getTransAmount();
                        return new MergeableMapObject(order.getProduct(), new SumNumber(transAmount));
                    }
                }).init();
    }


}
