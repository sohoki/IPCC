package com.system.ipcc.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.system.ipcc.pbx.avaya.models.pbxType;
import com.system.ipcc.pbx.avaya.service.smsxml.SMSReq;
import com.system.ipcc.pbx.avaya.service.smsxml.StringNotation;

import egovframework.com.cmm.service.Globals;




@RestController
@RequestMapping("/api/backoffice/sys/sms")
@SuppressWarnings("unchecked")
public class SmsXmlTest {
	
	

	
	@Autowired
	private SmsModelInfoManageService smsService;
	
	@Autowired 
	private ConsultantManageService consoltService;
	

	@Autowired 
	private NexusEmployeeManageService ctiService;
	
	@GetMapping("/SmsTest")
    public ModelAndView smsT() throws Exception {
    	
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		//SMSXMLTest client = new SMSXMLTest();
    		StringNotation client = new StringNotation();
    		
    		String message = "";
    		
    		boolean loaded = client.loadProps();
    		if ( (!client.isValid()) || !loaded) // any args invalid
    		{
    			
    			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		   		model.addObject(Globals.STATUS_MESSAGE, "Usage (smsxml.properties):  sms.root=<http(s)://smshostaddr> cm.login=<cmlogin@cmhostaddr[:port]> cm.password=<cmpassword>");
    		} else {
    			try {
        			client.execRequest();
        			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
        		} catch (Exception e) {
        			System.out.println("SMSXMLTest failed with an unexpected exception:");
        			
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

	/*
	 * @PostMapping("/SmsTrank/realTrank.do") public ModelAndView SmsTrank(
	 * HttpServletRequest request ) throws Exception {
	 * 
	 * ModelAndView model = new ModelAndView(Globals.JSON_VIEW); try { //SMSXMLTest
	 * client = new SMSXMLTest(); SMSReq client = new SMSReq();
	 * 
	 * String message = "";
	 * 
	 * 
	 * 
	 * Optional<SmsModelInfo> models = smsService.selectSmsInfoDetail("49);
	 * 
	 * if (models.isPresent()) {
	 * 
	 * 
	 * 
	 * boolean loaded = client.loadProps(models.get().getSmsModel().replace("Type",
	 * ""), models.get().getSmsFields(), searchMap.get("status").toString(),
	 * searchMap.get("qualifier").toString()); if ( (!client.isValid()) || !loaded)
	 * // any args invalid {
	 * 
	 * model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	 * model.addObject(Globals.STATUS_MESSAGE,
	 * "Usage (smsxml.properties):  sms.root=<http(s)://smshostaddr> cm.login=<cmlogin@cmhostaddr[:port]> cm.password=<cmpassword>"
	 * ); } else { try {
	 * 
	 * model = client.execRequest(models.get().getSmsModel().replace("Type", ""),
	 * models.get().getSmsFields(), searchMap.get("objectName").toString(),
	 * searchMap.get("status").toString(), searchMap.get("qualifier").toString()); }
	 * catch (Exception e) {
	 * System.out.println("SMSXMLTest failed with an unexpected exception:");
	 * 
	 * model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	 * model.addObject(Globals.STATUS_MESSAGE,
	 * "SMSXMLTest failed with an unexpected exception:");
	 * 
	 * } } }else { model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	 * model.addObject(Globals.STATUS_MESSAGE, "적용 되는 값이 없습니다."); }
	 * 
	 * }catch(Exception e) { model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	 * model.addObject(Globals.STATUS_MESSAGE, e.toString()); } return model;
	 * 
	 * 
	 * }
	 */ 
	@PostMapping("/SmsTrank/notiSeq")
    public ModelAndView SmsTrank(@RequestBody Map<String, Object> searchMap 
			 					 , HttpServletRequest request ) throws Exception {
    	
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		//SMSXMLTest client = new SMSXMLTest();
    		SMSReq client = new SMSReq();
    		
    		String message = "";
    		
    		
    		
    		Optional<SmsModelInfo> models = smsService.selectSmsInfoDetail(searchMap.get("notiSeq").toString());
    		
    		if (models.isPresent()) {
    			
    			
    			
    			boolean loaded = client.loadProps(models.get().getSmsModel().replace("Type", ""), models.get().getSmsFields(), searchMap.get("status").toString(), searchMap.get("qualifier").toString());
        		if ( (!client.isValid()) || !loaded) // any args invalid
        		{
        			
        			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    		   		model.addObject(Globals.STATUS_MESSAGE, "Usage (smsxml.properties):  sms.root=<http(s)://smshostaddr> cm.login=<cmlogin@cmhostaddr[:port]> cm.password=<cmpassword>");
        		} else {
        			try {
        				
        				model = client.execRequest(models.get().getSmsModel().replace("Type", ""), models.get().getSmsFields(), searchMap.get("objectName").toString(), searchMap.get("status").toString(), searchMap.get("qualifier").toString());
        				
        				
        				
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
	@PostMapping("/consultant/memberInsert.do")
	public ModelAndView UserInsertPbx( @RequestBody  ConsultantInfoRequestDto pbxInfo,
									  HttpServletRequest request ) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
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
        				
        				PbxMemberInfo pbxinfoR = PbxMemberInfo.builder().extension(pbxInfo.getPbxExtension())
        										  .type(pbxInfo.getPbxType())
        										  .cor(pbxInfo.getPbxCor())
        										  .cos(pbxInfo.getPbxCos())
        										  .name(pbxInfo.getPbxName())
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
        				
        				System.out.println(model);
        				
        				//if (model.getStatus().equals("SUCCESS")) {
        					consoltService.insertConsultantrManage(pbxInfo) ;
        					consoltService.updateConsultantrPbxAgentManage(pbxInfo);
        					
        					//cti 저장 
        					
        					NexusAgentRequestInfoDto cti = NexusAgentRequestInfoDto.builder().mode("Ins")
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
	@DeleteMapping("/consultant/{extension}.do")
	public ModelAndView counDeleteProcess(@PathVariable String extension, HttpServletRequest request ) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			//멤버 삭제
			Optional<ConsultantInfo> info = consoltService.selectConsultantrManageDetail(extension);
			
			if (!info.isPresent()) {
				model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		   		model.addObject(Globals.STATUS_MESSAGE, "사용자 내역이 없습니다.");
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
        				System.out.println("============ 사용자 삭제 시작1:"  + info.get().getPbxExtension());
        				PbxMemberInfo pbxInfo = new PbxMemberInfo();
        				pbxInfo.setExtension(info.get().getPbxExtension());
        				pbxInfo.setLoginId(info.get().getPbxLoginId());
        				//사용자 삭제
        				System.out.println("============ 사용자 삭제 시작2:" + info.get().getPbxLoginId());
        				model = client.execRequestMemberDelete(pbxInfo);
        				
        				System.out.println(model.getStatus());
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
    	   		model.addObject(Globals.STATUS_MESSAGE, "적용 되는 값이 없습니다.");
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
    		String qualifier = "count 1000";
    		Optional<SmsModelInfo> models = smsService.selectSmsInfoDetail(notiSeq);
    		
    		if (models.isPresent()) {
    			
    			
    			
    			//나중에 학인 하기 
    			System.out.println("===========  loadProps 값 하기");
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
