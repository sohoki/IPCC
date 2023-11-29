package com.system.ipcc.pbx.avaya.service.smsxml;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
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

import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

import com.avaya.smsxml.Result;
import com.avaya.smsxml.ArrayType;
import com.avaya.smsxml.ModelChoices;
import com.avaya.smsxml.ReturnType;
import com.avaya.smsxml.StationType;
import com.avaya.smsxml.SubmitRequestType;
import com.avaya.smsxml.SystemManagementPort;
import com.avaya.smsxml.SystemManagementService;
import com.avaya.smsxml.TrunkGroupType;
import com.avaya.smsxml.TrunkStatusType;
import com.sun.xml.ws.developer.WSBindingProvider;
import com.system.backoffice.sys.pbx.avaya.models.SmsModelInfo;
import com.system.backoffice.sys.pbx.avaya.models.StationInfo;
import com.system.ipcc.pbx.avaya.models.PbxMemberInfo;
import com.system.ipcc.pbx.avaya.models.TrankGroupInfo;
import com.system.ipcc.pbx.avaya.models.pbxType;
import com.avaya.smsxml.AgentType;
import com.avaya.smsxml.ObjectFactory;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;


@SuppressWarnings("unchecked")
public class SMSReq {

	// Package Namespace
		private static String WEB_REFERENCE_PACKAGE = "com.avaya.smsxml";
		
		
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
		private static String WS_DEFAULT_NAMESPACE="http://xml.avaya.com/ws/SystemManagementService/2008/07/01";
		// Keep reference to the sessionHeader element, as it is also used
		// across requests
		private String requestSID = "";
		private String responseSID = "";
		private SessionIDLogicalHandler SIDHandler = null;

		// Reflection and Context Objects
		JAXBContext modelContext; 
		Class<?> modelClass;
		Class<?> modelChoicesClass;
		
		// Connection parameters
		private String root = "";
		private String login = "";
		private String pw = "";

		private Integer responseTimeout = new Integer(50000);

		// Request parameters
		private String model;
		private String operation;
		private String qualifier;
		private String fields;
		//private String objectname; // currently not used
		
		private SubmitRequestType submitRequest;
		
		// Output control
		private boolean faultRaised = false;

		// XML format output
		private static String FORMAT_XML = "xml";		
		private String format = FORMAT_XML; // XML is default unless overridden
		
		private static String SMS_NS = "http://xml.avaya.com/sms";

		// Input Delimiter
		private String delimiter = "\\|";
		
		// Property File Values
	    private static final String ROOT = "sms.root";
	    private static final String LOGIN = "cm.login";
	    private static final String PASSWORD = "cm.password";
	    private static final String FIELDS ="fields";

	    private static final String QUALIFIER ="qualifier";
	    private static final String OBJECTNAME ="objectname";
	    private static final String OUTPUT_FORMAT ="output.format";
	    
		// **************************************************************************
		// isValid()
		// **************************************************************************
		/**
		 * Validates the SMSTest object's parameters.
		 */
		public boolean isValid() {

			boolean ok = true;
			if (!(root.startsWith("http://") || root.startsWith("https://"))) {
				System.out.println("Parameter invalid sms.root " + root
						+ " [must begin with http:// or https://]");
				ok = false;
			}
			if ((login.length() <= 0) || (login.indexOf("@") <= 0)) {
				System.out.println("Parameter invalid cm.login " + login
						+ "[must be of the form 'loginid@cmaddress[:port]']");
				ok = false;
			}
			if (pw.length() <= 0) {
				System.out.println("Parameter invalid cm.password <cmpassword>");
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
		public ModelAndView execRequest(String model, String sFIELDS, String sObjectName, String sOperation, String sQUALIFIER) {
			// Step 1: Initial SOAP setup, done once (typically) per session.
			ModelAndView models = new ModelAndView(Globals.JSON_VIEW);
			if (!setup()) {
				models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				return models; 
			}
				// we failed and we're done
			Result submitResult = this.submitRequest(model, sFIELDS, sObjectName, sOperation, sQUALIFIER);

			this.manageSession();

			this.releaseSession();
			
			if (submitResult != null) {
				models.addObject(Globals.JSON_RETURN_RESULT, submitResult);
				models.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			}else {
				models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			}
			
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
		//내선번호 조회
		public List<StationInfo> execRequestStationInfo (List<String> extensions){
			//값 먼저 조회
			
			SMSReq client = new SMSReq();
    		String qualifier = "count 1";
    		List<StationInfo> stations = null;
    		Result submitResult;
    		boolean loaded = client.loadProps("Station", "extension", "display", qualifier);
    		if ( (client.isValid()) && loaded) // any args invalid
    		{
    			//접속이 되면 
    			for (String extension : extensions) {
    				submitResult = this.submitRequest("Station", "extension", "", "display", extension);
    				
    				if (submitResult.getResultCode() == 0) {
    					StationInfo station = new StationInfo();
    					
    					station.builder().extension(extension)
    									.security_code(submitResult.getResultData().getStation().get(0).getSecurityCode())
    									.type(submitResult.getResultData().getStation().get(0).getType())
    									.cor(submitResult.getResultData().getStation().get(0).getCOR())
    									.cos(submitResult.getResultData().getStation().get(0).getCOS())
    									.name(submitResult.getResultData().getStation().get(0).getName())
    									.tn(submitResult.getResultData().getStation().get(0).getTN())
    									.displayLangage(submitResult.getResultData().getStation().get(0).getDisplayLanguage())
    									.button01(String.join(",", (Iterable<? extends CharSequence>) submitResult.getResultData().getStation().get(0).getButtonData1()))
    									.button02(String.join(",", (Iterable<? extends CharSequence>) submitResult.getResultData().getStation().get(0).getButtonData2()))
    									.button03(String.join(",", (Iterable<? extends CharSequence>) submitResult.getResultData().getStation().get(0).getButtonData3()))
    									.button04(String.join(",", (Iterable<? extends CharSequence>) submitResult.getResultData().getStation().get(0).getButtonData4()))
    									.button05(String.join(",", (Iterable<? extends CharSequence>) submitResult.getResultData().getStation().get(0).getButtonData5()))
    									.button06(String.join(",", (Iterable<? extends CharSequence>) submitResult.getResultData().getStation().get(0).getButtonData6()))
    									.button07(String.join(",", (Iterable<? extends CharSequence>) submitResult.getResultData().getStation().get(0).getButtonData7()))
    									.build();
    					
    					stations.add(station);
    				}
    			}
    		} 
			this.manageSession();
			this.releaseSession();
			return stations;
		}
		//pbx check
		public int execRequestMemberCheck(PbxMemberInfo info, String _ckGubun) {
			
			int result = 0;
			if (!setup()) {
				result = -1;
			}
			Result submitResult;
			// we failed and we're done
			// status 값 체크 하기 
			if (_ckGubun.equals("Extension")) {
				submitResult = this.submitRequest("Station", "extension", "", "display", info.getExtension());
				result = submitResult.getResultCode();
			}else {
				submitResult = this.submitRequest("Agent", "Login_ID|Name|Extension", "", "display", info.getLoginId());
				result = submitResult.getResultCode();
				
			}
			
			this.manageSession();
			this.releaseSession();
		
			return result;
		}
		
		
		
		public ModelAndView execRequestMemberUpdate(PbxMemberInfo info) {
			ModelAndView models = new ModelAndView(Globals.JSON_VIEW);
			if (!setup()) {
				models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				return models; 
			}
			if (info.getMode().equals("PBX")) {
				String addType = "Extension="+info.getExtension()+"|Type="+info.getType() +"|COR="+info.getCor()+"|COS="+info.getCos()+"|Name="+info.getName()+"|SecurityCode="+info.getSecurityCode()+"";
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
			}else {
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
				
				System.out.println("===== Agent 등록 ");
				
				submitResult = submitAgentRequest("Agent", "Extension", "", "add", info);
				if (submitResult.getResultCode() != 0) {
					models.addObject(Globals.STATUS_MESSAGE, "agent가 등록중 문제가 발생 하였습니다." + submitResult.getMessageText());
					models.addObject(Globals.STATUS, Globals.STATUS_FAIL);
					return models;
				}
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
		//에이전트 삭제 
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

		// **************************************************************************
		// Step 1: setup()
		// **************************************************************************
		/**
		 * Performs initial setup of SOAP port/binding
		 * 
		 */
		boolean setup() {
			try {
				modelContext = JAXBContext.newInstance(WEB_REFERENCE_PACKAGE);
				System.out.println("WEB_REFERENCE_PACKAGE:" + WEB_REFERENCE_PACKAGE + "===============");
				// Specify End-Point URL 
				String endpoint = new URL(root + "/smsxml/SystemManagementService.php").toString();

				// Create a static Service instance -- Avoid network overhead by using a local 
				// copy of the WSDL
				URL localWSDL;
				
				if (cl != null){
					localWSDL = cl.getResource("wsdl_xml/SystemManagementService.wsdl");
				}
				 else {
					 localWSDL = ClassLoader.getSystemResource("wsdl_xml/SystemManagementService.wsdl");
				}
			
				// Service QName for Static Service instance
				QName serviceName = new QName(WS_DEFAULT_NAMESPACE,"SystemManagementService");
				sms = new SystemManagementService(localWSDL, serviceName);
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

			} catch (WebServiceException e) {
				System.out.println("WebServiceException occured durring port creation. \r\n"
								+ e.getMessage());
				return false;
			} catch (MalformedURLException e) {
				
				
				System.out.println("Bad URL (" + root + "/sms/SystemManagementService.php); cannot access SMS: " + e);
				return false;
			} catch (Exception e) {
				System.out.println("An error occured during initial setup; cannot access SMS: " + e);
				return false;
			}

			return true; // setup is good
		}

		// **************************************************************************
		// Step 2: submitRequest()
		// **************************************************************************
		/**
		 * Submits the SOAP request defined in the SMSTest object to the SMS web
		 * service for processing.
		 * 
		 */
		private Result submitStationRequest(String model, String sFIELDS, String sObjectName, String sOperation, PbxMemberInfo info) {
			
			// Initialize Types
			Result result = null;
			String mType = WEB_REFERENCE_PACKAGE + "." + model + "Type";			
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
				com.avaya.smsxml.ModelChoices mf_add = objectFactory.createModelChoices();
		        StationType st_submit = objectFactory.createStationType();
		        
		        int a = 1;
		        if (!info.getPbxButton01().equals("")  ) {
		        	String[] button01s = info.getPbxButton01().split(",");
		        	if (button01s.length > 0) {
		        		ArrayType button01 = objectFactory.createArrayType();
		        		for (String button : button01s) {
			        		if (!button.replace(" ", "").equals("")) {
			        			button01.setPosition(a);
				        		button01.setValue(button);	
			        		}
			        		a++;
			        	}
			        	st_submit.getButtonData1().add(button01);
		        	}
		        	
		        }
		        a = 1;
		        if (!info.getPbxButton02().equals("")  ) {
		        	String[] button02s = info.getPbxButton02().split(",");
		        	if (button02s.length > 0) {
		        		ArrayType button02 = objectFactory.createArrayType();
			        	for (String button : button02s) {
			        		if (!button.replace(" ", "").equals("")) {
			        			button02.setPosition(a);
				        		button02.setValue(button);	
			        		}
			        		
			        		a++;
			        	}
			        	st_submit.getButtonData2().add(button02);
		        	}
		        	
		        }
		        a = 1;
		        if (!info.getPbxButton03().equals("")  ) {
		        	String[] button03s = info.getPbxButton03().split(",");
		        	if (button03s.length > 0) {
		        		ArrayType button03 = objectFactory.createArrayType();
			        	for (String button : button03s) {
			        		if (!button.replace(" ", "").equals("")) {
			        			button03.setPosition(a);
				        		button03.setValue(button);	
			        		}
			        		
			        		a++;
			        	}
			        	st_submit.getButtonData3().add(button03);
		        	}
		        	
		        }
		        a = 1;
		        if (!info.getPbxButton04().equals("")  ) {
		        	String[] button04s = info.getPbxButton04().split(",");
		        	if (button04s.length > 0) {
		        		ArrayType button04 = objectFactory.createArrayType();
			        	for (String button : button04s) {
			        		if (!button.replace(" ", "").equals("")) {
			        			button04.setPosition(a);
				        		button04.setValue(button);	
			        		}
			        		a++;
			        	}
			        	st_submit.getButtonData4().add(button04);
		        	}
		        	
		        }
		        a = 1;
		        if (!info.getPbxButton05().equals("")  ) {
		        	String[] button05s = info.getPbxButton05().split(",");
		        	if (button05s.length > 0) {
		        		ArrayType button05 = objectFactory.createArrayType();
			        	for (String button : button05s) {
			        		if (!button.replace(" ", "").equals("")) {
			        			button05.setPosition(a);
				        		button05.setValue(button);	
			        		}
			        		a++;
			        	}
			        	st_submit.getButtonData5().add(button05);
		        	}
		        	
		        }
		        a = 1;
		        if (!info.getPbxButton06().equals("")  ) {
		        	String[] button06s = info.getPbxButton06().split(",");
		        	if (button06s.length > 0) {
		        		ArrayType button06 = objectFactory.createArrayType();
			        	for (String button : button06s) {
			        		if (!button.replace(" ", "").equals("")) {
			        			button06.setPosition(a);
				        		button06.setValue(button);	
			        		}
			        		a++;
			        	}
			        	st_submit.getButtonData6().add(button06);
		        	}
		        	
		        }
		        a = 1;
		        if (!info.getPbxButton07().equals("")  ) {
		        	String[] button07s = info.getPbxButton07().split(",");
		        	if (button07s.length > 0) {
		        		ArrayType button07 = objectFactory.createArrayType();
			        	for (String button : button07s) {
			        		if (!button.replace(" ", "").equals("")) {
			        			button07.setPosition(a);
				        		button07.setValue(button);	
			        		}
			        		a++;
			        	}
			        	st_submit.getButtonData7().add(button07);
		        	}
		        	
		        }
		        
		        st_submit.setExtension(info.getExtension());
		        st_submit.setType(info.getType());
		        st_submit.setCOR(info.getCor());
		        st_submit.setCOS(info.getCos());
		        st_submit.setName(info.getName());
		        st_submit.setSecurityCode(info.getSecurityCode());
		        st_submit.setDisplayLanguage(info.getPbxDisplayLangage());
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
				  System.out.println("ModelType: " + mType + " could not be loaded! Please verify this is a valid model.");
				  System.out.println(cnf.getMessage()); 
				  faultRaised = true; 
			 } catch (Exception soapE) {
				System.out.println("A SOAP fault was raised: ");

				System.out.println("Cause: " + soapE.getCause());
				System.out.println("Message: " + soapE );

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
					System.out.println("The request returned an error (result_code == "+ result.getResultCode() + ")"); 
					System.out.println("result_data == " + '"' + result.getResultData() + '"');
					System.out.println("message_text == " + result.getMessageText() ); }
				 
			}
			
			return result;

		}
		private Result submitAgentRequest(String model, String sFIELDS, String sObjectName, String sOperation, PbxMemberInfo info) {
			
			// Initialize Types
			Result result = null;
			String mType = WEB_REFERENCE_PACKAGE + "." + model + "Type";			
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
				com.avaya.smsxml.ModelChoices mf_add = objectFactory.createModelChoices();//
		        AgentType ag_submit =objectFactory.createAgentType();
		        
		        
		        
		        for (pbxType sn :   info.getSn()) {
		        	ArrayType sn_list = objectFactory.createArrayType();
		            
		            sn_list.setPosition(sn.getIndex());
		            sn_list.setValue(sn.getValue());
		            ag_submit.getSN().add(sn_list);
		            
		        }
		        for (pbxType sr :   info.getSr()) {
		        	ArrayType sr_list = objectFactory.createArrayType();
		        	sr_list.setPosition(sr.getIndex());
			        sr_list.setValue(sr.getValue());
			        ag_submit.getSL().add(sr_list);
		        }
	            
	            
	            
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
				  System.out.println("ModelType: " + mType + " could not be loaded! Please verify this is a valid model.");
				  System.out.println(cnf.getMessage()); 
				  faultRaised = true; 
			 } catch (Exception soapE) {
				// A fault was raised. The fault message will contain the
				// explanation
				System.out.println("A SOAP fault was raised: ");

				System.out.println("Cause: " + soapE.getCause());
				System.out.println("Message: " + soapE );

				faultRaised = true;
			 }
			
			// If we got a result (not a fault) then we'll show it
			if (!faultRaised) {
				
				  // The result code indicates success or failure (CM rejected the request) 
				if (result.getResultCode() == 0) { 
					System.out.println("The request was successful (result_code == 0)");
					ModelChoices mc = result.getResultData(); 
					
					// Is result null 
					if (mc != null) { 
						printResult(mc, model); 
					} 
				}else { 
					
					faultRaised = true; 
					// In case CM rejected the request, the message text will contain CM's explanation
					System.out.println("The request returned an error (result_code == "+ result.getResultCode() + ")"); 
					System.out.println("result_data == " + '"' + result.getResultData() + '"');
					System.out.println("message_text == " + result.getMessageText() ); }
				 
			}
			
			return result;

		}
		private Result submitRequest(String model, String sFIELDS, String sObjectName, String sOperation, String sQUALIFIER) {
	
			// Initialize Types
			Result result = null;
			String mType = WEB_REFERENCE_PACKAGE + "." + model + "Type";			
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
				  System.out.println("ModelType: " + mType + " could not be loaded! Please verify this is a valid model.");
				  System.out.println(cnf.getMessage()); 
				  faultRaised = true; 
			 } catch (Exception soapE) {
				// A fault was raised. The fault message will contain the
				// explanation
				System.out.println("A SOAP fault was raised: ");

				System.out.println("Cause: " + soapE.getCause());
				System.out.println("Message: " + soapE );

				faultRaised = true;
			 }
			
			// If we got a result (not a fault) then we'll show it
			if (!faultRaised) {
				
				  // The result code indicates success or failure (CM rejected the request) 
				if (result.getResultCode() == 0) { 
					System.out.println("The request was successful (result_code == 0)");
					ModelChoices mc = result.getResultData(); 
					
					// Is result null 
					if (mc != null) { 
						// We'll use a routine to illustrate processing the return values
						printResult(mc, model); 
					} 
				} else { 
					
					faultRaised = true; 
					// In case CM rejected the request, the message text will contain CM's explanation
				System.out.println("The request returned an error (result_code == "+ result.getResultCode() + ")"); 
				System.out.println("result_data == " + '"' + result.getResultData() + '"');
				System.out.println("message_text == " + result.getMessageText() ); }
				 
			}
			
			return result;

		}
		

		// **************************************************************************
		// Step 3: manageSession()
		// **************************************************************************
		/**
		 * Obtains the sessionID from a valid response and copies into the request
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
			System.out.println("\nReleasing SessionID[" + requestSID + "]...");

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
				System.out.println("A SOAP fault was raised during the release call: " + re);
				return;
			}

			System.out.println("The SMS session was released.  result_code=" + result.getReturn().getResultCode());
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
				System.out.println("Exception ===================");
				System.out.println(e.getMessage());
				
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
		  
				  if (format.equals(FORMAT_XML)) { 
				      
					  // Serialize Resulting modelChoice
					  Marshaller marshaller = modelContext.createMarshaller();
					  marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
					  
					  System.out.println("-----------------XML-----------------\r\n");
					  marshaller.marshal( new JAXBElement(new QName(SMS_NS,"ModelChoices"),modelChoicesClass,mc), 
							  				System.out);
					 
					  System.out.println();
					  System.out.println("-------------------------------------\r\n"); 
				  } 
				  else { 
					  // Find the returnTypes getter methods and invoke
					  System.out.println("\r\n---------------------------------------\r\n");
					  for (int i = 0; i < resultLength; i++) { 
						  Class<?> resultType = resultObjectArray.get(i).getClass();
						  Method[] mi = resultType.getMethods();
		 
						  System.out.println("ResultObject = " + resultType.getName() + "[" + i + "]");
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
										  System.out.println(vName + " = " + '"' + value +'"');
									  else if( vType.getName().equals("java.util.List") )
									  {
										  ArrayList<ArrayType> valueAL = (ArrayList<ArrayType>) value;
										  for(int k=0; k < valueAL.size(); k++)
										  {
											  ArrayType v = valueAL.get(k);
											  if(v != null)
											  {
												  System.out.println(vName + "[" + v.getPosition() +"] = " + '"' 
														  + v.getValue() +'"');
											  }
										  }
										  
									  }
									  else {	
										 // Skip unknown type
									  }
									  
								   } 
							  	} 
							}// End Foreach
		  
						  	 System.out.println("---------------------------------------\r\n");
		  
					  	}// End For-loop
					  } 
				  } // End if null
			  else { System.out.println("There were no Items to display!"); 
			  }
			} catch (JAXBException je){
				System.out.println("An error occured while marshalling the result object ");
				je.printStackTrace();
				faultRaised = true;
			} catch (Exception e){
				e.printStackTrace();
			}
	    }
		
		// Load Properties
		public boolean loadProps(String models, String sFIELDS, String sOPERATION, String sQUALIFIER ) {
			URL appURL = null;
			System.out.println("===================");
			System.out.println("sFIELDS:" + sFIELDS);
			System.out.println("===================");
			try {
				this.cl = this.getClass().getClassLoader();
				if (cl != null){
					appURL = cl.getResource("stringnotation.properties");
				 }
				 else {
					appURL = ClassLoader.getSystemResource("stringnotation.properties");
				 }
				
				// Get common properties
		        Properties appProp = new Properties();
		        appProp.load(appURL.openStream());
		        String tmp = "";
		        
		        tmp = appProp.getProperty(ROOT);
		        if(tmp != null)
		        {this.root = tmp.trim();}
		        tmp = appProp.getProperty(LOGIN);
		        if(tmp != null)
		        {this.login = tmp.trim();}
		        tmp = appProp.getProperty(PASSWORD);
		        if(tmp != null)
		        {this.pw = tmp.trim();}
		        tmp = appProp.getProperty(OUTPUT_FORMAT);
		        if(tmp != null)
		        {this.format = tmp.trim();}
	        	tmp = appProp.getProperty(models);
		  	    if(tmp != null)
		  	    {this.model = tmp.trim();}
		  	    tmp = appProp.getProperty(sFIELDS);
		  	    if(tmp != null)
		  	    {this.fields = tmp.trim();}
		  	    tmp = appProp.getProperty(sOPERATION);
	  	        if(tmp != null)
	  	        {this.operation = tmp.trim();}
	 	        tmp = appProp.getProperty(sQUALIFIER);
	  	        if(tmp != null)
	  	        {this.qualifier = tmp.trim();}
	  	        tmp = appProp.getProperty(OBJECTNAME);
	  	        if(tmp != null)
	  	        {
	  	        	// Not currently using objectname
	  	        }
	  	        
			 } catch (IllegalArgumentException arge) { 
				  // A fault was raised. The fault message will contain the explanation
				  System.out.println(arge.getMessage());
				  System.out.println("Please verify that stringnotation.properties file exists " +
						  			 "in the resources directory and has the proper read permission!");
				  return false; 
			 } catch (Exception e) {
				System.out.println(e.getMessage());
				return false;
			}
			return true;
		}

}
