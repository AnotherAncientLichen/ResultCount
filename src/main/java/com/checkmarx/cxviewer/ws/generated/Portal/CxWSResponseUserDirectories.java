
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseUserDirectories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseUserDirectories">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSBasicRepsonse">
 *       &lt;sequence>
 *         &lt;element name="Domains" type="{http://Checkmarx.com}ArrayOfCxWSActiveDirectoryDomainDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseUserDirectories", propOrder = {
    "domains"
})
public class CxWSResponseUserDirectories
    extends CxWSBasicRepsonse
{

    @XmlElement(name = "Domains")
    protected ArrayOfCxWSActiveDirectoryDomainDetails domains;

    /**
     * Gets the value of the domains property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSActiveDirectoryDomainDetails }
     *     
     */
    public ArrayOfCxWSActiveDirectoryDomainDetails getDomains() {
        return domains;
    }

    /**
     * Sets the value of the domains property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSActiveDirectoryDomainDetails }
     *     
     */
    public void setDomains(ArrayOfCxWSActiveDirectoryDomainDetails value) {
        this.domains = value;
    }

}
