
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPRegTTIType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPRegTTIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="New_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Old_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAC_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPRegTTIType", propOrder = {
    "newExtension",
    "oldExtension",
    "macAddress"
})
public class IPRegTTIType {

    @XmlElement(name = "New_Extension")
    protected String newExtension;
    @XmlElement(name = "Old_Extension")
    protected String oldExtension;
    @XmlElement(name = "MAC_Address")
    protected String macAddress;

    /**
     * Gets the value of the newExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewExtension() {
        return newExtension;
    }

    /**
     * Sets the value of the newExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewExtension(String value) {
        this.newExtension = value;
    }

    /**
     * Gets the value of the oldExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldExtension() {
        return oldExtension;
    }

    /**
     * Sets the value of the oldExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldExtension(String value) {
        this.oldExtension = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMACAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMACAddress(String value) {
        this.macAddress = value;
    }

}
