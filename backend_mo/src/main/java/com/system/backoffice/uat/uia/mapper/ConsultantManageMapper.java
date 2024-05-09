package com.system.backoffice.uat.uia.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.uat.uia.models.ConsultantInfo;
import com.system.backoffice.uat.uia.models.dto.ConsultantInfoRequestDto;



@Mapper
public interface ConsultantManageMapper {

	public List<Map<String, Object>> selectConstantCombo(@Param("params") Map<String, Object> params) throws Exception;
	
	public List<Map<String, Object>> selectConstantEmpCombo(@Param("params") Map<String, Object> params) throws Exception;
	
	public int deleteConsultantrManage(String extension) throws Exception;
	
	public int insertConsultantrManage(ConsultantInfoRequestDto vo) throws Exception;
	
	public int updateConsultantrPbxStatusManage(ConsultantInfoRequestDto adminInfo) throws Exception;
	
	public int updateConsultantrPbxAgentManage(ConsultantInfoRequestDto adminInfo) throws Exception;
	
	public int updateConsultantrCtisManage(ConsultantInfoRequestDto adminInfo) throws Exception;
	
	public int updateConsultantrManage(ConsultantInfoRequestDto adminInfo) throws Exception;

	public Optional<ConsultantInfo> selectConsultantrManageDetail(String extension) throws Exception;
	
	public Optional<ConsultantInfo> selectConsultantrManageDetailConstantCode(String consultCode) throws Exception;
	
	public List<Map<String, Object>> selectConsultantrManageListByPagination(@Param("params") Map<String, Object> params) throws Exception;
	
	public int selectConsultantrMangerIDCheck(String extension) throws Exception;
}
