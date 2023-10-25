
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPCodecType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPCodecType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Allow_Direct_IP_Multimedia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Call_Rate_for_Direct_IP_Multimedia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Call_Rate_for_Direct_IP_Multimedia_Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Call_Rate_for_Priority_Direct_IP_Multimedia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Maximum_Call_Rate_for_Priority_Direct_IP_Multimedia_Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}IPCodecArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPCodecType", propOrder = {
    "allowDirectIPMultimedia",
    "maximumCallRateForDirectIPMultimedia",
    "maximumCallRateForDirectIPMultimediaUnits",
    "maximumCallRateForPriorityDirectIPMultimedia",
    "maximumCallRateForPriorityDirectIPMultimediaUnits",
    "codec",
    "silenceSuppression",
    "framesize",
    "mediaEncryption"
})
public class IPCodecType {

    @XmlElement(name = "Allow_Direct_IP_Multimedia")
    protected String allowDirectIPMultimedia;
    @XmlElement(name = "Maximum_Call_Rate_for_Direct_IP_Multimedia")
    protected String maximumCallRateForDirectIPMultimedia;
    @XmlElement(name = "Maximum_Call_Rate_for_Direct_IP_Multimedia_Units")
    protected String maximumCallRateForDirectIPMultimediaUnits;
    @XmlElement(name = "Maximum_Call_Rate_for_Priority_Direct_IP_Multimedia")
    protected String maximumCallRateForPriorityDirectIPMultimedia;
    @XmlElement(name = "Maximum_Call_Rate_for_Priority_Direct_IP_Multimedia_Units")
    protected String maximumCallRateForPriorityDirectIPMultimediaUnits;
    @XmlElement(name = "Codec")
    protected List<ArrayType> codec;
    @XmlElement(name = "Silence_Suppression")
    protected List<ArrayType> silenceSuppression;
    @XmlElement(name = "Framesize")
    protected List<ArrayType> framesize;
    @XmlElement(name = "Media_Encryption")
    protected List<ArrayType> mediaEncryption;

    /**
     * Gets the value of the allowDirectIPMultimedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowDirectIPMultimedia() {
        return allowDirectIPMultimedia;
    }

    /**
     * Sets the value of the allowDirectIPMultimedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowDirectIPMultimedia(String value) {
        this.allowDirectIPMultimedia = value;
    }

    /**
     * Gets the value of the maximumCallRateForDirectIPMultimedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumCallRateForDirectIPMultimedia() {
        return maximumCallRateForDirectIPMultimedia;
    }

    /**
     * Sets the value of the maximumCallRateForDirectIPMultimedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumCallRateForDirectIPMultimedia(String value) {
        this.maximumCallRateForDirectIPMultimedia = value;
    }

    /**
     * Gets the value of the maximumCallRateForDirectIPMultimediaUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumCallRateForDirectIPMultimediaUnits() {
        return maximumCallRateForDirectIPMultimediaUnits;
    }

    /**
     * Sets the value of the maximumCallRateForDirectIPMultimediaUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumCallRateForDirectIPMultimediaUnits(String value) {
        this.maximumCallRateForDirectIPMultimediaUnits = value;
    }

    /**
     * Gets the value of the maximumCallRateForPriorityDirectIPMultimedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumCallRateForPriorityDirectIPMultimedia() {
        return maximumCallRateForPriorityDirectIPMultimedia;
    }

    /**
     * Sets the value of the maximumCallRateForPriorityDirectIPMultimedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumCallRateForPriorityDirectIPMultimedia(String value) {
        this.maximumCallRateForPriorityDirectIPMultimedia = value;
    }

    /**
     * Gets the value of the maximumCallRateForPriorityDirectIPMultimediaUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumCallRateForPriorityDirectIPMultimediaUnits() {
        return maximumCallRateForPriorityDirectIPMultimediaUnits;
    }

    /**
     * Sets the value of the maximumCallRateForPriorityDirectIPMultimediaUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumCallRateForPriorityDirectIPMultimediaUnits(String value) {
        this.maximumCallRateForPriorityDirectIPMultimediaUnits = value;
    }

    /**
     * Gets the value of the codec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getCodec() {
        if (codec == null) {
            codec = new ArrayList<ArrayType>();
        }
        return this.codec;
    }

    /**
     * Gets the value of the silenceSuppression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the silenceSuppression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSilenceSuppression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getSilenceSuppression() {
        if (silenceSuppression == null) {
            silenceSuppression = new ArrayList<ArrayType>();
        }
        return this.silenceSuppression;
    }

    /**
     * Gets the value of the framesize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the framesize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFramesize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getFramesize() {
        if (framesize == null) {
            framesize = new ArrayList<ArrayType>();
        }
        return this.framesize;
    }

    /**
     * Gets the value of the mediaEncryption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaEncryption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaEncryption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getMediaEncryption() {
        if (mediaEncryption == null) {
            mediaEncryption = new ArrayList<ArrayType>();
        }
        return this.mediaEncryption;
    }

}
