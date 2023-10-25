
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverageTimeOfDayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageTimeOfDayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Table_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}CoverageTimeOfDayArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageTimeOfDayType", propOrder = {
    "tableNumber",
    "hour",
    "minute",
    "coveragePath"
})
public class CoverageTimeOfDayType {

    @XmlElement(name = "Table_Number")
    protected String tableNumber;
    @XmlElement(name = "Hour")
    protected List<ArrayType> hour;
    @XmlElement(name = "Minute")
    protected List<ArrayType> minute;
    @XmlElement(name = "Coverage_Path")
    protected List<ArrayType> coveragePath;

    /**
     * Gets the value of the tableNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableNumber() {
        return tableNumber;
    }

    /**
     * Sets the value of the tableNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableNumber(String value) {
        this.tableNumber = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getHour() {
        if (hour == null) {
            hour = new ArrayList<ArrayType>();
        }
        return this.hour;
    }

    /**
     * Gets the value of the minute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMinute() {
        if (minute == null) {
            minute = new ArrayList<ArrayType>();
        }
        return this.minute;
    }

    /**
     * Gets the value of the coveragePath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coveragePath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoveragePath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCoveragePath() {
        if (coveragePath == null) {
            coveragePath = new ArrayList<ArrayType>();
        }
        return this.coveragePath;
    }

}
