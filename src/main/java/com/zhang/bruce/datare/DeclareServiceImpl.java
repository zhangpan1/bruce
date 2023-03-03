package com.zhang.bruce.datare;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.yeepay.g3.utils.common.UUIDUtils;
import com.yeepay.g3.utils.gmcrypt.utils.SMUtils;
import com.zhang.bruce.config.DataSourceConstants;
import com.zhang.bruce.easyexcel.GptDeclareOrderDetail;
import com.zhang.bruce.easyexcel.TblGptDeclareOrderDetail;
import com.zhang.bruce.general.DateUtils;
import com.zhang.bruce.general.mysql.GptDeclareOrderDetailMapper;
import com.zhang.bruce.general.mysql.TblGptDeclareOrderDetailMapper;
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
 * @date: 2023/1/17 5:54 下午
 */
@Service
public class DeclareServiceImpl implements DeclareService {
    @Autowired
    private GptDeclareOrderDetailMapper gptDeclareOrderDetailMapper;
    @Autowired
    private TblGptDeclareOrderDetailMapper tblGptDeclareOrderDetailMapper;


    @Override
    public void saveDataBusines() {
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.GPTBUSINESS);
            List<GptDeclareOrderDetail> gptTdOrderDetails = buildOrderDetail();
            for (GptDeclareOrderDetail gp : gptTdOrderDetails) {
                gptDeclareOrderDetailMapper.insertSelective(gp);
            }
        } finally {
            DynamicDataSourceContextHolder.poll();
        }
    }

    private List<GptDeclareOrderDetail> buildOrderDetail() {
        List<GptDeclareOrderDetail> details = Lists.newArrayList();
        for (int i = 0; i < 40; i++) {
            GptDeclareOrderDetail gptTdOrderDetail = new GptDeclareOrderDetail();
            String seqId = UUIDUtils.randomV4UUID();
            gptTdOrderDetail.setOrderId(seqId);
            gptTdOrderDetail.setProductCode("GPT_MERCHANT");
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

            gptTdOrderDetail.setSellerWebsite("www.baidu.com");
            gptTdOrderDetail.setSellerWebsiteDomain("");
            gptTdOrderDetail.setGoodsName("百货五金");
            gptTdOrderDetail.setGoodsQuantity(232);
            String payerName = SMUtils.encrypt("钟大名");
            gptTdOrderDetail.setPayerName(payerName);
            String payIdCard = SMUtils.encrypt("6237972335421");
            gptTdOrderDetail.setPayerIdCard(payIdCard);
            gptTdOrderDetail.setPayerIdCardDigest(SMUtils.calculateDigest("6237972335421"));
            gptTdOrderDetail.setPayerNameDigest(SMUtils.calculateDigest("钟大名"));
            gptTdOrderDetail.setPayerIdCardArea("北京");
            gptTdOrderDetail.setPayerType("0");
            String bankCard = SMUtils.encrypt("23358279661");
            gptTdOrderDetail.setPayerBankCardId(bankCard);
            gptTdOrderDetail.setPayerBankCardIdDigest(SMUtils.calculateDigest("23358279661"));
            gptTdOrderDetail.setPayerBankCardArea("东京");


            gptTdOrderDetail.setPayerBankCardTypeBs("借记卡");
            String reveName = SMUtils.encrypt("李大飙");
            gptTdOrderDetail.setDeclareStatus("0");

            String ph = SMUtils.encrypt("13185609813");

            gptTdOrderDetail.setCurrency("RMB");

            gptTdOrderDetail.setAmount(new BigDecimal(9842.3));
            gptTdOrderDetail.setCnyAmount(new BigDecimal(97873.2));
            gptTdOrderDetail.setOccurTime(new Date());

            gptTdOrderDetail.setExchangeReason("汇款原因");


            gptTdOrderDetail.setLogisticsCompany("京东物流");
            gptTdOrderDetail.setLogisticsNo("su34343");
            gptTdOrderDetail.setStatus("1");

            gptTdOrderDetail.setRemark("小西瓜圆又圆");
            gptTdOrderDetail.setRuleCodes("MEC_NO_001");

            gptTdOrderDetail.setPayResult("1");

            gptTdOrderDetail.setUpdateTime(DateUtils.getAfBeDayDate(new Date(), 0));
            gptTdOrderDetail.setCreateTime(DateUtils.getAfBeDayDate(new Date(), 0));
            details.add(gptTdOrderDetail);
        }


        return details;
    }

    @Override
    public void saveDataTldb() {
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.FKJS);
            List<TblGptDeclareOrderDetail> gptTdOrderDetails = buildTDOrderDetail();
            for (TblGptDeclareOrderDetail tdOrderDetail : gptTdOrderDetails) {
                tblGptDeclareOrderDetailMapper.insertSelective(tdOrderDetail);
            }
        } finally {
            DynamicDataSourceContextHolder.poll();
        }
    }

    private List<TblGptDeclareOrderDetail> buildTDOrderDetail() {
        List<TblGptDeclareOrderDetail> details = Lists.newArrayList();
        for (int i = 0; i < 40; i++) {
            TblGptDeclareOrderDetail gptTdOrderDetail = new TblGptDeclareOrderDetail();
            String seqId = UUIDUtils.randomV4UUID();
            gptTdOrderDetail.setOrderId(seqId);
            gptTdOrderDetail.setProductCode("GPT_MERCHANT");
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

            gptTdOrderDetail.setSellerWebsite("www.baidu.com");
            gptTdOrderDetail.setSellerWebsiteDomain("");
            gptTdOrderDetail.setGoodsName("百货五金");
            gptTdOrderDetail.setGoodsQuantity(232);
            String payerName = SMUtils.encrypt("钟大名");
            gptTdOrderDetail.setPayerName(payerName);
            String payIdCard = SMUtils.encrypt("6237972335421");
            gptTdOrderDetail.setPayerIdCard(payIdCard);
            gptTdOrderDetail.setPayerIdCardDigest(SMUtils.calculateDigest("6237972335421"));
            gptTdOrderDetail.setPayerNameDigest(SMUtils.calculateDigest("钟大名"));
            gptTdOrderDetail.setPayerIdCardArea("北京");
            gptTdOrderDetail.setPayerType("0");
            String bankCard = SMUtils.encrypt("23358279661");
            gptTdOrderDetail.setPayerBankCardId(bankCard);
            gptTdOrderDetail.setPayerBankCardIdDigest(SMUtils.calculateDigest("23358279661"));
            gptTdOrderDetail.setPayerBankCardArea("东京");


            gptTdOrderDetail.setPayerBankCardTypeBs("借记卡");
            String reveName = SMUtils.encrypt("李大飙");

            String ph = SMUtils.encrypt("13185609813");

            gptTdOrderDetail.setCurrency("RMB");

            gptTdOrderDetail.setAmount(new BigDecimal(9842.3));
            gptTdOrderDetail.setCnyAmount(new BigDecimal(97873.2));
            gptTdOrderDetail.setOccurTime(DateUtils.getAfBeDayDate(new Date(), -4));

            gptTdOrderDetail.setExchangeReason("汇款原因");


            gptTdOrderDetail.setLogisticsCompany("京东物流");
            gptTdOrderDetail.setLogisticsNo("su34343");
            gptTdOrderDetail.setStatus("1");

            gptTdOrderDetail.setRemark("小西瓜圆又圆");
            gptTdOrderDetail.setRuleCodes("MEC_NO_001");

            gptTdOrderDetail.setPayResult("1");

            gptTdOrderDetail.setUpdateTime(DateUtils.getAfBeDayDate(new Date(), -4));
            gptTdOrderDetail.setCreateTime(DateUtils.getAfBeDayDate(new Date(), -4));
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
