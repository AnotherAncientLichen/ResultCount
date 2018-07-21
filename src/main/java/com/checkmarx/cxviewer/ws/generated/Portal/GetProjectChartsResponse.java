
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetProjectChartsResult" type="{http://Checkmarx.com}CxWSResponsProjectChartData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getProjectChartsResult"
})
@XmlRootElement(name = "GetProjectChartsResponse")
public class GetProjectChartsResponse {

    @XmlElement(name = "GetProjectChartsResult")
    protected CxWSResponsProjectChartData getProjectChartsResult;

    /**
     * Gets the value of the getProjectChartsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponsProjectChartData }
     *     
     */
    public CxWSResponsProjectChartData getGetProjectChartsResult() {
        return getProjectChartsResult;
    }

    /**
     * Sets the value of the getProjectChartsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponsProjectChartData }
     *     
     */
    public void setGetProjectChartsResult(CxWSResponsProjectChartData value) {
        this.getProjectChartsResult = value;
    }

}
