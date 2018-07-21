
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSFilteredReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSFilteredReportRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSReportRequest">
 *       &lt;sequence>
 *         &lt;element name="DisplayData" type="{http://Checkmarx.com}CxWSReportDisplayData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSFilteredReportRequest", propOrder = {
    "displayData"
})
public class CxWSFilteredReportRequest
    extends CxWSReportRequest
{

    @XmlElement(name = "DisplayData")
    protected CxWSReportDisplayData displayData;

    /**
     * Gets the value of the displayData property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSReportDisplayData }
     *     
     */
    public CxWSReportDisplayData getDisplayData() {
        return displayData;
    }

    /**
     * Sets the value of the displayData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSReportDisplayData }
     *     
     */
    public void setDisplayData(CxWSReportDisplayData value) {
        this.displayData = value;
    }

}
