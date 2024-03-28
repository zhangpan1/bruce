package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tcredit.streaming.core.api.Mergeable;
import com.tcredit.streaming.core.bean.method.CountNumber;
import com.tcredit.streaming.core.bean.method.DistinctedListObject;
import com.tcredit.streaming.core.bean.method.MergeableMapObject;
import com.tcredit.streaming.core.bean.method.SumNumber;
import com.tcredit.streaming.core.model.DSPayOrder;
import com.tcredit.streaming.core.model.OfflineDSPayOrder;
import com.tcredit.streaming.core.norm.define.*;
import com.tcredit.streaming.core.utils.LoggerUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

import static com.zhang.bruce.rule.FunctionTest.isNull;
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
    public static NormDefine test5() {
        return NormDefineBuilder.createNorm("同终端近24小时线上交易归属省|市列表").selectCachedRecord("pos-all", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((DSPayOrder) obj).getPosId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String latLonPrv = "";
                        String latLonCity = "";
                        String latLonAddr = getStringByJsonSimple(order.getGoodsInfo(), "latLonAddr");
                        if (StringUtils.isNotBlank(latLonAddr)){
                            latLonPrv = getStringByJsonSimple(latLonAddr,"province");
                            latLonCity = getStringByJsonSimple(latLonAddr,"city");
                        }
                        String baseLocationPrv = "";
                        String baseLocationCity = "";
                        String baseLocationAddr = getStringByJsonSimple(order.getGoodsInfo(), "baseLocationAddr");
                        if (StringUtils.isNotBlank(baseLocationAddr)){
                            baseLocationPrv = getStringByJsonSimple(baseLocationAddr,"province");
                            baseLocationCity = getStringByJsonSimple(baseLocationAddr,"city");
                        }
                        String ipPrv = order.getIpPrv();
                        String ipCity = order.getIpCity();

                        return  notNull(order.getPosId())
                                && (isNotNullPlus(latLonPrv)||isNotNullPlus(baseLocationPrv)||isNotNullPlus(ipPrv))
                                && (isNotNullPlus(baseLocationCity)||isNotNullPlus(latLonCity)||isNotNullPlus(ipCity));
                    }
                }).setExpireMode("72ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String latLonPrv = "";
                        String latLonCity = "";
                        String latLonAddr = getStringByJsonSimple(order.getGoodsInfo(), "latLonAddr");
                        if (StringUtils.isNotBlank(latLonAddr)){
                            latLonPrv = getStringByJsonSimple(latLonAddr,"province");
                            latLonCity = getStringByJsonSimple(latLonAddr,"city");
                        }
                        String baseLocationPrv = "";
                        String baseLocationCity = "";
                        String baseLocationAddr = getStringByJsonSimple(order.getGoodsInfo(), "baseLocationAddr");
                        if (StringUtils.isNotBlank(baseLocationAddr)){
                            baseLocationPrv = getStringByJsonSimple(baseLocationAddr,"province");
                            baseLocationCity = getStringByJsonSimple(baseLocationAddr,"city");
                        }
                        String ipPrv = order.getIpPrv();
                        String ipCity = order.getIpCity();

                        String finalPrv = "";
                        String finalCity = "";
                        if (isNotNullPlus(latLonPrv)){
                            finalPrv = latLonPrv;
                        }else if (isNotNullPlus(baseLocationPrv)){
                            finalPrv = baseLocationPrv;
                        }else {
                            finalPrv = ipPrv;
                        }
                        if (isNotNullPlus(latLonPrv)){
                            finalCity = latLonCity;
                        }else if (isNotNullPlus(baseLocationPrv)){
                            finalCity = baseLocationCity;
                        }else {
                            finalCity = ipCity;
                        }
                        if (finalPrv.contains("省")) {
                            finalPrv = finalPrv.replace("省","");
                        }
                        if (finalCity.contains("省")) {
                            finalCity = finalCity.replace("市","");
                        }
                        MergeableMapObject mapObject = new MergeableMapObject();
                        mapObject.put("省", new DistinctedListObject(finalPrv));
                        mapObject.put("市", new DistinctedListObject(finalCity));
                        return mapObject;
                    }
                }).init();
    }
    static String getStringByJsonSimple(Object jsonArrayObj, Object key) {
        try {
            LoggerUtil.getLogger().error("getStringByJsonSimple jsonArrayObj=={}", jsonArrayObj);
            LoggerUtil.getLogger().error("getStringByJsonSimple key=={}", key);
            if (isNull(jsonArrayObj) || isNull(key)) {
                return "";
            }
            String jsonStr = jsonArrayObj.toString();
            if (!(jsonStr.contains("{") && jsonStr.contains("}"))) {
                return "";
            }
            String keyStr = key.toString();
            JSONObject jsonObj =  JSON.parseObject(jsonStr);
            if (jsonObj != null && jsonObj.containsKey(keyStr)) {
                Object resultObj = jsonObj.getString(keyStr);
                if(resultObj!=null){
                    return resultObj.toString();

                }
            }
            return "";
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getStringByJsonSimple 全局方法出现异常", e);
            return "";
        }
    }
    static boolean isNotNullPlus (Object obj){
        try {
            LoggerUtil.getLogger().debug("isNotNullPlus,obj == {}", obj);
            if(obj == null){
                return false;
            }
            if(!"".equals(obj.toString().trim()) && !"null".equals(obj.toString().trim().toLowerCase()) && !"[]".equals(obj.toString().trim()) && !"{}".equals(obj.toString().trim())){
                return true;
            }
            return false;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法isNotNullPlus出现异常", e);
            return false;
        }
    }


}
