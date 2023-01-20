package com.zhang.bruce.general.mysql;



import com.zhang.bruce.easyexcel.TblGptTdOrderDetail;
import com.zhang.bruce.easyexcel.TblGptTdOrderDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblGptTdOrderDetailMapper {
    int countByExample(TblGptTdOrderDetailExample example);

    int deleteByExample(TblGptTdOrderDetailExample example);

    int insert(TblGptTdOrderDetail record);

    int insertSelective(TblGptTdOrderDetail record);

    List<TblGptTdOrderDetail> selectByExample(TblGptTdOrderDetailExample example);

    int updateByExampleSelective(@Param("record") TblGptTdOrderDetail record, @Param("example") TblGptTdOrderDetailExample example);

    int updateByExample(@Param("record") TblGptTdOrderDetail record, @Param("example") TblGptTdOrderDetailExample example);
}
