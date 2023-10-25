
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HolidayTableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HolidayTableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}HolidayTableArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HolidayTableType", propOrder = {
    "number",
    "name",
    "startMonth",
    "startDay",
    "startHour",
    "startMinutes",
    "endMonth",
    "endDay",
    "endHour",
    "endMinutes",
    "descriptionOfHoliday"
})
public class HolidayTableType {

    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Start_Month")
    protected List<ArrayType> startMonth;
    @XmlElement(name = "Start_Day")
    protected List<ArrayType> startDay;
    @XmlElement(name = "Start_Hour")
    protected List<ArrayType> startHour;
    @XmlElement(name = "Start_Minutes")
    protected List<ArrayType> startMinutes;
    @XmlElement(name = "End_Month")
    protected List<ArrayType> endMonth;
    @XmlElement(name = "End_Day")
    protected List<ArrayType> endDay;
    @XmlElement(name = "End_Hour")
    protected List<ArrayType> endHour;
    @XmlElement(name = "End_Minutes")
    protected List<ArrayType> endMinutes;
    @XmlElement(name = "Description_of_holiday")
    protected List<ArrayType> descriptionOfHoliday;

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
     * Gets the value of the startMonth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startMonth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getStartMonth() {
        if (startMonth == null) {
            startMonth = new ArrayList<ArrayType>();
        }
        return this.startMonth;
    }

    /**
     * Gets the value of the startDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getStartDay() {
        if (startDay == null) {
            startDay = new ArrayList<ArrayType>();
        }
        return this.startDay;
    }

    /**
     * Gets the value of the startHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getStartHour() {
        if (startHour == null) {
            startHour = new ArrayList<ArrayType>();
        }
        return this.startHour;
    }

    /**
     * Gets the value of the startMinutes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startMinutes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartMinutes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getStartMinutes() {
        if (startMinutes == null) {
            startMinutes = new ArrayList<ArrayType>();
        }
        return this.startMinutes;
    }

    /**
     * Gets the value of the endMonth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endMonth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getEndMonth() {
        if (endMonth == null) {
            endMonth = new ArrayList<ArrayType>();
        }
        return this.endMonth;
    }

    /**
     * Gets the value of the endDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getEndDay() {
        if (endDay == null) {
            endDay = new ArrayList<ArrayType>();
        }
        return this.endDay;
    }

    /**
     * Gets the value of the endHour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endHour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getEndHour() {
        if (endHour == null) {
            endHour = new ArrayList<ArrayType>();
        }
        return this.endHour;
    }

    /**
     * Gets the value of the endMinutes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endMinutes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndMinutes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getEndMinutes() {
        if (endMinutes == null) {
            endMinutes = new ArrayList<ArrayType>();
        }
        return this.endMinutes;
    }

    /**
     * Gets the value of the descriptionOfHoliday property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionOfHoliday property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionOfHoliday().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDescriptionOfHoliday() {
        if (descriptionOfHoliday == null) {
            descriptionOfHoliday = new ArrayList<ArrayType>();
        }
        return this.descriptionOfHoliday;
    }

}
