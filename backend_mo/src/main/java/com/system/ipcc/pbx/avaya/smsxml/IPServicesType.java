
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPServicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPServicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://xml.avaya.com/sms}IPServicesArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPServicesType", propOrder = {
    "serviceType",
    "enabled",
    "localNode",
    "localPort",
    "remoteNote",
    "remotePort",
    "aeServicesServer",
    "aeServicesPassword",
    "aeServicesEnabled",
    "aeServicesStatus"
})
public class IPServicesType {

    @XmlElement(name = "Service_Type")
    protected List<ArrayType> serviceType;
    @XmlElement(name = "Enabled")
    protected List<ArrayType> enabled;
    @XmlElement(name = "Local_Node")
    protected List<ArrayType> localNode;
    @XmlElement(name = "Local_Port")
    protected List<ArrayType> localPort;
    @XmlElement(name = "Remote_Note")
    protected List<ArrayType> remoteNote;
    @XmlElement(name = "Remote_Port")
    protected List<ArrayType> remotePort;
    @XmlElement(name = "AE_Services_Server")
    protected List<ArrayType> aeServicesServer;
    @XmlElement(name = "AE_Services_Password")
    protected List<ArrayType> aeServicesPassword;
    @XmlElement(name = "AE_Services_Enabled")
    protected List<ArrayType> aeServicesEnabled;
    @XmlElement(name = "AE_Services_Status")
    protected List<ArrayType> aeServicesStatus;

    /**
     * Gets the value of the serviceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getServiceType() {
        if (serviceType == null) {
            serviceType = new ArrayList<ArrayType>();
        }
        return this.serviceType;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enabled property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnabled().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getEnabled() {
        if (enabled == null) {
            enabled = new ArrayList<ArrayType>();
        }
        return this.enabled;
    }

    /**
     * Gets the value of the localNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getLocalNode() {
        if (localNode == null) {
            localNode = new ArrayList<ArrayType>();
        }
        return this.localNode;
    }

    /**
     * Gets the value of the localPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getLocalPort() {
        if (localPort == null) {
            localPort = new ArrayList<ArrayType>();
        }
        return this.localPort;
    }

    /**
     * Gets the value of the remoteNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRemoteNote() {
        if (remoteNote == null) {
            remoteNote = new ArrayList<ArrayType>();
        }
        return this.remoteNote;
    }

    /**
     * Gets the value of the remotePort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remotePort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemotePort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRemotePort() {
        if (remotePort == null) {
            remotePort = new ArrayList<ArrayType>();
        }
        return this.remotePort;
    }

    /**
     * Gets the value of the aeServicesServer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aeServicesServer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAEServicesServer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAEServicesServer() {
        if (aeServicesServer == null) {
            aeServicesServer = new ArrayList<ArrayType>();
        }
        return this.aeServicesServer;
    }

    /**
     * Gets the value of the aeServicesPassword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aeServicesPassword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAEServicesPassword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAEServicesPassword() {
        if (aeServicesPassword == null) {
            aeServicesPassword = new ArrayList<ArrayType>();
        }
        return this.aeServicesPassword;
    }

    /**
     * Gets the value of the aeServicesEnabled property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aeServicesEnabled property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAEServicesEnabled().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAEServicesEnabled() {
        if (aeServicesEnabled == null) {
            aeServicesEnabled = new ArrayList<ArrayType>();
        }
        return this.aeServicesEnabled;
    }

    /**
     * Gets the value of the aeServicesStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aeServicesStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAEServicesStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAEServicesStatus() {
        if (aeServicesStatus == null) {
            aeServicesStatus = new ArrayList<ArrayType>();
        }
        return this.aeServicesStatus;
    }

}
