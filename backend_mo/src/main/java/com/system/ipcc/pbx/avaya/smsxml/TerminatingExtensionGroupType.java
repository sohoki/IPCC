
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminatingExtensionGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminatingExtensionGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Group_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage_Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDN_SIP_Caller_Disp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LWC_Reception" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUDIX_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="No_Of_Memebers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Security_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}TerminatingExtensionGroupArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminatingExtensionGroupType", propOrder = {
    "groupNumber",
    "groupExtension",
    "groupName",
    "coveragePath",
    "cor",
    "tn",
    "isdnsipCallerDisp",
    "lwcReception",
    "audixName",
    "noOfMemebers",
    "securityCode",
    "ext",
    "extName"
})
public class TerminatingExtensionGroupType {

    @XmlElement(name = "Group_Number")
    protected String groupNumber;
    @XmlElement(name = "Group_Extension")
    protected String groupExtension;
    @XmlElement(name = "Group_Name")
    protected String groupName;
    @XmlElement(name = "Coverage_Path")
    protected String coveragePath;
    @XmlElement(name = "COR")
    protected String cor;
    @XmlElement(name = "TN")
    protected String tn;
    @XmlElement(name = "ISDN_SIP_Caller_Disp")
    protected String isdnsipCallerDisp;
    @XmlElement(name = "LWC_Reception")
    protected String lwcReception;
    @XmlElement(name = "AUDIX_Name")
    protected String audixName;
    @XmlElement(name = "No_Of_Memebers")
    protected String noOfMemebers;
    @XmlElement(name = "Security_Code")
    protected String securityCode;
    @XmlElement(name = "Ext")
    protected List<ArrayType> ext;
    @XmlElement(name = "Ext_Name")
    protected List<ArrayType> extName;

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
     * Gets the value of the groupExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupExtension() {
        return groupExtension;
    }

    /**
     * Sets the value of the groupExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupExtension(String value) {
        this.groupExtension = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the coveragePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveragePath() {
        return coveragePath;
    }

    /**
     * Sets the value of the coveragePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveragePath(String value) {
        this.coveragePath = value;
    }

    /**
     * Gets the value of the cor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOR() {
        return cor;
    }

    /**
     * Sets the value of the cor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOR(String value) {
        this.cor = value;
    }

    /**
     * Gets the value of the tn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN() {
        return tn;
    }

    /**
     * Sets the value of the tn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN(String value) {
        this.tn = value;
    }

    /**
     * Gets the value of the isdnsipCallerDisp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNSIPCallerDisp() {
        return isdnsipCallerDisp;
    }

    /**
     * Sets the value of the isdnsipCallerDisp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNSIPCallerDisp(String value) {
        this.isdnsipCallerDisp = value;
    }

    /**
     * Gets the value of the lwcReception property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLWCReception() {
        return lwcReception;
    }

    /**
     * Sets the value of the lwcReception property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLWCReception(String value) {
        this.lwcReception = value;
    }

    /**
     * Gets the value of the audixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUDIXName() {
        return audixName;
    }

    /**
     * Sets the value of the audixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUDIXName(String value) {
        this.audixName = value;
    }

    /**
     * Gets the value of the noOfMemebers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfMemebers() {
        return noOfMemebers;
    }

    /**
     * Sets the value of the noOfMemebers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfMemebers(String value) {
        this.noOfMemebers = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Sets the value of the securityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCode(String value) {
        this.securityCode = value;
    }

    /**
     * Gets the value of the ext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getExt() {
        if (ext == null) {
            ext = new ArrayList<ArrayType>();
        }
        return this.ext;
    }

    /**
     * Gets the value of the extName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getExtName() {
        if (extName == null) {
            extName = new ArrayList<ArrayType>();
        }
        return this.extName;
    }

}
