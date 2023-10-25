package com.system.backoffice.sym.log.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;
import com.system.backoffice.sym.log.models.SysLog;

@Mapper
public interface SysLogManageMapper {

	public List<Map<String, Object>> selectSysLogList(@Param("params") Map<String, Object> params);
	
	public Map<String, Object> selectSysLogInfo(@Param("requstId") String requstId);
	
	public int logInsertSysLog(SysLog vo);
	
	public int logInsertSysLogSummary();
	
	public int logDeleteSysLogSummary();
}
