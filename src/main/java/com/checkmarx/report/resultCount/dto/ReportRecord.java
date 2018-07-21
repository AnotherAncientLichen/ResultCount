package com.checkmarx.report.resultCount.dto;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class ReportRecord {
	@CsvBindByPosition(position=0)
	@CsvBindByName(column="ProjectId")
	private long projectId;
	@CsvBindByPosition(position=1)
	@CsvBindByName(column="ProjectName")
	private String projectName;
	@CsvBindByPosition(position=2)
	@CsvBindByName(column="LastScanId")
	private long lastScanId;
	@CsvBindByPosition(position=3)
	@CsvBindByName(column="ProjectTeamId")
	private String projectTeamId;
	@CsvBindByPosition(position=4)
	@CsvBindByName(column="TeamName")
	private String teamName;
	@CsvBindByPosition(position=5)
	@CsvBindByName(column="TeamPath")
	private String teamPath;
	@CsvBindByPosition(position=6)
	@CsvBindByName(column="Total")
	private long total;
	@CsvBindByPosition(position=7)
	@CsvBindByName(column="ToVerify")
	private long toVerify;
	@CsvBindByPosition(position=8)
	@CsvBindByName(column="NotExploitable")
	private long notExploitable;
	@CsvBindByPosition(position=9)
	@CsvBindByName(column="Confirmed")
	private long confirmed;
	@CsvBindByPosition(position=10)
	@CsvBindByName(column="Urgent")
	private long urgent;
	@CsvBindByPosition(position=11)
	@CsvBindByName(column="ProposedNotExploitable")
	private long proposedNotExploitable;
	
	public ReportRecord () {}
	
	public ReportRecord(long projectId, String projectName, long lastScanId, String projectTeamId, String teamName,
			String teamPath, long total, long toVerify, long notExploitable, long confirmed, long urgent,
			long proposedNotExploitable) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.lastScanId = lastScanId;
		this.projectTeamId = projectTeamId;
		this.teamName = teamName;
		this.teamPath = teamPath;
		this.total = total;
		this.toVerify = toVerify;
		this.notExploitable = notExploitable;
		this.confirmed = confirmed;
		this.urgent = urgent;
		this.proposedNotExploitable = proposedNotExploitable;
	}
	
	public long getProjectId() {
		return projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public long getLastScanId() {
		return lastScanId;
	}

	public String getProjectTeamId() {
		return projectTeamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public String getTeamPath() {
		return teamPath;
	}

	public long getTotal() {
		return total;
	}

	public long getToVerify() {
		return toVerify;
	}

	public long getNotExploitable() {
		return notExploitable;
	}

	public long getConfirmed() {
		return confirmed;
	}

	public long getUrgent() {
		return urgent;
	}

	public long getProposedNotExploitable() {
		return proposedNotExploitable;
	}

	@Override
	public String toString() {
		return "ReportRecord [projectId=" + projectId + ", projectName=" + projectName + ", lastScanId=" + lastScanId
				+ ", projectTeamId=" + projectTeamId + ", teamName=" + teamName + ", teamPath=" + teamPath + ", total="
				+ total + ", toVerify=" + toVerify + ", notExploitable=" + notExploitable + ", confirmed=" + confirmed
				+ ", urgent=" + urgent + ", proposedNotExploitable=" + proposedNotExploitable + "]";
	}
}
