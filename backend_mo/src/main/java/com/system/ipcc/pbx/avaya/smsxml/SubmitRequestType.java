
package com.system.ipcc.pbx.avaya.smsxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for submitRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="submitRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modelFields" type="{http://xml.avaya.com/sms}modelChoices"/>
 *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="qualifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitRequestType", namespace = "http://xml.avaya.com/ws/SystemManagementService/2008/07/01", propOrder = {
    "modelFields",
    "operation",
    "objectname",
    "qualifier"
})
public class SubmitRequestType {

    @XmlElement(required = true)
    protected ModelChoices modelFields;
    @XmlElement(required = true)
    protected String operation;
    @XmlElement(required = true)
    protected String objectname;
    @XmlElement(required = true)
    protected String qualifier;

    /**
     * Gets the value of the modelFields property.
     * 
     * @return
     *     possible object is
     *     {@link ModelChoices }
     *     
     */
    public ModelChoices getModelFields() {
        return modelFields;
    }

    /**
     * Sets the value of the modelFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelChoices }
     *     
     */
    public void setModelFields(ModelChoices value) {
        this.modelFields = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the objectname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectname() {
        return objectname;
    }

    /**
     * Sets the value of the objectname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectname(String value) {
        this.objectname = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

}
