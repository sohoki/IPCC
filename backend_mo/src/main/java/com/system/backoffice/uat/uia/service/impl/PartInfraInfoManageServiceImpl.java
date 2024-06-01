package com.system.backoffice.uat.uia.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.uat.uia.mapper.PartInfraInfoManageMapper;
import com.system.backoffice.uat.uia.models.PartInfraInfo;
import com.system.backoffice.uat.uia.models.dto.PartInfraInfoRequestDto;
import com.system.backoffice.uat.uia.service.PartInfraInfoManageService;

import egovframework.com.cmm.service.Globals;
import lombok.extern.slf4j.Slf4j;

@Transactional(readOnly = true)
@Service
@Slf4j
public class PartInfraInfoManageServiceImpl extends EgovAbstractServiceImpl implements PartInfraInfoManageService {

	@Autowired
	private PartInfraInfoManageMapper partInfraMapper;

	@Override
	public List<Map<String, Object>> selectPartInfraInfoPageInfoManageListByPagination(Map<String, Object> params)
			throws Exception {
		// TODO Auto-generated method stub
		return partInfraMapper.selectPartInfraInfoPageInfoManageListByPagination(params);
	}

	@Override
	public Optional<PartInfraInfo> selectPartfraInfoDetail(String partInfraCode) {
		// TODO Auto-generated method stub
		return partInfraMapper.selectPartfraInfoDetail(partInfraCode);
	}
	@Transactional(readOnly = false)
	@Override
	public int updatePartfraInfoManage(PartInfraInfoRequestDto vo) {
		// TODO Auto-generated method stub
		return vo.getMode().equals(Globals.SAVE_MODE_INSERT) ? partInfraMapper.insertPartfraInfoManage(vo) : partInfraMapper.updatePartfraInfoManage(vo);
	}
	@Transactional(readOnly = false)
	@Override
	public int deletePartfraInfoManage(String partInfraCode) {
		// TODO Auto-generated method stub
		return partInfraMapper.deletePartfraInfoManage(partInfraCode);
	}
	
	
}
