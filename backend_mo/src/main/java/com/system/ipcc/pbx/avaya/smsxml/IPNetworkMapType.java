
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPNetworkMapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPNetworkMapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://xml.avaya.com/sms}IPNetworkMapArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPNetworkMapType", propOrder = {
    "fromIPAddress",
    "fromIPAddressA",
    "fromIPAddress1",
    "fromIPAddress1A",
    "fromIPAddress2",
    "fromIPAddress2A",
    "fromIPAddress3",
    "fromIPAddress3A",
    "fromIPAddress4",
    "fromIPAddress4A",
    "toIPAddress",
    "toIPAddressA",
    "toIPAddress1",
    "toIPAddress1A",
    "toIPAddress2",
    "toIPAddress2A",
    "toIPAddress3",
    "toIPAddress3A",
    "toIPAddress4",
    "toIPAddress4A",
    "mask",
    "maskA",
    "region",
    "regionA",
    "vlan",
    "vlana",
    "elin",
    "elina"
})
public class IPNetworkMapType {

    @XmlElement(name = "FromIPAddress")
    protected List<ArrayType> fromIPAddress;
    @XmlElement(name = "FromIPAddress_A")
    protected List<ArrayType> fromIPAddressA;
    @XmlElement(name = "FromIPAddress1")
    protected List<ArrayType> fromIPAddress1;
    @XmlElement(name = "FromIPAddress1_A")
    protected List<ArrayType> fromIPAddress1A;
    @XmlElement(name = "FromIPAddress2")
    protected List<ArrayType> fromIPAddress2;
    @XmlElement(name = "FromIPAddress2_A")
    protected List<ArrayType> fromIPAddress2A;
    @XmlElement(name = "FromIPAddress3")
    protected List<ArrayType> fromIPAddress3;
    @XmlElement(name = "FromIPAddress3_A")
    protected List<ArrayType> fromIPAddress3A;
    @XmlElement(name = "FromIPAddress4")
    protected List<ArrayType> fromIPAddress4;
    @XmlElement(name = "FromIPAddress4_A")
    protected List<ArrayType> fromIPAddress4A;
    @XmlElement(name = "ToIPAddress")
    protected List<ArrayType> toIPAddress;
    @XmlElement(name = "ToIPAddress_A")
    protected List<ArrayType> toIPAddressA;
    @XmlElement(name = "ToIPAddress1")
    protected List<ArrayType> toIPAddress1;
    @XmlElement(name = "ToIPAddress1_A")
    protected List<ArrayType> toIPAddress1A;
    @XmlElement(name = "ToIPAddress2")
    protected List<ArrayType> toIPAddress2;
    @XmlElement(name = "ToIPAddress2_A")
    protected List<ArrayType> toIPAddress2A;
    @XmlElement(name = "ToIPAddress3")
    protected List<ArrayType> toIPAddress3;
    @XmlElement(name = "ToIPAddress3_A")
    protected List<ArrayType> toIPAddress3A;
    @XmlElement(name = "ToIPAddress4")
    protected List<ArrayType> toIPAddress4;
    @XmlElement(name = "ToIPAddress4_A")
    protected List<ArrayType> toIPAddress4A;
    @XmlElement(name = "Mask")
    protected List<ArrayType> mask;
    @XmlElement(name = "Mask_A")
    protected List<ArrayType> maskA;
    @XmlElement(name = "Region")
    protected List<ArrayType> region;
    @XmlElement(name = "Region_A")
    protected List<ArrayType> regionA;
    @XmlElement(name = "VLAN")
    protected List<ArrayType> vlan;
    @XmlElement(name = "VLAN_A")
    protected List<ArrayType> vlana;
    @XmlElement(name = "ELIN")
    protected List<ArrayType> elin;
    @XmlElement(name = "ELIN_A")
    protected List<ArrayType> elina;

    /**
     * Gets the value of the fromIPAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromIPAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromIPAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFromIPAddress() {
        if (fromIPAddress == null) {
            fromIPAddress = new ArrayList<ArrayType>();
        }
        return this.fromIPAddress;
    }

    /**
     * Gets the value of the fromIPAddressA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromIPAddressA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromIPAddressA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFromIPAddressA() {
        if (fromIPAddressA == null) {
            fromIPAddressA = new ArrayList<ArrayType>();
        }
        return this.fromIPAddressA;
    }

    /**
     * Gets the value of the fromIPAddress1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromIPAddress1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromIPAddress1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFromIPAddress1() {
        if (fromIPAddress1 == null) {
            fromIPAddress1 = new ArrayList<ArrayType>();
        }
        return this.fromIPAddress1;
    }

    /**
     * Gets the value of the fromIPAddress1A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromIPAddress1A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromIPAddress1A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFromIPAddress1A() {
        if (fromIPAddress1A == null) {
            fromIPAddress1A = new ArrayList<ArrayType>();
        }
        return this.fromIPAddress1A;
    }

    /**
     * Gets the value of the fromIPAddress2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromIPAddress2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromIPAddress2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFromIPAddress2() {
        if (fromIPAddress2 == null) {
            fromIPAddress2 = new ArrayList<ArrayType>();
        }
        return this.fromIPAddress2;
    }

    /**
     * Gets the value of the fromIPAddress2A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromIPAddress2A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromIPAddress2A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFromIPAddress2A() {
        if (fromIPAddress2A == null) {
            fromIPAddress2A = new ArrayList<ArrayType>();
        }
        return this.fromIPAddress2A;
    }

    /**
     * Gets the value of the fromIPAddress3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromIPAddress3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromIPAddress3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFromIPAddress3() {
        if (fromIPAddress3 == null) {
            fromIPAddress3 = new ArrayList<ArrayType>();
        }
        return this.fromIPAddress3;
    }

    /**
     * Gets the value of the fromIPAddress3A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromIPAddress3A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromIPAddress3A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFromIPAddress3A() {
        if (fromIPAddress3A == null) {
            fromIPAddress3A = new ArrayList<ArrayType>();
        }
        return this.fromIPAddress3A;
    }

    /**
     * Gets the value of the fromIPAddress4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromIPAddress4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromIPAddress4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFromIPAddress4() {
        if (fromIPAddress4 == null) {
            fromIPAddress4 = new ArrayList<ArrayType>();
        }
        return this.fromIPAddress4;
    }

    /**
     * Gets the value of the fromIPAddress4A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromIPAddress4A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromIPAddress4A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFromIPAddress4A() {
        if (fromIPAddress4A == null) {
            fromIPAddress4A = new ArrayList<ArrayType>();
        }
        return this.fromIPAddress4A;
    }

    /**
     * Gets the value of the toIPAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toIPAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToIPAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getToIPAddress() {
        if (toIPAddress == null) {
            toIPAddress = new ArrayList<ArrayType>();
        }
        return this.toIPAddress;
    }

    /**
     * Gets the value of the toIPAddressA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toIPAddressA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToIPAddressA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getToIPAddressA() {
        if (toIPAddressA == null) {
            toIPAddressA = new ArrayList<ArrayType>();
        }
        return this.toIPAddressA;
    }

    /**
     * Gets the value of the toIPAddress1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toIPAddress1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToIPAddress1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getToIPAddress1() {
        if (toIPAddress1 == null) {
            toIPAddress1 = new ArrayList<ArrayType>();
        }
        return this.toIPAddress1;
    }

    /**
     * Gets the value of the toIPAddress1A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toIPAddress1A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToIPAddress1A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getToIPAddress1A() {
        if (toIPAddress1A == null) {
            toIPAddress1A = new ArrayList<ArrayType>();
        }
        return this.toIPAddress1A;
    }

    /**
     * Gets the value of the toIPAddress2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toIPAddress2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToIPAddress2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getToIPAddress2() {
        if (toIPAddress2 == null) {
            toIPAddress2 = new ArrayList<ArrayType>();
        }
        return this.toIPAddress2;
    }

    /**
     * Gets the value of the toIPAddress2A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toIPAddress2A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToIPAddress2A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getToIPAddress2A() {
        if (toIPAddress2A == null) {
            toIPAddress2A = new ArrayList<ArrayType>();
        }
        return this.toIPAddress2A;
    }

    /**
     * Gets the value of the toIPAddress3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toIPAddress3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToIPAddress3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getToIPAddress3() {
        if (toIPAddress3 == null) {
            toIPAddress3 = new ArrayList<ArrayType>();
        }
        return this.toIPAddress3;
    }

    /**
     * Gets the value of the toIPAddress3A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toIPAddress3A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToIPAddress3A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getToIPAddress3A() {
        if (toIPAddress3A == null) {
            toIPAddress3A = new ArrayList<ArrayType>();
        }
        return this.toIPAddress3A;
    }

    /**
     * Gets the value of the toIPAddress4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toIPAddress4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToIPAddress4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getToIPAddress4() {
        if (toIPAddress4 == null) {
            toIPAddress4 = new ArrayList<ArrayType>();
        }
        return this.toIPAddress4;
    }

    /**
     * Gets the value of the toIPAddress4A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toIPAddress4A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToIPAddress4A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getToIPAddress4A() {
        if (toIPAddress4A == null) {
            toIPAddress4A = new ArrayList<ArrayType>();
        }
        return this.toIPAddress4A;
    }

    /**
     * Gets the value of the mask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMask() {
        if (mask == null) {
            mask = new ArrayList<ArrayType>();
        }
        return this.mask;
    }

    /**
     * Gets the value of the maskA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maskA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaskA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMaskA() {
        if (maskA == null) {
            maskA = new ArrayList<ArrayType>();
        }
        return this.maskA;
    }

    /**
     * Gets the value of the region property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the region property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRegion() {
        if (region == null) {
            region = new ArrayList<ArrayType>();
        }
        return this.region;
    }

    /**
     * Gets the value of the regionA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regionA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegionA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getRegionA() {
        if (regionA == null) {
            regionA = new ArrayList<ArrayType>();
        }
        return this.regionA;
    }

    /**
     * Gets the value of the vlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVLAN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getVLAN() {
        if (vlan == null) {
            vlan = new ArrayList<ArrayType>();
        }
        return this.vlan;
    }

    /**
     * Gets the value of the vlana property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vlana property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVLANA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getVLANA() {
        if (vlana == null) {
            vlana = new ArrayList<ArrayType>();
        }
        return this.vlana;
    }

    /**
     * Gets the value of the elin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getELIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getELIN() {
        if (elin == null) {
            elin = new ArrayList<ArrayType>();
        }
        return this.elin;
    }

    /**
     * Gets the value of the elina property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elina property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getELINA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getELINA() {
        if (elina == null) {
            elina = new ArrayList<ArrayType>();
        }
        return this.elina;
    }

}
