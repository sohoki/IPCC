package com.system.backoffice.sym.svr.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.sym.svr.mapper.ServiceInfoManageMapper;
import com.system.backoffice.sym.svr.models.ServiceInfo;
import com.system.backoffice.sym.svr.models.dto.ServiceInfoReqDto;

import lombok.RequiredArgsConstructor;


@Transactional(readOnly = false)
@RequiredArgsConstructor
@Service
public class ServiceInfoManageService {

	private final ServiceInfoManageMapper serviceMapper;
	
	public List<Map<String, Object>> selectServiceInfoPageList(Map<String, Object> params){
		return serviceMapper.selectServiceInfoPageList(params);
	}
	
	public Optional<ServiceInfo> selectServiceInfoDetail(String serviceSeq){
		return serviceMapper.selectServiceInfoDetail(serviceSeq);
	}
	@Transactional(readOnly = false)
    public int updateServiceInfo(ServiceInfoReqDto vo) {
		return vo.getMode().equals("Ins") ? serviceMapper.insertServiceInfo(vo) : serviceMapper.updateServiceInfo(vo);
	}
    
    //public int updateServiceStatus(ServerStatusDto vo);
	@Transactional(readOnly = false)
    public int deleteServiceInfo(String serviceSeq) {
		return serviceMapper.deleteServiceInfo(serviceSeq);
	}
}
