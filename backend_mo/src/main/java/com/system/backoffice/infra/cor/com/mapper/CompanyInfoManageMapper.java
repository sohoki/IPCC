package com.system.backoffice.infra.cor.com.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.infra.cor.com.models.CompanyInfo;
import com.system.backoffice.infra.cor.com.models.CompanyInfoVO;
import com.system.backoffice.infra.cor.com.models.dto.CompanyInfoReqDto;


@Mapper
public interface CompanyInfoManageMapper {
	
    public List<CompanyInfoVO> selectCompanyInfoManageListByPagination(@Param("params") Map<String, Object> vo);
	
    public int updateCompanyInfoManage(CompanyInfoReqDto vo);
    
    public int insertCompanyInfoManage(CompanyInfoReqDto vo);
    
    public int deleteCompanyInfoManage(String comCode);
}
