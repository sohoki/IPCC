
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignalingGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignalingGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Group_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Near_End_Node_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Far_End_Node_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Far_End_Network_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Far_End_Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignalingGroupType", propOrder = {
    "groupNumber",
    "groupType",
    "nearEndNodeName",
    "farEndNodeName",
    "farEndNetworkRegion",
    "farEndDomain"
})
public class SignalingGroupType {

    @XmlElement(name = "Group_Number")
    protected String groupNumber;
    @XmlElement(name = "Group_Type")
    protected String groupType;
    @XmlElement(name = "Near_End_Node_Name")
    protected String nearEndNodeName;
    @XmlElement(name = "Far_End_Node_Name")
    protected String farEndNodeName;
    @XmlElement(name = "Far_End_Network_Region")
    protected String farEndNetworkRegion;
    @XmlElement(name = "Far_End_Domain")
    protected String farEndDomain;

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
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

    /**
     * Gets the value of the nearEndNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNearEndNodeName() {
        return nearEndNodeName;
    }

    /**
     * Sets the value of the nearEndNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNearEndNodeName(String value) {
        this.nearEndNodeName = value;
    }

    /**
     * Gets the value of the farEndNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarEndNodeName() {
        return farEndNodeName;
    }

    /**
     * Sets the value of the farEndNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarEndNodeName(String value) {
        this.farEndNodeName = value;
    }

    /**
     * Gets the value of the farEndNetworkRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarEndNetworkRegion() {
        return farEndNetworkRegion;
    }

    /**
     * Sets the value of the farEndNetworkRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarEndNetworkRegion(String value) {
        this.farEndNetworkRegion = value;
    }

    /**
     * Gets the value of the farEndDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarEndDomain() {
        return farEndDomain;
    }

    /**
     * Sets the value of the farEndDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarEndDomain(String value) {
        this.farEndDomain = value;
    }

}
