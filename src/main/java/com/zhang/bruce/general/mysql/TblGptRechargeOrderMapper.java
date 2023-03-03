package com.zhang.bruce.general.mysql;



import com.zhang.bruce.easyexcel.TblGptRechargeOrder;
import com.zhang.bruce.easyexcel.TblGptRechargeOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblGptRechargeOrderMapper {
    int countByExample(TblGptRechargeOrderExample example);

    int deleteByExample(TblGptRechargeOrderExample example);

    int insert(TblGptRechargeOrder record);

    int insertSelective(TblGptRechargeOrder record);

    List<TblGptRechargeOrder> selectByExample(TblGptRechargeOrderExample example);

    int updateByExampleSelective(@Param("record") TblGptRechargeOrder record, @Param("example") TblGptRechargeOrderExample example);

    int updateByExample(@Param("record") TblGptRechargeOrder record, @Param("example") TblGptRechargeOrderExample example);
}
