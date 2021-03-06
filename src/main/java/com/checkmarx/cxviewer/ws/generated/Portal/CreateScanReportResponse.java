
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
 *         &lt;element name="CreateScanReportResult" type="{http://Checkmarx.com}CxWSCreateReportResponse" minOccurs="0"/>
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
    "createScanReportResult"
})
@XmlRootElement(name = "CreateScanReportResponse")
public class CreateScanReportResponse {

    @XmlElement(name = "CreateScanReportResult")
    protected CxWSCreateReportResponse createScanReportResult;

    /**
     * Gets the value of the createScanReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSCreateReportResponse }
     *     
     */
    public CxWSCreateReportResponse getCreateScanReportResult() {
        return createScanReportResult;
    }

    /**
     * Sets the value of the createScanReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSCreateReportResponse }
     *     
     */
    public void setCreateScanReportResult(CxWSCreateReportResponse value) {
        this.createScanReportResult = value;
    }

}
