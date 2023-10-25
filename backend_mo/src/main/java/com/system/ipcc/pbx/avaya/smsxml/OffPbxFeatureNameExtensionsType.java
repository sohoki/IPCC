
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OffPbxFeatureNameExtensionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffPbxFeatureNameExtensionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Set_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active_Appearance_Select" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Automatic_Call_Back" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Automatic_Call_Back_Cancel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Forward_All" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Forward_Busy_No_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Forward_Cancel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Park" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Park_Answer_Back" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Pick_Up" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Calling_Number_Block" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Calling_Number_Unblock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Conditional_Call_Extend_Enable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Conditional_Call_Extend_Disable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Conference_Complete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Conference_on_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Directed_Call_Pick_Up" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Drop_Last_Added_Party" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exclusion_Toggle_On_Off" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extended_Group_Call_Pickup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Held_Appearance_Select" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idle_Appearance_Select" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Number_Dialed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Malicious_Call_Trace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Malicious_Call_Trace_Cancel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Off_Pbx_Call_Enable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Off_Pbx_Call_Disable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority_Call" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Send_All_Calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Send_All_Calls_Cancel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transfer_Complete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transfer_On_Hang_Up" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transfer_to_Voice_Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Whisper_Page_Activation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffPbxFeatureNameExtensionsType", propOrder = {
    "setName",
    "activeAppearanceSelect",
    "automaticCallBack",
    "automaticCallBackCancel",
    "callForwardAll",
    "callForwardBusyNoAnswer",
    "callForwardCancel",
    "callPark",
    "callParkAnswerBack",
    "callPickUp",
    "callingNumberBlock",
    "callingNumberUnblock",
    "conditionalCallExtendEnable",
    "conditionalCallExtendDisable",
    "conferenceComplete",
    "conferenceOnAnswer",
    "directedCallPickUp",
    "dropLastAddedParty",
    "exclusionToggleOnOff",
    "extendedGroupCallPickup",
    "heldAppearanceSelect",
    "idleAppearanceSelect",
    "lastNumberDialed",
    "maliciousCallTrace",
    "maliciousCallTraceCancel",
    "offPbxCallEnable",
    "offPbxCallDisable",
    "priorityCall",
    "recall",
    "sendAllCalls",
    "sendAllCallsCancel",
    "transferComplete",
    "transferOnHangUp",
    "transferToVoiceMail",
    "whisperPageActivation"
})
public class OffPbxFeatureNameExtensionsType {

    @XmlElement(name = "Set_Name")
    protected String setName;
    @XmlElement(name = "Active_Appearance_Select")
    protected String activeAppearanceSelect;
    @XmlElement(name = "Automatic_Call_Back")
    protected String automaticCallBack;
    @XmlElement(name = "Automatic_Call_Back_Cancel")
    protected String automaticCallBackCancel;
    @XmlElement(name = "Call_Forward_All")
    protected String callForwardAll;
    @XmlElement(name = "Call_Forward_Busy_No_Answer")
    protected String callForwardBusyNoAnswer;
    @XmlElement(name = "Call_Forward_Cancel")
    protected String callForwardCancel;
    @XmlElement(name = "Call_Park")
    protected String callPark;
    @XmlElement(name = "Call_Park_Answer_Back")
    protected String callParkAnswerBack;
    @XmlElement(name = "Call_Pick_Up")
    protected String callPickUp;
    @XmlElement(name = "Calling_Number_Block")
    protected String callingNumberBlock;
    @XmlElement(name = "Calling_Number_Unblock")
    protected String callingNumberUnblock;
    @XmlElement(name = "Conditional_Call_Extend_Enable")
    protected String conditionalCallExtendEnable;
    @XmlElement(name = "Conditional_Call_Extend_Disable")
    protected String conditionalCallExtendDisable;
    @XmlElement(name = "Conference_Complete")
    protected String conferenceComplete;
    @XmlElement(name = "Conference_on_Answer")
    protected String conferenceOnAnswer;
    @XmlElement(name = "Directed_Call_Pick_Up")
    protected String directedCallPickUp;
    @XmlElement(name = "Drop_Last_Added_Party")
    protected String dropLastAddedParty;
    @XmlElement(name = "Exclusion_Toggle_On_Off")
    protected String exclusionToggleOnOff;
    @XmlElement(name = "Extended_Group_Call_Pickup")
    protected String extendedGroupCallPickup;
    @XmlElement(name = "Held_Appearance_Select")
    protected String heldAppearanceSelect;
    @XmlElement(name = "Idle_Appearance_Select")
    protected String idleAppearanceSelect;
    @XmlElement(name = "Last_Number_Dialed")
    protected String lastNumberDialed;
    @XmlElement(name = "Malicious_Call_Trace")
    protected String maliciousCallTrace;
    @XmlElement(name = "Malicious_Call_Trace_Cancel")
    protected String maliciousCallTraceCancel;
    @XmlElement(name = "Off_Pbx_Call_Enable")
    protected String offPbxCallEnable;
    @XmlElement(name = "Off_Pbx_Call_Disable")
    protected String offPbxCallDisable;
    @XmlElement(name = "Priority_Call")
    protected String priorityCall;
    @XmlElement(name = "Recall")
    protected String recall;
    @XmlElement(name = "Send_All_Calls")
    protected String sendAllCalls;
    @XmlElement(name = "Send_All_Calls_Cancel")
    protected String sendAllCallsCancel;
    @XmlElement(name = "Transfer_Complete")
    protected String transferComplete;
    @XmlElement(name = "Transfer_On_Hang_Up")
    protected String transferOnHangUp;
    @XmlElement(name = "Transfer_to_Voice_Mail")
    protected String transferToVoiceMail;
    @XmlElement(name = "Whisper_Page_Activation")
    protected String whisperPageActivation;

    /**
     * Gets the value of the setName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetName() {
        return setName;
    }

    /**
     * Sets the value of the setName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetName(String value) {
        this.setName = value;
    }

    /**
     * Gets the value of the activeAppearanceSelect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveAppearanceSelect() {
        return activeAppearanceSelect;
    }

    /**
     * Sets the value of the activeAppearanceSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveAppearanceSelect(String value) {
        this.activeAppearanceSelect = value;
    }

    /**
     * Gets the value of the automaticCallBack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticCallBack() {
        return automaticCallBack;
    }

    /**
     * Sets the value of the automaticCallBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticCallBack(String value) {
        this.automaticCallBack = value;
    }

    /**
     * Gets the value of the automaticCallBackCancel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticCallBackCancel() {
        return automaticCallBackCancel;
    }

    /**
     * Sets the value of the automaticCallBackCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticCallBackCancel(String value) {
        this.automaticCallBackCancel = value;
    }

    /**
     * Gets the value of the callForwardAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallForwardAll() {
        return callForwardAll;
    }

    /**
     * Sets the value of the callForwardAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallForwardAll(String value) {
        this.callForwardAll = value;
    }

    /**
     * Gets the value of the callForwardBusyNoAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallForwardBusyNoAnswer() {
        return callForwardBusyNoAnswer;
    }

    /**
     * Sets the value of the callForwardBusyNoAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallForwardBusyNoAnswer(String value) {
        this.callForwardBusyNoAnswer = value;
    }

    /**
     * Gets the value of the callForwardCancel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallForwardCancel() {
        return callForwardCancel;
    }

    /**
     * Sets the value of the callForwardCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallForwardCancel(String value) {
        this.callForwardCancel = value;
    }

    /**
     * Gets the value of the callPark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallPark() {
        return callPark;
    }

    /**
     * Sets the value of the callPark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallPark(String value) {
        this.callPark = value;
    }

    /**
     * Gets the value of the callParkAnswerBack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallParkAnswerBack() {
        return callParkAnswerBack;
    }

    /**
     * Sets the value of the callParkAnswerBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallParkAnswerBack(String value) {
        this.callParkAnswerBack = value;
    }

    /**
     * Gets the value of the callPickUp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallPickUp() {
        return callPickUp;
    }

    /**
     * Sets the value of the callPickUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallPickUp(String value) {
        this.callPickUp = value;
    }

    /**
     * Gets the value of the callingNumberBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingNumberBlock() {
        return callingNumberBlock;
    }

    /**
     * Sets the value of the callingNumberBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingNumberBlock(String value) {
        this.callingNumberBlock = value;
    }

    /**
     * Gets the value of the callingNumberUnblock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingNumberUnblock() {
        return callingNumberUnblock;
    }

    /**
     * Sets the value of the callingNumberUnblock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingNumberUnblock(String value) {
        this.callingNumberUnblock = value;
    }

    /**
     * Gets the value of the conditionalCallExtendEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionalCallExtendEnable() {
        return conditionalCallExtendEnable;
    }

    /**
     * Sets the value of the conditionalCallExtendEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionalCallExtendEnable(String value) {
        this.conditionalCallExtendEnable = value;
    }

    /**
     * Gets the value of the conditionalCallExtendDisable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionalCallExtendDisable() {
        return conditionalCallExtendDisable;
    }

    /**
     * Sets the value of the conditionalCallExtendDisable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionalCallExtendDisable(String value) {
        this.conditionalCallExtendDisable = value;
    }

    /**
     * Gets the value of the conferenceComplete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceComplete() {
        return conferenceComplete;
    }

    /**
     * Sets the value of the conferenceComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceComplete(String value) {
        this.conferenceComplete = value;
    }

    /**
     * Gets the value of the conferenceOnAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceOnAnswer() {
        return conferenceOnAnswer;
    }

    /**
     * Sets the value of the conferenceOnAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceOnAnswer(String value) {
        this.conferenceOnAnswer = value;
    }

    /**
     * Gets the value of the directedCallPickUp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectedCallPickUp() {
        return directedCallPickUp;
    }

    /**
     * Sets the value of the directedCallPickUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectedCallPickUp(String value) {
        this.directedCallPickUp = value;
    }

    /**
     * Gets the value of the dropLastAddedParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropLastAddedParty() {
        return dropLastAddedParty;
    }

    /**
     * Sets the value of the dropLastAddedParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropLastAddedParty(String value) {
        this.dropLastAddedParty = value;
    }

    /**
     * Gets the value of the exclusionToggleOnOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusionToggleOnOff() {
        return exclusionToggleOnOff;
    }

    /**
     * Sets the value of the exclusionToggleOnOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusionToggleOnOff(String value) {
        this.exclusionToggleOnOff = value;
    }

    /**
     * Gets the value of the extendedGroupCallPickup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedGroupCallPickup() {
        return extendedGroupCallPickup;
    }

    /**
     * Sets the value of the extendedGroupCallPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedGroupCallPickup(String value) {
        this.extendedGroupCallPickup = value;
    }

    /**
     * Gets the value of the heldAppearanceSelect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeldAppearanceSelect() {
        return heldAppearanceSelect;
    }

    /**
     * Sets the value of the heldAppearanceSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeldAppearanceSelect(String value) {
        this.heldAppearanceSelect = value;
    }

    /**
     * Gets the value of the idleAppearanceSelect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdleAppearanceSelect() {
        return idleAppearanceSelect;
    }

    /**
     * Sets the value of the idleAppearanceSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdleAppearanceSelect(String value) {
        this.idleAppearanceSelect = value;
    }

    /**
     * Gets the value of the lastNumberDialed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNumberDialed() {
        return lastNumberDialed;
    }

    /**
     * Sets the value of the lastNumberDialed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNumberDialed(String value) {
        this.lastNumberDialed = value;
    }

    /**
     * Gets the value of the maliciousCallTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaliciousCallTrace() {
        return maliciousCallTrace;
    }

    /**
     * Sets the value of the maliciousCallTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaliciousCallTrace(String value) {
        this.maliciousCallTrace = value;
    }

    /**
     * Gets the value of the maliciousCallTraceCancel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaliciousCallTraceCancel() {
        return maliciousCallTraceCancel;
    }

    /**
     * Sets the value of the maliciousCallTraceCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaliciousCallTraceCancel(String value) {
        this.maliciousCallTraceCancel = value;
    }

    /**
     * Gets the value of the offPbxCallEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPbxCallEnable() {
        return offPbxCallEnable;
    }

    /**
     * Sets the value of the offPbxCallEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPbxCallEnable(String value) {
        this.offPbxCallEnable = value;
    }

    /**
     * Gets the value of the offPbxCallDisable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPbxCallDisable() {
        return offPbxCallDisable;
    }

    /**
     * Sets the value of the offPbxCallDisable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPbxCallDisable(String value) {
        this.offPbxCallDisable = value;
    }

    /**
     * Gets the value of the priorityCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityCall() {
        return priorityCall;
    }

    /**
     * Sets the value of the priorityCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityCall(String value) {
        this.priorityCall = value;
    }

    /**
     * Gets the value of the recall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecall() {
        return recall;
    }

    /**
     * Sets the value of the recall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecall(String value) {
        this.recall = value;
    }

    /**
     * Gets the value of the sendAllCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendAllCalls() {
        return sendAllCalls;
    }

    /**
     * Sets the value of the sendAllCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendAllCalls(String value) {
        this.sendAllCalls = value;
    }

    /**
     * Gets the value of the sendAllCallsCancel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendAllCallsCancel() {
        return sendAllCallsCancel;
    }

    /**
     * Sets the value of the sendAllCallsCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendAllCallsCancel(String value) {
        this.sendAllCallsCancel = value;
    }

    /**
     * Gets the value of the transferComplete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferComplete() {
        return transferComplete;
    }

    /**
     * Sets the value of the transferComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferComplete(String value) {
        this.transferComplete = value;
    }

    /**
     * Gets the value of the transferOnHangUp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferOnHangUp() {
        return transferOnHangUp;
    }

    /**
     * Sets the value of the transferOnHangUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferOnHangUp(String value) {
        this.transferOnHangUp = value;
    }

    /**
     * Gets the value of the transferToVoiceMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToVoiceMail() {
        return transferToVoiceMail;
    }

    /**
     * Sets the value of the transferToVoiceMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToVoiceMail(String value) {
        this.transferToVoiceMail = value;
    }

    /**
     * Gets the value of the whisperPageActivation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhisperPageActivation() {
        return whisperPageActivation;
    }

    /**
     * Sets the value of the whisperPageActivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhisperPageActivation(String value) {
        this.whisperPageActivation = value;
    }

}
