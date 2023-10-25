
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnnouncementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnouncementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Announcement_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Num_Files" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Board" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Announcement_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tenant_Partition_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hide_Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Analog_Announcement_Queue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Integ_Announcement_Queue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Queue_Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Protect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Compression_Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnouncementType", propOrder = {
    "extension",
    "announcementType",
    "name",
    "port",
    "numFiles",
    "board",
    "announcementNumber",
    "tenantPartitionNumber",
    "hideVersion",
    "cor",
    "analogAnnouncementQueue",
    "integAnnouncementQueue",
    "queueLength",
    "protect",
    "compressionRate"
})
public class AnnouncementType {

    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "Announcement_Type")
    protected String announcementType;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "Num_Files")
    protected String numFiles;
    @XmlElement(name = "Board")
    protected String board;
    @XmlElement(name = "Announcement_Number")
    protected String announcementNumber;
    @XmlElement(name = "Tenant_Partition_Number")
    protected String tenantPartitionNumber;
    @XmlElement(name = "Hide_Version")
    protected String hideVersion;
    @XmlElement(name = "COR")
    protected String cor;
    @XmlElement(name = "Analog_Announcement_Queue")
    protected String analogAnnouncementQueue;
    @XmlElement(name = "Integ_Announcement_Queue")
    protected String integAnnouncementQueue;
    @XmlElement(name = "Queue_Length")
    protected String queueLength;
    @XmlElement(name = "Protect")
    protected String protect;
    @XmlElement(name = "Compression_Rate")
    protected String compressionRate;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the announcementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnouncementType() {
        return announcementType;
    }

    /**
     * Sets the value of the announcementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnouncementType(String value) {
        this.announcementType = value;
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
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the numFiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFiles() {
        return numFiles;
    }

    /**
     * Sets the value of the numFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFiles(String value) {
        this.numFiles = value;
    }

    /**
     * Gets the value of the board property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoard() {
        return board;
    }

    /**
     * Sets the value of the board property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoard(String value) {
        this.board = value;
    }

    /**
     * Gets the value of the announcementNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnouncementNumber() {
        return announcementNumber;
    }

    /**
     * Sets the value of the announcementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnouncementNumber(String value) {
        this.announcementNumber = value;
    }

    /**
     * Gets the value of the tenantPartitionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenantPartitionNumber() {
        return tenantPartitionNumber;
    }

    /**
     * Sets the value of the tenantPartitionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenantPartitionNumber(String value) {
        this.tenantPartitionNumber = value;
    }

    /**
     * Gets the value of the hideVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHideVersion() {
        return hideVersion;
    }

    /**
     * Sets the value of the hideVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHideVersion(String value) {
        this.hideVersion = value;
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
     * Gets the value of the analogAnnouncementQueue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalogAnnouncementQueue() {
        return analogAnnouncementQueue;
    }

    /**
     * Sets the value of the analogAnnouncementQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalogAnnouncementQueue(String value) {
        this.analogAnnouncementQueue = value;
    }

    /**
     * Gets the value of the integAnnouncementQueue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegAnnouncementQueue() {
        return integAnnouncementQueue;
    }

    /**
     * Sets the value of the integAnnouncementQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegAnnouncementQueue(String value) {
        this.integAnnouncementQueue = value;
    }

    /**
     * Gets the value of the queueLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueLength() {
        return queueLength;
    }

    /**
     * Sets the value of the queueLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueLength(String value) {
        this.queueLength = value;
    }

    /**
     * Gets the value of the protect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtect() {
        return protect;
    }

    /**
     * Sets the value of the protect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtect(String value) {
        this.protect = value;
    }

    /**
     * Gets the value of the compressionRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompressionRate() {
        return compressionRate;
    }

    /**
     * Sets the value of the compressionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompressionRate(String value) {
        this.compressionRate = value;
    }

}
