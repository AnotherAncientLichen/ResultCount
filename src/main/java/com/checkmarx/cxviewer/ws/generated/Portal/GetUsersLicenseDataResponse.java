
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
 *         &lt;element name="GetUsersLicenseDataResult" type="{http://Checkmarx.com}CxWSResponseUsersLicenseData" minOccurs="0"/>
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
    "getUsersLicenseDataResult"
})
@XmlRootElement(name = "GetUsersLicenseDataResponse")
public class GetUsersLicenseDataResponse {

    @XmlElement(name = "GetUsersLicenseDataResult")
    protected CxWSResponseUsersLicenseData getUsersLicenseDataResult;

    /**
     * Gets the value of the getUsersLicenseDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseUsersLicenseData }
     *     
     */
    public CxWSResponseUsersLicenseData getGetUsersLicenseDataResult() {
        return getUsersLicenseDataResult;
    }

    /**
     * Sets the value of the getUsersLicenseDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseUsersLicenseData }
     *     
     */
    public void setGetUsersLicenseDataResult(CxWSResponseUsersLicenseData value) {
        this.getUsersLicenseDataResult = value;
    }

}
