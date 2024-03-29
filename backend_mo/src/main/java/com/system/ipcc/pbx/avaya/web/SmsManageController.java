package com.system.ipcc.pbx.avaya.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
import com.system.backoffice.sys.pbx.avaya.service.SmsModelInfoManageService;
import com.system.backoffice.uat.uia.models.ConsultantAgentInfo;
import com.system.backoffice.uat.uia.models.ConsultantInfo;
import com.system.backoffice.uat.uia.models.dto.ConsultantInfoRequestDto;
import com.system.backoffice.uat.uia.service.ConsultantManageService;
import com.system.backoffice.util.service.UtilInfoService;
import com.system.ipcc.cti.nexus.models.NexusAgentInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusAgentInfoResponseDto;
import com.system.ipcc.cti.nexus.models.dto.NexusAgentRequestInfoDto;
import com.system.ipcc.cti.nexus.service.NexusEmployeeManageService;
import com.system.ipcc.pbx.avaya.models.PbxMemberInfo;
import com.system.ipcc.pbx.avaya.models.pbxType;
import com.system.ipcc.pbx.avaya.service.smsxml.SMSReq;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;

@RestController
@RequestMapping("/api/backoffice/ipcc/avaya/pbx/sms")
@SuppressWarnings("unchecked")
public class SmsManageController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SmsManageController.class);
	
	@Autowired
	private SmsModelInfoManageService smsService;
	
	@Autowired 
	private ConsultantManageService consoltService;
	
	@Autowired 
	private NexusEmployeeManageService ctiService;
	
    /** EgovMessageSource */
	@Resource(name = "egovMessageSource")
	EgovMessageSource egovMessageSource;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	@GetMapping("extension.do")
	public ModelAndView smsExtensionCheck(@RequestParam Map<String, Object> searchVO,
			   							  HttpServletRequest request) throws Exception {
    	
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		//SMSXMLTest client = new SMSXMLTest();
        	if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
        	
        	
        	
			SMSReq client = new SMSReq();
			String notiSeq = "101";
    		String status = "list";
    		String qualifier = "count 1";
    		
        	Optional<SmsModelInfo> models = smsService.selectSmsInfoDetail(notiSeq);
    		
    		boolean loaded = client.loadProps(models.get().getSmsModel().replace("Type", ""), models.get().getSmsFields(), status, qualifier);
    		if ( (!client.isValid()) || !loaded) // any args invalid
    		{
    			
    			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		   		model.addObject(Globals.STATUS_MESSAGE, "Usage (smsxml.properties):  sms.root=<http(s)://smshostaddr> cm.login=<cmlogin@cmhostaddr[:port]> cm.password=<cmpassword>");
    		} else {
    			try {
    				
    				
    				PbxMemberInfo pbxinfoR = PbxMemberInfo.builder().extension(UtilInfoService.NVL(searchVO.get("Extension"),""))
							  .loginId(UtilInfoService.NVL(searchVO.get("pbxLoginId"),"") )
							  .build();
    				
    				//pbx 체크 
        			int ret = client.execRequestMemberCheck(pbxinfoR, UtilInfoService.NVL(searchVO.get("gubun"),"Extension"));
        			String sStatus = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
        			String sMessage = (ret > 0) ? "common.idcheck.success" : "common.idcheck.fail";
        			model.addObject(Globals.STATUS,sStatus);
        			model.addObject(Globals.STATUS_MESSAGE,egovMessageSource.getMessage(sMessage)  );
        		} catch (Exception e) {
        			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    		   		model.addObject(Globals.STATUS_MESSAGE, "SMSXMLTest failed with an unexpected exception:");
    		   		
        		}
    		}
    		
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
	@PostMapping("/consultant/memberInsert.do")
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
			
			SMSReq client = new SMSReq();
			String notiSeq = "101";
    		String status = "list";
    		String qualifier = "count 1";
    		Optional<SmsModelInfo> models = smsService.selectSmsInfoDetail(notiSeq);
    		
    		if (models.isPresent()) {
    			
    			
    			boolean loaded = client.loadProps(models.get().getSmsModel().replace("Type", ""), models.get().getSmsFields(), status, qualifier);
        		if ( (!client.isValid()) || !loaded) // any args invalid
        		{
        			
        			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    		   		model.addObject(Globals.STATUS_MESSAGE, "Usage (smsxml.properties):  sms.root=<http(s)://smshostaddr> cm.login=<cmlogin@cmhostaddr[:port]> cm.password=<cmpassword>");
        		} else {
        			try {
        				if (!pbxInfo.getMode().equals("PBXEXIST")) {
        					PbxMemberInfo pbxinfoR = PbxMemberInfo.builder().extension(pbxInfo.getPbxExtension())
									  .type(pbxInfo.getPbxType())
									  .cor(pbxInfo.getPbxCor())
									  .cos(pbxInfo.getPbxCos())
									  .name(pbxInfo.getPbxName())
									  .pbxDisplayLangage(pbxInfo.getPbxDisplayLangage())
									  .pbxButton01(pbxInfo.getPbxButton01())
									  .pbxButton02(pbxInfo.getPbxButton02())
									  .pbxButton03(pbxInfo.getPbxButton03())
									  .pbxButton04(pbxInfo.getPbxButton04())
									  .pbxButton05(pbxInfo.getPbxButton05())
									  .pbxButton06(pbxInfo.getPbxButton06())
									  .pbxButton07(pbxInfo.getPbxButton07())
									  .SecurityCode(pbxInfo.getPbxSecurityCode())
									  .loginId(pbxInfo.getPbxLoginId())
									  .build();
			
							List<pbxType> sn = new ArrayList<pbxType>();
							List<pbxType> sr = new ArrayList<pbxType>();
							
							
							for(ConsultantAgentInfo agent : pbxInfo.getAgentInfo()) {
								pbxType pbxsn = new pbxType();
								pbxsn.setValue(agent.getPbxSnType());
								pbxsn.setIndex(Integer.parseInt( agent.getPbxSnIndex()));
								sn.add(pbxsn);
								
								pbxType pbxsr = new pbxType();
								pbxsr.setValue(agent.getPbxSrType());
								pbxsr.setIndex(Integer.parseInt( agent.getPbxSrIndex()));
								sr.add(pbxsr);
							}
							pbxinfoR.setSn(sn);
							pbxinfoR.setSr(sr);
							model = client.execRequestMemberInsert(pbxinfoR);
        				}else {
        					model.setStatus(HttpStatus.OK);
        				}
        				
        				
        				if (model.getStatus().equals(HttpStatus.OK) ) {
        					consoltService.insertConsultantrManage(pbxInfo) ;
        					consoltService.updateConsultantrPbxAgentManage(pbxInfo);
        					//cti 저장 
        					
        					NexusAgentRequestInfoDto cti = NexusAgentRequestInfoDto.builder().mode("Ins")
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
        							consoltService.updateConsultantrCtisManage(pbxInfo);
        						}
        					}
        					model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
            		   		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.request.msg"));
        				}else {
        					model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
            		   		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg"));
        				}
        				
        				
        				
        				
            		} catch (Exception e) {
            			
            			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
        		   		model.addObject(Globals.STATUS_MESSAGE, "SMSXMLTest failed with an unexpected exception:" + e.toString());
        		   		
            		}
        		}
    		}else {
    			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    	   		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.value.notexits"));
    		}
		}catch(Exception e) {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
		
	}
	/// 상담사 수정 
	@PostMapping("/consultant/consultantUpdate.do")
	public ModelAndView UserUpdateConsultant(@RequestBody  ConsultantInfoRequestDto pbxInfo,
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
			
			
			if (pbxInfo.getMode().equals("CTI")) {
				//수정 구문 정리 하기 
				NexusAgentRequestInfoDto cti = NexusAgentRequestInfoDto.builder().mode("Edt")
					                        .centerId(pbxInfo.getCtiCenterId())
					                        .tenantId(pbxInfo.getCtiTenantId())
					                        .employeegrpId(pbxInfo.getCtiEmployeegrpid())
					                        .employeepartId(pbxInfo.getCtiEmployeepartid())
					                        .employeeId(pbxInfo.getCtiEmployeeid())
					                        .loginId(pbxInfo.getPbxLoginId() )
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
				//센터 값 넣기 
				
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
						consoltService.updateConsultantrCtisManage(pbxInfo);
					}
					model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			   		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.request.msg"));
				}else {
					throw new Exception( egovMessageSource.getMessage("fail.value.notexits"));
					
				}

				
			}else if (pbxInfo.getMode().equals("PBX")) {
				//내선번호 변경 
				
				PbxMemberInfo pbxinfoR = PbxMemberInfo.builder().extension(pbxInfo.getPbxExtension())
					  .type(pbxInfo.getPbxType())
					  .cor(pbxInfo.getPbxCor())
					  .cos(pbxInfo.getPbxCos())
					  .name(pbxInfo.getPbxName())
					  .pbxDisplayLangage(pbxInfo.getPbxDisplayLangage())
					  .pbxButton01(pbxInfo.getPbxButton01())
					  .pbxButton02(pbxInfo.getPbxButton02())
					  .pbxButton03(pbxInfo.getPbxButton03())
					  .pbxButton04(pbxInfo.getPbxButton04())
					  .pbxButton05(pbxInfo.getPbxButton05())
					  .pbxButton06(pbxInfo.getPbxButton06())
					  .pbxButton07(pbxInfo.getPbxButton07())
					  .mode("PBX")
					  .SecurityCode(pbxInfo.getPbxSecurityCode())
					  .build();
    			SMSReq client = new SMSReq();
				String addType = "Extension="+pbxinfoR.getExtension()+"|Type="+pbxinfoR.getType() +"|COR="+pbxinfoR.getCor()+"|COS="+pbxinfoR.getCos()+"|Name="+pbxinfoR.getName()+"|SecurityCode="+pbxinfoR.getSecurityCode()+"";
				
				boolean loaded = client.loadProps("Station",addType, "change", pbxInfo.getPbxExtension());
    			if ( (!client.isValid()) || !loaded) // any args invalid
        		{
        			
        			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    		   		model.addObject(Globals.STATUS_MESSAGE, "Usage (smsxml.properties):");
        		} else {
	  				model = client.execRequestMemberUpdate(pbxinfoR);
	  				LOGGER.debug("model.getStatus()");
	  				if (model.getStatus() == HttpStatus.OK) {
    					consoltService.updateConsultantrPbxStatusManage(pbxInfo);
    					
	  				}
	  			}
			}else {
				PbxMemberInfo pbxinfoR = PbxMemberInfo.builder()
						  .loginId(pbxInfo.getPbxLoginId())
						  .mode("AGENT")
						  .build();
				List<pbxType> sn = new ArrayList<pbxType>();
				List<pbxType> sr = new ArrayList<pbxType>();
				
				
				for(ConsultantAgentInfo agent : pbxInfo.getAgentInfo()) {
					pbxType pbxsn = new pbxType();
					pbxsn.setValue(agent.getPbxSnType());
					pbxsn.setIndex(Integer.parseInt( agent.getPbxSnIndex()));
					sn.add(pbxsn);
					
					pbxType pbxsr = new pbxType();
					pbxsr.setValue(agent.getPbxSrType());
					pbxsr.setIndex(Integer.parseInt( agent.getPbxSrIndex()));
					sr.add(pbxsr);
				}
				pbxinfoR.setSn(sn);
				pbxinfoR.setSr(sr);
				
				SMSReq client = new SMSReq();
				
				boolean loaded = client.loadProps("Agent","Login_ID|Name|Extension", "display", pbxinfoR.getLoginId());
    			if ( (!client.isValid()) || !loaded) // any args invalid
        		{
        			
        			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    		   		model.addObject(Globals.STATUS_MESSAGE, "Usage (smsxml.properties):");
        		} else {
	  				model = client.execRequestMemberUpdate(pbxinfoR);
	  				if (model.getStatus() == HttpStatus.OK) {
    					consoltService.updateConsultantrPbxAgentManage(pbxInfo);
	  				}
	  			}
			}
		}catch(Exception e) {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@DeleteMapping("{extension}.do")
	public ModelAndView deleteConsultantDeleteInfo(@PathVariable String extension,
												HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		
				if (!jwtVerification.isVerificationAdmin(request)) {
					ResultVO resultVO = new ResultVO();
					return jwtVerification.handleAuthError(resultVO); // 토큰 확인
				}
				
				Optional<ConsultantInfo> info = consoltService.selectConsultantrManageDetail(extension);
				
				if (!info.isPresent()) {
					model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			   		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.user.notexits"));
			   	}
				//사용자 삭제 
				SMSReq client = new SMSReq();
				String notiSeq = "101";
	    		String status = "list";
	    		String qualifier = "count 1";
	    		Optional<SmsModelInfo> models = smsService.selectSmsInfoDetail(notiSeq);
	    		if (models.isPresent()) {
	    			boolean loaded = client.loadProps(models.get().getSmsModel().replace("Type", ""), models.get().getSmsFields(), status, qualifier);
	    			if ( (!client.isValid()) || !loaded) // any args invalid
	        		{
	        			
	        			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	    		   		model.addObject(Globals.STATUS_MESSAGE, "Usage (smsxml.properties):");
	        		} else {
	        			try {
	        				
	        				PbxMemberInfo pbxInfo = new PbxMemberInfo();
	        				pbxInfo.setExtension(info.get().getPbxExtension());
	        				pbxInfo.setLoginId(info.get().getPbxLoginId());
	        				//사용자 삭제
	        				model = client.execRequestMemberDelete(pbxInfo);
	        				if (model.getStatus() == HttpStatus.OK) {
	        					
	        					//cti 삭제 
	        					NexusAgentInfo delInfo = NexusAgentInfo.builder().centerId(info.get().getCtiCenterId())
	        																	 .tenantId(info.get().getCtiTenantId())
	        																	 .employeegrpId(info.get().getCtiEmployeegrpid())
	        																	 .employeepartId(info.get().getCtiEmployeepartid())
	        																	 .employeeId(info.get().getCtiEmployeeid())
	        																	 .build();
	        							
	        					int ret = ctiService.deleteNexusEmployeesInfo(delInfo);
	        					System.out.println("cti ret:" + ret);
	        					if (ret> 0) {
	        						consoltService.deleteConsultantrManage(info.get().getPbxExtension());
	        						model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
	        						model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.common.delete"));
	        					}else {
	        						model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	                		   		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("cti.delete.fail") );
	        					}
	        				
	        				}else {
	        					model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	            		   		model.addObject(Globals.STATUS_MESSAGE,  egovMessageSource.getMessage("pbx.delete.fail"));
	        				}
	            		} catch (Exception e) {
	            			
	            			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	        		   		model.addObject(Globals.STATUS_MESSAGE, "SMSXMLTest failed with an unexpected exception:" + e.toString());
	        		   		
	            		}
	        		}
	    		}else {
	    			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	    	   		model.addObject(Globals.STATUS_MESSAGE,egovMessageSource.getMessage("fail.value.notexits"));
	    		}
	    		
		}catch (Exception e1) {
			LOGGER.error("groupInfoDetail : error" + e1.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg"));	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
    		
		return model;
	}
	@DeleteMapping("/consultant/{extension}.do")
	public ModelAndView counDeleteProcess(@PathVariable String extension, HttpServletRequest request ) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			//멤버 삭제
			Optional<ConsultantInfo> info = consoltService.selectConsultantrManageDetail(extension);
			
			if (!info.isPresent()) {
				model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		   		model.addObject(Globals.STATUS_MESSAGE,  egovMessageSource.getMessage("fail.value.notexits") );
		   	}
			//사용자 삭제 
			SMSReq client = new SMSReq();
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
        				PbxMemberInfo pbxInfo = new PbxMemberInfo();
        				pbxInfo.setExtension(info.get().getPbxExtension());
        				pbxInfo.setLoginId(info.get().getPbxLoginId());
        				//사용자 삭제
        				model = client.execRequestMemberDelete(pbxInfo);
        				if (model.getStatus() == HttpStatus.OK) {
        					consoltService.deleteConsultantrManage(info.get().getPbxExtension());
        				}
            		} catch (Exception e) {
            			
            			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
        		   		model.addObject(Globals.STATUS_MESSAGE, "SMSXMLTest failed with an unexpected exception:" + e.toString());
        		   		
            		}
        		}
    		}else {
    			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    	   		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.value.notexits"));
    		}
    		
			
		}catch(Exception e) {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
		
	}
	@GetMapping("/SmsTrank/trankStatus.do")
    public ModelAndView SmsTrank( HttpServletRequest request ) throws Exception {
    	
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		//SMSXMLTest client = new SMSXMLTest();
    		SMSReq client = new SMSReq();
    		
    		String message = "";
    		
    		String notiSeq = "115";
    		String status = "list";
    		String qualifier = "count 10000";
    		Optional<SmsModelInfo> models = smsService.selectSmsInfoDetail(notiSeq);
    		
    		if (models.isPresent()) {
    			//나중에 학인 하기 
    			boolean loaded = client.loadProps(models.get().getSmsModel().replace("Type", ""), models.get().getSmsFields(), status, qualifier);
        		if ( (!client.isValid()) || !loaded) // any args invalid
        		{
        			
        			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    		   		model.addObject(Globals.STATUS_MESSAGE, "Usage (smsxml.properties):  sms.root=<http(s)://smshostaddr> cm.login=<cmlogin@cmhostaddr[:port]> cm.password=<cmpassword>");
        		} else {
        			try {
        				model = client.execRequestTrank(models.get().getSmsModel().replace("Type", ""), models.get().getSmsFields(), "", status, qualifier);
        				
            		} catch (Exception e) {
            			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
        		   		model.addObject(Globals.STATUS_MESSAGE, "SMSXMLTest failed with an unexpected exception:");
        		   		
            		}
        		}
    		}else {
    			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    	   		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.value.notexits"));
    		}
    		
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }  
}
