package com.system.backoffice.infra.ble.wre.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.infra.ble.wre.models.StorageInfo;
import com.system.backoffice.infra.ble.wre.models.StorageInfoVO;
import com.system.backoffice.infra.ble.wre.models.dto.StorageInfoReqDto;


@Mapper
public interface StorageInfoManageMapper {
	
    public List<StorageInfoVO> selectStorageInfoManageListByPagination(@Param("params") Map<String, Object> vo);
	
    public int updateStorageInfoManage(StorageInfoReqDto vo);
    
    public int insertStorageInfoManage(StorageInfoReqDto vo);
    
    public int deleteStorageInfoManage(String storageCode);
}
