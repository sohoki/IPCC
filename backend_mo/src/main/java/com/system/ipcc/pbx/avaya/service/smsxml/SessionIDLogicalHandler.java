/*******************************************************************************
 * Title: SessionIDLogicalHandler.java
 *
 * $Created By: greway $
 * $Revision: 1.0 $
 *
 * Copyright: Copyright (c) 2008 AVAYA, Inc.
 *
 * $Id: SMSXMLTest.java, v 1.0 06/30/2008 12:54:32 greway $
 * 
 ******************************************************************************/

package com.system.ipcc.pbx.avaya.service.smsxml;

import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;


/*******************************************************************************
 * The SessionIDLogicHandler class is added to the Binding Providers Handler
 * Chain in the sample application.  This allows the SMS application to set the 
 * SessionID SOAP Header before the submitRequest is sent to the SMS server 
 * and gives the application access to the SessionID SOAP Header in the 
 * submitRequestResponse. 
 * 
 * @author greway
 *******************************************************************************/

@SuppressWarnings("unchecked")
public class SessionIDLogicalHandler implements
			SOAPHandler<SOAPMessageContext> {

		private String SID = "";
		private SOAPFactory factory;
		private String SESSION_NS = "http://xml.avaya.com/ws/session";


		public boolean handleMessage(SOAPMessageContext context) {

			boolean outbound = ((Boolean) context
					.get(SOAPMessageContext.MESSAGE_OUTBOUND_PROPERTY));
			if (outbound) {
				addSoapHeader(context);
			} else {
				getSoapHeader(context);
			}
			return true;

		}

		public boolean handleFault(SOAPMessageContext context) {
			SOAPMessage soapMsg = context.getMessage();
			SOAPBody body;
			try {
				body = soapMsg.getSOAPBody();
			} catch (SOAPException e) {
				e.printStackTrace();
				return false;
			}
			SOAPFault fault = body.getFault();
			if (fault != null) {
				System.err.println("\n---> SOAP message: "
						+ getMsgAsString(soapMsg));
				System.err.println("---> FAULT: " + fault.getFaultString());
				System.err.println("---> FAULT CODE: " + fault.getFaultCode());
				// We're done processing; throw a runtime exception
				throw new RuntimeException(fault.toString());
			}
			return true;
		}

		public void close(MessageContext context) {
			// Clean up Resources
		}

		private String getMsgAsString(SOAPMessage message) {
			String msg = null;
			try {
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				message.writeTo(baos);
				msg = baos.toString();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return msg;
		}

		private void addSoapHeader(SOAPMessageContext context) {
			try {
				
				if (factory ==null)
	            {
	                factory = SOAPFactory.newInstance();
	            }

				SOAPMessage soapMsg = context.getMessage();
				SOAPPart soapPart = soapMsg.getSOAPPart();
				SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
				SOAPHeader soapHeader = soapEnvelope.getHeader();
				
				SOAPElement sessionElem = factory.createElement(new QName(SESSION_NS, "sessionID"));
				sessionElem.setValue(this.SID);


				// Now add header info
				if (soapHeader == null) {
					soapHeader = soapEnvelope.addHeader();
					soapHeader.addChildElement(sessionElem);
				} else{
					Iterator<SOAPElement> itr = soapHeader.getChildElements();
					while (itr.hasNext()) {
					itr.next().setValue(this.SID);
					}
				}

			} catch (Exception e) {
				throw new RuntimeException("Cannot add SOAP header", e);
			}

		}

		private void getSoapHeader(SOAPMessageContext context) {
			try {

				SOAPMessage soapMsg = context.getMessage();
				SOAPPart soapPart = soapMsg.getSOAPPart();
				SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
				SOAPHeader soapHeader = soapEnvelope.getHeader();

				Iterator<SOAPElement> headers = soapHeader.getChildElements();
				while (headers.hasNext()) {
					this.SID = headers.next().getValue();
				}

			} catch (Exception e) {
				throw new RuntimeException("Cannot get SOAP header", e);
			}
		}

		public Set<QName> getHeaders() {
			//Auto-generated method stub
			return null;
		}

		// Getters/Setters
		public void setSID(String sid) {
			this.SID = sid;
		}

		public String getSID() {
			return this.SID;
		}	
}