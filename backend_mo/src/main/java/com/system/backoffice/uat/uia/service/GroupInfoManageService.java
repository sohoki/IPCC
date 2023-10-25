package com.system.backoffice.uat.uia.service;

import java.util.List;
import com.system.backoffice.uat.uia.models.GroupInfo;
import com.system.backoffice.uat.uia.models.GroupInfoVO;

public interface GroupInfoManageService {

	
	List<GroupInfoVO> selectGroupInfoPageInfoManageListByPagination(GroupInfoVO serarch)throws Exception;
	
	List<GroupInfoVO> selectGroupCombo() throws Exception;
	
	int selectGroupInfoPageInfoManageListToCnt_s(GroupInfo serarch)throws Exception;
	
	GroupInfoVO selectGroupInfoDetail(String groupId)throws Exception;
	
	int updateGroupInfoManage(GroupInfo groupInfo) throws Exception;
	
}

