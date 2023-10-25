
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialApplicationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialApplicationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "SpecialApplicationsType", propOrder = {
    "ipHotelingApplication"
})
public class SpecialApplicationsType {

    @XmlElement(name = "IP_Hoteling_Application")
    protected String ipHotelingApplication;

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
