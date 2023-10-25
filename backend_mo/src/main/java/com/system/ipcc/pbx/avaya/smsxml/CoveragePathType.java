
package com.system.ipcc.pbx.avaya.smsxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoveragePathType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoveragePathType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Coverage_Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Next_Path_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hunt_After_Coverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inside_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inside_Busy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inside_Dont_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inside_All" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inside_DND_SAC_GotoCover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Inside_Holiday_Coverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outside_Active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outside_Busy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outside_Dont_Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outside_All" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outside_DND_SAC_GotoCover" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outside_Holiday_Coverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number_Of_Rings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Holiday_Table" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Terminate_To_Coverage_Pts_With_Bridged_Appearances" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Point1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Point2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Point3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Point4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Point5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Point6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rings1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rings2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rings3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rings4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rings5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rings6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://xml.avaya.com/sms}CoveragePathArrayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoveragePathType", propOrder = {
    "coveragePath",
    "nextPathNumber",
    "huntAfterCoverage",
    "insideActive",
    "insideBusy",
    "insideDontAnswer",
    "insideAll",
    "insideDNDSACGotoCover",
    "insideHolidayCoverage",
    "outsideActive",
    "outsideBusy",
    "outsideDontAnswer",
    "outsideAll",
    "outsideDNDSACGotoCover",
    "outsideHolidayCoverage",
    "numberOfRings",
    "holidayTable",
    "terminateToCoveragePtsWithBridgedAppearances",
    "point1",
    "point2",
    "point3",
    "point4",
    "point5",
    "point6",
    "rings1",
    "rings2",
    "rings3",
    "rings4",
    "rings5",
    "rings6",
    "linkage"
})
public class CoveragePathType {

    @XmlElement(name = "Coverage_Path")
    protected String coveragePath;
    @XmlElement(name = "Next_Path_Number")
    protected String nextPathNumber;
    @XmlElement(name = "Hunt_After_Coverage")
    protected String huntAfterCoverage;
    @XmlElement(name = "Inside_Active")
    protected String insideActive;
    @XmlElement(name = "Inside_Busy")
    protected String insideBusy;
    @XmlElement(name = "Inside_Dont_Answer")
    protected String insideDontAnswer;
    @XmlElement(name = "Inside_All")
    protected String insideAll;
    @XmlElement(name = "Inside_DND_SAC_GotoCover")
    protected String insideDNDSACGotoCover;
    @XmlElement(name = "Inside_Holiday_Coverage")
    protected String insideHolidayCoverage;
    @XmlElement(name = "Outside_Active")
    protected String outsideActive;
    @XmlElement(name = "Outside_Busy")
    protected String outsideBusy;
    @XmlElement(name = "Outside_Dont_Answer")
    protected String outsideDontAnswer;
    @XmlElement(name = "Outside_All")
    protected String outsideAll;
    @XmlElement(name = "Outside_DND_SAC_GotoCover")
    protected String outsideDNDSACGotoCover;
    @XmlElement(name = "Outside_Holiday_Coverage")
    protected String outsideHolidayCoverage;
    @XmlElement(name = "Number_Of_Rings")
    protected String numberOfRings;
    @XmlElement(name = "Holiday_Table")
    protected String holidayTable;
    @XmlElement(name = "Terminate_To_Coverage_Pts_With_Bridged_Appearances")
    protected String terminateToCoveragePtsWithBridgedAppearances;
    @XmlElement(name = "Point1")
    protected String point1;
    @XmlElement(name = "Point2")
    protected String point2;
    @XmlElement(name = "Point3")
    protected String point3;
    @XmlElement(name = "Point4")
    protected String point4;
    @XmlElement(name = "Point5")
    protected String point5;
    @XmlElement(name = "Point6")
    protected String point6;
    @XmlElement(name = "Rings1")
    protected String rings1;
    @XmlElement(name = "Rings2")
    protected String rings2;
    @XmlElement(name = "Rings3")
    protected String rings3;
    @XmlElement(name = "Rings4")
    protected String rings4;
    @XmlElement(name = "Rings5")
    protected String rings5;
    @XmlElement(name = "Rings6")
    protected String rings6;
    @XmlElement(name = "Linkage")
    protected List<ArrayType> linkage;

    /**
     * Gets the value of the coveragePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoveragePath() {
        return coveragePath;
    }

    /**
     * Sets the value of the coveragePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoveragePath(String value) {
        this.coveragePath = value;
    }

    /**
     * Gets the value of the nextPathNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextPathNumber() {
        return nextPathNumber;
    }

    /**
     * Sets the value of the nextPathNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextPathNumber(String value) {
        this.nextPathNumber = value;
    }

    /**
     * Gets the value of the huntAfterCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntAfterCoverage() {
        return huntAfterCoverage;
    }

    /**
     * Sets the value of the huntAfterCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntAfterCoverage(String value) {
        this.huntAfterCoverage = value;
    }

    /**
     * Gets the value of the insideActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideActive() {
        return insideActive;
    }

    /**
     * Sets the value of the insideActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideActive(String value) {
        this.insideActive = value;
    }

    /**
     * Gets the value of the insideBusy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideBusy() {
        return insideBusy;
    }

    /**
     * Sets the value of the insideBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideBusy(String value) {
        this.insideBusy = value;
    }

    /**
     * Gets the value of the insideDontAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideDontAnswer() {
        return insideDontAnswer;
    }

    /**
     * Sets the value of the insideDontAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideDontAnswer(String value) {
        this.insideDontAnswer = value;
    }

    /**
     * Gets the value of the insideAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideAll() {
        return insideAll;
    }

    /**
     * Sets the value of the insideAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideAll(String value) {
        this.insideAll = value;
    }

    /**
     * Gets the value of the insideDNDSACGotoCover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideDNDSACGotoCover() {
        return insideDNDSACGotoCover;
    }

    /**
     * Sets the value of the insideDNDSACGotoCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideDNDSACGotoCover(String value) {
        this.insideDNDSACGotoCover = value;
    }

    /**
     * Gets the value of the insideHolidayCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideHolidayCoverage() {
        return insideHolidayCoverage;
    }

    /**
     * Sets the value of the insideHolidayCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideHolidayCoverage(String value) {
        this.insideHolidayCoverage = value;
    }

    /**
     * Gets the value of the outsideActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsideActive() {
        return outsideActive;
    }

    /**
     * Sets the value of the outsideActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsideActive(String value) {
        this.outsideActive = value;
    }

    /**
     * Gets the value of the outsideBusy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsideBusy() {
        return outsideBusy;
    }

    /**
     * Sets the value of the outsideBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsideBusy(String value) {
        this.outsideBusy = value;
    }

    /**
     * Gets the value of the outsideDontAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsideDontAnswer() {
        return outsideDontAnswer;
    }

    /**
     * Sets the value of the outsideDontAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsideDontAnswer(String value) {
        this.outsideDontAnswer = value;
    }

    /**
     * Gets the value of the outsideAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsideAll() {
        return outsideAll;
    }

    /**
     * Sets the value of the outsideAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsideAll(String value) {
        this.outsideAll = value;
    }

    /**
     * Gets the value of the outsideDNDSACGotoCover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsideDNDSACGotoCover() {
        return outsideDNDSACGotoCover;
    }

    /**
     * Sets the value of the outsideDNDSACGotoCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsideDNDSACGotoCover(String value) {
        this.outsideDNDSACGotoCover = value;
    }

    /**
     * Gets the value of the outsideHolidayCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsideHolidayCoverage() {
        return outsideHolidayCoverage;
    }

    /**
     * Sets the value of the outsideHolidayCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsideHolidayCoverage(String value) {
        this.outsideHolidayCoverage = value;
    }

    /**
     * Gets the value of the numberOfRings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfRings() {
        return numberOfRings;
    }

    /**
     * Sets the value of the numberOfRings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfRings(String value) {
        this.numberOfRings = value;
    }

    /**
     * Gets the value of the holidayTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolidayTable() {
        return holidayTable;
    }

    /**
     * Sets the value of the holidayTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolidayTable(String value) {
        this.holidayTable = value;
    }

    /**
     * Gets the value of the terminateToCoveragePtsWithBridgedAppearances property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminateToCoveragePtsWithBridgedAppearances() {
        return terminateToCoveragePtsWithBridgedAppearances;
    }

    /**
     * Sets the value of the terminateToCoveragePtsWithBridgedAppearances property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminateToCoveragePtsWithBridgedAppearances(String value) {
        this.terminateToCoveragePtsWithBridgedAppearances = value;
    }

    /**
     * Gets the value of the point1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoint1() {
        return point1;
    }

    /**
     * Sets the value of the point1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoint1(String value) {
        this.point1 = value;
    }

    /**
     * Gets the value of the point2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoint2() {
        return point2;
    }

    /**
     * Sets the value of the point2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoint2(String value) {
        this.point2 = value;
    }

    /**
     * Gets the value of the point3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoint3() {
        return point3;
    }

    /**
     * Sets the value of the point3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoint3(String value) {
        this.point3 = value;
    }

    /**
     * Gets the value of the point4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoint4() {
        return point4;
    }

    /**
     * Sets the value of the point4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoint4(String value) {
        this.point4 = value;
    }

    /**
     * Gets the value of the point5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoint5() {
        return point5;
    }

    /**
     * Sets the value of the point5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoint5(String value) {
        this.point5 = value;
    }

    /**
     * Gets the value of the point6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoint6() {
        return point6;
    }

    /**
     * Sets the value of the point6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoint6(String value) {
        this.point6 = value;
    }

    /**
     * Gets the value of the rings1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRings1() {
        return rings1;
    }

    /**
     * Sets the value of the rings1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRings1(String value) {
        this.rings1 = value;
    }

    /**
     * Gets the value of the rings2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRings2() {
        return rings2;
    }

    /**
     * Sets the value of the rings2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRings2(String value) {
        this.rings2 = value;
    }

    /**
     * Gets the value of the rings3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRings3() {
        return rings3;
    }

    /**
     * Sets the value of the rings3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRings3(String value) {
        this.rings3 = value;
    }

    /**
     * Gets the value of the rings4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRings4() {
        return rings4;
    }

    /**
     * Sets the value of the rings4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRings4(String value) {
        this.rings4 = value;
    }

    /**
     * Gets the value of the rings5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRings5() {
        return rings5;
    }

    /**
     * Sets the value of the rings5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRings5(String value) {
        this.rings5 = value;
    }

    /**
     * Gets the value of the rings6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRings6() {
        return rings6;
    }

    /**
     * Sets the value of the rings6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRings6(String value) {
        this.rings6 = value;
    }

    /**
     * Gets the value of the linkage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayType }
     * 
     * 
     */
    public List<ArrayType> getLinkage() {
        if (linkage == null) {
            linkage = new ArrayList<ArrayType>();
        }
        return this.linkage;
    }

}
