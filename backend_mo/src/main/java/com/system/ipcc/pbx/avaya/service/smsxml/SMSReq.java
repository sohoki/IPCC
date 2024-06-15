package com.system.ipcc.pbx.avaya.service.smsxml;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.stream.Collectors;
import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.ws.Binding;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.handler.Handler;

import org.apache.ibatis.javassist.bytecode.annotation.IntegerMemberValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import com.system.ipcc.pbx.avaya.smsxml.Result;
import com.system.ipcc.pbx.avaya.smsxml.ArrayType;
import com.system.ipcc.pbx.avaya.smsxml.ObjectFactory;
import com.system.ipcc.pbx.avaya.smsxml.ModelChoices;
import com.system.ipcc.pbx.avaya.smsxml.ReturnType;
import com.system.ipcc.pbx.avaya.smsxml.StationType;
import com.system.ipcc.pbx.avaya.smsxml.SubmitRequestType;
import com.system.ipcc.pbx.avaya.smsxml.SystemManagementPort;
import com.system.ipcc.pbx.avaya.smsxml.SystemManagementService;
import com.system.ipcc.pbx.avaya.smsxml.TrunkGroupType;
import com.system.ipcc.pbx.avaya.smsxml.TrunkStatusType;
import com.system.ipcc.pbx.avaya.smsxml.AgentType;
import com.sun.xml.ws.developer.WSBindingProvider;
import com.system.backoffice.sys.pbx.avaya.models.AgentInfo;
import com.system.backoffice.sys.pbx.avaya.models.AgentScenInfo;
import com.system.backoffice.sys.pbx.avaya.models.StationButtonInfo;
import com.system.backoffice.sys.pbx.avaya.models.StationInfo;
import com.system.backoffice.sys.pbx.avaya.models.dto.AgentInfoReqDto;
import com.system.backoffice.sys.pbx.avaya.models.dto.PbxDelReqDto;
import com.system.backoffice.sys.pbx.avaya.models.dto.StationInfoReqDto;
import com.system.ipcc.pbx.avaya.models.PbxMemberInfo;
import com.system.ipcc.pbx.avaya.models.PbxPropertieinfo;
import com.system.ipcc.pbx.avaya.models.TrankGroupInfo;
import com.system.ipcc.pbx.avaya.models.pbxType;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuppressWarnings("unchecked")
@Service
public class SMSReq {

	
	private final PbxPropertieinfo pbxinfo;
	
	@Autowired
	public SMSReq(PbxPropertieinfo pbxinfo) {
		this.pbxinfo = pbxinfo;
	}
	
		
	/** EgovMessageSource */
	@Resource(name = "egovMessageSource")
	EgovMessageSource egovMessageSource;
		

	private ObjectFactory objectFactory;
		
	// Class Loader
	ClassLoader cl = null;
		
	// SOAP Objects
	private SystemManagementService sms;
	private SystemManagementPort port;
	private WSBindingProvider bp;
	
	
	// across requests
	private String requestSID = "";
	private String responseSID = "";
	private SessionIDLogicalHandler SIDHandler = null;

	// Reflection and Context Objects
	JAXBContext modelContext; 
	Class<?> modelClass;
	Class<?> modelChoicesClass;
	
	// Connection parameters
	
	public String root = "";
	public String login = "";
	public String pw = "";	
	
	public final  Integer responseTimeout = 50000;

	// Request parameters
	
	public String model;
	public String operation;
	public String qualifier;
	public String fields;
	public String format;
	
	//private String objectname; // currently not used
	
	private SubmitRequestType submitRequest;
	
	// Output control
	private boolean faultRaised = false;
	
  
	
	// Input Delimiter
		private String delimiter = "\\|";
	
	// **************************************************************************
	// isValid()
	// **************************************************************************
	/**
	 * Validates the SMS object's parameters.
	 * SMS objet 유효성 검사
	 */
	public boolean isValid() {

		boolean ok = true;
		
		if (!(root.startsWith("http://") || root.startsWith("https://"))) {
			log.error("Parameter invalid sms.root " + root + " [must begin with http:// or https://]");
			ok = false;
		}
		if ((login.length() <= 0) || (login.indexOf("@") <= 0)) {
			log.error("Parameter invalid cm.login " + login + "[must be of the form 'loginid@cmaddress[:port]']");
			ok = false;
		}
		if (pw.length() <= 0) {
			log.error("Parameter invalid cm.password <cmpassword>");
			ok = false;
		}
		
		return ok;
	}

	// **************************************************************************
	// execRequest
	// **************************************************************************
	/**
	 * Illustrates the usage of SMS, by performing the following steps: 
	 * 	1. Initial setup of SOAP binding, session management 
	 *  2. Submitting a request to SMS and obtaining the result 
	 *  3. Doing session "bookkeeping" after the request 
	 *  4. Releasing SMS session resources, when finished.
	 *  
	 */
	public ModelAndView execRequest(String model, 
													String sFIELDS, 
													String sObjectName, 
													String sOperation, 
													String sQUALIFIER) {
		ModelAndView models = new ModelAndView(Globals.JSON_VIEW);
		
		log.info("model:" + model + " sFIELDS:" + sFIELDS + " sObjectName:" + sObjectName + " sOperation:" + sOperation + " sQUALIFIER:" + sQUALIFIER);
		
		if (!setup()) {
			models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			return models; 
		}
		
		Result submitResult = this.submitRequest(model, sFIELDS, sObjectName, sOperation, sQUALIFIER);
		if (submitResult!= null && submitResult.getResultCode() == 0 ) {
			models.addObject(Globals.JSON_RETURN_RESULT, submitResult);
			models.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}else {
			models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			models.addObject(Globals.STATUS_MESSAGE, submitResult.getResultCode());
		}
		this.manageSession();
		this.releaseSession();
		return models;
	}
	
		
	public ModelAndView execRequestTrank(String model, String sFIELDS, String sObjectName, String sOperation, String sQUALIFIER) {
		// Step 1: Initial SOAP setup, done once (typically) per session.
		ModelAndView models = new ModelAndView(Globals.JSON_VIEW);
		if (!setup()) {
			models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			return models; 
		}
			// we failed and we're done
		Result submitResult = this.submitRequest(model, sFIELDS, sObjectName, sOperation, sQUALIFIER);

		
		List<TrunkGroupType> list = submitResult.getResultData().getTrunkGroup();
		
		List<TrankGroupInfo> trGruops = list.stream().filter( t -> Integer.parseInt(t.getTotalAdministeredMembers()) > 0)
										.map(entry -> new TrankGroupInfo (
											entry.getGroupNumber(),
											entry.getTotalAdministeredMembers(),
											entry.getGroupType(),
											entry.getGroupName(),
											entry.getTN(),
											entry.getCOR(),
											entry.getCOR(),
											null
											)
										).collect(Collectors.toList());
		for (TrankGroupInfo trank : trGruops) {
			Result trankStats = this.submitRequest("TrunkStatus", "member|port|connectedPorts|mtceBusy|serviceState", "", "status", trank.getGroupNumber());
			List<TrunkStatusType> lists =  trankStats.getResultData().getTrunkStatus();
			List<com.system.ipcc.pbx.avaya.models.TrankStatus> listStatus =  lists.stream().map(entry -> new com.system.ipcc.pbx.avaya.models.TrankStatus(
																entry.getMember(),
																entry.getPort(),
																entry.getServiceState(),
																entry.getMtceBusy(),
																entry.getConnectedPorts()
																)
											).collect(Collectors.toList());
			trank.setStatus(listStatus);
		}
		
		this.manageSession();

		this.releaseSession();
		
		if (submitResult != null) {
			models.addObject("TrankResult", trGruops);
			models.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}
		return models;
	}
	//내선번호 또는 에이전트 삭제  -- 추후 필요 없음 
	public ModelAndView execRequestMemberDelete(PbxMemberInfo info) {
			// Step 1: Initial SOAP setup, done once (typically) per session.
			ModelAndView models = new ModelAndView(Globals.JSON_VIEW);
			if (!setup()) {
				models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				return models; 
			}
			String resutMessage = "";
			Result submitResult = this.submitRequest("Station", "extension", "", "remove", info.getExtension());
			
			if (submitResult.getResultCode() != 0) {
				resutMessage = submitResult.getMessageText().contains("Identifier not assigned") ? "적용 번호가 없습니다." : submitResult.getMessageText();
				
				models.addObject(Globals.STATUS_MESSAGE, "내선번호가 삭제시 문제가 발생 하였습니다." + resutMessage);
				models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				return models; 
			}
			
			// Agent 값 체크 하기 
			submitResult = this.submitRequest("Agent", "Login_ID", "", "remove", info.getLoginId());
			if (submitResult.getResultCode() != 0) {
				resutMessage = submitResult.getMessageText().contains("Identifier not assigned") ? "적용 번호가 없습니다." : submitResult.getMessageText();
				models.addObject(Globals.STATUS_MESSAGE, "Agent가 삭제시 문제가 있습니다." + resutMessage);
				models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				return models; 
			}
			
			
			this.manageSession();

			this.releaseSession();
			
			if (submitResult != null) {
				models.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				models.setStatus(HttpStatus.OK);
			}
			
			return models;
	}
	public ModelAndView execRequestCmDelete(PbxDelReqDto info) {
		// Step 1: Initial SOAP setup, done once (typically) per session.
		ModelAndView models = new ModelAndView(Globals.JSON_VIEW);
		boolean loaded = this.loadProps("Station", "extension", "display", "count 1");
		
		if (!setup()) {
			models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			return models; 
		}
		Result submitResult;
		String resutMessage = "";
		if (info.getMode().equals("Station")) 
			
			submitResult = this.submitRequest("Station", "extension", "", "remove", info.getNumberInfo());
		else 
			submitResult = this.submitRequest("Agent", "Login_ID", "", "remove", info.getNumberInfo());
		
		if (submitResult.getResultCode() != 0) {
			resutMessage = submitResult.getMessageText().contains("Identifier not assigned") ? "적용 번호가 없습니다." : submitResult.getMessageText();
			
			models.addObject(Globals.STATUS_MESSAGE, "삭제시 문제가 발생 하였습니다." + resutMessage);
			models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			return models; 
		}else {
			models.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}
		
		this.manageSession();
		this.releaseSession();
		
		return models;
}
	//내선번호 조회
	public List<StationInfo> execRequestStationInfo (List<String> extensions){
		//값 먼저 조회
		
		List<StationInfo> stations = new ArrayList<StationInfo>();
		Result submitResult;
		

		boolean loaded = this.loadProps("Station", "extension", "display", "count 1");
		
		if (!setup()) {
			return null; 
		}
		
		if ( (this.isValid()) && loaded) { // any args invalid
			//접속이 되면 
			for (String extension : extensions) {
					
					submitResult = this.submitRequest("Station", "extension", "Station", "display", extension);
					//submitResult = this.submitRequest(model, sFIELDS, sObjectName, sOperation, sQUALIFIER);
					log.info("========submitResult" + submitResult.getResultCode());
					if (submitResult.getResultCode() == 0) {
						try {
							StationInfo station = new StationInfo();
							station.setExtension(extension);
							station.setSecurityCode(submitResult.getResultData().getStation().get(0).getSecurityCode());
							station.setType(submitResult.getResultData().getStation().get(0).getType());
							station.setCor(submitResult.getResultData().getStation().get(0).getCOR());
							station.setCos(submitResult.getResultData().getStation().get(0).getCOS());
							station.setName(submitResult.getResultData().getStation().get(0).getName());
							station.setTn(submitResult.getResultData().getStation().get(0).getTN());
							station.setDisplayLangage(submitResult.getResultData().getStation().get(0).getDisplayLanguage());
							station.setIpSoftphone(submitResult.getResultData().getStation().get(0).getIPSoftphone());
							
							List<StationButtonInfo> buttons = new ArrayList<StationButtonInfo>();
							buttons = submitResult.getResultData().getStation().get(0).getButtonData1()
																	.stream()
																	.map(item -> new StationButtonInfo (Integer.parseInt( extension), 
																														item.getValue(),  
																														"ButtonData1",
																														Long.valueOf(item.getPosition()).intValue()
																														)).collect(Collectors.toList());
							buttons.addAll(submitResult.getResultData().getStation().get(0).getButtonData2()
														.stream()
														.map(item -> new StationButtonInfo (Integer.parseInt( extension), 
																											item.getValue(),  
																											"ButtonData2",
																											Long.valueOf(item.getPosition()).intValue()
																											)).collect(Collectors.toList()));
							buttons.addAll(submitResult.getResultData().getStation().get(0).getButtonData3()
									.stream()
									.map(item -> new StationButtonInfo (Integer.parseInt( extension), 
																						item.getValue(),  
																						"ButtonData3",
																						Long.valueOf(item.getPosition()).intValue()
																						)).collect(Collectors.toList()));
							buttons.addAll(submitResult.getResultData().getStation().get(0).getButtonData4()
									.stream()
									.map(item -> new StationButtonInfo (Integer.parseInt( extension), 
																						item.getValue(),  
																						"ButtonData4",
																						Long.valueOf(item.getPosition()).intValue()
																						)).collect(Collectors.toList()));
							buttons.addAll(submitResult.getResultData().getStation().get(0).getButtonData5()
									.stream()
									.map(item -> new StationButtonInfo (Integer.parseInt( extension), 
																						item.getValue(),  
																						"ButtonData5",
																						Long.valueOf(item.getPosition()).intValue()
																						)).collect(Collectors.toList()));
							buttons.addAll(submitResult.getResultData().getStation().get(0).getButtonData6()
									.stream()
									.map(item -> new StationButtonInfo (Integer.parseInt( extension), 
																						item.getValue(),  
																						"ButtonData6",
																						Long.valueOf(item.getPosition()).intValue()
																						)).collect(Collectors.toList()));
							buttons.addAll(submitResult.getResultData().getStation().get(0).getButtonData7()
									.stream()
									.map(item -> new StationButtonInfo (Integer.parseInt( extension), 
																						item.getValue(),  
																						"ButtonData7",
																						Long.valueOf(item.getPosition()).intValue()
																						)).collect(Collectors.toList()));
							station.setStationButton(buttons);
							stations.add(station);
						}catch(Exception e1) {
							log.error("station error:" + e1.toString());
						}
					}
			}
		} else {
			log.info("========execRequestStationInfo unloaded");
		}
		this.manageSession();
		this.releaseSession();
		return stations;
	}
	public List<AgentInfo> execRequestAgentInfo (List<String> loginIds){
		//값 먼저 조회
		
		String qualifier = "count 1";
		List<AgentInfo> stations = new ArrayList<AgentInfo>();
		Result submitResult;
		boolean loaded = this.loadProps("Station", "extension", "display", "count 1");
		
		if (!setup()) {
			return null; 
		}
		if ( (this.isValid()) && loaded) {// any args invalid
			//접속이 되면 
			for (String loginId : loginIds) {
				submitResult = this.submitRequest("Agent", "Login_ID", "", "display", loginId);
				
				if (submitResult.getResultCode() == 0) {
					AgentInfo agent = AgentInfo.builder().loginId(loginId)
												.name(submitResult.getResultData().getAgent().get(0).getName())
												.extension(submitResult.getResultData().getAgent().get(0).getExtension())
												.build();
												//여기 부부 수정 하기 
												List<AgentScenInfo> snsr = new ArrayList<AgentScenInfo>();
												snsr = submitResult.getResultData().getAgent().get(0).getSN()
														.stream()
														.map(item -> new AgentScenInfo ( loginId, 
																											"SN",
																											Long.valueOf(item.getPosition()).intValue(),
																											item.getValue()
																											)).collect(Collectors.toList());
												
												snsr.addAll(submitResult.getResultData().getAgent().get(0).getSL()
																				.stream()
																				.map(item -> new AgentScenInfo ( loginId, 
																																	"SL",
																																	Long.valueOf(item.getPosition()).intValue(),
																																	item.getValue()
																																	)).collect(Collectors.toList())
												
												);
												agent.setScenInfos(snsr);
												
					stations.add(agent);
				}
			}
		} 
		this.manageSession();
		this.releaseSession();
		return stations;
	}
	//pbx check
	public int execRequestMemberCheck(String number, String _ckGubun) {
		
		int result = 0;
		
		boolean loaded = this.loadProps("Station", "extension", "display", "count 1");
		
		if (!setup()) {
			result = -1;
		}
		Result submitResult;
		// we failed and we're done
		// status 값 체크 하기 
		if (_ckGubun.equals("Extension")) {
			submitResult = this.submitRequest("Station", "extension", "", "display", number);
			result = submitResult.getResultCode();
		}else {
			submitResult = this.submitRequest("Agent", "Login_ID", "", "display", number);
			result = submitResult.getResultCode();
			
		}
		
		this.manageSession();
		this.releaseSession();
	
		return result;
	}
	public ModelAndView execRequestStationUpdate(StationInfoReqDto info) {	
		ModelAndView models = new ModelAndView(Globals.JSON_VIEW);
		
		boolean loaded = this.loadProps("Agent", "extension", "display", info.getExtension());
		
		
		if (!setup()) {
			models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			return models; 
		}
		
		Result submitResult;
		if (info.getMode().equals("Ins")) {
			submitResult = this.submitRequest("Station", "extension", "", "display", info.getExtension());
			if (submitResult.getResultCode() == 0) {
				models.addObject(Globals.STATUS_MESSAGE, "내선번호가 등록되 있습니다.");
				models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				return models; 
			}
		}
		String stationOperration = info.getMode().equals("Ins") ? "add" : "change";
		
		submitResult = submitStationRequest("Station", "Extension", "", stationOperration, info);
		
		if (submitResult.getResultCode() != 0) {
			models.addObject(Globals.STATUS_MESSAGE, "내선번호가 등록중 문제가 발생 하였습니다." + submitResult.getMessageText());
			models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}else {
			models.addObject(Globals.STATUS_MESSAGE, "내선번호가 등록.");
			models.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}
		this.manageSession();
		this.releaseSession();
		return models;
	}
	//agenet
	public ModelAndView execRequestAgentUpdate(AgentInfoReqDto info) {	
		ModelAndView models = new ModelAndView(Globals.JSON_VIEW);
		
	
		boolean loaded = this.loadProps("Agent", "extension", "display", info.getExtension());
		if (!setup()) {
			models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			return models; 
		}
		
		Result submitResult;
		if (info.getMode().equals("Ins")) {
			submitResult = this.submitRequest("Agent", "Login_ID|Name|Extension", "", "display", info.getLoginId());
			if (submitResult.getResultCode() == 0) {
				models.addObject(Globals.STATUS_MESSAGE, "Agent가 등록되 있습니다.");
				models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				return models; 
			}
		}
		String stationOperration = info.getMode().equals("Ins") ? "add" : "change";
		
		submitResult = submitAgentRequest("Agent", "Extension", "", stationOperration, info);
		
		if (submitResult.getResultCode() != 0) {
			models.addObject(Globals.STATUS_MESSAGE, "내선번호가 등록중 문제가 발생 하였습니다." + submitResult.getMessageText());
			models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}else {
			models.addObject(Globals.STATUS_MESSAGE, "에이전트가 정상적으로 처리 되었습니다." + submitResult.getResultCode());
			models.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}
		this.manageSession();
		this.releaseSession();
		return models;
	}
	public ModelAndView execRequestMemberUpdate(PbxMemberInfo info) {
		ModelAndView models = new ModelAndView(Globals.JSON_VIEW);
		if (!setup()) {
			models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			return models; 
		}
		if (info.getMode().equals("PBX")) {
			String addType = "Extension="+info.getExtension()+"|Type="+info.getType() +"|COR="+info.getCor()+"|COS="+info.getCos()+"|Name="+info.getName()+"|SecurityCode="+info.getSecurityCode()+"";
			/*
			Result submitResult = submitStationRequest("Station", "Extension","", "change", info);
			
			if (submitResult.getResultCode() == 0) {
				models.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				try {
					models.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("pbx.extension.update"));
				}catch (Exception e1) {
					models.addObject(Globals.STATUS_MESSAGE, "내선번호가 수정되었습니다.");
				}
				models.setStatus(HttpStatus.OK);
			}else {
				models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				try {
					models.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("pbx.extension.fail"));
				}catch (Exception e1) {
					models.addObject(Globals.STATUS_MESSAGE, "내선번호 처리중 문제가 발생하였습니다.");
				}
			}
			*/
		}else {
			/*
			Result submitResult = submitAgentRequest("Agent", "Extension", "", "change", info);
			if (submitResult.getResultCode() != 0) {
				models.addObject(Globals.STATUS_MESSAGE, "agent가 등록중 문제가 발생 하였습니다." + submitResult.getMessageText());
				models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			}else {
				models.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				try {
					models.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("pbx.agent.update"));
				}catch (Exception e1) {
					models.addObject(Globals.STATUS_MESSAGE, "agent가 수정되었습니다.");
					System.out.println("======pbx error:" + e1.toString());
				}
				models.setStatus(HttpStatus.OK);
			}
			*/
		}
		
		return models; 
	}
	//사용자 등록
	public ModelAndView execRequestMemberInsert(PbxMemberInfo info) {
		// Step 1: Initial SOAP setup, done once (typically) per session.
		ModelAndView models = new ModelAndView(Globals.JSON_VIEW);
		if (!setup()) {
			models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			return models; 
		}
		// we failed and we're done
		// status 값 체크 하기 
		System.out.println("===== 내선번호 체크 ");
		Result submitResult = this.submitRequest("Station", "extension", "", "display", info.getExtension());
		if (submitResult.getResultCode() == 0) {
			models.addObject(Globals.STATUS_MESSAGE, "내선번호가 등록되 있습니다.");
			models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			return models; 
		}
		System.out.println("===== agent 체크 ");
		// Agent 값 체크 하기 
		submitResult = this.submitRequest("Agent", "Login_ID|Name|Extension", "", "display", info.getLoginId());
		if (submitResult.getResultCode() == 0) {
			models.addObject(Globals.STATUS_MESSAGE, "Agent가 등록되 있습니다.");
			models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			return models; 
		}
		System.out.println("===== 내선번호 등록 ");
		String addType = "Extension="+info.getExtension()+"|Type="+info.getType() +"|COR="+info.getCor()+"|COS="+info.getCos()+"|Name="+info.getName()+"|SecurityCode="+info.getSecurityCode()+"";
		System.out.println("addType:" + addType);
		submitResult = this.submitRequest("Station", addType, "", "add", info.getExtension());
		
		
		if (submitResult.getResultCode() == 0) {
			/*
			submitResult = submitAgentRequest("Agent", "Extension", "", "add", info);
			if (submitResult.getResultCode() != 0) {
				models.addObject(Globals.STATUS_MESSAGE, "agent가 등록중 문제가 발생 하였습니다." + submitResult.getMessageText());
				models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				return models;
			}
			*/
		}else {
			models.addObject(Globals.STATUS_MESSAGE, "내선번호가 등록중 문제가 발생 하였습니다." + submitResult.getMessageText());
			models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			return models; 
			
		}
		
		
		this.manageSession();
		this.releaseSession();
		
		if (submitResult != null) {
			models.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			models.setStatus(HttpStatus.OK);
		}else {
			models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			models.setStatus(HttpStatus.BAD_REQUEST);
		}
		
		
		return models;
	}
	

		// **************************************************************************
		// Step 1: setup()
		// **************************************************************************
		/**
		 * Performs initial setup of SOAP port/binding
		 *  SOAP setup 및  port 바인
		 */
		boolean setup() {
			
			try {
				modelContext = JAXBContext.newInstance(Globals.PBX_WEB_REFERENCE_PACKAGE);
				// Specify End-Point URL 
				String endpoint = new URL(root + Globals.PBX_SYSETM_SERVICE ).toString();
				
				// Create a static Service instance -- Avoid network overhead by using a local 
				//정적 서비스 인스턴스 생성 - 로컬을 사용하여 네트워크 오버헤드 방지
				// copy of the WSDL
				URL localWSDL;
				//ClassLoader cl = null;
			
				if (cl != null)
					localWSDL = cl.getResource(Globals.PBX_WSDL);
				 else 
					localWSDL = ClassLoader.getSystemResource(Globals.PBX_WSDL);
				 
			
				// Service QName for Static Service instance
				QName serviceName = new QName(Globals.PBX_WS_DEFAULT_NAMESPACE,"SystemManagementService");

				// Create new service
				System.out.println("Creating Static SMS Service Instance...");
				sms = new SystemManagementService(localWSDL, serviceName);

				// Create a Dynamic Proxy client
				System.out.println("Binding to SMS Port...\n");
				port = sms.getSystemManagementPort();
				bp = (WSBindingProvider) port;

				// Configure RequestContext with endpoint's URL and
				// set the login and credentials in the HTTP authorization header
				Map<String, Object> requestContext = bp.getRequestContext();
				requestContext.put(WSBindingProvider.USERNAME_PROPERTY, login);
				requestContext.put(WSBindingProvider.PASSWORD_PROPERTY, pw);
				requestContext.put(WSBindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
				requestContext.put("com.sun.xml.ws.request.timeout", responseTimeout);
				
				// Add the SOAP header handler.
				Binding binding = bp.getBinding();
				List<Handler> handlerList = binding.getHandlerChain();
				if (handlerList == null) {
					handlerList = new ArrayList<Handler>();
				}

				// The SID handler will allow us to set and get the session ID from
				// the SOAP Header.
				// Initialize the Handler and add it to the Handler Chain
				SIDHandler = new SessionIDLogicalHandler();
				handlerList.add(SIDHandler);
				binding.setHandlerChain(handlerList);

				// Set the local session ID to null for initial request then had it
				// to the Session ID Handler to set in SOAP Header.
				requestSID = "";
				SIDHandler.setSID(requestSID);
				log.info("=============requestSID" + requestSID);
			} catch (WebServiceException e) {
				log.error("WebServiceException occured durring port creation. \r\n" + e.getMessage());
				return false;
			} catch (MalformedURLException e) {
				log.error("Bad URL (" + root + Globals.PBX_SYSETM_SERVICE+"); cannot access SMS: " + e);
				return false;
			} catch (Exception e) {
				log.error("An error occured during initial setup; cannot access SMS: " + e);
				return false;
			}

			return true; // setup is good
		}

		// **************************************************************************
		// Step 2: submitRequest()
		// **************************************************************************
		/**
		 * Submits the SOAP request defined in the SMSTest object to the SMS web
		 * SMSTest 개체에 정의된 SOAP 요청을 SMS 웹에 제출합니다.
		 * service for processing.
		 * station 추가
		 * 
		 */
		private Result submitStationRequest(String model, 
															String sFIELDS, 
															String sObjectName, 
															String sOperation, 
															StationInfoReqDto info) {
			
			// Initialize Types
			Result result = null;
			String mType = Globals.PBX_WEB_REFERENCE_PACKAGE + "." + model + "Type";			
			faultRaised = false;
			try {

				modelClass = Class.forName(mType);
				ModelChoices modelChoices = new ModelChoices();
				modelChoicesClass = modelChoices.getClass();

				String getModel = "get" + model;
				Method getModelMethod = modelChoicesClass.getMethod(getModel,new Class[] {});
				List<Object> modelList = (List<Object>) getModelMethod.invoke(modelChoices, new Object[] {});
				
				modelList.add(modelClass.newInstance());
				objectFactory = new ObjectFactory();
				com.system.ipcc.pbx.avaya.smsxml.ModelChoices mf_add = objectFactory.createModelChoices();
				StationType st_submit = objectFactory.createStationType();
				//여기 구문 정리 하기 
				
				
				//추후 리펙토링 필요함 
				List<String> buttonInfos = info.getStationButton().stream().map(x -> x.getButtonName()).distinct().collect(Collectors.toList());
				List<StationButtonInfo> buttonList;
				
				for(String button : buttonInfos) {
					
					buttonList = info.getStationButton().stream().filter( t -> t.getButtonName().equals(button))
												.map(emtry -> new StationButtonInfo(
														Integer.valueOf(info.getExtension()) ,
														emtry.getButtonData(), 
														button,
														emtry.getButtonPosition()  ))
												.collect(Collectors.toList());
					for (StationButtonInfo buttonInfo : buttonList) {
						ArrayType pbxButton = objectFactory.createArrayType();
						log.info("update StationButtonInfo: " + buttonInfo.getButtonData() + ":" + buttonInfo.getButtonPosition());
						pbxButton.setPosition(buttonInfo.getButtonPosition());
						pbxButton.setValue(buttonInfo.getButtonData());
						if (button.equals("ButtonData1") && !buttonInfo.getButtonData().equals(""))
							st_submit.getButtonData1().add(pbxButton);
						else if (button.equals("ButtonData1") && buttonInfo.getButtonData().equals(""))
							st_submit.getButtonData1().remove(buttonInfo.getButtonPosition());
						else if (button.equals("ButtonData2") && !buttonInfo.getButtonData().equals(""))
							st_submit.getButtonData2().add(pbxButton);
						else if (button.equals("ButtonData2") && buttonInfo.getButtonData().equals(""))
							st_submit.getButtonData2().remove(buttonInfo.getButtonPosition());
						else if (button.equals("ButtonData3") && !buttonInfo.getButtonData().equals(""))
							st_submit.getButtonData3().add(pbxButton);
						else if (button.equals("ButtonData3") && buttonInfo.getButtonData().equals(""))
							st_submit.getButtonData3().remove(buttonInfo.getButtonPosition());
						else if (button.equals("ButtonData4") && !buttonInfo.getButtonData().equals(""))
							st_submit.getButtonData4().add(pbxButton);
						else if (button.equals("ButtonData4") && buttonInfo.getButtonData().equals(""))
							st_submit.getButtonData4().remove(buttonInfo.getButtonPosition());
						else if (button.equals("ButtonData5") && !buttonInfo.getButtonData().equals(""))
							st_submit.getButtonData5().add(pbxButton);
						else if (button.equals("ButtonData5") && buttonInfo.getButtonData().equals(""))
							st_submit.getButtonData5().remove(buttonInfo.getButtonPosition());
						else if (button.equals("ButtonData6") && !buttonInfo.getButtonData().equals(""))
							st_submit.getButtonData6().add(pbxButton);
						else if (button.equals("ButtonData6") && buttonInfo.getButtonData().equals(""))
							st_submit.getButtonData6().remove(buttonInfo.getButtonPosition());
						else  if (button.equals("ButtonData") && !buttonInfo.getButtonData().equals(""))
							st_submit.getButtonData7().add(pbxButton);
						else  if (button.equals("ButtonData") && buttonInfo.getButtonData().equals(""))
							st_submit.getButtonData7().remove(buttonInfo.getButtonPosition());
					}
					
					
				}
				//추후 리펙토링 필요함 
				// 추후 버튼 삭제시 추가 작업 필요하
				//
				st_submit.getButtonData1().forEach(x -> System.out.println( x.getPosition() + "" + x.getValue()) );
				
				st_submit.setExtension(info.getExtension());
				st_submit.setType(info.getType());
				st_submit.setCOR(info.getCor());
				st_submit.setCOS(info.getCos());
				st_submit.setName(info.getName());
				st_submit.setSecurityCode(info.getSecurityCode());
				st_submit.setDisplayLanguage(info.getDisplayLangage());
				st_submit.setIPSoftphone(info.getIpSoftphone());
				st_submit.setTN(info.getTn());
				mf_add.getStation().add(st_submit);
				modelList.set(0, st_submit);
				
				
				submitRequest = new SubmitRequestType();
				submitRequest.setModelFields(modelChoices);
				submitRequest.setObjectname(sObjectName); 
				submitRequest.setOperation(sOperation);
				submitRequest.setQualifier(info.getExtension());
				
				result = port.submitRequest(submitRequest.getModelFields(), submitRequest.getOperation(),
														submitRequest.getObjectname(), submitRequest.getQualifier());
				
			} catch (ClassNotFoundException cnf) { 
				log.error("ModelType: " + mType + " could not be loaded! Please verify this is a valid model.");
				log.error(cnf.getMessage()); 
				faultRaised = true; 
			} catch (Exception soapE) {
				log.error("A SOAP fault was raised: ");
				log.error("Cause: " + soapE.getCause());
				log.error("Message: " + soapE );

				faultRaised = true;
			 }
			
			// If we got a result (not a fault) then we'll show it
			if (!faultRaised) {
				
				if (result.getResultCode() == 0) { 
					ModelChoices mc = result.getResultData(); 
					if (mc != null) { 
						printResult(mc, model); 
					} 
				}else { 
					faultRaised = true; 
					log.error("The request returned an error (result_code == "+ result.getResultCode() + ")"); 
					log.error("result_data == " + '"' + result.getResultData() + '"');
					log.error("message_text == " + result.getMessageText() ); }
			}
			
			return result;

		}
		private Result submitAgentRequest(String model, 
															String sFIELDS, 
															String sObjectName, 
															String sOperation, 
															AgentInfoReqDto info) {
			
			// Initialize Types
			Result result = null;
			String mType = Globals.PBX_WEB_REFERENCE_PACKAGE + "." + model + "Type";			
			faultRaised = false;
			try {

				modelClass = Class.forName(mType);
				ModelChoices modelChoices = new ModelChoices();
				modelChoicesClass = modelChoices.getClass();

				String getModel = "get" + model;
				Method getModelMethod = modelChoicesClass.getMethod(getModel,new Class[] {});
				List<Object> modelList = (List<Object>) getModelMethod.invoke(modelChoices, new Object[] {});
				
				modelList.add(modelClass.newInstance());
				
				// 여기 부분이 에이전트 생성 
				
				objectFactory = new ObjectFactory();
				com.system.ipcc.pbx.avaya.smsxml.ModelChoices mf_add = objectFactory.createModelChoices();//
				AgentType ag_submit =objectFactory.createAgentType();
				
				ArrayType sn_list = objectFactory.createArrayType();
				List<AgentScenInfo> snLists = info.getScenInfos().stream().filter( t -> t.getScenGubun().equals("SN"))
															.collect(Collectors.toList());
				for (AgentScenInfo buttonInfo : snLists) {
					
					sn_list.setPosition(buttonInfo.getScenPosition());
					sn_list.setValue(buttonInfo.getScenValue());
				}
				ag_submit.getSN().add(sn_list);
				ArrayType sr_list = objectFactory.createArrayType();
				List<AgentScenInfo> srLists = info.getScenInfos().stream().filter( t -> t.getScenGubun().equals("SR"))
															.collect(Collectors.toList());
				for (AgentScenInfo buttonInfo : srLists) {
					
					sr_list.setPosition(buttonInfo.getScenPosition());
					sr_list.setValue(buttonInfo.getScenValue());
				}
				ag_submit.getSL().add(sr_list);
				ag_submit.setLoginID(info.getLoginId());
				
				mf_add.getAgent().add(ag_submit);
				modelList.set(0, ag_submit);
				
				
				submitRequest = new SubmitRequestType();
				
					
				submitRequest.setModelFields(modelChoices);
				submitRequest.setObjectname(sObjectName); 
				submitRequest.setOperation(sOperation);
				submitRequest.setQualifier(info.getLoginId());
				
				result = port.submitRequest(submitRequest.getModelFields(), submitRequest.getOperation(),
						 								submitRequest.getObjectname(), submitRequest.getQualifier());
				
			} catch (ClassNotFoundException cnf) { 
				log.error("ModelType: " + mType + " could not be loaded! Please verify this is a valid model.");
				log.error(cnf.getMessage()); 
				faultRaised = true; 
			} catch (Exception soapE) {
				// A fault was raised. The fault message will contain the
				// explanation
				log.error("A SOAP fault was raised: ");

				log.error("Cause: " + soapE.getCause());
				log.error("Message: " + soapE );

				faultRaised = true;
			}
			
			// If we got a result (not a fault) then we'll show it
			if (!faultRaised) {
				
				  // The result code indicates success or failure (CM rejected the request) 
				if (result.getResultCode() == 0) { 
					log.error("The request was successful (result_code == 0)");
					ModelChoices mc = result.getResultData(); 
					
					// Is result null 
					if (mc != null) { 
						printResult(mc, model); 
					} 
				}else { 
					
					faultRaised = true; 
					log.info("The request returned an error (result_code == "+ result.getResultCode() + ")"); 
					log.info("result_data == " + '"' + result.getResultData() + '"');
					log.info("message_text == " + result.getMessageText() ); }
				 
			}
			
			return result;

		}
		/// SOAP 통신으로 결과 받아오기
		private Result submitRequest(String model, 
												String sFIELDS, String sObjectName, 
												String sOperation, String sQUALIFIER) {
	
			// Initialize Types
			Result result = null;
			String mType = Globals.PBX_WEB_REFERENCE_PACKAGE + "." + model + "Type";			
			faultRaised = false;
			try {

				modelClass = Class.forName(mType);
				ModelChoices modelChoices = new ModelChoices();
				modelChoicesClass = modelChoices.getClass();

				String getModel = "get" + model;
				Method getModelMethod = modelChoicesClass.getMethod(getModel,new Class[] {});
				List<Object> modelList = (List<Object>) getModelMethod.invoke(modelChoices, new Object[] {});
				
				modelList.add(modelClass.newInstance());
				modelList.set(0, populateFields(modelList.get(0), sFIELDS));
				submitRequest = new SubmitRequestType();
				submitRequest.setModelFields(modelChoices);
				submitRequest.setObjectname(sObjectName); 
				submitRequest.setOperation(sOperation);
				submitRequest.setQualifier(sQUALIFIER);

				// Display what we're about to execute
				result = port.submitRequest(submitRequest.getModelFields(), submitRequest.getOperation(),
						                    submitRequest.getObjectname(), submitRequest.getQualifier());

			} catch (ClassNotFoundException cnf) { 
					log.error("ModelType: " + mType + " could not be loaded! Please verify this is a valid model.");
					log.error(cnf.getMessage()); 
					faultRaised = true; 
			 } catch (Exception soapE) {
					// A fault was raised. The fault message will contain the
					// explanation
					log.error("A SOAP fault was raised: ");
					log.error("Cause: " + soapE.getCause());
					log.error("Message: " + soapE );
					faultRaised = true;
			 }
			
			// If we got a result (not a fault) then we'll show it
			if (!faultRaised) {
				
				  // The result code indicates success or failure (CM rejected the request) 
				if (result.getResultCode() == 0) { 
					log.info("The request was successful (result_code == 0)");
					ModelChoices mc = result.getResultData(); 
					
					// Is result null 
					if (mc != null) { 
						// We'll use a routine to illustrate processing the return values
						printResult(mc, model); 
					} 
				} else { 
					
					faultRaised = true; 
					// In case CM rejected the request, the message text will contain CM's explanation
					log.error("The request returned an error (result_code == "+ result.getResultCode() + ")"); 
					log.error("result_data == " + '"' + result.getResultData() + '"');
					log.error("message_text == " + result.getMessageText() ); }
				 
			}
			
			return result;

		}
		

		// **************************************************************************
		// Step 3: manageSession()
		// **************************************************************************
		/**
		 * Obtains the sessionID from a valid response and copies into the request
		 * 유효한 응답에서 sessionID를 얻고 요청에 복사합니다.
		 * header sessionID for the next request
		 * 
		 */
		private void manageSession() {

			// If the last request raised a fault, then there is no session
			// response header, and no change to session management information
			if (!faultRaised) {
				
				// None of the exception conditions below should occur, except in case 
				// of programming error.  In our sample code, we simply print and ignore such
				// conditions. In a real application handling might involve stopping the 
				// application. Repeated invocation of SMS requests without propagating 
				// the sessionID information correctly could result in (temporarily) exhausting 
				// all available SMS connections.
				try {

					// retrieve resulting session ID from the handler class
					responseSID = SIDHandler.getSID();

					// Copy the sessionID from the responses header back into our
					// request header to be supplied with the next request. This
					// fulfills the client obligation with respect to session
					// management
					requestSID = responseSID;
					SIDHandler.setSID(requestSID);

				} catch (Exception se) {
					System.out.println(" Error setting the session ID" + se);
				}
			}
		}

		// **************************************************************************
		// Step 4. releaseSession()
		// **************************************************************************
		/**
		 * Releases the SMS session
		 */
		public void releaseSession() {
			ReturnType result = null; // release also returns a result structure

			// Display resulting Session ID
			log.info("\nReleasing SessionID[" + requestSID + "]...");

			try {
				
				// always send a null value for the argument result =
				result = port.release("");
				
				// Get resulting session ID... Should be null String
				responseSID = SIDHandler.getSID();
				
				// The actual result may be ignored. If release returns (i.e.,
				// does not raise a fault), then it always succeeds, and a
				// result_code of zero is returned.
				
			} catch (Exception re) {
				// A fault was raised. The fault message will contain the
				// explanation
				log.info("A SOAP fault was raised during the release call: " + re);
				return;
			}
		}

		// The rest of the SMSTest class consists of helper methods for
		// pretty-printing result data and manually populating the modelFields object.
		// These methods serve to illustrate how the result data is formatted
		// and how it may be processed.

		private Object populateFields(Object Obj, String sFields) {
			
			
			try {
				
				//String Type2 = "Extension=11339991|Name=Kim|SecurityCode=1234567";
				//String Type2 = "Extension=11339992|Type=9620|COR=1|COS=1|Name=TEST|SecurityCode=1234";
				System.out.println("populateFields:" + sFields);
				//String Type2 = "SN[1]=9|SL[1]=1";
				Class<?> T = Obj.getClass();
				String[] fieldArray = sFields.split(delimiter);
				String mStartsWith = ("set");
				Hashtable<String, ArrayType[]> objectTable = new Hashtable<String, ArrayType[]>();

				for (int i = 0; i < fieldArray.length; i++) {
					
					String fvalue = null;
					String fname = null;
					boolean setField = false;
					String[] fvalueArray = fieldArray[i].split("=");
		
					if (fvalueArray.length == 2) {
						// Check if we have an array object
						if (isArrayField(fvalueArray[0])) {
							// Find array index
							int idx = arrayIndex(fvalueArray[0]);
							String fn = arrayFieldname(fvalueArray[0]);
							fvalue = fvalueArray[1];
							// The arrayType defined in SMS consists of a 'value'
							// and 'postion'
							ArrayType arrayElement = new ArrayType();
							arrayElement.setValue(fvalue);
							arrayElement.setPosition(idx);

							// Check if we already have the field in the objectTable
							// and add
							if (objectTable.containsKey(fn)) {
								System.out.println("objectTable.add");
								ArrayType[] afv = (ArrayType[]) objectTable.get(fn);
								int currentLength = afv.length;
								afv[currentLength] = arrayElement;
								objectTable.put(fn, afv);
							} else {
								System.out.println("objectTable.put");
								ArrayType[] new_afv = new ArrayType[1];
								new_afv[0] = arrayElement;
								objectTable.put(fn, new_afv);
							}
						} else {
							System.out.println("not ======= arrayfield ==>" +  fvalueArray[0]);
							fname = fvalueArray[0];
							fvalue = fvalueArray[1];
							setField = true;
						}
					} else {
						fname = fvalueArray[0];
						fvalue = "";
						setField = true;
					}

					if (setField) {

						// Go ahead and set the field since its not an array
						String mName = (mStartsWith + fname);
						Method mi = T.getMethod(mName,String.class);

						// Try to set the vaule if the field exists
						if (mi != null) {
							Object[] args = new Object[] {fvalue};
							mi.invoke(Obj, args);
							System.out.println(mName + " = \"" + fvalue + '"');
						}
					}
				}// End for
				// Now set the object arrays
				if (objectTable.size() > 0) {
					for (String key : objectTable.keySet()) {
						
						String mName = (mStartsWith + key);
						try {
							Method mi = T.getMethod(mName);
							
							if (mi != null) {
								
								ArrayType[] val = (ArrayType[]) objectTable.get(key);
								System.out.println("Setting  " + key
										+ " Array -- Length of " + val.length + ":" + val);
								try {
									mi.invoke(Obj, (Object[]) val);
								}catch(Exception e1) {
									System.out.println("objectTable error:"+  e1 );
								}
								
								
							} else {
								System.out.println(key + " Element Does Not Exist!");
							}
						}catch (Exception e1) {
							System.out.println(key + " Element Does Not Exist!");
							System.out.println(e1.getMessage());
							
						}
					}
				}
				
			} catch (Exception e) {
				log.error("Exception ===================");
				log.error(e.getMessage());
			}

			return Obj;
		}

		private boolean isArrayField(String field) {
			return field.endsWith("]");
		}

		private int arrayIndex(String arrayField) {
			int result = -1;
			try {
				int pos = arrayField.lastIndexOf("[") + 1;
				result = Integer.parseInt(arrayField.substring(pos, arrayField.length()-1));
			} catch (NumberFormatException e) {
				result = -1;
			}
			return result;
		}

		private String arrayFieldname(String arrayField) {
			int pos = arrayField.lastIndexOf("[");
			return arrayField.substring(0, pos);
		}

		private void printResult(ModelChoices mc, String sModel) { 
			  // Output result_data values.
			try{
					String getModel = "get" + sModel;
					Method getModelMethod = modelChoicesClass.getMethod(getModel, new Class[] {});
					List<Object> resultObjectArray = (List<Object>) getModelMethod.invoke(mc, new Object[] {});
					
					if (resultObjectArray != null) { 
						int resultLength = resultObjectArray.size();
						if (format.equals(Globals.PBX_FORMART)) { 
							// Serialize Resulting modelChoice
							Marshaller marshaller = modelContext.createMarshaller();
							marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
							
							log.info("-----------------XML-----------------\r\n");
							marshaller.marshal( new JAXBElement(new QName(Globals.PBX_SMS_NS,"ModelChoices"),modelChoicesClass,mc), 
								  				System.out);
							log.info("-------------------------------------\r\n"); 
						}else { 
							// Find the returnTypes getter methods and invoke
							log.info("\r\n---------------------------------------\r\n");
							for (int i = 0; i < resultLength; i++) { 
								Class<?> resultType = resultObjectArray.get(i).getClass();
								Method[] mi = resultType.getMethods();
								log.info("ResultObject = " + resultType.getName() + "[" + i + "]");
								for (int j=0; j < mi.length; j++) { 
									String mName = mi[j].getName(); 
									String mStartsWith = ("get"); 
									// Only interested in the getter methods
									if(mName.startsWith(mStartsWith)) { 
											String vName = mName.substring(mStartsWith.length());
											// Handle different return types
											Class<?> vType = mi[j].getReturnType();
											Object value = mi[j].invoke( resultObjectArray.get(i), new Object[] {} );
											if (value != null) {
												if( vType.getName().equals("java.lang.String") )
													log.info(vName + " = " + '"' + value +'"');
												else if( vType.getName().equals("java.util.List") ){
													ArrayList<ArrayType> valueAL = (ArrayList<ArrayType>) value;
													for(int k=0; k < valueAL.size(); k++){
														ArrayType v = valueAL.get(k);
														if(v != null){
															log.info(vName + "[" + v.getPosition() +"] = " + '"' + v.getValue() +'"');
													}
												}
											}else {	
													 // Skip unknown type
											}		
									}
								} 
								}// End Foreach
		
							}// End For-loop
						} 
					} else { 
						log.info("There were no Items to display!"); 
					}
			} catch (JAXBException je){
				log.error("An error occured while marshalling the result object ");
				je.printStackTrace();
				faultRaised = true;
			} catch (Exception e){
				log.error("printResult result error: " + e.toString());
				e.printStackTrace();
			}
		}
		
		//속성 Properties
		public boolean loadProps(String models,  String sFIELDS, String sOPERATION, String sQUALIFIER ) {
			try {
				
				String tmp = "";
				
				tmp =   pbxinfo.getSms_root() ;
				if(tmp != null){this.root = tmp.trim();}
				log.info("this.root:" + this.root);
				
				tmp =  pbxinfo.getCm_id() ;
				if(tmp != null){this.login = tmp.trim();}
				log.info("this.login:" + this.login);
				
				tmp =  pbxinfo.getCm_password() ;
				if(tmp != null){this.pw = tmp.trim();}
				
				tmp =  pbxinfo.getOutput_format() ;
				if(tmp != null){this.format = tmp.trim();}
				
				tmp = models;
				if(tmp != null){this.model = tmp.trim();}
				
				tmp = sFIELDS;
				if(tmp != null){this.fields = tmp.trim();}
				
				tmp = sOPERATION;
				if(tmp != null){this.operation = tmp.trim();}
				
				tmp =  sQUALIFIER;
				if(tmp != null){this.qualifier = tmp.trim();}
				
				tmp =  "objectname";
				if(tmp != null){}
			} catch (Exception e) {
				log.error("loadProps:" + e.getMessage());
				return false;
			}
			return true;
		}

}
