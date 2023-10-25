
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ARSDigitConversionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ARSDigitConversionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Percent_Full" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}ARSDigitConversionArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARSDigitConversionType", propOrder = {
    "location",
    "percentFull",
    "matchingPattern",
    "min",
    "max",
    "del",
    "replacementString",
    "net",
    "conv",
    "aniReq"
})
public class ARSDigitConversionType {

    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Percent_Full")
    protected String percentFull;
    @XmlElement(name = "Matching_Pattern")
    protected List<ArrayType> matchingPattern;
    @XmlElement(name = "Min")
    protected List<ArrayType> min;
    @XmlElement(name = "Max")
    protected List<ArrayType> max;
    @XmlElement(name = "Del")
    protected List<ArrayType> del;
    @XmlElement(name = "Replacement_String")
    protected List<ArrayType> replacementString;
    @XmlElement(name = "Net")
    protected List<ArrayType> net;
    @XmlElement(name = "Conv")
    protected List<ArrayType> conv;
    @XmlElement(name = "ANI_Req")
    protected List<ArrayType> aniReq;

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
     * Gets the value of the percentFull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentFull() {
        return percentFull;
    }

    /**
     * Sets the value of the percentFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentFull(String value) {
        this.percentFull = value;
    }

    /**
     * Gets the value of the matchingPattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchingPattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchingPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMatchingPattern() {
        if (matchingPattern == null) {
            matchingPattern = new ArrayList<ArrayType>();
        }
        return this.matchingPattern;
    }

    /**
     * Gets the value of the min property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the min property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMin() {
        if (min == null) {
            min = new ArrayList<ArrayType>();
        }
        return this.min;
    }

    /**
     * Gets the value of the max property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the max property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMax() {
        if (max == null) {
            max = new ArrayList<ArrayType>();
        }
        return this.max;
    }

    /**
     * Gets the value of the del property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the del property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDel() {
        if (del == null) {
            del = new ArrayList<ArrayType>();
        }
        return this.del;
    }

    /**
     * Gets the value of the replacementString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replacementString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplacementString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getReplacementString() {
        if (replacementString == null) {
            replacementString = new ArrayList<ArrayType>();
        }
        return this.replacementString;
    }

    /**
     * Gets the value of the net property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the net property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNet() {
        if (net == null) {
            net = new ArrayList<ArrayType>();
        }
        return this.net;
    }

    /**
     * Gets the value of the conv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getConv() {
        if (conv == null) {
            conv = new ArrayList<ArrayType>();
        }
        return this.conv;
    }

    /**
     * Gets the value of the aniReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aniReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getANIReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getANIReq() {
        if (aniReq == null) {
            aniReq = new ArrayList<ArrayType>();
        }
        return this.aniReq;
    }

}
