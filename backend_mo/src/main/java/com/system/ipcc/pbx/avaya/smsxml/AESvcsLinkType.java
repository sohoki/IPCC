
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AESvcsLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AESvcsLinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Server_Link" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Local_Node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AESvcsLinkType", propOrder = {
    "serverLink",
    "server",
    "remoteIP",
    "remotePort",
    "localNode",
    "msgsSent",
    "msgsReceived"
})
public class AESvcsLinkType {

    @XmlElement(name = "Server_Link")
    protected String serverLink;
    @XmlElement(name = "Server")
    protected String server;
    @XmlElement(name = "Remote_IP")
    protected String remoteIP;
    @XmlElement(name = "Remote_Port")
    protected String remotePort;
    @XmlElement(name = "Local_Node")
    protected String localNode;
    @XmlElement(name = "Msgs_Sent")
    protected String msgsSent;
    @XmlElement(name = "Msgs_Received")
    protected String msgsReceived;

    /**
     * Gets the value of the serverLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerLink() {
        return serverLink;
    }

    /**
     * Sets the value of the serverLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerLink(String value) {
        this.serverLink = value;
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
     * Gets the value of the remoteIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteIP() {
        return remoteIP;
    }

    /**
     * Sets the value of the remoteIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteIP(String value) {
        this.remoteIP = value;
    }

    /**
     * Gets the value of the remotePort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemotePort() {
        return remotePort;
    }

    /**
     * Sets the value of the remotePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemotePort(String value) {
        this.remotePort = value;
    }

    /**
     * Gets the value of the localNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalNode() {
        return localNode;
    }

    /**
     * Sets the value of the localNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalNode(String value) {
        this.localNode = value;
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
