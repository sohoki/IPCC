package com.system.backoffice.uat.uia.mapper;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;
import com.system.backoffice.uat.uia.models.UserRoleInfo;
import com.system.backoffice.uat.uia.models.dto.UserRoleInfoRequestDto;

@Mapper
public interface UserRoleInfoManageMapper {

	public List<UserRoleInfo> userRoleInfoSelectList(String userId);
	
    public int insertUserRoleList (List<UserRoleInfoRequestDto> list);
    
    @SuppressWarnings("rawtypes")
    public int deleteUserRoleList(List list);
    
    public int deleteUserRole(String userId);
}
