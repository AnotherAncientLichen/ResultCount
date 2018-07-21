
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSLdapGroupMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSLdapGroupMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LdapServerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LdapGroup" type="{http://Checkmarx.com}CxWSLdapGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSLdapGroupMapping", propOrder = {
    "ldapServerId",
    "ldapGroup"
})
public class CxWSLdapGroupMapping {

    @XmlElement(name = "LdapServerId")
    protected int ldapServerId;
    @XmlElement(name = "LdapGroup")
    protected CxWSLdapGroup ldapGroup;

    /**
     * Gets the value of the ldapServerId property.
     * 
     */
    public int getLdapServerId() {
        return ldapServerId;
    }

    /**
     * Sets the value of the ldapServerId property.
     * 
     */
    public void setLdapServerId(int value) {
        this.ldapServerId = value;
    }

    /**
     * Gets the value of the ldapGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSLdapGroup }
     *     
     */
    public CxWSLdapGroup getLdapGroup() {
        return ldapGroup;
    }

    /**
     * Sets the value of the ldapGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSLdapGroup }
     *     
     */
    public void setLdapGroup(CxWSLdapGroup value) {
        this.ldapGroup = value;
    }

}
