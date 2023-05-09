package com.zhang.bruce.datare;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.yeepay.g3.utils.common.UUIDUtils;
import com.yeepay.g3.utils.gmcrypt.utils.SMUtils;
import com.zhang.bruce.config.DataSourceConstants;
import com.zhang.bruce.easyexcel.GptExchangeOrder;
import com.zhang.bruce.easyexcel.TblGptExchangeOrder;
import com.zhang.bruce.easyexcel.TblRrsReqCurrent;
import com.zhang.bruce.general.DateUtils;
import com.zhang.bruce.general.mysql.GptExchangeOrderMapper;
import com.zhang.bruce.general.mysql.TblGptExchangeOrderMapper;
import com.zhang.bruce.general.mysql.TblRrsReqCurrentMapper;
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
public class ExchangeServiceImpl implements ExchangeService {
    @Autowired
    private GptExchangeOrderMapper gptExchangeOrderMapper;
    @Autowired
    private TblGptExchangeOrderMapper tblGptExchangeOrderMapper;
    @Autowired
    private TblRrsReqCurrentMapper tblRrsReqCurrentMapper;

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

    @Override
    public void saveDataCurrent() {
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.FKJS);
            TblRrsReqCurrent tblRrsReqCurrent = new TblRrsReqCurrent();
            tblRrsReqCurrent.setIpCountry("中国");
            tblRrsReqCurrent.setUsrIp("2408:841e:440:3ab3:38c0:fe56:c257:5932");
            tblRrsReqCurrent.setUsrIpArea("中国;河北;石家庄;");
            tblRrsReqCurrent.setOccTm(new Date());
            tblRrsReqCurrent.setGoodsIf("{\"settleBankCards\":\"1204075109200088839\",\"merchantCreateTime\":\"2022-09-26 11:09:51\",\"merchantRetCode\":\"0000\",\"parentSignName\":\"爱信诺征信有限公司\",\"industry\":\"大零售行业线—XLS\",\"merchantInfoCity\":\"嘉兴\",\"scene\":\"Offline\",\"legalName\":\"DG$1$Wry2ohaTprRgngEkMmLMIg\",\"subBizcatName\":\"各类软件\",\"merchantInfoProvince\":\"浙江\",\"merchantContactName\":\"李鹏贤\",\"openProduct\":\"\",\"signType\":\"ENTERPRISE\",\"bizcatName\":\"网络媒体/计算机服务/游戏\",\"goodsName\":\"DG$1$4HYrw3ExoywOnIk1nx447g\",\"finalResultSub\":\"各类软件\",\"salesType\":\"CHANNEL_EXPANDING\",\"merchantRole\":\"ORDINARY_MERCHANT\",\"merchantInfoAddress\":\"乌镇镇子夜东路868号5幢3层\",\"systemMerchantNo\":\"10088401793\",\"signName\":\"航信云享科技有限公司\",\"isProxyIp\":false,\"legalIdNo\":\"DG$1$_CidMol75ih8Vns0D0rqBcMet6wGlnB1BmvV4htr4lg\",\"signSubject\":\"航信云享科技有限公司\",\"subBizcatCode\":\"131005\",\"cardSubject\":\"370281197503026312\",\"ypMerchantType\":\"CUSTOMER\",\"uniCrdCode\":\"91330483MABPEKL98U\",\"smsNoStatus\":\"\",\"shareholderName\":\"桐乡云行创业投资合伙企业（有限合伙）\",\"launchMode\":\"API\",\"cashierTypeRisk\":\"API\",\"bizcatCode\":\"131\",\"finalResult\":\"网络媒体/计算机服务/游戏\"}");
            tblRrsReqCurrent.setReqIf("orderType=JSAPI,production=DS,occurTime=2023-04-18 14:39:40,payWay=WECHAT,sequenceId=2304181439403841330735142048,serverId=,bankMsg=其它（未知）,requestId=1648212201110409217,paymentId=2304181439403841330735142048,bankTradeNo=,synConsumeTime=,appId=wxfe20bb743047ae1d,tradeError=,tradeResult=0,amount=0.01,paySystem=AGGPAY,bankChannelId=UNION_NET_OPEN_YLSJ6062,productId=FE,bizOrder=1013202304180000006014993221,bankError=500099,bankCardType=null,completeTime=2023-04-18 14:39:40,userId=oB6Zj6LnPC-Oje7Vhzd1U9LQuAM0,synErrorCode=,transactionId=,bankId=null,tradeMsg=,bankOrderNo=5989198682230418,userType=MERCHANT,bankTradeId=,rmSequence=2062a853-0306-4b45-8dc2-938560faec03,merchantNo=10088808132");
            tblRrsReqCurrent.setRtsRetdesc("isStop=false, supportCode=0000, rcd=null, rcode=null, rdate=null, des=riskRuleIds:688,695, ecode=null, edes=null");

            tblRrsReqCurrentMapper.insertSelective(tblRrsReqCurrent);
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
