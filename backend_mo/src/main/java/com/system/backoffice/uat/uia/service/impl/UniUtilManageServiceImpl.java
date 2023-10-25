package com.system.backoffice.uat.uia.service.impl;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.backoffice.uat.uia.mapper.UniUtilManageMapper;
import com.system.backoffice.uat.uia.models.UniUtilInfo;
import com.system.backoffice.uat.uia.service.UniUtilManageService;


@Service("UniUtilManageService")
public class UniUtilManageServiceImpl extends EgovAbstractServiceImpl implements  UniUtilManageService {
	
	@Autowired
	private UniUtilManageMapper uniMapper;

	@Override
	public int selectIdDoubleCheck(UniUtilInfo vo) throws Exception {
		// TODO Auto-generated method stub
		return uniMapper.selectIdDoubleCheck(vo);
	}
	
	@Override
	public int selectIdDoubleCheckString(String _field, String _tableNm, String _condition ) throws Exception {
		
		UniUtilInfo vo = new UniUtilInfo();
		vo.setInCheckName(_field);
		vo.setInTable(_tableNm);
		vo.setInCondition(_condition);
		// TODO Auto-generated method stub
		return uniMapper.selectIdDoubleCheck(vo);
	}

	@Override
	public int deleteUniStatement(UniUtilInfo vo) throws Exception {
		// TODO Auto-generated method stub
		int ret = uniMapper.deleteUniStatement(vo);
		return 1;
	}

	@Override
	public String selectMaxValue(UniUtilInfo vo) throws Exception {
		// TODO Auto-generated method stub
		return uniMapper.selectMaxValue(vo);
	}

}
