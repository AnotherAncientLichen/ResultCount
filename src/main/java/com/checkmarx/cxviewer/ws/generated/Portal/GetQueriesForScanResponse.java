
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
 *         &lt;element name="GetQueriesForScanResult" type="{http://Checkmarx.com}CxWSResponceQuerisForScan" minOccurs="0"/>
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
    "getQueriesForScanResult"
})
@XmlRootElement(name = "GetQueriesForScanResponse")
public class GetQueriesForScanResponse {

    @XmlElement(name = "GetQueriesForScanResult")
    protected CxWSResponceQuerisForScan getQueriesForScanResult;

    /**
     * Gets the value of the getQueriesForScanResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponceQuerisForScan }
     *     
     */
    public CxWSResponceQuerisForScan getGetQueriesForScanResult() {
        return getQueriesForScanResult;
    }

    /**
     * Sets the value of the getQueriesForScanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponceQuerisForScan }
     *     
     */
    public void setGetQueriesForScanResult(CxWSResponceQuerisForScan value) {
        this.getQueriesForScanResult = value;
    }

}
