package com.system.backoffice.infra.cor.com.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.infra.cor.com.mapper.CompanyInfoManageMapper;
import com.system.backoffice.infra.cor.com.models.CompanyInfo;
import com.system.backoffice.infra.cor.com.models.CompanyInfoVO;
import com.system.backoffice.infra.cor.com.models.dto.CompanyInfoReqDto;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class CompanyInfoService {

	
	private final CompanyInfoManageMapper companyMapper;

	@Autowired
	protected EgovPropertyService propertiesService;
	
	@Autowired
	protected EgovMessageSource egovMessageSource;
	
	
	public List<CompanyInfoVO> selectCompanyInfoPageInfoManageListByPagination(Map<String, Object> searchVO) throws Exception {
		// TODO Auto-generated method stub
		return companyMapper.selectCompanyInfoManageListByPagination(searchVO);
	}


	public int updateCompanyInfoManage(CompanyInfoReqDto vo) throws Exception {
		// TODO Auto-generated method stub
		return vo.getMode().equals("Ins") ? companyMapper.insertCompanyInfoManage(vo) : companyMapper.updateCompanyInfoManage(vo);
	}
	
	public int deleteCompanyInfoManage(String comCode) {
		return companyMapper.deleteCompanyInfoManage(comCode);
	}

}

