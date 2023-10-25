
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoteAccessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoteAccessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Remote_Access_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Barrier_Code_Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Authorization_Code_Required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remote_Access_Dial_Tone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Permanently_Disable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}RemoteAccessArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteAccessType", propOrder = {
    "remoteAccessExtension",
    "barrierCodeLength",
    "authorizationCodeRequired",
    "remoteAccessDialTone",
    "permanentlyDisable",
    "barrierCode",
    "cor",
    "tn",
    "cos",
    "expirationDateMonth",
    "expirationDateDay",
    "expirationDateYear",
    "noOfCalls",
    "callsUsed"
})
public class RemoteAccessType {

    @XmlElement(name = "Remote_Access_Extension")
    protected String remoteAccessExtension;
    @XmlElement(name = "Barrier_Code_Length")
    protected String barrierCodeLength;
    @XmlElement(name = "Authorization_Code_Required")
    protected String authorizationCodeRequired;
    @XmlElement(name = "Remote_Access_Dial_Tone")
    protected String remoteAccessDialTone;
    @XmlElement(name = "Permanently_Disable")
    protected String permanentlyDisable;
    @XmlElement(name = "Barrier_Code")
    protected List<ArrayType> barrierCode;
    @XmlElement(name = "COR")
    protected List<ArrayType> cor;
    @XmlElement(name = "TN")
    protected List<ArrayType> tn;
    @XmlElement(name = "COS")
    protected List<ArrayType> cos;
    @XmlElement(name = "Expiration_Date_Month")
    protected List<ArrayType> expirationDateMonth;
    @XmlElement(name = "Expiration_Date_Day")
    protected List<ArrayType> expirationDateDay;
    @XmlElement(name = "Expiration_Date_Year")
    protected List<ArrayType> expirationDateYear;
    @XmlElement(name = "No_Of_Calls")
    protected List<ArrayType> noOfCalls;
    @XmlElement(name = "Calls_Used")
    protected List<ArrayType> callsUsed;

    /**
     * Gets the value of the remoteAccessExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteAccessExtension() {
        return remoteAccessExtension;
    }

    /**
     * Sets the value of the remoteAccessExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteAccessExtension(String value) {
        this.remoteAccessExtension = value;
    }

    /**
     * Gets the value of the barrierCodeLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarrierCodeLength() {
        return barrierCodeLength;
    }

    /**
     * Sets the value of the barrierCodeLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarrierCodeLength(String value) {
        this.barrierCodeLength = value;
    }

    /**
     * Gets the value of the authorizationCodeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCodeRequired() {
        return authorizationCodeRequired;
    }

    /**
     * Sets the value of the authorizationCodeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCodeRequired(String value) {
        this.authorizationCodeRequired = value;
    }

    /**
     * Gets the value of the remoteAccessDialTone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteAccessDialTone() {
        return remoteAccessDialTone;
    }

    /**
     * Sets the value of the remoteAccessDialTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteAccessDialTone(String value) {
        this.remoteAccessDialTone = value;
    }

    /**
     * Gets the value of the permanentlyDisable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermanentlyDisable() {
        return permanentlyDisable;
    }

    /**
     * Sets the value of the permanentlyDisable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermanentlyDisable(String value) {
        this.permanentlyDisable = value;
    }

    /**
     * Gets the value of the barrierCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the barrierCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBarrierCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBarrierCode() {
        if (barrierCode == null) {
            barrierCode = new ArrayList<ArrayType>();
        }
        return this.barrierCode;
    }

    /**
     * Gets the value of the cor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCOR() {
        if (cor == null) {
            cor = new ArrayList<ArrayType>();
        }
        return this.cor;
    }

    /**
     * Gets the value of the tn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getTN() {
        if (tn == null) {
            tn = new ArrayList<ArrayType>();
        }
        return this.tn;
    }

    /**
     * Gets the value of the cos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCOS() {
        if (cos == null) {
            cos = new ArrayList<ArrayType>();
        }
        return this.cos;
    }

    /**
     * Gets the value of the expirationDateMonth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expirationDateMonth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpirationDateMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getExpirationDateMonth() {
        if (expirationDateMonth == null) {
            expirationDateMonth = new ArrayList<ArrayType>();
        }
        return this.expirationDateMonth;
    }

    /**
     * Gets the value of the expirationDateDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expirationDateDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpirationDateDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getExpirationDateDay() {
        if (expirationDateDay == null) {
            expirationDateDay = new ArrayList<ArrayType>();
        }
        return this.expirationDateDay;
    }

    /**
     * Gets the value of the expirationDateYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expirationDateYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpirationDateYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getExpirationDateYear() {
        if (expirationDateYear == null) {
            expirationDateYear = new ArrayList<ArrayType>();
        }
        return this.expirationDateYear;
    }

    /**
     * Gets the value of the noOfCalls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noOfCalls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoOfCalls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNoOfCalls() {
        if (noOfCalls == null) {
            noOfCalls = new ArrayList<ArrayType>();
        }
        return this.noOfCalls;
    }

    /**
     * Gets the value of the callsUsed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callsUsed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallsUsed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCallsUsed() {
        if (callsUsed == null) {
            callsUsed = new ArrayList<ArrayType>();
        }
        return this.callsUsed;
    }

}
