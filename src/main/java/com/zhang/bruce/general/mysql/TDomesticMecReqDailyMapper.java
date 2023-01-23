package com.zhang.bruce.general.mysql;


import com.zhang.bruce.easyexcel.TDomesticMecReqDaily;
import com.zhang.bruce.easyexcel.TDomesticMecReqDailyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TDomesticMecReqDailyMapper {
    int countByExample(TDomesticMecReqDailyExample example);

    int deleteByExample(TDomesticMecReqDailyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TDomesticMecReqDaily record);

    int insertSelective(TDomesticMecReqDaily record);

    List<TDomesticMecReqDaily> selectByExample(TDomesticMecReqDailyExample example);

    TDomesticMecReqDaily selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TDomesticMecReqDaily record, @Param("example") TDomesticMecReqDailyExample example);

    int updateByExample(@Param("record") TDomesticMecReqDaily record, @Param("example") TDomesticMecReqDailyExample example);

    int updateByPrimaryKeySelective(TDomesticMecReqDaily record);

    int updateByPrimaryKey(TDomesticMecReqDaily record);
}
