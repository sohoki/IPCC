package com.system.backoffice.uat.uia.service;

import java.util.List;
import java.util.Map;

import com.system.backoffice.uat.uia.models.PartInfo;
import com.system.backoffice.uat.uia.models.PartInfoVO;


public interface PartInfoManageService {


	List<PartInfoVO> selectPartInfoPageInfoManageListByPagination(Map<String, Object> params)throws Exception;
	
	List<PartInfoVO> selectPartInfoCombo() throws Exception;
	
	PartInfoVO selectPartInfoDetail(String partId)throws Exception;
	
	int updatePartInfoManage(PartInfo vo) throws Exception;
}

