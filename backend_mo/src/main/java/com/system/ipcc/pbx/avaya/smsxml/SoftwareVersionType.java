
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoftwareVersionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoftwareVersionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version_On_Disk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Translation_Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Translation_Date_On_Disk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disk_Second_Copy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftwareVersionType", propOrder = {
    "version",
    "versionOnDisk",
    "translationDate",
    "translationDateOnDisk",
    "diskSecondCopy"
})
public class SoftwareVersionType {

    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Version_On_Disk")
    protected String versionOnDisk;
    @XmlElement(name = "Translation_Date")
    protected String translationDate;
    @XmlElement(name = "Translation_Date_On_Disk")
    protected String translationDateOnDisk;
    @XmlElement(name = "Disk_Second_Copy")
    protected String diskSecondCopy;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the versionOnDisk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionOnDisk() {
        return versionOnDisk;
    }

    /**
     * Sets the value of the versionOnDisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionOnDisk(String value) {
        this.versionOnDisk = value;
    }

    /**
     * Gets the value of the translationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslationDate() {
        return translationDate;
    }

    /**
     * Sets the value of the translationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslationDate(String value) {
        this.translationDate = value;
    }

    /**
     * Gets the value of the translationDateOnDisk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslationDateOnDisk() {
        return translationDateOnDisk;
    }

    /**
     * Sets the value of the translationDateOnDisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslationDateOnDisk(String value) {
        this.translationDateOnDisk = value;
    }

    /**
     * Gets the value of the diskSecondCopy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiskSecondCopy() {
        return diskSecondCopy;
    }

    /**
     * Sets the value of the diskSecondCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiskSecondCopy(String value) {
        this.diskSecondCopy = value;
    }

}
