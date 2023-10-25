
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemSecurityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemSecurityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SVN_Station_Security_Code_Violation_Notification_Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Originating_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Referral_Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station_Security_Code_Threshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time_Interval_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time_Interval_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Announcement_Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Minimum_Station_Security_Code_Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Security_Code_for_Terminal_Self_Administration_Required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Receive_Unencrypted_from_IP_Endpoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemSecurityType", propOrder = {
    "svnStationSecurityCodeViolationNotificationEnabled",
    "originatingExtension",
    "referralDestination",
    "stationSecurityCodeThreshold",
    "timeInterval1",
    "timeInterval2",
    "announcementExtension",
    "minimumStationSecurityCodeLength",
    "securityCodeForTerminalSelfAdministrationRequired",
    "receiveUnencryptedFromIPEndpoints"
})
public class SystemSecurityType {

    @XmlElement(name = "SVN_Station_Security_Code_Violation_Notification_Enabled")
    protected String svnStationSecurityCodeViolationNotificationEnabled;
    @XmlElement(name = "Originating_Extension")
    protected String originatingExtension;
    @XmlElement(name = "Referral_Destination")
    protected String referralDestination;
    @XmlElement(name = "Station_Security_Code_Threshold")
    protected String stationSecurityCodeThreshold;
    @XmlElement(name = "Time_Interval_1")
    protected String timeInterval1;
    @XmlElement(name = "Time_Interval_2")
    protected String timeInterval2;
    @XmlElement(name = "Announcement_Extension")
    protected String announcementExtension;
    @XmlElement(name = "Minimum_Station_Security_Code_Length")
    protected String minimumStationSecurityCodeLength;
    @XmlElement(name = "Security_Code_for_Terminal_Self_Administration_Required")
    protected String securityCodeForTerminalSelfAdministrationRequired;
    @XmlElement(name = "Receive_Unencrypted_from_IP_Endpoints")
    protected String receiveUnencryptedFromIPEndpoints;

    /**
     * Gets the value of the svnStationSecurityCodeViolationNotificationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVNStationSecurityCodeViolationNotificationEnabled() {
        return svnStationSecurityCodeViolationNotificationEnabled;
    }

    /**
     * Sets the value of the svnStationSecurityCodeViolationNotificationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVNStationSecurityCodeViolationNotificationEnabled(String value) {
        this.svnStationSecurityCodeViolationNotificationEnabled = value;
    }

    /**
     * Gets the value of the originatingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingExtension() {
        return originatingExtension;
    }

    /**
     * Sets the value of the originatingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingExtension(String value) {
        this.originatingExtension = value;
    }

    /**
     * Gets the value of the referralDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferralDestination() {
        return referralDestination;
    }

    /**
     * Sets the value of the referralDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferralDestination(String value) {
        this.referralDestination = value;
    }

    /**
     * Gets the value of the stationSecurityCodeThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationSecurityCodeThreshold() {
        return stationSecurityCodeThreshold;
    }

    /**
     * Sets the value of the stationSecurityCodeThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationSecurityCodeThreshold(String value) {
        this.stationSecurityCodeThreshold = value;
    }

    /**
     * Gets the value of the timeInterval1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeInterval1() {
        return timeInterval1;
    }

    /**
     * Sets the value of the timeInterval1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeInterval1(String value) {
        this.timeInterval1 = value;
    }

    /**
     * Gets the value of the timeInterval2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeInterval2() {
        return timeInterval2;
    }

    /**
     * Sets the value of the timeInterval2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeInterval2(String value) {
        this.timeInterval2 = value;
    }

    /**
     * Gets the value of the announcementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnouncementExtension() {
        return announcementExtension;
    }

    /**
     * Sets the value of the announcementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnouncementExtension(String value) {
        this.announcementExtension = value;
    }

    /**
     * Gets the value of the minimumStationSecurityCodeLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumStationSecurityCodeLength() {
        return minimumStationSecurityCodeLength;
    }

    /**
     * Sets the value of the minimumStationSecurityCodeLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumStationSecurityCodeLength(String value) {
        this.minimumStationSecurityCodeLength = value;
    }

    /**
     * Gets the value of the securityCodeForTerminalSelfAdministrationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCodeForTerminalSelfAdministrationRequired() {
        return securityCodeForTerminalSelfAdministrationRequired;
    }

    /**
     * Sets the value of the securityCodeForTerminalSelfAdministrationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCodeForTerminalSelfAdministrationRequired(String value) {
        this.securityCodeForTerminalSelfAdministrationRequired = value;
    }

    /**
     * Gets the value of the receiveUnencryptedFromIPEndpoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveUnencryptedFromIPEndpoints() {
        return receiveUnencryptedFromIPEndpoints;
    }

    /**
     * Sets the value of the receiveUnencryptedFromIPEndpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveUnencryptedFromIPEndpoints(String value) {
        this.receiveUnencryptedFromIPEndpoints = value;
    }

}
