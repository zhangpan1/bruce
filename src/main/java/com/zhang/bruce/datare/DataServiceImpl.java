package com.zhang.bruce.datare;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.yeepay.g3.utils.common.UUIDUtils;
import com.yeepay.g3.utils.gmcrypt.utils.SMUtils;
import com.zhang.bruce.config.DataSourceConstants;
import com.zhang.bruce.easyexcel.GptTdOrderDetail;
import com.zhang.bruce.easyexcel.TblGptTdOrderDetail;
import com.zhang.bruce.general.DateUtils;
import com.zhang.bruce.general.mysql.GptTdOrderDetailMapper;
import com.zhang.bruce.general.mysql.TblGptTdOrderDetailMapper;
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
 * @date: 2023/1/12 3:25 下午
 */
@Service
public class DataServiceImpl implements DataService{
    @Autowired
    private GptTdOrderDetailMapper gptTdOrderDetailMapper;
    @Autowired
    private TblGptTdOrderDetailMapper tblGptTdOrderDetailMapper;


    @Override
    public void saveDataBusines() {
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.GPTBUSINESS);
            List<GptTdOrderDetail> gptTdOrderDetails = buildOrderDetail();
            for (GptTdOrderDetail gp : gptTdOrderDetails) {
                gptTdOrderDetailMapper.insertSelective(gp);
            }
        }finally {
            DynamicDataSourceContextHolder.poll();
        }
    }

    private List<GptTdOrderDetail> buildOrderDetail() {
        List<GptTdOrderDetail>  details= Lists.newArrayList();
        for (int i = 0 ; i < 40; i ++){
            GptTdOrderDetail gptTdOrderDetail = new GptTdOrderDetail();
            String seqId = UUIDUtils.randomV4UUID();
            gptTdOrderDetail.setOrderId(seqId);
            gptTdOrderDetail.setProductCode("TD-CHILD");
            gptTdOrderDetail.setBusinessCode("");
            gptTdOrderDetail.setSequenceId(seqId);
            gptTdOrderDetail.setRequestId(getUUID(true));
            gptTdOrderDetail.setMerchantNo("10000211798");
            gptTdOrderDetail.setSignName("萃华金店测试");
            gptTdOrderDetail.setSignNameEn("brucesssfsfsfsfsfsfsfsfs");
            gptTdOrderDetail.setMerchantKyc("疑似CRE");
            gptTdOrderDetail.setMerchantKycSub("疑似CRE");
            gptTdOrderDetail.setIpAddress("192.168.2.1");
            gptTdOrderDetail.setIpArea("河南");
            gptTdOrderDetail.setIpProxy("是");
            gptTdOrderDetail.setSellerId("1324242");
            gptTdOrderDetail.setSellerWebsite("www.baidu.com");
            gptTdOrderDetail.setSellerWebsiteDomain("");
            gptTdOrderDetail.setGoodsName("百货五金");
            gptTdOrderDetail.setGoodsQuantity(232);
            String payerName = SMUtils.encrypt("钟大名");
            gptTdOrderDetail.setPayerName(payerName);
            String payerNameDegst = SMUtils.calculateDigest("钟大名");
            gptTdOrderDetail.setPayerNameDigest(payerNameDegst);

            String payIdCard = SMUtils.encrypt("6237972335421");
            gptTdOrderDetail.setPayerIdCard(payIdCard);
            String payIdCardDes = SMUtils.calculateDigest("6237972335421");
            gptTdOrderDetail.setPayerIdCardDigest(payIdCardDes);
            gptTdOrderDetail.setPayerIdCardArea("北京");
            gptTdOrderDetail.setPayerType("0");
            String bankCard =  SMUtils.encrypt("23358279661");
            String ds = SMUtils.calculateDigest("23358279661");
            gptTdOrderDetail.setReceiverIdCardDigest(ds);
            gptTdOrderDetail.setPayerBankCardId(bankCard);
            gptTdOrderDetail.setPayerBankCardIdDigest(ds);
            gptTdOrderDetail.setPayerBankName("建设银行");
            gptTdOrderDetail.setPayerBankCardArea("东京");

            gptTdOrderDetail.setPayerBankName("东京银行");
            gptTdOrderDetail.setPayerBankCardTypeBs("借记卡");
            String reveName = SMUtils.encrypt("李大飙");
            gptTdOrderDetail.setReceiverName(reveName);
            gptTdOrderDetail.setReceiverNameDigest(SMUtils.calculateDigest("李大飙"));
            gptTdOrderDetail.setReceiverIdCard(payIdCard);
            gptTdOrderDetail.setReceiverIdCardDigest(payIdCardDes);
            gptTdOrderDetail.setReceiverIdCardArea("天使城");
            gptTdOrderDetail.setReceiverBankCardId(bankCard);

            gptTdOrderDetail.setReceiverBankCardArea("天使城");
            gptTdOrderDetail.setReceiverBankName("建设银行");
            String ph = SMUtils.encrypt("13185609813");
            gptTdOrderDetail.setReceiverPhone(ph);
            String phs = SMUtils.calculateDigest("13185609813");
            gptTdOrderDetail.setReceiverPhoneDigest(phs);
            gptTdOrderDetail.setReceiverPhoneRisk("6");
            gptTdOrderDetail.setCurrency("RMB");

            gptTdOrderDetail.setAmount(new BigDecimal(97873.1));
            gptTdOrderDetail.setCnyAmount(new BigDecimal(985360.1));
            gptTdOrderDetail.setOccurTime(DateUtils.getAfBeDayDate(new Date(),0));
            gptTdOrderDetail.setCompleteTime(DateUtils.getAfBeDayDate(new Date(),0));
            gptTdOrderDetail.setUploadTime(DateUtils.getAfBeDayDate(new Date(),0));
            gptTdOrderDetail.setExchangeReason("汇款原因");

            gptTdOrderDetail.setTradePlatform("易宝支付");
            gptTdOrderDetail.setLogisticsCompany("京东物流");
            gptTdOrderDetail.setLogisticsNo("su34343");


            gptTdOrderDetail.setRemark("小西瓜圆又圆");
            gptTdOrderDetail.setRuleCodes("MEC_NO_001");

            gptTdOrderDetail.setPayResult("1");
            gptTdOrderDetail.setUpdateTime(DateUtils.getAfBeDayDate(new Date(),-4));
            gptTdOrderDetail.setCreateTime(DateUtils.getAfBeDayDate(new Date(),-4));
            details.add(gptTdOrderDetail);
        }


        return details;
    }

    @Override
    public void saveDataTldb() {
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.FKJS);
            List<TblGptTdOrderDetail> gptTdOrderDetails = buildTDOrderDetail();
            for (TblGptTdOrderDetail tdOrderDetail : gptTdOrderDetails) {
                tblGptTdOrderDetailMapper.insertSelective(tdOrderDetail);
            }
        }finally {
            DynamicDataSourceContextHolder.poll();
        }
    }

    private List<TblGptTdOrderDetail> buildTDOrderDetail() {
        List<TblGptTdOrderDetail>  details= Lists.newArrayList();
        for (int i = 0 ; i < 40; i ++){
            TblGptTdOrderDetail gptTdOrderDetail = new TblGptTdOrderDetail();
            String seqId = UUIDUtils.randomV4UUID();
            gptTdOrderDetail.setOrderId(seqId);
            gptTdOrderDetail.setProductCode("TD-CHILD");
            gptTdOrderDetail.setBusinessCode("");
            gptTdOrderDetail.setSequenceId(seqId);
            gptTdOrderDetail.setRequestId(getUUID(true));
            gptTdOrderDetail.setMerchantNo("10000211798");
            gptTdOrderDetail.setSignName("萃华金店测试");
            gptTdOrderDetail.setSignNameEn("brucesssfsfsfsfsfsfsfsfs");
            gptTdOrderDetail.setMerchantKyc("疑似CRE");
            gptTdOrderDetail.setMerchantKycSub("疑似CRE");
            gptTdOrderDetail.setIpAddress("192.168.2.1");
            gptTdOrderDetail.setIpArea("河南");
            gptTdOrderDetail.setIpProxy("是");
            gptTdOrderDetail.setSellerId("1324242");
            gptTdOrderDetail.setSellerWebsite("www.baidu.com");
            gptTdOrderDetail.setSellerWebsiteDomain("");
            gptTdOrderDetail.setGoodsName("百货五金");
            gptTdOrderDetail.setGoodsQuantity(232);
            String payerName = SMUtils.encrypt("钟大名");
            gptTdOrderDetail.setPayerName(payerName);
            String payerNameDegst = SMUtils.calculateDigest("钟大名");
            gptTdOrderDetail.setPayerNameDigest(payerNameDegst);

            String payIdCard = SMUtils.encrypt("6237972335421");
            gptTdOrderDetail.setPayerIdCard(payIdCard);
            String payIdCardDes = SMUtils.calculateDigest("6237972335421");
            gptTdOrderDetail.setPayerIdCardDigest(payIdCardDes);
            gptTdOrderDetail.setPayerIdCardArea("北京");
            gptTdOrderDetail.setPayerType("0");
            String bankCard =  SMUtils.encrypt("23358279661");
            String ds = SMUtils.calculateDigest("23358279661");
            gptTdOrderDetail.setReceiverIdCardDigest(ds);
            gptTdOrderDetail.setPayerBankCardId(bankCard);
            gptTdOrderDetail.setPayerBankName("建设银行");
            gptTdOrderDetail.setPayerBankCardArea("东京");

            gptTdOrderDetail.setPayerBankName("东京银行");
            gptTdOrderDetail.setPayerBankCardTypeBs("借记卡");
            String reveName = SMUtils.encrypt("李大飙");
            gptTdOrderDetail.setReceiverName(reveName);
            gptTdOrderDetail.setReceiverNameDigest(SMUtils.calculateDigest("李大飙"));
            gptTdOrderDetail.setReceiverIdCard(payIdCard);
            gptTdOrderDetail.setReceiverIdCardDigest(payIdCardDes);
            gptTdOrderDetail.setReceiverIdCardArea("天使城");
            gptTdOrderDetail.setReceiverBankCardId(bankCard);

            gptTdOrderDetail.setReceiverBankCardArea("天使城");
            gptTdOrderDetail.setReceiverBankName("建设银行");
            String ph = SMUtils.encrypt("13185609813");
            gptTdOrderDetail.setReceiverPhone(ph);
            String phs = SMUtils.calculateDigest("13185609813");
            gptTdOrderDetail.setReceiverPhoneDigest(phs);
            gptTdOrderDetail.setReceiverPhoneRisk("6");
            gptTdOrderDetail.setCurrency("RMB");

            gptTdOrderDetail.setAmount(new BigDecimal(97873.1));
            gptTdOrderDetail.setCnyAmount(new BigDecimal(985360.1));
            gptTdOrderDetail.setOccurTime(DateUtils.getAfBeDayDate(new Date(),-5));
            gptTdOrderDetail.setCompleteTime(DateUtils.getAfBeDayDate(new Date(),-5));
            gptTdOrderDetail.setUploadTime(DateUtils.getAfBeDayDate(new Date(),-4));
            gptTdOrderDetail.setExchangeReason("汇款原因");

            gptTdOrderDetail.setTradePlatform("易宝支付");
            gptTdOrderDetail.setLogisticsCompany("京东物流");
            gptTdOrderDetail.setLogisticsNo("su34343");


            gptTdOrderDetail.setRemark("小西瓜圆又圆");
            gptTdOrderDetail.setRuleCodes("MEC_NO_001");

            gptTdOrderDetail.setPayResult("1");
            gptTdOrderDetail.setUpdateTime(DateUtils.getAfBeDayDate(new Date(),-4));
            gptTdOrderDetail.setCreateTime(DateUtils.getAfBeDayDate(new Date(),-4));
            details.add(gptTdOrderDetail);
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
