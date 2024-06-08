package com.system.backoffice.uat.uia.web;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.sys.pbx.avaya.models.SmsModelInfo;
import com.system.backoffice.sys.pbx.avaya.models.dto.AgentInfoReqDto;
import com.system.backoffice.sys.pbx.avaya.models.dto.StationInfoReqDto;
import com.system.backoffice.sys.pbx.avaya.service.AgentInfoManageService;
import com.system.backoffice.sys.pbx.avaya.service.SmsModelInfoManageService;
import com.system.backoffice.sys.pbx.avaya.service.StationInfoManageService;
import com.system.backoffice.uat.uia.models.ConsultantInfo;
import com.system.backoffice.uat.uia.models.dto.ConsultantInfoRequestDto;
import com.system.backoffice.uat.uia.service.ConsultantManageService;
import com.system.backoffice.util.service.UtilInfoService;
import com.system.ipcc.cti.nexus.models.NexusAgentInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusAgentInfoResponseDto;
import com.system.ipcc.cti.nexus.models.dto.NexusAgentRequestInfoDto;
import com.system.ipcc.cti.nexus.service.NexusEmployeeManageService;
import com.system.ipcc.pbx.avaya.models.PbxMemberInfo;
import com.system.ipcc.pbx.avaya.service.smsxml.SMSReq;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Api(tags = {"상담원 관리 정보 API"})
@RequiredArgsConstructor // final이 선언된 모든 필드를 인자값으로 하는 생성자를 대신 생성하여, 빈을 생성자로 주입받게 한다.
@RestController
@Slf4j
@RequestMapping("/api/backoffice/uat/uia/contant")
public class ConsultantManageController {

private static final Logger LOGGER = LoggerFactory.getLogger(AdminInfoManageController.class);
	
	@Autowired
	private ConsultantManageService consulService;
	
	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertiesService;
	
	@Resource(name="egovMessageSource")
	protected EgovMessageSource egovMessageSource;

	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	@Autowired
	private StationInfoManageService stationService;
	
	@Autowired
	private AgentInfoManageService agentService;
	
	@Autowired 
	private NexusEmployeeManageService ctiService;
	
	@Autowired
	private SmsModelInfoManageService smsService;
	
	@Autowired
	private SMSReq client;
	
	@ApiOperation( value = "상담원 정보 조회" , notes = "성공시 상담원 정보를 조회한다.")
	@ApiImplicitParams({
	@ApiImplicitParam(
			name = "id"
			, value = "자격증 아이디"
			, required = true
			, dataType = "string"
			, paramType = "path"
			, defaultValue = "None"
		),
		@ApiImplicitParam(
			name = "fields"
			, value = "응답 필드 종류"
			, required = false
			, dataType = "string"
			, paramType = "query"
			, defaultValue = ""
		)
	})
	@PostMapping("consultantList.do")
	public ModelAndView selectUserConsultantrList(@RequestBody Map<String, Object> searchVO,
											  							HttpServletRequest request) throws Exception{
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request) && !jwtVerification.isVerificationSystem(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}else {
				String[] userinfo = jwtVerification.getTokenUserInfo(request);
				searchVO.put(Globals.PAGE_LOGIN_SYSTEM_CODE, userinfo[1]);
				searchVO.put(Globals.PAGE_LOGIN_ROLEID, userinfo[2]);
				searchVO.put(Globals.PAGE_LOGIN_PARTID , userinfo[3]);
				searchVO.put(Globals.PAGE_LOGIN_INSTTCODE , userinfo[4]);
			}
			
			if (!searchVO.get(Globals.PAGE_LOGIN_PARTID).equals("SYSTEM"))
				searchVO.put(Globals.PAGE_UNIT, UtilInfoService.NVLObj(searchVO.get(Globals.PAGE_UNIT), propertiesService.getInt(Globals.PAGE_UNIT)));
			else 
				searchVO.put(Globals.PAGE_UNIT, 1000);
			searchVO.put(Globals.PAGE_SIZE, UtilInfoService.NVLObj(searchVO.get(Globals.PAGE_SIZE), propertiesService.getInt(Globals.PAGE_SIZE)));
			
			
			PaginationInfo paginationInfo = new PaginationInfo();
			paginationInfo.setCurrentPageNo(Integer.parseInt(UtilInfoService.NVLObj(searchVO.get(Globals.PAGE_INDEX),"1")));
			paginationInfo.setRecordCountPerPage(propertiesService.getInt(Globals.PAGE_UNIT));
			paginationInfo.setPageSize(propertiesService.getInt(Globals.PAGE_UNIT));
			
			
			searchVO.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
			searchVO.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
			searchVO.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
			model.addObject(Globals.STATUS_REGINFO, searchVO);
			
			@SuppressWarnings("unchecked")
			List<Map<String, Object>> adminList =  (List<Map<String, Object>>) consulService.selectConsultantrManageListByPagination(searchVO); 
			
			
			model.addObject("resultList",  adminList);      	       
			int totCnt = adminList.size() > 0 ? Integer.parseInt(adminList.get(0).get(Globals.PAGE_TOTAL_RECORD_COUNT).toString()) : 0;  
			paginationInfo.setTotalRecordCount(totCnt);
			model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
			model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch (Exception e){
			LOGGER.debug("selectUserConsultantrList  error:" + e.toString());
			LOGGER.debug("selectUserConsultantrList  error:" + e.getStackTrace()[0].getLineNumber());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.msg")+ e.toString());	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		return model;
	}
	
	@ApiOperation(value="상담사 업데이트", notes = "성공시 상담사 업데이트 합니다.")
	@PostMapping("update.do")
	public ModelAndView UserInsertPbx( @RequestBody  ConsultantInfoRequestDto pbxInfo,
														HttpServletRequest request ) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
				//상담사 수정 
				if (!jwtVerification.isVerificationAdmin(request)) {
					ResultVO resultVO = new ResultVO();
					return jwtVerification.handleAuthError(resultVO); // 토큰 확인
				}else {
					pbxInfo.setUserId(jwtVerification.getTokenUserName(request));
				}
				String status = "";
				if (pbxInfo.getMode().equals(Globals.SAVE_MODE_INSERT)) {
					if (!pbxInfo.getPbxExists().equals("Y")) {
						//station에 신규 등록
						StationInfoReqDto station =  StationInfoReqDto.builder().mode(pbxInfo.getMode())
																	.extension(pbxInfo.getPbxExtension())
																	.name(pbxInfo.getPbxName())
																	.tn(pbxInfo.getPbxTn())
																	.type(pbxInfo.getPbxType())
																	.cor(pbxInfo.getPbxCor())
																	.cos(pbxInfo.getPbxCos())
																	.securityCode(pbxInfo.getPbxSecurityCode())
																	.displayLangage(pbxInfo.getPbxDisplayLangage())
																	.ipSoftphone(pbxInfo.getIpSoftphone())
																	.consultUseyn("Y")
																	.stationButton(pbxInfo.getStationButton())
																	.build();	
						ModelAndView modelResult = client.execRequestStationUpdate(station);
						
						if (modelResult.getModel().get(Globals.STATUS).equals(Globals.STATUS_SUCCESS)) {
							status = stationService.updateStationInfo(station) > 0 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
							
						}else {
							status =Globals.STATUS_FAIL;
						}
						if (status.equals(Globals.STATUS_SUCCESS)) {
							consulService.insertConsultantrManage(pbxInfo) ;
						}else {
							model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
							model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg"));
							return model;
						}
					}else {
						consulService.insertConsultantrManage(pbxInfo) ;
					}
					if (!pbxInfo.getAgentExists().equals("Y")) {
						AgentInfoReqDto agent = AgentInfoReqDto.builder().mode(pbxInfo.getMode())
																					.loginId(pbxInfo.getPbxLoginId())
																					.name(pbxInfo.getPbxName())
																					.scenInfos(pbxInfo.getScenInfos())
																					.build();
						ModelAndView modelResult = client.execRequestAgentUpdate(agent);
						
						if (modelResult.getModel().get(Globals.STATUS).equals(Globals.STATUS_SUCCESS)) {
							status = agentService.updateAgentInfo(agent) > 0 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
						}else {
							status =Globals.STATUS_FAIL;
						}
						if (status.equals(Globals.STATUS_SUCCESS)) {
							consulService.updateConsultantrPbxAgentManage(pbxInfo) ;
						}else {
							model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
							model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg"));
							return model;
						} 
					}else {
						consulService.updateConsultantrPbxAgentManage(pbxInfo) ;
					}
					if (!pbxInfo.getCtiExists().equals("Y")) {
						NexusAgentRequestInfoDto cti = NexusAgentRequestInfoDto.builder().mode(pbxInfo.getMode())
																			.centerId(pbxInfo.getCtiCenterId())
																			.tenantId(pbxInfo.getCtiTenantId())
																			.employeegrpId(pbxInfo.getCtiEmployeegrpid())
																			.employeepartId(pbxInfo.getCtiEmployeepartid())
																			.employeeId(pbxInfo.getCtiLoginid())
																			.loginId(pbxInfo.getPbxLoginId())
																			.employeeName(pbxInfo.getCtiName())
																			.employeePawd(pbxInfo.getCtiPassword())
																			.blendKind(pbxInfo.getCtiBlendKind())
																			.permitId(pbxInfo.getCtiPermitId())
																			.skillDepth1("0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000")
																			.skillDepth2("0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000")
																			.skillDepth3("0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000")
																			.skillDepth4("0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000")
																			.skillDepth5("0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000")
																			.skillDepth6("0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000")
																			.skillDepth7("0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000")
																			.skillDepth8("0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000")
																			.skillDepth9("0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000")
																			.skillDepth10("0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000 0000000000")
																			.defaultQueue(pbxInfo.getCtiDefaultQueue())
																			.userDefine1("")
																			.userDefine2("")
																			.userDefine3("")
																			.sendFilesize("30")
																			.monitorFlag(pbxInfo.getCtiMoniterFlag())
																			.workHours("0")
																			.emailAddr("")
																			.employeeAlias("")
																			.updateUser("NEX10000")
																			.userId("NEX10000")
																			.employeeDuty("")
																			.logoffReason("0")
																			.tel_home("")
																			.build();

								int ret = ctiService.updateNexusEmployeesInfo(cti);
								if (ret > 0) {
										NexusAgentInfo agentinfo = new NexusAgentInfo();
										agentinfo.setCenterId(cti.getCenterId());
										agentinfo.setEmployeeId(pbxInfo.getCtiEmployeeid());
										agentinfo.setTenantId(pbxInfo.getCtiTenantId());
										
										Optional<NexusAgentInfoResponseDto> nexus =  ctiService.selectEmployeesExistInfoDetail(agentinfo);
										if (nexus.isPresent()){
											pbxInfo.setCtiCenterName(nexus.get().getCenterName());
											pbxInfo.setCtiTenantName(nexus.get().getTenantName());
											pbxInfo.setCtiEmployeegrpName(nexus.get().getEmployeegrpName());
											pbxInfo.setCtiEmployeepartName(nexus.get().getEmployeepartName());
											consulService.updateConsultantrCtisManage(pbxInfo);
										}
								}
						
					}else {
						consulService.updateConsultantrCtisManage(pbxInfo);
					}
					model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
					model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.request.msg"));		
				}else {
					//업데이트 일때
					
					
					model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
					model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.request.msg"));		
				}
		}catch(Exception e) {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
		
	}
	
	@ApiOperation( value = "infra 정보 조회" , notes = "성공시 infra 정보를 조회한다.")
	@PostMapping("infraList.do")
	public ModelAndView selectExistInfraList(@RequestBody Map<String, Object> searchVO,
				HttpServletRequest request) throws Exception{
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			if (!jwtVerification.isVerificationAdmin(request) && !jwtVerification.isVerificationSystem(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			
			//searchVO.put(Globals.PAGE_UNIT, UtilInfoService.NVLObj(searchVO.get(Globals.PAGE_UNIT), propertiesService.getInt(Globals.PAGE_UNIT)));
			searchVO.put(Globals.PAGE_UNIT, 1000);
			searchVO.put(Globals.PAGE_SIZE, UtilInfoService.NVLObj(searchVO.get(Globals.PAGE_SIZE), propertiesService.getInt(Globals.PAGE_SIZE)));
			
			
			PaginationInfo paginationInfo = new PaginationInfo();
			paginationInfo.setCurrentPageNo(Integer.parseInt(UtilInfoService.NVLObj(searchVO.get(Globals.PAGE_INDEX),"1")));
			paginationInfo.setRecordCountPerPage(propertiesService.getInt(Globals.PAGE_UNIT));
			paginationInfo.setPageSize(propertiesService.getInt(Globals.PAGE_UNIT));
			
			
			searchVO.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
			searchVO.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
			searchVO.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
			model.addObject(Globals.STATUS_REGINFO, searchVO);
			

			List<Map<String, Object>> adminList =  (List<Map<String, Object>>) consulService.selectExistsInfraList(searchVO); 
			
			
			model.addObject("resultList",  adminList);      	       
			int totCnt = adminList.size() > 0 ? Integer.parseInt(adminList.get(0).get(Globals.PAGE_TOTAL_RECORD_COUNT).toString()) : 0;  
			paginationInfo.setTotalRecordCount(totCnt);
			model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
			model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e) {
			LOGGER.debug("selectUserConsultantrList  error:" + e.toString());
			LOGGER.debug("selectUserConsultantrList  error:" + e.getStackTrace()[0].getLineNumber());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.msg")+ e.toString());	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		return model;
	}
	
	@GetMapping("consultantCombo.do")
	public ModelAndView selectConsultantCombo (@RequestParam Map<String, Object> commandMap,
												HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)  ) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			
			model.addObject(Globals.JSON_RETURN_RESULT, consulService.selectConstantCombo(commandMap));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@GetMapping("consultant/{consultCode}.do")
	public ModelAndView selectConsultantCombo (@PathVariable  String consultCode,
																		HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)  && !jwtVerification.isVerificationSystem(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			
			model.addObject(Globals.JSON_RETURN_RESULT,  consulService.selectConsultantrManageDetailConstantCode(consultCode));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@GetMapping("selectConsultantAdminCombo.do")
	public ModelAndView selectConsultantAdminCombo (@RequestParam Map<String, Object> commandMap,
													HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			
			model.addObject(Globals.JSON_RETURN_RESULT, consulService.selectConstantEmpCombo(commandMap));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation( value = "상담사  퇴직자 처리" , notes = "성공시 상담사  퇴직자 처리한다.")
	@GetMapping("/consultant/withdrow/{extension}.do")
	public ModelAndView counWithdrowProcess(@PathVariable String extension, HttpServletRequest request ) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			//멤버 삭제
			Optional<ConsultantInfo> info = consulService.selectConsultantrManageDetail(extension);
			
			if (!info.isPresent()) {
				model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				model.addObject(Globals.STATUS_MESSAGE,  egovMessageSource.getMessage("fail.value.notexits") );
			}else {
				
			}
			//사용자 퇴직 처리 
			
			
		}catch(Exception e) {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation( value = "Infra 및 상담사 삭제 처리" , notes = "성공시 Infra 및 상담사 삭제 처리한다.")
	@DeleteMapping("{extension}.do")
	public ModelAndView counDeleteProcess(@PathVariable String extension, HttpServletRequest request ) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			//멤버 삭제
			Optional<ConsultantInfo> info = consulService.selectConsultantrManageDetail(extension);
			
			if (!info.isPresent()) {
				model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				model.addObject(Globals.STATUS_MESSAGE, "사용자 내역이 없습니다.");
			}
			//사용자 삭제 
			//SMSReq client = new SMSReq();
			String notiSeq = "101";
			String status = "list";
			String qualifier = "count 10";
			Optional<SmsModelInfo> models = smsService.selectSmsInfoDetail(notiSeq);
			
			if (models.isPresent()) {
				
				boolean loaded = client.loadProps(models.get().getSmsModel().replace("Type", ""), models.get().getSmsFields(), status, qualifier);
				if ( (!client.isValid()) || !loaded) // any args invalid
				{
					
					model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
					model.addObject(Globals.STATUS_MESSAGE, "Usage (smsxml.properties):");
				} else {
					try {
						log.info("============ 사용자 삭제 시작1:"  + info.get().getPbxExtension());
						PbxMemberInfo pbxInfo = new PbxMemberInfo();
						pbxInfo.setExtension(info.get().getPbxExtension());
						pbxInfo.setLoginId(info.get().getPbxLoginId());
						//사용자 삭제
						log.info("============ 사용자 삭제 시작2:" + info.get().getPbxLoginId());
						model = client.execRequestMemberDelete(pbxInfo);
						log.info(model.getStatus().toString());
						if (model.getStatus() == HttpStatus.OK) {
							consulService.deleteConsultantrManage(info.get().getPbxExtension());
						}
					} catch (Exception e) {
						model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
						model.addObject(Globals.STATUS_MESSAGE, "SMSXMLTest failed with an unexpected exception:" + e.toString());
					}
				}
			}else {
				model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				model.addObject(Globals.STATUS_MESSAGE, "적용 되는 값이 없습니다.");
			}
		}catch(Exception e) {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
		
	}
}
