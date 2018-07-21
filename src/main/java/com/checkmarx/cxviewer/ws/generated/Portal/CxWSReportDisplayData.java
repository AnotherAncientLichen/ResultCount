
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSReportDisplayData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CxWSReportDisplayData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Queries" type="{http://Checkmarx.com}CxWSQueriesFilter" minOccurs="0"/>
 *         &lt;element name="ResultsSeverity" type="{http://Checkmarx.com}CxWSResultsSeverityFilter" minOccurs="0"/>
 *         &lt;element name="ResultsState" type="{http://Checkmarx.com}CxWSResultsStateFilter" minOccurs="0"/>
 *         &lt;element name="DisplayCategories" type="{http://Checkmarx.com}CxWSDisplayCategoriesFilter" minOccurs="0"/>
 *         &lt;element name="ResultsAssigedTo" type="{http://Checkmarx.com}CxWSResultsAssignedToFilter" minOccurs="0"/>
 *         &lt;element name="ResultsPerVulnerability" type="{http://Checkmarx.com}CxWSResultsPerVulnerabilityFilter" minOccurs="0"/>
 *         &lt;element name="HeaderOptions" type="{http://Checkmarx.com}CxWSHeaderDisplayOptions" minOccurs="0"/>
 *         &lt;element name="GeneralOption" type="{http://Checkmarx.com}CxWSGeneralDisplayOptions" minOccurs="0"/>
 *         &lt;element name="ResultsDisplayOption" type="{http://Checkmarx.com}CxWSResultDisplayOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSReportDisplayData", propOrder = {
    "queries",
    "resultsSeverity",
    "resultsState",
    "displayCategories",
    "resultsAssigedTo",
    "resultsPerVulnerability",
    "headerOptions",
    "generalOption",
    "resultsDisplayOption"
})
public class CxWSReportDisplayData {

    @XmlElement(name = "Queries")
    protected CxWSQueriesFilter queries;
    @XmlElement(name = "ResultsSeverity")
    protected CxWSResultsSeverityFilter resultsSeverity;
    @XmlElement(name = "ResultsState")
    protected CxWSResultsStateFilter resultsState;
    @XmlElement(name = "DisplayCategories")
    protected CxWSDisplayCategoriesFilter displayCategories;
    @XmlElement(name = "ResultsAssigedTo")
    protected CxWSResultsAssignedToFilter resultsAssigedTo;
    @XmlElement(name = "ResultsPerVulnerability")
    protected CxWSResultsPerVulnerabilityFilter resultsPerVulnerability;
    @XmlElement(name = "HeaderOptions")
    protected CxWSHeaderDisplayOptions headerOptions;
    @XmlElement(name = "GeneralOption")
    protected CxWSGeneralDisplayOptions generalOption;
    @XmlElement(name = "ResultsDisplayOption")
    protected CxWSResultDisplayOptions resultsDisplayOption;

    /**
     * Gets the value of the queries property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSQueriesFilter }
     *     
     */
    public CxWSQueriesFilter getQueries() {
        return queries;
    }

    /**
     * Sets the value of the queries property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSQueriesFilter }
     *     
     */
    public void setQueries(CxWSQueriesFilter value) {
        this.queries = value;
    }

    /**
     * Gets the value of the resultsSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResultsSeverityFilter }
     *     
     */
    public CxWSResultsSeverityFilter getResultsSeverity() {
        return resultsSeverity;
    }

    /**
     * Sets the value of the resultsSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResultsSeverityFilter }
     *     
     */
    public void setResultsSeverity(CxWSResultsSeverityFilter value) {
        this.resultsSeverity = value;
    }

    /**
     * Gets the value of the resultsState property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResultsStateFilter }
     *     
     */
    public CxWSResultsStateFilter getResultsState() {
        return resultsState;
    }

    /**
     * Sets the value of the resultsState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResultsStateFilter }
     *     
     */
    public void setResultsState(CxWSResultsStateFilter value) {
        this.resultsState = value;
    }

    /**
     * Gets the value of the displayCategories property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSDisplayCategoriesFilter }
     *     
     */
    public CxWSDisplayCategoriesFilter getDisplayCategories() {
        return displayCategories;
    }

    /**
     * Sets the value of the displayCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSDisplayCategoriesFilter }
     *     
     */
    public void setDisplayCategories(CxWSDisplayCategoriesFilter value) {
        this.displayCategories = value;
    }

    /**
     * Gets the value of the resultsAssigedTo property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResultsAssignedToFilter }
     *     
     */
    public CxWSResultsAssignedToFilter getResultsAssigedTo() {
        return resultsAssigedTo;
    }

    /**
     * Sets the value of the resultsAssigedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResultsAssignedToFilter }
     *     
     */
    public void setResultsAssigedTo(CxWSResultsAssignedToFilter value) {
        this.resultsAssigedTo = value;
    }

    /**
     * Gets the value of the resultsPerVulnerability property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResultsPerVulnerabilityFilter }
     *     
     */
    public CxWSResultsPerVulnerabilityFilter getResultsPerVulnerability() {
        return resultsPerVulnerability;
    }

    /**
     * Sets the value of the resultsPerVulnerability property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResultsPerVulnerabilityFilter }
     *     
     */
    public void setResultsPerVulnerability(CxWSResultsPerVulnerabilityFilter value) {
        this.resultsPerVulnerability = value;
    }

    /**
     * Gets the value of the headerOptions property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSHeaderDisplayOptions }
     *     
     */
    public CxWSHeaderDisplayOptions getHeaderOptions() {
        return headerOptions;
    }

    /**
     * Sets the value of the headerOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSHeaderDisplayOptions }
     *     
     */
    public void setHeaderOptions(CxWSHeaderDisplayOptions value) {
        this.headerOptions = value;
    }

    /**
     * Gets the value of the generalOption property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSGeneralDisplayOptions }
     *     
     */
    public CxWSGeneralDisplayOptions getGeneralOption() {
        return generalOption;
    }

    /**
     * Sets the value of the generalOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSGeneralDisplayOptions }
     *     
     */
    public void setGeneralOption(CxWSGeneralDisplayOptions value) {
        this.generalOption = value;
    }

    /**
     * Gets the value of the resultsDisplayOption property.
     * 
     * @return
     *     possible object is
     *     {@link CxWSResultDisplayOptions }
     *     
     */
    public CxWSResultDisplayOptions getResultsDisplayOption() {
        return resultsDisplayOption;
    }

    /**
     * Sets the value of the resultsDisplayOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxWSResultDisplayOptions }
     *     
     */
    public void setResultsDisplayOption(CxWSResultDisplayOptions value) {
        this.resultsDisplayOption = value;
    }

}