
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseScanProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseScanProperties">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Top5Vulnes" type="{http://Checkmarx.com}ArrayOfVulerability" minOccurs="0"/>
 *         &lt;element name="ScanRiskParams" type="{http://Checkmarx.com}ScanRiskLevel" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatisticsCalculationDate" type="{http://Checkmarx.com}CxDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseScanProperties", propOrder = {
    "top5Vulnes",
    "scanRiskParams",
    "comment",
    "statisticsCalculationDate"
})
public class CxWSResponseScanProperties
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Top5Vulnes")
    protected ArrayOfVulerability top5Vulnes;
    @XmlElement(name = "ScanRiskParams")
    protected ScanRiskLevel scanRiskParams;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "StatisticsCalculationDate")
    protected CxDateTime statisticsCalculationDate;

    /**
     * Gets the value of the top5Vulnes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVulerability }
     *     
     */
    public ArrayOfVulerability getTop5Vulnes() {
        return top5Vulnes;
    }

    /**
     * Sets the value of the top5Vulnes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVulerability }
     *     
     */
    public void setTop5Vulnes(ArrayOfVulerability value) {
        this.top5Vulnes = value;
    }

    /**
     * Gets the value of the scanRiskParams property.
     * 
     * @return
     *     possible object is
     *     {@link ScanRiskLevel }
     *     
     */
    public ScanRiskLevel getScanRiskParams() {
        return scanRiskParams;
    }

    /**
     * Sets the value of the scanRiskParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanRiskLevel }
     *     
     */
    public void setScanRiskParams(ScanRiskLevel value) {
        this.scanRiskParams = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the statisticsCalculationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CxDateTime }
     *     
     */
    public CxDateTime getStatisticsCalculationDate() {
        return statisticsCalculationDate;
    }

    /**
     * Sets the value of the statisticsCalculationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxDateTime }
     *     
     */
    public void setStatisticsCalculationDate(CxDateTime value) {
        this.statisticsCalculationDate = value;
    }

}
