/*******************************************************************************
 * Title: SMSRequest.java
 *
 * $Author: greway $
 * $Revision: 1.2 $
 *
 * Copyright: Copyright (c) 2008 AVAYA, Inc.
 *
 ******************************************************************************/

//******************************************************************************
// Package
//******************************************************************************
package com.system.ipcc.pbx.avaya.service.smsxml;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.Binding;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.handler.Handler;

import com.system.ipcc.pbx.avaya.smsxml.ModelChoices;
import com.system.ipcc.pbx.avaya.smsxml.SystemManagementPort;
import com.system.ipcc.pbx.avaya.smsxml.SystemManagementService;

import lombok.extern.slf4j.Slf4j;

import com.system.ipcc.pbx.avaya.smsxml.SubmitRequestType;
import com.system.ipcc.pbx.avaya.smsxml.Result;
import com.system.ipcc.pbx.avaya.smsxml.ReturnType;
import com.sun.xml.ws.developer.WSBindingProvider;

//******************************************************************************
// SMSRequest
//******************************************************************************
/**
 * This class is a variation of the SMSTest class and demonstrates slightly more
 * sophisticated handling of SMS requests
 *
 * As a sample application, if provides methods to list the AEServices servers configured
 * on a given CM server, as well as to add and enable or disable servers.
 *
 * @author AVAYA, Inc.
 */
@Slf4j
@SuppressWarnings("unchecked")
public class SMSRequest{

	// connection parameters
	private String root = "";
	private String login = "";
	private String pw = "";
	
	// request parameters
	private ModelChoices modelFields;
	private String modelName;
	private String operation;
	private String qualifier;
	
	// JAX-WS binding stub 
	private SystemManagementService sms;
	private SystemManagementPort port;
	private WSBindingProvider bp;
	
	// Keep reference to the sessionHeader element, as it is also used
	// across requests
	private String requestSID = "";
	private String responseSID = "";
	private SessionIDLogicalHandler SIDHandler = null;

	private static String WS_DEFAULT_NAMESPACE="http://xml.avaya.com/ws/SystemManagementService/2008/07/01";
	
	private boolean faultRaised = false;
	private boolean sessionInitialized = false;
	private boolean sessionOk = false;
	
	// Request data
	private String faultString;      // populated on faults and errors
	private boolean bSuccess = true; // set based on results of last executed request
	ModelChoices smsData = null;
	
	public SMSRequest( String root, String login, String pw ){
		this.root = root;
		this.login = login;
		this.pw = pw;
		smsData = null;
	}

	/**************************************************************************
	/ execRequest
	/**************************************************************************
	**
	* Illustrates the usage of SMS, by performing the following steps:
	*   1.  Initial setup of SOAP binding, session management
	*   2.  Submitting a request to SMS and obtaining the result
	*   3.  Doing session "bookkeeping" after the request
	*   4.  This version defers the release call, allowing additional
	*       requests to be submitted on the same session
	*       The tradeoff is that callers MUST remember to call the
	*       releaseSession method when done submitting commands.
	*/
	public void execRequest( ModelChoices modelFields, String operation, String qualifier ) throws Exception{
		// Step 1: Initial SOAP setup, done once (typically) per session.
		if ( ! setup() )
			return; // we failed and we're done
		
		this.modelFields = modelFields;
		this.operation = operation;
		this.qualifier = qualifier == null ? "" : qualifier;
		this.modelName = findModel(modelFields);
		
		// Step 2: Submit a request to SMS and obtain the response.
		// The initial request will establish an SMS session implicitly.
		this.submitRequest();
		
		// Step 3: Bookkeeping -- carry forward any session information returned in the response header
		this.manageSession();
	
	}



	/**************************************************************************
	/ Step 1: setup()
	/**************************************************************************
	**
	* Performs initial setup of SOAP port/binding
	*
	*/
	boolean setup(){
		
		if ( sessionInitialized ){
			return sessionOk;
		}
	
		sessionInitialized = true;
		
		try
		{
			// Service QName for Static Service instance
			QName serviceName = new QName(WS_DEFAULT_NAMESPACE,"SystemManagementService");
			
			// Specify End-Point URL 
			String endpoint = new URL(root + "/smsxml/SystemManagementService.php").toString();
	
			// Create a static Service instance -- Avoid network overhead by using a local 
			// copy of the WSDL
			URL localWSDL = ClassLoader.getSystemResource("wsdl_xml/SystemManagementService.wsdl");
			
			sms = new SystemManagementService(localWSDL, serviceName);
			
			// Bind to a port
			port = sms.getSystemManagementPort();
			bp = (WSBindingProvider) port;
			
			// Configure RequestContext with endpoint's URL and
			// set the login and credentials in the HTTP authorization header
			Map<String, Object> requestContext = bp.getRequestContext();
			requestContext.put(WSBindingProvider.USERNAME_PROPERTY, login);
			requestContext.put(WSBindingProvider.PASSWORD_PROPERTY, pw);
			requestContext.put(WSBindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
			requestContext.put("com.sun.xml.ws.request.timeout", 10000);
	
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
		}
		catch (WebServiceException ws){
		    System.out.println("Fault generated during SOAP binding: " + ws);
		        return false;  // setup failed
		}catch (MalformedURLException e){
		    System.out.println("Bad URL (" + root + "/sms/SystemManagementService.php); cannot access SMS: " + e );
		    return false;
		}
		
		sessionOk = true;
		return sessionOk; // setup is good
	}

    //**************************************************************************
    // Step 2: submitRequest()
    //**************************************************************************
    /**
     * Submits the SOAP request defined in the SMSTest object to the SMS web service for processing.
     *
     */
	private void submitRequest(){
		Result result = null;  // will hold the request response, unless a fault is raised
		bSuccess = false;      // assume failure unless/until we succeed! (@#%$ pessimists!)
		
		  // Display what we're about to execute
		log.info( login + " is submitting request: [ operation:" + operation + "modelName:" + modelName
		        + " qualifier:" + qualifier + " via " + root + " ]");
		
		  // We track whether a fault was raised, because it affects whether we copy session info from the response header later
		  faultRaised = false;
		
		// Send the SOAP request to SMS running on the AES server
		try
		{
		    // Send the web service request
		    SubmitRequestType req = new SubmitRequestType();
		    req.setModelFields(modelFields);
		    req.setOperation(operation);
		    req.setObjectname("");             // objectname, not presently used
		    req.setQualifier(qualifier);
		
		    result = port.submitRequest(req.getModelFields(),req.getOperation(),
		    							req.getObjectname(),req.getQualifier());
		}
		catch (WebServiceException re)
		{
		    // A fault was raised.  The fault message will contain the explanation
		    log.error("A SOAP fault was raised: " + re);
		    faultRaised = true;
		    faultString = "" + re;
		}
		
		// If we got a result (not a fault) then we'll show it
		if ( ! faultRaised ){
			// The result code indicates success or failure (CM rejected the request)
			smsData = null ;
			if ( result.getResultCode() == 0 ) {
				bSuccess = true;
				log.info( "The request was successful (result_code == 0)" );
				smsData = result.getResultData();
			} else{
				// In case CM rejected the request, the message text will contain CM's explanation
				log.error( "The request returned an error (result_code == 1)" );
				log.error( "Reason: " + result.getMessageText() );
				faultString = result.getMessageText() ;
			}
		}
	
	}

	//**************************************************************************
	// Step 3: manageSession()
	//**************************************************************************
	/**
	 * Obtains the sessionID from a valid response and copies into the request header
	 * sessionID element for the next request
	 *
	 */
	 private void manageSession() {
		// If the last request raised a fault, then there is no session response header, and no change
		// to session management information
		if ( ! faultRaised ){
			// None of the exception conditions below should occur, except in case of programming error
			// In our sample code, we simply print and ignore such conditions.  In a real application
			// handling might involve stopping the application.  Repeated invocation of SMS requests
			// without propagating the sessionID information correctly could result in (temporarily)
			// exhausting all available SMS connections.
			try
			{
				// retrieve resulting session ID from the handler class
				responseSID = SIDHandler.getSID();
				// Copy the sessionID from the responses header back into our
				// request header to be supplied with the next request. This
				// fulfills the client obligation with respect to session
				// management
				requestSID = responseSID;
				SIDHandler.setSID(requestSID);
			}catch(Exception e){
				log.error(" Could not properly manage session ID in SOAP header" + e);
			}
		}
	}

	//**************************************************************************
	// Step 4.  releaseSession()
	//**************************************************************************
	/**
	 * Releases the SMS session
	 */
	public void releaseSession(){
		ReturnType result = null;  // release also returns a result structure
		try{
			// always send a null value for the argument. 
			result = port.release(null);
			// The actual result may be ignored.  If release returns (i.e., does not raise a fault),
			// then it always succeeds, and a result_code of zero is returned.
		}catch (WebServiceException re){
			// A fault was raised.  The fault message will contain the explanation
			log.error("A SOAP fault was raised during the release call: " + re);
			return;
		}
		log.info( "The SMS session was released.  result_code=" + result.getReturn().getResultCode());
	}
	
	// Finds first populated model in a modelFields Object 
	private String findModel(ModelChoices mc) throws Exception {
		Method[] mi = mc.getClass().getMethods();
		for (int j=0; j < mi.length; j++) { 
			String mName = mi[j].getName(); 
			// Only interested in the getter methods
			if(mName.startsWith("get")) { 
				ArrayList<Object> value = (ArrayList<Object>)mi[j].invoke( mc, new Object[] {} );
				if(value.size() > 0) 
					return mName.substring(3);
				
			}
		}
		
		// Otherwise we didn't find any populated models
		return "";
	}

	public ModelChoices getData(){
		return smsData;
	}
	
	public String getFault(){
		return faultString;
	}
	
	public boolean success(){
		return bSuccess;
	}
}
