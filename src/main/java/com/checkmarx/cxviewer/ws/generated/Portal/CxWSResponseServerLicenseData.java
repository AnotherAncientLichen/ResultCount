
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseServerLicenseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseServerLicenseData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSResponseServerManagersLicenseData">
 *       &lt;sequence>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxConcurrentScans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxLOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportedLanguages" type="{http://Checkmarx.com}ArrayOfSupportedLanguage" minOccurs="0"/>
 *         &lt;element name="MaxUsers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentUsers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxAuditUsers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentAuditUsers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsOsaEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OsaExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Edition" type="{http://Checkmarx.com}LicenseEdition"/>
 *         &lt;element name="ProjectsAllowed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CurrentProjectsCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseServerLicenseData", propOrder = {
    "expirationDate",
    "maxConcurrentScans",
    "maxLOC",
    "hid",
    "supportedLanguages",
    "maxUsers",
    "currentUsers",
    "maxAuditUsers",
    "currentAuditUsers",
    "isOsaEnabled",
    "osaExpirationDate",
    "edition",
    "projectsAllowed",
    "currentProjectsCount"
})
public class CxWSResponseServerLicenseData
    extends CxWSResponseServerManagersLicenseData
{

    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "MaxConcurrentScans")
    protected String maxConcurrentScans;
    @XmlElement(name = "MaxLOC")
    protected String maxLOC;
    @XmlElement(name = "HID")
    protected String hid;
    @XmlElement(name = "SupportedLanguages")
    protected ArrayOfSupportedLanguage supportedLanguages;
    @XmlElement(name = "MaxUsers")
    protected int maxUsers;
    @XmlElement(name = "CurrentUsers")
    protected int currentUsers;
    @XmlElement(name = "MaxAuditUsers")
    protected int maxAuditUsers;
    @XmlElement(name = "CurrentAuditUsers")
    protected int currentAuditUsers;
    @XmlElement(name = "IsOsaEnabled")
    protected boolean isOsaEnabled;
    @XmlElement(name = "OsaExpirationDate")
    protected String osaExpirationDate;
    @XmlElement(name = "Edition", required = true)
    @XmlSchemaType(name = "string")
    protected LicenseEdition edition;
    @XmlElement(name = "ProjectsAllowed")
    protected long projectsAllowed;
    @XmlElement(name = "CurrentProjectsCount")
    protected long currentProjectsCount;

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the maxConcurrentScans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxConcurrentScans() {
        return maxConcurrentScans;
    }

    /**
     * Sets the value of the maxConcurrentScans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxConcurrentScans(String value) {
        this.maxConcurrentScans = value;
    }

    /**
     * Gets the value of the maxLOC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxLOC() {
        return maxLOC;
    }

    /**
     * Sets the value of the maxLOC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxLOC(String value) {
        this.maxLOC = value;
    }

    /**
     * Gets the value of the hid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHID() {
        return hid;
    }

    /**
     * Sets the value of the hid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHID(String value) {
        this.hid = value;
    }

    /**
     * Gets the value of the supportedLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupportedLanguage }
     *     
     */
    public ArrayOfSupportedLanguage getSupportedLanguages() {
        return supportedLanguages;
    }

    /**
     * Sets the value of the supportedLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupportedLanguage }
     *     
     */
    public void setSupportedLanguages(ArrayOfSupportedLanguage value) {
        this.supportedLanguages = value;
    }

    /**
     * Gets the value of the maxUsers property.
     * 
     */
    public int getMaxUsers() {
        return maxUsers;
    }

    /**
     * Sets the value of the maxUsers property.
     * 
     */
    public void setMaxUsers(int value) {
        this.maxUsers = value;
    }

    /**
     * Gets the value of the currentUsers property.
     * 
     */
    public int getCurrentUsers() {
        return currentUsers;
    }

    /**
     * Sets the value of the currentUsers property.
     * 
     */
    public void setCurrentUsers(int value) {
        this.currentUsers = value;
    }

    /**
     * Gets the value of the maxAuditUsers property.
     * 
     */
    public int getMaxAuditUsers() {
        return maxAuditUsers;
    }

    /**
     * Sets the value of the maxAuditUsers property.
     * 
     */
    public void setMaxAuditUsers(int value) {
        this.maxAuditUsers = value;
    }

    /**
     * Gets the value of the currentAuditUsers property.
     * 
     */
    public int getCurrentAuditUsers() {
        return currentAuditUsers;
    }

    /**
     * Sets the value of the currentAuditUsers property.
     * 
     */
    public void setCurrentAuditUsers(int value) {
        this.currentAuditUsers = value;
    }

    /**
     * Gets the value of the isOsaEnabled property.
     * 
     */
    public boolean isIsOsaEnabled() {
        return isOsaEnabled;
    }

    /**
     * Sets the value of the isOsaEnabled property.
     * 
     */
    public void setIsOsaEnabled(boolean value) {
        this.isOsaEnabled = value;
    }

    /**
     * Gets the value of the osaExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsaExpirationDate() {
        return osaExpirationDate;
    }

    /**
     * Sets the value of the osaExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsaExpirationDate(String value) {
        this.osaExpirationDate = value;
    }

    /**
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseEdition }
     *     
     */
    public LicenseEdition getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseEdition }
     *     
     */
    public void setEdition(LicenseEdition value) {
        this.edition = value;
    }

    /**
     * Gets the value of the projectsAllowed property.
     * 
     */
    public long getProjectsAllowed() {
        return projectsAllowed;
    }

    /**
     * Sets the value of the projectsAllowed property.
     * 
     */
    public void setProjectsAllowed(long value) {
        this.projectsAllowed = value;
    }

    /**
     * Gets the value of the currentProjectsCount property.
     * 
     */
    public long getCurrentProjectsCount() {
        return currentProjectsCount;
    }

    /**
     * Sets the value of the currentProjectsCount property.
     * 
     */
    public void setCurrentProjectsCount(long value) {
        this.currentProjectsCount = value;
    }

}
