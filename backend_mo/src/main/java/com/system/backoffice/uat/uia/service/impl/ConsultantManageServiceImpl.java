package com.system.backoffice.uat.uia.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.backoffice.uat.uia.mapper.ConsultantManageMapper;
import com.system.backoffice.uat.uia.models.ConsultantInfo;
import com.system.backoffice.uat.uia.models.dto.ConsultantInfoRequestDto;
import com.system.backoffice.uat.uia.service.ConsultantManageService;



@Service("ConsultantManageService")
public class ConsultantManageServiceImpl extends EgovAbstractServiceImpl implements ConsultantManageService {

	
	@Autowired
	private ConsultantManageMapper conMapper;

	@Override
	public int deleteConsultantrManage(String extension) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.deleteConsultantrManage(extension);
	}

	@Override
	public int insertConsultantrManage(ConsultantInfoRequestDto vo) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.insertConsultantrManage(vo);
	}

	@Override
	public int updateConsultantrPbxStatusManage(ConsultantInfoRequestDto adminInfo) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.updateConsultantrPbxStatusManage(adminInfo);
	}

	@Override
	public int updateConsultantrPbxAgentManage(ConsultantInfoRequestDto adminInfo) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.updateConsultantrPbxAgentManage(adminInfo);
	}

	@Override
	public int updateConsultantrCtisManage(ConsultantInfoRequestDto adminInfo) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.updateConsultantrCtisManage(adminInfo);
	}

	@Override
	public int updateConsultantrManage(ConsultantInfoRequestDto adminInfo) throws Exception {
		// TODO Auto-generated method stub
		return conMapper.updateConsultantrManage(adminInfo);
	}

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
	public List<Map<String, Object>> selectConstantCombo() throws Exception {
		// TODO Auto-generated method stub
		return conMapper.selectConstantCombo();
	}
}
