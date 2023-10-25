
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonalCOLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalCOLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Group_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Group_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Access_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_Members" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CDR_Reports" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Data_Restriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Security_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_Dial_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prefix1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disconnect_Supervision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Chrarge_Conversion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Decimal_Point" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency_Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Charge_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Group_Direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disconnect_Timing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Termination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Analog_Loss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Digital_Loss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Still_Held" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Receive_Answer_Supervision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In_Disconnect_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In_Glare_Guard_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ring_Monitor_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_End_Dial_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Programmed_Dial_Pause_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flash_Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_Disconnect_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_Dial_Gaurd_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_Glare_Guard_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_Rotary_Dial_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In_Seize_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out_Seize_Response_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disconnect_Signal_Error_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="End_2_End_Signaling_Tone_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="End_2_End_Signaling_Pause_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Answer_Supervision_Timeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Make" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Make1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Break" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Break1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Periodic_Pulse_Meter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DS1_Echo_Cancel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}PersonalCOLineArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalCOLineType", propOrder = {
    "groupNumber",
    "trunkGroupType",
    "groupName",
    "trunkAccessCode",
    "numberMembers",
    "coveragePath",
    "cdrReports",
    "outDisplay",
    "dataRestriction",
    "securityCode",
    "trunkType",
    "trunkPort",
    "trunkName",
    "outDialType",
    "prefix1",
    "disconnectSupervision",
    "gain",
    "chrargeConversion",
    "decimalPoint",
    "currencySymbol",
    "chargeType",
    "trunkGroupDirection",
    "disconnectTiming",
    "trunkTermination",
    "analogLoss",
    "digitalLoss",
    "callStillHeld",
    "receiveAnswerSupervision",
    "country",
    "inDisconnectTime",
    "inGlareGuardTime",
    "ringMonitorTime",
    "outEndDialTime",
    "programmedDialPauseTime",
    "flashLength",
    "outDisconnectTime",
    "outDialGaurdTime",
    "outGlareGuardTime",
    "outRotaryDialTime",
    "inSeizeTime",
    "outSeizeResponseTime",
    "disconnectSignalErrorTime",
    "end2EndSignalingToneTime",
    "end2EndSignalingPauseTime",
    "answerSupervisionTimeout",
    "pps",
    "make",
    "make1",
    "_break",
    "break1",
    "periodicPulseMeter",
    "ds1EchoCancel",
    "extension",
    "extName"
})
public class PersonalCOLineType {

    @XmlElement(name = "Group_Number")
    protected String groupNumber;
    @XmlElement(name = "Trunk_Group_Type")
    protected String trunkGroupType;
    @XmlElement(name = "Group_Name")
    protected String groupName;
    @XmlElement(name = "Trunk_Access_Code")
    protected String trunkAccessCode;
    @XmlElement(name = "Number_Members")
    protected String numberMembers;
    @XmlElement(name = "Coverage_Path")
    protected String coveragePath;
    @XmlElement(name = "CDR_Reports")
    protected String cdrReports;
    @XmlElement(name = "Out_Display")
    protected String outDisplay;
    @XmlElement(name = "Data_Restriction")
    protected String dataRestriction;
    @XmlElement(name = "Security_Code")
    protected String securityCode;
    @XmlElement(name = "Trunk_Type")
    protected String trunkType;
    @XmlElement(name = "Trunk_Port")
    protected String trunkPort;
    @XmlElement(name = "Trunk_Name")
    protected String trunkName;
    @XmlElement(name = "Out_Dial_Type")
    protected String outDialType;
    @XmlElement(name = "Prefix1")
    protected String prefix1;
    @XmlElement(name = "Disconnect_Supervision")
    protected String disconnectSupervision;
    @XmlElement(name = "Gain")
    protected String gain;
    @XmlElement(name = "Chrarge_Conversion")
    protected String chrargeConversion;
    @XmlElement(name = "Decimal_Point")
    protected String decimalPoint;
    @XmlElement(name = "Currency_Symbol")
    protected String currencySymbol;
    @XmlElement(name = "Charge_Type")
    protected String chargeType;
    @XmlElement(name = "Trunk_Group_Direction")
    protected String trunkGroupDirection;
    @XmlElement(name = "Disconnect_Timing")
    protected String disconnectTiming;
    @XmlElement(name = "Trunk_Termination")
    protected String trunkTermination;
    @XmlElement(name = "Analog_Loss")
    protected String analogLoss;
    @XmlElement(name = "Digital_Loss")
    protected String digitalLoss;
    @XmlElement(name = "Call_Still_Held")
    protected String callStillHeld;
    @XmlElement(name = "Receive_Answer_Supervision")
    protected String receiveAnswerSupervision;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "In_Disconnect_Time")
    protected String inDisconnectTime;
    @XmlElement(name = "In_Glare_Guard_Time")
    protected String inGlareGuardTime;
    @XmlElement(name = "Ring_Monitor_Time")
    protected String ringMonitorTime;
    @XmlElement(name = "Out_End_Dial_Time")
    protected String outEndDialTime;
    @XmlElement(name = "Programmed_Dial_Pause_Time")
    protected String programmedDialPauseTime;
    @XmlElement(name = "Flash_Length")
    protected String flashLength;
    @XmlElement(name = "Out_Disconnect_Time")
    protected String outDisconnectTime;
    @XmlElement(name = "Out_Dial_Gaurd_Time")
    protected String outDialGaurdTime;
    @XmlElement(name = "Out_Glare_Guard_Time")
    protected String outGlareGuardTime;
    @XmlElement(name = "Out_Rotary_Dial_Time")
    protected String outRotaryDialTime;
    @XmlElement(name = "In_Seize_Time")
    protected String inSeizeTime;
    @XmlElement(name = "Out_Seize_Response_Time")
    protected String outSeizeResponseTime;
    @XmlElement(name = "Disconnect_Signal_Error_Time")
    protected String disconnectSignalErrorTime;
    @XmlElement(name = "End_2_End_Signaling_Tone_Time")
    protected String end2EndSignalingToneTime;
    @XmlElement(name = "End_2_End_Signaling_Pause_Time")
    protected String end2EndSignalingPauseTime;
    @XmlElement(name = "Answer_Supervision_Timeout")
    protected String answerSupervisionTimeout;
    @XmlElement(name = "PPS")
    protected String pps;
    @XmlElement(name = "Make")
    protected String make;
    @XmlElement(name = "Make1")
    protected String make1;
    @XmlElement(name = "Break")
    protected String _break;
    @XmlElement(name = "Break1")
    protected String break1;
    @XmlElement(name = "Periodic_Pulse_Meter")
    protected String periodicPulseMeter;
    @XmlElement(name = "DS1_Echo_Cancel")
    protected String ds1EchoCancel;
    @XmlElement(name = "Extension")
    protected List<ArrayType> extension;
    @XmlElement(name = "Ext_Name")
    protected List<ArrayType> extName;

    /**
     * Gets the value of the groupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupNumber() {
        return groupNumber;
    }

    /**
     * Sets the value of the groupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupNumber(String value) {
        this.groupNumber = value;
    }

    /**
     * Gets the value of the trunkGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkGroupType() {
        return trunkGroupType;
    }

    /**
     * Sets the value of the trunkGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkGroupType(String value) {
        this.trunkGroupType = value;
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
     * Gets the value of the trunkAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkAccessCode() {
        return trunkAccessCode;
    }

    /**
     * Sets the value of the trunkAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkAccessCode(String value) {
        this.trunkAccessCode = value;
    }

    /**
     * Gets the value of the numberMembers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberMembers() {
        return numberMembers;
    }

    /**
     * Sets the value of the numberMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberMembers(String value) {
        this.numberMembers = value;
    }

    /**
     * Gets the value of the coveragePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveragePath() {
        return coveragePath;
    }

    /**
     * Sets the value of the coveragePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveragePath(String value) {
        this.coveragePath = value;
    }

    /**
     * Gets the value of the cdrReports property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDRReports() {
        return cdrReports;
    }

    /**
     * Sets the value of the cdrReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDRReports(String value) {
        this.cdrReports = value;
    }

    /**
     * Gets the value of the outDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDisplay() {
        return outDisplay;
    }

    /**
     * Sets the value of the outDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDisplay(String value) {
        this.outDisplay = value;
    }

    /**
     * Gets the value of the dataRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRestriction() {
        return dataRestriction;
    }

    /**
     * Sets the value of the dataRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRestriction(String value) {
        this.dataRestriction = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Sets the value of the securityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCode(String value) {
        this.securityCode = value;
    }

    /**
     * Gets the value of the trunkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkType() {
        return trunkType;
    }

    /**
     * Sets the value of the trunkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkType(String value) {
        this.trunkType = value;
    }

    /**
     * Gets the value of the trunkPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkPort() {
        return trunkPort;
    }

    /**
     * Sets the value of the trunkPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkPort(String value) {
        this.trunkPort = value;
    }

    /**
     * Gets the value of the trunkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkName() {
        return trunkName;
    }

    /**
     * Sets the value of the trunkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkName(String value) {
        this.trunkName = value;
    }

    /**
     * Gets the value of the outDialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDialType() {
        return outDialType;
    }

    /**
     * Sets the value of the outDialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDialType(String value) {
        this.outDialType = value;
    }

    /**
     * Gets the value of the prefix1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix1() {
        return prefix1;
    }

    /**
     * Sets the value of the prefix1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix1(String value) {
        this.prefix1 = value;
    }

    /**
     * Gets the value of the disconnectSupervision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisconnectSupervision() {
        return disconnectSupervision;
    }

    /**
     * Sets the value of the disconnectSupervision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisconnectSupervision(String value) {
        this.disconnectSupervision = value;
    }

    /**
     * Gets the value of the gain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGain() {
        return gain;
    }

    /**
     * Sets the value of the gain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGain(String value) {
        this.gain = value;
    }

    /**
     * Gets the value of the chrargeConversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrargeConversion() {
        return chrargeConversion;
    }

    /**
     * Sets the value of the chrargeConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChrargeConversion(String value) {
        this.chrargeConversion = value;
    }

    /**
     * Gets the value of the decimalPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalPoint() {
        return decimalPoint;
    }

    /**
     * Sets the value of the decimalPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalPoint(String value) {
        this.decimalPoint = value;
    }

    /**
     * Gets the value of the currencySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * Sets the value of the currencySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencySymbol(String value) {
        this.currencySymbol = value;
    }

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeType(String value) {
        this.chargeType = value;
    }

    /**
     * Gets the value of the trunkGroupDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkGroupDirection() {
        return trunkGroupDirection;
    }

    /**
     * Sets the value of the trunkGroupDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkGroupDirection(String value) {
        this.trunkGroupDirection = value;
    }

    /**
     * Gets the value of the disconnectTiming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisconnectTiming() {
        return disconnectTiming;
    }

    /**
     * Sets the value of the disconnectTiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisconnectTiming(String value) {
        this.disconnectTiming = value;
    }

    /**
     * Gets the value of the trunkTermination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkTermination() {
        return trunkTermination;
    }

    /**
     * Sets the value of the trunkTermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkTermination(String value) {
        this.trunkTermination = value;
    }

    /**
     * Gets the value of the analogLoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalogLoss() {
        return analogLoss;
    }

    /**
     * Sets the value of the analogLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalogLoss(String value) {
        this.analogLoss = value;
    }

    /**
     * Gets the value of the digitalLoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalLoss() {
        return digitalLoss;
    }

    /**
     * Sets the value of the digitalLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalLoss(String value) {
        this.digitalLoss = value;
    }

    /**
     * Gets the value of the callStillHeld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallStillHeld() {
        return callStillHeld;
    }

    /**
     * Sets the value of the callStillHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallStillHeld(String value) {
        this.callStillHeld = value;
    }

    /**
     * Gets the value of the receiveAnswerSupervision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveAnswerSupervision() {
        return receiveAnswerSupervision;
    }

    /**
     * Sets the value of the receiveAnswerSupervision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveAnswerSupervision(String value) {
        this.receiveAnswerSupervision = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the inDisconnectTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDisconnectTime() {
        return inDisconnectTime;
    }

    /**
     * Sets the value of the inDisconnectTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDisconnectTime(String value) {
        this.inDisconnectTime = value;
    }

    /**
     * Gets the value of the inGlareGuardTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGlareGuardTime() {
        return inGlareGuardTime;
    }

    /**
     * Sets the value of the inGlareGuardTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGlareGuardTime(String value) {
        this.inGlareGuardTime = value;
    }

    /**
     * Gets the value of the ringMonitorTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingMonitorTime() {
        return ringMonitorTime;
    }

    /**
     * Sets the value of the ringMonitorTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingMonitorTime(String value) {
        this.ringMonitorTime = value;
    }

    /**
     * Gets the value of the outEndDialTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEndDialTime() {
        return outEndDialTime;
    }

    /**
     * Sets the value of the outEndDialTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEndDialTime(String value) {
        this.outEndDialTime = value;
    }

    /**
     * Gets the value of the programmedDialPauseTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgrammedDialPauseTime() {
        return programmedDialPauseTime;
    }

    /**
     * Sets the value of the programmedDialPauseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgrammedDialPauseTime(String value) {
        this.programmedDialPauseTime = value;
    }

    /**
     * Gets the value of the flashLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashLength() {
        return flashLength;
    }

    /**
     * Sets the value of the flashLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashLength(String value) {
        this.flashLength = value;
    }

    /**
     * Gets the value of the outDisconnectTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDisconnectTime() {
        return outDisconnectTime;
    }

    /**
     * Sets the value of the outDisconnectTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDisconnectTime(String value) {
        this.outDisconnectTime = value;
    }

    /**
     * Gets the value of the outDialGaurdTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDialGaurdTime() {
        return outDialGaurdTime;
    }

    /**
     * Sets the value of the outDialGaurdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDialGaurdTime(String value) {
        this.outDialGaurdTime = value;
    }

    /**
     * Gets the value of the outGlareGuardTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGlareGuardTime() {
        return outGlareGuardTime;
    }

    /**
     * Sets the value of the outGlareGuardTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGlareGuardTime(String value) {
        this.outGlareGuardTime = value;
    }

    /**
     * Gets the value of the outRotaryDialTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRotaryDialTime() {
        return outRotaryDialTime;
    }

    /**
     * Sets the value of the outRotaryDialTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRotaryDialTime(String value) {
        this.outRotaryDialTime = value;
    }

    /**
     * Gets the value of the inSeizeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSeizeTime() {
        return inSeizeTime;
    }

    /**
     * Sets the value of the inSeizeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSeizeTime(String value) {
        this.inSeizeTime = value;
    }

    /**
     * Gets the value of the outSeizeResponseTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSeizeResponseTime() {
        return outSeizeResponseTime;
    }

    /**
     * Sets the value of the outSeizeResponseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSeizeResponseTime(String value) {
        this.outSeizeResponseTime = value;
    }

    /**
     * Gets the value of the disconnectSignalErrorTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisconnectSignalErrorTime() {
        return disconnectSignalErrorTime;
    }

    /**
     * Sets the value of the disconnectSignalErrorTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisconnectSignalErrorTime(String value) {
        this.disconnectSignalErrorTime = value;
    }

    /**
     * Gets the value of the end2EndSignalingToneTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd2EndSignalingToneTime() {
        return end2EndSignalingToneTime;
    }

    /**
     * Sets the value of the end2EndSignalingToneTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd2EndSignalingToneTime(String value) {
        this.end2EndSignalingToneTime = value;
    }

    /**
     * Gets the value of the end2EndSignalingPauseTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd2EndSignalingPauseTime() {
        return end2EndSignalingPauseTime;
    }

    /**
     * Sets the value of the end2EndSignalingPauseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd2EndSignalingPauseTime(String value) {
        this.end2EndSignalingPauseTime = value;
    }

    /**
     * Gets the value of the answerSupervisionTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerSupervisionTimeout() {
        return answerSupervisionTimeout;
    }

    /**
     * Sets the value of the answerSupervisionTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerSupervisionTimeout(String value) {
        this.answerSupervisionTimeout = value;
    }

    /**
     * Gets the value of the pps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPS() {
        return pps;
    }

    /**
     * Sets the value of the pps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPS(String value) {
        this.pps = value;
    }

    /**
     * Gets the value of the make property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the value of the make property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMake(String value) {
        this.make = value;
    }

    /**
     * Gets the value of the make1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake1() {
        return make1;
    }

    /**
     * Sets the value of the make1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMake1(String value) {
        this.make1 = value;
    }

    /**
     * Gets the value of the break property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreak() {
        return _break;
    }

    /**
     * Sets the value of the break property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreak(String value) {
        this._break = value;
    }

    /**
     * Gets the value of the break1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreak1() {
        return break1;
    }

    /**
     * Sets the value of the break1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreak1(String value) {
        this.break1 = value;
    }

    /**
     * Gets the value of the periodicPulseMeter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicPulseMeter() {
        return periodicPulseMeter;
    }

    /**
     * Sets the value of the periodicPulseMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicPulseMeter(String value) {
        this.periodicPulseMeter = value;
    }

    /**
     * Gets the value of the ds1EchoCancel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDS1EchoCancel() {
        return ds1EchoCancel;
    }

    /**
     * Sets the value of the ds1EchoCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDS1EchoCancel(String value) {
        this.ds1EchoCancel = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ArrayType>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the extName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getExtName() {
        if (extName == null) {
            extName = new ArrayList<ArrayType>();
        }
        return this.extName;
    }

}
