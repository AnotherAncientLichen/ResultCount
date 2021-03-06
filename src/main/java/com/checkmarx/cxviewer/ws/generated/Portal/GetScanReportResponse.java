
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
 *         &lt;element name="GetScanReportResult" type="{http://Checkmarx.com}CxWSResponseScanResults" minOccurs="0"/>
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
    "getScanReportResult"
})
@XmlRootElement(name = "GetScanReportResponse")
public class GetScanReportResponse {

    @XmlElement(name = "GetScanReportResult")
    protected CxWSResponseScanResults getScanReportResult;

    /**
     * Gets the value of the getScanReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseScanResults }
     *     
     */
    public CxWSResponseScanResults getGetScanReportResult() {
        return getScanReportResult;
    }

    /**
     * Sets the value of the getScanReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseScanResults }
     *     
     */
    public void setGetScanReportResult(CxWSResponseScanResults value) {
        this.getScanReportResult = value;
    }

}
