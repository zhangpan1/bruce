package com.zhang.bruce.riskgod.online.fkjs;


import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.zhang.bruce.config.DataSourceConstants;
import com.zhang.bruce.general.mysql.tblRrsReqDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class tblRrsReqDataServiceImpl implements tblRrsReqDataService {
	@Autowired
	private tblRrsReqDataMapper mappper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		return mappper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(tblRrsReqData record) {
		try {
			DynamicDataSourceContextHolder.push(DataSourceConstants.FKJS);
			return mappper.insert(record);
		}finally {
			DynamicDataSourceContextHolder.poll();
		}
	}

	@Override
	public int insertSelective(tblRrsReqData record) {
		// TODO Auto-generated method stub
		return mappper.insertSelective(record);
	}

	@Override
	public tblRrsReqData selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return mappper.selectByPrimaryKey(id);
	}

	@Override
	public List<tblRrsReqData> queryList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mappper.queryList(map);
	}

	@Override
	public int updateByPrimaryKeySelective(tblRrsReqData record) {
		// TODO Auto-generated method stub
		return mappper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(tblRrsReqData record) {
		// TODO Auto-generated method stub
		return mappper.updateByPrimaryKey(record);
	}

	@Override
	public int queryBankNoCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mappper.queryBankNoCount(map);
	}

}
