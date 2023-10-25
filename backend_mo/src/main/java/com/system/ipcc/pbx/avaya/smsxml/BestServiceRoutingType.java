
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BestServiceRoutingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BestServiceRoutingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Suppression_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}BestServiceRoutingArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BestServiceRoutingType", propOrder = {
    "number",
    "name",
    "maximumSuppressionTime",
    "lock",
    "num",
    "locationName",
    "switchNode",
    "statusPollVDN",
    "interflowVDN",
    "netRedir"
})
public class BestServiceRoutingType {

    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Maximum_Suppression_Time")
    protected String maximumSuppressionTime;
    @XmlElement(name = "Lock")
    protected String lock;
    @XmlElement(name = "Num")
    protected List<ArrayType> num;
    @XmlElement(name = "Location_Name")
    protected List<ArrayType> locationName;
    @XmlElement(name = "Switch_Node")
    protected List<ArrayType> switchNode;
    @XmlElement(name = "Status_Poll_VDN")
    protected List<ArrayType> statusPollVDN;
    @XmlElement(name = "Interflow_VDN")
    protected List<ArrayType> interflowVDN;
    @XmlElement(name = "Net_Redir")
    protected List<ArrayType> netRedir;

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
     * Gets the value of the maximumSuppressionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumSuppressionTime() {
        return maximumSuppressionTime;
    }

    /**
     * Sets the value of the maximumSuppressionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumSuppressionTime(String value) {
        this.maximumSuppressionTime = value;
    }

    /**
     * Gets the value of the lock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLock() {
        return lock;
    }

    /**
     * Sets the value of the lock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLock(String value) {
        this.lock = value;
    }

    /**
     * Gets the value of the num property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the num property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNum() {
        if (num == null) {
            num = new ArrayList<ArrayType>();
        }
        return this.num;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getLocationName() {
        if (locationName == null) {
            locationName = new ArrayList<ArrayType>();
        }
        return this.locationName;
    }

    /**
     * Gets the value of the switchNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the switchNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwitchNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSwitchNode() {
        if (switchNode == null) {
            switchNode = new ArrayList<ArrayType>();
        }
        return this.switchNode;
    }

    /**
     * Gets the value of the statusPollVDN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusPollVDN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusPollVDN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getStatusPollVDN() {
        if (statusPollVDN == null) {
            statusPollVDN = new ArrayList<ArrayType>();
        }
        return this.statusPollVDN;
    }

    /**
     * Gets the value of the interflowVDN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interflowVDN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterflowVDN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getInterflowVDN() {
        if (interflowVDN == null) {
            interflowVDN = new ArrayList<ArrayType>();
        }
        return this.interflowVDN;
    }

    /**
     * Gets the value of the netRedir property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netRedir property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetRedir().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNetRedir() {
        if (netRedir == null) {
            netRedir = new ArrayList<ArrayType>();
        }
        return this.netRedir;
    }

}
