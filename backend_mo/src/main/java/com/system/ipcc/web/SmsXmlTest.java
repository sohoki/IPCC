package com.system.ipcc.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.sys.pbx.avaya.models.SmsModelInfo;
import com.system.backoffice.sys.pbx.avaya.service.SmsModelInfoManageService;
import com.system.backoffice.uat.uia.models.ConsultantAgentInfo;
import com.system.backoffice.uat.uia.models.ConsultantInfo;
import com.system.backoffice.uat.uia.models.dto.ConsultantInfoRequestDto;
import com.system.backoffice.uat.uia.service.ConsultantManageService;
import com.system.ipcc.cti.nexus.models.dto.NexusAgentRequestInfoDto;
import com.system.ipcc.cti.nexus.service.NexusEmployeeManageService;
import com.system.ipcc.pbx.avaya.models.PbxMemberInfo;
import com.system.ipcc.pbx.avaya.models.PbxPropertieinfo;
import com.system.ipcc.pbx.avaya.models.pbxType;
import com.system.ipcc.pbx.avaya.service.smsxml.SMSReq;
import com.system.ipcc.pbx.avaya.service.smsxml.StringNotation;

import egovframework.com.cmm.service.Globals;
import lombok.extern.slf4j.Slf4j;



@Slf4j
@RestController
@RequestMapping("/api/backoffice/sys/sms")
@SuppressWarnings("unchecked")
public class SmsXmlTest {
	
	// Property File Values		
	private  String sms_root;

	@Autowired
	private SmsModelInfoManageService smsService;
	


	@Autowired
	private  SMSReq client;
	


	@PostMapping("/SmsTrank/notiSeq.do")
	public ModelAndView SmsTrank(@RequestBody Map<String, Object> searchMap 
			 					 , HttpServletRequest request ) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			Optional<SmsModelInfo> models = smsService.selectSmsInfoDetail(searchMap.get("notiSeq").toString());
			
			if (models.isPresent()) {
				
				boolean loaded = client.loadProps(models.get().getSmsModel().replace("Type", ""), 
																models.get().getSmsFields(), 
																searchMap.get("status").toString(), 
																searchMap.get("qualifier").toString());
				log.info("loaded:" + loaded + client.root + ":" + client.login + ":" + client.pw);
				if ( (!client.isValid()) || !loaded){ // any args invalid
					model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
					log.info("Usage (smsxml.properties):  sms.root=<http(s)://smshostaddr> cm.login=<cmlogin@cmhostaddr[:port]> cm.password=<cmpassword>");
					model.addObject(Globals.STATUS_MESSAGE, "Usage (smsxml.properties):  sms.root=<http(s)://smshostaddr> cm.login=<cmlogin@cmhostaddr[:port]> cm.password=<cmpassword>");
				} else {
					try {
						
						model = client.execRequest(models.get().getSmsModel().replace("Type", ""), 
																models.get().getSmsFields(), 
																searchMap.get("objectName").toString(), 
																searchMap.get("status").toString(), 
																searchMap.get("qualifier").toString());
						
					} catch (Exception e) {
							log.error("SMSXMLTest failed with an unexpected exception:");
							model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
							model.addObject(Globals.STATUS_MESSAGE, "SMSXMLTest failed with an unexpected exception:");
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
	/*
	@PostMapping("/consultant/memberInsert.do")
	public ModelAndView UserInsertPbx( @RequestBody  ConsultantInfoRequestDto pbxInfo,
									  HttpServletRequest request ) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			//SMSReq client = new SMSReq();
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
						
						PbxMemberInfo pbxinfoR = PbxMemberInfo.builder().extension(pbxInfo.getPbxExtension())
																		.type(pbxInfo.getPbxType())
																		.cor(pbxInfo.getPbxCor())
																		.cos(pbxInfo.getPbxCos())
																		.name(pbxInfo.getPbxName())
																		.SecurityCode(pbxInfo.getPbxSecurityCode())
																		.loginId(pbxInfo.getPbxLoginId())
																		.build();
						
						
						
						
						model = client.execRequestMemberInsert(pbxinfoR);
						
						
						//if (model.getStatus().equals("SUCCESS")) {
							consoltService.insertConsultantrManage(pbxInfo) ;
							consoltService.updateConsultantrPbxAgentManage(pbxInfo);
							
							//cti 저장 
							
							NexusAgentRequestInfoDto cti = NexusAgentRequestInfoDto.builder().mode("Ins")
															.centerId(pbxInfo.getCtiCenterId())
															.tenantId(pbxInfo.getCtiTenantId())
															.employeegrpId(pbxInfo.getCtiEmployeegrpid())
															.employeepartId(pbxInfo.getCtiEmployeepartid())
															.employeeId(pbxInfo.getPbxLoginId())
															.loginId(pbxInfo.getCtiLoginid() )
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
								consoltService.updateConsultantrCtisManage(pbxInfo);
							}
							
						//}
						
						
						model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
						model.addObject(Globals.STATUS_MESSAGE, "정상적으로 처리 되었습니다.");
						
						
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
	*/
	
	@GetMapping("/SmsTrank/trankStatus.do")
	public ModelAndView SmsTrank( HttpServletRequest request ) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			//SMSXMLTest client = new SMSXMLTest();
			//SMSReq client = new SMSReq();
			
			String message = "";
			String notiSeq = "115";
			String status = "list";
			String qualifier = "count 1000";
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
						System.out.println("===========  loadProps trank 조회 ");
						model = client.execRequestTrank(models.get().getSmsModel().replace("Type", ""), models.get().getSmsFields(), "", status, qualifier);
						
						} catch (Exception e) {
							System.out.println("SMSXMLTest failed with an unexpected exception:");
							
							model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
							model.addObject(Globals.STATUS_MESSAGE, "SMSXMLTest failed with an unexpected exception:");
							
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
