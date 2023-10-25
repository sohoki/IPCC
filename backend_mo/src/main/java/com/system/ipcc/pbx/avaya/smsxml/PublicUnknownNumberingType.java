
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicUnknownNumberingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicUnknownNumberingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Total_Administered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Entries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}PublicUnknownNumberingArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicUnknownNumberingType", propOrder = {
    "totalAdministered",
    "maximumEntries",
    "extLen",
    "extCode",
    "trkGrps",
    "cpnPrefix",
    "cpnLen"
})
public class PublicUnknownNumberingType {

    @XmlElement(name = "Total_Administered")
    protected String totalAdministered;
    @XmlElement(name = "Maximum_Entries")
    protected String maximumEntries;
    @XmlElement(name = "Ext_Len")
    protected List<ArrayType> extLen;
    @XmlElement(name = "Ext_Code")
    protected List<ArrayType> extCode;
    @XmlElement(name = "Trk_Grps")
    protected List<ArrayType> trkGrps;
    @XmlElement(name = "CPN_Prefix")
    protected List<ArrayType> cpnPrefix;
    @XmlElement(name = "CPN_Len")
    protected List<ArrayType> cpnLen;

    /**
     * Gets the value of the totalAdministered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAdministered() {
        return totalAdministered;
    }

    /**
     * Sets the value of the totalAdministered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAdministered(String value) {
        this.totalAdministered = value;
    }

    /**
     * Gets the value of the maximumEntries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumEntries() {
        return maximumEntries;
    }

    /**
     * Sets the value of the maximumEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumEntries(String value) {
        this.maximumEntries = value;
    }

    /**
     * Gets the value of the extLen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extLen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtLen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getExtLen() {
        if (extLen == null) {
            extLen = new ArrayList<ArrayType>();
        }
        return this.extLen;
    }

    /**
     * Gets the value of the extCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getExtCode() {
        if (extCode == null) {
            extCode = new ArrayList<ArrayType>();
        }
        return this.extCode;
    }

    /**
     * Gets the value of the trkGrps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trkGrps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrkGrps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTrkGrps() {
        if (trkGrps == null) {
            trkGrps = new ArrayList<ArrayType>();
        }
        return this.trkGrps;
    }

    /**
     * Gets the value of the cpnPrefix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpnPrefix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCPNPrefix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCPNPrefix() {
        if (cpnPrefix == null) {
            cpnPrefix = new ArrayList<ArrayType>();
        }
        return this.cpnPrefix;
    }

    /**
     * Gets the value of the cpnLen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpnLen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCPNLen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCPNLen() {
        if (cpnLen == null) {
            cpnLen = new ArrayList<ArrayType>();
        }
        return this.cpnLen;
    }

}
