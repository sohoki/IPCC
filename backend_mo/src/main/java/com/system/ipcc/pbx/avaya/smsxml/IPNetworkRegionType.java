
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPNetworkRegionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPNetworkRegionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codec_Set" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDP_Port_Min" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDP_Port_Max" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterRegionDirect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntraRegionDirect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hairpinning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Control_8021p_Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audio_8021p_Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Video_8021p_Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Control_PHB_Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Audio_PHB_Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Video_PHB_Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="H323_Link_Bounce_Recovery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idle_Traffic_Interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Keep_Alive_Interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Keep_Alive_Count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTCP_Reporting_Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Near_End_Establishes_TCP_Signaling_Socket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Near_End_TCP_Port_Min" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Near_End_TCP_Port_Max" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}IPNetworkRegionArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPNetworkRegionType", propOrder = {
    "region",
    "name",
    "location",
    "codecSet",
    "udpPortMin",
    "udpPortMax",
    "interRegionDirect",
    "intraRegionDirect",
    "hairpinning",
    "callControl8021PPriority",
    "audio8021PPriority",
    "video8021PPriority",
    "callControlPHBValue",
    "audioPHBValue",
    "videoPHBValue",
    "h323LinkBounceRecovery",
    "idleTrafficInterval",
    "keepAliveInterval",
    "keepAliveCount",
    "rtcpReportingEnabled",
    "nearEndEstablishesTCPSignalingSocket",
    "nearEndTCPPortMin",
    "nearEndTCPPortMax",
    "h323SecurityProfiles",
    "backupServersInPriorityOrder"
})
public class IPNetworkRegionType {

    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Codec_Set")
    protected String codecSet;
    @XmlElement(name = "UDP_Port_Min")
    protected String udpPortMin;
    @XmlElement(name = "UDP_Port_Max")
    protected String udpPortMax;
    @XmlElement(name = "InterRegionDirect")
    protected String interRegionDirect;
    @XmlElement(name = "IntraRegionDirect")
    protected String intraRegionDirect;
    @XmlElement(name = "Hairpinning")
    protected String hairpinning;
    @XmlElement(name = "Call_Control_8021p_Priority")
    protected String callControl8021PPriority;
    @XmlElement(name = "Audio_8021p_Priority")
    protected String audio8021PPriority;
    @XmlElement(name = "Video_8021p_Priority")
    protected String video8021PPriority;
    @XmlElement(name = "Call_Control_PHB_Value")
    protected String callControlPHBValue;
    @XmlElement(name = "Audio_PHB_Value")
    protected String audioPHBValue;
    @XmlElement(name = "Video_PHB_Value")
    protected String videoPHBValue;
    @XmlElement(name = "H323_Link_Bounce_Recovery")
    protected String h323LinkBounceRecovery;
    @XmlElement(name = "Idle_Traffic_Interval")
    protected String idleTrafficInterval;
    @XmlElement(name = "Keep_Alive_Interval")
    protected String keepAliveInterval;
    @XmlElement(name = "Keep_Alive_Count")
    protected String keepAliveCount;
    @XmlElement(name = "RTCP_Reporting_Enabled")
    protected String rtcpReportingEnabled;
    @XmlElement(name = "Near_End_Establishes_TCP_Signaling_Socket")
    protected String nearEndEstablishesTCPSignalingSocket;
    @XmlElement(name = "Near_End_TCP_Port_Min")
    protected String nearEndTCPPortMin;
    @XmlElement(name = "Near_End_TCP_Port_Max")
    protected String nearEndTCPPortMax;
    @XmlElement(name = "H323_Security_Profiles")
    protected List<ArrayType> h323SecurityProfiles;
    @XmlElement(name = "Backup_Servers_In_Priority_Order")
    protected List<ArrayType> backupServersInPriorityOrder;

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
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
     * Gets the value of the codecSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodecSet() {
        return codecSet;
    }

    /**
     * Sets the value of the codecSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodecSet(String value) {
        this.codecSet = value;
    }

    /**
     * Gets the value of the udpPortMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDPPortMin() {
        return udpPortMin;
    }

    /**
     * Sets the value of the udpPortMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDPPortMin(String value) {
        this.udpPortMin = value;
    }

    /**
     * Gets the value of the udpPortMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDPPortMax() {
        return udpPortMax;
    }

    /**
     * Sets the value of the udpPortMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDPPortMax(String value) {
        this.udpPortMax = value;
    }

    /**
     * Gets the value of the interRegionDirect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterRegionDirect() {
        return interRegionDirect;
    }

    /**
     * Sets the value of the interRegionDirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterRegionDirect(String value) {
        this.interRegionDirect = value;
    }

    /**
     * Gets the value of the intraRegionDirect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraRegionDirect() {
        return intraRegionDirect;
    }

    /**
     * Sets the value of the intraRegionDirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraRegionDirect(String value) {
        this.intraRegionDirect = value;
    }

    /**
     * Gets the value of the hairpinning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHairpinning() {
        return hairpinning;
    }

    /**
     * Sets the value of the hairpinning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHairpinning(String value) {
        this.hairpinning = value;
    }

    /**
     * Gets the value of the callControl8021PPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallControl8021PPriority() {
        return callControl8021PPriority;
    }

    /**
     * Sets the value of the callControl8021PPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallControl8021PPriority(String value) {
        this.callControl8021PPriority = value;
    }

    /**
     * Gets the value of the audio8021PPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudio8021PPriority() {
        return audio8021PPriority;
    }

    /**
     * Sets the value of the audio8021PPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudio8021PPriority(String value) {
        this.audio8021PPriority = value;
    }

    /**
     * Gets the value of the video8021PPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideo8021PPriority() {
        return video8021PPriority;
    }

    /**
     * Sets the value of the video8021PPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideo8021PPriority(String value) {
        this.video8021PPriority = value;
    }

    /**
     * Gets the value of the callControlPHBValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallControlPHBValue() {
        return callControlPHBValue;
    }

    /**
     * Sets the value of the callControlPHBValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallControlPHBValue(String value) {
        this.callControlPHBValue = value;
    }

    /**
     * Gets the value of the audioPHBValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioPHBValue() {
        return audioPHBValue;
    }

    /**
     * Sets the value of the audioPHBValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioPHBValue(String value) {
        this.audioPHBValue = value;
    }

    /**
     * Gets the value of the videoPHBValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoPHBValue() {
        return videoPHBValue;
    }

    /**
     * Sets the value of the videoPHBValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoPHBValue(String value) {
        this.videoPHBValue = value;
    }

    /**
     * Gets the value of the h323LinkBounceRecovery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getH323LinkBounceRecovery() {
        return h323LinkBounceRecovery;
    }

    /**
     * Sets the value of the h323LinkBounceRecovery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setH323LinkBounceRecovery(String value) {
        this.h323LinkBounceRecovery = value;
    }

    /**
     * Gets the value of the idleTrafficInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdleTrafficInterval() {
        return idleTrafficInterval;
    }

    /**
     * Sets the value of the idleTrafficInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdleTrafficInterval(String value) {
        this.idleTrafficInterval = value;
    }

    /**
     * Gets the value of the keepAliveInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeepAliveInterval() {
        return keepAliveInterval;
    }

    /**
     * Sets the value of the keepAliveInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepAliveInterval(String value) {
        this.keepAliveInterval = value;
    }

    /**
     * Gets the value of the keepAliveCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeepAliveCount() {
        return keepAliveCount;
    }

    /**
     * Sets the value of the keepAliveCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepAliveCount(String value) {
        this.keepAliveCount = value;
    }

    /**
     * Gets the value of the rtcpReportingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTCPReportingEnabled() {
        return rtcpReportingEnabled;
    }

    /**
     * Sets the value of the rtcpReportingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTCPReportingEnabled(String value) {
        this.rtcpReportingEnabled = value;
    }

    /**
     * Gets the value of the nearEndEstablishesTCPSignalingSocket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNearEndEstablishesTCPSignalingSocket() {
        return nearEndEstablishesTCPSignalingSocket;
    }

    /**
     * Sets the value of the nearEndEstablishesTCPSignalingSocket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNearEndEstablishesTCPSignalingSocket(String value) {
        this.nearEndEstablishesTCPSignalingSocket = value;
    }

    /**
     * Gets the value of the nearEndTCPPortMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNearEndTCPPortMin() {
        return nearEndTCPPortMin;
    }

    /**
     * Sets the value of the nearEndTCPPortMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNearEndTCPPortMin(String value) {
        this.nearEndTCPPortMin = value;
    }

    /**
     * Gets the value of the nearEndTCPPortMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNearEndTCPPortMax() {
        return nearEndTCPPortMax;
    }

    /**
     * Sets the value of the nearEndTCPPortMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNearEndTCPPortMax(String value) {
        this.nearEndTCPPortMax = value;
    }

    /**
     * Gets the value of the h323SecurityProfiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the h323SecurityProfiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getH323SecurityProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getH323SecurityProfiles() {
        if (h323SecurityProfiles == null) {
            h323SecurityProfiles = new ArrayList<ArrayType>();
        }
        return this.h323SecurityProfiles;
    }

    /**
     * Gets the value of the backupServersInPriorityOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backupServersInPriorityOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackupServersInPriorityOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBackupServersInPriorityOrder() {
        if (backupServersInPriorityOrder == null) {
            backupServersInPriorityOrder = new ArrayList<ArrayType>();
        }
        return this.backupServersInPriorityOrder;
    }

}
