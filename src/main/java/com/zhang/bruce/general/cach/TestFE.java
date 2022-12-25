package com.zhang.bruce.general.cach;

import com.tcredit.streaming.core.api.Mergeable;
import com.tcredit.streaming.core.bean.method.CountNumber;
import com.tcredit.streaming.core.bean.method.MergeableMapObject;
import com.tcredit.streaming.core.bean.method.SumNumber;
import com.tcredit.streaming.core.model.DSPayOrder;
import com.tcredit.streaming.core.model.OfflineDSPayOrder;
import com.tcredit.streaming.core.norm.define.*;

import java.util.Date;

import static com.zhang.bruce.rule.FunctionTest.notNull;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/11/12 21:41
 * @Description:
 */
public class TestFE {
    public static NormDefine main(String[] args) {
        return NormDefineBuilder.createNorm("同商户同IP在(N)小时内产品【NOCARDPAY,FE】累积交易次数(含当笔)").selectCachedRecord("mch-ip", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((DSPayOrder) obj).getColCustUserId() + "_" + ((DSPayOrder) obj).getIp();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String userIp = order.getIp();
                        String colCustUserId = order.getColCustUserId();
                        String productId = order.getProduct();
                        return notNull(userIp) && notNull(colCustUserId) && ("FE".equals(productId) || "NOCARDPAY".equals(productId));
                    }
                }).setExpireMode("24ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return new MergeableMapObject(order.getProduct(), new CountNumber(1));
                    }
                }).init();
    }

    public static NormDefine test() {
        return NormDefineBuilder.createNorm("EPOS同商户同IP在(N)小时内产品【NOCARDPAY,FE】累积交易次数(含当笔)").selectCachedRecord("mch-ip", "PAY.EPOS")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((DSPayOrder) obj).getColCustUserId() + "_" + ((DSPayOrder) obj).getIp();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String userIp = order.getIp();
                        String colCustUserId = order.getColCustUserId();
                        String productId = order.getProduct();
                        return notNull(userIp) && "EPOS".equals(order.getOrderChnl()) && notNull(colCustUserId) && ("FE".equals(productId) || "NOCARDPAY".equals(productId));
                    }
                }).setExpireMode("24ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return new MergeableMapObject(order.getProduct(), new CountNumber(1));
                    }
                }).init();
    }

    public static NormDefine test4() {
        return NormDefineBuilder.createNorm("近【30】天总体成功交易金额").selectCachedRecord("bizCode", "PAY.OFFLINE")
                .setObjectType(OfflineDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        String production = ((OfflineDSPayOrder) obj).getProduction();
                        String[] biz = production.split("_");
                        return biz [1];
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


}
