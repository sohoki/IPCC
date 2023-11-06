package com.system.backoffice.uat.uia.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.system.backoffice.uat.uia.mapper.AdminInfoManagerMapper;
import com.system.backoffice.uat.uia.mapper.UserRoleInfoManageMapper;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.backoffice.uat.uia.models.AdminInfo;
import com.system.backoffice.uat.uia.models.AdminInfoVO;
import com.system.backoffice.uat.uia.models.UserRoleInfo;
import com.system.backoffice.uat.uia.models.dto.UserRoleInfoRequestDto;
import com.system.backoffice.uat.uia.service.AdminInfoManageService;

import egovframework.let.utl.sim.service.EgovFileScrty;
import org.springframework.transaction.annotation.Transactional;


@Service("AdminInfoManageService")
public class AdminInfoManageServiceImpl extends EgovAbstractServiceImpl implements  AdminInfoManageService {

	
	@Autowired
	private AdminInfoManagerMapper adminMapper;
	
	@Autowired 
	private UserRoleInfoManageMapper userRoleMapper;
	
	
	@Override
	public int deleteAdminUserManage(String mberId) throws Exception {
		// TODO Auto-generated method stub
		int ret = adminMapper.deleteAdminUserManage(mberId);
		if (ret > 0) {
			userRoleMapper.deleteUserRole(mberId);
		}
		return ret;
	}
	@Transactional
	@Override
	public int updateAdminUserManage(AdminInfoVO vo) throws Exception {
		// TODO Auto-generated method stub
		
		if (vo.getMode().equals("Ins")) {
			String enpassword = EgovFileScrty.encryptPassword(vo.getAdminPassword(), vo.getAdminId());
			vo.setAdminPassword(enpassword);
			
		}
		
		
		int ret = (vo.getMode().equals("Ins")) ? adminMapper.insertAdminUserManage(vo) : adminMapper.updateAdminUserManage(vo) ;		
		List<UserRoleInfo> userRole = userRoleMapper.userRoleInfoSelectList(vo.getAdminId());
		List<String> userRoleArray = userRole.stream().map(x -> x.getRoleId()).collect(Collectors.toList());
		List<String> updtRoleList = vo.getRoleInfo().stream().map(x -> x.getRoleId())
															 .collect(Collectors.toList());
		
		//신규 Role
		List<UserRoleInfoRequestDto> insertRole = vo.getRoleInfo().stream()
									               .filter(x -> !userRoleArray.contains(x.getRoleId()))
									               .map( x -> new UserRoleInfoRequestDto("", x.getRoleId(), vo.getAdminId() ))
									               .collect(Collectors.toList());
		//삭제 Role 
		List<String> delRoleList = userRole.stream()
								   .filter(x -> !updtRoleList.contains(x.getRoleId()))
								   .map(x-> x.getUserRoleSeq())
								   .collect(Collectors.toList());
		ret = delRoleList.size() < 1 ? 1 :   userRoleMapper.deleteUserRoleList(delRoleList);
		ret = insertRole.size() < 1 ? 1 : userRoleMapper.insertUserRoleList(insertRole);
		return ret;
	}

	@Override
	public Optional<AdminInfoVO> selectAdminUserManageDetail(String mberId) throws Exception {
		// TODO Auto-generated method stub
		
		Optional<AdminInfoVO> userInfo = adminMapper.selectAdminUserManageDetail(mberId);
		if (userInfo.isPresent()) {
			List<UserRoleInfo> userRole = userRoleMapper.userRoleInfoSelectList(mberId);
			userInfo.orElseThrow().setRoleInfo(userRole);
		}
		return userInfo;
	}

	@Override
	public List<?> selectAdminUserManageListByPagination(Map<String, Object> params)throws Exception {
		// TODO Auto-generated method stub
		return adminMapper.selectAdminUserManageListByPagination(params);
	}

	@Override
	public int selectAdminUserMangerIDCheck(String code) throws Exception {
		// TODO Auto-generated method stub
		return adminMapper.selectAdminUserMangerIDCheck(code);
	}
	@Transactional
	@Override
	public int updateAdminUserLockManage(String adminId) throws Exception {
		// TODO Auto-generated method stub
		return adminMapper.updateAdminUserLockManage(adminId);
	}

	@Transactional
	@Override
	public int updatePassChange(AdminInfo vo) throws Exception {
		// TODO Auto-generated method stub
		String enpassword = EgovFileScrty.encryptPassword(vo.getAdminPassword(), vo.getAdminId());
		vo.setAdminPassword(enpassword);
		
		return adminMapper.updatePassChange(vo);
	}
	@Override
	public int selectAdminPasswordCheck(Map<String, Object> params) throws Exception {
		// TODO Auto-generated method stub
		String enpassword = EgovFileScrty.encryptPassword(params.get("adminPassword").toString(), params.get("adminId").toString());
		params.put("adminPasswordEnc", enpassword);
		
		return adminMapper.selectAdminPasswordCheck(params);
	}
	@Override
	public List<Map<String, Object>> selectAdminUserCombo() throws Exception {
		// TODO Auto-generated method stub
		return adminMapper.selectAdminUserCombo();
	}
}
