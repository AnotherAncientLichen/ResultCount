
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
 *         &lt;element name="CancelLicenseExpirationNotificationResult" type="{http://Checkmarx.com}CxWSBasicRepsonse" minOccurs="0"/>
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
    "cancelLicenseExpirationNotificationResult"
})
@XmlRootElement(name = "CancelLicenseExpirationNotificationResponse")
public class CancelLicenseExpirationNotificationResponse {

    @XmlElement(name = "CancelLicenseExpirationNotificationResult")
    protected CxWSBasicRepsonse cancelLicenseExpirationNotificationResult;

    /**
     * Gets the value of the cancelLicenseExpirationNotificationResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public CxWSBasicRepsonse getCancelLicenseExpirationNotificationResult() {
        return cancelLicenseExpirationNotificationResult;
    }

    /**
     * Sets the value of the cancelLicenseExpirationNotificationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSBasicRepsonse }
     *     
     */
    public void setCancelLicenseExpirationNotificationResult(CxWSBasicRepsonse value) {
        this.cancelLicenseExpirationNotificationResult = value;
    }

}
