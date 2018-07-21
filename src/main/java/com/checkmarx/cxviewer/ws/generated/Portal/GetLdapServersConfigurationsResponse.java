
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
 *         &lt;element name="GetLdapServersConfigurationsResult" type="{http://Checkmarx.com}CxWSResponseLDAPServersConfiguration" minOccurs="0"/>
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
    "getLdapServersConfigurationsResult"
})
@XmlRootElement(name = "GetLdapServersConfigurationsResponse")
public class GetLdapServersConfigurationsResponse {

    @XmlElement(name = "GetLdapServersConfigurationsResult")
    protected CxWSResponseLDAPServersConfiguration getLdapServersConfigurationsResult;

    /**
     * Gets the value of the getLdapServersConfigurationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseLDAPServersConfiguration }
     *     
     */
    public CxWSResponseLDAPServersConfiguration getGetLdapServersConfigurationsResult() {
        return getLdapServersConfigurationsResult;
    }

    /**
     * Sets the value of the getLdapServersConfigurationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseLDAPServersConfiguration }
     *     
     */
    public void setGetLdapServersConfigurationsResult(CxWSResponseLDAPServersConfiguration value) {
        this.getLdapServersConfigurationsResult = value;
    }

}
