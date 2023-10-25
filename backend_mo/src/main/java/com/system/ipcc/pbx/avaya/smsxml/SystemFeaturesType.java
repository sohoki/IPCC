
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemFeaturesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemFeaturesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Auth_Codes_Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auth_Code_Length" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auth_Code_Cancellation_Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attendant_Timeout_Flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Display_Auth_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTI_Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTI_State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTI_Security_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Enhanced_PSA_Information_Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Default_COR_for_Dissociated_Sets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPN_ANI_for_Dissociated_Sets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unnamed_Registrations_and_PSA_for_IP_Telephones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direct_IP_IP_Audio_Connections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_Audio_Hairpinning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auto_Hold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMU_Inactivity_Interval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemFeaturesType", propOrder = {
    "authCodesEnabled",
    "authCodeLength",
    "authCodeCancellationSymbol",
    "attendantTimeoutFlag",
    "displayAuthCode",
    "ttiEnabled",
    "ttiState",
    "ttiSecurityCode",
    "enhancedPSAInformationEnabled",
    "defaultCORForDissociatedSets",
    "cpnaniForDissociatedSets",
    "unnamedRegistrationsAndPSAForIPTelephones",
    "directIPIPAudioConnections",
    "ipAudioHairpinning",
    "autoHold",
    "emuInactivityInterval"
})
public class SystemFeaturesType {

    @XmlElement(name = "Auth_Codes_Enabled")
    protected String authCodesEnabled;
    @XmlElement(name = "Auth_Code_Length")
    protected String authCodeLength;
    @XmlElement(name = "Auth_Code_Cancellation_Symbol")
    protected String authCodeCancellationSymbol;
    @XmlElement(name = "Attendant_Timeout_Flag")
    protected String attendantTimeoutFlag;
    @XmlElement(name = "Display_Auth_Code")
    protected String displayAuthCode;
    @XmlElement(name = "TTI_Enabled")
    protected String ttiEnabled;
    @XmlElement(name = "TTI_State")
    protected String ttiState;
    @XmlElement(name = "TTI_Security_Code")
    protected String ttiSecurityCode;
    @XmlElement(name = "Enhanced_PSA_Information_Enabled")
    protected String enhancedPSAInformationEnabled;
    @XmlElement(name = "Default_COR_for_Dissociated_Sets")
    protected String defaultCORForDissociatedSets;
    @XmlElement(name = "CPN_ANI_for_Dissociated_Sets")
    protected String cpnaniForDissociatedSets;
    @XmlElement(name = "Unnamed_Registrations_and_PSA_for_IP_Telephones")
    protected String unnamedRegistrationsAndPSAForIPTelephones;
    @XmlElement(name = "Direct_IP_IP_Audio_Connections")
    protected String directIPIPAudioConnections;
    @XmlElement(name = "IP_Audio_Hairpinning")
    protected String ipAudioHairpinning;
    @XmlElement(name = "Auto_Hold")
    protected String autoHold;
    @XmlElement(name = "EMU_Inactivity_Interval")
    protected String emuInactivityInterval;

    /**
     * Gets the value of the authCodesEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodesEnabled() {
        return authCodesEnabled;
    }

    /**
     * Sets the value of the authCodesEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodesEnabled(String value) {
        this.authCodesEnabled = value;
    }

    /**
     * Gets the value of the authCodeLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodeLength() {
        return authCodeLength;
    }

    /**
     * Sets the value of the authCodeLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodeLength(String value) {
        this.authCodeLength = value;
    }

    /**
     * Gets the value of the authCodeCancellationSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCodeCancellationSymbol() {
        return authCodeCancellationSymbol;
    }

    /**
     * Sets the value of the authCodeCancellationSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCodeCancellationSymbol(String value) {
        this.authCodeCancellationSymbol = value;
    }

    /**
     * Gets the value of the attendantTimeoutFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendantTimeoutFlag() {
        return attendantTimeoutFlag;
    }

    /**
     * Sets the value of the attendantTimeoutFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendantTimeoutFlag(String value) {
        this.attendantTimeoutFlag = value;
    }

    /**
     * Gets the value of the displayAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayAuthCode() {
        return displayAuthCode;
    }

    /**
     * Sets the value of the displayAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayAuthCode(String value) {
        this.displayAuthCode = value;
    }

    /**
     * Gets the value of the ttiEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTIEnabled() {
        return ttiEnabled;
    }

    /**
     * Sets the value of the ttiEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTIEnabled(String value) {
        this.ttiEnabled = value;
    }

    /**
     * Gets the value of the ttiState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTIState() {
        return ttiState;
    }

    /**
     * Sets the value of the ttiState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTIState(String value) {
        this.ttiState = value;
    }

    /**
     * Gets the value of the ttiSecurityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTISecurityCode() {
        return ttiSecurityCode;
    }

    /**
     * Sets the value of the ttiSecurityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTISecurityCode(String value) {
        this.ttiSecurityCode = value;
    }

    /**
     * Gets the value of the enhancedPSAInformationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhancedPSAInformationEnabled() {
        return enhancedPSAInformationEnabled;
    }

    /**
     * Sets the value of the enhancedPSAInformationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhancedPSAInformationEnabled(String value) {
        this.enhancedPSAInformationEnabled = value;
    }

    /**
     * Gets the value of the defaultCORForDissociatedSets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCORForDissociatedSets() {
        return defaultCORForDissociatedSets;
    }

    /**
     * Sets the value of the defaultCORForDissociatedSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCORForDissociatedSets(String value) {
        this.defaultCORForDissociatedSets = value;
    }

    /**
     * Gets the value of the cpnaniForDissociatedSets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPNANIForDissociatedSets() {
        return cpnaniForDissociatedSets;
    }

    /**
     * Sets the value of the cpnaniForDissociatedSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPNANIForDissociatedSets(String value) {
        this.cpnaniForDissociatedSets = value;
    }

    /**
     * Gets the value of the unnamedRegistrationsAndPSAForIPTelephones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnnamedRegistrationsAndPSAForIPTelephones() {
        return unnamedRegistrationsAndPSAForIPTelephones;
    }

    /**
     * Sets the value of the unnamedRegistrationsAndPSAForIPTelephones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnnamedRegistrationsAndPSAForIPTelephones(String value) {
        this.unnamedRegistrationsAndPSAForIPTelephones = value;
    }

    /**
     * Gets the value of the directIPIPAudioConnections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectIPIPAudioConnections() {
        return directIPIPAudioConnections;
    }

    /**
     * Sets the value of the directIPIPAudioConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectIPIPAudioConnections(String value) {
        this.directIPIPAudioConnections = value;
    }

    /**
     * Gets the value of the ipAudioHairpinning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAudioHairpinning() {
        return ipAudioHairpinning;
    }

    /**
     * Sets the value of the ipAudioHairpinning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAudioHairpinning(String value) {
        this.ipAudioHairpinning = value;
    }

    /**
     * Gets the value of the autoHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoHold() {
        return autoHold;
    }

    /**
     * Sets the value of the autoHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoHold(String value) {
        this.autoHold = value;
    }

    /**
     * Gets the value of the emuInactivityInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMUInactivityInterval() {
        return emuInactivityInterval;
    }

    /**
     * Sets the value of the emuInactivityInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMUInactivityInterval(String value) {
        this.emuInactivityInterval = value;
    }

}
