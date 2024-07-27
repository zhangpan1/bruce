package com.zhang.bruce.general.mysql;



import com.zhang.bruce.easyexcel.TblMecTempBooknoSummary;
import com.zhang.bruce.easyexcel.TblMecTempBooknoSummaryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TblMecTempBooknoSummaryMapper {
    int countByExample(TblMecTempBooknoSummaryExample example);

    int deleteByExample(TblMecTempBooknoSummaryExample example);

    int insert(TblMecTempBooknoSummary record);

    int insertSelective(TblMecTempBooknoSummary record);

    List<TblMecTempBooknoSummary> selectByExample(TblMecTempBooknoSummaryExample example);

    int updateByExampleSelective(@Param("record") TblMecTempBooknoSummary record, @Param("example") TblMecTempBooknoSummaryExample example);

    int updateByExample(@Param("record") TblMecTempBooknoSummary record, @Param("example") TblMecTempBooknoSummaryExample example);

    Integer selectBookNoPayNameCount(Map<String, String> paramMap);

    List<TblMecTempBooknoSummary> queryMerchantBookNoPayNameByPage(Map<String, Object> params);
}
