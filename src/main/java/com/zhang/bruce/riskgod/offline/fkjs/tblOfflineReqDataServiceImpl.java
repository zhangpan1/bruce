package com.zhang.bruce.riskgod.offline.fkjs;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.zhang.bruce.config.DataSourceConstants;
import com.zhang.bruce.general.mysql.tblOfflineReqDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class tblOfflineReqDataServiceImpl implements tblOfflineReqDataService {
    @Autowired
    private tblOfflineReqDataMapper mapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        // TODO Auto-generated method stub
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(tblOfflineReqData record) {
        // TODO Auto-generated method stub
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(tblOfflineReqData record) {
        // TODO Auto-generated method stub
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.FKJS);
            return mapper.insertSelective(record);
        } finally {
            DynamicDataSourceContextHolder.poll();
        }
    }

    @Override
    public tblOfflineReqData selectByPrimaryKey(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer queryBankNoCount(Map<String, Object> map) {
        // TODO Auto-generated method stub
        return mapper.queryBankNoCount(map);
    }

    @Override
    public List<tblOfflineReqData> queryList(Map<String, Object> map) {
        // TODO Auto-generated method stub
        return mapper.queryList(map);
    }

    @Override
    public int updateByPrimaryKeySelective(tblOfflineReqData record) {
        // TODO Auto-generated method stub
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(tblOfflineReqData record) {
        // TODO Auto-generated method stub
        return mapper.updateByPrimaryKey(record);
    }


}
