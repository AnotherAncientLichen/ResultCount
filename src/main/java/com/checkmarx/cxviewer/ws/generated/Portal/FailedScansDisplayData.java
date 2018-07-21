
package com.checkmarx.cxviewer.ws.generated.Portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailedScansDisplayData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailedScansDisplayData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ScanRequestId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaskId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TaskScanId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ConfigurationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PresetId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IsIncremental" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RunId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UpdatedOn" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="QueuedOn" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EngineStartedOn" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EngineFinishedOn" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CompletedOn" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SourceLocationPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PartialResults" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Initiator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailedScansDisplayData", propOrder = {
    "id",
    "scanRequestId",
    "projectId",
    "projectName",
    "taskId",
    "taskScanId",
    "configurationId",
    "presetId",
    "isIncremental",
    "runId",
    "createdOn",
    "updatedOn",
    "queuedOn",
    "engineStartedOn",
    "engineFinishedOn",
    "completedOn",
    "sourceLocationPath",
    "sourceId",
    "loc",
    "language",
    "partialResults",
    "comments",
    "serverId",
    "initiator",
    "details"
})
public class FailedScansDisplayData {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "ScanRequestId")
    protected long scanRequestId;
    @XmlElement(name = "ProjectId")
    protected long projectId;
    @XmlElement(name = "ProjectName")
    protected String projectName;
    @XmlElement(name = "TaskId")
    protected long taskId;
    @XmlElement(name = "TaskScanId")
    protected long taskScanId;
    @XmlElement(name = "ConfigurationId")
    protected long configurationId;
    @XmlElement(name = "PresetId")
    protected long presetId;
    @XmlElement(name = "IsIncremental")
    protected boolean isIncremental;
    @XmlElement(name = "RunId")
    protected String runId;
    @XmlElement(name = "CreatedOn")
    protected long createdOn;
    @XmlElement(name = "UpdatedOn")
    protected long updatedOn;
    @XmlElement(name = "QueuedOn")
    protected long queuedOn;
    @XmlElement(name = "EngineStartedOn")
    protected long engineStartedOn;
    @XmlElement(name = "EngineFinishedOn")
    protected long engineFinishedOn;
    @XmlElement(name = "CompletedOn")
    protected long completedOn;
    @XmlElement(name = "SourceLocationPath")
    protected String sourceLocationPath;
    @XmlElement(name = "SourceId")
    protected String sourceId;
    @XmlElement(name = "LOC")
    protected int loc;
    @XmlElement(name = "Language")
    protected int language;
    @XmlElement(name = "PartialResults")
    protected boolean partialResults;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "ServerId")
    protected long serverId;
    @XmlElement(name = "Initiator")
    protected String initiator;
    @XmlElement(name = "Details")
    protected String details;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the scanRequestId property.
     * 
     */
    public long getScanRequestId() {
        return scanRequestId;
    }

    /**
     * Sets the value of the scanRequestId property.
     * 
     */
    public void setScanRequestId(long value) {
        this.scanRequestId = value;
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
     * Gets the value of the taskId property.
     * 
     */
    public long getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     */
    public void setTaskId(long value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the taskScanId property.
     * 
     */
    public long getTaskScanId() {
        return taskScanId;
    }

    /**
     * Sets the value of the taskScanId property.
     * 
     */
    public void setTaskScanId(long value) {
        this.taskScanId = value;
    }

    /**
     * Gets the value of the configurationId property.
     * 
     */
    public long getConfigurationId() {
        return configurationId;
    }

    /**
     * Sets the value of the configurationId property.
     * 
     */
    public void setConfigurationId(long value) {
        this.configurationId = value;
    }

    /**
     * Gets the value of the presetId property.
     * 
     */
    public long getPresetId() {
        return presetId;
    }

    /**
     * Sets the value of the presetId property.
     * 
     */
    public void setPresetId(long value) {
        this.presetId = value;
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
     * Gets the value of the runId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunId() {
        return runId;
    }

    /**
     * Sets the value of the runId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunId(String value) {
        this.runId = value;
    }

    /**
     * Gets the value of the createdOn property.
     * 
     */
    public long getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the createdOn property.
     * 
     */
    public void setCreatedOn(long value) {
        this.createdOn = value;
    }

    /**
     * Gets the value of the updatedOn property.
     * 
     */
    public long getUpdatedOn() {
        return updatedOn;
    }

    /**
     * Sets the value of the updatedOn property.
     * 
     */
    public void setUpdatedOn(long value) {
        this.updatedOn = value;
    }

    /**
     * Gets the value of the queuedOn property.
     * 
     */
    public long getQueuedOn() {
        return queuedOn;
    }

    /**
     * Sets the value of the queuedOn property.
     * 
     */
    public void setQueuedOn(long value) {
        this.queuedOn = value;
    }

    /**
     * Gets the value of the engineStartedOn property.
     * 
     */
    public long getEngineStartedOn() {
        return engineStartedOn;
    }

    /**
     * Sets the value of the engineStartedOn property.
     * 
     */
    public void setEngineStartedOn(long value) {
        this.engineStartedOn = value;
    }

    /**
     * Gets the value of the engineFinishedOn property.
     * 
     */
    public long getEngineFinishedOn() {
        return engineFinishedOn;
    }

    /**
     * Sets the value of the engineFinishedOn property.
     * 
     */
    public void setEngineFinishedOn(long value) {
        this.engineFinishedOn = value;
    }

    /**
     * Gets the value of the completedOn property.
     * 
     */
    public long getCompletedOn() {
        return completedOn;
    }

    /**
     * Sets the value of the completedOn property.
     * 
     */
    public void setCompletedOn(long value) {
        this.completedOn = value;
    }

    /**
     * Gets the value of the sourceLocationPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLocationPath() {
        return sourceLocationPath;
    }

    /**
     * Sets the value of the sourceLocationPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLocationPath(String value) {
        this.sourceLocationPath = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the loc property.
     * 
     */
    public int getLOC() {
        return loc;
    }

    /**
     * Sets the value of the loc property.
     * 
     */
    public void setLOC(int value) {
        this.loc = value;
    }

    /**
     * Gets the value of the language property.
     * 
     */
    public int getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     */
    public void setLanguage(int value) {
        this.language = value;
    }

    /**
     * Gets the value of the partialResults property.
     * 
     */
    public boolean isPartialResults() {
        return partialResults;
    }

    /**
     * Sets the value of the partialResults property.
     * 
     */
    public void setPartialResults(boolean value) {
        this.partialResults = value;
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
     * Gets the value of the serverId property.
     * 
     */
    public long getServerId() {
        return serverId;
    }

    /**
     * Sets the value of the serverId property.
     * 
     */
    public void setServerId(long value) {
        this.serverId = value;
    }

    /**
     * Gets the value of the initiator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiator() {
        return initiator;
    }

    /**
     * Sets the value of the initiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiator(String value) {
        this.initiator = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
    }

}
