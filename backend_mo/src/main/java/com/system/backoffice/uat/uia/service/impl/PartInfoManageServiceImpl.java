package com.system.backoffice.uat.uia.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.egovframe.rte.fdl.idgnr.EgovIdGnrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.system.backoffice.uat.uia.mapper.PartInfoManageMapper;
import com.system.backoffice.uat.uia.models.PartInfo;
import com.system.backoffice.uat.uia.models.PartInfoVO;
import com.system.backoffice.uat.uia.service.PartInfoManageService;



@Service("PartInfoManageService")
public class PartInfoManageServiceImpl extends EgovAbstractServiceImpl implements PartInfoManageService {
	
    //@Resource(name = "prop")
	//private Properties fileProperties;
    
	@Value("${Globals.DbType}")
	private String dbType;
    
    
	@Autowired
	private EgovIdGnrService egovGroupIdGnrService;
	
	@Autowired
	private PartInfoManageMapper partMapper;

	@Override
	public List<PartInfoVO> selectPartInfoPageInfoManageListByPagination(Map<String, Object> params) throws Exception {
		return partMapper.selectPartInfoPageInfoManageListByPagination(params);
	}

	@Override
	public List<PartInfoVO> selectPartInfoCombo(Map<String, Object> params) throws Exception {
		return partMapper.selectPartInfoCombo(params);
	}

	

	@Override
	public PartInfoVO selectPartInfoDetail(String partId) throws Exception {
		// TODO Auto-generated method stub
		return partMapper.selectPartInfoDetail(partId);
	}

	@Override
	public int updatePartInfoManage(PartInfo vo) throws Exception {
		// TODO Auto-generated method stub
		//환경 변수가 오라클이냐 아니냐 구분으로 확인 하기 
		if (vo.getMode().equals("Ins")){
			if ( dbType.equals("oracle")){
				vo.setPartId(egovGroupIdGnrService.getNextStringId());
			}
			return partMapper.insertPartInfoManage(vo);
		}else {
			return partMapper.updatePartInfoManage(vo);
		}
	}
	
	

}
