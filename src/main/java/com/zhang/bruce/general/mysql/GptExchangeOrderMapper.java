package com.zhang.bruce.general.mysql;


import com.zhang.bruce.easyexcel.GptExchangeOrder;
import com.zhang.bruce.easyexcel.GptExchangeOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GptExchangeOrderMapper {
    int countByExample(GptExchangeOrderExample example);

    int deleteByExample(GptExchangeOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GptExchangeOrder record);

    int insertSelective(GptExchangeOrder record);

    List<GptExchangeOrder> selectByExample(GptExchangeOrderExample example);

    GptExchangeOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GptExchangeOrder record, @Param("example") GptExchangeOrderExample example);

    int updateByExample(@Param("record") GptExchangeOrder record, @Param("example") GptExchangeOrderExample example);

    int updateByPrimaryKeySelective(GptExchangeOrder record);

    int updateByPrimaryKey(GptExchangeOrder record);
}
