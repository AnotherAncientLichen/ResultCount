
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSGeneralDisplayOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSGeneralDisplayOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OnlyExecutiveSummary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TableOfContents" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExecutiveSummary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DisplayCategories" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DisplayLanguageHashNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ScannedQueries" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ScannedFiles" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VulnerabilitiesDescription" type="{http://Checkmarx.com}CxWSVulnerabilitiesDisplayOptions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSGeneralDisplayOptions", propOrder = {
    "onlyExecutiveSummary",
    "tableOfContents",
    "executiveSummary",
    "displayCategories",
    "displayLanguageHashNumber",
    "scannedQueries",
    "scannedFiles",
    "vulnerabilitiesDescription"
})
public class CxWSGeneralDisplayOptions {

    @XmlElement(name = "OnlyExecutiveSummary")
    protected boolean onlyExecutiveSummary;
    @XmlElement(name = "TableOfContents")
    protected boolean tableOfContents;
    @XmlElement(name = "ExecutiveSummary")
    protected boolean executiveSummary;
    @XmlElement(name = "DisplayCategories")
    protected boolean displayCategories;
    @XmlElement(name = "DisplayLanguageHashNumber")
    protected boolean displayLanguageHashNumber;
    @XmlElement(name = "ScannedQueries")
    protected boolean scannedQueries;
    @XmlElement(name = "ScannedFiles")
    protected boolean scannedFiles;
    @XmlElement(name = "VulnerabilitiesDescription", required = true)
    @XmlSchemaType(name = "string")
    protected CxWSVulnerabilitiesDisplayOptions vulnerabilitiesDescription;

    /**
     * Gets the value of the onlyExecutiveSummary property.
     * 
     */
    public boolean isOnlyExecutiveSummary() {
        return onlyExecutiveSummary;
    }

    /**
     * Sets the value of the onlyExecutiveSummary property.
     * 
     */
    public void setOnlyExecutiveSummary(boolean value) {
        this.onlyExecutiveSummary = value;
    }

    /**
     * Gets the value of the tableOfContents property.
     * 
     */
    public boolean isTableOfContents() {
        return tableOfContents;
    }

    /**
     * Sets the value of the tableOfContents property.
     * 
     */
    public void setTableOfContents(boolean value) {
        this.tableOfContents = value;
    }

    /**
     * Gets the value of the executiveSummary property.
     * 
     */
    public boolean isExecutiveSummary() {
        return executiveSummary;
    }

    /**
     * Sets the value of the executiveSummary property.
     * 
     */
    public void setExecutiveSummary(boolean value) {
        this.executiveSummary = value;
    }

    /**
     * Gets the value of the displayCategories property.
     * 
     */
    public boolean isDisplayCategories() {
        return displayCategories;
    }

    /**
     * Sets the value of the displayCategories property.
     * 
     */
    public void setDisplayCategories(boolean value) {
        this.displayCategories = value;
    }

    /**
     * Gets the value of the displayLanguageHashNumber property.
     * 
     */
    public boolean isDisplayLanguageHashNumber() {
        return displayLanguageHashNumber;
    }

    /**
     * Sets the value of the displayLanguageHashNumber property.
     * 
     */
    public void setDisplayLanguageHashNumber(boolean value) {
        this.displayLanguageHashNumber = value;
    }

    /**
     * Gets the value of the scannedQueries property.
     * 
     */
    public boolean isScannedQueries() {
        return scannedQueries;
    }

    /**
     * Sets the value of the scannedQueries property.
     * 
     */
    public void setScannedQueries(boolean value) {
        this.scannedQueries = value;
    }

    /**
     * Gets the value of the scannedFiles property.
     * 
     */
    public boolean isScannedFiles() {
        return scannedFiles;
    }

    /**
     * Sets the value of the scannedFiles property.
     * 
     */
    public void setScannedFiles(boolean value) {
        this.scannedFiles = value;
    }

    /**
     * Gets the value of the vulnerabilitiesDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSVulnerabilitiesDisplayOptions }
     *     
     */
    public CxWSVulnerabilitiesDisplayOptions getVulnerabilitiesDescription() {
        return vulnerabilitiesDescription;
    }

    /**
     * Sets the value of the vulnerabilitiesDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSVulnerabilitiesDisplayOptions }
     *     
     */
    public void setVulnerabilitiesDescription(CxWSVulnerabilitiesDisplayOptions value) {
        this.vulnerabilitiesDescription = value;
    }

}