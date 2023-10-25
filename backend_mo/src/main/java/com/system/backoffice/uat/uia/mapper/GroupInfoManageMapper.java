package com.system.backoffice.uat.uia.mapper;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.uat.uia.models.GroupInfo;
import com.system.backoffice.uat.uia.models.GroupInfoVO;



@Mapper
public interface GroupInfoManageMapper {
	
	public List<GroupInfoVO> selectGroupInfoPageInfoManageListByPagination(GroupInfoVO serarch)throws Exception;
	
	public List<GroupInfoVO> selectGroupCombo() throws Exception;
	
	public int selectGroupInfoPageInfoManageListToCnt_s(GroupInfo serarch);
	
	public GroupInfoVO selectGroupInfoDetail(String groupId);
	
	public int insertGroupInfoManage(GroupInfo vo);
	
	public int updateGroupInfoManage(GroupInfo vo);

}
