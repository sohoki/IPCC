
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VectorVariablesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VectorVariablesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://xml.avaya.com/sms}VectorVariablesArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VectorVariablesType", propOrder = {
    "description",
    "type",
    "scope",
    "length",
    "start",
    "assignment",
    "vac",
    "vdnAssig",
    "description2",
    "type2",
    "scope2",
    "length2",
    "start2",
    "assignment2",
    "vac2",
    "vdnAssig2",
    "description3",
    "type3",
    "scope3",
    "length3",
    "start3",
    "assignment3",
    "vac3",
    "vdnAssig3"
})
public class VectorVariablesType {

    @XmlElement(name = "Description")
    protected List<ArrayType> description;
    @XmlElement(name = "Type")
    protected List<ArrayType> type;
    @XmlElement(name = "Scope")
    protected List<ArrayType> scope;
    @XmlElement(name = "Length")
    protected List<ArrayType> length;
    @XmlElement(name = "Start")
    protected List<ArrayType> start;
    @XmlElement(name = "Assignment")
    protected List<ArrayType> assignment;
    @XmlElement(name = "VAC")
    protected List<ArrayType> vac;
    @XmlElement(name = "VDN_Assig")
    protected List<ArrayType> vdnAssig;
    @XmlElement(name = "Description_2")
    protected List<ArrayType> description2;
    @XmlElement(name = "Type_2")
    protected List<ArrayType> type2;
    @XmlElement(name = "Scope_2")
    protected List<ArrayType> scope2;
    @XmlElement(name = "Length_2")
    protected List<ArrayType> length2;
    @XmlElement(name = "Start_2")
    protected List<ArrayType> start2;
    @XmlElement(name = "Assignment_2")
    protected List<ArrayType> assignment2;
    @XmlElement(name = "VAC_2")
    protected List<ArrayType> vac2;
    @XmlElement(name = "VDN_Assig_2")
    protected List<ArrayType> vdnAssig2;
    @XmlElement(name = "Description_3")
    protected List<ArrayType> description3;
    @XmlElement(name = "Type_3")
    protected List<ArrayType> type3;
    @XmlElement(name = "Scope_3")
    protected List<ArrayType> scope3;
    @XmlElement(name = "Length_3")
    protected List<ArrayType> length3;
    @XmlElement(name = "Start_3")
    protected List<ArrayType> start3;
    @XmlElement(name = "Assignment_3")
    protected List<ArrayType> assignment3;
    @XmlElement(name = "VAC_3")
    protected List<ArrayType> vac3;
    @XmlElement(name = "VDN_Assig_3")
    protected List<ArrayType> vdnAssig3;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDescription() {
        if (description == null) {
            description = new ArrayList<ArrayType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getType() {
        if (type == null) {
            type = new ArrayList<ArrayType>();
        }
        return this.type;
    }

    /**
     * Gets the value of the scope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getScope() {
        if (scope == null) {
            scope = new ArrayList<ArrayType>();
        }
        return this.scope;
    }

    /**
     * Gets the value of the length property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the length property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getLength() {
        if (length == null) {
            length = new ArrayList<ArrayType>();
        }
        return this.length;
    }

    /**
     * Gets the value of the start property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the start property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getStart() {
        if (start == null) {
            start = new ArrayList<ArrayType>();
        }
        return this.start;
    }

    /**
     * Gets the value of the assignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignment() {
        if (assignment == null) {
            assignment = new ArrayList<ArrayType>();
        }
        return this.assignment;
    }

    /**
     * Gets the value of the vac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVAC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getVAC() {
        if (vac == null) {
            vac = new ArrayList<ArrayType>();
        }
        return this.vac;
    }

    /**
     * Gets the value of the vdnAssig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vdnAssig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVDNAssig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getVDNAssig() {
        if (vdnAssig == null) {
            vdnAssig = new ArrayList<ArrayType>();
        }
        return this.vdnAssig;
    }

    /**
     * Gets the value of the description2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDescription2() {
        if (description2 == null) {
            description2 = new ArrayList<ArrayType>();
        }
        return this.description2;
    }

    /**
     * Gets the value of the type2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getType2() {
        if (type2 == null) {
            type2 = new ArrayList<ArrayType>();
        }
        return this.type2;
    }

    /**
     * Gets the value of the scope2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getScope2() {
        if (scope2 == null) {
            scope2 = new ArrayList<ArrayType>();
        }
        return this.scope2;
    }

    /**
     * Gets the value of the length2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the length2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLength2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getLength2() {
        if (length2 == null) {
            length2 = new ArrayList<ArrayType>();
        }
        return this.length2;
    }

    /**
     * Gets the value of the start2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the start2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStart2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getStart2() {
        if (start2 == null) {
            start2 = new ArrayList<ArrayType>();
        }
        return this.start2;
    }

    /**
     * Gets the value of the assignment2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignment2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignment2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignment2() {
        if (assignment2 == null) {
            assignment2 = new ArrayList<ArrayType>();
        }
        return this.assignment2;
    }

    /**
     * Gets the value of the vac2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vac2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVAC2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getVAC2() {
        if (vac2 == null) {
            vac2 = new ArrayList<ArrayType>();
        }
        return this.vac2;
    }

    /**
     * Gets the value of the vdnAssig2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vdnAssig2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVDNAssig2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getVDNAssig2() {
        if (vdnAssig2 == null) {
            vdnAssig2 = new ArrayList<ArrayType>();
        }
        return this.vdnAssig2;
    }

    /**
     * Gets the value of the description3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDescription3() {
        if (description3 == null) {
            description3 = new ArrayList<ArrayType>();
        }
        return this.description3;
    }

    /**
     * Gets the value of the type3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getType3() {
        if (type3 == null) {
            type3 = new ArrayList<ArrayType>();
        }
        return this.type3;
    }

    /**
     * Gets the value of the scope3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getScope3() {
        if (scope3 == null) {
            scope3 = new ArrayList<ArrayType>();
        }
        return this.scope3;
    }

    /**
     * Gets the value of the length3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the length3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLength3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getLength3() {
        if (length3 == null) {
            length3 = new ArrayList<ArrayType>();
        }
        return this.length3;
    }

    /**
     * Gets the value of the start3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the start3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStart3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getStart3() {
        if (start3 == null) {
            start3 = new ArrayList<ArrayType>();
        }
        return this.start3;
    }

    /**
     * Gets the value of the assignment3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignment3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignment3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getAssignment3() {
        if (assignment3 == null) {
            assignment3 = new ArrayList<ArrayType>();
        }
        return this.assignment3;
    }

    /**
     * Gets the value of the vac3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vac3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVAC3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getVAC3() {
        if (vac3 == null) {
            vac3 = new ArrayList<ArrayType>();
        }
        return this.vac3;
    }

    /**
     * Gets the value of the vdnAssig3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vdnAssig3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVDNAssig3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getVDNAssig3() {
        if (vdnAssig3 == null) {
            vdnAssig3 = new ArrayList<ArrayType>();
        }
        return this.vdnAssig3;
    }

}
