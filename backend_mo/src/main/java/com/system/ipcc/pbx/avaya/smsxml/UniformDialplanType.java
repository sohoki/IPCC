
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UniformDialplanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniformDialplanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Percent_Full" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}UniformDialplanArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniformDialplanType", propOrder = {
    "percentFull",
    "matchPattern",
    "len",
    "del",
    "insertDigits",
    "net",
    "conv",
    "node"
})
public class UniformDialplanType {

    @XmlElement(name = "Percent_Full")
    protected String percentFull;
    @XmlElement(name = "Match_Pattern")
    protected List<ArrayType> matchPattern;
    @XmlElement(name = "Len")
    protected List<ArrayType> len;
    @XmlElement(name = "Del")
    protected List<ArrayType> del;
    @XmlElement(name = "Insert_Digits")
    protected List<ArrayType> insertDigits;
    @XmlElement(name = "Net")
    protected List<ArrayType> net;
    @XmlElement(name = "Conv")
    protected List<ArrayType> conv;
    @XmlElement(name = "Node")
    protected List<ArrayType> node;

    /**
     * Gets the value of the percentFull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentFull() {
        return percentFull;
    }

    /**
     * Sets the value of the percentFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentFull(String value) {
        this.percentFull = value;
    }

    /**
     * Gets the value of the matchPattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchPattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMatchPattern() {
        if (matchPattern == null) {
            matchPattern = new ArrayList<ArrayType>();
        }
        return this.matchPattern;
    }

    /**
     * Gets the value of the len property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the len property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getLen() {
        if (len == null) {
            len = new ArrayList<ArrayType>();
        }
        return this.len;
    }

    /**
     * Gets the value of the del property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the del property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getDel() {
        if (del == null) {
            del = new ArrayList<ArrayType>();
        }
        return this.del;
    }

    /**
     * Gets the value of the insertDigits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insertDigits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsertDigits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getInsertDigits() {
        if (insertDigits == null) {
            insertDigits = new ArrayList<ArrayType>();
        }
        return this.insertDigits;
    }

    /**
     * Gets the value of the net property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the net property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNet() {
        if (net == null) {
            net = new ArrayList<ArrayType>();
        }
        return this.net;
    }

    /**
     * Gets the value of the conv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getConv() {
        if (conv == null) {
            conv = new ArrayList<ArrayType>();
        }
        return this.conv;
    }

    /**
     * Gets the value of the node property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the node property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getNode() {
        if (node == null) {
            node = new ArrayList<ArrayType>();
        }
        return this.node;
    }

}
