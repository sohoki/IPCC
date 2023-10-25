
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BCMSSkillReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BCMSSkillReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Switch_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Skill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Skill_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Acceptable_Service_Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Report_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACD_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Speed_Answered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Abandoned_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Abandoned_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Talk_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_After_Call" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flow_In" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flow_Out" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Aux_Other" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Avg_Staff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BCMSSkillReportType", propOrder = {
    "switchName",
    "date",
    "skill",
    "skillName",
    "acceptableServiceLevel",
    "reportType",
    "interval",
    "acdCalls",
    "avgSpeedAnswered",
    "abandonedCalls",
    "avgAbandonedTime",
    "avgTalkTime",
    "totalAfterCall",
    "flowIn",
    "flowOut",
    "totalAuxOther",
    "avgStaff",
    "pctInSvcLevel"
})
public class BCMSSkillReportType {

    @XmlElement(name = "Switch_Name")
    protected String switchName;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Skill")
    protected String skill;
    @XmlElement(name = "Skill_Name")
    protected String skillName;
    @XmlElement(name = "Acceptable_Service_Level")
    protected String acceptableServiceLevel;
    @XmlElement(name = "Report_Type")
    protected String reportType;
    @XmlElement(name = "Interval")
    protected String interval;
    @XmlElement(name = "ACD_Calls")
    protected String acdCalls;
    @XmlElement(name = "Avg_Speed_Answered")
    protected String avgSpeedAnswered;
    @XmlElement(name = "Abandoned_Calls")
    protected String abandonedCalls;
    @XmlElement(name = "Avg_Abandoned_Time")
    protected String avgAbandonedTime;
    @XmlElement(name = "Avg_Talk_Time")
    protected String avgTalkTime;
    @XmlElement(name = "Total_After_Call")
    protected String totalAfterCall;
    @XmlElement(name = "Flow_In")
    protected String flowIn;
    @XmlElement(name = "Flow_Out")
    protected String flowOut;
    @XmlElement(name = "Total_Aux_Other")
    protected String totalAuxOther;
    @XmlElement(name = "Avg_Staff")
    protected String avgStaff;
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
     * Gets the value of the skill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkill() {
        return skill;
    }

    /**
     * Sets the value of the skill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkill(String value) {
        this.skill = value;
    }

    /**
     * Gets the value of the skillName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillName() {
        return skillName;
    }

    /**
     * Sets the value of the skillName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillName(String value) {
        this.skillName = value;
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
     * Gets the value of the flowIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowIn() {
        return flowIn;
    }

    /**
     * Sets the value of the flowIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowIn(String value) {
        this.flowIn = value;
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
     * Gets the value of the avgStaff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgStaff() {
        return avgStaff;
    }

    /**
     * Sets the value of the avgStaff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgStaff(String value) {
        this.avgStaff = value;
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
