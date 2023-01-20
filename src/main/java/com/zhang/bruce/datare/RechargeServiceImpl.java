package com.zhang.bruce.datare;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.yeepay.g3.utils.common.UUIDUtils;
import com.yeepay.g3.utils.gmcrypt.utils.SMUtils;
import com.zhang.bruce.config.DataSourceConstants;
import com.zhang.bruce.easyexcel.GptRechargeOrder;
import com.zhang.bruce.easyexcel.TblGptRechargeOrder;
import com.zhang.bruce.general.DateUtils;
import com.zhang.bruce.general.mysql.GptRechargeOrderMapper;
import com.zhang.bruce.general.mysql.TblGptRechargeOrderMapper;
import org.apache.commons.compress.utils.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/1/19 8:03 下午
 */
@Service
public class RechargeServiceImpl implements RechargeService{
    @Autowired
    private GptRechargeOrderMapper gptRechargeOrderMapper;
    @Autowired
    private TblGptRechargeOrderMapper tblGptRechargeOrderMapper;
    @Override
    public void saveDataBusines() {
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.GPTBUSINESS);
            List<GptRechargeOrder> gptTdOrderDetails = buildOrderDetail();
            for (GptRechargeOrder gp : gptTdOrderDetails) {
                gptRechargeOrderMapper.insertSelective(gp);
            }
        } finally {
            DynamicDataSourceContextHolder.poll();
        }
    }

    private List<GptRechargeOrder> buildOrderDetail() {
        List<GptRechargeOrder> details = Lists.newArrayList();
        for (int i = 0; i < 40; i++) {
            GptRechargeOrder gptRemitOrder = new GptRechargeOrder();
            String seqId = UUIDUtils.randomV4UUID();
            gptRemitOrder.setProductCode("RECHARGE");
            gptRemitOrder.setRechargeType("ORDER_MATCH");

            gptRemitOrder.setSequenceId(seqId);
            gptRemitOrder.setRequestId(getUUID(true));
            gptRemitOrder.setMerchantNo("10000211798");
            gptRemitOrder.setSignName("萃华金店测试");
            gptRemitOrder.setSignNameEn("brucesssfsfsfsfsfsfsfsfs");

            gptRemitOrder.setIpAddress("192.168.2.1");
            gptRemitOrder.setIpArea("河南");
            gptRemitOrder.setIpProxy("是");


            gptRemitOrder.setCurrency("CNY");

            gptRemitOrder.setPayResult("0");
            gptRemitOrder.setAmount(new BigDecimal(9842.3));
            gptRemitOrder.setCnyAmount(new BigDecimal(97873.2));


            gptRemitOrder.setTargetAmount(new BigDecimal(9842.3));
            gptRemitOrder.setTargetCnyAmount(new BigDecimal(97873.2));
            gptRemitOrder.setTargetCurrency("USA");

            gptRemitOrder.setPayerType("1");

            String payerName = SMUtils.encrypt("钟大名");
            gptRemitOrder.setPayerName(payerName);
            gptRemitOrder.setPayerNameDigest(SMUtils.calculateDigest("钟大名"));

            String payIdCard = SMUtils.encrypt("6237972335421");
            gptRemitOrder.setPayerBankCardId(payIdCard);
            gptRemitOrder.setPayerBankCardIdDigest(SMUtils.calculateDigest("6237972335421"));
            gptRemitOrder.setPayerBankName("东南亚银行");

            gptRemitOrder.setPayerCountryNameZh("大东北去三亚");
            gptRemitOrder.setPayerBankCardArea("dddssds");

            gptRemitOrder.setReceiverBankCardId(SMUtils.encrypt("6237972335421"));



            gptRemitOrder.setReceiverBankNameBs("咚咚咚跑是颠三倒四");


            gptRemitOrder.setRemark("fsfsfsfsfs0");
            String bankCard = SMUtils.encrypt("23358279661");


            String ph = SMUtils.encrypt("13185609813");

            gptRemitOrder.setCurrency("RMB");


            gptRemitOrder.setOccurTime(new Date());


            gptRemitOrder.setRemark("小西瓜圆又圆");
            gptRemitOrder.setRuleCodes("MEC_NO_001");

            gptRemitOrder.setPayResult("0");
            gptRemitOrder.setOccurTime(DateUtils.getAfBeDayDate(new Date(), 0));

            gptRemitOrder.setUpdateTime(DateUtils.getAfBeDayDate(new Date(), 0));
            gptRemitOrder.setCreateTime(DateUtils.getAfBeDayDate(new Date(), 0));

            details.add(gptRemitOrder);
        }
        return details;
    }

    @Override
    public void saveDataTldb() {
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.FKJS);
            List<TblGptRechargeOrder> gptTdOrderDetails = buildTDOrderDetail();
            for (TblGptRechargeOrder tdOrderDetail : gptTdOrderDetails) {
                tblGptRechargeOrderMapper.insertSelective(tdOrderDetail);
            }
        } finally {
            DynamicDataSourceContextHolder.poll();
        }
    }

    private List<TblGptRechargeOrder> buildTDOrderDetail() {
        List<TblGptRechargeOrder> details = Lists.newArrayList();
        for (int i = 0; i < 40; i++) {
            TblGptRechargeOrder gptRemitOrder = new TblGptRechargeOrder();
            String seqId = UUIDUtils.randomV4UUID();
            gptRemitOrder.setProductCode("RECHARGE");
            gptRemitOrder.setRechargeType("ORDER_MATCH");

            gptRemitOrder.setSequenceId(seqId);
            gptRemitOrder.setRequestId(getUUID(true));
            gptRemitOrder.setMerchantNo("10000211798");
            gptRemitOrder.setSignName("萃华金店测试");
            gptRemitOrder.setSignNameEn("brucesssfsfsfsfsfsfsfsfs");

            gptRemitOrder.setIpAddress("192.168.2.1");
            gptRemitOrder.setIpArea("河南");
            gptRemitOrder.setIpProxy("是");


            gptRemitOrder.setCurrency("CNY");

            gptRemitOrder.setPayResult("0");
            gptRemitOrder.setAmount(new BigDecimal(9842.3));
            gptRemitOrder.setCnyAmount(new BigDecimal(97873.2));


            gptRemitOrder.setTargetAmount(new BigDecimal(9842.3));
            gptRemitOrder.setTargetCnyAmount(new BigDecimal(97873.2));
            gptRemitOrder.setTargetCurrency("USA");

            gptRemitOrder.setPayerType("1");

            String payerName = SMUtils.encrypt("钟大名");
            gptRemitOrder.setPayerName(payerName);
            gptRemitOrder.setPayerNameDigest(SMUtils.calculateDigest("钟大名"));

            String payIdCard = SMUtils.encrypt("6237972335421");
            gptRemitOrder.setPayerBankCardId(payIdCard);
            gptRemitOrder.setPayerBankCardIdDigest(SMUtils.calculateDigest("6237972335421"));
            gptRemitOrder.setPayerBankName("东南亚银行");

            gptRemitOrder.setPayerCountryNameZh("大东北去三亚");
            gptRemitOrder.setPayerBankCardArea("dddssds");

            gptRemitOrder.setReceiverBankCardId(SMUtils.encrypt("6237972335421"));



            gptRemitOrder.setReceiverBankNameBs("咚咚咚跑是颠三倒四");


            gptRemitOrder.setRemark("fsfsfsfsfs0");
            String bankCard = SMUtils.encrypt("23358279661");


            String ph = SMUtils.encrypt("13185609813");

            gptRemitOrder.setCurrency("RMB");


            gptRemitOrder.setOccurTime(new Date());


            gptRemitOrder.setRemark("小西瓜圆又圆");
            gptRemitOrder.setRuleCodes("MEC_NO_001");

            gptRemitOrder.setPayResult("0");
            gptRemitOrder.setOccurTime(DateUtils.getAfBeDayDate(new Date(), -4));

            gptRemitOrder.setUpdateTime(DateUtils.getAfBeDayDate(new Date(), -4));
            gptRemitOrder.setCreateTime(DateUtils.getAfBeDayDate(new Date(), -4));
            details.add(gptRemitOrder);
        }
        return details;
    }

    public static String getUUID(boolean isFilter) {
        if (isFilter) {
            return UUID.randomUUID().toString().replaceAll("-", "");
        }
        return UUID.randomUUID().toString();
    }
}
