package com.checkmarx.report.resultCount.ws;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.namespace.QName;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.checkmarx.cxviewer.ws.generated.CxWSResolver.CxClientType;
import com.checkmarx.cxviewer.ws.generated.CxWSResolver.CxWSResolver;
import com.checkmarx.cxviewer.ws.generated.CxWSResolver.CxWSResolverSoap;
import com.checkmarx.cxviewer.ws.generated.CxWSResolver.CxWSResponseDiscovery;
import com.checkmarx.cxviewer.ws.generated.Portal.CxPortalWebService;
import com.checkmarx.cxviewer.ws.generated.Portal.CxPortalWebServiceSoap;
import com.checkmarx.cxviewer.ws.generated.Portal.CxWSResponceScanResults;
import com.checkmarx.cxviewer.ws.generated.Portal.CxWSResponseGroupList;
import com.checkmarx.cxviewer.ws.generated.Portal.CxWSResponseLoginData;
import com.checkmarx.cxviewer.ws.generated.Portal.CxWSSingleResultData;
import com.checkmarx.cxviewer.ws.generated.Portal.Group;
import com.checkmarx.report.resultCount.dto.Project;
import com.checkmarx.report.resultCount.dto.ScanTotals;
import com.checkmarx.report.resultCount.utils.ReportConfig;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CxProxy {
	final static Logger logger = LoggerFactory.getLogger(CxProxy.class);
	private CxPortalWebServiceSoap ws;
	private int LCID_ENGLISH = 1033; // Windows Locale ID
	private ReportConfig conf;
	
	public CxProxy(ReportConfig config) {
		conf = config;
		URL resolverEndPoint;
		CxWSResponseDiscovery cxWSResponseDiscovery = null;
		resolverEndPoint = conf.getResolverUrl();
		CxWSResolver CxWSResolver = new CxWSResolver(resolverEndPoint, new QName("http://Checkmarx.com", "CxWSResolver"));
		CxWSResolverSoap cxWSResolverSoap = CxWSResolver.getCxWSResolverSoap();
		cxWSResponseDiscovery = cxWSResolverSoap.getWebServiceUrl(CxClientType.WEB_PORTAL, 1);
		
		if (cxWSResponseDiscovery == null || !cxWSResponseDiscovery.isIsSuccesfull()) {
			logger.error(cxWSResponseDiscovery.getErrorMessage());
			System.exit(1);
		}
		CxPortalWebService cxPortalWebService;
		try {
			cxPortalWebService = new CxPortalWebService(
					new URL(cxWSResponseDiscovery.getServiceURL()), 
					new QName("http://Checkmarx.com","CxPortalWebService"));

			ws = cxPortalWebService.getCxPortalWebServiceSoap();
			CxWSResponseLoginData cxWSResponseLoginData = ws.login(conf.getCredentials(), LCID_ENGLISH);
			if (!cxWSResponseLoginData.isIsSuccesfull()) {
				logger.error("Unable to log in" + cxWSResponseLoginData.getErrorMessage());
				System.exit(1);
			}
			config.setSessionId(cxWSResponseLoginData.getSessionId());
		} catch (MalformedURLException e) {
			logger.error("Portal URL Error: " + e.getMessage());
		}
		logger.info("Login to Checkmarx successful. SessionId: {}", conf.getSessionId());
	}
	public Map<String,String> getGroupMap() {
		Map<String,String> groupMap = new HashMap<String,String>();
		CxWSResponseGroupList resp = ws.getAssociatedGroupsList(conf.getSessionId());
		if (resp.isIsSuccesfull()) {
			for (Group group: resp.getGroupList().getGroup()) {
				groupMap.put(group.getID(), group.getGroupName());
			}
		}
		logger.debug("Loaded GroupMap with {} items", groupMap.keySet().size());
		return groupMap;
	}
	@SuppressWarnings("unchecked")
	public List<Project> getProjectList() {
		List<Project> projects;
		Client client = ClientBuilder.newClient();
		HttpAuthenticationFeature feature = HttpAuthenticationFeature.basicBuilder()
				.nonPreemptive().credentials(conf.getCredentials().getUser(), conf.getCredentials().getPass()).build();
		client.register(feature);
		
		WebTarget target = client.target(conf.getOdataProjectUrl().toString());
		Response resp = target.request(MediaType.APPLICATION_JSON).get();
		String doc = resp.readEntity(String.class);
		ObjectMapper mapper = new ObjectMapper();
		try {
			projects = (List<Project>) mapper.readValue(mapper.readTree(doc).findPath("value").toString(), new TypeReference<List<Project>>(){});
			logger.info("Found {} projects.",projects.size());
			if (logger.isDebugEnabled()) {
				for (Project p:  projects) {
					logger.debug(p.toString());
				}
			}
			return projects;
		} catch (JsonParseException e) {
			logger.error("Error parsing Projects data. {}", e.getMessage());
			System.exit(1);
		} catch (JsonMappingException e) {
			logger.error("Error Mapping JSON in Projects data. {}", e.getMessage());
			System.exit(1);
		} catch (IOException e) {
			logger.error("IO Error. {}", e.getMessage());
			System.exit(1);
		}
		return null;
	}
	public ScanTotals getScanTotals(Long scanId) {
		CxWSResponceScanResults resp = ws.getResultsForScan(conf.getSessionId(),scanId);
		ScanTotals scanTotals = new ScanTotals();
		if (resp.isIsSuccesfull()) {
			for (CxWSSingleResultData result: resp.getResults().getCxWSSingleResultData()) {
				scanTotals.addState(result.getState());
			}
		}
		return scanTotals;
	}
	
}
