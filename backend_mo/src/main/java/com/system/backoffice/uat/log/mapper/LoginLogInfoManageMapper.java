package com.system.backoffice.uat.log.mapper;

import java.util.List;
import java.util.Map;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;
import com.system.backoffice.uat.log.models.LoginLogInfo;
import com.system.backoffice.uat.log.models.dto.LoginLogResponseDto;

@Mapper
public interface LoginLogInfoManageMapper {

	public List<Map<String, Object>> selectLoginLogInfo (LoginLogResponseDto searchVO);
	
	public int logInsertLoginLog(LoginLogInfo vo);
}
