package com.zhang.bruce.general.cach;

import com.tcredit.streaming.core.api.Mergeable;
import com.tcredit.streaming.core.bean.method.DistinctedListObject;
import com.tcredit.streaming.core.bean.method.MergeableMapObject;
import com.tcredit.streaming.core.model.DefaultModel;
import com.tcredit.streaming.core.norm.define.*;

import java.util.Date;

import static com.zhang.bruce.general.cach.TestEngine.notNull;
import static com.zhang.bruce.general.cach.TestEngine.parseToDate;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/4/6 6:51 下午
 */
public class TestDefaultMode {
    public static void main(String[] args) {

    }
    public static NormDefine test() {
        return NormDefineBuilder.createNorm("父商户下子商户近180天触发商户账户规则个数").selectCachedRecord("mchid", "PAY.REMIT")
                .setObjectType(DefaultModel .class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return (String)order.get("systemMerchantNo");
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        String merchantno = (String)order.get("merchantNo");
                        String parentMerchanId = (String)order.get("systemMerchantNo");
                        String  occurTime = (String)order.get("occurTime");
                        String tradeTableName  = (String)order.get("tradeTableName");
                        return ( notNull(merchantno)  && notNull(parentMerchanId)  && notNull(occurTime)  &&
                                "TBL_MERCHANT_CHECKLIST".equals(tradeTableName)
                        );
                    }
                }).setExpireMode("180pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        String  occurTime = (String)order.get("occurTime");
                        return parseToDate(occurTime,"yyyy-MM-dd HH:mm:ss");
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        String ruleCode = (String)order.get("ruleCode");
                        String merchantno = (String)order.get("merchantNo");
                        MergeableMapObject map = new MergeableMapObject();
                        if(notNull(ruleCode)){
                            for(String value : ruleCode.split(",")){
                                map.put(value,new DistinctedListObject(merchantno));
                            }
                        }
                        return map;
                    }
                }).init();
    }

}
