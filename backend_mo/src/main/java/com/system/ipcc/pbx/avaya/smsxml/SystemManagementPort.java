
package com.system.ipcc.pbx.avaya.smsxml;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SystemManagementPort", targetNamespace = "http://xml.avaya.com/ws/SystemManagementService/2008/07/01")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SystemManagementPort {


    /**
     * 
     * @param modelFields
     * @param qualifier
     * @param objectname
     * @param operation
     * @return
     *     returns com.system.ipcc.pbx.avaya.smsxml.Result
     */
    @WebMethod(action = "http://xml.avaya.com/ws/SystemManagementService/2008/07/01#soap_webservice#submitRequest")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "submitRequest", targetNamespace = "http://xml.avaya.com/ws/SystemManagementService/2008/07/01", className = "com.system.ipcc.pbx.avaya.smsxml.SubmitRequestType")
    @ResponseWrapper(localName = "submitRequestResponse", targetNamespace = "http://xml.avaya.com/ws/SystemManagementService/2008/07/01", className = "com.system.ipcc.pbx.avaya.smsxml.ReturnType")
    public Result submitRequest(
        @WebParam(name = "modelFields", targetNamespace = "")
        ModelChoices modelFields,
        @WebParam(name = "operation", targetNamespace = "")
        String operation,
        @WebParam(name = "objectname", targetNamespace = "")
        String objectname,
        @WebParam(name = "qualifier", targetNamespace = "")
        String qualifier);

    /**
     * 
     * @param body
     * @return
     *     returns com.system.ipcc.pbx.avaya.smsxml.ReturnType
     */
    @WebMethod(action = "http://xml.avaya.com/ws/SystemManagementService/2008/07/01#soap_webservice#release")
    @WebResult(name = "releaseResponse", targetNamespace = "http://xml.avaya.com/ws/SystemManagementService/2008/07/01", partName = "return")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public ReturnType release(
        @WebParam(name = "release", targetNamespace = "http://xml.avaya.com/ws/SystemManagementService/2008/07/01", partName = "body")
        String body);

}
