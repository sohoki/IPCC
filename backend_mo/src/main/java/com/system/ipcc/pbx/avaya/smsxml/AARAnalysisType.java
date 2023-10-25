
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AARAnalysisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AARAnalysisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dialed_String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_min" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total_max" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Route_Pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Call_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Node_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANI_Reqd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AARAnalysisType", propOrder = {
    "dialedString",
    "totalMin",
    "totalMax",
    "routePattern",
    "callType",
    "nodeNumber",
    "aniReqd"
})
public class AARAnalysisType {

    @XmlElement(name = "Dialed_String")
    protected String dialedString;
    @XmlElement(name = "Total_min")
    protected String totalMin;
    @XmlElement(name = "Total_max")
    protected String totalMax;
    @XmlElement(name = "Route_Pattern")
    protected String routePattern;
    @XmlElement(name = "Call_Type")
    protected String callType;
    @XmlElement(name = "Node_Number")
    protected String nodeNumber;
    @XmlElement(name = "ANI_Reqd")
    protected String aniReqd;

    /**
     * Gets the value of the dialedString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialedString() {
        return dialedString;
    }

    /**
     * Sets the value of the dialedString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialedString(String value) {
        this.dialedString = value;
    }

    /**
     * Gets the value of the totalMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMin() {
        return totalMin;
    }

    /**
     * Sets the value of the totalMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMin(String value) {
        this.totalMin = value;
    }

    /**
     * Gets the value of the totalMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMax() {
        return totalMax;
    }

    /**
     * Sets the value of the totalMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMax(String value) {
        this.totalMax = value;
    }

    /**
     * Gets the value of the routePattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutePattern() {
        return routePattern;
    }

    /**
     * Sets the value of the routePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutePattern(String value) {
        this.routePattern = value;
    }

    /**
     * Gets the value of the callType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallType() {
        return callType;
    }

    /**
     * Sets the value of the callType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallType(String value) {
        this.callType = value;
    }

    /**
     * Gets the value of the nodeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeNumber() {
        return nodeNumber;
    }

    /**
     * Sets the value of the nodeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeNumber(String value) {
        this.nodeNumber = value;
    }

    /**
     * Gets the value of the aniReqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANIReqd() {
        return aniReqd;
    }

    /**
     * Sets the value of the aniReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANIReqd(String value) {
        this.aniReqd = value;
    }

}
