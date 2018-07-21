
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSLdapDomainMappingSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSLdapDomainMappingSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsMappedToDomain" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DomainNetbiosName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomainFQname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSLdapDomainMappingSettings", propOrder = {
    "isMappedToDomain",
    "domainNetbiosName",
    "domainFQname"
})
public class CxWSLdapDomainMappingSettings {

    @XmlElement(name = "IsMappedToDomain")
    protected boolean isMappedToDomain;
    @XmlElement(name = "DomainNetbiosName")
    protected String domainNetbiosName;
    @XmlElement(name = "DomainFQname")
    protected String domainFQname;

    /**
     * Gets the value of the isMappedToDomain property.
     * 
     */
    public boolean isIsMappedToDomain() {
        return isMappedToDomain;
    }

    /**
     * Sets the value of the isMappedToDomain property.
     * 
     */
    public void setIsMappedToDomain(boolean value) {
        this.isMappedToDomain = value;
    }

    /**
     * Gets the value of the domainNetbiosName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainNetbiosName() {
        return domainNetbiosName;
    }

    /**
     * Sets the value of the domainNetbiosName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainNetbiosName(String value) {
        this.domainNetbiosName = value;
    }

    /**
     * Gets the value of the domainFQname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainFQname() {
        return domainFQname;
    }

    /**
     * Sets the value of the domainFQname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainFQname(String value) {
        this.domainFQname = value;
    }

}