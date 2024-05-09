/*******************************************************************************
 * Title: StringNotation.java
 *
 * $Created By: greway $
 * $Revision: 1.0 $
 *
 * Copyright: Copyright (c) 2008 AVAYA, Inc.
 *
 * $Id: StringNotation.java, v 1.0 06/30/2008 12:54:32 greway $
 * 
 ******************************************************************************/

package com.system.ipcc.pbx.avaya.service.smsxml;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.ws.Binding;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.handler.Handler;

import com.avaya.smsxml.ArrayType;
import com.avaya.smsxml.ModelChoices;
import com.avaya.smsxml.Result;
import com.avaya.smsxml.ReturnType;
import com.avaya.smsxml.SubmitRequestType;
import com.avaya.smsxml.SystemManagementPort;
import com.avaya.smsxml.SystemManagementService;
import com.sun.xml.ws.developer.WSBindingProvider;

// ******************************************************************************
// smsTestApp
// ******************************************************************************
/**
 * This class submits an SMS request, examines the result, and releases the SMS
 * session.  It has a main() method, and is intended to be invoked from the
 * command line, as a sample SMS application
 * 
 * @author AVAYA, Inc.
 */

@SuppressWarnings("unchecked")
public class StringNotation {

	// Package Namespace
	private static String WEB_REFERENCE_PACKAGE = "com.avaya.smsxml";
	
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
	
	// Set a timeout for the web service response. Here we allow
	// 10,000 MS (10 seconds)
	// AES-16028 We were having issues with timeout in listpublicunknownnumbering
	// So we decided to increase the timeout. By trial & error I am setting it 
	// to 50 seconds now.
	//private Integer responseTimeout = new Integer(50000);
	private final Integer responseTimeout = 50000;
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
	//private static String FORMAT_KEY_VALUE = "key-value";
	
	private String format = FORMAT_XML; // XML is default unless overridden
	
	private static String SMS_NS = "http://xml.avaya.com/sms";

	// Input Delimiter
	private String delimiter = "\\|";
	
	// Property File Values
    private static final String ROOT = "sms.root";
    private static final String LOGIN = "cm.login";
    private static final String PASSWORD = "cm.password";
    private static final String MODEL ="model";
    private static final String FIELDS ="fields";
    private static final String OPERATION ="operation";
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
	 */
	public void execRequest() {
		// Step 1: Initial SOAP setup, done once (typically) per session.
		if (!setup())
			return; // we failed and we're done
		// 
		// Step 2: Submit a request to SMS and obtain the response.
		// The initial request will establish an SMS session implicitly.
		this.submitRequest();

		// Step 3: Bookkeeping -- carry forward any session information
		// returned in the response header
		this.manageSession();

		// A "real" application would very likely go back and repeat steps 2
		// and 3 many times...
		// but we're just going to do...
		// Step 4: Be a well-behaved client and release the SMS session when
		// done with it.
		this.releaseSession();
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
			
			// Create Model JAX-B Context -- 
			// Creation of the JAX-B context is expensive so only create if needed.
			System.out.println("Creating JAXBContext ...");
			modelContext = JAXBContext.newInstance(WEB_REFERENCE_PACKAGE);

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

		} catch (WebServiceException e) {
			System.out.println("WebServiceException occured durring port creation. \r\n"
							+ e.getMessage());
			return false;
		} catch (MalformedURLException e) {
			System.out.println("Bad URL (" + root
					+ "/sms/SystemManagementService.php); cannot access SMS: " + e);
			return false;
		} catch (Exception e) {
			System.out
					.println("An error occured during initial setup; cannot access SMS: " + e);
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
	
	private void submitRequest() {

		// Initialize Types
		Result result = null;
		String mType = WEB_REFERENCE_PACKAGE + "." + model + "Type";

		// We track whether a fault was raised, because it affects whether
		// we copy session info from the response header later
		faultRaised = false;

		// Send the SOAP request to SMS running on the AES server
		try {
			// Create ModelChoice object and Class to set modelFields
			modelClass = Class.forName(mType);
			ModelChoices modelChoices = new ModelChoices();
			modelChoicesClass = modelChoices.getClass();

			String getModel = "get" + model;
		
			Method getModelMethod = modelChoicesClass.getMethod(getModel,new Class[] {});
			List<Object> modelList = (List<Object>) getModelMethod.invoke(modelChoices, new Object[] {});

			// Create an array to hold our model 
			modelList.add(modelClass.newInstance());
			
			// Populate Model Fields
			modelList.set(0, populateFields(modelList.get(0)) );
			
			
			// Using SubmitRequestType to hold our request data 
			submitRequest = new SubmitRequestType();
				
			submitRequest.setModelFields(modelChoices);
			submitRequest.setObjectname(""); // objectname, not presently used
			submitRequest.setOperation(operation);
			submitRequest.setQualifier(qualifier);

			// Display what we're about to execute
			System.out.println("\n" + login + " is submitting request: \n"
					+ "[ " + submitRequest.getOperation() + " " +  model + " ]\n" + "via " + root + "\n");
			
			result = port.submitRequest(submitRequest.getModelFields(), submitRequest.getOperation(),
					                    submitRequest.getObjectname(), submitRequest.getQualifier());

		} catch (ClassNotFoundException cnf) { 
			  // A fault was raised. The fault message will contain the explanation
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
					printResult(mc); 
					} 
				} 
			else { 
				
				faultRaised = true; 
				// In case CM rejected the request, the message text will contain CM's explanation
				System.out.println("The request returned an error (result_code == "+ result.getResultCode() + ")"); 
				System.out.println("result_data == " + '"' + result.getResultData() + '"');
				System.out.println("message_text == " + result.getMessageText() ); }
			 
		}

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

	private Object populateFields(Object Obj) {
		try {
			Class<?> T = Obj.getClass();
			String[] fieldArray = fields.split(delimiter);			
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

							ArrayType[] afv = (ArrayType[]) objectTable.get(fn);
							int currentLength = afv.length;
							afv[currentLength] = arrayElement;
							objectTable.put(fn, afv);
						} else {
							ArrayType[] new_afv = new ArrayType[1];
							new_afv[0] = arrayElement;
							objectTable.put(fn, new_afv);
						}
					} else {
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
					Method mi = T.getMethod(mName);
					// Try to set the vaule if the field exists
					if (mi != null) {
						ArrayType[] val = (ArrayType[]) objectTable.get(key);
						mi.invoke(Obj, (Object[]) val);
						System.out.println("Setting " + key
								+ " Array -- Length of " + val.length);
					} else {
						System.out.println(key + " Element Does Not Exist!");
					}
				}
			}
		} catch (Exception e) {
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
			result = Integer.parseInt(arrayField.substring(pos, arrayField
					.length()
					- (pos + 1)));
		} catch (NumberFormatException e) {
			result = -1;
		}
		return result;
	}

	private String arrayFieldname(String arrayField) {
		int pos = arrayField.lastIndexOf("[");
		return arrayField.substring(0, pos);
	}

	private void printResult(ModelChoices mc) { 
		  // Output result_data values.
		try{
		 String getModel = "get" + model;
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
	public boolean loadProps() {
		URL appURL = null;
	
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
        	tmp = appProp.getProperty(MODEL);
	  	    if(tmp != null)
	  	    {this.model = tmp.trim();}
	  	    tmp = appProp.getProperty(FIELDS);
	  	    if(tmp != null)
	  	    {this.fields = tmp.trim();}
	  	    tmp = appProp.getProperty(OPERATION);
  	        if(tmp != null)
  	        {this.operation = tmp.trim();}
 	        tmp = appProp.getProperty(QUALIFIER);
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


	// **************************************************************************
	// Main()
	// **************************************************************************
	public static void main(String[] args) {

		StringNotation client = new StringNotation();
		// Set up default request parameters
		
		boolean loaded = client.loadProps();
		if ( (!client.isValid()) || !loaded) // any args invalid
		{
			System.out.println("Usage (stringnotation.properties):  sms.root=<http(s)://smshostaddr> cm.login=<cmlogin@cmhostaddr[:port]> cm.password=<cmpassword>");
			return; // 1;
		}

		// Args are valid; Set up client request and execute
		try {
			client.execRequest();
		} catch (Exception e) {
			System.out.println("StringNotation failed with an unexpected exception:");
			return; // 2;
		}

		return; // 0;
	}

}
