
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AESvcsCTILinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AESvcsCTILinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CTI_Link" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mnt_Busy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Msgs_Sent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Msgs_Received" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AESvcsCTILinkType", propOrder = {
    "ctiLink",
    "version",
    "mntBusy",
    "server",
    "serviceState",
    "msgsSent",
    "msgsReceived"
})
public class AESvcsCTILinkType {

    @XmlElement(name = "CTI_Link")
    protected String ctiLink;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Mnt_Busy")
    protected String mntBusy;
    @XmlElement(name = "Server")
    protected String server;
    @XmlElement(name = "Service_State")
    protected String serviceState;
    @XmlElement(name = "Msgs_Sent")
    protected String msgsSent;
    @XmlElement(name = "Msgs_Received")
    protected String msgsReceived;

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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the mntBusy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntBusy() {
        return mntBusy;
    }

    /**
     * Sets the value of the mntBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntBusy(String value) {
        this.mntBusy = value;
    }

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServer(String value) {
        this.server = value;
    }

    /**
     * Gets the value of the serviceState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceState() {
        return serviceState;
    }

    /**
     * Sets the value of the serviceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceState(String value) {
        this.serviceState = value;
    }

    /**
     * Gets the value of the msgsSent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgsSent() {
        return msgsSent;
    }

    /**
     * Sets the value of the msgsSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgsSent(String value) {
        this.msgsSent = value;
    }

    /**
     * Gets the value of the msgsReceived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgsReceived() {
        return msgsReceived;
    }

    /**
     * Sets the value of the msgsReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgsReceived(String value) {
        this.msgsReceived = value;
    }

}
