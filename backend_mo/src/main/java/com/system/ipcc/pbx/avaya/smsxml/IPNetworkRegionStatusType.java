
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPNetworkRegionStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPNetworkRegionStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connection_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connection_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BW_Limit_A" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BW_Limit_B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KBits_Tx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KBits_Rx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connections_Tx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Connections_Rx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Times_BW_Limit_Hit_Today" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IGAR_Now" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IGAR_Today" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPNetworkRegionStatusType", propOrder = {
    "sourceRegion",
    "destinationRegion",
    "connectionType",
    "connectionStatus",
    "bwLimitA",
    "bwLimitB",
    "kBitsTx",
    "kBitsRx",
    "connectionsTx",
    "connectionsRx",
    "timesBWLimitHitToday",
    "igarNow",
    "igarToday"
})
public class IPNetworkRegionStatusType {

    @XmlElement(name = "Source_Region")
    protected String sourceRegion;
    @XmlElement(name = "Destination_Region")
    protected String destinationRegion;
    @XmlElement(name = "Connection_Type")
    protected String connectionType;
    @XmlElement(name = "Connection_Status")
    protected String connectionStatus;
    @XmlElement(name = "BW_Limit_A")
    protected String bwLimitA;
    @XmlElement(name = "BW_Limit_B")
    protected String bwLimitB;
    @XmlElement(name = "KBits_Tx")
    protected String kBitsTx;
    @XmlElement(name = "KBits_Rx")
    protected String kBitsRx;
    @XmlElement(name = "Connections_Tx")
    protected String connectionsTx;
    @XmlElement(name = "Connections_Rx")
    protected String connectionsRx;
    @XmlElement(name = "Times_BW_Limit_Hit_Today")
    protected String timesBWLimitHitToday;
    @XmlElement(name = "IGAR_Now")
    protected String igarNow;
    @XmlElement(name = "IGAR_Today")
    protected String igarToday;

    /**
     * Gets the value of the sourceRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRegion() {
        return sourceRegion;
    }

    /**
     * Sets the value of the sourceRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRegion(String value) {
        this.sourceRegion = value;
    }

    /**
     * Gets the value of the destinationRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    /**
     * Sets the value of the destinationRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationRegion(String value) {
        this.destinationRegion = value;
    }

    /**
     * Gets the value of the connectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * Sets the value of the connectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionType(String value) {
        this.connectionType = value;
    }

    /**
     * Gets the value of the connectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionStatus() {
        return connectionStatus;
    }

    /**
     * Sets the value of the connectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionStatus(String value) {
        this.connectionStatus = value;
    }

    /**
     * Gets the value of the bwLimitA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBWLimitA() {
        return bwLimitA;
    }

    /**
     * Sets the value of the bwLimitA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBWLimitA(String value) {
        this.bwLimitA = value;
    }

    /**
     * Gets the value of the bwLimitB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBWLimitB() {
        return bwLimitB;
    }

    /**
     * Sets the value of the bwLimitB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBWLimitB(String value) {
        this.bwLimitB = value;
    }

    /**
     * Gets the value of the kBitsTx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBitsTx() {
        return kBitsTx;
    }

    /**
     * Sets the value of the kBitsTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBitsTx(String value) {
        this.kBitsTx = value;
    }

    /**
     * Gets the value of the kBitsRx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBitsRx() {
        return kBitsRx;
    }

    /**
     * Sets the value of the kBitsRx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBitsRx(String value) {
        this.kBitsRx = value;
    }

    /**
     * Gets the value of the connectionsTx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionsTx() {
        return connectionsTx;
    }

    /**
     * Sets the value of the connectionsTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionsTx(String value) {
        this.connectionsTx = value;
    }

    /**
     * Gets the value of the connectionsRx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionsRx() {
        return connectionsRx;
    }

    /**
     * Sets the value of the connectionsRx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionsRx(String value) {
        this.connectionsRx = value;
    }

    /**
     * Gets the value of the timesBWLimitHitToday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimesBWLimitHitToday() {
        return timesBWLimitHitToday;
    }

    /**
     * Sets the value of the timesBWLimitHitToday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimesBWLimitHitToday(String value) {
        this.timesBWLimitHitToday = value;
    }

    /**
     * Gets the value of the igarNow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIGARNow() {
        return igarNow;
    }

    /**
     * Sets the value of the igarNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIGARNow(String value) {
        this.igarNow = value;
    }

    /**
     * Gets the value of the igarToday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIGARToday() {
        return igarToday;
    }

    /**
     * Sets the value of the igarToday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIGARToday(String value) {
        this.igarToday = value;
    }

}
