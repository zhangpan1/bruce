package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tcredit.streaming.core.api.Mergeable;
import com.tcredit.streaming.core.bean.CachedRecord;
import com.tcredit.streaming.core.bean.TimedItems;
import com.tcredit.streaming.core.bean.method.*;
import com.tcredit.streaming.core.model.OfflineDSPayOrder;
import com.tcredit.streaming.core.norm.define.*;
import com.tcredit.streaming.core.utils.LoggerUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.zhang.bruce.general.cach.TestEngine.notNull;

/**
 * @description: 连续条件编写
 * @email: pan.zhang@yeepay.com
 * @date: 2022/11/15 10:21 上午
 */
public class TestFE_1116 {
    public static void main(String[] args) throws ParseException, InterruptedException {
        List<Object> list1 = new ArrayList<Object>();
        OfflineDSPayOrder offlineDSPayOrder = new OfflineDSPayOrder();
        offlineDSPayOrder.setCardNo("89845485458941");
        offlineDSPayOrder.setIp("10.7.1.21");
        offlineDSPayOrder.setMerchantId("100200300");
        offlineDSPayOrder.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2022-11-13 09:12:32"));
        offlineDSPayOrder.setStatus("1");
        offlineDSPayOrder.setIssueBankCode("BBC");
        offlineDSPayOrder.setTransAmount(1999L);


        OfflineDSPayOrder offlineDSPayOrder3 = new OfflineDSPayOrder();
        offlineDSPayOrder3.setCardNo("89845485458941");
        offlineDSPayOrder3.setIp("10.7.1.21");
        offlineDSPayOrder3.setMerchantId("100200300");
        offlineDSPayOrder3.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2022-11-13 10:12:32"));
        offlineDSPayOrder3.setStatus("1");
        offlineDSPayOrder3.setIssueBankCode("BBC");
        offlineDSPayOrder3.setTransAmount(3000L);

        OfflineDSPayOrder offlineDSPayOrder1 = new OfflineDSPayOrder();
        offlineDSPayOrder1.setCardNo("89845485458943");
        offlineDSPayOrder1.setIp("10.7.1.21");
        offlineDSPayOrder1.setMerchantId("100200300");
        offlineDSPayOrder1.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2022-11-13 11:12:32"));
        offlineDSPayOrder1.setStatus("1");
        offlineDSPayOrder1.setIssueBankCode("ABC");
        offlineDSPayOrder1.setTransAmount(2000L);

        list1.add(offlineDSPayOrder);
        list1.add(offlineDSPayOrder3);
        list1.add(offlineDSPayOrder1);
        Map<Class<?>, List<Object>> a1 = new HashMap<Class<?>, List<Object>>();
        a1.put(OfflineDSPayOrder.class, list1);
        Set<CachedRecord> calc = reson5().calc(a1);
        System.out.println(JSON.toJSONString(calc, SerializerFeature.DisableCircularReferenceDetect));

        Iterator it = calc.iterator();
        while (it.hasNext()) {
            CachedRecord cachedRecord = (CachedRecord) it.next();
            TimedItems timedItems = (TimedItems) cachedRecord.get("近【30】天同银行成功交易金额");
            System.out.println("分割线");
            System.out.println(JSON.toJSONString(timedItems, SerializerFeature.DisableCircularReferenceDetect));
            String transtime = "1668357028000";
            String duration = "30pd";
            System.out.println("二次割线");
            System.out.println(getCacheValue(timedItems, transtime, duration));
            System.out.println("三次次割线");
            System.out.println(getCacheCount(timedItems, transtime, duration));


        }
    }

    public static NormDefine reson1() {
        return NormDefineBuilder.createNorm("近【30】天同商户同银行连续交易笔数").selectCachedRecord("mch-bank", "PAY.OFFLINE")
                .setObjectType(OfflineDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((OfflineDSPayOrder) obj).getMerchantId() + "_" + ((OfflineDSPayOrder) obj).getIssueBankCode();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        //交易状态的枚举暂未确定
                        return notNull(order.getCardNo()) && notNull(order.getIssueBankCode()) && notNull(order.getMerchantId());
                    }
                }).setExpireMode("30pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((OfflineDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return new MaxContinuousCountNumber(true);
                    }
                }).init();
    }

    public static NormDefine reson2() {
        return NormDefineBuilder.createNorm("近【30】天同商户同银行成功交易笔数").selectCachedRecord("mch-bank", "PAY.OFFLINE")
                .setObjectType(OfflineDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((OfflineDSPayOrder) obj).getMerchantId() + "_" + ((OfflineDSPayOrder) obj).getIssueBankCode();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        //交易状态的枚举暂未确定
                        return notNull(order.getCardNo()) && notNull(order.getIssueBankCode()) && notNull(order.getMerchantId()) && "1".equals(order.getStatus());
                    }
                }).setExpireMode("30pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((OfflineDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return new SumNumber(order.getTransAmount());
                    }
                }).init();
    }

    public static NormDefine reson3() {
        return NormDefineBuilder.createNorm("近【30】天同商户成功交易笔数").selectCachedRecord("offline-mch", "PAY.OFFLINE")
                .setObjectType(OfflineDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((OfflineDSPayOrder) obj).getMerchantId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        //交易状态的枚举暂未确定
                        return notNull(order.getMerchantId()) && "1".equals(order.getStatus());
                    }
                }).setExpireMode("30pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((OfflineDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return new SumNumber(order.getTransAmount());
                    }
                }).init();
    }

    public static NormDefine reson4() {
        return NormDefineBuilder.createNorm("近【30】天总体成功交易金额").selectCachedRecord("production", "PAY.OFFLINE")
                .setObjectType(OfflineDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        String production = ((OfflineDSPayOrder) obj).getProduction();
                        String[] biz = production.split("_");
                        return biz[1];
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        //交易状态的枚举暂未确定
                        return notNull(order.getMerchantId()) && notNull(order.getProductId())
                                && notNull(order.getProduction()) && "1".equals(order.getStatus())
                                && ("OFFLINE".equals(order.getProductId()) || "OFFNEW".equals(order.getProductId()) || "OFFPAY".equals(order.getProductId()));
                    }
                }).setExpireMode("30pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((OfflineDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return new SumNumber(order.getTransAmount());
                    }
                }).init();
    }

    public static NormDefine reson5() {
        return NormDefineBuilder.createNorm("近【30】天同银行成功交易金额").selectCachedRecord("bank", "PAY.OFFLINE")
                .setObjectType(OfflineDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((OfflineDSPayOrder) obj).getIssueBankCode();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        //交易状态的枚举暂未确定
                        return notNull(order.getMerchantId()) && "1".equals(order.getStatus());
                    }
                }).setExpireMode("30pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((OfflineDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return new SumNumber(order.getTransAmount());
                    }
                }).init();
    }


    static long getCacheValue(Object obj, Object transtime, String duration) {
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            LoggerUtil.getLogger().debug("transtime == {}", transtime);
            LoggerUtil.getLogger().debug("duration == {}", duration);
            /**
             * 获取SumNumber等类型的cache中的值
             */
            if (obj == null || !(obj instanceof TimedItems)) {
                return 0;
            }

            TimedItems tt = (TimedItems) obj;
            Object o = null;

            if (transtime == null || duration == null) {
                o = tt.getRaw();
            } else {
                o = tt.getRaw(transtime, duration);
            }
            if (o instanceof CountNumber) {
                return ((CountNumber) o).longValue();
            }
            if (o instanceof ReplacedObject) {
                Object value = ((ReplacedObject) o).getObject();
                return Long.parseLong(value.toString());
            }
            if (o instanceof SumNumber) {
                return ((SumNumber) o).longValue();
            }
            if (o instanceof MaxNumber) {
                return ((MaxNumber) o).longValue();
            }
            if (o instanceof AvgNumber) {
                return ((AvgNumber) o).longValue();
            }
            if (o instanceof VarsNumber) {
                return ((VarsNumber) o).longValue();
            }
            if (o instanceof VarpNumber) {
                return ((VarpNumber) o).longValue();
            }
            if (o instanceof DistinctedListObject) {
                int size = ((DistinctedListObject) o).getSet().size();
                return size;
            }
            if (o instanceof MergeableListObject) {
                List list = ((MergeableListObject) o).getList();
                return list.size();
            }
            if (o instanceof MaxContinuousCountNumber) {
                return ((MaxContinuousCountNumber) o).longValue();
            }
            if (o instanceof DistinctedCountNumber) {
                return ((DistinctedCountNumber) o).value() == null ? 0 : ((DistinctedCountNumber) o).value();
            }
            return 0L;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0;
        }
    }

    static long getCacheCount(Object obj, Object transtime, String duration) {
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            LoggerUtil.getLogger().debug("transtime == {}", transtime);
            LoggerUtil.getLogger().debug("duration == {}", duration);
            /**
             * 获取SumNumber等类型的cache中的值
             */
            if (obj == null || !(obj instanceof TimedItems)) {
                return 0;
            }
            TimedItems tt = (TimedItems) obj;
            Object o = null;
            if (transtime == null || duration == null) {
                o = tt.getRaw();
            } else {
                o = tt.getRaw(transtime, duration);
            }
            if (o instanceof CountNumber) {
                return ((CountNumber) o).getCount();
            }
            if (o instanceof SumNumber) {
                return ((SumNumber) o).getCount();
            }
            if (o instanceof MaxNumber) {
                return ((MaxNumber) o).getCount();
            }
            if (o instanceof AvgNumber) {
                return ((AvgNumber) o).getCount();
            }
            if (o instanceof VarsNumber) {
                return ((VarsNumber) o).getCount();
            }
            return 0L;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0;
        }
    }
}
