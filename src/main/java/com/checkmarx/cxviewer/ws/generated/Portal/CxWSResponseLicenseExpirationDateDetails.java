
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseLicenseExpirationDateDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseLicenseExpirationDateDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="LicenseExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShouldDisplayExpirationDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseLicenseExpirationDateDetails", propOrder = {
    "licenseExpirationDate",
    "shouldDisplayExpirationDate"
})
public class CxWSResponseLicenseExpirationDateDetails
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "LicenseExpirationDate")
    protected String licenseExpirationDate;
    @XmlElement(name = "ShouldDisplayExpirationDate")
    protected boolean shouldDisplayExpirationDate;

    /**
     * Gets the value of the licenseExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseExpirationDate() {
        return licenseExpirationDate;
    }

    /**
     * Sets the value of the licenseExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseExpirationDate(String value) {
        this.licenseExpirationDate = value;
    }

    /**
     * Gets the value of the shouldDisplayExpirationDate property.
     * 
     */
    public boolean isShouldDisplayExpirationDate() {
        return shouldDisplayExpirationDate;
    }

    /**
     * Sets the value of the shouldDisplayExpirationDate property.
     * 
     */
    public void setShouldDisplayExpirationDate(boolean value) {
        this.shouldDisplayExpirationDate = value;
    }

}
