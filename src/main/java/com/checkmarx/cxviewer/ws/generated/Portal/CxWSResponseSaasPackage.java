
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseSaasPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseSaasPackage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="packages" type="{http://Checkmarx.com}ArrayOfSaasPackage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseSaasPackage", propOrder = {
    "packages"
})
public class CxWSResponseSaasPackage
    extends CxWSBasicRepsonse
{

    protected ArrayOfSaasPackage packages;

    /**
     * Gets the value of the packages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSaasPackage }
     *     
     */
    public ArrayOfSaasPackage getPackages() {
        return packages;
    }

    /**
     * Sets the value of the packages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSaasPackage }
     *     
     */
    public void setPackages(ArrayOfSaasPackage value) {
        this.packages = value;
    }

}
