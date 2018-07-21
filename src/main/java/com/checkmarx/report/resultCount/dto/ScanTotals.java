package com.checkmarx.report.resultCount.dto;

public class ScanTotals {
	private long total = 0L;
	private long toVerify = 0L;
	private long notExploitable = 0L;
	private long confirmed = 0L;
	private long urgent = 0L;
	private long proposedNotExploitable = 0L;
	
	public ScanTotals() {}
	
	public void addState(int resultState) {
		this.total++;
		switch (resultState) {
		case 0:
			this.toVerify++;
			break;
		case 1:
			this.notExploitable++;
			break;
		case 2:
			this.confirmed++;
			break;
		case 3:
			this.urgent++;
			break;
		case 4:
			this.proposedNotExploitable++;
			break;
		default:
			break;
		}
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
		return "ScanTotals [total=" + total + ", toVerify=" + toVerify + ", notExploitable=" + notExploitable
				+ ", confirmed=" + confirmed + ", urgent=" + urgent + ", proposedNotExploitable="
				+ proposedNotExploitable + "]";
	}
	
	
}
