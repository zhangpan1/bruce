package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tcredit.streaming.core.api.Mergeable;
import com.tcredit.streaming.core.bean.CachedRecord;
import com.tcredit.streaming.core.bean.ConvenientHashMap;
import com.tcredit.streaming.core.bean.TimedItems;
import com.tcredit.streaming.core.bean.method.DistinctedListObject;
import com.tcredit.streaming.core.bean.method.MergeableMapObject;
import com.tcredit.streaming.core.model.DSPayOrder;
import com.tcredit.streaming.core.norm.define.*;
import com.tcredit.streaming.core.utils.LoggerUtil;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.zhang.bruce.general.cach.TestEngine.getCacheMap;
import static com.zhang.bruce.general.cach.TestEngine.notNull;
import static com.zhang.bruce.general.cach.TestRemitEngine.getBackUpValue;
import static com.zhang.bruce.general.cach.TestRemitEngine.getMapValue;
import static com.zhang.bruce.rule.FunctionTest.isNull;
import static com.zhang.bruce.rule.FunctionTest.isNumeric;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/5/9 11:11 上午
 */
public class TestRecharge {
    public static void main(String[] args) throws Exception {
        List<Object> list = new ArrayList<Object>();
        DSPayOrder obj = new DSPayOrder();
        obj.setContactPhone("123899");
        obj.setColCustUserId("100700251");
        obj.setProduct("FE");
        obj.setOrderChnl("MEC_BALANCE_PAYMENT_FE");
        obj.setPayCustCardNo("8984548545894");
        obj.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2023-05-08 11:12:32"));
        obj.setGoodsInfo("{\"merchantInfoAddress\":\"海南省三亚市海棠区海棠南路X号\",\"signName\":\"张三\",\"payerName\":\"李四\"}");
        obj.setBackUp("orderType=MINI_PROGRAM,production=DS,occurTime=2023-05-09 11:27:11,payWay=B2B,sequenceId=2305091127111580893034539978,serverId=,bankMsg=,requestId=105_202305098309154301122460,paymentId=2305091127111580893034539978,bankTradeNo=,synConsumeTime=,appId=wxaf35009675aa0b2a,tradeError=,tradeResult=1,amount=5.00,paySystem=AGGPAY,bankChannelId=UNION_NET_OPEN_YLSJ6067,productId=FE,bizOrder=1013202305090000006239137885,bankError=,bankCardType=CFT,completeTime=2023-05-09 11:27:16,userId=oJJUI0T3REWhZYullVC6Wt3LMoys,synErrorCode=,transactionId=,bankId=CFT,tradeMsg=,bankOrderNo=5051380817230509,userType=MERCHANT,bankTradeId=,rmSequence=320bf5ee-0b95-4589-811a-9bdd347037b8,merchantNo=10088745216");
        obj.setComamt(8900L);
        obj.setStatus("SUCCESS");

        DSPayOrder obj2 = new DSPayOrder();
        obj2.setContactPhone("123899");
        obj2.setColCustUserId("100700251");
        obj2.setOrderChnl("MEC_BALANCE_PAYMENT_FE");
        obj2.setProduct("FE");
        obj2.setPayCustCardNo("8984548545894");
        obj2.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2023-05-08 11:12:32"));
        obj2.setGoodsInfo("{\"merchantInfoAddress\":\"海南省三亚市海棠区海棠南路X号\",\"signName\":\"张三\",\"payerName\":\"李四\"}");
        obj2.setBackUp("orderType=MINI_PROGRAM,production=DS,occurTime=2023-05-09 11:27:11,payWay=B2C,sequenceId=2305091127111580893034539978,serverId=,bankMsg=,requestId=105_202305098309154301122460,paymentId=2305091127111580893034539978,bankTradeNo=,synConsumeTime=,appId=wxaf35009675aa0b2a,tradeError=,tradeResult=1,amount=5.00,paySystem=AGGPAY,bankChannelId=UNION_NET_OPEN_YLSJ6067,productId=FE,bizOrder=1013202305090000006239137885,bankError=,bankCardType=CFT,completeTime=2023-05-09 11:27:16,userId=oJJUI0T3REWhZYullVC6Wt3LMoys,synErrorCode=,transactionId=,bankId=CFT,tradeMsg=,bankOrderNo=5051380817230509,userType=MERCHANT,bankTradeId=,rmSequence=320bf5ee-0b95-4589-811a-9bdd347037b8,merchantNo=10088745216");
        obj2.setComamt(8900L);
        obj2.setStatus("SUCCESS");

        DSPayOrder obj1 = new DSPayOrder();
        obj1.setContactPhone("123899");
        obj1.setColCustUserId("100700251");
        obj1.setProduct("FE");
        obj1.setOrderChnl("MEC_BALANCE_PAYMENT_FE");
        obj1.setPayCustCardNo("8984548545894");
        obj1.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2023-05-08 11:12:32"));
        obj1.setGoodsInfo("{\"merchantInfoAddress\":\"海南省三亚市海棠区海棠南路X号\",\"signName\":\"张三\",\"payerName\":\"王五\"}");
        obj1.setBackUp("orderType=MINI_PROGRAM,production=DS,occurTime=2023-05-09 11:27:11,payWay=B2B,sequenceId=2305091127111580893034539978,serverId=,bankMsg=,requestId=105_202305098309154301122460,paymentId=2305091127111580893034539978,bankTradeNo=,synConsumeTime=,appId=wxaf35009675aa0b2a,tradeError=,tradeResult=1,amount=5.00,paySystem=AGGPAY,bankChannelId=UNION_NET_OPEN_YLSJ6067,productId=FE,bizOrder=1013202305090000006239137885,bankError=,bankCardType=CFT,completeTime=2023-05-09 11:27:16,userId=oJJUI0T3REWhZYullVC6Wt3LMoys,synErrorCode=,transactionId=,bankId=CFT,tradeMsg=,bankOrderNo=5051380817230509,userType=MERCHANT,bankTradeId=,rmSequence=320bf5ee-0b95-4589-811a-9bdd347037b8,merchantNo=10088745216");
        obj1.setComamt(8900L);
        obj1.setStatus("SUCCESS");
        list.add(obj1);
        list.add(obj);
        list.add(obj2);
        Map<Class<?>, List<Object>> a = new HashMap<Class<?>, List<Object>>();
        a.put(DSPayOrder.class, list);
        Set<CachedRecord> calc = task().calc(a);

        System.out.println(JSON.toJSONString(calc, SerializerFeature.DisableCircularReferenceDetect));
        Iterator it = calc.iterator();
        while (it.hasNext()) {
            CachedRecord cachedRecord = (CachedRecord) it.next();
            TimedItems timedItems = (TimedItems) cachedRecord.get("同商编下近【X】小时充值类指定产品指定payWay交易中商户签约名不等于充值账户名的账户数");
            Object cacheKey = cachedRecord.getRaw("primary_key");
            System.out.println("分割线");
            System.out.println(JSON.toJSONString(timedItems, SerializerFeature.DisableCircularReferenceDetect));
            String transtime = "1683617876000";
            String duration = "72ph";
            System.out.println("二次割线");
            getCacheMap(timedItems, transtime, duration);
            System.out.println();
            System.out.println("三次次割线");
            System.out.println(getDistinctedListFromMapByKey(getCacheMap(timedItems, transtime, duration),"MEC_BALANCE_PAYMENT_FE","B2B"));
            System.out.println("四次次割线");
            System.out.println(cacheKey == "100700251");
            System.out.println("五次次割线");
            System.out.println(operCondSimple(getDistinctedListFromMapByKey(getCacheMap(timedItems, transtime, duration),"MEC_BALANCE_PAYMENT_FE","B2B"),">=",2));

        }
    }

    public static NormDefine task(){
        return NormDefineBuilder.createNorm("同商编下近【X】小时充值类指定产品指定payWay交易中商户签约名不等于充值账户名的账户数").selectCachedRecord("mchid", "PAY.REMIT")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return order.getColCustUserId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return notNull(order.getColCustUserId()) &&
                                (("FE".equals(order.getProduct()) &&"MEC_BALANCE_PAYMENT_FE".equals(order.getOrderChnl()))
                                        || ("FE".equals(order.getProduct()) && "BAC_LOAD_FE".equals(order.getOrderChnl()))
                                        || ("RECHARGE".equals(order.getProduct()) && "MEC_BALANCE_PAYMENT_RECHARGE".equals(order.getOrderChnl()))
                                        || ("FE".equals(order.getProduct()) && "BANK_TRANS_PAYMENT_FE".equals(order.getOrderChnl())))
                                && notNull(order.getStatus());
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String signName = getMapValue(order.getGoodsInfo(),"signName");
                        String payerName = getMapValue(order.getGoodsInfo(),"payerName");

                        String payWay =   getBackUpValue(order.getBackUp(),"payWay");
                        return ("B2B".equals(payWay) || "B2C".equals(payWay) || "NET".equals(payWay) || "Deduction".equals(payWay) || "Remittance".equals(payWay)) && notNull(payerName) && notNull(signName) && isNotEquals(payerName,signName,true);
                    }
                }).setExpireMode("73ph")
                .setObjectDate(new DateItem() {
                    @Override
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    @Override
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String orderChnl = order.getOrderChnl();
                        String payWay =   getBackUpValue(order.getBackUp(),"payWay");
                        String prodBiz = orderChnl + "_" + payWay;
                        String payerName = getMapValue(order.getGoodsInfo(),"payerName");
                        return new MergeableMapObject(prodBiz, new DistinctedListObject(payerName));
                    }
                }).init();
    }

    static boolean isNotEquals(Object obj1, Object obj2, boolean casesensitive) {
        try {
            LoggerUtil.getLogger().debug("obj1 == {}", obj1);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            LoggerUtil.getLogger().debug("casesensitive == {}", casesensitive);
            //判断传人的两个参数是否相等,根据casesensitive选择是否区分大小写
            if(obj1 == null||obj2 == null){
                return false;
            }
            if (notNull(obj1) && notNull(obj2)) {
                String a = casesensitive ? String.valueOf(obj1) : String.valueOf(obj1).toUpperCase();
                String b = casesensitive ? String.valueOf(obj2) : String.valueOf(obj2).toUpperCase();
                if (!a.equals(b))
                    return true;
            }
            return false;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
    }
    static Object getDistinctedListFromMapByKey(Object obj, String prod,String payWay){
        try {
            Set value = new HashSet();
            if (isNull(prod) || isNull(payWay)) return value;
            if (obj instanceof ConvenientHashMap) {
                ConvenientHashMap map = (ConvenientHashMap) obj;
                if ("all".equalsIgnoreCase(prod.trim())) {
                    if ("all".equalsIgnoreCase(payWay.trim())) {
                        // 遍历所有
                        Iterator entries = map.entrySet().iterator();
                        while (entries.hasNext()) {
                            Map.Entry entry = (Map.Entry) entries.next();
                            if (entry != null && entry.getValue() != null && entry.getValue() instanceof DistinctedListObject) {
                                value.addAll(((DistinctedListObject) entry.getValue()).getSet());
                            }
                        }
                    } else {
                        String var1 = "BAC_LOAD_FE"+"_"+payWay;
                        String var2 = "MEC_BALANCE_PAYMENT_RECHARGE"+"_"+payWay;
                        String var3 = "MEC_BALANCE_PAYMENT_FE"+"_"+payWay;
                        String var4 = "BANK_TRANS_PAYMENT_FE"+"_"+payWay;
                        List<String> keyArray = new ArrayList<>();
                        keyArray.add(var1);
                        keyArray.add(var2);
                        keyArray.add(var3);
                        keyArray.add(var4);
                        for (String keyStr : keyArray) {
                            Object o = map.get(keyStr);
                            if (o != null && o instanceof DistinctedListObject) {
                                value.addAll(((DistinctedListObject) o).getSet());
                            }
                        }
                    }
                } else {
                    if ("all".equalsIgnoreCase(payWay.trim())) {
                        String var1 = prod+"_"+"B2B";
                        String var2 = prod+"_"+"B2C";
                        String var3 = prod+"_"+"NET";
                        String var4 = prod+"_"+"Deduction";
                        String var5 = prod+"_"+"Remittance";
                        List<String> keyArray = new ArrayList<>();
                        keyArray.add(var1);
                        keyArray.add(var2);
                        keyArray.add(var3);
                        keyArray.add(var4);
                        keyArray.add(var5);
                        for (String keyStr : keyArray) {
                            Object o = map.get(keyStr);
                            if (o != null && o instanceof DistinctedListObject) {
                                value.addAll(((DistinctedListObject) o).getSet());
                            }
                        }
                    } else {
                        String keyStr = prod+"_"+payWay;
                        Object o = map.get(keyStr);
                        if (o != null && o instanceof DistinctedListObject) {
                            value.addAll(((DistinctedListObject) o).getSet());
                        }
                    }
                }
            }
            return value.size();
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getDistinctedListFromMapByKey 全局方法出现异常", e);
            return new HashSet();
        }
    }


    static boolean operCondSimple (Object obj,String x,Object obj2){
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            LoggerUtil.getLogger().debug("x == {}", x);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);

            if(obj == null || obj2 == null || "null".equals(obj) || "null".equals(obj2)){
                return false;
            }

            Set<String> judgeSet = new HashSet<String>();
            judgeSet.add("==");
            judgeSet.add("!=");
            judgeSet.add("包含");
            judgeSet.add("不包含");

            Set<String> rangeSet = new HashSet<String>();
            rangeSet.add(">");
            rangeSet.add("<");
            rangeSet.add(">=");
            rangeSet.add("<=");

            String s1 = null;
            String s2 = null;
            if (judgeSet.contains(x)){
                s1 = obj.toString();
                s2 = obj2.toString();
            }
            BigDecimal leftDecimal = null;
            BigDecimal rightDecimal = null;
            if (rangeSet.contains(x)){
                if(!(isNumeric(obj)&&isNumeric(obj2))){
                    return false;
                }
                leftDecimal = new BigDecimal(obj.toString().trim());
                rightDecimal = new BigDecimal(obj2.toString().trim());
            }

            if (">".equals(x)){
                return leftDecimal.compareTo(rightDecimal) > 0;
            }else if ("<".equals(x)){
                return leftDecimal.compareTo(rightDecimal) < 0;
            }else if (">=".equals(x)){
                return leftDecimal.compareTo(rightDecimal) >= 0;
            }else if ("<=".equals(x)){
                return leftDecimal.compareTo(rightDecimal) <= 0;
            }else if ("==".equals(x)){
                if (isNumeric(s1) && isNumeric(s2)){
                    return new BigDecimal(s1.trim()).compareTo(new BigDecimal(s2.trim())) == 0;
                }
                return s1.equals(s2);
            }else if ("!=".equals(x)){
                if (isNumeric(s1) && isNumeric(s2)){
                    return new BigDecimal(s1.trim()).compareTo(new BigDecimal(s2.trim())) != 0;
                }
                return !s1.equals(s2);
            }else if ("包含".equals(x)){
                return !"".equals(s1)&&s1.contains(s2);
            }else {
                return !"".equals(s1)&&!s1.contains(s2);
            }
        }catch (Exception e) {
            LoggerUtil.getLogger().error("operCondSimple 全局方法出现异常", e);
            return false;
        }
    }

}
