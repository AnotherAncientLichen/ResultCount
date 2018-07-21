
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
 *         &lt;element name="GetScanSummaryResult" type="{http://Checkmarx.com}CxWSResponseScanSummary" minOccurs="0"/>
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
    "getScanSummaryResult"
})
@XmlRootElement(name = "GetScanSummaryResponse")
public class GetScanSummaryResponse {

    @XmlElement(name = "GetScanSummaryResult")
    protected CxWSResponseScanSummary getScanSummaryResult;

    /**
     * Gets the value of the getScanSummaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseScanSummary }
     *     
     */
    public CxWSResponseScanSummary getGetScanSummaryResult() {
        return getScanSummaryResult;
    }

    /**
     * Sets the value of the getScanSummaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseScanSummary }
     *     
     */
    public void setGetScanSummaryResult(CxWSResponseScanSummary value) {
        this.getScanSummaryResult = value;
    }

}
