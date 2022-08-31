//package com.zhang.bruce.java8.mituan;
//
//import com.yeepay.business.context.datasource.DynamicDataSourceHolder;
//import com.yeepay.business.dao.gpt.trnsctionmapper.DTblAbroadGptExchangeMapper;
//import com.yeepay.business.dao.gpt.trnsctionmapper.DTblAbroadGptPaymentMapper;
//import com.yeepay.business.dao.gpt.trnsctionmapper.DTblAbroadGptRemitDetailMapper;
//import com.yeepay.business.dto.gpt.transction.GI.GptExchangeSearchGI;
//import com.yeepay.business.dto.gpt.transction.GI.GptPaymentSearchGI;
//import com.yeepay.business.dto.gpt.transction.GI.GptRemitSearchGI;
//import com.yeepay.business.dto.gpt.transction.GO.GptExchangeGO;
//import com.yeepay.business.dto.gpt.transction.GO.GptPaymentGO;
//import com.yeepay.business.dto.gpt.transction.GO.GptRemitGO;
//import com.yeepay.business.service.gpt.transction.GptQueryFkjsService;
//import com.yeepay.business.service.search.impl.OperatorQueryFromFkjsServiceImpl;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.math.BigDecimal;
//import java.util.List;
//
///**
// * @description: 风控集市查询实现类
// * @email: pan.zhang@yeepay.com
// * @date: 2022/8/12 5:28 下午
// */
//@Service
//public class GptQueryFkjsServiceImpl implements GptQueryFkjsService {
//    private static Logger log = LogManager.getLogger(OperatorQueryFromFkjsServiceImpl.class);
//    @Autowired
//    private DTblAbroadGptPaymentMapper dTblAbroadGptPaymentMapper;
//    @Autowired
//    private DTblAbroadGptRemitDetailMapper dTblAbroadGptRemitDetailMapper;
//    @Autowired
//    private DTblAbroadGptExchangeMapper dTblAbroadGptExchangeMapper;
//
//    @Override
//    public List<GptPaymentGO> getPaymentList(GptPaymentSearchGI gi) {
//        try {
//            //DynamicDataSourceHolder.setDataSource("dataSource4");
//            DynamicDataSourceHolder.setDataSource("dataSource4");
//            return dTblAbroadGptPaymentMapper.queryList(gi);
//        } catch (Exception e) {
//            log.error("查询fkjs失败," + e);
//            return null;
//        } finally {
//            DynamicDataSourceHolder.clearDataSource();
//        }
//    }
//
//    @Override
//    public int countPaymentNum(GptPaymentSearchGI gi) {
//        try {
//            DynamicDataSourceHolder.setDataSource("dataSource4");
//            return dTblAbroadGptPaymentMapper.queryCount(gi);
//        } catch (Exception e) {
//            log.error("查询fkjs失败," + e);
//            return 0;
//        } finally {
//            DynamicDataSourceHolder.clearDataSource();
//        }
//    }
//
//    @Override
//    public BigDecimal sumRmbAmount(GptPaymentSearchGI gi) {
//        try {
//            DynamicDataSourceHolder.setDataSource("dataSource4");
//            return dTblAbroadGptPaymentMapper.sumRmbAmount(gi);
//        } catch (Exception e) {
//            log.error("查询fkjs失败," + e);
//            return null;
//        } finally {
//            DynamicDataSourceHolder.clearDataSource();
//        }
//    }
//
//    @Override
//    public BigDecimal sumArrivlRmbAmount(GptPaymentSearchGI gi) {
//        try {
//            DynamicDataSourceHolder.setDataSource("dataSource4");
//            return dTblAbroadGptPaymentMapper.sumArrayRmbAmount(gi);
//        } catch (Exception e) {
//            log.error("查询fkjs失败," + e);
//            return null;
//        } finally {
//            DynamicDataSourceHolder.clearDataSource();
//        }
//    }
//
//    @Override
//    public List<GptPaymentGO> getDownLoadList(GptPaymentSearchGI gi) {
//        try {
//            DynamicDataSourceHolder.setDataSource("dataSource4");
//            return dTblAbroadGptPaymentMapper.downLoadList(gi);
//        } catch (Exception e) {
//            log.error("查询fkjs失败," + e);
//            return null;
//        } finally {
//            DynamicDataSourceHolder.clearDataSource();
//        }
//    }
//
//    @Override
//    public int countRemitNum(GptRemitSearchGI gi) {
//        try {
//            DynamicDataSourceHolder.setDataSource("dataSource4");
//            return dTblAbroadGptRemitDetailMapper.queryCount(gi);
//        } catch (Exception e) {
//            log.error("查询fkjs失败," + e);
//            return 0;
//        } finally {
//            DynamicDataSourceHolder.clearDataSource();
//        }
//    }
//
//    @Override
//    public List<GptRemitGO> getRemitList(GptRemitSearchGI gi) {
//        try {
//            //DynamicDataSourceHolder.setDataSource("dataSource4");
//            DynamicDataSourceHolder.setDataSource("dataSource4");
//            return dTblAbroadGptRemitDetailMapper.queryList(gi);
//        } catch (Exception e) {
//            log.error("查询fkjs失败," + e);
//            return null;
//        } finally {
//            DynamicDataSourceHolder.clearDataSource();
//        }
//    }
//
//    @Override
//    public BigDecimal sumRemitRmbAmount(GptRemitSearchGI gi) {
//        try {
//            DynamicDataSourceHolder.setDataSource("dataSource4");
//            return dTblAbroadGptRemitDetailMapper.sumRmbAmount(gi);
//        } catch (Exception e) {
//            log.error("查询fkjs失败," + e);
//            return null;
//        } finally {
//            DynamicDataSourceHolder.clearDataSource();
//        }
//    }
//
//    @Override
//    public List<GptRemitGO> getDownLoadRemitList(GptRemitSearchGI gi) {
//        try {
//            DynamicDataSourceHolder.setDataSource("dataSource4");
//            return dTblAbroadGptRemitDetailMapper.downLoadList(gi);
//        } catch (Exception e) {
//            log.error("查询tldb失败," + e);
//            return null;
//        } finally {
//            DynamicDataSourceHolder.clearDataSource();
//        }
//    }
//
//    @Override
//    public Integer countExchangeNum(GptExchangeSearchGI gi) {
//        try {
//            DynamicDataSourceHolder.setDataSource("dataSource4");
//            return dTblAbroadGptExchangeMapper.queryCount(gi);
//        } catch (Exception e) {
//            log.error("查询fkjs失败," + e);
//            return 0;
//        } finally {
//            DynamicDataSourceHolder.clearDataSource();
//        }
//    }
//
//    @Override
//    public List<GptExchangeGO> getExchangeList(GptExchangeSearchGI gi) {
//        try {
//            //DynamicDataSourceHolder.setDataSource("dataSource4");
//            DynamicDataSourceHolder.setDataSource("dataSource4");
//            return dTblAbroadGptExchangeMapper.queryList(gi);
//        } catch (Exception e) {
//            log.error("查询fkjs失败," + e);
//            return null;
//        } finally {
//            DynamicDataSourceHolder.clearDataSource();
//        }
//    }
//
//    @Override
//    public BigDecimal sumExchangeRmbAmount(GptExchangeSearchGI gi) {
//        try {
//            DynamicDataSourceHolder.setDataSource("dataSource4");
//            return dTblAbroadGptExchangeMapper.sumRmbAmount(gi);
//        } catch (Exception e) {
//            log.error("查询fkjs失败," + e);
//            return null;
//        } finally {
//            DynamicDataSourceHolder.clearDataSource();
//        }
//    }
//
//    @Override
//    public List<GptExchangeGO> getDownLoadExchangeList(GptExchangeSearchGI gi) {
//        try {
//            DynamicDataSourceHolder.setDataSource("dataSource4");
//            return dTblAbroadGptExchangeMapper.downLoadList(gi);
//        } catch (Exception e) {
//            log.error("查询fkjs失败," + e);
//            return null;
//        } finally {
//            DynamicDataSourceHolder.clearDataSource();
//        }
//    }
//
//    @Override
//    public String selectRemitByOrderId(String masterBatchOrderId, String merchantNo, String orderId) {
//        try {
//            DynamicDataSourceHolder.setDataSource("dataSource4");
//            return dTblAbroadGptRemitDetailMapper.queryPayResult(masterBatchOrderId, merchantNo, orderId);
//        } catch (Exception e) {
//            log.error("查询fkjs失败," + e);
//            return null;
//        } finally {
//            DynamicDataSourceHolder.clearDataSource();
//        }
//    }
//
//    @Override
//    public String selectPaymentByOrderId(String merchantNo, String orderId) {
//        try {
//            DynamicDataSourceHolder.setDataSource("dataSource4");
//            return dTblAbroadGptPaymentMapper.queryPayResult(merchantNo, orderId);
//        } catch (Exception e) {
//            log.error("查询fkjs失败," + e);
//            return null;
//        } finally {
//            DynamicDataSourceHolder.clearDataSource();
//        }
//    }
//
//}
