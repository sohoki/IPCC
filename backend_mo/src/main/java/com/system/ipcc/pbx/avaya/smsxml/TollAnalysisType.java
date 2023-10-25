
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TollAnalysisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TollAnalysisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}TollAnalysisArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TollAnalysisType", propOrder = {
    "location",
    "dialedString",
    "min",
    "max",
    "rcl",
    "tollList",
    "cdrfeac",
    "unrestrictedCallList1",
    "unrestrictedCallList2",
    "unrestrictedCallList3",
    "unrestrictedCallList4",
    "unrestrictedCallList5",
    "unrestrictedCallList6",
    "unrestrictedCallList7",
    "unrestrictedCallList8",
    "unrestrictedCallList9",
    "unrestrictedCallList10"
})
public class TollAnalysisType {

    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Dialed_String")
    protected List<ArrayType> dialedString;
    @XmlElement(name = "Min")
    protected List<ArrayType> min;
    @XmlElement(name = "Max")
    protected List<ArrayType> max;
    @XmlElement(name = "RCL")
    protected List<ArrayType> rcl;
    @XmlElement(name = "Toll_List")
    protected List<ArrayType> tollList;
    @XmlElement(name = "CDR_FEAC")
    protected List<ArrayType> cdrfeac;
    @XmlElement(name = "Unrestricted_Call_List_1")
    protected List<ArrayType> unrestrictedCallList1;
    @XmlElement(name = "Unrestricted_Call_List_2")
    protected List<ArrayType> unrestrictedCallList2;
    @XmlElement(name = "Unrestricted_Call_List_3")
    protected List<ArrayType> unrestrictedCallList3;
    @XmlElement(name = "Unrestricted_Call_List_4")
    protected List<ArrayType> unrestrictedCallList4;
    @XmlElement(name = "Unrestricted_Call_List_5")
    protected List<ArrayType> unrestrictedCallList5;
    @XmlElement(name = "Unrestricted_Call_List_6")
    protected List<ArrayType> unrestrictedCallList6;
    @XmlElement(name = "Unrestricted_Call_List_7")
    protected List<ArrayType> unrestrictedCallList7;
    @XmlElement(name = "Unrestricted_Call_List_8")
    protected List<ArrayType> unrestrictedCallList8;
    @XmlElement(name = "Unrestricted_Call_List_9")
    protected List<ArrayType> unrestrictedCallList9;
    @XmlElement(name = "Unrestricted_Call_List_10")
    protected List<ArrayType> unrestrictedCallList10;

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
     * Gets the value of the dialedString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dialedString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDialedString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDialedString() {
        if (dialedString == null) {
            dialedString = new ArrayList<ArrayType>();
        }
        return this.dialedString;
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
     * Gets the value of the rcl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRCL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRCL() {
        if (rcl == null) {
            rcl = new ArrayList<ArrayType>();
        }
        return this.rcl;
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
     * Gets the value of the cdrfeac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdrfeac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCDRFEAC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCDRFEAC() {
        if (cdrfeac == null) {
            cdrfeac = new ArrayList<ArrayType>();
        }
        return this.cdrfeac;
    }

    /**
     * Gets the value of the unrestrictedCallList1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unrestrictedCallList1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnrestrictedCallList1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getUnrestrictedCallList1() {
        if (unrestrictedCallList1 == null) {
            unrestrictedCallList1 = new ArrayList<ArrayType>();
        }
        return this.unrestrictedCallList1;
    }

    /**
     * Gets the value of the unrestrictedCallList2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unrestrictedCallList2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnrestrictedCallList2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getUnrestrictedCallList2() {
        if (unrestrictedCallList2 == null) {
            unrestrictedCallList2 = new ArrayList<ArrayType>();
        }
        return this.unrestrictedCallList2;
    }

    /**
     * Gets the value of the unrestrictedCallList3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unrestrictedCallList3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnrestrictedCallList3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getUnrestrictedCallList3() {
        if (unrestrictedCallList3 == null) {
            unrestrictedCallList3 = new ArrayList<ArrayType>();
        }
        return this.unrestrictedCallList3;
    }

    /**
     * Gets the value of the unrestrictedCallList4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unrestrictedCallList4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnrestrictedCallList4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getUnrestrictedCallList4() {
        if (unrestrictedCallList4 == null) {
            unrestrictedCallList4 = new ArrayList<ArrayType>();
        }
        return this.unrestrictedCallList4;
    }

    /**
     * Gets the value of the unrestrictedCallList5 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unrestrictedCallList5 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnrestrictedCallList5().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getUnrestrictedCallList5() {
        if (unrestrictedCallList5 == null) {
            unrestrictedCallList5 = new ArrayList<ArrayType>();
        }
        return this.unrestrictedCallList5;
    }

    /**
     * Gets the value of the unrestrictedCallList6 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unrestrictedCallList6 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnrestrictedCallList6().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getUnrestrictedCallList6() {
        if (unrestrictedCallList6 == null) {
            unrestrictedCallList6 = new ArrayList<ArrayType>();
        }
        return this.unrestrictedCallList6;
    }

    /**
     * Gets the value of the unrestrictedCallList7 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unrestrictedCallList7 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnrestrictedCallList7().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getUnrestrictedCallList7() {
        if (unrestrictedCallList7 == null) {
            unrestrictedCallList7 = new ArrayList<ArrayType>();
        }
        return this.unrestrictedCallList7;
    }

    /**
     * Gets the value of the unrestrictedCallList8 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unrestrictedCallList8 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnrestrictedCallList8().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getUnrestrictedCallList8() {
        if (unrestrictedCallList8 == null) {
            unrestrictedCallList8 = new ArrayList<ArrayType>();
        }
        return this.unrestrictedCallList8;
    }

    /**
     * Gets the value of the unrestrictedCallList9 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unrestrictedCallList9 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnrestrictedCallList9().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getUnrestrictedCallList9() {
        if (unrestrictedCallList9 == null) {
            unrestrictedCallList9 = new ArrayList<ArrayType>();
        }
        return this.unrestrictedCallList9;
    }

    /**
     * Gets the value of the unrestrictedCallList10 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unrestrictedCallList10 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnrestrictedCallList10().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getUnrestrictedCallList10() {
        if (unrestrictedCallList10 == null) {
            unrestrictedCallList10 = new ArrayList<ArrayType>();
        }
        return this.unrestrictedCallList10;
    }

}
