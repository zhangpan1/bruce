package com.zhang.bruce.datare;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.yeepay.g3.utils.common.CollectionUtils;
import com.yeepay.g3.utils.common.StringUtils;
import com.yeepay.g3.utils.common.UUIDUtils;
import com.zhang.bruce.config.DataSourceConstants;
import com.zhang.bruce.easyexcel.*;
import com.zhang.bruce.general.DateUtils;
import com.zhang.bruce.general.mysql.TblBossCollectionDetailMapper;
import com.zhang.bruce.general.mysql.TblRemitBossDetailMapper;
import com.zhang.bruce.general.mysql.TblRemitBossMapper;
import org.apache.commons.compress.utils.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/3/1 8:25 下午
 */
@Service
public class BossDetailServiceImpl implements BossDetailService {
    @Autowired
    private TblBossCollectionDetailMapper tblBossCollectionDetailMapper;
    @Autowired
    private TblRemitBossDetailMapper tblRemitBossDetailMapper;
    @Autowired
    private TblRemitBossMapper tblRemitBossMapper;

    @Override
    public void saveDataTldb() {
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.FKJS);
            List<TblBossCollectionDetail> bossCollectionDetails = buildTDOrderDetail();
            for (TblBossCollectionDetail tdOrderDetail : bossCollectionDetails) {
                tblBossCollectionDetailMapper.insertSelective(tdOrderDetail);
            }
        } finally {
            DynamicDataSourceContextHolder.poll();
        }
    }

    @Override
    public void fushData() {
        // 查询全部数据，更新详情
        TblRemitBossExample tblRemitBossExample = new TblRemitBossExample();
        tblRemitBossExample.createCriteria().andCtTmLessThan(new Date());
        List<TblRemitBoss> tblRemitBosses = tblRemitBossMapper.selectByExample(tblRemitBossExample);
        for (TblRemitBoss tblRemitBoss : tblRemitBosses) {
            // 详情如果不为空
            if (StringUtils.isNotBlank(tblRemitBoss.getDvdDetail())) {
                try {
                    List<DivideDetail> divideDetails = JSONObject.parseArray(tblRemitBoss.getDvdDetail(), DivideDetail.class);
                    if (CollectionUtils.isNotEmpty(divideDetails)) {
                        for (DivideDetail detail : divideDetails) {
                            TblRemitBossDetailExample detailExample = new TblRemitBossDetailExample();
                            detailExample.createCriteria().andDvdreqIdEqualTo(detail.getDivideRequestId());
                            // 更新详情数据
                            TblRemitBossDetail tblRemitBossDetail = new TblRemitBossDetail();
                            tblRemitBossDetail.setLedgerName(detail.getLedgerName());
                            tblRemitBossDetail.setLedgerCrdNo(detail.getLedgerCardNo());
                            tblRemitBossDetail.setLedgerIdNo(detail.getLedgerId());
                            tblRemitBossDetail.setLedgerPhone(detail.getLedgerPhone());
                            tblRemitBossDetail.setMfTm(new Date());
                            tblRemitBossDetailMapper.updateByExampleSelective(tblRemitBossDetail, detailExample);
                        }
                    }
                } catch (Exception e) {

                }
            }
        }
    }

    /**
     * FE#YJZF
     * NOCARDPAY#YJZF
     * NOCARDPAY#WALLETPAY
     * NOCARDPAY#MEMBER
     * NOCARDPAY#SBKPAY
     * OFFLINE#POS
     * OFFNEW#POS
     * OFFPAY#POS
     *
     * @return
     */
    private List<TblBossCollectionDetail> buildTDOrderDetail() {
        List<TblBossCollectionDetail> details = Lists.newArrayList();
        for (int i = 0; i < 40; i++) {
            TblBossCollectionDetail bossCollectionDetail = new TblBossCollectionDetail();
            String seqId = UUIDUtils.randomV4UUID();

            bossCollectionDetail.setProd("NOCARDPAY");
            bossCollectionDetail.setBiz("YJZF");
            bossCollectionDetail.setMecNo("10080041376");
            bossCollectionDetail.setReqId("20230222133236120");
            bossCollectionDetail.setCooReqId(seqId);
            bossCollectionDetail.setAmt(new BigDecimal("98.5"));
            bossCollectionDetail.setProdName("OFFNEW#POS");
            bossCollectionDetail.setPayWay("ALIPAY");

            bossCollectionDetail.setCrdNo("6217002870092594694");
            bossCollectionDetail.setCrdType("DEBIT");
            bossCollectionDetail.setBnkId("CMBCHINA");
            bossCollectionDetail.setUsrId("501236640899");
            bossCollectionDetail.setGoodsNm("{\"merchantInfoAddress\":\"史蒂夫\",\"signName\":\"易智芳signedName\",\"merchantCreateTime\":\"2016-12-29 15:31:06\",\"merchantRetCode\":\"0000\",\"legalIdNo\":\"6ewxhMu978WzAT8eKT8IZT55jZbhwUVh4tsRexk84EE=\",\"ncPayType\":\"N\",\"industry\":\"\",\"subBizcatCode\":\"131002\",\"merchantInfoCity\":\"北京\",\"smsNoStatus\":\"\",\"subBizcatName\":\"门户/资讯/论坛/sns社区/微博\",\"bindIdUpdateTime\":1592475708154,\"merchantInfoProvince\":\"北京\",\"signType\":\"PERSON\",\"bizcatName\":\"网络媒体/计算机服务/游戏\",\"bindIdCreateTime\":1571368538748,\"rechargeProvCity\":\"kRKBrs7Hj5gcgsQrzhOJJUSIRvlUo3nGYDCw5NEZTVQ=\",\"bizcatCode\":\"131\"}");
            bossCollectionDetail.setOccTm(DateUtils.getAfBeDayDate(new Date(), -4));
            // gptTdOrderDetail.setUpdateTime(DateUtils.getAfBeDayDate(new Date(),-4));
            details.add(bossCollectionDetail);
        }
        return details;
    }
}
