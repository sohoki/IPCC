package com.system.backoffice.infra.bld.cnt.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.infra.bld.cnt.models.CenterInfo;
import com.system.backoffice.infra.bld.cnt.models.CenterInfoVO;
import com.system.backoffice.infra.bld.cnt.models.dto.CenterInfoReqDto;


@Mapper
public interface CenterInfoManageMapper {
	
    public List<CenterInfoVO> selectCenterInfoManageListByPagination(@Param("params") Map<String, Object> vo);
	
    public List<CenterInfoVO> selectCenterInfoManageCombo();
	
    public Optional<CenterInfoVO> selectCenterInfoManageDetail(String centerId);
	
    public int updateCenterInfoManage(CenterInfoReqDto vo);
    
    public int updateCenterStateChange(CenterInfoReqDto vo);
    
    public int updateFileDetailInfo(CenterInfo vo);
    
    public int insertCenterInfoManage(CenterInfoReqDto vo);
    
    public int deleteCenterInfoManage(String centerId);
}
