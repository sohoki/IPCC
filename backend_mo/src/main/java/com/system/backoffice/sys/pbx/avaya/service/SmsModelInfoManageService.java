package com.system.backoffice.sys.pbx.avaya.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.sys.pbx.avaya.mapper.SmsModelInfoMapper;
import com.system.backoffice.sys.pbx.avaya.models.SmsModelInfo;
import com.system.backoffice.sys.pbx.avaya.models.dto.SmsModeReqlInfoDto;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class SmsModelInfoManageService {

	private final SmsModelInfoMapper smsModelMapper;

	public List<Map<String, Object>> selectSmsInfoPageList(Map<String, Object> params){
		return smsModelMapper.selectSmsInfoPageList(params);
	}
	
	public Optional<SmsModelInfo> selectSmsInfoDetail(String notiSeq) {
		return smsModelMapper.selectSmsInfoDetail(notiSeq);
	}
	
    public int updateSmsInfo(SmsModeReqlInfoDto vo) {
    	return vo.getMode().equals("Ins") ? smsModelMapper.insertSmsInfo(vo) : smsModelMapper.updateSmsInfo(vo);
    }
    
    public int deleteSmsInfo(String notiSeq) {
    	return smsModelMapper.deleteSmsInfo(notiSeq);
    }
}
