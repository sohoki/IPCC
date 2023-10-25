
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VDNType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VDNType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vector_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Vectoring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_me_Conferencing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Allow_VDN_Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Measured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Report_Adjunct_Calls_as_ACD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Acceptable_Service_Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Objective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VDN_of_Origin_Annc_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_Scripts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUDIX_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Return_Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VDN_Timed_ACW_Interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="After_Xfer_or_Held_Call_Drops" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BSR_Application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BSR_Available_Agent_Strategy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BSR_Tie_Strategy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Delay_PSTN_Connect_Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Observe_on_Agent_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Delay_PSTN_Connect_Message_On_Agent_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Send_VDN_as_Called_Ringing_Name_Over_QSIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Forward_Held_Call_CPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Display_VDN_for_Route_To_DAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VDN_Override_for_IDSN_Trunk_ASAI_Msgs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Background_BSR_Polling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unassigned_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BSR_Local_Treatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reporting_for_PC_Predictive_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pass_Prefixed_CPN_to_VDN_Vector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Conference_Access_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Conference_Controller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Conference_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Route_To_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time_Zone_Offset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Offset_Hours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Offset_Minutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Daylight_savings_rule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}VDNArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VDNType", propOrder = {
    "extension",
    "name",
    "destination",
    "vectorNumber",
    "attendantVectoring",
    "meetMeConferencing",
    "allowVDNOverride",
    "cor",
    "tn",
    "measured",
    "reportAdjunctCallsAsACD",
    "acceptableServiceLevel",
    "serviceObjective",
    "vdnOfOriginAnncExt",
    "nativeName1",
    "nativeName2",
    "nativeName3",
    "nativeName4",
    "nativeName5",
    "nativeNameScripts",
    "audixName",
    "returnDestination",
    "vdnTimedACWInterval",
    "afterXferOrHeldCallDrops",
    "bsrApplication",
    "bsrAvailableAgentStrategy",
    "bsrTieStrategy",
    "delayPSTNConnectMessage",
    "observeOnAgentAnswer",
    "delayPSTNConnectMessageOnAgentAnswer",
    "sendVDNAsCalledRingingNameOverQSIG",
    "forwardHeldCallCPN",
    "displayVDNForRouteToDAC",
    "vdnOverrideForIDSNTrunkASAIMsgs",
    "backgroundBSRPolling",
    "unassignedExtension",
    "bsrLocalTreatment",
    "reportingForPCPredictiveCalls",
    "passPrefixedCPNToVDNVector",
    "conferenceAccessCode",
    "conferenceController",
    "conferenceType",
    "routeToNumber",
    "timeZoneOffset",
    "offsetHours",
    "offsetMinutes",
    "daylightSavingsRule",
    "skill",
    "varDescription",
    "varAssignment"
})
public class VDNType {

    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "Vector_Number")
    protected String vectorNumber;
    @XmlElement(name = "Attendant_Vectoring")
    protected String attendantVectoring;
    @XmlElement(name = "Meet_me_Conferencing")
    protected String meetMeConferencing;
    @XmlElement(name = "Allow_VDN_Override")
    protected String allowVDNOverride;
    @XmlElement(name = "COR")
    protected String cor;
    @XmlElement(name = "TN")
    protected String tn;
    @XmlElement(name = "Measured")
    protected String measured;
    @XmlElement(name = "Report_Adjunct_Calls_as_ACD")
    protected String reportAdjunctCallsAsACD;
    @XmlElement(name = "Acceptable_Service_Level")
    protected String acceptableServiceLevel;
    @XmlElement(name = "Service_Objective")
    protected String serviceObjective;
    @XmlElement(name = "VDN_of_Origin_Annc_Ext")
    protected String vdnOfOriginAnncExt;
    @XmlElement(name = "Native_Name_1")
    protected String nativeName1;
    @XmlElement(name = "Native_Name_2")
    protected String nativeName2;
    @XmlElement(name = "Native_Name_3")
    protected String nativeName3;
    @XmlElement(name = "Native_Name_4")
    protected String nativeName4;
    @XmlElement(name = "Native_Name_5")
    protected String nativeName5;
    @XmlElement(name = "Native_Name_Scripts")
    protected String nativeNameScripts;
    @XmlElement(name = "AUDIX_Name")
    protected String audixName;
    @XmlElement(name = "Return_Destination")
    protected String returnDestination;
    @XmlElement(name = "VDN_Timed_ACW_Interval")
    protected String vdnTimedACWInterval;
    @XmlElement(name = "After_Xfer_or_Held_Call_Drops")
    protected String afterXferOrHeldCallDrops;
    @XmlElement(name = "BSR_Application")
    protected String bsrApplication;
    @XmlElement(name = "BSR_Available_Agent_Strategy")
    protected String bsrAvailableAgentStrategy;
    @XmlElement(name = "BSR_Tie_Strategy")
    protected String bsrTieStrategy;
    @XmlElement(name = "Delay_PSTN_Connect_Message")
    protected String delayPSTNConnectMessage;
    @XmlElement(name = "Observe_on_Agent_Answer")
    protected String observeOnAgentAnswer;
    @XmlElement(name = "Delay_PSTN_Connect_Message_On_Agent_Answer")
    protected String delayPSTNConnectMessageOnAgentAnswer;
    @XmlElement(name = "Send_VDN_as_Called_Ringing_Name_Over_QSIG")
    protected String sendVDNAsCalledRingingNameOverQSIG;
    @XmlElement(name = "Forward_Held_Call_CPN")
    protected String forwardHeldCallCPN;
    @XmlElement(name = "Display_VDN_for_Route_To_DAC")
    protected String displayVDNForRouteToDAC;
    @XmlElement(name = "VDN_Override_for_IDSN_Trunk_ASAI_Msgs")
    protected String vdnOverrideForIDSNTrunkASAIMsgs;
    @XmlElement(name = "Background_BSR_Polling")
    protected String backgroundBSRPolling;
    @XmlElement(name = "Unassigned_Extension")
    protected String unassignedExtension;
    @XmlElement(name = "BSR_Local_Treatment")
    protected String bsrLocalTreatment;
    @XmlElement(name = "Reporting_for_PC_Predictive_Calls")
    protected String reportingForPCPredictiveCalls;
    @XmlElement(name = "Pass_Prefixed_CPN_to_VDN_Vector")
    protected String passPrefixedCPNToVDNVector;
    @XmlElement(name = "Conference_Access_Code")
    protected String conferenceAccessCode;
    @XmlElement(name = "Conference_Controller")
    protected String conferenceController;
    @XmlElement(name = "Conference_Type")
    protected String conferenceType;
    @XmlElement(name = "Route_To_Number")
    protected String routeToNumber;
    @XmlElement(name = "Time_Zone_Offset")
    protected String timeZoneOffset;
    @XmlElement(name = "Offset_Hours")
    protected String offsetHours;
    @XmlElement(name = "Offset_Minutes")
    protected String offsetMinutes;
    @XmlElement(name = "Daylight_savings_rule")
    protected String daylightSavingsRule;
    @XmlElement(name = "Skill")
    protected List<ArrayType> skill;
    @XmlElement(name = "Var_Description")
    protected List<ArrayType> varDescription;
    @XmlElement(name = "Var_Assignment")
    protected List<ArrayType> varAssignment;

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
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the vectorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectorNumber() {
        return vectorNumber;
    }

    /**
     * Sets the value of the vectorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectorNumber(String value) {
        this.vectorNumber = value;
    }

    /**
     * Gets the value of the attendantVectoring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantVectoring() {
        return attendantVectoring;
    }

    /**
     * Sets the value of the attendantVectoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantVectoring(String value) {
        this.attendantVectoring = value;
    }

    /**
     * Gets the value of the meetMeConferencing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeConferencing() {
        return meetMeConferencing;
    }

    /**
     * Sets the value of the meetMeConferencing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeConferencing(String value) {
        this.meetMeConferencing = value;
    }

    /**
     * Gets the value of the allowVDNOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowVDNOverride() {
        return allowVDNOverride;
    }

    /**
     * Sets the value of the allowVDNOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowVDNOverride(String value) {
        this.allowVDNOverride = value;
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
     * Gets the value of the tn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN() {
        return tn;
    }

    /**
     * Sets the value of the tn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN(String value) {
        this.tn = value;
    }

    /**
     * Gets the value of the measured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasured() {
        return measured;
    }

    /**
     * Sets the value of the measured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasured(String value) {
        this.measured = value;
    }

    /**
     * Gets the value of the reportAdjunctCallsAsACD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportAdjunctCallsAsACD() {
        return reportAdjunctCallsAsACD;
    }

    /**
     * Sets the value of the reportAdjunctCallsAsACD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportAdjunctCallsAsACD(String value) {
        this.reportAdjunctCallsAsACD = value;
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
     * Gets the value of the serviceObjective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceObjective() {
        return serviceObjective;
    }

    /**
     * Sets the value of the serviceObjective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceObjective(String value) {
        this.serviceObjective = value;
    }

    /**
     * Gets the value of the vdnOfOriginAnncExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVDNOfOriginAnncExt() {
        return vdnOfOriginAnncExt;
    }

    /**
     * Sets the value of the vdnOfOriginAnncExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVDNOfOriginAnncExt(String value) {
        this.vdnOfOriginAnncExt = value;
    }

    /**
     * Gets the value of the nativeName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName1() {
        return nativeName1;
    }

    /**
     * Sets the value of the nativeName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName1(String value) {
        this.nativeName1 = value;
    }

    /**
     * Gets the value of the nativeName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName2() {
        return nativeName2;
    }

    /**
     * Sets the value of the nativeName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName2(String value) {
        this.nativeName2 = value;
    }

    /**
     * Gets the value of the nativeName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName3() {
        return nativeName3;
    }

    /**
     * Sets the value of the nativeName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName3(String value) {
        this.nativeName3 = value;
    }

    /**
     * Gets the value of the nativeName4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName4() {
        return nativeName4;
    }

    /**
     * Sets the value of the nativeName4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName4(String value) {
        this.nativeName4 = value;
    }

    /**
     * Gets the value of the nativeName5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName5() {
        return nativeName5;
    }

    /**
     * Sets the value of the nativeName5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName5(String value) {
        this.nativeName5 = value;
    }

    /**
     * Gets the value of the nativeNameScripts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeNameScripts() {
        return nativeNameScripts;
    }

    /**
     * Sets the value of the nativeNameScripts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeNameScripts(String value) {
        this.nativeNameScripts = value;
    }

    /**
     * Gets the value of the audixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUDIXName() {
        return audixName;
    }

    /**
     * Sets the value of the audixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUDIXName(String value) {
        this.audixName = value;
    }

    /**
     * Gets the value of the returnDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDestination() {
        return returnDestination;
    }

    /**
     * Sets the value of the returnDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDestination(String value) {
        this.returnDestination = value;
    }

    /**
     * Gets the value of the vdnTimedACWInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVDNTimedACWInterval() {
        return vdnTimedACWInterval;
    }

    /**
     * Sets the value of the vdnTimedACWInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVDNTimedACWInterval(String value) {
        this.vdnTimedACWInterval = value;
    }

    /**
     * Gets the value of the afterXferOrHeldCallDrops property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfterXferOrHeldCallDrops() {
        return afterXferOrHeldCallDrops;
    }

    /**
     * Sets the value of the afterXferOrHeldCallDrops property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfterXferOrHeldCallDrops(String value) {
        this.afterXferOrHeldCallDrops = value;
    }

    /**
     * Gets the value of the bsrApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSRApplication() {
        return bsrApplication;
    }

    /**
     * Sets the value of the bsrApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSRApplication(String value) {
        this.bsrApplication = value;
    }

    /**
     * Gets the value of the bsrAvailableAgentStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSRAvailableAgentStrategy() {
        return bsrAvailableAgentStrategy;
    }

    /**
     * Sets the value of the bsrAvailableAgentStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSRAvailableAgentStrategy(String value) {
        this.bsrAvailableAgentStrategy = value;
    }

    /**
     * Gets the value of the bsrTieStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSRTieStrategy() {
        return bsrTieStrategy;
    }

    /**
     * Sets the value of the bsrTieStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSRTieStrategy(String value) {
        this.bsrTieStrategy = value;
    }

    /**
     * Gets the value of the delayPSTNConnectMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayPSTNConnectMessage() {
        return delayPSTNConnectMessage;
    }

    /**
     * Sets the value of the delayPSTNConnectMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayPSTNConnectMessage(String value) {
        this.delayPSTNConnectMessage = value;
    }

    /**
     * Gets the value of the observeOnAgentAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObserveOnAgentAnswer() {
        return observeOnAgentAnswer;
    }

    /**
     * Sets the value of the observeOnAgentAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObserveOnAgentAnswer(String value) {
        this.observeOnAgentAnswer = value;
    }

    /**
     * Gets the value of the delayPSTNConnectMessageOnAgentAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayPSTNConnectMessageOnAgentAnswer() {
        return delayPSTNConnectMessageOnAgentAnswer;
    }

    /**
     * Sets the value of the delayPSTNConnectMessageOnAgentAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayPSTNConnectMessageOnAgentAnswer(String value) {
        this.delayPSTNConnectMessageOnAgentAnswer = value;
    }

    /**
     * Gets the value of the sendVDNAsCalledRingingNameOverQSIG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendVDNAsCalledRingingNameOverQSIG() {
        return sendVDNAsCalledRingingNameOverQSIG;
    }

    /**
     * Sets the value of the sendVDNAsCalledRingingNameOverQSIG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendVDNAsCalledRingingNameOverQSIG(String value) {
        this.sendVDNAsCalledRingingNameOverQSIG = value;
    }

    /**
     * Gets the value of the forwardHeldCallCPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardHeldCallCPN() {
        return forwardHeldCallCPN;
    }

    /**
     * Sets the value of the forwardHeldCallCPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardHeldCallCPN(String value) {
        this.forwardHeldCallCPN = value;
    }

    /**
     * Gets the value of the displayVDNForRouteToDAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayVDNForRouteToDAC() {
        return displayVDNForRouteToDAC;
    }

    /**
     * Sets the value of the displayVDNForRouteToDAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayVDNForRouteToDAC(String value) {
        this.displayVDNForRouteToDAC = value;
    }

    /**
     * Gets the value of the vdnOverrideForIDSNTrunkASAIMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVDNOverrideForIDSNTrunkASAIMsgs() {
        return vdnOverrideForIDSNTrunkASAIMsgs;
    }

    /**
     * Sets the value of the vdnOverrideForIDSNTrunkASAIMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVDNOverrideForIDSNTrunkASAIMsgs(String value) {
        this.vdnOverrideForIDSNTrunkASAIMsgs = value;
    }

    /**
     * Gets the value of the backgroundBSRPolling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundBSRPolling() {
        return backgroundBSRPolling;
    }

    /**
     * Sets the value of the backgroundBSRPolling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundBSRPolling(String value) {
        this.backgroundBSRPolling = value;
    }

    /**
     * Gets the value of the unassignedExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnassignedExtension() {
        return unassignedExtension;
    }

    /**
     * Sets the value of the unassignedExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnassignedExtension(String value) {
        this.unassignedExtension = value;
    }

    /**
     * Gets the value of the bsrLocalTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSRLocalTreatment() {
        return bsrLocalTreatment;
    }

    /**
     * Sets the value of the bsrLocalTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSRLocalTreatment(String value) {
        this.bsrLocalTreatment = value;
    }

    /**
     * Gets the value of the reportingForPCPredictiveCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingForPCPredictiveCalls() {
        return reportingForPCPredictiveCalls;
    }

    /**
     * Sets the value of the reportingForPCPredictiveCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingForPCPredictiveCalls(String value) {
        this.reportingForPCPredictiveCalls = value;
    }

    /**
     * Gets the value of the passPrefixedCPNToVDNVector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassPrefixedCPNToVDNVector() {
        return passPrefixedCPNToVDNVector;
    }

    /**
     * Sets the value of the passPrefixedCPNToVDNVector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassPrefixedCPNToVDNVector(String value) {
        this.passPrefixedCPNToVDNVector = value;
    }

    /**
     * Gets the value of the conferenceAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceAccessCode() {
        return conferenceAccessCode;
    }

    /**
     * Sets the value of the conferenceAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceAccessCode(String value) {
        this.conferenceAccessCode = value;
    }

    /**
     * Gets the value of the conferenceController property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceController() {
        return conferenceController;
    }

    /**
     * Sets the value of the conferenceController property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceController(String value) {
        this.conferenceController = value;
    }

    /**
     * Gets the value of the conferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceType() {
        return conferenceType;
    }

    /**
     * Sets the value of the conferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceType(String value) {
        this.conferenceType = value;
    }

    /**
     * Gets the value of the routeToNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteToNumber() {
        return routeToNumber;
    }

    /**
     * Sets the value of the routeToNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteToNumber(String value) {
        this.routeToNumber = value;
    }

    /**
     * Gets the value of the timeZoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneOffset() {
        return timeZoneOffset;
    }

    /**
     * Sets the value of the timeZoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneOffset(String value) {
        this.timeZoneOffset = value;
    }

    /**
     * Gets the value of the offsetHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetHours() {
        return offsetHours;
    }

    /**
     * Sets the value of the offsetHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetHours(String value) {
        this.offsetHours = value;
    }

    /**
     * Gets the value of the offsetMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetMinutes() {
        return offsetMinutes;
    }

    /**
     * Sets the value of the offsetMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetMinutes(String value) {
        this.offsetMinutes = value;
    }

    /**
     * Gets the value of the daylightSavingsRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaylightSavingsRule() {
        return daylightSavingsRule;
    }

    /**
     * Sets the value of the daylightSavingsRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaylightSavingsRule(String value) {
        this.daylightSavingsRule = value;
    }

    /**
     * Gets the value of the skill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSkill() {
        if (skill == null) {
            skill = new ArrayList<ArrayType>();
        }
        return this.skill;
    }

    /**
     * Gets the value of the varDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the varDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVarDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getVarDescription() {
        if (varDescription == null) {
            varDescription = new ArrayList<ArrayType>();
        }
        return this.varDescription;
    }

    /**
     * Gets the value of the varAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the varAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVarAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getVarAssignment() {
        if (varAssignment == null) {
            varAssignment = new ArrayList<ArrayType>();
        }
        return this.varAssignment;
    }

}
