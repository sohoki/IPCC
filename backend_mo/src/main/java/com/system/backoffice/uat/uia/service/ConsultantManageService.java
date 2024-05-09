package com.system.backoffice.uat.uia.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.ibatis.annotations.Param;
import com.system.backoffice.uat.uia.models.ConsultantInfo;
import com.system.backoffice.uat.uia.models.dto.ConsultantInfoRequestDto;


public	interface ConsultantManageService {

	int deleteConsultantrManage(String extension) throws Exception;
	
	List<Map<String, Object>> selectConstantCombo(Map<String, Object> params) throws Exception;
	
	List<Map<String, Object>> selectConstantEmpCombo(Map<String, Object> params) throws Exception;
	
	int insertConsultantrManage(ConsultantInfoRequestDto vo) throws Exception;
	
	int updateConsultantrPbxStatusManage(ConsultantInfoRequestDto adminInfo) throws Exception;
	
	int updateConsultantrPbxAgentManage(ConsultantInfoRequestDto adminInfo) throws Exception;
	
	int updateConsultantrCtisManage(ConsultantInfoRequestDto adminInfo) throws Exception;
	
	int updateConsultantrManage(ConsultantInfoRequestDto adminInfo) throws Exception;

	Optional<ConsultantInfo> selectConsultantrManageDetail(String extension) throws Exception;
	
	Optional<ConsultantInfo> selectConsultantrManageDetailConstantCode(String ConstantCode) throws Exception;
	
	List<?> selectConsultantrManageListByPagination(@Param("params") Map<String, Object> params) throws Exception;
	
	int selectConsultantrMangerIDCheck(String extension) throws Exception;
}
