package com.zhang.bruce.datare;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.yeepay.g3.utils.common.UUIDUtils;
import com.yeepay.g3.utils.gmcrypt.utils.SMUtils;
import com.zhang.bruce.config.DataSourceConstants;
import com.zhang.bruce.easyexcel.GptExchangeOrder;
import com.zhang.bruce.easyexcel.TblGptExchangeOrder;
import com.zhang.bruce.general.DateUtils;
import com.zhang.bruce.general.mysql.GptExchangeOrderMapper;
import com.zhang.bruce.general.mysql.TblGptExchangeOrderMapper;
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
 * @date: 2023/1/19 8:48 下午
 */
@Service
public class ExchangeServiceImpl implements ExchangeService{
    @Autowired
    private GptExchangeOrderMapper gptExchangeOrderMapper;
    @Autowired
    private TblGptExchangeOrderMapper tblGptExchangeOrderMapper;

    @Override
    public void saveDataBusines() {
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.GPTBUSINESS);
            List<GptExchangeOrder> gptTdOrderDetails = buildOrderDetail();
            for (GptExchangeOrder gp : gptTdOrderDetails) {
                gptExchangeOrderMapper.insertSelective(gp);
            }
        } finally {
            DynamicDataSourceContextHolder.poll();
        }
    }
    public static String getUUID(boolean isFilter) {
        if (isFilter) {
            return UUID.randomUUID().toString().replaceAll("-", "");
        }
        return UUID.randomUUID().toString();
    }
    private List<GptExchangeOrder> buildOrderDetail() {
        List<GptExchangeOrder> details = Lists.newArrayList();
        for (int i = 0; i < 40; i++) {
            GptExchangeOrder gptRemitOrder = new GptExchangeOrder();
            String seqId = UUIDUtils.randomV4UUID();
            gptRemitOrder.setProductCode("RECHARGE");

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
            gptRemitOrder.setTargetCurrency("USA");


            String payerName = SMUtils.encrypt("钟大名");


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

    @Override
    public void saveDataTldb() {
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.FKJS);
            List<TblGptExchangeOrder> gptTdOrderDetails = buildTDOrderDetail();
            for (TblGptExchangeOrder tdOrderDetail : gptTdOrderDetails) {
                tblGptExchangeOrderMapper.insertSelective(tdOrderDetail);
            }
        } finally {
            DynamicDataSourceContextHolder.poll();
        }
    }

    private List<TblGptExchangeOrder> buildTDOrderDetail() {
        List<TblGptExchangeOrder> details = Lists.newArrayList();
        for (int i = 0; i < 40; i++) {
            TblGptExchangeOrder tblGptExchangeOrder = new TblGptExchangeOrder();
            String seqId = UUIDUtils.randomV4UUID();
            tblGptExchangeOrder.setProductCode("RECHARGE");

            tblGptExchangeOrder.setSequenceId(seqId);
            tblGptExchangeOrder.setRequestId(getUUID(true));
            tblGptExchangeOrder.setMerchantNo("10000211798");
            tblGptExchangeOrder.setSignName("萃华金店测试");
            tblGptExchangeOrder.setSignNameEn("brucesssfsfsfsfsfsfsfsfs");

            tblGptExchangeOrder.setIpAddress("192.168.2.1");
            tblGptExchangeOrder.setIpArea("河南");
            tblGptExchangeOrder.setIpProxy("是");


            tblGptExchangeOrder.setCurrency("CNY");

            tblGptExchangeOrder.setPayResult("0");
            tblGptExchangeOrder.setAmount(new BigDecimal(9842.3));
            tblGptExchangeOrder.setCnyAmount(new BigDecimal(97873.2));


            tblGptExchangeOrder.setTargetAmount(new BigDecimal(9842.3));
            tblGptExchangeOrder.setTargetCurrency("USA");


            String payerName = SMUtils.encrypt("钟大名");


            tblGptExchangeOrder.setRemark("fsfsfsfsfs0");
            String bankCard = SMUtils.encrypt("23358279661");


            String ph = SMUtils.encrypt("13185609813");

            tblGptExchangeOrder.setCurrency("RMB");


            tblGptExchangeOrder.setOccurTime(new Date());


            tblGptExchangeOrder.setRemark("小西瓜圆又圆");
            tblGptExchangeOrder.setRuleCodes("MEC_NO_001");

            tblGptExchangeOrder.setPayResult("1");
            tblGptExchangeOrder.setOccurTime(DateUtils.getAfBeDayDate(new Date(), -4));
            tblGptExchangeOrder.setCompleteTime(DateUtils.getAfBeDayDate(new Date(), -4));
            tblGptExchangeOrder.setUpdateTime(DateUtils.getAfBeDayDate(new Date(), -4));
            tblGptExchangeOrder.setCreateTime(DateUtils.getAfBeDayDate(new Date(), -4));

            details.add(tblGptExchangeOrder);
        }
        return details;
    }
}
