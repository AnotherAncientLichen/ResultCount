
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PivotClientDateRangeParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PivotClientDateRangeParam">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}PivotClientBaseParam">
 *       &lt;sequence>
 *         &lt;element name="RangeType" type="{http://Checkmarx.com}PivotClientDateRanges"/>
 *         &lt;element name="DateFrom" type="{http://Checkmarx.com}CxDateTime" minOccurs="0"/>
 *         &lt;element name="DateTo" type="{http://Checkmarx.com}CxDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PivotClientDateRangeParam", propOrder = {
    "rangeType",
    "dateFrom",
    "dateTo"
})
public class PivotClientDateRangeParam
    extends PivotClientBaseParam
{

    @XmlElement(name = "RangeType", required = true)
    @XmlSchemaType(name = "string")
    protected PivotClientDateRanges rangeType;
    @XmlElement(name = "DateFrom")
    protected CxDateTime dateFrom;
    @XmlElement(name = "DateTo")
    protected CxDateTime dateTo;

    /**
     * Gets the value of the rangeType property.
     * 
     * @return
     *     possible object is
     *     {@link PivotClientDateRanges }
     *     
     */
    public PivotClientDateRanges getRangeType() {
        return rangeType;
    }

    /**
     * Sets the value of the rangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PivotClientDateRanges }
     *     
     */
    public void setRangeType(PivotClientDateRanges value) {
        this.rangeType = value;
    }

    /**
     * Gets the value of the dateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link CxDateTime }
     *     
     */
    public CxDateTime getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxDateTime }
     *     
     */
    public void setDateFrom(CxDateTime value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the dateTo property.
     * 
     * @return
     *     possible object is
     *     {@link CxDateTime }
     *     
     */
    public CxDateTime getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxDateTime }
     *     
     */
    public void setDateTo(CxDateTime value) {
        this.dateTo = value;
    }

}
