package com.zhang.bruce.general.mysql;



import com.zhang.bruce.easyexcel.TblGptDeclareOrderDetail;
import com.zhang.bruce.easyexcel.TblGptDeclareOrderDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblGptDeclareOrderDetailMapper {
    int countByExample(TblGptDeclareOrderDetailExample example);

    int deleteByExample(TblGptDeclareOrderDetailExample example);

    int insert(TblGptDeclareOrderDetail record);

    int insertSelective(TblGptDeclareOrderDetail record);

    List<TblGptDeclareOrderDetail> selectByExample(TblGptDeclareOrderDetailExample example);

    int updateByExampleSelective(@Param("record") TblGptDeclareOrderDetail record, @Param("example") TblGptDeclareOrderDetailExample example);

    int updateByExample(@Param("record") TblGptDeclareOrderDetail record, @Param("example") TblGptDeclareOrderDetailExample example);
}
