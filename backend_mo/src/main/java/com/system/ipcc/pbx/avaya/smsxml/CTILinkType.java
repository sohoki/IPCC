
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTILinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTILinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CTI_Link" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Event_Minimization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RestrictedNumSpecialChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrdgAppDisconnectEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTILinkType", propOrder = {
    "ctiLink",
    "extension",
    "port",
    "type",
    "name",
    "cor",
    "eventMinimization",
    "restrictedNumSpecialChar",
    "brdgAppDisconnectEvent"
})
public class CTILinkType {

    @XmlElement(name = "CTI_Link")
    protected String ctiLink;
    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "COR")
    protected String cor;
    @XmlElement(name = "Event_Minimization")
    protected String eventMinimization;
    @XmlElement(name = "RestrictedNumSpecialChar")
    protected String restrictedNumSpecialChar;
    @XmlElement(name = "BrdgAppDisconnectEvent")
    protected String brdgAppDisconnectEvent;

    /**
     * Gets the value of the ctiLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTILink() {
        return ctiLink;
    }

    /**
     * Sets the value of the ctiLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTILink(String value) {
        this.ctiLink = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the cor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOR() {
        return cor;
    }

    /**
     * Sets the value of the cor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOR(String value) {
        this.cor = value;
    }

    /**
     * Gets the value of the eventMinimization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventMinimization() {
        return eventMinimization;
    }

    /**
     * Sets the value of the eventMinimization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventMinimization(String value) {
        this.eventMinimization = value;
    }

    /**
     * Gets the value of the restrictedNumSpecialChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictedNumSpecialChar() {
        return restrictedNumSpecialChar;
    }

    /**
     * Sets the value of the restrictedNumSpecialChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictedNumSpecialChar(String value) {
        this.restrictedNumSpecialChar = value;
    }

    /**
     * Gets the value of the brdgAppDisconnectEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrdgAppDisconnectEvent() {
        return brdgAppDisconnectEvent;
    }

    /**
     * Sets the value of the brdgAppDisconnectEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrdgAppDisconnectEvent(String value) {
        this.brdgAppDisconnectEvent = value;
    }

}
