package com.checkmarx.report.resultCount.utils;

import java.net.MalformedURLException;
import java.net.URL;

import com.checkmarx.cxviewer.ws.generated.Portal.Credentials;

public class ReportConfig {
	private String server;
	private String cxUser;
	private String cxPassword;
	private URL resolverUrl;
	private String odataProjectUrl;
	private String reportFile;
	private String cxSession;
	
	public ReportConfig(String server, String cxUser, String cxPassword, String reportFile) throws CLIException {
		this.server = server;
		this.cxUser = cxUser;
		this.cxPassword = cxPassword;
		this.reportFile = reportFile;
		this.odataProjectUrl = server + "/Cxwebinterface/odata/v1/Projects";
		try {
			this.resolverUrl = new URL(server + "/Cxwebinterface/CxWSResolver.asmx");
		} catch (MalformedURLException e) {
			throw new CLIException("Server URL is not valid " + server);
		}
	}
	public String getServer() {
		return server;
	}
	public String getReportFile() {
		return reportFile;
	}
	public void setSessionId(String cxSession) {
		this.cxSession = cxSession;
	}
	public String getSessionId() {
		return cxSession;
	}
	public URL getResolverUrl() {
		return resolverUrl;
	}
	public String getOdataProjectUrl() {
		return odataProjectUrl;
	}
	public Credentials getCredentials() {
		Credentials creds = new Credentials();
		creds.setUser(cxUser);
		creds.setPass(cxPassword);
		return creds;
	}
	@Override
	public String toString() {
		return "ReportConfig [server=" + server + ", cxUser=" + cxUser + ", cxPassword=" + cxPassword + ", resolverUrl="
				+ resolverUrl + ", odataProjectUrl=" + odataProjectUrl + ", reportFile=" + reportFile + ", cxSession="
				+ cxSession + "]";
	}
	
}
