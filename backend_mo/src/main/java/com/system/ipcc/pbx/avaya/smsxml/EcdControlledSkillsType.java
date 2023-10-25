
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EcdControlledSkillsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EcdControlledSkillsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Skill_Ext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTI_Link" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EcdControlledSkillsType", propOrder = {
    "skillExt",
    "ctiLink",
    "crv"
})
public class EcdControlledSkillsType {

    @XmlElement(name = "Skill_Ext")
    protected String skillExt;
    @XmlElement(name = "CTI_Link")
    protected String ctiLink;
    @XmlElement(name = "CRV")
    protected String crv;

    /**
     * Gets the value of the skillExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillExt() {
        return skillExt;
    }

    /**
     * Sets the value of the skillExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillExt(String value) {
        this.skillExt = value;
    }

    /**
     * Gets the value of the ctiLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTILink() {
        return ctiLink;
    }

    /**
     * Sets the value of the ctiLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTILink(String value) {
        this.ctiLink = value;
    }

    /**
     * Gets the value of the crv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRV() {
        return crv;
    }

    /**
     * Sets the value of the crv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRV(String value) {
        this.crv = value;
    }

}
