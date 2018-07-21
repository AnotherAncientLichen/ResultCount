
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
 *         &lt;element name="GetSourceCodeForScanResult" type="{http://Checkmarx.com}CxWSResponseSourceContainer" minOccurs="0"/>
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
    "getSourceCodeForScanResult"
})
@XmlRootElement(name = "GetSourceCodeForScanResponse")
public class GetSourceCodeForScanResponse {

    @XmlElement(name = "GetSourceCodeForScanResult")
    protected CxWSResponseSourceContainer getSourceCodeForScanResult;

    /**
     * Gets the value of the getSourceCodeForScanResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseSourceContainer }
     *     
     */
    public CxWSResponseSourceContainer getGetSourceCodeForScanResult() {
        return getSourceCodeForScanResult;
    }

    /**
     * Sets the value of the getSourceCodeForScanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseSourceContainer }
     *     
     */
    public void setGetSourceCodeForScanResult(CxWSResponseSourceContainer value) {
        this.getSourceCodeForScanResult = value;
    }

}
