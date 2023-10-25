
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DialPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DialPlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://xml.avaya.com/sms}DialPlanArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialPlanType", propOrder = {
    "dialedString",
    "dialedString1",
    "dialedString2",
    "dialedString3",
    "dialedString4",
    "totalLength",
    "totalLength1",
    "totalLength2",
    "totalLength3",
    "totalLength4",
    "callType",
    "callType1",
    "callType2",
    "callType3",
    "callType4"
})
public class DialPlanType {

    @XmlElement(name = "Dialed_String")
    protected List<ArrayType> dialedString;
    @XmlElement(name = "Dialed_String1")
    protected List<ArrayType> dialedString1;
    @XmlElement(name = "Dialed_String2")
    protected List<ArrayType> dialedString2;
    @XmlElement(name = "Dialed_String3")
    protected List<ArrayType> dialedString3;
    @XmlElement(name = "Dialed_String4")
    protected List<ArrayType> dialedString4;
    @XmlElement(name = "Total_Length")
    protected List<ArrayType> totalLength;
    @XmlElement(name = "Total_Length1")
    protected List<ArrayType> totalLength1;
    @XmlElement(name = "Total_Length2")
    protected List<ArrayType> totalLength2;
    @XmlElement(name = "Total_Length3")
    protected List<ArrayType> totalLength3;
    @XmlElement(name = "Total_Length4")
    protected List<ArrayType> totalLength4;
    @XmlElement(name = "Call_Type")
    protected List<ArrayType> callType;
    @XmlElement(name = "Call_Type1")
    protected List<ArrayType> callType1;
    @XmlElement(name = "Call_Type2")
    protected List<ArrayType> callType2;
    @XmlElement(name = "Call_Type3")
    protected List<ArrayType> callType3;
    @XmlElement(name = "Call_Type4")
    protected List<ArrayType> callType4;

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
     * Gets the value of the dialedString1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dialedString1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDialedString1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDialedString1() {
        if (dialedString1 == null) {
            dialedString1 = new ArrayList<ArrayType>();
        }
        return this.dialedString1;
    }

    /**
     * Gets the value of the dialedString2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dialedString2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDialedString2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDialedString2() {
        if (dialedString2 == null) {
            dialedString2 = new ArrayList<ArrayType>();
        }
        return this.dialedString2;
    }

    /**
     * Gets the value of the dialedString3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dialedString3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDialedString3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDialedString3() {
        if (dialedString3 == null) {
            dialedString3 = new ArrayList<ArrayType>();
        }
        return this.dialedString3;
    }

    /**
     * Gets the value of the dialedString4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dialedString4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDialedString4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDialedString4() {
        if (dialedString4 == null) {
            dialedString4 = new ArrayList<ArrayType>();
        }
        return this.dialedString4;
    }

    /**
     * Gets the value of the totalLength property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalLength property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalLength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTotalLength() {
        if (totalLength == null) {
            totalLength = new ArrayList<ArrayType>();
        }
        return this.totalLength;
    }

    /**
     * Gets the value of the totalLength1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalLength1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalLength1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTotalLength1() {
        if (totalLength1 == null) {
            totalLength1 = new ArrayList<ArrayType>();
        }
        return this.totalLength1;
    }

    /**
     * Gets the value of the totalLength2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalLength2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalLength2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTotalLength2() {
        if (totalLength2 == null) {
            totalLength2 = new ArrayList<ArrayType>();
        }
        return this.totalLength2;
    }

    /**
     * Gets the value of the totalLength3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalLength3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalLength3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTotalLength3() {
        if (totalLength3 == null) {
            totalLength3 = new ArrayList<ArrayType>();
        }
        return this.totalLength3;
    }

    /**
     * Gets the value of the totalLength4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalLength4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalLength4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTotalLength4() {
        if (totalLength4 == null) {
            totalLength4 = new ArrayList<ArrayType>();
        }
        return this.totalLength4;
    }

    /**
     * Gets the value of the callType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallType() {
        if (callType == null) {
            callType = new ArrayList<ArrayType>();
        }
        return this.callType;
    }

    /**
     * Gets the value of the callType1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callType1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallType1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallType1() {
        if (callType1 == null) {
            callType1 = new ArrayList<ArrayType>();
        }
        return this.callType1;
    }

    /**
     * Gets the value of the callType2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callType2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallType2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallType2() {
        if (callType2 == null) {
            callType2 = new ArrayList<ArrayType>();
        }
        return this.callType2;
    }

    /**
     * Gets the value of the callType3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callType3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallType3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallType3() {
        if (callType3 == null) {
            callType3 = new ArrayList<ArrayType>();
        }
        return this.callType3;
    }

    /**
     * Gets the value of the callType4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callType4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallType4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallType4() {
        if (callType4 == null) {
            callType4 = new ArrayList<ArrayType>();
        }
        return this.callType4;
    }

}
