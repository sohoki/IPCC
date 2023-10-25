
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COS_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COS_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}COSArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COSType", propOrder = {
    "cosName",
    "cosGroup",
    "autoCallback",
    "callFwdAllCalls",
    "dataPrivacy",
    "priorityCalling",
    "consolePermissions",
    "offHookAlert",
    "clientRoom",
    "restrictCallFwdOffNet",
    "callForwardingBusyDA",
    "personalStationAccess",
    "extendedForwardingAll",
    "extendedForwardingBDA",
    "trkToTrkTransferOverride",
    "qsigCallOfferOriginations",
    "contactClosureActivation",
    "automaticExclusion",
    "vipCaller",
    "maskingCPNNameOverride",
    "callForwardingEnhanced",
    "priorityIpVideo",
    "adHocVideoConferencing",
    "mocControl",
    "matchBCADisplayToPrincipal",
    "dccActivationDeactivation"
})
public class COSType {

    @XmlElement(name = "COS_Name")
    protected String cosName;
    @XmlElement(name = "COS_Group")
    protected String cosGroup;
    @XmlElement(name = "Auto_Callback")
    protected List<ArrayType> autoCallback;
    @XmlElement(name = "Call_Fwd_All_Calls")
    protected List<ArrayType> callFwdAllCalls;
    @XmlElement(name = "Data_Privacy")
    protected List<ArrayType> dataPrivacy;
    @XmlElement(name = "Priority_Calling")
    protected List<ArrayType> priorityCalling;
    @XmlElement(name = "Console_Permissions")
    protected List<ArrayType> consolePermissions;
    @XmlElement(name = "Off_hook_Alert")
    protected List<ArrayType> offHookAlert;
    @XmlElement(name = "Client_Room")
    protected List<ArrayType> clientRoom;
    @XmlElement(name = "Restrict_Call_Fwd_Off_Net")
    protected List<ArrayType> restrictCallFwdOffNet;
    @XmlElement(name = "Call_Forwarding_Busy_DA")
    protected List<ArrayType> callForwardingBusyDA;
    @XmlElement(name = "Personal_Station_Access")
    protected List<ArrayType> personalStationAccess;
    @XmlElement(name = "Extended_Forwarding_All")
    protected List<ArrayType> extendedForwardingAll;
    @XmlElement(name = "Extended_Forwarding_B_DA")
    protected List<ArrayType> extendedForwardingBDA;
    @XmlElement(name = "Trk_to_Trk_Transfer_Override")
    protected List<ArrayType> trkToTrkTransferOverride;
    @XmlElement(name = "QSIG_Call_Offer_Originations")
    protected List<ArrayType> qsigCallOfferOriginations;
    @XmlElement(name = "Contact_Closure_Activation")
    protected List<ArrayType> contactClosureActivation;
    @XmlElement(name = "Automatic_Exclusion")
    protected List<ArrayType> automaticExclusion;
    @XmlElement(name = "VIP_Caller")
    protected List<ArrayType> vipCaller;
    @XmlElement(name = "Masking_CPN_Name_Override")
    protected List<ArrayType> maskingCPNNameOverride;
    @XmlElement(name = "Call_Forwarding_Enhanced")
    protected List<ArrayType> callForwardingEnhanced;
    @XmlElement(name = "Priority_Ip_Video")
    protected List<ArrayType> priorityIpVideo;
    @XmlElement(name = "Ad_hoc_Video_Conferencing")
    protected List<ArrayType> adHocVideoConferencing;
    @XmlElement(name = "MOC_Control")
    protected List<ArrayType> mocControl;
    @XmlElement(name = "Match_BCA_Display_To_Principal")
    protected List<ArrayType> matchBCADisplayToPrincipal;
    @XmlElement(name = "DCC_Activation_Deactivation")
    protected List<ArrayType> dccActivationDeactivation;

    /**
     * Gets the value of the cosName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOSName() {
        return cosName;
    }

    /**
     * Sets the value of the cosName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOSName(String value) {
        this.cosName = value;
    }

    /**
     * Gets the value of the cosGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOSGroup() {
        return cosGroup;
    }

    /**
     * Sets the value of the cosGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOSGroup(String value) {
        this.cosGroup = value;
    }

    /**
     * Gets the value of the autoCallback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoCallback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoCallback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAutoCallback() {
        if (autoCallback == null) {
            autoCallback = new ArrayList<ArrayType>();
        }
        return this.autoCallback;
    }

    /**
     * Gets the value of the callFwdAllCalls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callFwdAllCalls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallFwdAllCalls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallFwdAllCalls() {
        if (callFwdAllCalls == null) {
            callFwdAllCalls = new ArrayList<ArrayType>();
        }
        return this.callFwdAllCalls;
    }

    /**
     * Gets the value of the dataPrivacy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataPrivacy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataPrivacy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDataPrivacy() {
        if (dataPrivacy == null) {
            dataPrivacy = new ArrayList<ArrayType>();
        }
        return this.dataPrivacy;
    }

    /**
     * Gets the value of the priorityCalling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorityCalling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorityCalling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getPriorityCalling() {
        if (priorityCalling == null) {
            priorityCalling = new ArrayList<ArrayType>();
        }
        return this.priorityCalling;
    }

    /**
     * Gets the value of the consolePermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consolePermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsolePermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getConsolePermissions() {
        if (consolePermissions == null) {
            consolePermissions = new ArrayList<ArrayType>();
        }
        return this.consolePermissions;
    }

    /**
     * Gets the value of the offHookAlert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offHookAlert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffHookAlert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getOffHookAlert() {
        if (offHookAlert == null) {
            offHookAlert = new ArrayList<ArrayType>();
        }
        return this.offHookAlert;
    }

    /**
     * Gets the value of the clientRoom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientRoom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientRoom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getClientRoom() {
        if (clientRoom == null) {
            clientRoom = new ArrayList<ArrayType>();
        }
        return this.clientRoom;
    }

    /**
     * Gets the value of the restrictCallFwdOffNet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictCallFwdOffNet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictCallFwdOffNet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRestrictCallFwdOffNet() {
        if (restrictCallFwdOffNet == null) {
            restrictCallFwdOffNet = new ArrayList<ArrayType>();
        }
        return this.restrictCallFwdOffNet;
    }

    /**
     * Gets the value of the callForwardingBusyDA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callForwardingBusyDA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallForwardingBusyDA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallForwardingBusyDA() {
        if (callForwardingBusyDA == null) {
            callForwardingBusyDA = new ArrayList<ArrayType>();
        }
        return this.callForwardingBusyDA;
    }

    /**
     * Gets the value of the personalStationAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalStationAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalStationAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getPersonalStationAccess() {
        if (personalStationAccess == null) {
            personalStationAccess = new ArrayList<ArrayType>();
        }
        return this.personalStationAccess;
    }

    /**
     * Gets the value of the extendedForwardingAll property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedForwardingAll property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedForwardingAll().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getExtendedForwardingAll() {
        if (extendedForwardingAll == null) {
            extendedForwardingAll = new ArrayList<ArrayType>();
        }
        return this.extendedForwardingAll;
    }

    /**
     * Gets the value of the extendedForwardingBDA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedForwardingBDA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedForwardingBDA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getExtendedForwardingBDA() {
        if (extendedForwardingBDA == null) {
            extendedForwardingBDA = new ArrayList<ArrayType>();
        }
        return this.extendedForwardingBDA;
    }

    /**
     * Gets the value of the trkToTrkTransferOverride property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trkToTrkTransferOverride property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrkToTrkTransferOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTrkToTrkTransferOverride() {
        if (trkToTrkTransferOverride == null) {
            trkToTrkTransferOverride = new ArrayList<ArrayType>();
        }
        return this.trkToTrkTransferOverride;
    }

    /**
     * Gets the value of the qsigCallOfferOriginations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qsigCallOfferOriginations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQSIGCallOfferOriginations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getQSIGCallOfferOriginations() {
        if (qsigCallOfferOriginations == null) {
            qsigCallOfferOriginations = new ArrayList<ArrayType>();
        }
        return this.qsigCallOfferOriginations;
    }

    /**
     * Gets the value of the contactClosureActivation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactClosureActivation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactClosureActivation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getContactClosureActivation() {
        if (contactClosureActivation == null) {
            contactClosureActivation = new ArrayList<ArrayType>();
        }
        return this.contactClosureActivation;
    }

    /**
     * Gets the value of the automaticExclusion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the automaticExclusion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutomaticExclusion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAutomaticExclusion() {
        if (automaticExclusion == null) {
            automaticExclusion = new ArrayList<ArrayType>();
        }
        return this.automaticExclusion;
    }

    /**
     * Gets the value of the vipCaller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vipCaller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVIPCaller().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getVIPCaller() {
        if (vipCaller == null) {
            vipCaller = new ArrayList<ArrayType>();
        }
        return this.vipCaller;
    }

    /**
     * Gets the value of the maskingCPNNameOverride property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maskingCPNNameOverride property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaskingCPNNameOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMaskingCPNNameOverride() {
        if (maskingCPNNameOverride == null) {
            maskingCPNNameOverride = new ArrayList<ArrayType>();
        }
        return this.maskingCPNNameOverride;
    }

    /**
     * Gets the value of the callForwardingEnhanced property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callForwardingEnhanced property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallForwardingEnhanced().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallForwardingEnhanced() {
        if (callForwardingEnhanced == null) {
            callForwardingEnhanced = new ArrayList<ArrayType>();
        }
        return this.callForwardingEnhanced;
    }

    /**
     * Gets the value of the priorityIpVideo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorityIpVideo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorityIpVideo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getPriorityIpVideo() {
        if (priorityIpVideo == null) {
            priorityIpVideo = new ArrayList<ArrayType>();
        }
        return this.priorityIpVideo;
    }

    /**
     * Gets the value of the adHocVideoConferencing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adHocVideoConferencing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdHocVideoConferencing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAdHocVideoConferencing() {
        if (adHocVideoConferencing == null) {
            adHocVideoConferencing = new ArrayList<ArrayType>();
        }
        return this.adHocVideoConferencing;
    }

    /**
     * Gets the value of the mocControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mocControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMOCControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMOCControl() {
        if (mocControl == null) {
            mocControl = new ArrayList<ArrayType>();
        }
        return this.mocControl;
    }

    /**
     * Gets the value of the matchBCADisplayToPrincipal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchBCADisplayToPrincipal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchBCADisplayToPrincipal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMatchBCADisplayToPrincipal() {
        if (matchBCADisplayToPrincipal == null) {
            matchBCADisplayToPrincipal = new ArrayList<ArrayType>();
        }
        return this.matchBCADisplayToPrincipal;
    }

    /**
     * Gets the value of the dccActivationDeactivation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dccActivationDeactivation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDCCActivationDeactivation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDCCActivationDeactivation() {
        if (dccActivationDeactivation == null) {
            dccActivationDeactivation = new ArrayList<ArrayType>();
        }
        return this.dccActivationDeactivation;
    }

}
