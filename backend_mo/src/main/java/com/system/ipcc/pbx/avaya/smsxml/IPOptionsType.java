
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Roundtrip_Propagation_Delay_High" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Roundtrip_Propagation_Delay_Low" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Packet_Loss_High" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Packet_Loss_Low" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ping_Test_Interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_of_Pings_Per_Measurement_Interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTCP_Default_Server_IP_Address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTCP_Default_Server_IP_Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTCP_Default_Server_IP_Address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTCP_Default_Server_IP_Address4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTCP_Default_Server_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Default_RTCP_Report_Period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Traceroute_On_Link_Failure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Link_Loss_Delay_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Primary_Search_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Periodic_Registration_Timer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Always_use_G711_for_intra_switch_Music_On_Hold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Intra_System_IP_DTMF_Transmission_Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enable_Detection_and_Alarms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPOptionsType", propOrder = {
    "roundtripPropagationDelayHigh",
    "roundtripPropagationDelayLow",
    "packetLossHigh",
    "packetLossLow",
    "pingTestInterval",
    "numberOfPingsPerMeasurementInterval",
    "rtcpDefaultServerIPAddress1",
    "rtcpDefaultServerIPAddress2",
    "rtcpDefaultServerIPAddress3",
    "rtcpDefaultServerIPAddress4",
    "rtcpDefaultServerPort",
    "defaultRTCPReportPeriod",
    "tracerouteOnLinkFailure",
    "linkLossDelayTimer",
    "primarySearchTime",
    "periodicRegistrationTimer",
    "alwaysUseG711ForIntraSwitchMusicOnHold",
    "intraSystemIPDTMFTransmissionMode",
    "enableDetectionAndAlarms"
})
public class IPOptionsType {

    @XmlElement(name = "Roundtrip_Propagation_Delay_High")
    protected String roundtripPropagationDelayHigh;
    @XmlElement(name = "Roundtrip_Propagation_Delay_Low")
    protected String roundtripPropagationDelayLow;
    @XmlElement(name = "Packet_Loss_High")
    protected String packetLossHigh;
    @XmlElement(name = "Packet_Loss_Low")
    protected String packetLossLow;
    @XmlElement(name = "Ping_Test_Interval")
    protected String pingTestInterval;
    @XmlElement(name = "Number_of_Pings_Per_Measurement_Interval")
    protected String numberOfPingsPerMeasurementInterval;
    @XmlElement(name = "RTCP_Default_Server_IP_Address1")
    protected String rtcpDefaultServerIPAddress1;
    @XmlElement(name = "RTCP_Default_Server_IP_Address2")
    protected String rtcpDefaultServerIPAddress2;
    @XmlElement(name = "RTCP_Default_Server_IP_Address3")
    protected String rtcpDefaultServerIPAddress3;
    @XmlElement(name = "RTCP_Default_Server_IP_Address4")
    protected String rtcpDefaultServerIPAddress4;
    @XmlElement(name = "RTCP_Default_Server_Port")
    protected String rtcpDefaultServerPort;
    @XmlElement(name = "Default_RTCP_Report_Period")
    protected String defaultRTCPReportPeriod;
    @XmlElement(name = "Traceroute_On_Link_Failure")
    protected String tracerouteOnLinkFailure;
    @XmlElement(name = "Link_Loss_Delay_Timer")
    protected String linkLossDelayTimer;
    @XmlElement(name = "Primary_Search_Time")
    protected String primarySearchTime;
    @XmlElement(name = "Periodic_Registration_Timer")
    protected String periodicRegistrationTimer;
    @XmlElement(name = "Always_use_G711_for_intra_switch_Music_On_Hold")
    protected String alwaysUseG711ForIntraSwitchMusicOnHold;
    @XmlElement(name = "Intra_System_IP_DTMF_Transmission_Mode")
    protected String intraSystemIPDTMFTransmissionMode;
    @XmlElement(name = "Enable_Detection_and_Alarms")
    protected String enableDetectionAndAlarms;

    /**
     * Gets the value of the roundtripPropagationDelayHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoundtripPropagationDelayHigh() {
        return roundtripPropagationDelayHigh;
    }

    /**
     * Sets the value of the roundtripPropagationDelayHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoundtripPropagationDelayHigh(String value) {
        this.roundtripPropagationDelayHigh = value;
    }

    /**
     * Gets the value of the roundtripPropagationDelayLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoundtripPropagationDelayLow() {
        return roundtripPropagationDelayLow;
    }

    /**
     * Sets the value of the roundtripPropagationDelayLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoundtripPropagationDelayLow(String value) {
        this.roundtripPropagationDelayLow = value;
    }

    /**
     * Gets the value of the packetLossHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacketLossHigh() {
        return packetLossHigh;
    }

    /**
     * Sets the value of the packetLossHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacketLossHigh(String value) {
        this.packetLossHigh = value;
    }

    /**
     * Gets the value of the packetLossLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacketLossLow() {
        return packetLossLow;
    }

    /**
     * Sets the value of the packetLossLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacketLossLow(String value) {
        this.packetLossLow = value;
    }

    /**
     * Gets the value of the pingTestInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPingTestInterval() {
        return pingTestInterval;
    }

    /**
     * Sets the value of the pingTestInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPingTestInterval(String value) {
        this.pingTestInterval = value;
    }

    /**
     * Gets the value of the numberOfPingsPerMeasurementInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfPingsPerMeasurementInterval() {
        return numberOfPingsPerMeasurementInterval;
    }

    /**
     * Sets the value of the numberOfPingsPerMeasurementInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfPingsPerMeasurementInterval(String value) {
        this.numberOfPingsPerMeasurementInterval = value;
    }

    /**
     * Gets the value of the rtcpDefaultServerIPAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTCPDefaultServerIPAddress1() {
        return rtcpDefaultServerIPAddress1;
    }

    /**
     * Sets the value of the rtcpDefaultServerIPAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTCPDefaultServerIPAddress1(String value) {
        this.rtcpDefaultServerIPAddress1 = value;
    }

    /**
     * Gets the value of the rtcpDefaultServerIPAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTCPDefaultServerIPAddress2() {
        return rtcpDefaultServerIPAddress2;
    }

    /**
     * Sets the value of the rtcpDefaultServerIPAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTCPDefaultServerIPAddress2(String value) {
        this.rtcpDefaultServerIPAddress2 = value;
    }

    /**
     * Gets the value of the rtcpDefaultServerIPAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTCPDefaultServerIPAddress3() {
        return rtcpDefaultServerIPAddress3;
    }

    /**
     * Sets the value of the rtcpDefaultServerIPAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTCPDefaultServerIPAddress3(String value) {
        this.rtcpDefaultServerIPAddress3 = value;
    }

    /**
     * Gets the value of the rtcpDefaultServerIPAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTCPDefaultServerIPAddress4() {
        return rtcpDefaultServerIPAddress4;
    }

    /**
     * Sets the value of the rtcpDefaultServerIPAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTCPDefaultServerIPAddress4(String value) {
        this.rtcpDefaultServerIPAddress4 = value;
    }

    /**
     * Gets the value of the rtcpDefaultServerPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTCPDefaultServerPort() {
        return rtcpDefaultServerPort;
    }

    /**
     * Sets the value of the rtcpDefaultServerPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTCPDefaultServerPort(String value) {
        this.rtcpDefaultServerPort = value;
    }

    /**
     * Gets the value of the defaultRTCPReportPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRTCPReportPeriod() {
        return defaultRTCPReportPeriod;
    }

    /**
     * Sets the value of the defaultRTCPReportPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultRTCPReportPeriod(String value) {
        this.defaultRTCPReportPeriod = value;
    }

    /**
     * Gets the value of the tracerouteOnLinkFailure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTracerouteOnLinkFailure() {
        return tracerouteOnLinkFailure;
    }

    /**
     * Sets the value of the tracerouteOnLinkFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTracerouteOnLinkFailure(String value) {
        this.tracerouteOnLinkFailure = value;
    }

    /**
     * Gets the value of the linkLossDelayTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkLossDelayTimer() {
        return linkLossDelayTimer;
    }

    /**
     * Sets the value of the linkLossDelayTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkLossDelayTimer(String value) {
        this.linkLossDelayTimer = value;
    }

    /**
     * Gets the value of the primarySearchTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySearchTime() {
        return primarySearchTime;
    }

    /**
     * Sets the value of the primarySearchTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySearchTime(String value) {
        this.primarySearchTime = value;
    }

    /**
     * Gets the value of the periodicRegistrationTimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicRegistrationTimer() {
        return periodicRegistrationTimer;
    }

    /**
     * Sets the value of the periodicRegistrationTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicRegistrationTimer(String value) {
        this.periodicRegistrationTimer = value;
    }

    /**
     * Gets the value of the alwaysUseG711ForIntraSwitchMusicOnHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlwaysUseG711ForIntraSwitchMusicOnHold() {
        return alwaysUseG711ForIntraSwitchMusicOnHold;
    }

    /**
     * Sets the value of the alwaysUseG711ForIntraSwitchMusicOnHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlwaysUseG711ForIntraSwitchMusicOnHold(String value) {
        this.alwaysUseG711ForIntraSwitchMusicOnHold = value;
    }

    /**
     * Gets the value of the intraSystemIPDTMFTransmissionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraSystemIPDTMFTransmissionMode() {
        return intraSystemIPDTMFTransmissionMode;
    }

    /**
     * Sets the value of the intraSystemIPDTMFTransmissionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraSystemIPDTMFTransmissionMode(String value) {
        this.intraSystemIPDTMFTransmissionMode = value;
    }

    /**
     * Gets the value of the enableDetectionAndAlarms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableDetectionAndAlarms() {
        return enableDetectionAndAlarms;
    }

    /**
     * Sets the value of the enableDetectionAndAlarms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableDetectionAndAlarms(String value) {
        this.enableDetectionAndAlarms = value;
    }

}
