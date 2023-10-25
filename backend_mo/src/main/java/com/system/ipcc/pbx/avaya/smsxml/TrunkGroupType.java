
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrunkGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrunkGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Group_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Administered_Members" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Measured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outgoing_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Queue_Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_of_Members" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Carrier_Medium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native_Name_Scripts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UUI_Treatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASAI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="In_VDN_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VDN_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Collected_Digits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Other_LAI_Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Held_Call_UCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ECD_UUI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}TrunkGroupArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrunkGroupType", propOrder = {
    "groupNumber",
    "tac",
    "groupType",
    "groupName",
    "totalAdministeredMembers",
    "tn",
    "cor",
    "cdr",
    "measured",
    "outgoingDisplay",
    "queueLength",
    "numberOfMembers",
    "serviceType",
    "carrierMedium",
    "nativeName1",
    "nativeName2",
    "nativeName3",
    "nativeName4",
    "nativeName5",
    "nativeNameScripts",
    "uuiTreatment",
    "asai",
    "ucid",
    "inVDNTime",
    "vdnName",
    "collectedDigits",
    "otherLAIInformation",
    "heldCallUCID",
    "ecduui",
    "port",
    "code",
    "sfx",
    "name",
    "night",
    "sigGrp"
})
public class TrunkGroupType {

    @XmlElement(name = "Group_Number")
    protected String groupNumber;
    @XmlElement(name = "TAC")
    protected String tac;
    @XmlElement(name = "Group_Type")
    protected String groupType;
    @XmlElement(name = "Group_Name")
    protected String groupName;
    @XmlElement(name = "Total_Administered_Members")
    protected String totalAdministeredMembers;
    @XmlElement(name = "TN")
    protected String tn;
    @XmlElement(name = "COR")
    protected String cor;
    @XmlElement(name = "CDR")
    protected String cdr;
    @XmlElement(name = "Measured")
    protected String measured;
    @XmlElement(name = "Outgoing_Display")
    protected String outgoingDisplay;
    @XmlElement(name = "Queue_Length")
    protected String queueLength;
    @XmlElement(name = "Number_of_Members")
    protected String numberOfMembers;
    @XmlElement(name = "Service_Type")
    protected String serviceType;
    @XmlElement(name = "Carrier_Medium")
    protected String carrierMedium;
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
    @XmlElement(name = "UUI_Treatment")
    protected String uuiTreatment;
    @XmlElement(name = "ASAI")
    protected String asai;
    @XmlElement(name = "UCID")
    protected String ucid;
    @XmlElement(name = "In_VDN_Time")
    protected String inVDNTime;
    @XmlElement(name = "VDN_Name")
    protected String vdnName;
    @XmlElement(name = "Collected_Digits")
    protected String collectedDigits;
    @XmlElement(name = "Other_LAI_Information")
    protected String otherLAIInformation;
    @XmlElement(name = "Held_Call_UCID")
    protected String heldCallUCID;
    @XmlElement(name = "ECD_UUI")
    protected String ecduui;
    @XmlElement(name = "Port")
    protected List<ArrayType> port;
    @XmlElement(name = "Code")
    protected List<ArrayType> code;
    @XmlElement(name = "Sfx")
    protected List<ArrayType> sfx;
    @XmlElement(name = "Name")
    protected List<ArrayType> name;
    @XmlElement(name = "Night")
    protected List<ArrayType> night;
    @XmlElement(name = "Sig_Grp")
    protected List<ArrayType> sigGrp;

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
     * Gets the value of the tac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAC() {
        return tac;
    }

    /**
     * Sets the value of the tac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAC(String value) {
        this.tac = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
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
     * Gets the value of the totalAdministeredMembers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAdministeredMembers() {
        return totalAdministeredMembers;
    }

    /**
     * Sets the value of the totalAdministeredMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAdministeredMembers(String value) {
        this.totalAdministeredMembers = value;
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
     * Gets the value of the cdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDR() {
        return cdr;
    }

    /**
     * Sets the value of the cdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDR(String value) {
        this.cdr = value;
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
     * Gets the value of the outgoingDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingDisplay() {
        return outgoingDisplay;
    }

    /**
     * Sets the value of the outgoingDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingDisplay(String value) {
        this.outgoingDisplay = value;
    }

    /**
     * Gets the value of the queueLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueLength() {
        return queueLength;
    }

    /**
     * Sets the value of the queueLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueLength(String value) {
        this.queueLength = value;
    }

    /**
     * Gets the value of the numberOfMembers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfMembers() {
        return numberOfMembers;
    }

    /**
     * Sets the value of the numberOfMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfMembers(String value) {
        this.numberOfMembers = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the carrierMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierMedium() {
        return carrierMedium;
    }

    /**
     * Sets the value of the carrierMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierMedium(String value) {
        this.carrierMedium = value;
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
     * Gets the value of the uuiTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUITreatment() {
        return uuiTreatment;
    }

    /**
     * Sets the value of the uuiTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUITreatment(String value) {
        this.uuiTreatment = value;
    }

    /**
     * Gets the value of the asai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASAI() {
        return asai;
    }

    /**
     * Sets the value of the asai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASAI(String value) {
        this.asai = value;
    }

    /**
     * Gets the value of the ucid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCID() {
        return ucid;
    }

    /**
     * Sets the value of the ucid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCID(String value) {
        this.ucid = value;
    }

    /**
     * Gets the value of the inVDNTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInVDNTime() {
        return inVDNTime;
    }

    /**
     * Sets the value of the inVDNTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInVDNTime(String value) {
        this.inVDNTime = value;
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
     * Gets the value of the collectedDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectedDigits() {
        return collectedDigits;
    }

    /**
     * Sets the value of the collectedDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectedDigits(String value) {
        this.collectedDigits = value;
    }

    /**
     * Gets the value of the otherLAIInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherLAIInformation() {
        return otherLAIInformation;
    }

    /**
     * Sets the value of the otherLAIInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherLAIInformation(String value) {
        this.otherLAIInformation = value;
    }

    /**
     * Gets the value of the heldCallUCID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeldCallUCID() {
        return heldCallUCID;
    }

    /**
     * Sets the value of the heldCallUCID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeldCallUCID(String value) {
        this.heldCallUCID = value;
    }

    /**
     * Gets the value of the ecduui property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECDUUI() {
        return ecduui;
    }

    /**
     * Sets the value of the ecduui property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECDUUI(String value) {
        this.ecduui = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the port property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getPort() {
        if (port == null) {
            port = new ArrayList<ArrayType>();
        }
        return this.port;
    }

    /**
     * Gets the value of the code property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the code property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCode() {
        if (code == null) {
            code = new ArrayList<ArrayType>();
        }
        return this.code;
    }

    /**
     * Gets the value of the sfx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sfx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSfx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSfx() {
        if (sfx == null) {
            sfx = new ArrayList<ArrayType>();
        }
        return this.sfx;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getName() {
        if (name == null) {
            name = new ArrayList<ArrayType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the night property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the night property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNight() {
        if (night == null) {
            night = new ArrayList<ArrayType>();
        }
        return this.night;
    }

    /**
     * Gets the value of the sigGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sigGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSigGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSigGrp() {
        if (sigGrp == null) {
            sigGrp = new ArrayList<ArrayType>();
        }
        return this.sigGrp;
    }

}
