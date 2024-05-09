package com.system.backoffice.infra.ble.wre.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.infra.ble.wre.mapper.StorageInfoManageMapper;
import com.system.backoffice.infra.ble.wre.models.StorageInfo;
import com.system.backoffice.infra.ble.wre.models.StorageInfoVO;
import com.system.backoffice.infra.ble.wre.models.dto.StorageInfoReqDto;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class StorageInfoService {

	
	private final StorageInfoManageMapper storageMapper;

	@Autowired
	protected EgovPropertyService propertiesService;
	
	@Autowired
	protected EgovMessageSource egovMessageSource;
	
	
	public List<StorageInfoVO> selectStorageInfoPageInfoManageListByPagination(Map<String, Object> searchVO) throws Exception {
		// TODO Auto-generated method stub
		return storageMapper.selectStorageInfoManageListByPagination(searchVO);
	}


	public int updateStorageInfoManage(StorageInfoReqDto vo) throws Exception {
		// TODO Auto-generated method stub
		return vo.getMode().equals("Ins") ? storageMapper.insertStorageInfoManage(vo) : storageMapper.updateStorageInfoManage(vo);
	}
	
	public int deleteStorageInfoManage(String storageCode) {
		return storageMapper.deleteStorageInfoManage(storageCode);
	}

}

