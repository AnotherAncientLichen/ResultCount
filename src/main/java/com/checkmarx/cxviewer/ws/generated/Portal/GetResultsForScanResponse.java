
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
 *         &lt;element name="GetResultsForScanResult" type="{http://Checkmarx.com}CxWSResponceScanResults" minOccurs="0"/>
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
    "getResultsForScanResult"
})
@XmlRootElement(name = "GetResultsForScanResponse")
public class GetResultsForScanResponse {

    @XmlElement(name = "GetResultsForScanResult")
    protected CxWSResponceScanResults getResultsForScanResult;

    /**
     * Gets the value of the getResultsForScanResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponceScanResults }
     *     
     */
    public CxWSResponceScanResults getGetResultsForScanResult() {
        return getResultsForScanResult;
    }

    /**
     * Sets the value of the getResultsForScanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponceScanResults }
     *     
     */
    public void setGetResultsForScanResult(CxWSResponceScanResults value) {
        this.getResultsForScanResult = value;
    }

}
