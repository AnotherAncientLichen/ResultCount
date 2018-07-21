
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
 *         &lt;element name="GetConfiguredLdapServerNamesResult" type="{http://Checkmarx.com}CxWSResponseIdNamePairList" minOccurs="0"/>
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
    "getConfiguredLdapServerNamesResult"
})
@XmlRootElement(name = "GetConfiguredLdapServerNamesResponse")
public class GetConfiguredLdapServerNamesResponse {

    @XmlElement(name = "GetConfiguredLdapServerNamesResult")
    protected CxWSResponseIdNamePairList getConfiguredLdapServerNamesResult;

    /**
     * Gets the value of the getConfiguredLdapServerNamesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseIdNamePairList }
     *     
     */
    public CxWSResponseIdNamePairList getGetConfiguredLdapServerNamesResult() {
        return getConfiguredLdapServerNamesResult;
    }

    /**
     * Sets the value of the getConfiguredLdapServerNamesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseIdNamePairList }
     *     
     */
    public void setGetConfiguredLdapServerNamesResult(CxWSResponseIdNamePairList value) {
        this.getConfiguredLdapServerNamesResult = value;
    }

}
