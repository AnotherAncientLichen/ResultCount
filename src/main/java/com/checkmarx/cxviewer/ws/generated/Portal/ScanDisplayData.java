
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScanDisplayData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScanDisplayData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScanID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IsAllowedToDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="QueuedDateTime" type="{http://Checkmarx.com}CxDateTime" minOccurs="0"/>
 *         &lt;element name="RiskLevelScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FinishedDateTime" type="{http://Checkmarx.com}CxDateTime" minOccurs="0"/>
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InitiatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsIncremental" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CxVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOC" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="HighSeverityResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MediumSeverityResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LowSeverityResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScanDisplayType" type="{http://Checkmarx.com}ScanType"/>
 *         &lt;element name="ServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FailedLOC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatisticsCalculationDate" type="{http://Checkmarx.com}CxDateTime" minOccurs="0"/>
 *         &lt;element name="IsPublic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScanDisplayData", propOrder = {
    "scanID",
    "isAllowedToDelete",
    "queuedDateTime",
    "riskLevelScore",
    "finishedDateTime",
    "projectId",
    "projectName",
    "initiatorName",
    "teamName",
    "isIncremental",
    "cxVersion",
    "loc",
    "highSeverityResults",
    "mediumSeverityResults",
    "lowSeverityResults",
    "comments",
    "scanDisplayType",
    "serverName",
    "origin",
    "failedLOC",
    "statisticsCalculationDate",
    "isPublic",
    "isLocked"
})
public class ScanDisplayData {

    @XmlElement(name = "ScanID")
    protected long scanID;
    @XmlElement(name = "IsAllowedToDelete")
    protected boolean isAllowedToDelete;
    @XmlElement(name = "QueuedDateTime")
    protected CxDateTime queuedDateTime;
    @XmlElement(name = "RiskLevelScore")
    protected int riskLevelScore;
    @XmlElement(name = "FinishedDateTime")
    protected CxDateTime finishedDateTime;
    @XmlElement(name = "ProjectId")
    protected long projectId;
    @XmlElement(name = "ProjectName")
    protected String projectName;
    @XmlElement(name = "InitiatorName")
    protected String initiatorName;
    @XmlElement(name = "TeamName")
    protected String teamName;
    @XmlElement(name = "IsIncremental")
    protected boolean isIncremental;
    @XmlElement(name = "CxVersion")
    protected String cxVersion;
    @XmlElement(name = "LOC")
    protected long loc;
    @XmlElement(name = "HighSeverityResults")
    protected int highSeverityResults;
    @XmlElement(name = "MediumSeverityResults")
    protected int mediumSeverityResults;
    @XmlElement(name = "LowSeverityResults")
    protected int lowSeverityResults;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "ScanDisplayType", required = true)
    @XmlSchemaType(name = "string")
    protected ScanType scanDisplayType;
    @XmlElement(name = "ServerName")
    protected String serverName;
    @XmlElement(name = "Origin")
    protected String origin;
    @XmlElement(name = "FailedLOC")
    protected String failedLOC;
    @XmlElement(name = "StatisticsCalculationDate")
    protected CxDateTime statisticsCalculationDate;
    @XmlElement(name = "IsPublic")
    protected boolean isPublic;
    @XmlElement(name = "IsLocked")
    protected boolean isLocked;

    /**
     * Gets the value of the scanID property.
     * 
     */
    public long getScanID() {
        return scanID;
    }

    /**
     * Sets the value of the scanID property.
     * 
     */
    public void setScanID(long value) {
        this.scanID = value;
    }

    /**
     * Gets the value of the isAllowedToDelete property.
     * 
     */
    public boolean isIsAllowedToDelete() {
        return isAllowedToDelete;
    }

    /**
     * Sets the value of the isAllowedToDelete property.
     * 
     */
    public void setIsAllowedToDelete(boolean value) {
        this.isAllowedToDelete = value;
    }

    /**
     * Gets the value of the queuedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link CxDateTime }
     *     
     */
    public CxDateTime getQueuedDateTime() {
        return queuedDateTime;
    }

    /**
     * Sets the value of the queuedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxDateTime }
     *     
     */
    public void setQueuedDateTime(CxDateTime value) {
        this.queuedDateTime = value;
    }

    /**
     * Gets the value of the riskLevelScore property.
     * 
     */
    public int getRiskLevelScore() {
        return riskLevelScore;
    }

    /**
     * Sets the value of the riskLevelScore property.
     * 
     */
    public void setRiskLevelScore(int value) {
        this.riskLevelScore = value;
    }

    /**
     * Gets the value of the finishedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link CxDateTime }
     *     
     */
    public CxDateTime getFinishedDateTime() {
        return finishedDateTime;
    }

    /**
     * Sets the value of the finishedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxDateTime }
     *     
     */
    public void setFinishedDateTime(CxDateTime value) {
        this.finishedDateTime = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     */
    public long getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     */
    public void setProjectId(long value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the initiatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatorName() {
        return initiatorName;
    }

    /**
     * Sets the value of the initiatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatorName(String value) {
        this.initiatorName = value;
    }

    /**
     * Gets the value of the teamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets the value of the teamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamName(String value) {
        this.teamName = value;
    }

    /**
     * Gets the value of the isIncremental property.
     * 
     */
    public boolean isIsIncremental() {
        return isIncremental;
    }

    /**
     * Sets the value of the isIncremental property.
     * 
     */
    public void setIsIncremental(boolean value) {
        this.isIncremental = value;
    }

    /**
     * Gets the value of the cxVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxVersion() {
        return cxVersion;
    }

    /**
     * Sets the value of the cxVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxVersion(String value) {
        this.cxVersion = value;
    }

    /**
     * Gets the value of the loc property.
     * 
     */
    public long getLOC() {
        return loc;
    }

    /**
     * Sets the value of the loc property.
     * 
     */
    public void setLOC(long value) {
        this.loc = value;
    }

    /**
     * Gets the value of the highSeverityResults property.
     * 
     */
    public int getHighSeverityResults() {
        return highSeverityResults;
    }

    /**
     * Sets the value of the highSeverityResults property.
     * 
     */
    public void setHighSeverityResults(int value) {
        this.highSeverityResults = value;
    }

    /**
     * Gets the value of the mediumSeverityResults property.
     * 
     */
    public int getMediumSeverityResults() {
        return mediumSeverityResults;
    }

    /**
     * Sets the value of the mediumSeverityResults property.
     * 
     */
    public void setMediumSeverityResults(int value) {
        this.mediumSeverityResults = value;
    }

    /**
     * Gets the value of the lowSeverityResults property.
     * 
     */
    public int getLowSeverityResults() {
        return lowSeverityResults;
    }

    /**
     * Sets the value of the lowSeverityResults property.
     * 
     */
    public void setLowSeverityResults(int value) {
        this.lowSeverityResults = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the scanDisplayType property.
     * 
     * @return
     *     possible object is
     *     {@link ScanType }
     *     
     */
    public ScanType getScanDisplayType() {
        return scanDisplayType;
    }

    /**
     * Sets the value of the scanDisplayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanType }
     *     
     */
    public void setScanDisplayType(ScanType value) {
        this.scanDisplayType = value;
    }

    /**
     * Gets the value of the serverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Sets the value of the serverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerName(String value) {
        this.serverName = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the failedLOC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailedLOC() {
        return failedLOC;
    }

    /**
     * Sets the value of the failedLOC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailedLOC(String value) {
        this.failedLOC = value;
    }

    /**
     * Gets the value of the statisticsCalculationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CxDateTime }
     *     
     */
    public CxDateTime getStatisticsCalculationDate() {
        return statisticsCalculationDate;
    }

    /**
     * Sets the value of the statisticsCalculationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CxDateTime }
     *     
     */
    public void setStatisticsCalculationDate(CxDateTime value) {
        this.statisticsCalculationDate = value;
    }

    /**
     * Gets the value of the isPublic property.
     * 
     */
    public boolean isIsPublic() {
        return isPublic;
    }

    /**
     * Sets the value of the isPublic property.
     * 
     */
    public void setIsPublic(boolean value) {
        this.isPublic = value;
    }

    /**
     * Gets the value of the isLocked property.
     * 
     */
    public boolean isIsLocked() {
        return isLocked;
    }

    /**
     * Sets the value of the isLocked property.
     * 
     */
    public void setIsLocked(boolean value) {
        this.isLocked = value;
    }

}
