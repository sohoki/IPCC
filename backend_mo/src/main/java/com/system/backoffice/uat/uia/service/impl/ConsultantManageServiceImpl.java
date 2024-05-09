package com.system.backoffice.uat.uia.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.system.backoffice.uat.uia.mapper.ConsultantManageMapper;
import com.system.backoffice.uat.uia.models.ConsultantInfo;
import com.system.backoffice.uat.uia.models.dto.ConsultantInfoRequestDto;
import com.system.backoffice.uat.uia.service.ConsultantManageService;
import com.system.ipcc.cti.nexus.mapper.NexusEmployeeManageMapper;



@Transactional(readOnly = true)
@Service
public  class ConsultantManageServiceImpl extends EgovAbstractServiceImpl implements ConsultantManageService {

	
	@Autowired
	private ConsultantManageMapper conMapper;
	
	@Autowired
	private NexusEmployeeManageMapper nexMapper;

	@Override
	public int deleteConsultantrManage(String extension) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.deleteConsultantrManage(extension);
	}
	@Transactional(readOnly = false)
	@Override
	public int insertConsultantrManage(ConsultantInfoRequestDto vo) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.insertConsultantrManage(vo);
	}
	@Transactional(readOnly = false)
	@Override
	public int updateConsultantrPbxStatusManage(ConsultantInfoRequestDto adminInfo) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.updateConsultantrPbxStatusManage(adminInfo);
	}
	@Transactional(readOnly = false)
	@Override
	public int updateConsultantrPbxAgentManage(ConsultantInfoRequestDto adminInfo) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.updateConsultantrPbxAgentManage(adminInfo);
	}
	@Transactional(readOnly = false)
	@Override
	public int updateConsultantrCtisManage(ConsultantInfoRequestDto adminInfo) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.updateConsultantrCtisManage(adminInfo);
	}
	@Transactional(readOnly = false)
	@Override
	public int updateConsultantrManage(ConsultantInfoRequestDto adminInfo) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.updateConsultantrManage(adminInfo);
	}
	//코드 관리 할지 않할지 결정 
	@Override
	public Optional<ConsultantInfo> selectConsultantrManageDetail(String extension) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.selectConsultantrManageDetail(extension);
	}

	@Override
	public List<?> selectConsultantrManageListByPagination(Map<String, Object> params) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.selectConsultantrManageListByPagination(params);
	}

	@Override
	public int selectConsultantrMangerIDCheck(String extension) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.selectConsultantrMangerIDCheck(extension);
	}

	@Override
	public List<Map<String, Object>> selectConstantCombo(Map<String, Object> params) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.selectConstantCombo(params);
	}

	@Override
	public List<Map<String, Object>> selectConstantEmpCombo(Map<String, Object> params) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.selectConstantEmpCombo(params);
	}

	@Override
	public Optional<ConsultantInfo> selectConsultantrManageDetailConstantCode(String ConstantCode) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.selectConsultantrManageDetailConstantCode(ConstantCode);
	}
}
