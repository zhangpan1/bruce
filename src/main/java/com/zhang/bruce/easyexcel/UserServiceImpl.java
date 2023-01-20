package com.zhang.bruce.easyexcel;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.google.common.collect.Maps;
import com.yeepay.g3.utils.common.DateUtils;
import com.zhang.bruce.config.DataSourceConstants;
import com.zhang.bruce.general.mysql.MerchantSomplaintMapper;
import com.zhang.bruce.general.mysql.RTDomesticMecReqMonthMapper;
import com.zhang.bruce.general.mysql.TDomesticMecReqMonthMapper;
import org.apache.commons.compress.utils.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: xueqimiao
 * @Date: 2022/9/28 09:45
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private TDomesticMecReqMonthMapper tDomesticMecReqMonthMapper;
    @Autowired
    private RTDomesticMecReqMonthMapper rtDomesticMecReqMonthMapper;

    @Autowired
    private MerchantSomplaintMapper merchantSomplaintMapper;

    @Override
    public List<UserModel> getUserList() {
        List<UserModel> userList = new ArrayList<>();
        userList.add(new UserModel(1L,"法斗",19,new Date()));
        userList.add(new UserModel(2L,"泰迪",18,new Date()));
        userList.add(new UserModel(3L,"萨摩耶",29,new Date()));
        userList.add(new UserModel(4L,"阿拉斯加",13,new Date()));
        userList.add(new UserModel(5L,"布达拉多",26,new Date()));
        userList.add(new UserModel(6L,"柯基",26,new Date()));
        return userList;
    }

    @Override
    public void saveUsers(List<UserImportVO> vos) {
        for (UserImportVO userImportVO : vos){
            MerchantSomplaint merchantSomplaint = new MerchantSomplaint();
            try {
                merchantSomplaint.setAcceptanceDate(DateUtils.parseDate(userImportVO.getAcceptanceDate(), com.zhang.bruce.general.DateUtils.FORMAT21));
                merchantSomplaint.setAcceptanceTime(DateUtils.parseDate(userImportVO.getAcceptanceTime(), com.zhang.bruce.general.DateUtils.FORMAT21));
                merchantSomplaint.setPayTime(DateUtils.parseDate(userImportVO.getPayTime(), com.zhang.bruce.general.DateUtils.FORMAT21));
                merchantSomplaint.setLastModifiedTime(DateUtils.parseDate(userImportVO.getLastModifiedTime(), com.zhang.bruce.general.DateUtils.FORMAT21));
                merchantSomplaint.setCreateTime(DateUtils.parseDate(userImportVO.getCreateTime(), com.zhang.bruce.general.DateUtils.FORMAT21));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            merchantSomplaint.setSomplaintSource(userImportVO.getSomplaintSource());
            merchantSomplaint.setMerchantNo("10000460331");
            merchantSomplaint.setOrderNo(userImportVO.getOrderNo());
            merchantSomplaint.setTransactionAmount(userImportVO.getTransactionAmount());
            merchantSomplaint.setSomplaintWay(userImportVO.getSomplaintWay());
            merchantSomplaint.setReportType(userImportVO.getReportType());
            merchantSomplaint.setSomplaintReason(userImportVO.getSomplaintReason());
            merchantSomplaint.setSomplaintBy(userImportVO.getSomplaintBy());

            merchantSomplaint.setContactWay(userImportVO.getContactWay());
            merchantSomplaint.setLastModifiedBy(userImportVO.getLastModifiedBy());

            merchantSomplaint.setSomplaintType(userImportVO.getSomplaintType());
            merchantSomplaint.setBankOrderNo(userImportVO.getBankOrderNo());

            merchantSomplaint.setSomplaintUrl(userImportVO.getSomplaintUrl());
            merchantSomplaint.setWorkOrderNo(userImportVO.getWorkOrderNo());

            merchantSomplaint.setChannel(userImportVO.getChannel());
            merchantSomplaint.setComplaintNature(userImportVO.getComplaintNature());
            merchantSomplaint.setProcessContent(userImportVO.getProcessContent());
            merchantSomplaint.setOrderCode(userImportVO.getOrderCode());
            merchantSomplaint.setSomplaintDetail(userImportVO.getSomplaintDetail());

            merchantSomplaint.setSupplementComment(userImportVO.getSupplementComment());
            merchantSomplaint.setYpMecNo(userImportVO.getYpMecNo());
            merchantSomplaint.setPunishStatus(Short.valueOf(userImportVO.getPunishStatus()));
            merchantSomplaint.setCrdNo(userImportVO.getCrdNo());

            merchantSomplaint.setIdNo(userImportVO.getIdNo());
            merchantSomplaint.setUserId(userImportVO.getUserId());
            try {
                DynamicDataSourceContextHolder.push(DataSourceConstants.BUSINESS);
                merchantSomplaintMapper.insertSelective(merchantSomplaint);
            }finally {
                DynamicDataSourceContextHolder.poll();
            }

            Long result = merchantSomplaint.getId();
            System.out.println("result结果为 "+ result);
        }
        System.out.println("保存成功"+vos.size());

    }

    @Override
    public void selectResult() {
        String mecNo = "10034250735";
        List<TDomesticMecReqMonth> list = rtDomesticMecReqMonthMapper.selectByMecNo(mecNo);
        list.stream().filter(x -> x.getPayWay().equals("NULL")).forEach(x -> x.setPayWay(null));
        Map<String,TDomesticMecReqMonth> map = Maps.newHashMap();
        for (TDomesticMecReqMonth reqMonth : list) {
            String key = reqMonth.getBiz()+reqMonth.getProd()+ reqMonth.getPayWay();
            if (map.containsKey(key)) {
                TDomesticMecReqMonth s = map.get(key);
                s.setAmt(s.getAmt().add(reqMonth.getAmt()));
                s.setTotalCount(s.getTotalCount().longValue()+reqMonth.getTotalCount().longValue());
                map.put(key,s);
            } else {
                map.put(key,reqMonth);
            }
        }
        List<TDomesticMecReqMonth> newList  = Lists.newArrayList();
        for (String temp : map.keySet()) {
            newList .add(map.get(temp));
        }
        /**
         * 二级分类名称和对应的交易信息
         */
        Map<String,List<TDomesticMecReqMonth>> mapTrans = Maps.newHashMap();
        for (TDomesticMecReqMonth val : newList) {
            // 查询所有的二级分类
            String secondCateGory = "";
            if (map.containsKey(secondCateGory)) {
                List<TDomesticMecReqMonth> s =  mapTrans.get(secondCateGory);
                s.add(val);
            } else {
                List<TDomesticMecReqMonth> dd = Lists.newArrayList();
                dd.add(val);
                mapTrans.put(secondCateGory,dd);
            }
        }
        // 拿到所有的key和value
        mapTrans.keySet().forEach(key->{

        });

    }
    public String generateHashCode(TDomesticMecReqMonth merchantResult) {
        StringBuilder hashcodeBuilder = new StringBuilder();
        hashcodeBuilder.append(merchantResult.getMecNo()).append("_")
                .append(merchantResult.getProd())
                .append(merchantResult.getBiz())
                .append(merchantResult.getPayWay());
        // return MD5Util.(hashcodeBuilder.toString());
        return "";
    }
}
