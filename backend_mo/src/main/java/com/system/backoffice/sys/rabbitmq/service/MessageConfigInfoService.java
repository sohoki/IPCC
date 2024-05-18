package com.system.backoffice.sys.rabbitmq.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.sys.rabbitmq.mapper.MessageConfigInfoManageMapper;
import com.system.backoffice.sys.rabbitmq.models.MessageConfigInfo;
import com.system.backoffice.sys.rabbitmq.models.MessageConfigInfoVO;
import com.system.backoffice.sys.rabbitmq.models.dto.MessageConfigInfoReqDto;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class MessageConfigInfoService {

	
	private final MessageConfigInfoManageMapper messageConfigInfoMapper;

	@Autowired
	protected EgovPropertyService propertiesService;
	
	@Autowired
	protected EgovMessageSource egovMessageSource;
	
	
	public List<MessageConfigInfoVO> selectMessageConfigInfoInfoManageListByPagination(Map<String, Object> searchVO) throws Exception {
		// TODO Auto-generated method stub
		return messageConfigInfoMapper.selectMessageConfigInfoManageListByPagination(searchVO);
	}


	public int updateMessageConfigInfoManage(MessageConfigInfoReqDto vo) throws Exception {
		// TODO Auto-generated method stub
		return vo.getMode().equals("Ins") ? messageConfigInfoMapper.insertMessageConfigInfoManage(vo) : messageConfigInfoMapper.updateMessageConfigInfoManage(vo);
	}
	
	public int deleteMessageConfigInfoManage(String comCode) {
		return messageConfigInfoMapper.deleteMessageConfigInfoManage(comCode);
	}

}

