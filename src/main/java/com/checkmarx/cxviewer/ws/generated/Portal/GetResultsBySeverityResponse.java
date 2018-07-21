
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
 *         &lt;element name="GetResultsBySeverityResult" type="{http://Checkmarx.com}CxWSResponceScanResults" minOccurs="0"/>
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
    "getResultsBySeverityResult"
})
@XmlRootElement(name = "GetResultsBySeverityResponse")
public class GetResultsBySeverityResponse {

    @XmlElement(name = "GetResultsBySeverityResult")
    protected CxWSResponceScanResults getResultsBySeverityResult;

    /**
     * Gets the value of the getResultsBySeverityResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponceScanResults }
     *     
     */
    public CxWSResponceScanResults getGetResultsBySeverityResult() {
        return getResultsBySeverityResult;
    }

    /**
     * Sets the value of the getResultsBySeverityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponceScanResults }
     *     
     */
    public void setGetResultsBySeverityResult(CxWSResponceScanResults value) {
        this.getResultsBySeverityResult = value;
    }

}
