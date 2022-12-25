package com.zhang.bruce.general.mysql;


import com.zhang.bruce.easyexcel.TDomesticMecReqMonth;
import com.zhang.bruce.easyexcel.TDomesticMecReqMonthExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TDomesticMecReqMonthMapper {
    int countByExample(TDomesticMecReqMonthExample example);

    int deleteByExample(TDomesticMecReqMonthExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TDomesticMecReqMonth record);

    Long insertSelective(TDomesticMecReqMonth record);

    List<TDomesticMecReqMonth> selectByExample(TDomesticMecReqMonthExample example);

    TDomesticMecReqMonth selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TDomesticMecReqMonth record, @Param("example") TDomesticMecReqMonthExample example);

    int updateByExample(@Param("record") TDomesticMecReqMonth record, @Param("example") TDomesticMecReqMonthExample example);

    int updateByPrimaryKeySelective(TDomesticMecReqMonth record);

    int updateByPrimaryKey(TDomesticMecReqMonth record);
}
