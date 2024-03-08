package com.system.backoffice.uat.uia.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;

import com.system.backoffice.uat.uia.models.AdminInfo;
import com.system.backoffice.uat.uia.models.AdminInfoVO;
import com.system.backoffice.uat.uia.models.dto.UserAuthInfoDto;
import com.system.backoffice.uat.uia.models.dto.UserAuthInfoReqDto;


public  interface AdminInfoManageService {

	int deleteAdminUserManage(String mberId) throws Exception;
	
	int updateAdminUserManage(AdminInfoVO vo) throws Exception;
	
	int updateAdminUserLockManage(String adminId) throws Exception;
	
	int updatePassChange(AdminInfo vo) throws Exception;
	
	Optional<AdminInfo> selectAdminUserManageDetail(String mberId) throws Exception;
	//system값
	List<UserAuthInfoDto> selectSystemMenuList(UserAuthInfoReqDto req) throws Exception;
	
	List<?> selectAdminUserManageListByPagination(Map<String, Object> params) throws Exception;  
	
	//List<UserAuthInfoDto> selectSystemUserMenuInfo(String userId) throws Exception;
	
	List<Map<String, Object>> selectAdminUserCombo(Map<String, Object> params) throws Exception;
	
	int selectAdminUserMangerIDCheck(String code) throws Exception;

	int selectAdminPasswordCheck(Map<String, Object> params) throws Exception;
}

