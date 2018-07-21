
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWsResponseCompanyProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWsResponseCompanyProperties">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSResponseCompaniesLicenseData">
 *       &lt;sequence>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permission" type="{http://Checkmarx.com}CxPermission" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWsResponseCompanyProperties", propOrder = {
    "companyName",
    "permission"
})
public class CxWsResponseCompanyProperties
    extends CxWSResponseCompaniesLicenseData
{

    @XmlElement(name = "CompanyName")
    protected String companyName;
    protected CxPermission permission;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the permission property.
     * 
     * @return
     *     possible object is
     *     {@link CxPermission }
     *     
     */
    public CxPermission getPermission() {
        return permission;
    }

    /**
     * Sets the value of the permission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxPermission }
     *     
     */
    public void setPermission(CxPermission value) {
        this.permission = value;
    }

}
