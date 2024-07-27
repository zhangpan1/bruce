package com.zhang.bruce.general.cache2;

import com.tcredit.streaming.core.api.Mergeable;
import com.tcredit.streaming.core.bean.method.DistinctedListObject;
import com.tcredit.streaming.core.bean.method.SumNumber;
import com.tcredit.streaming.core.model.DSPayOrder;
import com.tcredit.streaming.core.model.RemitDSPayOrder;
import com.tcredit.streaming.core.norm.define.*;

import java.util.Date;

import static com.zhang.bruce.general.cach.TestRemitEngine.getBackUpValue;
import static com.zhang.bruce.rule.FunctionTest.notNull;

/**
 * @description: 保障金条件测试
 * @email: pan.zhang@yeepay.com
 * @date: 2024/7/25 3:06 下午
 */
public class TestBail {
    public static void main(String[] args) {

    }

    public static NormDefine task1() {
        return NormDefineBuilder.createNorm("10090332896截止昨日成功付款人姓名成功充值金额").selectCachedRecord("payerName", "ALL")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String merchantId = order.getColCustUserId();
                        String payerName = getBackUpValue(order.getBackUp(), "payerName");
                        return merchantId + "_" + payerName;
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String payerName = getBackUpValue(order.getBackUp(), "payerName");
                        String mechantId = order.getColCustUserId();
                        return "BOOK_ADVANCE".equals(order.getProduct()) && "MEC_BALANCE_PAYMENT_BOOK_ADVANCE".equals(order.getOrderChnl())
                                && notNull(order.getColCustUserId())
                                && notNull(payerName)
                                && notNull(mechantId)
                                && "10090332896".equals(mechantId)
                                && "1".equals(order.getStatus());
                    }
                }).setExpireMode("3pd").setObjectDate(new DateItem() {
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

    public static NormDefine task2() {
        return NormDefineBuilder.createNorm("10090332896截止昨日成功收款账户成功代付金额").selectCachedRecord("bankCardNo", "ALL")
                .setObjectType(RemitDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        String merchantId = order.getMecNo();
                        String bankCardNo = order.getBankCardName();
                        return merchantId + "_" + bankCardNo;
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        String merchantId = order.getMecNo();
                        //只累计DFDF
                        return notNull(order.getBankCardName()) && "1".equals(order.getStatus())
                                && "DFDF".equals(order.getProd()) &&  "10090332896".equals(merchantId);
                    }
                }).setExpireMode("3pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((RemitDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        return new SumNumber(order.getAmt());
                    }
                }).init();
    }
    public static NormDefine task3() {
        return NormDefineBuilder.createNorm("10090332896截止当前时间同记帐簿充值账户名").selectCachedRecord("bookNo", "ALL")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String merchantId = order.getColCustUserId();
                        String bookNo = getBackUpValue(order.getBackUp(), "bookNo");
                        return merchantId + "_" + bookNo;
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String payerName = getBackUpValue(order.getBackUp(), "payerName");
                        String mechantId = order.getColCustUserId();
                        String bookNo = getBackUpValue(order.getBackUp(), "bookNo");
                        return "BOOK_ADVANCE".equals(order.getProduct()) && "MEC_BALANCE_PAYMENT_BOOK_ADVANCE".equals(order.getOrderChnl())
                                && notNull(order.getColCustUserId())
                                && notNull(payerName)
                                && notNull(bookNo)
                                && notNull(mechantId)
                                && "10090332896".equals(mechantId)
                                && "1".equals(order.getStatus());
                    }
                }).setExpireMode("3pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String payerName = getBackUpValue(order.getBackUp(), "payerName");
                        return new DistinctedListObject(payerName);
                    }
                }).init();
    }

}
