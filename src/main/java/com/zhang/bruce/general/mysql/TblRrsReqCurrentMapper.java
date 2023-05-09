package com.zhang.bruce.general.mysql;



import com.zhang.bruce.easyexcel.TblRrsReqCurrent;
import com.zhang.bruce.easyexcel.TblRrsReqCurrentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TblRrsReqCurrentMapper {
    int countByExample(TblRrsReqCurrentExample example);

    int deleteByExample(TblRrsReqCurrentExample example);

    int insert(TblRrsReqCurrent record);

    int insertSelective(TblRrsReqCurrent record);

    List<TblRrsReqCurrent> selectByExample(TblRrsReqCurrentExample example);

    int updateByExampleSelective(@Param("record") TblRrsReqCurrent record, @Param("example") TblRrsReqCurrentExample example);

    int updateByExample(@Param("record") TblRrsReqCurrent record, @Param("example") TblRrsReqCurrentExample example);

    Integer countNoYesterday(Map<String, Object> param);
}
