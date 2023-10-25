package com.system.backoffice.uat.uia.service.impl;


import java.util.List;
import javax.annotation.Resource;
import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.egovframe.rte.fdl.idgnr.EgovIdGnrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.system.backoffice.uat.uia.mapper.GroupInfoManageMapper;
import com.system.backoffice.uat.uia.models.GroupInfo;
import com.system.backoffice.uat.uia.models.GroupInfoVO;
import com.system.backoffice.uat.uia.service.GroupInfoManageService;

@Service("GroupInfoManageService")
public class GroupInfoManageServiceImpl extends EgovAbstractServiceImpl implements GroupInfoManageService{

	@Autowired
	private GroupInfoManageMapper groupInfo;

	@Resource(name="egovGroupIdGnrService")
	 private EgovIdGnrService egovGroupIdGnrService;
	
	@Override
	public List<GroupInfoVO> selectGroupInfoPageInfoManageListByPagination(
			GroupInfoVO serarch) throws Exception {
		// TODO Auto-generated method stub
		return groupInfo.selectGroupInfoPageInfoManageListByPagination(serarch);
	}

	@Override
	public int selectGroupInfoPageInfoManageListToCnt_s(GroupInfo serarch)
			throws Exception {
		// TODO Auto-generated method stub
		return groupInfo.selectGroupInfoPageInfoManageListToCnt_s(serarch);
	}

	@Override
	public GroupInfoVO selectGroupInfoDetail(String groupId) throws Exception {
		// TODO Auto-generated method stub
		return groupInfo.selectGroupInfoDetail(groupId);
	}

	@Override
	public int updateGroupInfoManage(GroupInfo vo) throws Exception {
		// TODO Auto-generated method stub
		int result = 0;
		if (vo.getMode().equals("Ins")){
			
			String groupId = egovGroupIdGnrService.getNextStringId();
			
			vo.setGroupId(groupId);
			vo.toString();
			result = groupInfo.insertGroupInfoManage(vo);
		}else {
			result = groupInfo.updateGroupInfoManage(vo);
		}
		return result;
		
	}

	@Override
	public List<GroupInfoVO> selectGroupCombo() throws Exception {
		// TODO Auto-generated method stub
		return groupInfo.selectGroupCombo();
	}
	
	
	
	
}
