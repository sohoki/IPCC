
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://xml.avaya.com/sms}SiteDataArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteDataType", propOrder = {
    "building",
    "floor",
    "setColor"
})
public class SiteDataType {

    @XmlElement(name = "Building")
    protected List<ArrayType> building;
    @XmlElement(name = "Floor")
    protected List<ArrayType> floor;
    @XmlElement(name = "Set_Color")
    protected List<ArrayType> setColor;

    /**
     * Gets the value of the building property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the building property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuilding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getBuilding() {
        if (building == null) {
            building = new ArrayList<ArrayType>();
        }
        return this.building;
    }

    /**
     * Gets the value of the floor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFloor() {
        if (floor == null) {
            floor = new ArrayList<ArrayType>();
        }
        return this.floor;
    }

    /**
     * Gets the value of the setColor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setColor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetColor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSetColor() {
        if (setColor == null) {
            setColor = new ArrayList<ArrayType>();
        }
        return this.setColor;
    }

}
