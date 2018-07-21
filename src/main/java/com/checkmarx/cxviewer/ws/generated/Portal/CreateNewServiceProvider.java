
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newSpName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spManagersint" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="companyManagers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scanners" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reviewers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ldapGroupMappings" type="{http://Checkmarx.com}ArrayOfCxWSLdapGroupMapping" minOccurs="0"/>
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
    "sessionID",
    "newSpName",
    "spManagersint",
    "companyManagers",
    "scanners",
    "reviewers",
    "ldapGroupMappings"
})
@XmlRootElement(name = "CreateNewServiceProvider")
public class CreateNewServiceProvider {

    protected String sessionID;
    protected String newSpName;
    protected int spManagersint;
    protected int companyManagers;
    protected int scanners;
    protected int reviewers;
    protected ArrayOfCxWSLdapGroupMapping ldapGroupMappings;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the newSpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSpName() {
        return newSpName;
    }

    /**
     * Sets the value of the newSpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSpName(String value) {
        this.newSpName = value;
    }

    /**
     * Gets the value of the spManagersint property.
     * 
     */
    public int getSpManagersint() {
        return spManagersint;
    }

    /**
     * Sets the value of the spManagersint property.
     * 
     */
    public void setSpManagersint(int value) {
        this.spManagersint = value;
    }

    /**
     * Gets the value of the companyManagers property.
     * 
     */
    public int getCompanyManagers() {
        return companyManagers;
    }

    /**
     * Sets the value of the companyManagers property.
     * 
     */
    public void setCompanyManagers(int value) {
        this.companyManagers = value;
    }

    /**
     * Gets the value of the scanners property.
     * 
     */
    public int getScanners() {
        return scanners;
    }

    /**
     * Sets the value of the scanners property.
     * 
     */
    public void setScanners(int value) {
        this.scanners = value;
    }

    /**
     * Gets the value of the reviewers property.
     * 
     */
    public int getReviewers() {
        return reviewers;
    }

    /**
     * Sets the value of the reviewers property.
     * 
     */
    public void setReviewers(int value) {
        this.reviewers = value;
    }

    /**
     * Gets the value of the ldapGroupMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCxWSLdapGroupMapping }
     *     
     */
    public ArrayOfCxWSLdapGroupMapping getLdapGroupMappings() {
        return ldapGroupMappings;
    }

    /**
     * Sets the value of the ldapGroupMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCxWSLdapGroupMapping }
     *     
     */
    public void setLdapGroupMappings(ArrayOfCxWSLdapGroupMapping value) {
        this.ldapGroupMappings = value;
    }

}
