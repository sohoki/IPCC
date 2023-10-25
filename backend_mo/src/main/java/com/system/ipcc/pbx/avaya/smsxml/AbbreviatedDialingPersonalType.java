
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbbreviatedDialingPersonalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbbreviatedDialingPersonalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="List_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="List_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="List_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="List_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_Entries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_Unused" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="List_Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}AbbreviatedDialingPersonalArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbbreviatedDialingPersonalType", propOrder = {
    "listType",
    "listExt",
    "listNumber",
    "listName",
    "totalEntries",
    "numberUnused",
    "extension",
    "listSize",
    "number",
    "abbreviatedDialEntry",
    "abbreviatedDialEntry1",
    "abbreviatedDialEntry2",
    "abbreviatedDialEntry3"
})
public class AbbreviatedDialingPersonalType {

    @XmlElement(name = "List_Type")
    protected String listType;
    @XmlElement(name = "List_Ext")
    protected String listExt;
    @XmlElement(name = "List_Number")
    protected String listNumber;
    @XmlElement(name = "List_Name")
    protected String listName;
    @XmlElement(name = "Total_Entries")
    protected String totalEntries;
    @XmlElement(name = "Number_Unused")
    protected String numberUnused;
    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "List_Size")
    protected String listSize;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Abbreviated_Dial_Entry")
    protected List<ArrayType> abbreviatedDialEntry;
    @XmlElement(name = "Abbreviated_Dial_Entry_1")
    protected List<ArrayType> abbreviatedDialEntry1;
    @XmlElement(name = "Abbreviated_Dial_Entry_2")
    protected List<ArrayType> abbreviatedDialEntry2;
    @XmlElement(name = "Abbreviated_Dial_Entry_3")
    protected List<ArrayType> abbreviatedDialEntry3;

    /**
     * Gets the value of the listType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListType() {
        return listType;
    }

    /**
     * Sets the value of the listType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListType(String value) {
        this.listType = value;
    }

    /**
     * Gets the value of the listExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListExt() {
        return listExt;
    }

    /**
     * Sets the value of the listExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListExt(String value) {
        this.listExt = value;
    }

    /**
     * Gets the value of the listNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListNumber() {
        return listNumber;
    }

    /**
     * Sets the value of the listNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListNumber(String value) {
        this.listNumber = value;
    }

    /**
     * Gets the value of the listName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListName() {
        return listName;
    }

    /**
     * Sets the value of the listName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListName(String value) {
        this.listName = value;
    }

    /**
     * Gets the value of the totalEntries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalEntries() {
        return totalEntries;
    }

    /**
     * Sets the value of the totalEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalEntries(String value) {
        this.totalEntries = value;
    }

    /**
     * Gets the value of the numberUnused property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberUnused() {
        return numberUnused;
    }

    /**
     * Sets the value of the numberUnused property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberUnused(String value) {
        this.numberUnused = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the listSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListSize() {
        return listSize;
    }

    /**
     * Sets the value of the listSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListSize(String value) {
        this.listSize = value;
    }

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
     * Gets the value of the abbreviatedDialEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAbbreviatedDialEntry() {
        if (abbreviatedDialEntry == null) {
            abbreviatedDialEntry = new ArrayList<ArrayType>();
        }
        return this.abbreviatedDialEntry;
    }

    /**
     * Gets the value of the abbreviatedDialEntry1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialEntry1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialEntry1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAbbreviatedDialEntry1() {
        if (abbreviatedDialEntry1 == null) {
            abbreviatedDialEntry1 = new ArrayList<ArrayType>();
        }
        return this.abbreviatedDialEntry1;
    }

    /**
     * Gets the value of the abbreviatedDialEntry2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialEntry2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialEntry2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAbbreviatedDialEntry2() {
        if (abbreviatedDialEntry2 == null) {
            abbreviatedDialEntry2 = new ArrayList<ArrayType>();
        }
        return this.abbreviatedDialEntry2;
    }

    /**
     * Gets the value of the abbreviatedDialEntry3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedDialEntry3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedDialEntry3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAbbreviatedDialEntry3() {
        if (abbreviatedDialEntry3 == null) {
            abbreviatedDialEntry3 = new ArrayList<ArrayType>();
        }
        return this.abbreviatedDialEntry3;
    }

}
