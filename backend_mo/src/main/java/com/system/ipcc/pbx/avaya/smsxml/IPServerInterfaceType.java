
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPServerInterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPServerInterfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Port_Network_Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Board_Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pri_IP_or_Socket_Encryption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pri_Host_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pri_DHCP_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Control_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State_Of_Health_CPEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Control" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ignore_Conn_In_Arbitration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enable_Qos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Admin_Second_IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Host" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Host_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DHCP_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Address_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Address_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Address_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Address_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP2_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP2_Address_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP2_Address_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP2_Address_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP2_Address_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qos_CC_8021p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CC_Diff_Serv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cont_Diff_Serv_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cont_Diff_Serv_11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cont_Diff_Serv_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cont_Diff_Serv_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cont_Diff_Serv_21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Cont_Diff_Serv_22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPServerInterfaceType", propOrder = {
    "portNetworkNum",
    "boardLocation",
    "priIPOrSocketEncryption",
    "priHostName",
    "priDHCPID",
    "serviceState",
    "controlState",
    "stateOfHealthCPEG",
    "number",
    "ipControl",
    "ignoreConnInArbitration",
    "enableQos",
    "adminSecondIP",
    "location",
    "location2",
    "host",
    "host2",
    "dhcpid",
    "ipAddress",
    "ipAddress1",
    "ipAddress2",
    "ipAddress3",
    "ipAddress4",
    "ip2Address",
    "ip2Address1",
    "ip2Address2",
    "ip2Address3",
    "ip2Address4",
    "qosCC8021P",
    "ccDiffServ",
    "callContDiffServ1",
    "callContDiffServ11",
    "callContDiffServ12",
    "callContDiffServ2",
    "callContDiffServ21",
    "callContDiffServ22"
})
public class IPServerInterfaceType {

    @XmlElement(name = "Port_Network_Num")
    protected String portNetworkNum;
    @XmlElement(name = "Board_Location")
    protected String boardLocation;
    @XmlElement(name = "Pri_IP_or_Socket_Encryption")
    protected String priIPOrSocketEncryption;
    @XmlElement(name = "Pri_Host_Name")
    protected String priHostName;
    @XmlElement(name = "Pri_DHCP_ID")
    protected String priDHCPID;
    @XmlElement(name = "Service_State")
    protected String serviceState;
    @XmlElement(name = "Control_State")
    protected String controlState;
    @XmlElement(name = "State_Of_Health_CPEG")
    protected String stateOfHealthCPEG;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "IP_Control")
    protected String ipControl;
    @XmlElement(name = "Ignore_Conn_In_Arbitration")
    protected String ignoreConnInArbitration;
    @XmlElement(name = "Enable_Qos")
    protected String enableQos;
    @XmlElement(name = "Admin_Second_IP")
    protected String adminSecondIP;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Location_2")
    protected String location2;
    @XmlElement(name = "Host")
    protected String host;
    @XmlElement(name = "Host_2")
    protected String host2;
    @XmlElement(name = "DHCP_ID")
    protected String dhcpid;
    @XmlElement(name = "IP_Address")
    protected String ipAddress;
    @XmlElement(name = "IP_Address_1")
    protected String ipAddress1;
    @XmlElement(name = "IP_Address_2")
    protected String ipAddress2;
    @XmlElement(name = "IP_Address_3")
    protected String ipAddress3;
    @XmlElement(name = "IP_Address_4")
    protected String ipAddress4;
    @XmlElement(name = "IP2_Address")
    protected String ip2Address;
    @XmlElement(name = "IP2_Address_1")
    protected String ip2Address1;
    @XmlElement(name = "IP2_Address_2")
    protected String ip2Address2;
    @XmlElement(name = "IP2_Address_3")
    protected String ip2Address3;
    @XmlElement(name = "IP2_Address_4")
    protected String ip2Address4;
    @XmlElement(name = "Qos_CC_8021p")
    protected String qosCC8021P;
    @XmlElement(name = "CC_Diff_Serv")
    protected String ccDiffServ;
    @XmlElement(name = "Call_Cont_Diff_Serv_1")
    protected String callContDiffServ1;
    @XmlElement(name = "Call_Cont_Diff_Serv_11")
    protected String callContDiffServ11;
    @XmlElement(name = "Call_Cont_Diff_Serv_12")
    protected String callContDiffServ12;
    @XmlElement(name = "Call_Cont_Diff_Serv_2")
    protected String callContDiffServ2;
    @XmlElement(name = "Call_Cont_Diff_Serv_21")
    protected String callContDiffServ21;
    @XmlElement(name = "Call_Cont_Diff_Serv_22")
    protected String callContDiffServ22;

    /**
     * Gets the value of the portNetworkNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortNetworkNum() {
        return portNetworkNum;
    }

    /**
     * Sets the value of the portNetworkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortNetworkNum(String value) {
        this.portNetworkNum = value;
    }

    /**
     * Gets the value of the boardLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardLocation() {
        return boardLocation;
    }

    /**
     * Sets the value of the boardLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardLocation(String value) {
        this.boardLocation = value;
    }

    /**
     * Gets the value of the priIPOrSocketEncryption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriIPOrSocketEncryption() {
        return priIPOrSocketEncryption;
    }

    /**
     * Sets the value of the priIPOrSocketEncryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriIPOrSocketEncryption(String value) {
        this.priIPOrSocketEncryption = value;
    }

    /**
     * Gets the value of the priHostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriHostName() {
        return priHostName;
    }

    /**
     * Sets the value of the priHostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriHostName(String value) {
        this.priHostName = value;
    }

    /**
     * Gets the value of the priDHCPID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriDHCPID() {
        return priDHCPID;
    }

    /**
     * Sets the value of the priDHCPID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriDHCPID(String value) {
        this.priDHCPID = value;
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
     * Gets the value of the controlState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlState() {
        return controlState;
    }

    /**
     * Sets the value of the controlState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlState(String value) {
        this.controlState = value;
    }

    /**
     * Gets the value of the stateOfHealthCPEG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOfHealthCPEG() {
        return stateOfHealthCPEG;
    }

    /**
     * Sets the value of the stateOfHealthCPEG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOfHealthCPEG(String value) {
        this.stateOfHealthCPEG = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the ipControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPControl() {
        return ipControl;
    }

    /**
     * Sets the value of the ipControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPControl(String value) {
        this.ipControl = value;
    }

    /**
     * Gets the value of the ignoreConnInArbitration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreConnInArbitration() {
        return ignoreConnInArbitration;
    }

    /**
     * Sets the value of the ignoreConnInArbitration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreConnInArbitration(String value) {
        this.ignoreConnInArbitration = value;
    }

    /**
     * Gets the value of the enableQos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableQos() {
        return enableQos;
    }

    /**
     * Sets the value of the enableQos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableQos(String value) {
        this.enableQos = value;
    }

    /**
     * Gets the value of the adminSecondIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminSecondIP() {
        return adminSecondIP;
    }

    /**
     * Sets the value of the adminSecondIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminSecondIP(String value) {
        this.adminSecondIP = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the location2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation2() {
        return location2;
    }

    /**
     * Sets the value of the location2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation2(String value) {
        this.location2 = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the value of the host2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost2() {
        return host2;
    }

    /**
     * Sets the value of the host2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost2(String value) {
        this.host2 = value;
    }

    /**
     * Gets the value of the dhcpid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDHCPID() {
        return dhcpid;
    }

    /**
     * Sets the value of the dhcpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDHCPID(String value) {
        this.dhcpid = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the ipAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress1() {
        return ipAddress1;
    }

    /**
     * Sets the value of the ipAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress1(String value) {
        this.ipAddress1 = value;
    }

    /**
     * Gets the value of the ipAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress2() {
        return ipAddress2;
    }

    /**
     * Sets the value of the ipAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress2(String value) {
        this.ipAddress2 = value;
    }

    /**
     * Gets the value of the ipAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress3() {
        return ipAddress3;
    }

    /**
     * Sets the value of the ipAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress3(String value) {
        this.ipAddress3 = value;
    }

    /**
     * Gets the value of the ipAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress4() {
        return ipAddress4;
    }

    /**
     * Sets the value of the ipAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress4(String value) {
        this.ipAddress4 = value;
    }

    /**
     * Gets the value of the ip2Address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP2Address() {
        return ip2Address;
    }

    /**
     * Sets the value of the ip2Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP2Address(String value) {
        this.ip2Address = value;
    }

    /**
     * Gets the value of the ip2Address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP2Address1() {
        return ip2Address1;
    }

    /**
     * Sets the value of the ip2Address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP2Address1(String value) {
        this.ip2Address1 = value;
    }

    /**
     * Gets the value of the ip2Address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP2Address2() {
        return ip2Address2;
    }

    /**
     * Sets the value of the ip2Address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP2Address2(String value) {
        this.ip2Address2 = value;
    }

    /**
     * Gets the value of the ip2Address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP2Address3() {
        return ip2Address3;
    }

    /**
     * Sets the value of the ip2Address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP2Address3(String value) {
        this.ip2Address3 = value;
    }

    /**
     * Gets the value of the ip2Address4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP2Address4() {
        return ip2Address4;
    }

    /**
     * Sets the value of the ip2Address4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP2Address4(String value) {
        this.ip2Address4 = value;
    }

    /**
     * Gets the value of the qosCC8021P property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQosCC8021P() {
        return qosCC8021P;
    }

    /**
     * Sets the value of the qosCC8021P property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQosCC8021P(String value) {
        this.qosCC8021P = value;
    }

    /**
     * Gets the value of the ccDiffServ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCDiffServ() {
        return ccDiffServ;
    }

    /**
     * Sets the value of the ccDiffServ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCDiffServ(String value) {
        this.ccDiffServ = value;
    }

    /**
     * Gets the value of the callContDiffServ1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallContDiffServ1() {
        return callContDiffServ1;
    }

    /**
     * Sets the value of the callContDiffServ1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallContDiffServ1(String value) {
        this.callContDiffServ1 = value;
    }

    /**
     * Gets the value of the callContDiffServ11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallContDiffServ11() {
        return callContDiffServ11;
    }

    /**
     * Sets the value of the callContDiffServ11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallContDiffServ11(String value) {
        this.callContDiffServ11 = value;
    }

    /**
     * Gets the value of the callContDiffServ12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallContDiffServ12() {
        return callContDiffServ12;
    }

    /**
     * Sets the value of the callContDiffServ12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallContDiffServ12(String value) {
        this.callContDiffServ12 = value;
    }

    /**
     * Gets the value of the callContDiffServ2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallContDiffServ2() {
        return callContDiffServ2;
    }

    /**
     * Sets the value of the callContDiffServ2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallContDiffServ2(String value) {
        this.callContDiffServ2 = value;
    }

    /**
     * Gets the value of the callContDiffServ21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallContDiffServ21() {
        return callContDiffServ21;
    }

    /**
     * Sets the value of the callContDiffServ21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallContDiffServ21(String value) {
        this.callContDiffServ21 = value;
    }

    /**
     * Gets the value of the callContDiffServ22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallContDiffServ22() {
        return callContDiffServ22;
    }

    /**
     * Sets the value of the callContDiffServ22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallContDiffServ22(String value) {
        this.callContDiffServ22 = value;
    }

}
