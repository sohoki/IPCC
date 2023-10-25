
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BCMSTrunkReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BCMSTrunkReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Switch_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_Of_Trunks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Report_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Incoming_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Incoming_Abandoned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Incoming_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Incoming_Usage_CCS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outgoing_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outgoing_Completed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outgoing_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outgoing_Usage_CCS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pct_All_Busy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pct_Time_Maintenance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BCMSTrunkReportType", propOrder = {
    "switchName",
    "date",
    "group",
    "groupName",
    "numberOfTrunks",
    "reportType",
    "interval",
    "incomingCalls",
    "incomingAbandoned",
    "incomingTime",
    "incomingUsageCCS",
    "outgoingCalls",
    "outgoingCompleted",
    "outgoingTime",
    "outgoingUsageCCS",
    "pctAllBusy",
    "pctTimeMaintenance"
})
public class BCMSTrunkReportType {

    @XmlElement(name = "Switch_Name")
    protected String switchName;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Group")
    protected String group;
    @XmlElement(name = "Group_Name")
    protected String groupName;
    @XmlElement(name = "Number_Of_Trunks")
    protected String numberOfTrunks;
    @XmlElement(name = "Report_Type")
    protected String reportType;
    @XmlElement(name = "Interval")
    protected String interval;
    @XmlElement(name = "Incoming_Calls")
    protected String incomingCalls;
    @XmlElement(name = "Incoming_Abandoned")
    protected String incomingAbandoned;
    @XmlElement(name = "Incoming_Time")
    protected String incomingTime;
    @XmlElement(name = "Incoming_Usage_CCS")
    protected String incomingUsageCCS;
    @XmlElement(name = "Outgoing_Calls")
    protected String outgoingCalls;
    @XmlElement(name = "Outgoing_Completed")
    protected String outgoingCompleted;
    @XmlElement(name = "Outgoing_Time")
    protected String outgoingTime;
    @XmlElement(name = "Outgoing_Usage_CCS")
    protected String outgoingUsageCCS;
    @XmlElement(name = "Pct_All_Busy")
    protected String pctAllBusy;
    @XmlElement(name = "Pct_Time_Maintenance")
    protected String pctTimeMaintenance;

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
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the numberOfTrunks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfTrunks() {
        return numberOfTrunks;
    }

    /**
     * Sets the value of the numberOfTrunks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfTrunks(String value) {
        this.numberOfTrunks = value;
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
     * Gets the value of the incomingCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingCalls() {
        return incomingCalls;
    }

    /**
     * Sets the value of the incomingCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingCalls(String value) {
        this.incomingCalls = value;
    }

    /**
     * Gets the value of the incomingAbandoned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingAbandoned() {
        return incomingAbandoned;
    }

    /**
     * Sets the value of the incomingAbandoned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingAbandoned(String value) {
        this.incomingAbandoned = value;
    }

    /**
     * Gets the value of the incomingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingTime() {
        return incomingTime;
    }

    /**
     * Sets the value of the incomingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingTime(String value) {
        this.incomingTime = value;
    }

    /**
     * Gets the value of the incomingUsageCCS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingUsageCCS() {
        return incomingUsageCCS;
    }

    /**
     * Sets the value of the incomingUsageCCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingUsageCCS(String value) {
        this.incomingUsageCCS = value;
    }

    /**
     * Gets the value of the outgoingCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingCalls() {
        return outgoingCalls;
    }

    /**
     * Sets the value of the outgoingCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingCalls(String value) {
        this.outgoingCalls = value;
    }

    /**
     * Gets the value of the outgoingCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingCompleted() {
        return outgoingCompleted;
    }

    /**
     * Sets the value of the outgoingCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingCompleted(String value) {
        this.outgoingCompleted = value;
    }

    /**
     * Gets the value of the outgoingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingTime() {
        return outgoingTime;
    }

    /**
     * Sets the value of the outgoingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingTime(String value) {
        this.outgoingTime = value;
    }

    /**
     * Gets the value of the outgoingUsageCCS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingUsageCCS() {
        return outgoingUsageCCS;
    }

    /**
     * Sets the value of the outgoingUsageCCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingUsageCCS(String value) {
        this.outgoingUsageCCS = value;
    }

    /**
     * Gets the value of the pctAllBusy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPctAllBusy() {
        return pctAllBusy;
    }

    /**
     * Sets the value of the pctAllBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPctAllBusy(String value) {
        this.pctAllBusy = value;
    }

    /**
     * Gets the value of the pctTimeMaintenance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPctTimeMaintenance() {
        return pctTimeMaintenance;
    }

    /**
     * Sets the value of the pctTimeMaintenance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPctTimeMaintenance(String value) {
        this.pctTimeMaintenance = value;
    }

}
