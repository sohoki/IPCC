package com.system.backoffice.sym.log.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.egovframe.rte.fdl.idgnr.EgovIdGnrService;
import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.sym.log.mapper.InterfaceInfoManageMapper;
import com.system.backoffice.sym.log.models.InterfaceInfo;
import egovframework.com.cmm.EgovMessageSource;
import lombok.RequiredArgsConstructor;


@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class InterfaceInfoManageService {

	@Autowired
	private EgovMessageSource egovMessageSource;
	
	@Autowired
	private InterfaceInfoManageMapper interfaceMapper;
	
	@Resource (name = "egovTrsmrcvLogIdGnrService")
	private EgovIdGnrService egovTranLog;

	@Autowired
	protected EgovPropertyService propertiesService;
	
	
	public List<Map<String, Object>> selectInterfaceLogInfo(Map<String, Object> searchVO) throws Exception {
		return interfaceMapper.selectInterfaceLogInfo(searchVO);
	}
	
	
	public Map<String, Object> selectInterfaceDetail(String requstId) throws Exception {
		return interfaceMapper.selectInterfaceDetail(requstId);
	}
	
	
    public String selectInterfaceLogCsvHeader() throws Exception {
		return interfaceMapper.selectInterfaceLogCsvHeader();
	}
    
	
    public List<String> selectInterfaceLogCsvList(InterfaceInfo vo) throws Exception{
		return interfaceMapper.selectInterfaceLogCsvList(vo);
	}
	
	
	public int InterfaceInsertLoginLog(InterfaceInfo vo) throws Exception {
		vo.setRequstId( egovTranLog.getNextStringId());
		return interfaceMapper.InterfaceInsertLoginLog(vo);
	}

	
	public int InterfaceUpdateLoginLog(InterfaceInfo vo) throws Exception {
		return interfaceMapper.InterfaceUpdateLoginLog(vo);
	}
	
	
	public int deleteInterfaceLogCsvList(String occrrncDe) throws Exception {
		return interfaceMapper.deleteInterfaceLogCsvList(occrrncDe);
	}
}
