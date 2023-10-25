package com.system.backoffice.uat.log.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.uat.log.mapper.LoginLogInfoManageMapper;
import com.system.backoffice.uat.log.models.LoginLogInfo;
import com.system.backoffice.uat.log.models.dto.LoginLogResponseDto;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class LoginLogInfoManageService {

	private final LoginLogInfoManageMapper loginMapper;
	
	
	public List<Map<String, Object>> selectLoginLogInfo (LoginLogResponseDto searchVO){
		return loginMapper.selectLoginLogInfo(searchVO);
	}
	@Transactional(readOnly = false)
	public int logInsertLoginLog(LoginLogInfo vo) {
		return loginMapper.logInsertLoginLog(vo);
	}
}
