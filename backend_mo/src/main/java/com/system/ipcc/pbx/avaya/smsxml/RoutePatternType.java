
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutePatternType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutePatternType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Route_Pattern_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rout_Pat_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rout_Pat_SCCAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rout_Secure_SIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Route_Pattern_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}RoutePatternArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePatternType", propOrder = {
    "routePatternNumber",
    "routPatName",
    "routPatSCCAN",
    "routSecureSIP",
    "routePatternStatus",
    "trunkGroupNumber",
    "facilityRestrictionList",
    "npa",
    "prefixMark",
    "hopLimit",
    "tollList",
    "deletedDigits",
    "insertedDigits",
    "band",
    "dscqsig",
    "ixcCode",
    "bcc0",
    "bcc1",
    "bcc2",
    "bccm",
    "bcc4",
    "bccw",
    "tsc",
    "catscRequest",
    "itc",
    "bcie",
    "serviceFeature",
    "numDigitsSubAddress",
    "numberingFormat",
    "lookAheadRouting"
})
public class RoutePatternType {

    @XmlElement(name = "Route_Pattern_Number")
    protected String routePatternNumber;
    @XmlElement(name = "Rout_Pat_Name")
    protected String routPatName;
    @XmlElement(name = "Rout_Pat_SCCAN")
    protected String routPatSCCAN;
    @XmlElement(name = "Rout_Secure_SIP")
    protected String routSecureSIP;
    @XmlElement(name = "Route_Pattern_Status")
    protected String routePatternStatus;
    @XmlElement(name = "Trunk_Group_Number")
    protected List<ArrayType> trunkGroupNumber;
    @XmlElement(name = "Facility_Restriction_List")
    protected List<ArrayType> facilityRestrictionList;
    @XmlElement(name = "NPA")
    protected List<ArrayType> npa;
    @XmlElement(name = "Prefix_Mark")
    protected List<ArrayType> prefixMark;
    @XmlElement(name = "Hop_Limit")
    protected List<ArrayType> hopLimit;
    @XmlElement(name = "Toll_List")
    protected List<ArrayType> tollList;
    @XmlElement(name = "Deleted_Digits")
    protected List<ArrayType> deletedDigits;
    @XmlElement(name = "Inserted_Digits")
    protected List<ArrayType> insertedDigits;
    @XmlElement(name = "Band")
    protected List<ArrayType> band;
    @XmlElement(name = "DSC_QSIG")
    protected List<ArrayType> dscqsig;
    @XmlElement(name = "IXC_Code")
    protected List<ArrayType> ixcCode;
    @XmlElement(name = "BCC0")
    protected List<ArrayType> bcc0;
    @XmlElement(name = "BCC1")
    protected List<ArrayType> bcc1;
    @XmlElement(name = "BCC2")
    protected List<ArrayType> bcc2;
    @XmlElement(name = "BCCM")
    protected List<ArrayType> bccm;
    @XmlElement(name = "BCC4")
    protected List<ArrayType> bcc4;
    @XmlElement(name = "BCCW")
    protected List<ArrayType> bccw;
    @XmlElement(name = "TSC")
    protected List<ArrayType> tsc;
    @XmlElement(name = "CATSC_Request")
    protected List<ArrayType> catscRequest;
    @XmlElement(name = "ITC")
    protected List<ArrayType> itc;
    @XmlElement(name = "BCIE")
    protected List<ArrayType> bcie;
    @XmlElement(name = "Service_Feature")
    protected List<ArrayType> serviceFeature;
    @XmlElement(name = "Num_Digits_Sub_Address")
    protected List<ArrayType> numDigitsSubAddress;
    @XmlElement(name = "Numbering_Format")
    protected List<ArrayType> numberingFormat;
    @XmlElement(name = "Look_Ahead_Routing")
    protected List<ArrayType> lookAheadRouting;

    /**
     * Gets the value of the routePatternNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutePatternNumber() {
        return routePatternNumber;
    }

    /**
     * Sets the value of the routePatternNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutePatternNumber(String value) {
        this.routePatternNumber = value;
    }

    /**
     * Gets the value of the routPatName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutPatName() {
        return routPatName;
    }

    /**
     * Sets the value of the routPatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutPatName(String value) {
        this.routPatName = value;
    }

    /**
     * Gets the value of the routPatSCCAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutPatSCCAN() {
        return routPatSCCAN;
    }

    /**
     * Sets the value of the routPatSCCAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutPatSCCAN(String value) {
        this.routPatSCCAN = value;
    }

    /**
     * Gets the value of the routSecureSIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutSecureSIP() {
        return routSecureSIP;
    }

    /**
     * Sets the value of the routSecureSIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutSecureSIP(String value) {
        this.routSecureSIP = value;
    }

    /**
     * Gets the value of the routePatternStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutePatternStatus() {
        return routePatternStatus;
    }

    /**
     * Sets the value of the routePatternStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutePatternStatus(String value) {
        this.routePatternStatus = value;
    }

    /**
     * Gets the value of the trunkGroupNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trunkGroupNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrunkGroupNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTrunkGroupNumber() {
        if (trunkGroupNumber == null) {
            trunkGroupNumber = new ArrayList<ArrayType>();
        }
        return this.trunkGroupNumber;
    }

    /**
     * Gets the value of the facilityRestrictionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityRestrictionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityRestrictionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFacilityRestrictionList() {
        if (facilityRestrictionList == null) {
            facilityRestrictionList = new ArrayList<ArrayType>();
        }
        return this.facilityRestrictionList;
    }

    /**
     * Gets the value of the npa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the npa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNPA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNPA() {
        if (npa == null) {
            npa = new ArrayList<ArrayType>();
        }
        return this.npa;
    }

    /**
     * Gets the value of the prefixMark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefixMark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefixMark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getPrefixMark() {
        if (prefixMark == null) {
            prefixMark = new ArrayList<ArrayType>();
        }
        return this.prefixMark;
    }

    /**
     * Gets the value of the hopLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hopLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHopLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getHopLimit() {
        if (hopLimit == null) {
            hopLimit = new ArrayList<ArrayType>();
        }
        return this.hopLimit;
    }

    /**
     * Gets the value of the tollList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tollList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTollList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTollList() {
        if (tollList == null) {
            tollList = new ArrayList<ArrayType>();
        }
        return this.tollList;
    }

    /**
     * Gets the value of the deletedDigits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletedDigits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletedDigits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDeletedDigits() {
        if (deletedDigits == null) {
            deletedDigits = new ArrayList<ArrayType>();
        }
        return this.deletedDigits;
    }

    /**
     * Gets the value of the insertedDigits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insertedDigits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsertedDigits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getInsertedDigits() {
        if (insertedDigits == null) {
            insertedDigits = new ArrayList<ArrayType>();
        }
        return this.insertedDigits;
    }

    /**
     * Gets the value of the band property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the band property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBand() {
        if (band == null) {
            band = new ArrayList<ArrayType>();
        }
        return this.band;
    }

    /**
     * Gets the value of the dscqsig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dscqsig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSCQSIG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDSCQSIG() {
        if (dscqsig == null) {
            dscqsig = new ArrayList<ArrayType>();
        }
        return this.dscqsig;
    }

    /**
     * Gets the value of the ixcCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ixcCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIXCCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getIXCCode() {
        if (ixcCode == null) {
            ixcCode = new ArrayList<ArrayType>();
        }
        return this.ixcCode;
    }

    /**
     * Gets the value of the bcc0 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bcc0 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBCC0().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBCC0() {
        if (bcc0 == null) {
            bcc0 = new ArrayList<ArrayType>();
        }
        return this.bcc0;
    }

    /**
     * Gets the value of the bcc1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bcc1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBCC1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBCC1() {
        if (bcc1 == null) {
            bcc1 = new ArrayList<ArrayType>();
        }
        return this.bcc1;
    }

    /**
     * Gets the value of the bcc2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bcc2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBCC2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBCC2() {
        if (bcc2 == null) {
            bcc2 = new ArrayList<ArrayType>();
        }
        return this.bcc2;
    }

    /**
     * Gets the value of the bccm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bccm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBCCM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBCCM() {
        if (bccm == null) {
            bccm = new ArrayList<ArrayType>();
        }
        return this.bccm;
    }

    /**
     * Gets the value of the bcc4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bcc4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBCC4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBCC4() {
        if (bcc4 == null) {
            bcc4 = new ArrayList<ArrayType>();
        }
        return this.bcc4;
    }

    /**
     * Gets the value of the bccw property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bccw property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBCCW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBCCW() {
        if (bccw == null) {
            bccw = new ArrayList<ArrayType>();
        }
        return this.bccw;
    }

    /**
     * Gets the value of the tsc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tsc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTSC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTSC() {
        if (tsc == null) {
            tsc = new ArrayList<ArrayType>();
        }
        return this.tsc;
    }

    /**
     * Gets the value of the catscRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catscRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCATSCRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCATSCRequest() {
        if (catscRequest == null) {
            catscRequest = new ArrayList<ArrayType>();
        }
        return this.catscRequest;
    }

    /**
     * Gets the value of the itc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getITC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getITC() {
        if (itc == null) {
            itc = new ArrayList<ArrayType>();
        }
        return this.itc;
    }

    /**
     * Gets the value of the bcie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bcie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBCIE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBCIE() {
        if (bcie == null) {
            bcie = new ArrayList<ArrayType>();
        }
        return this.bcie;
    }

    /**
     * Gets the value of the serviceFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getServiceFeature() {
        if (serviceFeature == null) {
            serviceFeature = new ArrayList<ArrayType>();
        }
        return this.serviceFeature;
    }

    /**
     * Gets the value of the numDigitsSubAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numDigitsSubAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumDigitsSubAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNumDigitsSubAddress() {
        if (numDigitsSubAddress == null) {
            numDigitsSubAddress = new ArrayList<ArrayType>();
        }
        return this.numDigitsSubAddress;
    }

    /**
     * Gets the value of the numberingFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberingFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberingFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNumberingFormat() {
        if (numberingFormat == null) {
            numberingFormat = new ArrayList<ArrayType>();
        }
        return this.numberingFormat;
    }

    /**
     * Gets the value of the lookAheadRouting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lookAheadRouting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLookAheadRouting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getLookAheadRouting() {
        if (lookAheadRouting == null) {
            lookAheadRouting = new ArrayList<ArrayType>();
        }
        return this.lookAheadRouting;
    }

}
