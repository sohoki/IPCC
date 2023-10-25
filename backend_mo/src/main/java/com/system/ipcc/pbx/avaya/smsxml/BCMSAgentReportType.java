
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BCMSAgentReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BCMSAgentReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Switch_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Agent_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Report_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACD_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Talk_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_After_Call" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Avail_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Aux_Other" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extn_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Extn_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Time_Staffed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Hold_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BCMSAgentReportType", propOrder = {
    "switchName",
    "date",
    "agent",
    "agentName",
    "reportType",
    "interval",
    "acdCalls",
    "avgTalkTime",
    "totalAfterCall",
    "totalAvailTime",
    "totalAuxOther",
    "extnCalls",
    "avgExtnTime",
    "totalTimeStaffed",
    "totalHoldTime"
})
public class BCMSAgentReportType {

    @XmlElement(name = "Switch_Name")
    protected String switchName;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Agent")
    protected String agent;
    @XmlElement(name = "Agent_Name")
    protected String agentName;
    @XmlElement(name = "Report_Type")
    protected String reportType;
    @XmlElement(name = "Interval")
    protected String interval;
    @XmlElement(name = "ACD_Calls")
    protected String acdCalls;
    @XmlElement(name = "Avg_Talk_Time")
    protected String avgTalkTime;
    @XmlElement(name = "Total_After_Call")
    protected String totalAfterCall;
    @XmlElement(name = "Total_Avail_Time")
    protected String totalAvailTime;
    @XmlElement(name = "Total_Aux_Other")
    protected String totalAuxOther;
    @XmlElement(name = "Extn_Calls")
    protected String extnCalls;
    @XmlElement(name = "Avg_Extn_Time")
    protected String avgExtnTime;
    @XmlElement(name = "Total_Time_Staffed")
    protected String totalTimeStaffed;
    @XmlElement(name = "Total_Hold_Time")
    protected String totalHoldTime;

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
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgent(String value) {
        this.agent = value;
    }

    /**
     * Gets the value of the agentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * Sets the value of the agentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentName(String value) {
        this.agentName = value;
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
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterval(String value) {
        this.interval = value;
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
     * Gets the value of the avgTalkTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgTalkTime() {
        return avgTalkTime;
    }

    /**
     * Sets the value of the avgTalkTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgTalkTime(String value) {
        this.avgTalkTime = value;
    }

    /**
     * Gets the value of the totalAfterCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAfterCall() {
        return totalAfterCall;
    }

    /**
     * Sets the value of the totalAfterCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAfterCall(String value) {
        this.totalAfterCall = value;
    }

    /**
     * Gets the value of the totalAvailTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAvailTime() {
        return totalAvailTime;
    }

    /**
     * Sets the value of the totalAvailTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAvailTime(String value) {
        this.totalAvailTime = value;
    }

    /**
     * Gets the value of the totalAuxOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAuxOther() {
        return totalAuxOther;
    }

    /**
     * Sets the value of the totalAuxOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAuxOther(String value) {
        this.totalAuxOther = value;
    }

    /**
     * Gets the value of the extnCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtnCalls() {
        return extnCalls;
    }

    /**
     * Sets the value of the extnCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtnCalls(String value) {
        this.extnCalls = value;
    }

    /**
     * Gets the value of the avgExtnTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgExtnTime() {
        return avgExtnTime;
    }

    /**
     * Sets the value of the avgExtnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgExtnTime(String value) {
        this.avgExtnTime = value;
    }

    /**
     * Gets the value of the totalTimeStaffed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTimeStaffed() {
        return totalTimeStaffed;
    }

    /**
     * Sets the value of the totalTimeStaffed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTimeStaffed(String value) {
        this.totalTimeStaffed = value;
    }

    /**
     * Gets the value of the totalHoldTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalHoldTime() {
        return totalHoldTime;
    }

    /**
     * Sets the value of the totalHoldTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalHoldTime(String value) {
        this.totalHoldTime = value;
    }

}
