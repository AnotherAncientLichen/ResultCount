
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
 *         &lt;element name="GetSPLicenseDataResult" type="{http://Checkmarx.com}CxWSResponseSPLicenseData" minOccurs="0"/>
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
    "getSPLicenseDataResult"
})
@XmlRootElement(name = "GetSPLicenseDataResponse")
public class GetSPLicenseDataResponse {

    @XmlElement(name = "GetSPLicenseDataResult")
    protected CxWSResponseSPLicenseData getSPLicenseDataResult;

    /**
     * Gets the value of the getSPLicenseDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseSPLicenseData }
     *     
     */
    public CxWSResponseSPLicenseData getGetSPLicenseDataResult() {
        return getSPLicenseDataResult;
    }

    /**
     * Sets the value of the getSPLicenseDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseSPLicenseData }
     *     
     */
    public void setGetSPLicenseDataResult(CxWSResponseSPLicenseData value) {
        this.getSPLicenseDataResult = value;
    }

}
