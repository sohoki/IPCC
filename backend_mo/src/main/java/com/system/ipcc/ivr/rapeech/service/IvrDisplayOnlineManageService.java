package com.system.ipcc.ivr.rapeech.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.system.ipcc.ivr.rapeech.mapper.IvrDisplayOnlineManageMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class IvrDisplayOnlineManageService {

	private final IvrDisplayOnlineManageMapper ivrMapper;
	
	public List<Map<String, Object>> selectIvrOnlineDisplayInfo(){
		return ivrMapper.selectIvrOnlineDisplayInfo();
	}
}
