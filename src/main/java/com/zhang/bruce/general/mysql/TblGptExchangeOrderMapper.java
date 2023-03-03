package com.zhang.bruce.general.mysql;



import com.zhang.bruce.easyexcel.TblGptExchangeOrder;
import com.zhang.bruce.easyexcel.TblGptExchangeOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblGptExchangeOrderMapper {
    int countByExample(TblGptExchangeOrderExample example);

    int deleteByExample(TblGptExchangeOrderExample example);

    int insert(TblGptExchangeOrder record);

    int insertSelective(TblGptExchangeOrder record);

    List<TblGptExchangeOrder> selectByExample(TblGptExchangeOrderExample example);

    int updateByExampleSelective(@Param("record") TblGptExchangeOrder record, @Param("example") TblGptExchangeOrderExample example);

    int updateByExample(@Param("record") TblGptExchangeOrder record, @Param("example") TblGptExchangeOrderExample example);
}
