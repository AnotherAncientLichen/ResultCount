
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseScanCompareSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseScanCompareSummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Total" type="{http://Checkmarx.com}CxWsScanCompareCount" minOccurs="0"/>
 *         &lt;element name="High" type="{http://Checkmarx.com}CxWsScanCompareCount" minOccurs="0"/>
 *         &lt;element name="Medium" type="{http://Checkmarx.com}CxWsScanCompareCount" minOccurs="0"/>
 *         &lt;element name="Low" type="{http://Checkmarx.com}CxWsScanCompareCount" minOccurs="0"/>
 *         &lt;element name="Info" type="{http://Checkmarx.com}CxWsScanCompareCount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseScanCompareSummary", propOrder = {
    "total",
    "high",
    "medium",
    "low",
    "info"
})
public class CxWSResponseScanCompareSummary
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Total")
    protected CxWsScanCompareCount total;
    @XmlElement(name = "High")
    protected CxWsScanCompareCount high;
    @XmlElement(name = "Medium")
    protected CxWsScanCompareCount medium;
    @XmlElement(name = "Low")
    protected CxWsScanCompareCount low;
    @XmlElement(name = "Info")
    protected CxWsScanCompareCount info;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link CxWsScanCompareCount }
     *     
     */
    public CxWsScanCompareCount getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWsScanCompareCount }
     *     
     */
    public void setTotal(CxWsScanCompareCount value) {
        this.total = value;
    }

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link CxWsScanCompareCount }
     *     
     */
    public CxWsScanCompareCount getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWsScanCompareCount }
     *     
     */
    public void setHigh(CxWsScanCompareCount value) {
        this.high = value;
    }

    /**
     * Gets the value of the medium property.
     * 
     * @return
     *     possible object is
     *     {@link CxWsScanCompareCount }
     *     
     */
    public CxWsScanCompareCount getMedium() {
        return medium;
    }

    /**
     * Sets the value of the medium property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWsScanCompareCount }
     *     
     */
    public void setMedium(CxWsScanCompareCount value) {
        this.medium = value;
    }

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link CxWsScanCompareCount }
     *     
     */
    public CxWsScanCompareCount getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWsScanCompareCount }
     *     
     */
    public void setLow(CxWsScanCompareCount value) {
        this.low = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link CxWsScanCompareCount }
     *     
     */
    public CxWsScanCompareCount getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWsScanCompareCount }
     *     
     */
    public void setInfo(CxWsScanCompareCount value) {
        this.info = value;
    }

}
