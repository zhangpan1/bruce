package com.zhang.bruce.riskgod.business;


import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.zhang.bruce.config.DataSourceConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblOfflineReqServiceImpl implements TblOfflineReqService {
    @Autowired
    private TblOfflineReqMapper mapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        // TODO Auto-generated method stub
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TblOfflineReq record) {
        // TODO Auto-generated method stub
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(TblOfflineReq record) {
        // TODO Auto-generated method stub
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.BUSINESS);
            return mapper.insertSelective(record);
        } finally {
            DynamicDataSourceContextHolder.poll();
        }
    }

    @Override
    public TblOfflineReq selectByPrimaryKey(Long id) {
        // TODO Auto-generated method stub
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public TblOfflineReq selectByReqIdAndMecNo(TblOfflineReq record) {
        // TODO Auto-generated method stub
        List<TblOfflineReq> list = mapper.selectByReqIdAndMecNo(record);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(TblOfflineReq record) {
        // TODO Auto-generated method stub
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TblOfflineReq record) {
        // TODO Auto-generated method stub
        return mapper.updateByPrimaryKey(record);
    }

}
