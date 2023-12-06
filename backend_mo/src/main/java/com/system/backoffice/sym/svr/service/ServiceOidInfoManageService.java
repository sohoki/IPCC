package com.system.backoffice.sym.svr.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.sym.svr.mapper.ServiceOidInfoManageMapper;
import com.system.backoffice.sym.svr.models.ServiceOidInfo;
import com.system.backoffice.sym.svr.models.dto.ServiceOidInfoReqDto;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = false)
@RequiredArgsConstructor
@Service
public class ServiceOidInfoManageService {

	private final ServiceOidInfoManageMapper oidMapper;
	
	public List<Map<String, Object>> selectServiceOidInfoPageList(Map<String, Object> params){
		return oidMapper.selectServiceOidInfoPageList(params);
	}
	
	public Optional<ServiceOidInfo> selectServiceOidInfoDetail(String oidSeq){
		return oidMapper.selectServiceOidInfoDetail(oidSeq); 
	}
	
	
    public int updateServiceOidInfo(ServiceOidInfoReqDto vo) {
    	return vo.getMode().equals("Ins") ? oidMapper.insertServiceOidInfo(vo) : oidMapper.updateServiceOidInfo(vo);
    }
    
    //public int updateServerStatus(ServerStatusDto vo);
   
    public int deleteServiceOidInfo(String oidSeq) {
    	return oidMapper.deleteServiceOidInfo(oidSeq);
    }
	
}
