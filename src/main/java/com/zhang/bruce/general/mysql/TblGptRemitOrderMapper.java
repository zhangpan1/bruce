package com.zhang.bruce.general.mysql;


import com.zhang.bruce.easyexcel.TblGptRemitOrder;
import com.zhang.bruce.easyexcel.TblGptRemitOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblGptRemitOrderMapper {
    int countByExample(TblGptRemitOrderExample example);

    int deleteByExample(TblGptRemitOrderExample example);

    int insert(TblGptRemitOrder record);

    int insertSelective(TblGptRemitOrder record);

    List<TblGptRemitOrder> selectByExample(TblGptRemitOrderExample example);

    int updateByExampleSelective(@Param("record") TblGptRemitOrder record, @Param("example") TblGptRemitOrderExample example);

    int updateByExample(@Param("record") TblGptRemitOrder record, @Param("example") TblGptRemitOrderExample example);
}
