package com.system.backoffice.uat.uia.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;
import com.system.backoffice.uat.uia.models.AdminInfo;
import com.system.backoffice.uat.uia.models.AdminInfoVO;



@Mapper
public interface AdminInfoManagerMapper {

	public int deleteAdminUserManage(String mberId) throws Exception;
	
	public int insertAdminUserManage(AdminInfo vo) throws Exception;
	
	public int updatePassChange(AdminInfo vo) throws Exception;
	
	public int updateAdminUserLockManage(String adminId) throws Exception;
	
	public int updateAdminUserManage(AdminInfo adminInfo) throws Exception;

	public Optional<AdminInfoVO> selectAdminUserManageDetail(String adminId) throws Exception;
	
	public List<?> selectAdminUserManageListByPagination(@Param("params") Map<String, Object> params) throws Exception;
	
	public int selectAdminUserMangerIDCheck(String code) throws Exception;
	
	public List<Map<String, Object>> selectAdminUserCombo(@Param("params") Map<String, Object> params) throws Exception;
	
	public int selectAdminPasswordCheck(@Param("params") Map<String, Object> params) throws Exception;
	
}
