
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
 *         &lt;element name="GetResultsForScanByLanguageResult" type="{http://Checkmarx.com}CxWSResponceScanResults" minOccurs="0"/>
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
    "getResultsForScanByLanguageResult"
})
@XmlRootElement(name = "GetResultsForScanByLanguageResponse")
public class GetResultsForScanByLanguageResponse {

    @XmlElement(name = "GetResultsForScanByLanguageResult")
    protected CxWSResponceScanResults getResultsForScanByLanguageResult;

    /**
     * Gets the value of the getResultsForScanByLanguageResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponceScanResults }
     *     
     */
    public CxWSResponceScanResults getGetResultsForScanByLanguageResult() {
        return getResultsForScanByLanguageResult;
    }

    /**
     * Sets the value of the getResultsForScanByLanguageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponceScanResults }
     *     
     */
    public void setGetResultsForScanByLanguageResult(CxWSResponceScanResults value) {
        this.getResultsForScanByLanguageResult = value;
    }

}
