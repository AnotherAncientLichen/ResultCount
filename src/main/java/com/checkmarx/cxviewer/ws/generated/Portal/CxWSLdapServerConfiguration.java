
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSLdapServerConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSLdapServerConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirectoryType" type="{http://Checkmarx.com}CxWSLdapDirectoryType"/>
 *         &lt;element name="Action" type="{http://Checkmarx.com}CxWSLdapServerConfigurationAction"/>
 *         &lt;element name="HostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UseSSL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VerifySslCertificate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseDn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalUserDn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserObjectClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserObjectFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsernameAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserRdnAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstNameAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastNameAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SyncSettings" type="{http://Checkmarx.com}CxWSLdapServerSyncSettings" minOccurs="0"/>
 *         &lt;element name="DomainMapSettings" type="{http://Checkmarx.com}CxWSLdapDomainMappingSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSLdapServerConfiguration", propOrder = {
    "id",
    "name",
    "directoryType",
    "action",
    "hostName",
    "port",
    "useSSL",
    "verifySslCertificate",
    "username",
    "password",
    "baseDn",
    "additionalUserDn",
    "userObjectClass",
    "userObjectFilter",
    "usernameAttribute",
    "userRdnAttribute",
    "firstNameAttribute",
    "lastNameAttribute",
    "emailAttribute",
    "syncSettings",
    "domainMapSettings"
})
public class CxWSLdapServerConfiguration {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "DirectoryType", required = true)
    @XmlSchemaType(name = "string")
    protected CxWSLdapDirectoryType directoryType;
    @XmlElement(name = "Action", required = true)
    @XmlSchemaType(name = "string")
    protected CxWSLdapServerConfigurationAction action;
    @XmlElement(name = "HostName")
    protected String hostName;
    @XmlElement(name = "Port")
    protected int port;
    @XmlElement(name = "UseSSL")
    protected boolean useSSL;
    @XmlElement(name = "VerifySslCertificate")
    protected boolean verifySslCertificate;
    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "BaseDn")
    protected String baseDn;
    @XmlElement(name = "AdditionalUserDn")
    protected String additionalUserDn;
    @XmlElement(name = "UserObjectClass")
    protected String userObjectClass;
    @XmlElement(name = "UserObjectFilter")
    protected String userObjectFilter;
    @XmlElement(name = "UsernameAttribute")
    protected String usernameAttribute;
    @XmlElement(name = "UserRdnAttribute")
    protected String userRdnAttribute;
    @XmlElement(name = "FirstNameAttribute")
    protected String firstNameAttribute;
    @XmlElement(name = "LastNameAttribute")
    protected String lastNameAttribute;
    @XmlElement(name = "EmailAttribute")
    protected String emailAttribute;
    @XmlElement(name = "SyncSettings")
    protected CxWSLdapServerSyncSettings syncSettings;
    @XmlElement(name = "DomainMapSettings")
    protected CxWSLdapDomainMappingSettings domainMapSettings;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the directoryType property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSLdapDirectoryType }
     *     
     */
    public CxWSLdapDirectoryType getDirectoryType() {
        return directoryType;
    }

    /**
     * Sets the value of the directoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSLdapDirectoryType }
     *     
     */
    public void setDirectoryType(CxWSLdapDirectoryType value) {
        this.directoryType = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSLdapServerConfigurationAction }
     *     
     */
    public CxWSLdapServerConfigurationAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSLdapServerConfigurationAction }
     *     
     */
    public void setAction(CxWSLdapServerConfigurationAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the port property.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

    /**
     * Gets the value of the useSSL property.
     * 
     */
    public boolean isUseSSL() {
        return useSSL;
    }

    /**
     * Sets the value of the useSSL property.
     * 
     */
    public void setUseSSL(boolean value) {
        this.useSSL = value;
    }

    /**
     * Gets the value of the verifySslCertificate property.
     * 
     */
    public boolean isVerifySslCertificate() {
        return verifySslCertificate;
    }

    /**
     * Sets the value of the verifySslCertificate property.
     * 
     */
    public void setVerifySslCertificate(boolean value) {
        this.verifySslCertificate = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the baseDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDn() {
        return baseDn;
    }

    /**
     * Sets the value of the baseDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDn(String value) {
        this.baseDn = value;
    }

    /**
     * Gets the value of the additionalUserDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalUserDn() {
        return additionalUserDn;
    }

    /**
     * Sets the value of the additionalUserDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalUserDn(String value) {
        this.additionalUserDn = value;
    }

    /**
     * Gets the value of the userObjectClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserObjectClass() {
        return userObjectClass;
    }

    /**
     * Sets the value of the userObjectClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserObjectClass(String value) {
        this.userObjectClass = value;
    }

    /**
     * Gets the value of the userObjectFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserObjectFilter() {
        return userObjectFilter;
    }

    /**
     * Sets the value of the userObjectFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserObjectFilter(String value) {
        this.userObjectFilter = value;
    }

    /**
     * Gets the value of the usernameAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsernameAttribute() {
        return usernameAttribute;
    }

    /**
     * Sets the value of the usernameAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsernameAttribute(String value) {
        this.usernameAttribute = value;
    }

    /**
     * Gets the value of the userRdnAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRdnAttribute() {
        return userRdnAttribute;
    }

    /**
     * Sets the value of the userRdnAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRdnAttribute(String value) {
        this.userRdnAttribute = value;
    }

    /**
     * Gets the value of the firstNameAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNameAttribute() {
        return firstNameAttribute;
    }

    /**
     * Sets the value of the firstNameAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNameAttribute(String value) {
        this.firstNameAttribute = value;
    }

    /**
     * Gets the value of the lastNameAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameAttribute() {
        return lastNameAttribute;
    }

    /**
     * Sets the value of the lastNameAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameAttribute(String value) {
        this.lastNameAttribute = value;
    }

    /**
     * Gets the value of the emailAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAttribute() {
        return emailAttribute;
    }

    /**
     * Sets the value of the emailAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAttribute(String value) {
        this.emailAttribute = value;
    }

    /**
     * Gets the value of the syncSettings property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSLdapServerSyncSettings }
     *     
     */
    public CxWSLdapServerSyncSettings getSyncSettings() {
        return syncSettings;
    }

    /**
     * Sets the value of the syncSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSLdapServerSyncSettings }
     *     
     */
    public void setSyncSettings(CxWSLdapServerSyncSettings value) {
        this.syncSettings = value;
    }

    /**
     * Gets the value of the domainMapSettings property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSLdapDomainMappingSettings }
     *     
     */
    public CxWSLdapDomainMappingSettings getDomainMapSettings() {
        return domainMapSettings;
    }

    /**
     * Sets the value of the domainMapSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSLdapDomainMappingSettings }
     *     
     */
    public void setDomainMapSettings(CxWSLdapDomainMappingSettings value) {
        this.domainMapSettings = value;
    }

}
