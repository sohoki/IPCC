
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncomingCallHandlingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncomingCallHandlingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Group_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trunk_Group_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}IncomingCallHandlingArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncomingCallHandlingType", propOrder = {
    "groupNumber",
    "trunkGroupType",
    "serviceFeature",
    "calledLength",
    "calledNumber",
    "del",
    "insert",
    "perCallCPNBN",
    "nightServ",
    "serviceFeature1",
    "calledLength1",
    "calledNumber1",
    "del1",
    "insert1",
    "perCallCPNBN1",
    "nightServ1",
    "serviceFeature2",
    "calledLength2",
    "calledNumber2",
    "del2",
    "insert2",
    "perCallCPNBN2",
    "nightServ2"
})
public class IncomingCallHandlingType {

    @XmlElement(name = "Group_Number")
    protected String groupNumber;
    @XmlElement(name = "Trunk_Group_Type")
    protected String trunkGroupType;
    @XmlElement(name = "Service_Feature")
    protected List<ArrayType> serviceFeature;
    @XmlElement(name = "Called_Length")
    protected List<ArrayType> calledLength;
    @XmlElement(name = "Called_Number")
    protected List<ArrayType> calledNumber;
    @XmlElement(name = "Del")
    protected List<ArrayType> del;
    @XmlElement(name = "Insert")
    protected List<ArrayType> insert;
    @XmlElement(name = "Per_Call_CPN_BN")
    protected List<ArrayType> perCallCPNBN;
    @XmlElement(name = "Night_Serv")
    protected List<ArrayType> nightServ;
    @XmlElement(name = "Service_Feature_1")
    protected List<ArrayType> serviceFeature1;
    @XmlElement(name = "Called_Length_1")
    protected List<ArrayType> calledLength1;
    @XmlElement(name = "Called_Number_1")
    protected List<ArrayType> calledNumber1;
    @XmlElement(name = "Del_1")
    protected List<ArrayType> del1;
    @XmlElement(name = "Insert_1")
    protected List<ArrayType> insert1;
    @XmlElement(name = "Per_Call_CPN_BN_1")
    protected List<ArrayType> perCallCPNBN1;
    @XmlElement(name = "Night_Serv_1")
    protected List<ArrayType> nightServ1;
    @XmlElement(name = "ServiceFeature2")
    protected List<ArrayType> serviceFeature2;
    @XmlElement(name = "Called_Length_2")
    protected List<ArrayType> calledLength2;
    @XmlElement(name = "Called_Number_2")
    protected List<ArrayType> calledNumber2;
    @XmlElement(name = "Del_2")
    protected List<ArrayType> del2;
    @XmlElement(name = "Insert_2")
    protected List<ArrayType> insert2;
    @XmlElement(name = "Per_Call_CPN_BN_2")
    protected List<ArrayType> perCallCPNBN2;
    @XmlElement(name = "Night_Serv_2")
    protected List<ArrayType> nightServ2;

    /**
     * Gets the value of the groupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupNumber() {
        return groupNumber;
    }

    /**
     * Sets the value of the groupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupNumber(String value) {
        this.groupNumber = value;
    }

    /**
     * Gets the value of the trunkGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrunkGroupType() {
        return trunkGroupType;
    }

    /**
     * Sets the value of the trunkGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrunkGroupType(String value) {
        this.trunkGroupType = value;
    }

    /**
     * Gets the value of the serviceFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getServiceFeature() {
        if (serviceFeature == null) {
            serviceFeature = new ArrayList<ArrayType>();
        }
        return this.serviceFeature;
    }

    /**
     * Gets the value of the calledLength property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calledLength property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalledLength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCalledLength() {
        if (calledLength == null) {
            calledLength = new ArrayList<ArrayType>();
        }
        return this.calledLength;
    }

    /**
     * Gets the value of the calledNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calledNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalledNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCalledNumber() {
        if (calledNumber == null) {
            calledNumber = new ArrayList<ArrayType>();
        }
        return this.calledNumber;
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
     * Gets the value of the insert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getInsert() {
        if (insert == null) {
            insert = new ArrayList<ArrayType>();
        }
        return this.insert;
    }

    /**
     * Gets the value of the perCallCPNBN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perCallCPNBN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerCallCPNBN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getPerCallCPNBN() {
        if (perCallCPNBN == null) {
            perCallCPNBN = new ArrayList<ArrayType>();
        }
        return this.perCallCPNBN;
    }

    /**
     * Gets the value of the nightServ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nightServ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNightServ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNightServ() {
        if (nightServ == null) {
            nightServ = new ArrayList<ArrayType>();
        }
        return this.nightServ;
    }

    /**
     * Gets the value of the serviceFeature1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeature1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeature1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getServiceFeature1() {
        if (serviceFeature1 == null) {
            serviceFeature1 = new ArrayList<ArrayType>();
        }
        return this.serviceFeature1;
    }

    /**
     * Gets the value of the calledLength1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calledLength1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalledLength1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCalledLength1() {
        if (calledLength1 == null) {
            calledLength1 = new ArrayList<ArrayType>();
        }
        return this.calledLength1;
    }

    /**
     * Gets the value of the calledNumber1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calledNumber1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalledNumber1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCalledNumber1() {
        if (calledNumber1 == null) {
            calledNumber1 = new ArrayList<ArrayType>();
        }
        return this.calledNumber1;
    }

    /**
     * Gets the value of the del1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the del1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDel1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDel1() {
        if (del1 == null) {
            del1 = new ArrayList<ArrayType>();
        }
        return this.del1;
    }

    /**
     * Gets the value of the insert1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insert1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsert1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getInsert1() {
        if (insert1 == null) {
            insert1 = new ArrayList<ArrayType>();
        }
        return this.insert1;
    }

    /**
     * Gets the value of the perCallCPNBN1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perCallCPNBN1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerCallCPNBN1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getPerCallCPNBN1() {
        if (perCallCPNBN1 == null) {
            perCallCPNBN1 = new ArrayList<ArrayType>();
        }
        return this.perCallCPNBN1;
    }

    /**
     * Gets the value of the nightServ1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nightServ1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNightServ1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNightServ1() {
        if (nightServ1 == null) {
            nightServ1 = new ArrayList<ArrayType>();
        }
        return this.nightServ1;
    }

    /**
     * Gets the value of the serviceFeature2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeature2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeature2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getServiceFeature2() {
        if (serviceFeature2 == null) {
            serviceFeature2 = new ArrayList<ArrayType>();
        }
        return this.serviceFeature2;
    }

    /**
     * Gets the value of the calledLength2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calledLength2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalledLength2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCalledLength2() {
        if (calledLength2 == null) {
            calledLength2 = new ArrayList<ArrayType>();
        }
        return this.calledLength2;
    }

    /**
     * Gets the value of the calledNumber2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calledNumber2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalledNumber2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCalledNumber2() {
        if (calledNumber2 == null) {
            calledNumber2 = new ArrayList<ArrayType>();
        }
        return this.calledNumber2;
    }

    /**
     * Gets the value of the del2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the del2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDel2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDel2() {
        if (del2 == null) {
            del2 = new ArrayList<ArrayType>();
        }
        return this.del2;
    }

    /**
     * Gets the value of the insert2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insert2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsert2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getInsert2() {
        if (insert2 == null) {
            insert2 = new ArrayList<ArrayType>();
        }
        return this.insert2;
    }

    /**
     * Gets the value of the perCallCPNBN2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perCallCPNBN2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerCallCPNBN2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getPerCallCPNBN2() {
        if (perCallCPNBN2 == null) {
            perCallCPNBN2 = new ArrayList<ArrayType>();
        }
        return this.perCallCPNBN2;
    }

    /**
     * Gets the value of the nightServ2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nightServ2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNightServ2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNightServ2() {
        if (nightServ2 == null) {
            nightServ2 = new ArrayList<ArrayType>();
        }
        return this.nightServ2;
    }

}
