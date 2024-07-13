package com.system.backoffice.uat.uia.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.sys.pbx.avaya.mapper.AgentInfoManageMapper;
import com.system.backoffice.sys.pbx.avaya.mapper.StationInfoManageMapper;
import com.system.backoffice.sys.pbx.avaya.models.AgentInfo;
import com.system.backoffice.sys.pbx.avaya.models.StationInfo;
import com.system.backoffice.sys.pbx.avaya.service.AgentInfoManageService;
import com.system.backoffice.sys.pbx.avaya.service.StationInfoManageService;
import com.system.backoffice.uat.uia.mapper.ConsultantManageMapper;
import com.system.backoffice.uat.uia.models.ConsultantInfo;
import com.system.backoffice.uat.uia.models.dto.ConsultantInfoRequestDto;
import com.system.backoffice.uat.uia.models.dto.ConsultantInfoResponseDto;
import com.system.backoffice.uat.uia.service.ConsultantManageService;
import com.system.backoffice.util.service.UtilInfoService;
import com.system.ipcc.cti.nexus.mapper.NexusEmployeeManageMapper;
import com.system.ipcc.cti.nexus.models.NexusAgentInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusAgentRequestInfoDto;



@Transactional(readOnly = true)
@Service
public  class ConsultantManageServiceImpl extends EgovAbstractServiceImpl implements ConsultantManageService {

	
	@Autowired
	private ConsultantManageMapper conMapper;
	
	@Autowired
	private NexusEmployeeManageMapper nexMapper;
	
	@Autowired
	private StationInfoManageService stationService;
	
	@Autowired
	private AgentInfoManageService agentService;
	//추후 변경 가능한지 확인 필요 
	@Autowired
	private StationInfoManageMapper stationMapper;
	@Autowired
	private AgentInfoManageMapper agentMapper;

	@Transactional(readOnly = false)
	@Override
	public int deleteConsultantrManage(String ConstantCode) throws Exception {
		// TODO Auto-generated method stub
				
		Optional<ConsultantInfo> constantInfo =  conMapper.selectConsultantrManageDetailConstantCode(ConstantCode);
				
		if (constantInfo.isPresent()) {
			
			NexusAgentInfo nexus = NexusAgentInfo.builder()
																	.centerId(constantInfo.get().getCtiCenterId())
																	.tenantId(constantInfo.get().getCtiTenantId())
																	.employeegrpId(constantInfo.get().getCtiEmployeegrpid())
																	.employeepartId(constantInfo.get().getCtiEmployeepartid())
																	.employeeId(constantInfo.get().getCtiEmployeeid())
																	.build();
			
			int ret = nexMapper.deleteNexusEmployeesInfo(nexus);
			ret = conMapper.deleteConsultantrManage(constantInfo.get());
			
			return ret ;
		}
		return 0; 
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
		Optional<ConsultantInfo> constantInfo =  conMapper.selectConsultantrManageDetailConstantCode(ConstantCode);
		if (constantInfo.isPresent()) {
			if (!constantInfo.get().getPbxExtension().isEmpty()) {
				Optional<StationInfo> station =  stationService.selectStationInfoDetail(constantInfo.get().getPbxExtension());
				if (station.isPresent())
					constantInfo.get().setStationInfo(station.get());
			}
			if (!constantInfo.get().getPbxLoginId().isEmpty()) {
				Optional<AgentInfo> agent = agentService.selectAgentInfoDetail(constantInfo.get().getPbxLoginId());
				if (agent.isPresent())
					constantInfo.get().setAgentInfo(agent.get());
			}
		}
		return constantInfo;
	}
	@Override
	public List<Map<String, Object>> selectExistsInfraList(Map<String, Object> params) throws Exception {
		return UtilInfoService.NVLObj( params.get("Exists"), "Station").equals("Station")  ? stationMapper.selectStationInfoPageList(params) : 
				agentMapper.selectAgentInfoPageList(params);
	}
	//상담사 퇴직 처리 
	@Transactional(readOnly = false)
	@Override
	public int updateConsultWithdrow(String consultCode) throws Exception {
		// TODO Auto-generated method stub
		
		Optional<ConsultantInfo> info = conMapper.selectConsultantrManageDetailConstantCode(consultCode);
		
		if (info.isPresent()) {
				NexusAgentRequestInfoDto ctiInfo = NexusAgentRequestInfoDto.builder()
																									.centerId(info.get().getCtiCenterId())
																									.tenantId(info.get().getCtiTenantId())
																									.employeegrpId(info.get().getCtiEmployeegrpid())
																									.employeepartId(info.get().getCtiEmployeepartid())
																									.employeeId(info.get().getCtiEmployeeid())
																									.loginId(info.get().getPbxLoginId())
																									.build();
			//넥서스 에서 퇴직 처리 
			int ret = nexMapper.counWithdrowProcess(ctiInfo);
			System.out.println("퇴직자 ret:" + ret);
			
			if (ret > 0) {
				ret = conMapper.counWithdrowProcess(info.get());
				//내선번호 /agent 회수 및 LoginId 값 변경 
				return ret;
			}
		}else {
			return 0;
		}
		return 0;
	}
	
}
