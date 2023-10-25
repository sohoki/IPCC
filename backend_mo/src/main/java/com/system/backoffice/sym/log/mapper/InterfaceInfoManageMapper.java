package com.system.backoffice.sym.log.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.sym.log.models.InterfaceInfo;

@Mapper
public interface InterfaceInfoManageMapper {

    public List<Map<String, Object>> selectInterfaceLogInfo(@Param("params") Map<String, Object> searchVO);
    
    public Map<String, Object> selectInterfaceDetail(String requstId);
	
    public String selectInterfaceLogCsvHeader() throws Exception;
    
    public List<String> selectInterfaceLogCsvList(InterfaceInfo vo);
    
	public int InterfaceInsertLoginLog(InterfaceInfo vo);
	
	public int InterfaceUpdateLoginLog(InterfaceInfo vo);
	
	public int deleteInterfaceLogCsvList(@Param("occrrncDe") String occrrncDe);
}
