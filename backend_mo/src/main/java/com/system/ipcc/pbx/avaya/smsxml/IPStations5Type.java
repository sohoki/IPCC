
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPStations5Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPStations5Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Reset_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reset_Type_Option" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Starting_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ending_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Network_Region_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPStations5Type", propOrder = {
    "resetType",
    "phoneType",
    "resetTypeOption",
    "startingIPAddress",
    "endingIPAddress",
    "ipNetworkRegionNumber"
})
public class IPStations5Type {

    @XmlElement(name = "Reset_Type")
    protected String resetType;
    @XmlElement(name = "Phone_Type")
    protected String phoneType;
    @XmlElement(name = "Reset_Type_Option")
    protected String resetTypeOption;
    @XmlElement(name = "Starting_IP_Address")
    protected String startingIPAddress;
    @XmlElement(name = "Ending_IP_Address")
    protected String endingIPAddress;
    @XmlElement(name = "IP_Network_Region_Number")
    protected String ipNetworkRegionNumber;

    /**
     * Gets the value of the resetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetType() {
        return resetType;
    }

    /**
     * Sets the value of the resetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetType(String value) {
        this.resetType = value;
    }

    /**
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneType(String value) {
        this.phoneType = value;
    }

    /**
     * Gets the value of the resetTypeOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetTypeOption() {
        return resetTypeOption;
    }

    /**
     * Sets the value of the resetTypeOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetTypeOption(String value) {
        this.resetTypeOption = value;
    }

    /**
     * Gets the value of the startingIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingIPAddress() {
        return startingIPAddress;
    }

    /**
     * Sets the value of the startingIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingIPAddress(String value) {
        this.startingIPAddress = value;
    }

    /**
     * Gets the value of the endingIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndingIPAddress() {
        return endingIPAddress;
    }

    /**
     * Sets the value of the endingIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndingIPAddress(String value) {
        this.endingIPAddress = value;
    }

    /**
     * Gets the value of the ipNetworkRegionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPNetworkRegionNumber() {
        return ipNetworkRegionNumber;
    }

    /**
     * Sets the value of the ipNetworkRegionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPNetworkRegionNumber(String value) {
        this.ipNetworkRegionNumber = value;
    }

}
