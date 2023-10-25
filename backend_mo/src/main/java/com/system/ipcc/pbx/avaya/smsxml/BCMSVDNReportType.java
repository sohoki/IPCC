
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BCMSVDNReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BCMSVDNReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Switch_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VDN_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Acceptable_Service_Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Report_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Calls_Offered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACD_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Speed_Answered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Abandoned_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Abandoned_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Talk_Hold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connected_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flow_Out" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Calls_Busy_Disconnected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pct_In_Svc_Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BCMSVDNReportType", propOrder = {
    "switchName",
    "date",
    "vdn",
    "vdnName",
    "acceptableServiceLevel",
    "reportType",
    "callsOffered",
    "acdCalls",
    "avgSpeedAnswered",
    "abandonedCalls",
    "avgAbandonedTime",
    "avgTalkHold",
    "connectedCalls",
    "flowOut",
    "callsBusyDisconnected",
    "pctInSvcLevel"
})
public class BCMSVDNReportType {

    @XmlElement(name = "Switch_Name")
    protected String switchName;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "VDN")
    protected String vdn;
    @XmlElement(name = "VDN_Name")
    protected String vdnName;
    @XmlElement(name = "Acceptable_Service_Level")
    protected String acceptableServiceLevel;
    @XmlElement(name = "Report_Type")
    protected String reportType;
    @XmlElement(name = "Calls_Offered")
    protected String callsOffered;
    @XmlElement(name = "ACD_Calls")
    protected String acdCalls;
    @XmlElement(name = "Avg_Speed_Answered")
    protected String avgSpeedAnswered;
    @XmlElement(name = "Abandoned_Calls")
    protected String abandonedCalls;
    @XmlElement(name = "Avg_Abandoned_Time")
    protected String avgAbandonedTime;
    @XmlElement(name = "Avg_Talk_Hold")
    protected String avgTalkHold;
    @XmlElement(name = "Connected_Calls")
    protected String connectedCalls;
    @XmlElement(name = "Flow_Out")
    protected String flowOut;
    @XmlElement(name = "Calls_Busy_Disconnected")
    protected String callsBusyDisconnected;
    @XmlElement(name = "Pct_In_Svc_Level")
    protected String pctInSvcLevel;

    /**
     * Gets the value of the switchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchName() {
        return switchName;
    }

    /**
     * Sets the value of the switchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchName(String value) {
        this.switchName = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the vdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVDN() {
        return vdn;
    }

    /**
     * Sets the value of the vdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVDN(String value) {
        this.vdn = value;
    }

    /**
     * Gets the value of the vdnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVDNName() {
        return vdnName;
    }

    /**
     * Sets the value of the vdnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVDNName(String value) {
        this.vdnName = value;
    }

    /**
     * Gets the value of the acceptableServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptableServiceLevel() {
        return acceptableServiceLevel;
    }

    /**
     * Sets the value of the acceptableServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptableServiceLevel(String value) {
        this.acceptableServiceLevel = value;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the callsOffered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallsOffered() {
        return callsOffered;
    }

    /**
     * Sets the value of the callsOffered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallsOffered(String value) {
        this.callsOffered = value;
    }

    /**
     * Gets the value of the acdCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACDCalls() {
        return acdCalls;
    }

    /**
     * Sets the value of the acdCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACDCalls(String value) {
        this.acdCalls = value;
    }

    /**
     * Gets the value of the avgSpeedAnswered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgSpeedAnswered() {
        return avgSpeedAnswered;
    }

    /**
     * Sets the value of the avgSpeedAnswered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgSpeedAnswered(String value) {
        this.avgSpeedAnswered = value;
    }

    /**
     * Gets the value of the abandonedCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbandonedCalls() {
        return abandonedCalls;
    }

    /**
     * Sets the value of the abandonedCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbandonedCalls(String value) {
        this.abandonedCalls = value;
    }

    /**
     * Gets the value of the avgAbandonedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgAbandonedTime() {
        return avgAbandonedTime;
    }

    /**
     * Sets the value of the avgAbandonedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgAbandonedTime(String value) {
        this.avgAbandonedTime = value;
    }

    /**
     * Gets the value of the avgTalkHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgTalkHold() {
        return avgTalkHold;
    }

    /**
     * Sets the value of the avgTalkHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgTalkHold(String value) {
        this.avgTalkHold = value;
    }

    /**
     * Gets the value of the connectedCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedCalls() {
        return connectedCalls;
    }

    /**
     * Sets the value of the connectedCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedCalls(String value) {
        this.connectedCalls = value;
    }

    /**
     * Gets the value of the flowOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowOut() {
        return flowOut;
    }

    /**
     * Sets the value of the flowOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowOut(String value) {
        this.flowOut = value;
    }

    /**
     * Gets the value of the callsBusyDisconnected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallsBusyDisconnected() {
        return callsBusyDisconnected;
    }

    /**
     * Sets the value of the callsBusyDisconnected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallsBusyDisconnected(String value) {
        this.callsBusyDisconnected = value;
    }

    /**
     * Gets the value of the pctInSvcLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPctInSvcLevel() {
        return pctInSvcLevel;
    }

    /**
     * Sets the value of the pctInSvcLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPctInSvcLevel(String value) {
        this.pctInSvcLevel = value;
    }

}
