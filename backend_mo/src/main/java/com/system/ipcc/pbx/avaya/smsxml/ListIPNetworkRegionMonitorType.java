
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListIPNetworkRegionMonitorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListIPNetworkRegionMonitorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTCP_Monitor_IP_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTCP_Monitor_IPv6_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPv6_Port_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Report_Period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codec_Set" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDP_Port_Min" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDP_Port_Max" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListIPNetworkRegionMonitorType", propOrder = {
    "region",
    "name",
    "rtcpMonitorIPAddress",
    "portNumber",
    "rtcpMonitorIPv6Address",
    "iPv6PortNumber",
    "reportPeriod",
    "codecSet",
    "udpPortMin",
    "udpPortMax"
})
public class ListIPNetworkRegionMonitorType {

    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "RTCP_Monitor_IP_Address")
    protected String rtcpMonitorIPAddress;
    @XmlElement(name = "Port_Number")
    protected String portNumber;
    @XmlElement(name = "RTCP_Monitor_IPv6_Address")
    protected String rtcpMonitorIPv6Address;
    @XmlElement(name = "IPv6_Port_Number")
    protected String iPv6PortNumber;
    @XmlElement(name = "Report_Period")
    protected String reportPeriod;
    @XmlElement(name = "Codec_Set")
    protected String codecSet;
    @XmlElement(name = "UDP_Port_Min")
    protected String udpPortMin;
    @XmlElement(name = "UDP_Port_Max")
    protected String udpPortMax;

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
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
     * Gets the value of the rtcpMonitorIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTCPMonitorIPAddress() {
        return rtcpMonitorIPAddress;
    }

    /**
     * Sets the value of the rtcpMonitorIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTCPMonitorIPAddress(String value) {
        this.rtcpMonitorIPAddress = value;
    }

    /**
     * Gets the value of the portNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortNumber() {
        return portNumber;
    }

    /**
     * Sets the value of the portNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortNumber(String value) {
        this.portNumber = value;
    }

    /**
     * Gets the value of the rtcpMonitorIPv6Address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTCPMonitorIPv6Address() {
        return rtcpMonitorIPv6Address;
    }

    /**
     * Sets the value of the rtcpMonitorIPv6Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTCPMonitorIPv6Address(String value) {
        this.rtcpMonitorIPv6Address = value;
    }

    /**
     * Gets the value of the iPv6PortNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPv6PortNumber() {
        return iPv6PortNumber;
    }

    /**
     * Sets the value of the iPv6PortNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPv6PortNumber(String value) {
        this.iPv6PortNumber = value;
    }

    /**
     * Gets the value of the reportPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportPeriod() {
        return reportPeriod;
    }

    /**
     * Sets the value of the reportPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportPeriod(String value) {
        this.reportPeriod = value;
    }

    /**
     * Gets the value of the codecSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodecSet() {
        return codecSet;
    }

    /**
     * Sets the value of the codecSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodecSet(String value) {
        this.codecSet = value;
    }

    /**
     * Gets the value of the udpPortMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDPPortMin() {
        return udpPortMin;
    }

    /**
     * Sets the value of the udpPortMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDPPortMin(String value) {
        this.udpPortMin = value;
    }

    /**
     * Gets the value of the udpPortMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDPPortMax() {
        return udpPortMax;
    }

    /**
     * Sets the value of the udpPortMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDPPortMax(String value) {
        this.udpPortMax = value;
    }

}
