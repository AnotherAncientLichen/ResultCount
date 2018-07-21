
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSResponseCompaniesLicenseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSResponseCompaniesLicenseData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxWSResponseUsersLicenseData">
 *       &lt;sequence>
 *         &lt;element name="MaxCompanyManagers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentCompanyManagers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxCompanyManagersWithAudit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentCompanyManagersWithAudit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxCompanies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrentCompanies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSResponseCompaniesLicenseData", propOrder = {
    "maxCompanyManagers",
    "currentCompanyManagers",
    "maxCompanyManagersWithAudit",
    "currentCompanyManagersWithAudit",
    "maxCompanies",
    "currentCompanies"
})
@XmlSeeAlso({
    CxWsResponseCompanyProperties.class,
    CxWSResponseSPLicenseData.class
})
public class CxWSResponseCompaniesLicenseData
    extends CxWSResponseUsersLicenseData
{

    @XmlElement(name = "MaxCompanyManagers")
    protected int maxCompanyManagers;
    @XmlElement(name = "CurrentCompanyManagers")
    protected int currentCompanyManagers;
    @XmlElement(name = "MaxCompanyManagersWithAudit")
    protected int maxCompanyManagersWithAudit;
    @XmlElement(name = "CurrentCompanyManagersWithAudit")
    protected int currentCompanyManagersWithAudit;
    @XmlElement(name = "MaxCompanies")
    protected int maxCompanies;
    @XmlElement(name = "CurrentCompanies")
    protected int currentCompanies;

    /**
     * Gets the value of the maxCompanyManagers property.
     * 
     */
    public int getMaxCompanyManagers() {
        return maxCompanyManagers;
    }

    /**
     * Sets the value of the maxCompanyManagers property.
     * 
     */
    public void setMaxCompanyManagers(int value) {
        this.maxCompanyManagers = value;
    }

    /**
     * Gets the value of the currentCompanyManagers property.
     * 
     */
    public int getCurrentCompanyManagers() {
        return currentCompanyManagers;
    }

    /**
     * Sets the value of the currentCompanyManagers property.
     * 
     */
    public void setCurrentCompanyManagers(int value) {
        this.currentCompanyManagers = value;
    }

    /**
     * Gets the value of the maxCompanyManagersWithAudit property.
     * 
     */
    public int getMaxCompanyManagersWithAudit() {
        return maxCompanyManagersWithAudit;
    }

    /**
     * Sets the value of the maxCompanyManagersWithAudit property.
     * 
     */
    public void setMaxCompanyManagersWithAudit(int value) {
        this.maxCompanyManagersWithAudit = value;
    }

    /**
     * Gets the value of the currentCompanyManagersWithAudit property.
     * 
     */
    public int getCurrentCompanyManagersWithAudit() {
        return currentCompanyManagersWithAudit;
    }

    /**
     * Sets the value of the currentCompanyManagersWithAudit property.
     * 
     */
    public void setCurrentCompanyManagersWithAudit(int value) {
        this.currentCompanyManagersWithAudit = value;
    }

    /**
     * Gets the value of the maxCompanies property.
     * 
     */
    public int getMaxCompanies() {
        return maxCompanies;
    }

    /**
     * Sets the value of the maxCompanies property.
     * 
     */
    public void setMaxCompanies(int value) {
        this.maxCompanies = value;
    }

    /**
     * Gets the value of the currentCompanies property.
     * 
     */
    public int getCurrentCompanies() {
        return currentCompanies;
    }

    /**
     * Sets the value of the currentCompanies property.
     * 
     */
    public void setCurrentCompanies(int value) {
        this.currentCompanies = value;
    }

}
