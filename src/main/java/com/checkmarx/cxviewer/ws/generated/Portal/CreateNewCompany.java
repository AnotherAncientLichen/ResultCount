
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
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newTCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyManagers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scanners" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reviewers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="allowActions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "parentSP",
    "newTCompanyName",
    "companyManagers",
    "scanners",
    "reviewers",
    "allowActions",
    "ldapGroupMappings"
})
@XmlRootElement(name = "CreateNewCompany")
public class CreateNewCompany {

    protected String sessionID;
    @XmlElement(name = "ParentSP")
    protected String parentSP;
    protected String newTCompanyName;
    protected int companyManagers;
    protected int scanners;
    protected int reviewers;
    protected boolean allowActions;
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
     * Gets the value of the parentSP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentSP() {
        return parentSP;
    }

    /**
     * Sets the value of the parentSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentSP(String value) {
        this.parentSP = value;
    }

    /**
     * Gets the value of the newTCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewTCompanyName() {
        return newTCompanyName;
    }

    /**
     * Sets the value of the newTCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewTCompanyName(String value) {
        this.newTCompanyName = value;
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
     * Gets the value of the allowActions property.
     * 
     */
    public boolean isAllowActions() {
        return allowActions;
    }

    /**
     * Sets the value of the allowActions property.
     * 
     */
    public void setAllowActions(boolean value) {
        this.allowActions = value;
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
