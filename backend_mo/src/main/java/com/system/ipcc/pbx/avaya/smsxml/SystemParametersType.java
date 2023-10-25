
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Authorization_Codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Hoteling_Application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemParametersType", propOrder = {
    "authorizationCodes",
    "ipHotelingApplication"
})
public class SystemParametersType {

    @XmlElement(name = "Authorization_Codes")
    protected String authorizationCodes;
    @XmlElement(name = "IP_Hoteling_Application")
    protected String ipHotelingApplication;

    /**
     * Gets the value of the authorizationCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCodes() {
        return authorizationCodes;
    }

    /**
     * Sets the value of the authorizationCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCodes(String value) {
        this.authorizationCodes = value;
    }

    /**
     * Gets the value of the ipHotelingApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPHotelingApplication() {
        return ipHotelingApplication;
    }

    /**
     * Sets the value of the ipHotelingApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPHotelingApplication(String value) {
        this.ipHotelingApplication = value;
    }

}
