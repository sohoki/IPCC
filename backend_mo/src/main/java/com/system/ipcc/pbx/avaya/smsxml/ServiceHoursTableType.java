
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceHoursTableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceHoursTableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}ServiceHoursTableArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceHoursTableType", propOrder = {
    "number",
    "description",
    "location",
    "mondayStartHour",
    "mondayStartMinute",
    "mondayEndHour",
    "mondayEndMinute",
    "tuesdayStartHour",
    "tuesdayStartMinute",
    "tuesdayEndHour",
    "tuesdayEndMinute",
    "wednesdayStartHour",
    "wednesdayStartMinute",
    "wednesdayEndHour",
    "wednesdayEndMinute",
    "thursdayStartHour",
    "thursdayStartMinute",
    "thursdayEndHour",
    "thursdayEndMinute",
    "fridayStartHour",
    "fridayStartMinute",
    "fridayEndHour",
    "fridayEndMinute",
    "saturdayStartHour",
    "saturdayStartMinute",
    "saturdayEndHour",
    "saturdayEndMinute",
    "sundayStartHour",
    "sundayStartMinute",
    "sundayEndHour",
    "sundayEndMinute"
})
public class ServiceHoursTableType {

    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Monday_Start_Hour")
    protected List<ArrayType> mondayStartHour;
    @XmlElement(name = "Monday_Start_Minute")
    protected List<ArrayType> mondayStartMinute;
    @XmlElement(name = "Monday_End_Hour")
    protected List<ArrayType> mondayEndHour;
    @XmlElement(name = "Monday_End_Minute")
    protected List<ArrayType> mondayEndMinute;
    @XmlElement(name = "Tuesday_Start_Hour")
    protected List<ArrayType> tuesdayStartHour;
    @XmlElement(name = "Tuesday_Start_Minute")
    protected List<ArrayType> tuesdayStartMinute;
    @XmlElement(name = "Tuesday_End_Hour")
    protected List<ArrayType> tuesdayEndHour;
    @XmlElement(name = "Tuesday_End_Minute")
    protected List<ArrayType> tuesdayEndMinute;
    @XmlElement(name = "Wednesday_Start_Hour")
    protected List<ArrayType> wednesdayStartHour;
    @XmlElement(name = "Wednesday_Start_Minute")
    protected List<ArrayType> wednesdayStartMinute;
    @XmlElement(name = "Wednesday_End_Hour")
    protected List<ArrayType> wednesdayEndHour;
    @XmlElement(name = "Wednesday_End_Minute")
    protected List<ArrayType> wednesdayEndMinute;
    @XmlElement(name = "Thursday_Start_Hour")
    protected List<ArrayType> thursdayStartHour;
    @XmlElement(name = "Thursday_Start_Minute")
    protected List<ArrayType> thursdayStartMinute;
    @XmlElement(name = "Thursday_End_Hour")
    protected List<ArrayType> thursdayEndHour;
    @XmlElement(name = "Thursday_End_Minute")
    protected List<ArrayType> thursdayEndMinute;
    @XmlElement(name = "Friday_Start_Hour")
    protected List<ArrayType> fridayStartHour;
    @XmlElement(name = "Friday_Start_Minute")
    protected List<ArrayType> fridayStartMinute;
    @XmlElement(name = "Friday_End_Hour")
    protected List<ArrayType> fridayEndHour;
    @XmlElement(name = "Friday_End_Minute")
    protected List<ArrayType> fridayEndMinute;
    @XmlElement(name = "Saturday_Start_Hour")
    protected List<ArrayType> saturdayStartHour;
    @XmlElement(name = "Saturday_Start_Minute")
    protected List<ArrayType> saturdayStartMinute;
    @XmlElement(name = "Saturday_End_Hour")
    protected List<ArrayType> saturdayEndHour;
    @XmlElement(name = "Saturday_End_Minute")
    protected List<ArrayType> saturdayEndMinute;
    @XmlElement(name = "Sunday_Start_Hour")
    protected List<ArrayType> sundayStartHour;
    @XmlElement(name = "Sunday_Start_Minute")
    protected List<ArrayType> sundayStartMinute;
    @XmlElement(name = "Sunday_End_Hour")
    protected List<ArrayType> sundayEndHour;
    @XmlElement(name = "Sunday_End_Minute")
    protected List<ArrayType> sundayEndMinute;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the mondayStartHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mondayStartHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMondayStartHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMondayStartHour() {
        if (mondayStartHour == null) {
            mondayStartHour = new ArrayList<ArrayType>();
        }
        return this.mondayStartHour;
    }

    /**
     * Gets the value of the mondayStartMinute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mondayStartMinute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMondayStartMinute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMondayStartMinute() {
        if (mondayStartMinute == null) {
            mondayStartMinute = new ArrayList<ArrayType>();
        }
        return this.mondayStartMinute;
    }

    /**
     * Gets the value of the mondayEndHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mondayEndHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMondayEndHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMondayEndHour() {
        if (mondayEndHour == null) {
            mondayEndHour = new ArrayList<ArrayType>();
        }
        return this.mondayEndHour;
    }

    /**
     * Gets the value of the mondayEndMinute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mondayEndMinute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMondayEndMinute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMondayEndMinute() {
        if (mondayEndMinute == null) {
            mondayEndMinute = new ArrayList<ArrayType>();
        }
        return this.mondayEndMinute;
    }

    /**
     * Gets the value of the tuesdayStartHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tuesdayStartHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTuesdayStartHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTuesdayStartHour() {
        if (tuesdayStartHour == null) {
            tuesdayStartHour = new ArrayList<ArrayType>();
        }
        return this.tuesdayStartHour;
    }

    /**
     * Gets the value of the tuesdayStartMinute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tuesdayStartMinute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTuesdayStartMinute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTuesdayStartMinute() {
        if (tuesdayStartMinute == null) {
            tuesdayStartMinute = new ArrayList<ArrayType>();
        }
        return this.tuesdayStartMinute;
    }

    /**
     * Gets the value of the tuesdayEndHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tuesdayEndHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTuesdayEndHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTuesdayEndHour() {
        if (tuesdayEndHour == null) {
            tuesdayEndHour = new ArrayList<ArrayType>();
        }
        return this.tuesdayEndHour;
    }

    /**
     * Gets the value of the tuesdayEndMinute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tuesdayEndMinute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTuesdayEndMinute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTuesdayEndMinute() {
        if (tuesdayEndMinute == null) {
            tuesdayEndMinute = new ArrayList<ArrayType>();
        }
        return this.tuesdayEndMinute;
    }

    /**
     * Gets the value of the wednesdayStartHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wednesdayStartHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWednesdayStartHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getWednesdayStartHour() {
        if (wednesdayStartHour == null) {
            wednesdayStartHour = new ArrayList<ArrayType>();
        }
        return this.wednesdayStartHour;
    }

    /**
     * Gets the value of the wednesdayStartMinute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wednesdayStartMinute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWednesdayStartMinute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getWednesdayStartMinute() {
        if (wednesdayStartMinute == null) {
            wednesdayStartMinute = new ArrayList<ArrayType>();
        }
        return this.wednesdayStartMinute;
    }

    /**
     * Gets the value of the wednesdayEndHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wednesdayEndHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWednesdayEndHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getWednesdayEndHour() {
        if (wednesdayEndHour == null) {
            wednesdayEndHour = new ArrayList<ArrayType>();
        }
        return this.wednesdayEndHour;
    }

    /**
     * Gets the value of the wednesdayEndMinute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wednesdayEndMinute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWednesdayEndMinute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getWednesdayEndMinute() {
        if (wednesdayEndMinute == null) {
            wednesdayEndMinute = new ArrayList<ArrayType>();
        }
        return this.wednesdayEndMinute;
    }

    /**
     * Gets the value of the thursdayStartHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thursdayStartHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThursdayStartHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getThursdayStartHour() {
        if (thursdayStartHour == null) {
            thursdayStartHour = new ArrayList<ArrayType>();
        }
        return this.thursdayStartHour;
    }

    /**
     * Gets the value of the thursdayStartMinute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thursdayStartMinute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThursdayStartMinute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getThursdayStartMinute() {
        if (thursdayStartMinute == null) {
            thursdayStartMinute = new ArrayList<ArrayType>();
        }
        return this.thursdayStartMinute;
    }

    /**
     * Gets the value of the thursdayEndHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thursdayEndHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThursdayEndHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getThursdayEndHour() {
        if (thursdayEndHour == null) {
            thursdayEndHour = new ArrayList<ArrayType>();
        }
        return this.thursdayEndHour;
    }

    /**
     * Gets the value of the thursdayEndMinute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thursdayEndMinute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThursdayEndMinute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getThursdayEndMinute() {
        if (thursdayEndMinute == null) {
            thursdayEndMinute = new ArrayList<ArrayType>();
        }
        return this.thursdayEndMinute;
    }

    /**
     * Gets the value of the fridayStartHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fridayStartHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFridayStartHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFridayStartHour() {
        if (fridayStartHour == null) {
            fridayStartHour = new ArrayList<ArrayType>();
        }
        return this.fridayStartHour;
    }

    /**
     * Gets the value of the fridayStartMinute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fridayStartMinute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFridayStartMinute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFridayStartMinute() {
        if (fridayStartMinute == null) {
            fridayStartMinute = new ArrayList<ArrayType>();
        }
        return this.fridayStartMinute;
    }

    /**
     * Gets the value of the fridayEndHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fridayEndHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFridayEndHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFridayEndHour() {
        if (fridayEndHour == null) {
            fridayEndHour = new ArrayList<ArrayType>();
        }
        return this.fridayEndHour;
    }

    /**
     * Gets the value of the fridayEndMinute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fridayEndMinute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFridayEndMinute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFridayEndMinute() {
        if (fridayEndMinute == null) {
            fridayEndMinute = new ArrayList<ArrayType>();
        }
        return this.fridayEndMinute;
    }

    /**
     * Gets the value of the saturdayStartHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saturdayStartHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaturdayStartHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSaturdayStartHour() {
        if (saturdayStartHour == null) {
            saturdayStartHour = new ArrayList<ArrayType>();
        }
        return this.saturdayStartHour;
    }

    /**
     * Gets the value of the saturdayStartMinute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saturdayStartMinute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaturdayStartMinute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSaturdayStartMinute() {
        if (saturdayStartMinute == null) {
            saturdayStartMinute = new ArrayList<ArrayType>();
        }
        return this.saturdayStartMinute;
    }

    /**
     * Gets the value of the saturdayEndHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saturdayEndHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaturdayEndHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSaturdayEndHour() {
        if (saturdayEndHour == null) {
            saturdayEndHour = new ArrayList<ArrayType>();
        }
        return this.saturdayEndHour;
    }

    /**
     * Gets the value of the saturdayEndMinute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saturdayEndMinute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaturdayEndMinute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSaturdayEndMinute() {
        if (saturdayEndMinute == null) {
            saturdayEndMinute = new ArrayList<ArrayType>();
        }
        return this.saturdayEndMinute;
    }

    /**
     * Gets the value of the sundayStartHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sundayStartHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSundayStartHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSundayStartHour() {
        if (sundayStartHour == null) {
            sundayStartHour = new ArrayList<ArrayType>();
        }
        return this.sundayStartHour;
    }

    /**
     * Gets the value of the sundayStartMinute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sundayStartMinute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSundayStartMinute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSundayStartMinute() {
        if (sundayStartMinute == null) {
            sundayStartMinute = new ArrayList<ArrayType>();
        }
        return this.sundayStartMinute;
    }

    /**
     * Gets the value of the sundayEndHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sundayEndHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSundayEndHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSundayEndHour() {
        if (sundayEndHour == null) {
            sundayEndHour = new ArrayList<ArrayType>();
        }
        return this.sundayEndHour;
    }

    /**
     * Gets the value of the sundayEndMinute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sundayEndMinute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSundayEndMinute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSundayEndMinute() {
        if (sundayEndMinute == null) {
            sundayEndMinute = new ArrayList<ArrayType>();
        }
        return this.sundayEndMinute;
    }

}
