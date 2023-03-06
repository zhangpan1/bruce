package com.zhang.bruce.riskgod.online.business;


import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.zhang.bruce.config.DataSourceConstants;
import com.zhang.bruce.general.mysql.TblRrsReqMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblRrsReqServiceImpl implements TblRrsReqService {

    @Autowired
    private TblRrsReqMapper mapper;


    @Override
    public int deleteByPrimaryKey(Long id) {
        // TODO Auto-generated method stub
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.BUSINESS);
            return mapper.deleteByPrimaryKey(id);
        } finally {
            DynamicDataSourceContextHolder.poll();
        }

    }

    @Override
    public int insert(TblRrsReq record) {
        // TODO Auto-generated method stub
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.BUSINESS);
            return mapper.insert(record);
        } finally {
            DynamicDataSourceContextHolder.poll();
        }
    }

    @Override
    public int insertSelective(TblRrsReq record) {
        // TODO Auto-generated method stub
        return mapper.insertSelective(record);
    }

    @Override
    public TblRrsReq selectByPrimaryKey(Long id) {
        // TODO Auto-generated method stub
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public TblRrsReq selectByReqIdAndMecNo(TblRrsReq record) {
        // TODO Auto-generated method stub
        List<TblRrsReq> list = mapper.selectByReqIdAndMecNo(record);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(TblRrsReq record) {
        // TODO Auto-generated method stub
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TblRrsReq record) {
        // TODO Auto-generated method stub
        return mapper.updateByPrimaryKey(record);
    }
}
