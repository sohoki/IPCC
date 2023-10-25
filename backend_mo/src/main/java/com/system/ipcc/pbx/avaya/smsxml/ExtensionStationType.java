
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtensionStationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtensionStationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Extension_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extension_To_Message_Lamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extension_To_Emer_Loc_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionStationType", propOrder = {
    "extensionTo",
    "extensionToMessageLamp",
    "extensionToEmerLocExt"
})
public class ExtensionStationType {

    @XmlElement(name = "Extension_To")
    protected String extensionTo;
    @XmlElement(name = "Extension_To_Message_Lamp")
    protected String extensionToMessageLamp;
    @XmlElement(name = "Extension_To_Emer_Loc_Ext")
    protected String extensionToEmerLocExt;

    /**
     * Gets the value of the extensionTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionTo() {
        return extensionTo;
    }

    /**
     * Sets the value of the extensionTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionTo(String value) {
        this.extensionTo = value;
    }

    /**
     * Gets the value of the extensionToMessageLamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionToMessageLamp() {
        return extensionToMessageLamp;
    }

    /**
     * Sets the value of the extensionToMessageLamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionToMessageLamp(String value) {
        this.extensionToMessageLamp = value;
    }

    /**
     * Gets the value of the extensionToEmerLocExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionToEmerLocExt() {
        return extensionToEmerLocExt;
    }

    /**
     * Sets the value of the extensionToEmerLocExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionToEmerLocExt(String value) {
        this.extensionToEmerLocExt = value;
    }

}
