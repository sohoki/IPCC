
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Six_Digit_Extension_Inter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Six_Digit_Extension_Intra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Seven_Digit_Extension_Inter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Seven_Digit_Extension_Intra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Eight_Digit_Extension_Inter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Eight_Digit_Extension_Intra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nine_Digit_Extension_Inter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nine_Digit_Extension_Intra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ten_Digit_Extension_Inter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ten_Digit_Extension_Intra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Eleven_Digit_Extension_Inter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Eleven_Digit_Extension_Intra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Twelve_Digit_Extension_Inter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Twelve_Digit_Extension_Intra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Thirteen_Digit_Extension_Inter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Thirteen_Digit_Extension_Intra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayParametersType", propOrder = {
    "sixDigitExtensionInter",
    "sixDigitExtensionIntra",
    "sevenDigitExtensionInter",
    "sevenDigitExtensionIntra",
    "eightDigitExtensionInter",
    "eightDigitExtensionIntra",
    "nineDigitExtensionInter",
    "nineDigitExtensionIntra",
    "tenDigitExtensionInter",
    "tenDigitExtensionIntra",
    "elevenDigitExtensionInter",
    "elevenDigitExtensionIntra",
    "twelveDigitExtensionInter",
    "twelveDigitExtensionIntra",
    "thirteenDigitExtensionInter",
    "thirteenDigitExtensionIntra"
})
public class DisplayParametersType {

    @XmlElement(name = "Six_Digit_Extension_Inter")
    protected String sixDigitExtensionInter;
    @XmlElement(name = "Six_Digit_Extension_Intra")
    protected String sixDigitExtensionIntra;
    @XmlElement(name = "Seven_Digit_Extension_Inter")
    protected String sevenDigitExtensionInter;
    @XmlElement(name = "Seven_Digit_Extension_Intra")
    protected String sevenDigitExtensionIntra;
    @XmlElement(name = "Eight_Digit_Extension_Inter")
    protected String eightDigitExtensionInter;
    @XmlElement(name = "Eight_Digit_Extension_Intra")
    protected String eightDigitExtensionIntra;
    @XmlElement(name = "Nine_Digit_Extension_Inter")
    protected String nineDigitExtensionInter;
    @XmlElement(name = "Nine_Digit_Extension_Intra")
    protected String nineDigitExtensionIntra;
    @XmlElement(name = "Ten_Digit_Extension_Inter")
    protected String tenDigitExtensionInter;
    @XmlElement(name = "Ten_Digit_Extension_Intra")
    protected String tenDigitExtensionIntra;
    @XmlElement(name = "Eleven_Digit_Extension_Inter")
    protected String elevenDigitExtensionInter;
    @XmlElement(name = "Eleven_Digit_Extension_Intra")
    protected String elevenDigitExtensionIntra;
    @XmlElement(name = "Twelve_Digit_Extension_Inter")
    protected String twelveDigitExtensionInter;
    @XmlElement(name = "Twelve_Digit_Extension_Intra")
    protected String twelveDigitExtensionIntra;
    @XmlElement(name = "Thirteen_Digit_Extension_Inter")
    protected String thirteenDigitExtensionInter;
    @XmlElement(name = "Thirteen_Digit_Extension_Intra")
    protected String thirteenDigitExtensionIntra;

    /**
     * Gets the value of the sixDigitExtensionInter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSixDigitExtensionInter() {
        return sixDigitExtensionInter;
    }

    /**
     * Sets the value of the sixDigitExtensionInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSixDigitExtensionInter(String value) {
        this.sixDigitExtensionInter = value;
    }

    /**
     * Gets the value of the sixDigitExtensionIntra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSixDigitExtensionIntra() {
        return sixDigitExtensionIntra;
    }

    /**
     * Sets the value of the sixDigitExtensionIntra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSixDigitExtensionIntra(String value) {
        this.sixDigitExtensionIntra = value;
    }

    /**
     * Gets the value of the sevenDigitExtensionInter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSevenDigitExtensionInter() {
        return sevenDigitExtensionInter;
    }

    /**
     * Sets the value of the sevenDigitExtensionInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSevenDigitExtensionInter(String value) {
        this.sevenDigitExtensionInter = value;
    }

    /**
     * Gets the value of the sevenDigitExtensionIntra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSevenDigitExtensionIntra() {
        return sevenDigitExtensionIntra;
    }

    /**
     * Sets the value of the sevenDigitExtensionIntra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSevenDigitExtensionIntra(String value) {
        this.sevenDigitExtensionIntra = value;
    }

    /**
     * Gets the value of the eightDigitExtensionInter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEightDigitExtensionInter() {
        return eightDigitExtensionInter;
    }

    /**
     * Sets the value of the eightDigitExtensionInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEightDigitExtensionInter(String value) {
        this.eightDigitExtensionInter = value;
    }

    /**
     * Gets the value of the eightDigitExtensionIntra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEightDigitExtensionIntra() {
        return eightDigitExtensionIntra;
    }

    /**
     * Sets the value of the eightDigitExtensionIntra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEightDigitExtensionIntra(String value) {
        this.eightDigitExtensionIntra = value;
    }

    /**
     * Gets the value of the nineDigitExtensionInter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNineDigitExtensionInter() {
        return nineDigitExtensionInter;
    }

    /**
     * Sets the value of the nineDigitExtensionInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNineDigitExtensionInter(String value) {
        this.nineDigitExtensionInter = value;
    }

    /**
     * Gets the value of the nineDigitExtensionIntra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNineDigitExtensionIntra() {
        return nineDigitExtensionIntra;
    }

    /**
     * Sets the value of the nineDigitExtensionIntra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNineDigitExtensionIntra(String value) {
        this.nineDigitExtensionIntra = value;
    }

    /**
     * Gets the value of the tenDigitExtensionInter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenDigitExtensionInter() {
        return tenDigitExtensionInter;
    }

    /**
     * Sets the value of the tenDigitExtensionInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenDigitExtensionInter(String value) {
        this.tenDigitExtensionInter = value;
    }

    /**
     * Gets the value of the tenDigitExtensionIntra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenDigitExtensionIntra() {
        return tenDigitExtensionIntra;
    }

    /**
     * Sets the value of the tenDigitExtensionIntra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenDigitExtensionIntra(String value) {
        this.tenDigitExtensionIntra = value;
    }

    /**
     * Gets the value of the elevenDigitExtensionInter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElevenDigitExtensionInter() {
        return elevenDigitExtensionInter;
    }

    /**
     * Sets the value of the elevenDigitExtensionInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElevenDigitExtensionInter(String value) {
        this.elevenDigitExtensionInter = value;
    }

    /**
     * Gets the value of the elevenDigitExtensionIntra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElevenDigitExtensionIntra() {
        return elevenDigitExtensionIntra;
    }

    /**
     * Sets the value of the elevenDigitExtensionIntra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElevenDigitExtensionIntra(String value) {
        this.elevenDigitExtensionIntra = value;
    }

    /**
     * Gets the value of the twelveDigitExtensionInter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwelveDigitExtensionInter() {
        return twelveDigitExtensionInter;
    }

    /**
     * Sets the value of the twelveDigitExtensionInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwelveDigitExtensionInter(String value) {
        this.twelveDigitExtensionInter = value;
    }

    /**
     * Gets the value of the twelveDigitExtensionIntra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwelveDigitExtensionIntra() {
        return twelveDigitExtensionIntra;
    }

    /**
     * Sets the value of the twelveDigitExtensionIntra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwelveDigitExtensionIntra(String value) {
        this.twelveDigitExtensionIntra = value;
    }

    /**
     * Gets the value of the thirteenDigitExtensionInter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirteenDigitExtensionInter() {
        return thirteenDigitExtensionInter;
    }

    /**
     * Sets the value of the thirteenDigitExtensionInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirteenDigitExtensionInter(String value) {
        this.thirteenDigitExtensionInter = value;
    }

    /**
     * Gets the value of the thirteenDigitExtensionIntra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirteenDigitExtensionIntra() {
        return thirteenDigitExtensionIntra;
    }

    /**
     * Sets the value of the thirteenDigitExtensionIntra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirteenDigitExtensionIntra(String value) {
        this.thirteenDigitExtensionIntra = value;
    }

}
