package com.checkmarx.report.resultCount.dto;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Project {
	private long id;
	private String name;
	private boolean isPublic;
	private String description;
	private Date createdDate;
	private long ownerId;
	private String owningTeamId;
	private long engineConfigurationId;
	private String issueTrackingSettings;
	private String sourcePath;
	private String sourceProviderCredentials;
	private String excludedFiles;
	private String excludedFolders;
	private long originClientTypeId;
	private long presetId;
	private long lastScanId;
	private long totalProjectScanCount;
	private String schedulingExpression;
	
	@JsonProperty("Id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@JsonProperty("Name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("IsPublic")
	public boolean isIsPublic() {
		return isPublic;
	}
	public void setIsPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}
	@JsonProperty("Description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@JsonProperty("CreatedDate")
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@JsonProperty("OwnerId")
	public long getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}
	@JsonProperty("OwningTeamId")
	public String getOwningTeamId() {
		return owningTeamId;
	}
	public void setOwningTeamId(String owningTeamId) {
		this.owningTeamId = owningTeamId;
	}
	@JsonProperty("EngineConfigurationId")
	public long getEngineConfigurationId() {
		return engineConfigurationId;
	}
	public void setEngineConfigurationId(long engineConfigurationId) {
		this.engineConfigurationId = engineConfigurationId;
	}
	@JsonProperty("IssueTrackingSettings")
	public String getIssueTrackingSettings() {
		return issueTrackingSettings;
	}
	public void setIssueTrackingSettings(String issueTrackingSettings) {
		this.issueTrackingSettings = issueTrackingSettings;
	}
	@JsonProperty("SourcePath")
	public String getSourcePath() {
		return sourcePath;
	}
	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}
	@JsonProperty("SourceProviderCredentials")
	public String getSourceProviderCredentials() {
		return sourceProviderCredentials;
	}
	public void setSourceProviderCredentials(String sourceProviderCredentials) {
		this.sourceProviderCredentials = sourceProviderCredentials;
	}
	@JsonProperty("ExcludedFiles")
	public String getExcludedFiles() {
		return excludedFiles;
	}
	public void setExcludedFiles(String excludedFiles) {
		this.excludedFiles = excludedFiles;
	}
	@JsonProperty("ExcludedFolders")
	public String getExcludedFolders() {
		return excludedFolders;
	}
	public void setExcludedFolders(String excludedFolders) {
		this.excludedFolders = excludedFolders;
	}
	@JsonProperty("OriginClientTypeId")
	public long getOriginClientTypeId() {
		return originClientTypeId;
	}
	public void setOriginClientTypeId(long originClientTypeId) {
		this.originClientTypeId = originClientTypeId;
	}
	@JsonProperty("PresetId")
	public long getPresetId() {
		return presetId;
	}
	public void setPresetId(long presetId) {
		this.presetId = presetId;
	}
	@JsonProperty("LastScanId")
	public long getLastScanId() {
		return lastScanId;
	}
	public void setLastScanId(long lastScanId) {
		this.lastScanId = lastScanId;
	}
	@JsonProperty("TotalProjectScanCount")
	public long getTotalProjectScanCount() {
		return totalProjectScanCount;
	}
	public void setTotalProjectScanCount(long totalProjectScanCount) {
		this.totalProjectScanCount = totalProjectScanCount;
	}
	@JsonProperty("SchedulingExpression")
	public String getSchedulingExpression() {
		return schedulingExpression;
	}
	public void setSchedulingExpression(String schedulingExpression) {
		this.schedulingExpression = schedulingExpression;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", isPublic=" + isPublic + ", description=" + description
				+ ", createdDate=" + createdDate + ", ownerId=" + ownerId + ", owningTeamId=" + owningTeamId
				+ ", engineConfigurationId=" + engineConfigurationId + ", issueTrackingSettings="
				+ issueTrackingSettings + ", sourcePath=" + sourcePath + ", sourceProviderCredentials="
				+ sourceProviderCredentials + ", excludedFiles=" + excludedFiles + ", excludedFolders="
				+ excludedFolders + ", originClientTypeId=" + originClientTypeId + ", presetId=" + presetId
				+ ", lastScanId=" + lastScanId + ", totalProjectScanCount=" + totalProjectScanCount
				+ ", schedulingExpression=" + schedulingExpression + "]";
	}
	
}
