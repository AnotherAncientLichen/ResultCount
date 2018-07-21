
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
 *         &lt;element name="GetLdapServerGroupsResult" type="{http://Checkmarx.com}CxWSResponseLDAPServerGroups" minOccurs="0"/>
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
    "getLdapServerGroupsResult"
})
@XmlRootElement(name = "GetLdapServerGroupsResponse")
public class GetLdapServerGroupsResponse {

    @XmlElement(name = "GetLdapServerGroupsResult")
    protected CxWSResponseLDAPServerGroups getLdapServerGroupsResult;

    /**
     * Gets the value of the getLdapServerGroupsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResponseLDAPServerGroups }
     *     
     */
    public CxWSResponseLDAPServerGroups getGetLdapServerGroupsResult() {
        return getLdapServerGroupsResult;
    }

    /**
     * Sets the value of the getLdapServerGroupsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResponseLDAPServerGroups }
     *     
     */
    public void setGetLdapServerGroupsResult(CxWSResponseLDAPServerGroups value) {
        this.getLdapServerGroupsResult = value;
    }

}
