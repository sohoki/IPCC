
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OffPbxStationMappingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffPbxStationMappingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://xml.avaya.com/sms}OffPbxStationMappingArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffPbxStationMappingType", propOrder = {
    "station",
    "offPbxPhoneNumber",
    "application",
    "dialPrefix",
    "cc",
    "trunkSelection",
    "configSet",
    "configSetB",
    "dualMode",
    "callLimit",
    "callLimitB",
    "mappingMode",
    "callsAllowed",
    "bridgedCalls",
    "location",
    "shareLevel",
    "callsAcceptedS",
    "callsAcceptedC",
    "callsAcceptedH",
    "callsAcceptedI",
    "callsAcceptedP",
    "callsAcceptedR",
    "cor"
})
public class OffPbxStationMappingType {

    @XmlElement(name = "Station")
    protected List<ArrayType> station;
    @XmlElement(name = "Off_Pbx_Phone_Number")
    protected List<ArrayType> offPbxPhoneNumber;
    @XmlElement(name = "Application")
    protected List<ArrayType> application;
    @XmlElement(name = "Dial_Prefix")
    protected List<ArrayType> dialPrefix;
    @XmlElement(name = "CC")
    protected List<ArrayType> cc;
    @XmlElement(name = "Trunk_Selection")
    protected List<ArrayType> trunkSelection;
    @XmlElement(name = "Config_Set")
    protected List<ArrayType> configSet;
    @XmlElement(name = "Config_Set_B")
    protected List<ArrayType> configSetB;
    @XmlElement(name = "Dual_Mode")
    protected List<ArrayType> dualMode;
    @XmlElement(name = "Call_Limit")
    protected List<ArrayType> callLimit;
    @XmlElement(name = "Call_Limit_B")
    protected List<ArrayType> callLimitB;
    @XmlElement(name = "Mapping_Mode")
    protected List<ArrayType> mappingMode;
    @XmlElement(name = "Calls_Allowed")
    protected List<ArrayType> callsAllowed;
    @XmlElement(name = "Bridged_Calls")
    protected List<ArrayType> bridgedCalls;
    @XmlElement(name = "Location")
    protected List<ArrayType> location;
    @XmlElement(name = "Share_Level")
    protected List<ArrayType> shareLevel;
    @XmlElement(name = "Calls_Accepted_S")
    protected List<ArrayType> callsAcceptedS;
    @XmlElement(name = "Calls_Accepted_C")
    protected List<ArrayType> callsAcceptedC;
    @XmlElement(name = "Calls_Accepted_H")
    protected List<ArrayType> callsAcceptedH;
    @XmlElement(name = "Calls_Accepted_I")
    protected List<ArrayType> callsAcceptedI;
    @XmlElement(name = "Calls_Accepted_P")
    protected List<ArrayType> callsAcceptedP;
    @XmlElement(name = "Calls_Accepted_R")
    protected List<ArrayType> callsAcceptedR;
    @XmlElement(name = "COR")
    protected List<ArrayType> cor;

    /**
     * Gets the value of the station property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the station property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getStation() {
        if (station == null) {
            station = new ArrayList<ArrayType>();
        }
        return this.station;
    }

    /**
     * Gets the value of the offPbxPhoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offPbxPhoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffPbxPhoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getOffPbxPhoneNumber() {
        if (offPbxPhoneNumber == null) {
            offPbxPhoneNumber = new ArrayList<ArrayType>();
        }
        return this.offPbxPhoneNumber;
    }

    /**
     * Gets the value of the application property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the application property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getApplication() {
        if (application == null) {
            application = new ArrayList<ArrayType>();
        }
        return this.application;
    }

    /**
     * Gets the value of the dialPrefix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dialPrefix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDialPrefix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDialPrefix() {
        if (dialPrefix == null) {
            dialPrefix = new ArrayList<ArrayType>();
        }
        return this.dialPrefix;
    }

    /**
     * Gets the value of the cc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCC() {
        if (cc == null) {
            cc = new ArrayList<ArrayType>();
        }
        return this.cc;
    }

    /**
     * Gets the value of the trunkSelection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trunkSelection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrunkSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTrunkSelection() {
        if (trunkSelection == null) {
            trunkSelection = new ArrayList<ArrayType>();
        }
        return this.trunkSelection;
    }

    /**
     * Gets the value of the configSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getConfigSet() {
        if (configSet == null) {
            configSet = new ArrayList<ArrayType>();
        }
        return this.configSet;
    }

    /**
     * Gets the value of the configSetB property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configSetB property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigSetB().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getConfigSetB() {
        if (configSetB == null) {
            configSetB = new ArrayList<ArrayType>();
        }
        return this.configSetB;
    }

    /**
     * Gets the value of the dualMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dualMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDualMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDualMode() {
        if (dualMode == null) {
            dualMode = new ArrayList<ArrayType>();
        }
        return this.dualMode;
    }

    /**
     * Gets the value of the callLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallLimit() {
        if (callLimit == null) {
            callLimit = new ArrayList<ArrayType>();
        }
        return this.callLimit;
    }

    /**
     * Gets the value of the callLimitB property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callLimitB property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallLimitB().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallLimitB() {
        if (callLimitB == null) {
            callLimitB = new ArrayList<ArrayType>();
        }
        return this.callLimitB;
    }

    /**
     * Gets the value of the mappingMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mappingMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMappingMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMappingMode() {
        if (mappingMode == null) {
            mappingMode = new ArrayList<ArrayType>();
        }
        return this.mappingMode;
    }

    /**
     * Gets the value of the callsAllowed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callsAllowed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallsAllowed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallsAllowed() {
        if (callsAllowed == null) {
            callsAllowed = new ArrayList<ArrayType>();
        }
        return this.callsAllowed;
    }

    /**
     * Gets the value of the bridgedCalls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bridgedCalls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBridgedCalls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBridgedCalls() {
        if (bridgedCalls == null) {
            bridgedCalls = new ArrayList<ArrayType>();
        }
        return this.bridgedCalls;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getLocation() {
        if (location == null) {
            location = new ArrayList<ArrayType>();
        }
        return this.location;
    }

    /**
     * Gets the value of the shareLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getShareLevel() {
        if (shareLevel == null) {
            shareLevel = new ArrayList<ArrayType>();
        }
        return this.shareLevel;
    }

    /**
     * Gets the value of the callsAcceptedS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callsAcceptedS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallsAcceptedS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallsAcceptedS() {
        if (callsAcceptedS == null) {
            callsAcceptedS = new ArrayList<ArrayType>();
        }
        return this.callsAcceptedS;
    }

    /**
     * Gets the value of the callsAcceptedC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callsAcceptedC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallsAcceptedC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallsAcceptedC() {
        if (callsAcceptedC == null) {
            callsAcceptedC = new ArrayList<ArrayType>();
        }
        return this.callsAcceptedC;
    }

    /**
     * Gets the value of the callsAcceptedH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callsAcceptedH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallsAcceptedH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallsAcceptedH() {
        if (callsAcceptedH == null) {
            callsAcceptedH = new ArrayList<ArrayType>();
        }
        return this.callsAcceptedH;
    }

    /**
     * Gets the value of the callsAcceptedI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callsAcceptedI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallsAcceptedI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallsAcceptedI() {
        if (callsAcceptedI == null) {
            callsAcceptedI = new ArrayList<ArrayType>();
        }
        return this.callsAcceptedI;
    }

    /**
     * Gets the value of the callsAcceptedP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callsAcceptedP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallsAcceptedP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallsAcceptedP() {
        if (callsAcceptedP == null) {
            callsAcceptedP = new ArrayList<ArrayType>();
        }
        return this.callsAcceptedP;
    }

    /**
     * Gets the value of the callsAcceptedR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callsAcceptedR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallsAcceptedR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallsAcceptedR() {
        if (callsAcceptedR == null) {
            callsAcceptedR = new ArrayList<ArrayType>();
        }
        return this.callsAcceptedR;
    }

    /**
     * Gets the value of the cor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCOR() {
        if (cor == null) {
            cor = new ArrayList<ArrayType>();
        }
        return this.cor;
    }

}
