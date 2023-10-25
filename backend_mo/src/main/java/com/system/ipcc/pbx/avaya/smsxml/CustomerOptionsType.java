
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Authorization_Codes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Media_Encryption_Over_IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Personal_Station_Access" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Terminal_Trans_Init" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Concurrently_Registered_IP_Stations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOptionsType", propOrder = {
    "authorizationCodes",
    "mediaEncryptionOverIP",
    "personalStationAccess",
    "terminalTransInit",
    "maximumConcurrentlyRegisteredIPStations"
})
public class CustomerOptionsType {

    @XmlElement(name = "Authorization_Codes")
    protected String authorizationCodes;
    @XmlElement(name = "Media_Encryption_Over_IP")
    protected String mediaEncryptionOverIP;
    @XmlElement(name = "Personal_Station_Access")
    protected String personalStationAccess;
    @XmlElement(name = "Terminal_Trans_Init")
    protected String terminalTransInit;
    @XmlElement(name = "Maximum_Concurrently_Registered_IP_Stations")
    protected String maximumConcurrentlyRegisteredIPStations;

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
     * Gets the value of the mediaEncryptionOverIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaEncryptionOverIP() {
        return mediaEncryptionOverIP;
    }

    /**
     * Sets the value of the mediaEncryptionOverIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaEncryptionOverIP(String value) {
        this.mediaEncryptionOverIP = value;
    }

    /**
     * Gets the value of the personalStationAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalStationAccess() {
        return personalStationAccess;
    }

    /**
     * Sets the value of the personalStationAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalStationAccess(String value) {
        this.personalStationAccess = value;
    }

    /**
     * Gets the value of the terminalTransInit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalTransInit() {
        return terminalTransInit;
    }

    /**
     * Sets the value of the terminalTransInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalTransInit(String value) {
        this.terminalTransInit = value;
    }

    /**
     * Gets the value of the maximumConcurrentlyRegisteredIPStations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumConcurrentlyRegisteredIPStations() {
        return maximumConcurrentlyRegisteredIPStations;
    }

    /**
     * Sets the value of the maximumConcurrentlyRegisteredIPStations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumConcurrentlyRegisteredIPStations(String value) {
        this.maximumConcurrentlyRegisteredIPStations = value;
    }

}
