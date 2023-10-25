
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://xml.avaya.com/sms}LocationsArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationsType", propOrder = {
    "locationNumber",
    "name",
    "timezoneOffset",
    "timezoneOffsetHours",
    "timezoneOffsetMinutes",
    "ruleOrDST",
    "npaOrAreaOrCity",
    "nthAm",
    "proxySelectRoutePattern",
    "arsfac",
    "attdFAC",
    "dispParam",
    "locParam",
    "prefix"
})
public class LocationsType {

    @XmlElement(name = "Location__Number")
    protected List<ArrayType> locationNumber;
    @XmlElement(name = "Name")
    protected List<ArrayType> name;
    @XmlElement(name = "Timezone_Offset")
    protected List<ArrayType> timezoneOffset;
    @XmlElement(name = "Timezone_Offset_Hours")
    protected List<ArrayType> timezoneOffsetHours;
    @XmlElement(name = "Timezone_Offset_Minutes")
    protected List<ArrayType> timezoneOffsetMinutes;
    @XmlElement(name = "Rule_or_DST")
    protected List<ArrayType> ruleOrDST;
    @XmlElement(name = "NPA_or_Area_or_City")
    protected List<ArrayType> npaOrAreaOrCity;
    @XmlElement(name = "Nth_Am")
    protected List<ArrayType> nthAm;
    @XmlElement(name = "Proxy_Select_Route_Pattern")
    protected List<ArrayType> proxySelectRoutePattern;
    @XmlElement(name = "ARS_FAC")
    protected List<ArrayType> arsfac;
    @XmlElement(name = "Attd_FAC")
    protected List<ArrayType> attdFAC;
    @XmlElement(name = "Disp_Param")
    protected List<ArrayType> dispParam;
    @XmlElement(name = "Loc_Param")
    protected List<ArrayType> locParam;
    @XmlElement(name = "Prefix")
    protected List<ArrayType> prefix;

    /**
     * Gets the value of the locationNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getLocationNumber() {
        if (locationNumber == null) {
            locationNumber = new ArrayList<ArrayType>();
        }
        return this.locationNumber;
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
     * Gets the value of the timezoneOffset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timezoneOffset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimezoneOffset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTimezoneOffset() {
        if (timezoneOffset == null) {
            timezoneOffset = new ArrayList<ArrayType>();
        }
        return this.timezoneOffset;
    }

    /**
     * Gets the value of the timezoneOffsetHours property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timezoneOffsetHours property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimezoneOffsetHours().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTimezoneOffsetHours() {
        if (timezoneOffsetHours == null) {
            timezoneOffsetHours = new ArrayList<ArrayType>();
        }
        return this.timezoneOffsetHours;
    }

    /**
     * Gets the value of the timezoneOffsetMinutes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timezoneOffsetMinutes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimezoneOffsetMinutes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTimezoneOffsetMinutes() {
        if (timezoneOffsetMinutes == null) {
            timezoneOffsetMinutes = new ArrayList<ArrayType>();
        }
        return this.timezoneOffsetMinutes;
    }

    /**
     * Gets the value of the ruleOrDST property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleOrDST property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleOrDST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRuleOrDST() {
        if (ruleOrDST == null) {
            ruleOrDST = new ArrayList<ArrayType>();
        }
        return this.ruleOrDST;
    }

    /**
     * Gets the value of the npaOrAreaOrCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the npaOrAreaOrCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNPAOrAreaOrCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNPAOrAreaOrCity() {
        if (npaOrAreaOrCity == null) {
            npaOrAreaOrCity = new ArrayList<ArrayType>();
        }
        return this.npaOrAreaOrCity;
    }

    /**
     * Gets the value of the nthAm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nthAm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNthAm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNthAm() {
        if (nthAm == null) {
            nthAm = new ArrayList<ArrayType>();
        }
        return this.nthAm;
    }

    /**
     * Gets the value of the proxySelectRoutePattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proxySelectRoutePattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProxySelectRoutePattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getProxySelectRoutePattern() {
        if (proxySelectRoutePattern == null) {
            proxySelectRoutePattern = new ArrayList<ArrayType>();
        }
        return this.proxySelectRoutePattern;
    }

    /**
     * Gets the value of the arsfac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arsfac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getARSFAC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getARSFAC() {
        if (arsfac == null) {
            arsfac = new ArrayList<ArrayType>();
        }
        return this.arsfac;
    }

    /**
     * Gets the value of the attdFAC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attdFAC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttdFAC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAttdFAC() {
        if (attdFAC == null) {
            attdFAC = new ArrayList<ArrayType>();
        }
        return this.attdFAC;
    }

    /**
     * Gets the value of the dispParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDispParam() {
        if (dispParam == null) {
            dispParam = new ArrayList<ArrayType>();
        }
        return this.dispParam;
    }

    /**
     * Gets the value of the locParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getLocParam() {
        if (locParam == null) {
            locParam = new ArrayList<ArrayType>();
        }
        return this.locParam;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getPrefix() {
        if (prefix == null) {
            prefix = new ArrayList<ArrayType>();
        }
        return this.prefix;
    }

}
