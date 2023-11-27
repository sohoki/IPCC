package com.system.backoffice.bas.system.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.bas.system.mapper.SystemInfoManageMapper;
import com.system.backoffice.bas.system.models.dto.SystemInfoRequestDto;
import com.system.backoffice.bas.system.models.dto.SystemInfoResDto;
import com.system.backoffice.uat.uia.mapper.UniUtilManageMapper;
import com.system.backoffice.util.service.UtilInfoService;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class SystemInfoManageService {

	
	@Autowired
	private final SystemInfoManageMapper sysMapper;
	
	@Autowired
	private UniUtilManageMapper uniMapper;
	
	
	public List<SystemInfoResDto> selectSystemInfoList(Map<String, Object> params) throws Exception {
		return sysMapper.selectSystemInfoList(params);
	}

	public List<Map<String, Object>> selectSystemCombo(String useYn){
		return sysMapper.selectSystemCombo(useYn);
	}
	
	public Optional<SystemInfoResDto> selectSystemInfoDetail(String systemCode) throws Exception {
		return sysMapper.selectSystemInfoDetail(systemCode);
	}
	
	@Transactional(readOnly = false)
	public int updateSystemInfo(SystemInfoRequestDto  sysinfo) throws Exception {
		
		if (sysinfo.getMode().equals("Ins") && (uniMapper.selectIdDoubleCheckString("SYSTEM_CODE", "TB_SYSTEMINFO", "SYSTEM_CODE = ["+ sysinfo.getSystemCode() + "[" ) > 0)) 
			return -1 ;
			
		return sysinfo.getMode().equals("Ins") ? sysMapper.insertSystemInfo(sysinfo): sysMapper.updateSystemInfo(sysinfo);
	}
	
	

	@Transactional(readOnly = false)
	public int deleteSystemInfo(String systemCode) throws Exception {
		return sysMapper.deleteSystemInfo(systemCode);
	}

}
