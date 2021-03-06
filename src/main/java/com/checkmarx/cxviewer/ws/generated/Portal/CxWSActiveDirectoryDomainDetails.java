
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSActiveDirectoryDomainDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSActiveDirectoryDomainDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetbiosName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullyQualifiedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsMappedToLdap" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HasDomainUsers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSActiveDirectoryDomainDetails", propOrder = {
    "netbiosName",
    "fullyQualifiedName",
    "isMappedToLdap",
    "hasDomainUsers"
})
public class CxWSActiveDirectoryDomainDetails {

    @XmlElement(name = "NetbiosName")
    protected String netbiosName;
    @XmlElement(name = "FullyQualifiedName")
    protected String fullyQualifiedName;
    @XmlElement(name = "IsMappedToLdap")
    protected boolean isMappedToLdap;
    @XmlElement(name = "HasDomainUsers")
    protected boolean hasDomainUsers;

    /**
     * Gets the value of the netbiosName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetbiosName() {
        return netbiosName;
    }

    /**
     * Sets the value of the netbiosName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetbiosName(String value) {
        this.netbiosName = value;
    }

    /**
     * Gets the value of the fullyQualifiedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * Sets the value of the fullyQualifiedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullyQualifiedName(String value) {
        this.fullyQualifiedName = value;
    }

    /**
     * Gets the value of the isMappedToLdap property.
     * 
     */
    public boolean isIsMappedToLdap() {
        return isMappedToLdap;
    }

    /**
     * Sets the value of the isMappedToLdap property.
     * 
     */
    public void setIsMappedToLdap(boolean value) {
        this.isMappedToLdap = value;
    }

    /**
     * Gets the value of the hasDomainUsers property.
     * 
     */
    public boolean isHasDomainUsers() {
        return hasDomainUsers;
    }

    /**
     * Sets the value of the hasDomainUsers property.
     * 
     */
    public void setHasDomainUsers(boolean value) {
        this.hasDomainUsers = value;
    }

}
