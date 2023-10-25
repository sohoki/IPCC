
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedPickUpGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedPickUpGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Extended_Group_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_Of_Members" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}ExtendedPickUpGroupArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedPickUpGroupType", propOrder = {
    "extendedGroupNumber",
    "numberOfMembers",
    "pickupGroupNumber"
})
public class ExtendedPickUpGroupType {

    @XmlElement(name = "Extended_Group_Number")
    protected String extendedGroupNumber;
    @XmlElement(name = "Number_Of_Members")
    protected String numberOfMembers;
    @XmlElement(name = "Pickup_Group_Number")
    protected List<ArrayType> pickupGroupNumber;

    /**
     * Gets the value of the extendedGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedGroupNumber() {
        return extendedGroupNumber;
    }

    /**
     * Sets the value of the extendedGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedGroupNumber(String value) {
        this.extendedGroupNumber = value;
    }

    /**
     * Gets the value of the numberOfMembers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfMembers() {
        return numberOfMembers;
    }

    /**
     * Sets the value of the numberOfMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfMembers(String value) {
        this.numberOfMembers = value;
    }

    /**
     * Gets the value of the pickupGroupNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickupGroupNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickupGroupNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getPickupGroupNumber() {
        if (pickupGroupNumber == null) {
            pickupGroupNumber = new ArrayList<ArrayType>();
        }
        return this.pickupGroupNumber;
    }

}
