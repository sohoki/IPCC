
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoverageRemoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageRemoteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://xml.avaya.com/sms}CoverageRemoteArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageRemoteType", propOrder = {
    "remoteDigits",
    "remoteDigits1",
    "remoteDigits2",
    "remoteDigits3",
    "remoteDigits4"
})
public class CoverageRemoteType {

    @XmlElement(name = "Remote_Digits")
    protected List<ArrayType> remoteDigits;
    @XmlElement(name = "Remote_Digits_1")
    protected List<ArrayType> remoteDigits1;
    @XmlElement(name = "Remote_Digits_2")
    protected List<ArrayType> remoteDigits2;
    @XmlElement(name = "Remote_Digits_3")
    protected List<ArrayType> remoteDigits3;
    @XmlElement(name = "Remote_Digits_4")
    protected List<ArrayType> remoteDigits4;

    /**
     * Gets the value of the remoteDigits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteDigits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteDigits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRemoteDigits() {
        if (remoteDigits == null) {
            remoteDigits = new ArrayList<ArrayType>();
        }
        return this.remoteDigits;
    }

    /**
     * Gets the value of the remoteDigits1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteDigits1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteDigits1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRemoteDigits1() {
        if (remoteDigits1 == null) {
            remoteDigits1 = new ArrayList<ArrayType>();
        }
        return this.remoteDigits1;
    }

    /**
     * Gets the value of the remoteDigits2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteDigits2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteDigits2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRemoteDigits2() {
        if (remoteDigits2 == null) {
            remoteDigits2 = new ArrayList<ArrayType>();
        }
        return this.remoteDigits2;
    }

    /**
     * Gets the value of the remoteDigits3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteDigits3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteDigits3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRemoteDigits3() {
        if (remoteDigits3 == null) {
            remoteDigits3 = new ArrayList<ArrayType>();
        }
        return this.remoteDigits3;
    }

    /**
     * Gets the value of the remoteDigits4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteDigits4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteDigits4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRemoteDigits4() {
        if (remoteDigits4 == null) {
            remoteDigits4 = new ArrayList<ArrayType>();
        }
        return this.remoteDigits4;
    }

}
