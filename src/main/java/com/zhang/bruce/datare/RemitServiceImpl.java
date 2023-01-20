package com.zhang.bruce.datare;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.yeepay.g3.utils.common.UUIDUtils;
import com.yeepay.g3.utils.gmcrypt.utils.SMUtils;
import com.zhang.bruce.config.DataSourceConstants;
import com.zhang.bruce.easyexcel.GptRemitOrder;
import com.zhang.bruce.easyexcel.TblGptRemitOrder;
import com.zhang.bruce.general.DateUtils;
import com.zhang.bruce.general.mysql.GptRemitOrderMapper;
import com.zhang.bruce.general.mysql.TblGptRemitOrderMapper;
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
 * @date: 2023/1/19 6:27 下午
 */
@Service
public class RemitServiceImpl implements RemitService{
    @Autowired
    private GptRemitOrderMapper gptRemitOrderMapper;
    @Autowired
    private TblGptRemitOrderMapper tblGptRemitOrderMapper;


    @Override
    public void saveDataBusines() {
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.GPTBUSINESS);
            List<GptRemitOrder> gptTdOrderDetails = buildOrderDetail();
            for (GptRemitOrder gp : gptTdOrderDetails) {
                gptRemitOrderMapper.insertSelective(gp);
            }
        } finally {
            DynamicDataSourceContextHolder.poll();
        }
    }

    private List<GptRemitOrder> buildOrderDetail() {
        List<GptRemitOrder> details = Lists.newArrayList();
        for (int i = 0; i < 40; i++) {
            GptRemitOrder gptRemitOrder = new GptRemitOrder();
            String seqId = UUIDUtils.randomV4UUID();
            gptRemitOrder.setProductCode("WITHDRAW");
            gptRemitOrder.setDataSource("1");
            gptRemitOrder.setBusinessCode("");
            gptRemitOrder.setSequenceId(seqId);
            gptRemitOrder.setRequestId(getUUID(true));
            gptRemitOrder.setMerchantNo("10000211798");
            gptRemitOrder.setSignName("萃华金店测试");
            gptRemitOrder.setSignNameEn("brucesssfsfsfsfsfsfsfsfs");
            gptRemitOrder.setMerchantKyc("疑似CRE");
            gptRemitOrder.setMerchantKycSub("疑似CRE");
            gptRemitOrder.setIpAddress("192.168.2.1");
            gptRemitOrder.setIpArea("河南");
            gptRemitOrder.setIpProxy("是");
            gptRemitOrder.setDeclareId(getUUID(true));
            String s = SMUtils.encrypt("百货五金");
            gptRemitOrder.setSupplierName(s);
            gptRemitOrder.setSupplierNameDigest(SMUtils.calculateDigest("百货五金"));
            gptRemitOrder.setAllotType("1");
            gptRemitOrder.setIsSettlement("Y");
            gptRemitOrder.setAccountName("不知道什么东西");
            gptRemitOrder.setCurrency("CNY");
            gptRemitOrder.setTradeMode("B2B");
            gptRemitOrder.setPayResult("0");
            gptRemitOrder.setAmount(new BigDecimal(9842.3));
            gptRemitOrder.setCnyAmount(new BigDecimal(97873.2));

            String payerName = SMUtils.encrypt("钟大名");
            gptRemitOrder.setSellerName(payerName);
            String payIdCard = SMUtils.encrypt("6237972335421");
            gptRemitOrder.setSellerIdCard(payIdCard);
            gptRemitOrder.setSellerIdCardArea("东南亚");
            gptRemitOrder.setReceiverType("1");

            gptRemitOrder.setReceiverIdCard(SMUtils.encrypt("6237972335421"));
            gptRemitOrder.setReceiverIdCardDigest(SMUtils.calculateDigest("6237972335421"));
            gptRemitOrder.setReceiverIdCardArea("乌克兰");
            gptRemitOrder.setReceiverBankCardId(SMUtils.encrypt("6237972335421"));
            gptRemitOrder.setReceiverBankCardIdDigest(SMUtils.calculateDigest("6237972335421"));
            gptRemitOrder.setReceiverName(SMUtils.encrypt("钟大名"));
            gptRemitOrder.setReceiverNameDigest(SMUtils.calculateDigest("钟大名"));

            gptRemitOrder.setReceiverBankNameBs("咚咚咚跑是颠三倒四");

            gptRemitOrder.setReceiverCountryNameEn("北京");
            gptRemitOrder.setRemark("fsfsfsfsfs0");
            String bankCard = SMUtils.encrypt("23358279661");


            String ph = SMUtils.encrypt("13185609813");

            gptRemitOrder.setCurrency("RMB");


            gptRemitOrder.setOccurTime(new Date());


            gptRemitOrder.setRemark("小西瓜圆又圆");
            gptRemitOrder.setRuleCodes("MEC_NO_001");

            gptRemitOrder.setPayResult("1");
            gptRemitOrder.setOccurTime(DateUtils.getAfBeDayDate(new Date(), 0));
            gptRemitOrder.setCompleteTime(DateUtils.getAfBeDayDate(new Date(), 0));
            gptRemitOrder.setUpdateTime(DateUtils.getAfBeDayDate(new Date(), 0));
            gptRemitOrder.setCreateTime(DateUtils.getAfBeDayDate(new Date(), 0));

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

    @Override
    public void saveDataTldb() {
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.FKJS);
            List<TblGptRemitOrder> gptTdOrderDetails = buildTDOrderDetail();
            for (TblGptRemitOrder tdOrderDetail : gptTdOrderDetails) {
                tblGptRemitOrderMapper.insertSelective(tdOrderDetail);
            }
        } finally {
            DynamicDataSourceContextHolder.poll();
        }
    }

    private List<TblGptRemitOrder> buildTDOrderDetail() {
        List<TblGptRemitOrder> details = Lists.newArrayList();
        for (int i = 0; i < 40; i++) {
            TblGptRemitOrder gptRemitOrder = new TblGptRemitOrder();

            String seqId = UUIDUtils.randomV4UUID();
            gptRemitOrder.setProductCode("WITHDRAW");
            gptRemitOrder.setDataSource("1");
            gptRemitOrder.setBusinessCode("");
            gptRemitOrder.setSequenceId(seqId);
            gptRemitOrder.setRequestId(getUUID(true));
            gptRemitOrder.setMerchantNo("10000211798");
            gptRemitOrder.setSignName("萃华金店测试");
            gptRemitOrder.setSignNameEn("brucesssfsfsfsfsfsfsfsfs");
            gptRemitOrder.setMerchantKyc("疑似CRE");
            gptRemitOrder.setMerchantKycSub("疑似CRE");
            gptRemitOrder.setIpAddress("192.168.2.1");
            gptRemitOrder.setIpArea("河南");
            gptRemitOrder.setIpProxy("是");
            gptRemitOrder.setDeclareId(getUUID(true));
            String s = SMUtils.encrypt("百货五金");
            gptRemitOrder.setSupplierName(s);
            gptRemitOrder.setSupplierNameDigest(SMUtils.calculateDigest("百货五金"));
            gptRemitOrder.setAllotType("1");
            gptRemitOrder.setIsSettlement("Y");
            gptRemitOrder.setAccountName("不知道什么东西");
            gptRemitOrder.setCurrency("CNY");
            gptRemitOrder.setTradeMode("B2B");
            gptRemitOrder.setPayResult("0");
            gptRemitOrder.setAmount(new BigDecimal(9842.3));
            gptRemitOrder.setCnyAmount(new BigDecimal(97873.2));

            String payerName = SMUtils.encrypt("钟大名");
            gptRemitOrder.setSellerName(payerName);
            String payIdCard = SMUtils.encrypt("6237972335421");
            gptRemitOrder.setSellerIdCard(payIdCard);
            gptRemitOrder.setSellerIdCardArea("东南亚");
            gptRemitOrder.setReceiverType("1");

            gptRemitOrder.setReceiverIdCard(SMUtils.encrypt("6237972335421"));
            gptRemitOrder.setReceiverIdCardDigest(SMUtils.calculateDigest("6237972335421"));
            gptRemitOrder.setReceiverIdCardArea("乌克兰");
            gptRemitOrder.setReceiverBankCardId(SMUtils.encrypt("6237972335421"));
            gptRemitOrder.setReceiverBankCardIdDigest(SMUtils.calculateDigest("6237972335421"));
            gptRemitOrder.setReceiverName(SMUtils.encrypt("钟大名"));
            gptRemitOrder.setReceiverNameDigest(SMUtils.calculateDigest("钟大名"));

            gptRemitOrder.setReceiverBankNameBs("咚咚咚跑是颠三倒四");

            gptRemitOrder.setReceiverCountryNameEn("北京");
            gptRemitOrder.setRemark("fsfsfsfsfs0");
            String bankCard = SMUtils.encrypt("23358279661");


            String ph = SMUtils.encrypt("13185609813");

            gptRemitOrder.setCurrency("RMB");


            gptRemitOrder.setOccurTime(new Date());


            gptRemitOrder.setRemark("小西瓜圆又圆");
            gptRemitOrder.setRuleCodes("MEC_NO_001");

            gptRemitOrder.setPayResult("1");
            gptRemitOrder.setOccurTime(DateUtils.getAfBeDayDate(new Date(), -4));
            gptRemitOrder.setCompleteTime(DateUtils.getAfBeDayDate(new Date(), -4));
            gptRemitOrder.setUpdateTime(DateUtils.getAfBeDayDate(new Date(), -4));
            gptRemitOrder.setCreateTime(DateUtils.getAfBeDayDate(new Date(), -4));
            details.add(gptRemitOrder);
        }
        return details;
    }
}
