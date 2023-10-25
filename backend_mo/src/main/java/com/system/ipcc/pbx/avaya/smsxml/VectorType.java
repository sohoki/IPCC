
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VectorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VectorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VectorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VectorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multimedia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meet_me_Conf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_Scripts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}VectorArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VectorType", propOrder = {
    "vectorNumber",
    "vectorName",
    "multimedia",
    "lock",
    "attendant",
    "meetMeConf",
    "nativeName1",
    "nativeName2",
    "nativeName3",
    "nativeName4",
    "nativeName5",
    "nativeNameScripts",
    "vectorStep",
    "vectorStepComment",
    "adjunctLink",
    "announcementExtn",
    "atStep",
    "check",
    "checkOptions",
    "checkSkillOrSplit",
    "checkSkillPriority",
    "checkAvilableAgentsStaffed",
    "checkCallsQueued",
    "checkExpectedWait",
    "checkOldestCallWait",
    "checkWaitImproved",
    "checkRollingAsa",
    "collect",
    "collectAnnouncementExt",
    "collectAfterAncForCed",
    "collectAfterAncFordig",
    "consider",
    "considerLocation",
    "considerSplitOrSkill",
    "considerSplitOrSkillPriority",
    "considerAdjustBy",
    "converseOnSkillOrSplit",
    "converseOnSKillOrSplitPriority",
    "converseOnData1",
    "converseOnData2",
    "disconnectAnnmtExtn",
    "_goto",
    "gotoStepNumber",
    "gotoNumber",
    "gotoOptions",
    "gotoActiveServer",
    "gotoAni",
    "gotoAgentsNum",
    "gotoCallsQueued",
    "gotoCountedCallsVDN",
    "gotoCountedCallsDigits",
    "gotoDigits",
    "gotoExpectedWait",
    "gotoExpectedWaitTime",
    "gotoExpectedWaitSplitOrSkill",
    "gotoIfCond",
    "gotoiidigits",
    "gotoInterflowQpos",
    "gotoInterflowQposDigits",
    "gotoMediaPortAny",
    "gotoMediaPortAnyOperator",
    "gotoOldestCallwait",
    "gotoOperatorEqualNotEqual",
    "gotoRollingASA",
    "gotoRollingASAVDN",
    "gotoRollingASASplitOrSkill",
    "gotoRollingASACondition",
    "gotoRollingASAAnsSpeed",
    "gotoTimeOfDay",
    "gotoTimeOfDayBegHour",
    "gotoTimeOfDayBegMin",
    "gotoTimeOfDayWeekDay",
    "gotoTimeOfDayEndHour",
    "gotoTimeOfDayEndMin",
    "gotoWaitImproved",
    "gotoSplitOrSkillPriority",
    "gotoSplitOrSkill",
    "gotoCondition",
    "gotoCondInOrNot",
    "messagingSplitorSkill",
    "messagingExtension",
    "queueTo",
    "queueToBestAttendantExt",
    "queueToBestHuntGrp",
    "queueToSplitOrSkill",
    "queueToPriority",
    "routeTo",
    "routeToNumber",
    "routeToNumberCov",
    "routeToNumberIfCond",
    "routeToNumberIfDigitsOrInterflow",
    "routeToNumberIfDigit",
    "routeToNumberIfDigitInterflow",
    "routeToDigitsCov",
    "setdigits",
    "setAction",
    "setActionValue",
    "set",
    "waitTimeSec",
    "waitTimeUnit",
    "waitTimeRepeat",
    "waitTimeListen",
    "textComment"
})
public class VectorType {

    @XmlElement(name = "VectorNumber")
    protected String vectorNumber;
    @XmlElement(name = "VectorName")
    protected String vectorName;
    @XmlElement(name = "Multimedia")
    protected String multimedia;
    @XmlElement(name = "Lock")
    protected String lock;
    @XmlElement(name = "Attendant")
    protected String attendant;
    @XmlElement(name = "Meet_me_Conf")
    protected String meetMeConf;
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
    @XmlElement(name = "VectorStep")
    protected List<ArrayType> vectorStep;
    @XmlElement(name = "VectorStepComment")
    protected List<ArrayType> vectorStepComment;
    @XmlElement(name = "AdjunctLink")
    protected List<ArrayType> adjunctLink;
    @XmlElement(name = "AnnouncementExtn")
    protected List<ArrayType> announcementExtn;
    @XmlElement(name = "AtStep")
    protected List<ArrayType> atStep;
    @XmlElement(name = "Check")
    protected List<ArrayType> check;
    @XmlElement(name = "CheckOptions")
    protected List<ArrayType> checkOptions;
    @XmlElement(name = "CheckSkillOrSplit")
    protected List<ArrayType> checkSkillOrSplit;
    @XmlElement(name = "CheckSkillPriority")
    protected List<ArrayType> checkSkillPriority;
    @XmlElement(name = "CheckAvilableAgentsStaffed")
    protected List<ArrayType> checkAvilableAgentsStaffed;
    @XmlElement(name = "CheckCallsQueued")
    protected List<ArrayType> checkCallsQueued;
    @XmlElement(name = "CheckExpectedWait")
    protected List<ArrayType> checkExpectedWait;
    @XmlElement(name = "CheckOldestCallWait")
    protected List<ArrayType> checkOldestCallWait;
    @XmlElement(name = "CheckWaitImproved")
    protected List<ArrayType> checkWaitImproved;
    @XmlElement(name = "CheckRollingAsa")
    protected List<ArrayType> checkRollingAsa;
    @XmlElement(name = "Collect")
    protected List<ArrayType> collect;
    @XmlElement(name = "CollectAnnouncementExt")
    protected List<ArrayType> collectAnnouncementExt;
    @XmlElement(name = "CollectAfterAncForCed")
    protected List<ArrayType> collectAfterAncForCed;
    @XmlElement(name = "CollectAfterAncFordig")
    protected List<ArrayType> collectAfterAncFordig;
    @XmlElement(name = "Consider")
    protected List<ArrayType> consider;
    @XmlElement(name = "ConsiderLocation")
    protected List<ArrayType> considerLocation;
    @XmlElement(name = "ConsiderSplitOrSkill")
    protected List<ArrayType> considerSplitOrSkill;
    @XmlElement(name = "ConsiderSplitOrSkillPriority")
    protected List<ArrayType> considerSplitOrSkillPriority;
    @XmlElement(name = "ConsiderAdjustBy")
    protected List<ArrayType> considerAdjustBy;
    @XmlElement(name = "ConverseOnSkillOrSplit")
    protected List<ArrayType> converseOnSkillOrSplit;
    @XmlElement(name = "ConverseOnSKillOrSplitPriority")
    protected List<ArrayType> converseOnSKillOrSplitPriority;
    @XmlElement(name = "ConverseOnData1")
    protected List<ArrayType> converseOnData1;
    @XmlElement(name = "ConverseOnData2")
    protected List<ArrayType> converseOnData2;
    @XmlElement(name = "DisconnectAnnmtExtn")
    protected List<ArrayType> disconnectAnnmtExtn;
    @XmlElement(name = "Goto")
    protected List<ArrayType> _goto;
    @XmlElement(name = "GotoStepNumber")
    protected List<ArrayType> gotoStepNumber;
    @XmlElement(name = "GotoNumber")
    protected List<ArrayType> gotoNumber;
    @XmlElement(name = "GotoOptions")
    protected List<ArrayType> gotoOptions;
    @XmlElement(name = "GotoActiveServer")
    protected List<ArrayType> gotoActiveServer;
    @XmlElement(name = "GotoAni")
    protected List<ArrayType> gotoAni;
    @XmlElement(name = "GotoAgentsNum")
    protected List<ArrayType> gotoAgentsNum;
    @XmlElement(name = "GotoCallsQueued")
    protected List<ArrayType> gotoCallsQueued;
    @XmlElement(name = "GotoCountedCallsVDN")
    protected List<ArrayType> gotoCountedCallsVDN;
    @XmlElement(name = "GotoCountedCallsDigits")
    protected List<ArrayType> gotoCountedCallsDigits;
    @XmlElement(name = "GotoDigits")
    protected List<ArrayType> gotoDigits;
    @XmlElement(name = "GotoExpectedWait")
    protected List<ArrayType> gotoExpectedWait;
    @XmlElement(name = "GotoExpectedWaitTime")
    protected List<ArrayType> gotoExpectedWaitTime;
    @XmlElement(name = "GotoExpectedWaitSplitOrSkill")
    protected List<ArrayType> gotoExpectedWaitSplitOrSkill;
    @XmlElement(name = "GotoIfCond")
    protected List<ArrayType> gotoIfCond;
    @XmlElement(name = "Gotoiidigits")
    protected List<ArrayType> gotoiidigits;
    @XmlElement(name = "GotoInterflowQpos")
    protected List<ArrayType> gotoInterflowQpos;
    @XmlElement(name = "GotoInterflowQposDigits")
    protected List<ArrayType> gotoInterflowQposDigits;
    @XmlElement(name = "GotoMediaPortAny")
    protected List<ArrayType> gotoMediaPortAny;
    @XmlElement(name = "GotoMediaPortAnyOperator")
    protected List<ArrayType> gotoMediaPortAnyOperator;
    @XmlElement(name = "GotoOldestCallwait")
    protected List<ArrayType> gotoOldestCallwait;
    @XmlElement(name = "GotoOperatorEqualNotEqual")
    protected List<ArrayType> gotoOperatorEqualNotEqual;
    @XmlElement(name = "GotoRollingASA")
    protected List<ArrayType> gotoRollingASA;
    @XmlElement(name = "GotoRollingASAVDN")
    protected List<ArrayType> gotoRollingASAVDN;
    @XmlElement(name = "GotoRollingASASplitOrSkill")
    protected List<ArrayType> gotoRollingASASplitOrSkill;
    @XmlElement(name = "GotoRollingASACondition")
    protected List<ArrayType> gotoRollingASACondition;
    @XmlElement(name = "GotoRollingASAAnsSpeed")
    protected List<ArrayType> gotoRollingASAAnsSpeed;
    @XmlElement(name = "GotoTimeOfDay")
    protected List<ArrayType> gotoTimeOfDay;
    @XmlElement(name = "GotoTimeOfDayBegHour")
    protected List<ArrayType> gotoTimeOfDayBegHour;
    @XmlElement(name = "GotoTimeOfDayBegMin")
    protected List<ArrayType> gotoTimeOfDayBegMin;
    @XmlElement(name = "GotoTimeOfDayWeekDay")
    protected List<ArrayType> gotoTimeOfDayWeekDay;
    @XmlElement(name = "GotoTimeOfDayEndHour")
    protected List<ArrayType> gotoTimeOfDayEndHour;
    @XmlElement(name = "GotoTimeOfDayEndMin")
    protected List<ArrayType> gotoTimeOfDayEndMin;
    @XmlElement(name = "GotoWaitImproved")
    protected List<ArrayType> gotoWaitImproved;
    @XmlElement(name = "GotoSplitOrSkillPriority")
    protected List<ArrayType> gotoSplitOrSkillPriority;
    @XmlElement(name = "GotoSplitOrSkill")
    protected List<ArrayType> gotoSplitOrSkill;
    @XmlElement(name = "GotoCondition")
    protected List<ArrayType> gotoCondition;
    @XmlElement(name = "GotoCondInOrNot")
    protected List<ArrayType> gotoCondInOrNot;
    @XmlElement(name = "MessagingSplitorSkill")
    protected List<ArrayType> messagingSplitorSkill;
    @XmlElement(name = "MessagingExtension")
    protected List<ArrayType> messagingExtension;
    @XmlElement(name = "QueueTo")
    protected List<ArrayType> queueTo;
    @XmlElement(name = "QueueToBestAttendantExt")
    protected List<ArrayType> queueToBestAttendantExt;
    @XmlElement(name = "QueueToBestHuntGrp")
    protected List<ArrayType> queueToBestHuntGrp;
    @XmlElement(name = "QueueToSplitOrSkill")
    protected List<ArrayType> queueToSplitOrSkill;
    @XmlElement(name = "QueueToPriority")
    protected List<ArrayType> queueToPriority;
    @XmlElement(name = "RouteTo")
    protected List<ArrayType> routeTo;
    @XmlElement(name = "RouteToNumber")
    protected List<ArrayType> routeToNumber;
    @XmlElement(name = "RouteToNumberCov")
    protected List<ArrayType> routeToNumberCov;
    @XmlElement(name = "RouteToNumberIfCond")
    protected List<ArrayType> routeToNumberIfCond;
    @XmlElement(name = "RouteToNumberIfDigitsOrInterflow")
    protected List<ArrayType> routeToNumberIfDigitsOrInterflow;
    @XmlElement(name = "RouteToNumberIfDigit")
    protected List<ArrayType> routeToNumberIfDigit;
    @XmlElement(name = "RouteToNumberIfDigitInterflow")
    protected List<ArrayType> routeToNumberIfDigitInterflow;
    @XmlElement(name = "RouteToDigitsCov")
    protected List<ArrayType> routeToDigitsCov;
    @XmlElement(name = "Setdigits")
    protected List<ArrayType> setdigits;
    @XmlElement(name = "SetAction")
    protected List<ArrayType> setAction;
    @XmlElement(name = "SetActionValue")
    protected List<ArrayType> setActionValue;
    @XmlElement(name = "Set")
    protected List<ArrayType> set;
    @XmlElement(name = "WaitTimeSec")
    protected List<ArrayType> waitTimeSec;
    @XmlElement(name = "WaitTimeUnit")
    protected List<ArrayType> waitTimeUnit;
    @XmlElement(name = "WaitTimeRepeat")
    protected List<ArrayType> waitTimeRepeat;
    @XmlElement(name = "WaitTimeListen")
    protected List<ArrayType> waitTimeListen;
    @XmlElement(name = "TextComment")
    protected List<ArrayType> textComment;

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
     * Gets the value of the vectorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectorName() {
        return vectorName;
    }

    /**
     * Sets the value of the vectorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectorName(String value) {
        this.vectorName = value;
    }

    /**
     * Gets the value of the multimedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultimedia() {
        return multimedia;
    }

    /**
     * Sets the value of the multimedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultimedia(String value) {
        this.multimedia = value;
    }

    /**
     * Gets the value of the lock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLock() {
        return lock;
    }

    /**
     * Sets the value of the lock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLock(String value) {
        this.lock = value;
    }

    /**
     * Gets the value of the attendant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendant() {
        return attendant;
    }

    /**
     * Sets the value of the attendant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendant(String value) {
        this.attendant = value;
    }

    /**
     * Gets the value of the meetMeConf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetMeConf() {
        return meetMeConf;
    }

    /**
     * Sets the value of the meetMeConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetMeConf(String value) {
        this.meetMeConf = value;
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
     * Gets the value of the vectorStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vectorStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVectorStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getVectorStep() {
        if (vectorStep == null) {
            vectorStep = new ArrayList<ArrayType>();
        }
        return this.vectorStep;
    }

    /**
     * Gets the value of the vectorStepComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vectorStepComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVectorStepComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getVectorStepComment() {
        if (vectorStepComment == null) {
            vectorStepComment = new ArrayList<ArrayType>();
        }
        return this.vectorStepComment;
    }

    /**
     * Gets the value of the adjunctLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjunctLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjunctLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAdjunctLink() {
        if (adjunctLink == null) {
            adjunctLink = new ArrayList<ArrayType>();
        }
        return this.adjunctLink;
    }

    /**
     * Gets the value of the announcementExtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the announcementExtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnouncementExtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAnnouncementExtn() {
        if (announcementExtn == null) {
            announcementExtn = new ArrayList<ArrayType>();
        }
        return this.announcementExtn;
    }

    /**
     * Gets the value of the atStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAtStep() {
        if (atStep == null) {
            atStep = new ArrayList<ArrayType>();
        }
        return this.atStep;
    }

    /**
     * Gets the value of the check property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the check property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCheck() {
        if (check == null) {
            check = new ArrayList<ArrayType>();
        }
        return this.check;
    }

    /**
     * Gets the value of the checkOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCheckOptions() {
        if (checkOptions == null) {
            checkOptions = new ArrayList<ArrayType>();
        }
        return this.checkOptions;
    }

    /**
     * Gets the value of the checkSkillOrSplit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkSkillOrSplit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckSkillOrSplit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCheckSkillOrSplit() {
        if (checkSkillOrSplit == null) {
            checkSkillOrSplit = new ArrayList<ArrayType>();
        }
        return this.checkSkillOrSplit;
    }

    /**
     * Gets the value of the checkSkillPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkSkillPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckSkillPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCheckSkillPriority() {
        if (checkSkillPriority == null) {
            checkSkillPriority = new ArrayList<ArrayType>();
        }
        return this.checkSkillPriority;
    }

    /**
     * Gets the value of the checkAvilableAgentsStaffed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkAvilableAgentsStaffed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckAvilableAgentsStaffed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCheckAvilableAgentsStaffed() {
        if (checkAvilableAgentsStaffed == null) {
            checkAvilableAgentsStaffed = new ArrayList<ArrayType>();
        }
        return this.checkAvilableAgentsStaffed;
    }

    /**
     * Gets the value of the checkCallsQueued property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkCallsQueued property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckCallsQueued().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCheckCallsQueued() {
        if (checkCallsQueued == null) {
            checkCallsQueued = new ArrayList<ArrayType>();
        }
        return this.checkCallsQueued;
    }

    /**
     * Gets the value of the checkExpectedWait property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkExpectedWait property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckExpectedWait().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCheckExpectedWait() {
        if (checkExpectedWait == null) {
            checkExpectedWait = new ArrayList<ArrayType>();
        }
        return this.checkExpectedWait;
    }

    /**
     * Gets the value of the checkOldestCallWait property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkOldestCallWait property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckOldestCallWait().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCheckOldestCallWait() {
        if (checkOldestCallWait == null) {
            checkOldestCallWait = new ArrayList<ArrayType>();
        }
        return this.checkOldestCallWait;
    }

    /**
     * Gets the value of the checkWaitImproved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkWaitImproved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckWaitImproved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCheckWaitImproved() {
        if (checkWaitImproved == null) {
            checkWaitImproved = new ArrayList<ArrayType>();
        }
        return this.checkWaitImproved;
    }

    /**
     * Gets the value of the checkRollingAsa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkRollingAsa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckRollingAsa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCheckRollingAsa() {
        if (checkRollingAsa == null) {
            checkRollingAsa = new ArrayList<ArrayType>();
        }
        return this.checkRollingAsa;
    }

    /**
     * Gets the value of the collect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCollect() {
        if (collect == null) {
            collect = new ArrayList<ArrayType>();
        }
        return this.collect;
    }

    /**
     * Gets the value of the collectAnnouncementExt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectAnnouncementExt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectAnnouncementExt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCollectAnnouncementExt() {
        if (collectAnnouncementExt == null) {
            collectAnnouncementExt = new ArrayList<ArrayType>();
        }
        return this.collectAnnouncementExt;
    }

    /**
     * Gets the value of the collectAfterAncForCed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectAfterAncForCed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectAfterAncForCed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCollectAfterAncForCed() {
        if (collectAfterAncForCed == null) {
            collectAfterAncForCed = new ArrayList<ArrayType>();
        }
        return this.collectAfterAncForCed;
    }

    /**
     * Gets the value of the collectAfterAncFordig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectAfterAncFordig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectAfterAncFordig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCollectAfterAncFordig() {
        if (collectAfterAncFordig == null) {
            collectAfterAncFordig = new ArrayList<ArrayType>();
        }
        return this.collectAfterAncFordig;
    }

    /**
     * Gets the value of the consider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getConsider() {
        if (consider == null) {
            consider = new ArrayList<ArrayType>();
        }
        return this.consider;
    }

    /**
     * Gets the value of the considerLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the considerLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsiderLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getConsiderLocation() {
        if (considerLocation == null) {
            considerLocation = new ArrayList<ArrayType>();
        }
        return this.considerLocation;
    }

    /**
     * Gets the value of the considerSplitOrSkill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the considerSplitOrSkill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsiderSplitOrSkill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getConsiderSplitOrSkill() {
        if (considerSplitOrSkill == null) {
            considerSplitOrSkill = new ArrayList<ArrayType>();
        }
        return this.considerSplitOrSkill;
    }

    /**
     * Gets the value of the considerSplitOrSkillPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the considerSplitOrSkillPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsiderSplitOrSkillPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getConsiderSplitOrSkillPriority() {
        if (considerSplitOrSkillPriority == null) {
            considerSplitOrSkillPriority = new ArrayList<ArrayType>();
        }
        return this.considerSplitOrSkillPriority;
    }

    /**
     * Gets the value of the considerAdjustBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the considerAdjustBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsiderAdjustBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getConsiderAdjustBy() {
        if (considerAdjustBy == null) {
            considerAdjustBy = new ArrayList<ArrayType>();
        }
        return this.considerAdjustBy;
    }

    /**
     * Gets the value of the converseOnSkillOrSplit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the converseOnSkillOrSplit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConverseOnSkillOrSplit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getConverseOnSkillOrSplit() {
        if (converseOnSkillOrSplit == null) {
            converseOnSkillOrSplit = new ArrayList<ArrayType>();
        }
        return this.converseOnSkillOrSplit;
    }

    /**
     * Gets the value of the converseOnSKillOrSplitPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the converseOnSKillOrSplitPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConverseOnSKillOrSplitPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getConverseOnSKillOrSplitPriority() {
        if (converseOnSKillOrSplitPriority == null) {
            converseOnSKillOrSplitPriority = new ArrayList<ArrayType>();
        }
        return this.converseOnSKillOrSplitPriority;
    }

    /**
     * Gets the value of the converseOnData1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the converseOnData1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConverseOnData1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getConverseOnData1() {
        if (converseOnData1 == null) {
            converseOnData1 = new ArrayList<ArrayType>();
        }
        return this.converseOnData1;
    }

    /**
     * Gets the value of the converseOnData2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the converseOnData2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConverseOnData2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getConverseOnData2() {
        if (converseOnData2 == null) {
            converseOnData2 = new ArrayList<ArrayType>();
        }
        return this.converseOnData2;
    }

    /**
     * Gets the value of the disconnectAnnmtExtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disconnectAnnmtExtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisconnectAnnmtExtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDisconnectAnnmtExtn() {
        if (disconnectAnnmtExtn == null) {
            disconnectAnnmtExtn = new ArrayList<ArrayType>();
        }
        return this.disconnectAnnmtExtn;
    }

    /**
     * Gets the value of the goto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGoto() {
        if (_goto == null) {
            _goto = new ArrayList<ArrayType>();
        }
        return this._goto;
    }

    /**
     * Gets the value of the gotoStepNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoStepNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoStepNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoStepNumber() {
        if (gotoStepNumber == null) {
            gotoStepNumber = new ArrayList<ArrayType>();
        }
        return this.gotoStepNumber;
    }

    /**
     * Gets the value of the gotoNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoNumber() {
        if (gotoNumber == null) {
            gotoNumber = new ArrayList<ArrayType>();
        }
        return this.gotoNumber;
    }

    /**
     * Gets the value of the gotoOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoOptions() {
        if (gotoOptions == null) {
            gotoOptions = new ArrayList<ArrayType>();
        }
        return this.gotoOptions;
    }

    /**
     * Gets the value of the gotoActiveServer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoActiveServer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoActiveServer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoActiveServer() {
        if (gotoActiveServer == null) {
            gotoActiveServer = new ArrayList<ArrayType>();
        }
        return this.gotoActiveServer;
    }

    /**
     * Gets the value of the gotoAni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoAni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoAni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoAni() {
        if (gotoAni == null) {
            gotoAni = new ArrayList<ArrayType>();
        }
        return this.gotoAni;
    }

    /**
     * Gets the value of the gotoAgentsNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoAgentsNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoAgentsNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoAgentsNum() {
        if (gotoAgentsNum == null) {
            gotoAgentsNum = new ArrayList<ArrayType>();
        }
        return this.gotoAgentsNum;
    }

    /**
     * Gets the value of the gotoCallsQueued property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoCallsQueued property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoCallsQueued().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoCallsQueued() {
        if (gotoCallsQueued == null) {
            gotoCallsQueued = new ArrayList<ArrayType>();
        }
        return this.gotoCallsQueued;
    }

    /**
     * Gets the value of the gotoCountedCallsVDN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoCountedCallsVDN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoCountedCallsVDN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoCountedCallsVDN() {
        if (gotoCountedCallsVDN == null) {
            gotoCountedCallsVDN = new ArrayList<ArrayType>();
        }
        return this.gotoCountedCallsVDN;
    }

    /**
     * Gets the value of the gotoCountedCallsDigits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoCountedCallsDigits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoCountedCallsDigits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoCountedCallsDigits() {
        if (gotoCountedCallsDigits == null) {
            gotoCountedCallsDigits = new ArrayList<ArrayType>();
        }
        return this.gotoCountedCallsDigits;
    }

    /**
     * Gets the value of the gotoDigits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoDigits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoDigits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoDigits() {
        if (gotoDigits == null) {
            gotoDigits = new ArrayList<ArrayType>();
        }
        return this.gotoDigits;
    }

    /**
     * Gets the value of the gotoExpectedWait property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoExpectedWait property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoExpectedWait().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoExpectedWait() {
        if (gotoExpectedWait == null) {
            gotoExpectedWait = new ArrayList<ArrayType>();
        }
        return this.gotoExpectedWait;
    }

    /**
     * Gets the value of the gotoExpectedWaitTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoExpectedWaitTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoExpectedWaitTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoExpectedWaitTime() {
        if (gotoExpectedWaitTime == null) {
            gotoExpectedWaitTime = new ArrayList<ArrayType>();
        }
        return this.gotoExpectedWaitTime;
    }

    /**
     * Gets the value of the gotoExpectedWaitSplitOrSkill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoExpectedWaitSplitOrSkill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoExpectedWaitSplitOrSkill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoExpectedWaitSplitOrSkill() {
        if (gotoExpectedWaitSplitOrSkill == null) {
            gotoExpectedWaitSplitOrSkill = new ArrayList<ArrayType>();
        }
        return this.gotoExpectedWaitSplitOrSkill;
    }

    /**
     * Gets the value of the gotoIfCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoIfCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoIfCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoIfCond() {
        if (gotoIfCond == null) {
            gotoIfCond = new ArrayList<ArrayType>();
        }
        return this.gotoIfCond;
    }

    /**
     * Gets the value of the gotoiidigits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoiidigits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoiidigits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoiidigits() {
        if (gotoiidigits == null) {
            gotoiidigits = new ArrayList<ArrayType>();
        }
        return this.gotoiidigits;
    }

    /**
     * Gets the value of the gotoInterflowQpos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoInterflowQpos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoInterflowQpos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoInterflowQpos() {
        if (gotoInterflowQpos == null) {
            gotoInterflowQpos = new ArrayList<ArrayType>();
        }
        return this.gotoInterflowQpos;
    }

    /**
     * Gets the value of the gotoInterflowQposDigits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoInterflowQposDigits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoInterflowQposDigits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoInterflowQposDigits() {
        if (gotoInterflowQposDigits == null) {
            gotoInterflowQposDigits = new ArrayList<ArrayType>();
        }
        return this.gotoInterflowQposDigits;
    }

    /**
     * Gets the value of the gotoMediaPortAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoMediaPortAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoMediaPortAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoMediaPortAny() {
        if (gotoMediaPortAny == null) {
            gotoMediaPortAny = new ArrayList<ArrayType>();
        }
        return this.gotoMediaPortAny;
    }

    /**
     * Gets the value of the gotoMediaPortAnyOperator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoMediaPortAnyOperator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoMediaPortAnyOperator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoMediaPortAnyOperator() {
        if (gotoMediaPortAnyOperator == null) {
            gotoMediaPortAnyOperator = new ArrayList<ArrayType>();
        }
        return this.gotoMediaPortAnyOperator;
    }

    /**
     * Gets the value of the gotoOldestCallwait property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoOldestCallwait property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoOldestCallwait().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoOldestCallwait() {
        if (gotoOldestCallwait == null) {
            gotoOldestCallwait = new ArrayList<ArrayType>();
        }
        return this.gotoOldestCallwait;
    }

    /**
     * Gets the value of the gotoOperatorEqualNotEqual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoOperatorEqualNotEqual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoOperatorEqualNotEqual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoOperatorEqualNotEqual() {
        if (gotoOperatorEqualNotEqual == null) {
            gotoOperatorEqualNotEqual = new ArrayList<ArrayType>();
        }
        return this.gotoOperatorEqualNotEqual;
    }

    /**
     * Gets the value of the gotoRollingASA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoRollingASA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoRollingASA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoRollingASA() {
        if (gotoRollingASA == null) {
            gotoRollingASA = new ArrayList<ArrayType>();
        }
        return this.gotoRollingASA;
    }

    /**
     * Gets the value of the gotoRollingASAVDN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoRollingASAVDN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoRollingASAVDN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoRollingASAVDN() {
        if (gotoRollingASAVDN == null) {
            gotoRollingASAVDN = new ArrayList<ArrayType>();
        }
        return this.gotoRollingASAVDN;
    }

    /**
     * Gets the value of the gotoRollingASASplitOrSkill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoRollingASASplitOrSkill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoRollingASASplitOrSkill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoRollingASASplitOrSkill() {
        if (gotoRollingASASplitOrSkill == null) {
            gotoRollingASASplitOrSkill = new ArrayList<ArrayType>();
        }
        return this.gotoRollingASASplitOrSkill;
    }

    /**
     * Gets the value of the gotoRollingASACondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoRollingASACondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoRollingASACondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoRollingASACondition() {
        if (gotoRollingASACondition == null) {
            gotoRollingASACondition = new ArrayList<ArrayType>();
        }
        return this.gotoRollingASACondition;
    }

    /**
     * Gets the value of the gotoRollingASAAnsSpeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoRollingASAAnsSpeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoRollingASAAnsSpeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoRollingASAAnsSpeed() {
        if (gotoRollingASAAnsSpeed == null) {
            gotoRollingASAAnsSpeed = new ArrayList<ArrayType>();
        }
        return this.gotoRollingASAAnsSpeed;
    }

    /**
     * Gets the value of the gotoTimeOfDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoTimeOfDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoTimeOfDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoTimeOfDay() {
        if (gotoTimeOfDay == null) {
            gotoTimeOfDay = new ArrayList<ArrayType>();
        }
        return this.gotoTimeOfDay;
    }

    /**
     * Gets the value of the gotoTimeOfDayBegHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoTimeOfDayBegHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoTimeOfDayBegHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoTimeOfDayBegHour() {
        if (gotoTimeOfDayBegHour == null) {
            gotoTimeOfDayBegHour = new ArrayList<ArrayType>();
        }
        return this.gotoTimeOfDayBegHour;
    }

    /**
     * Gets the value of the gotoTimeOfDayBegMin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoTimeOfDayBegMin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoTimeOfDayBegMin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoTimeOfDayBegMin() {
        if (gotoTimeOfDayBegMin == null) {
            gotoTimeOfDayBegMin = new ArrayList<ArrayType>();
        }
        return this.gotoTimeOfDayBegMin;
    }

    /**
     * Gets the value of the gotoTimeOfDayWeekDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoTimeOfDayWeekDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoTimeOfDayWeekDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoTimeOfDayWeekDay() {
        if (gotoTimeOfDayWeekDay == null) {
            gotoTimeOfDayWeekDay = new ArrayList<ArrayType>();
        }
        return this.gotoTimeOfDayWeekDay;
    }

    /**
     * Gets the value of the gotoTimeOfDayEndHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoTimeOfDayEndHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoTimeOfDayEndHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoTimeOfDayEndHour() {
        if (gotoTimeOfDayEndHour == null) {
            gotoTimeOfDayEndHour = new ArrayList<ArrayType>();
        }
        return this.gotoTimeOfDayEndHour;
    }

    /**
     * Gets the value of the gotoTimeOfDayEndMin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoTimeOfDayEndMin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoTimeOfDayEndMin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoTimeOfDayEndMin() {
        if (gotoTimeOfDayEndMin == null) {
            gotoTimeOfDayEndMin = new ArrayList<ArrayType>();
        }
        return this.gotoTimeOfDayEndMin;
    }

    /**
     * Gets the value of the gotoWaitImproved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoWaitImproved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoWaitImproved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoWaitImproved() {
        if (gotoWaitImproved == null) {
            gotoWaitImproved = new ArrayList<ArrayType>();
        }
        return this.gotoWaitImproved;
    }

    /**
     * Gets the value of the gotoSplitOrSkillPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoSplitOrSkillPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoSplitOrSkillPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoSplitOrSkillPriority() {
        if (gotoSplitOrSkillPriority == null) {
            gotoSplitOrSkillPriority = new ArrayList<ArrayType>();
        }
        return this.gotoSplitOrSkillPriority;
    }

    /**
     * Gets the value of the gotoSplitOrSkill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoSplitOrSkill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoSplitOrSkill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoSplitOrSkill() {
        if (gotoSplitOrSkill == null) {
            gotoSplitOrSkill = new ArrayList<ArrayType>();
        }
        return this.gotoSplitOrSkill;
    }

    /**
     * Gets the value of the gotoCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoCondition() {
        if (gotoCondition == null) {
            gotoCondition = new ArrayList<ArrayType>();
        }
        return this.gotoCondition;
    }

    /**
     * Gets the value of the gotoCondInOrNot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gotoCondInOrNot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGotoCondInOrNot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getGotoCondInOrNot() {
        if (gotoCondInOrNot == null) {
            gotoCondInOrNot = new ArrayList<ArrayType>();
        }
        return this.gotoCondInOrNot;
    }

    /**
     * Gets the value of the messagingSplitorSkill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messagingSplitorSkill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessagingSplitorSkill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMessagingSplitorSkill() {
        if (messagingSplitorSkill == null) {
            messagingSplitorSkill = new ArrayList<ArrayType>();
        }
        return this.messagingSplitorSkill;
    }

    /**
     * Gets the value of the messagingExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messagingExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessagingExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMessagingExtension() {
        if (messagingExtension == null) {
            messagingExtension = new ArrayList<ArrayType>();
        }
        return this.messagingExtension;
    }

    /**
     * Gets the value of the queueTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queueTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueueTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getQueueTo() {
        if (queueTo == null) {
            queueTo = new ArrayList<ArrayType>();
        }
        return this.queueTo;
    }

    /**
     * Gets the value of the queueToBestAttendantExt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queueToBestAttendantExt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueueToBestAttendantExt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getQueueToBestAttendantExt() {
        if (queueToBestAttendantExt == null) {
            queueToBestAttendantExt = new ArrayList<ArrayType>();
        }
        return this.queueToBestAttendantExt;
    }

    /**
     * Gets the value of the queueToBestHuntGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queueToBestHuntGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueueToBestHuntGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getQueueToBestHuntGrp() {
        if (queueToBestHuntGrp == null) {
            queueToBestHuntGrp = new ArrayList<ArrayType>();
        }
        return this.queueToBestHuntGrp;
    }

    /**
     * Gets the value of the queueToSplitOrSkill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queueToSplitOrSkill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueueToSplitOrSkill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getQueueToSplitOrSkill() {
        if (queueToSplitOrSkill == null) {
            queueToSplitOrSkill = new ArrayList<ArrayType>();
        }
        return this.queueToSplitOrSkill;
    }

    /**
     * Gets the value of the queueToPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queueToPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueueToPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getQueueToPriority() {
        if (queueToPriority == null) {
            queueToPriority = new ArrayList<ArrayType>();
        }
        return this.queueToPriority;
    }

    /**
     * Gets the value of the routeTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRouteTo() {
        if (routeTo == null) {
            routeTo = new ArrayList<ArrayType>();
        }
        return this.routeTo;
    }

    /**
     * Gets the value of the routeToNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeToNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteToNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRouteToNumber() {
        if (routeToNumber == null) {
            routeToNumber = new ArrayList<ArrayType>();
        }
        return this.routeToNumber;
    }

    /**
     * Gets the value of the routeToNumberCov property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeToNumberCov property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteToNumberCov().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRouteToNumberCov() {
        if (routeToNumberCov == null) {
            routeToNumberCov = new ArrayList<ArrayType>();
        }
        return this.routeToNumberCov;
    }

    /**
     * Gets the value of the routeToNumberIfCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeToNumberIfCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteToNumberIfCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRouteToNumberIfCond() {
        if (routeToNumberIfCond == null) {
            routeToNumberIfCond = new ArrayList<ArrayType>();
        }
        return this.routeToNumberIfCond;
    }

    /**
     * Gets the value of the routeToNumberIfDigitsOrInterflow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeToNumberIfDigitsOrInterflow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteToNumberIfDigitsOrInterflow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRouteToNumberIfDigitsOrInterflow() {
        if (routeToNumberIfDigitsOrInterflow == null) {
            routeToNumberIfDigitsOrInterflow = new ArrayList<ArrayType>();
        }
        return this.routeToNumberIfDigitsOrInterflow;
    }

    /**
     * Gets the value of the routeToNumberIfDigit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeToNumberIfDigit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteToNumberIfDigit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRouteToNumberIfDigit() {
        if (routeToNumberIfDigit == null) {
            routeToNumberIfDigit = new ArrayList<ArrayType>();
        }
        return this.routeToNumberIfDigit;
    }

    /**
     * Gets the value of the routeToNumberIfDigitInterflow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeToNumberIfDigitInterflow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteToNumberIfDigitInterflow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRouteToNumberIfDigitInterflow() {
        if (routeToNumberIfDigitInterflow == null) {
            routeToNumberIfDigitInterflow = new ArrayList<ArrayType>();
        }
        return this.routeToNumberIfDigitInterflow;
    }

    /**
     * Gets the value of the routeToDigitsCov property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeToDigitsCov property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteToDigitsCov().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRouteToDigitsCov() {
        if (routeToDigitsCov == null) {
            routeToDigitsCov = new ArrayList<ArrayType>();
        }
        return this.routeToDigitsCov;
    }

    /**
     * Gets the value of the setdigits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setdigits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetdigits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSetdigits() {
        if (setdigits == null) {
            setdigits = new ArrayList<ArrayType>();
        }
        return this.setdigits;
    }

    /**
     * Gets the value of the setAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSetAction() {
        if (setAction == null) {
            setAction = new ArrayList<ArrayType>();
        }
        return this.setAction;
    }

    /**
     * Gets the value of the setActionValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setActionValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetActionValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSetActionValue() {
        if (setActionValue == null) {
            setActionValue = new ArrayList<ArrayType>();
        }
        return this.setActionValue;
    }

    /**
     * Gets the value of the set property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the set property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSet() {
        if (set == null) {
            set = new ArrayList<ArrayType>();
        }
        return this.set;
    }

    /**
     * Gets the value of the waitTimeSec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waitTimeSec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaitTimeSec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getWaitTimeSec() {
        if (waitTimeSec == null) {
            waitTimeSec = new ArrayList<ArrayType>();
        }
        return this.waitTimeSec;
    }

    /**
     * Gets the value of the waitTimeUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waitTimeUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaitTimeUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getWaitTimeUnit() {
        if (waitTimeUnit == null) {
            waitTimeUnit = new ArrayList<ArrayType>();
        }
        return this.waitTimeUnit;
    }

    /**
     * Gets the value of the waitTimeRepeat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waitTimeRepeat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaitTimeRepeat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getWaitTimeRepeat() {
        if (waitTimeRepeat == null) {
            waitTimeRepeat = new ArrayList<ArrayType>();
        }
        return this.waitTimeRepeat;
    }

    /**
     * Gets the value of the waitTimeListen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waitTimeListen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaitTimeListen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getWaitTimeListen() {
        if (waitTimeListen == null) {
            waitTimeListen = new ArrayList<ArrayType>();
        }
        return this.waitTimeListen;
    }

    /**
     * Gets the value of the textComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTextComment() {
        if (textComment == null) {
            textComment = new ArrayList<ArrayType>();
        }
        return this.textComment;
    }

}
