
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxUserReportPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxUserReportPreferences">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Checkmarx.com}CxUserPreferences">
 *       &lt;sequence>
 *         &lt;element name="Link2OnlineResults" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Team" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CheckmarxVersion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ScanComments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ScanType" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SourceOrigin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ScanDensity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TableOfContents" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExecutiveSummary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DisplayCategories" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DisplayLanguageHashNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ScannedQueries" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ScannedFiles" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AssignedTo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Link2Online" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ResultDescription" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OnlyExecutiveSummary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ResultsPerQueryLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VulnerabilityDescription" type="{http://Checkmarx.com}CxReportVulnerabilityDescription"/>
 *         &lt;element name="SnippetsMode" type="{http://Checkmarx.com}CxReportSnippetsMode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxUserReportPreferences", propOrder = {
    "link2OnlineResults",
    "team",
    "checkmarxVersion",
    "scanComments",
    "scanType",
    "sourceOrigin",
    "scanDensity",
    "tableOfContents",
    "executiveSummary",
    "displayCategories",
    "displayLanguageHashNumber",
    "scannedQueries",
    "scannedFiles",
    "assignedTo",
    "comments",
    "link2Online",
    "resultDescription",
    "onlyExecutiveSummary",
    "resultsPerQueryLimit",
    "vulnerabilityDescription",
    "snippetsMode"
})
public class CxUserReportPreferences
    extends CxUserPreferences
{

    @XmlElement(name = "Link2OnlineResults")
    protected boolean link2OnlineResults;
    @XmlElement(name = "Team")
    protected boolean team;
    @XmlElement(name = "CheckmarxVersion")
    protected boolean checkmarxVersion;
    @XmlElement(name = "ScanComments")
    protected boolean scanComments;
    @XmlElement(name = "ScanType")
    protected boolean scanType;
    @XmlElement(name = "SourceOrigin")
    protected boolean sourceOrigin;
    @XmlElement(name = "ScanDensity")
    protected boolean scanDensity;
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
    @XmlElement(name = "AssignedTo")
    protected boolean assignedTo;
    @XmlElement(name = "Comments")
    protected boolean comments;
    @XmlElement(name = "Link2Online")
    protected boolean link2Online;
    @XmlElement(name = "ResultDescription")
    protected boolean resultDescription;
    @XmlElement(name = "OnlyExecutiveSummary")
    protected boolean onlyExecutiveSummary;
    @XmlElement(name = "ResultsPerQueryLimit")
    protected int resultsPerQueryLimit;
    @XmlElement(name = "VulnerabilityDescription", required = true)
    @XmlSchemaType(name = "string")
    protected CxReportVulnerabilityDescription vulnerabilityDescription;
    @XmlElement(name = "SnippetsMode", required = true)
    @XmlSchemaType(name = "string")
    protected CxReportSnippetsMode snippetsMode;

    /**
     * Gets the value of the link2OnlineResults property.
     * 
     */
    public boolean isLink2OnlineResults() {
        return link2OnlineResults;
    }

    /**
     * Sets the value of the link2OnlineResults property.
     * 
     */
    public void setLink2OnlineResults(boolean value) {
        this.link2OnlineResults = value;
    }

    /**
     * Gets the value of the team property.
     * 
     */
    public boolean isTeam() {
        return team;
    }

    /**
     * Sets the value of the team property.
     * 
     */
    public void setTeam(boolean value) {
        this.team = value;
    }

    /**
     * Gets the value of the checkmarxVersion property.
     * 
     */
    public boolean isCheckmarxVersion() {
        return checkmarxVersion;
    }

    /**
     * Sets the value of the checkmarxVersion property.
     * 
     */
    public void setCheckmarxVersion(boolean value) {
        this.checkmarxVersion = value;
    }

    /**
     * Gets the value of the scanComments property.
     * 
     */
    public boolean isScanComments() {
        return scanComments;
    }

    /**
     * Sets the value of the scanComments property.
     * 
     */
    public void setScanComments(boolean value) {
        this.scanComments = value;
    }

    /**
     * Gets the value of the scanType property.
     * 
     */
    public boolean isScanType() {
        return scanType;
    }

    /**
     * Sets the value of the scanType property.
     * 
     */
    public void setScanType(boolean value) {
        this.scanType = value;
    }

    /**
     * Gets the value of the sourceOrigin property.
     * 
     */
    public boolean isSourceOrigin() {
        return sourceOrigin;
    }

    /**
     * Sets the value of the sourceOrigin property.
     * 
     */
    public void setSourceOrigin(boolean value) {
        this.sourceOrigin = value;
    }

    /**
     * Gets the value of the scanDensity property.
     * 
     */
    public boolean isScanDensity() {
        return scanDensity;
    }

    /**
     * Sets the value of the scanDensity property.
     * 
     */
    public void setScanDensity(boolean value) {
        this.scanDensity = value;
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
     * Gets the value of the assignedTo property.
     * 
     */
    public boolean isAssignedTo() {
        return assignedTo;
    }

    /**
     * Sets the value of the assignedTo property.
     * 
     */
    public void setAssignedTo(boolean value) {
        this.assignedTo = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     */
    public boolean isComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     */
    public void setComments(boolean value) {
        this.comments = value;
    }

    /**
     * Gets the value of the link2Online property.
     * 
     */
    public boolean isLink2Online() {
        return link2Online;
    }

    /**
     * Sets the value of the link2Online property.
     * 
     */
    public void setLink2Online(boolean value) {
        this.link2Online = value;
    }

    /**
     * Gets the value of the resultDescription property.
     * 
     */
    public boolean isResultDescription() {
        return resultDescription;
    }

    /**
     * Sets the value of the resultDescription property.
     * 
     */
    public void setResultDescription(boolean value) {
        this.resultDescription = value;
    }

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
     * Gets the value of the resultsPerQueryLimit property.
     * 
     */
    public int getResultsPerQueryLimit() {
        return resultsPerQueryLimit;
    }

    /**
     * Sets the value of the resultsPerQueryLimit property.
     * 
     */
    public void setResultsPerQueryLimit(int value) {
        this.resultsPerQueryLimit = value;
    }

    /**
     * Gets the value of the vulnerabilityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CxReportVulnerabilityDescription }
     *     
     */
    public CxReportVulnerabilityDescription getVulnerabilityDescription() {
        return vulnerabilityDescription;
    }

    /**
     * Sets the value of the vulnerabilityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxReportVulnerabilityDescription }
     *     
     */
    public void setVulnerabilityDescription(CxReportVulnerabilityDescription value) {
        this.vulnerabilityDescription = value;
    }

    /**
     * Gets the value of the snippetsMode property.
     * 
     * @return
     *     possible object is
     *     {@link CxReportSnippetsMode }
     *     
     */
    public CxReportSnippetsMode getSnippetsMode() {
        return snippetsMode;
    }

    /**
     * Sets the value of the snippetsMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxReportSnippetsMode }
     *     
     */
    public void setSnippetsMode(CxReportSnippetsMode value) {
        this.snippetsMode = value;
    }

}
