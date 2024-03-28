package com.zhang.bruce.datare;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yeepay.g3.utils.common.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/5/11 8:06 下午
 */
public class TestBrucc {
    public static void main(String[] args) {
        String requestJson = "[{\"frms_bank_type\":\"BANK\",\"frms_is_member\":\"0\",\"frms_pre_phone_no\":\"165****5864\",\"frms_cardhold_name\":\"\",\"frms_terminal_type\":\"IMEI\",\"frms_legalName\":\"王**\",\"frms_user_id\":\"\",\"frms_settle_cards\":\"46001003436050001978;46001002536053042069;622060100100061073\",\"frms_trans_year\":\"2023\",\"frms_goods_end_city\":\"PEK;\",\"frms_trans_vol\":1113000,\"frms_legalIdNo\":\"110105********7119\",\"frms_id_no\":\"341124********6813\",\"frms_person_start_time\":1683799800000,\"frms_person_phone_no\":\"151****8595;\",\"frms_smsNoStatus\":\"\",\"frms_systemMerchantNo\":\"\",\"frms_person_id_type\":\"IDCARD;\",\"frms_mch_id\":\"10012419847\",\"frms_cabin_level\":\"V;\",\"frms_rule_prod\":\"EPOS\",\"frms_biz_code\":\"EPOS\",\"frms_phone_no\":\"187****6336\",\"frms_single_flight\":\"null;\",\"frms_trans_time\":1683785091949,\"frms_consume_num\":\"1;\",\"frms_card_type\":\"CREDIT\",\"frms_order_type\":\"SALE\",\"frms_subBizcatName\":\"航空公司\",\"frms_contact_phone_no\":\"151****8595\",\"frms_seq_id\":\"YP2305111404511113782\",\"frms_person_id_no\":\"130823********5634;\",\"frms_collectionAmt\":\"0\",\"frms_start_consume_time\":1683799800000,\"frms_openProduct\":\"\",\"frms_uuid\":\"d315fbb3-192b-412e-a19a-8f8993c26c3a\",\"frms_bank_id\":\"SZPA\",\"frms_finalResult\":\"航旅\",\"frms_customer_way\":\"INTERFACE_CREDIT_AUTHANDCONFIRM\",\"frms_bank_card_no\":\"526855****6770\",\"frms_sign_subject\":\"海南航空控股股份有限公司\",\"frms_bank_channelId\":\"\",\"frms_end_consume_time\":1683810900000,\"frms_prisk_teminal_code\":\"10015027202001\",\"frms_signType\":\"ENTERPRISE\",\"frms_bizcatCode\":\"124\",\"frms_shareholderName\":\"社会公众股（A股）\",\"frms_mode\":\"\",\"frms_application_mode\":\"VOS\",\"frms_subBizcatCode\":\"124005\",\"frms_product_id\":\"EPOS\",\"frms_order_id\":\"C202305110001356\",\"frms_signName\":\"海南航空控股股份有限公司\",\"frms_goods_industry\":\"航旅事业部\",\"frms_product\":\"NOCARDPAY\",\"frms_id_type\":\"\",\"frms_bizcatName\":\"航旅\",\"frms_goodsNum\":\"1\",\"frms_interval\":\"null;\",\"frms_goods_start_city\":\"SZX;\",\"frms_merchantContactName\":\"陈力\",\"frms_goods_info\":\"{\\\"customerEmgContact\\\":\\\"n**;\\\",\\\"merchantRetCode\\\":\\\"0000\\\",\\\"goodsPersonNum\\\":\\\"1;\\\",\\\"sCity\\\":\\\"SZX;\\\",\\\"isMember\\\":\\\"0\\\",\\\"flightSingle\\\":\\\"null;\\\",\\\"priskTerminalCode\\\":\\\"10015027202001\\\",\\\"legalName\\\":\\\"王**\\\",\\\"subBizcatName\\\":\\\"航空公司\\\",\\\"customerSign\\\":\\\"KHQY5161860815\\\",\\\"merchantContactName\\\":\\\"陈力\\\",\\\"customerEmail\\\":\\\"null;\\\",\\\"openProduct\\\":\\\"\\\",\\\"signType\\\":\\\"ENTERPRISE\\\",\\\"bizcatName\\\":\\\"航旅\\\",\\\"sTime\\\":\\\"2023-05-11 18:10:00;\\\",\\\"customerIdNo\\\":\\\"130823********5634;\\\",\\\"finalResultSub\\\":\\\"航空公司\\\",\\\"merchantRole\\\":\\\"ORDINARY_MERCHANT\\\",\\\"systemMerchantNo\\\":\\\"\\\",\\\"contactName\\\":\\\"女**\\\",\\\"signSubject\\\":\\\"海南航空控股股份有限公司\\\",\\\"subBizcatCode\\\":\\\"124005\\\",\\\"ypMerchantType\\\":\\\"CUSTOMER\\\",\\\"shareholderName\\\":\\\"社会公众股（A股）\\\",\\\"customerName\\\":\\\"于**;\\\",\\\"initMode\\\":\\\"VOS\\\",\\\"terminalType\\\":\\\"IMEI\\\",\\\"flightNo\\\":\\\"HU7712;\\\",\\\"customerEmgContactNo\\\":\\\"null;\\\",\\\"settleBankCards\\\":\\\"460010****1978;46001002536053042069;622060100100061073\\\",\\\"flightCabin\\\":\\\"V;\\\",\\\"merchantCreateTime\\\":\\\"2014-10-16 10:12:54\\\",\\\"predeterminePhone\\\":\\\"165****5864\\\",\\\"industry\\\":\\\"航旅事业部\\\",\\\"merchantInfoCity\\\":\\\"海口\\\",\\\"isLLAMEX\\\":\\\"false\\\",\\\"customerNation\\\":\\\"null;\\\",\\\"customerPhone\\\":\\\"151****8595;\\\",\\\"merchantInfoProvince\\\":\\\"海南\\\",\\\"customerIdType\\\":\\\"IDCARD;\\\",\\\"goodsNum\\\":\\\"1\\\",\\\"eCity\\\":\\\"PEK;\\\",\\\"salesType\\\":\\\"DIRECT_SALES\\\",\\\"merchantInfoAddress\\\":\\\"美兰区国兴大道7号\\\",\\\"signName\\\":\\\"海南航空控股股份有限公司\\\",\\\"eTime\\\":\\\"2023-05-11 21:15:00;\\\",\\\"customerGender\\\":\\\"null;\\\",\\\"legalIdNo\\\":\\\"110105********7119\\\",\\\"cardSubject\\\":\\\"110105****7119\\\",\\\"flightInterval\\\":\\\"null;\\\",\\\"uniCrdCode\\\":\\\"914600006200251612\\\",\\\"smsNoStatus\\\":\\\"\\\",\\\"contactPhone\\\":\\\"151****8595\\\",\\\"finalResult\\\":\\\"航旅\\\",\\\"bizcatCode\\\":\\\"124\\\"}\",\"frms_card_subject\":\"110105196307097119\"}] ";
        List<Map<String,Object>> listObject = (List<Map<String,Object>>) JSONArray.parse(requestJson);
        if (CollectionUtils.isNotEmpty(listObject)) {
            // 拿到过规则对象
            Map<String,Object> mapList  = listObject.get(0);
            String prod = (String) mapList.get("frms_product");
            Integer vol = (Integer) mapList.get("frms_trans_vol");
            String biz = (String) mapList.get("frms_biz_code");
            String bankType = (String) mapList.get("frms_bank_type");
            if ("NOCARDPAY".equals(prod) && vol >= 1000000) {
                if ("EPOS".equals(biz) && !"BANK".equals(bankType)){
                    return;
                }
                // 拿到goodInfo
                JSONObject object = JSONObject.parseObject((String) mapList.get("frms_goods_info"));
                if (object.containsKey("finalResultSub") && object.containsKey("finalResult")) {
                    String finalResultSub = object.getString("finalResultSub");
                    String finalResult = object.getString("finalResult");
                    if ("航空公司".equals(finalResultSub) && "航旅".equals(finalResult)) {


                    }
                }
            }

        }
    }
    public static String paserMapToJson (Map<String,Object> requestMap) {
        List<Map<String,Object>> list = new ArrayList<>();
        list.add(requestMap);
        return JSON.toJSONString(list);
    }
}
