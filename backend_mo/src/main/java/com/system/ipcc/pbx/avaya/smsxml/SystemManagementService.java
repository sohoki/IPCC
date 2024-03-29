
package com.system.ipcc.pbx.avaya.smsxml;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "SystemManagementService", targetNamespace = "http://xml.avaya.com/ws/SystemManagementService/2008/07/01", wsdlLocation = "file:/work/mvcs-ws/localbuild/10.1-SP_AESBuild/aesvcs/sms/build/sdkstaging/smssvc/example/resources/wsdl_xml/SystemManagementService.wsdl")
public class SystemManagementService
    extends Service
{

    private final static URL SYSTEMMANAGEMENTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.system.ipcc.pbx.avaya.smsxml.SystemManagementService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.system.ipcc.pbx.avaya.smsxml.SystemManagementService.class.getResource(".");
            url = new URL(baseUrl, "file:/work/mvcs-ws/localbuild/10.1-SP_AESBuild/aesvcs/sms/build/sdkstaging/smssvc/example/resources/wsdl_xml/SystemManagementService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/work/mvcs-ws/localbuild/10.1-SP_AESBuild/aesvcs/sms/build/sdkstaging/smssvc/example/resources/wsdl_xml/SystemManagementService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SYSTEMMANAGEMENTSERVICE_WSDL_LOCATION = url;
    }

    public SystemManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SystemManagementService() {
        super(SYSTEMMANAGEMENTSERVICE_WSDL_LOCATION, new QName("http://xml.avaya.com/ws/SystemManagementService/2008/07/01", "SystemManagementService"));
    }

    /**
     * 
     * @return
     *     returns SystemManagementPort
     */
    @WebEndpoint(name = "SystemManagementPort")
    public SystemManagementPort getSystemManagementPort() {
        return super.getPort(new QName("http://xml.avaya.com/ws/SystemManagementService/2008/07/01", "SystemManagementPort"), SystemManagementPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SystemManagementPort
     */
    @WebEndpoint(name = "SystemManagementPort")
    public SystemManagementPort getSystemManagementPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://xml.avaya.com/ws/SystemManagementService/2008/07/01", "SystemManagementPort"), SystemManagementPort.class, features);
    }

}
