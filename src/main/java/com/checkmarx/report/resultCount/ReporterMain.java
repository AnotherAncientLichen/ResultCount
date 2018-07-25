package com.checkmarx.report.resultCount;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.checkmarx.report.resultCount.dto.OpenCSVMappingStrategy;
import com.checkmarx.report.resultCount.dto.Project;
import com.checkmarx.report.resultCount.dto.ReportRecord;
import com.checkmarx.report.resultCount.dto.ScanTotals;
import com.checkmarx.report.resultCount.utils.CLIException;
import com.checkmarx.report.resultCount.utils.CLIParser;
import com.checkmarx.report.resultCount.utils.ReportConfig;
import com.checkmarx.report.resultCount.ws.CxProxy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class ReporterMain {
	final static Logger logger = LoggerFactory.getLogger(ReporterMain.class);
	
	public static void main(String[] args) {
		Date startDate = new Date();
		logger.info("Starting processing on: {}", startDate.toString());

		ReporterMain reporter = new ReporterMain();
		reporter.run(args);

		Date endDate = new Date();
		logger.info("Completed processing on: {}", endDate.toString());
	}
	
	public void run(String[] args) {
		List<ReportRecord> recs = new ArrayList<>();
		ReportConfig config = getConfiguration(args);
		CxProxy proxy = new CxProxy(config);
		Map<String,String> groupMap = proxy.getGroupMap();
		logger.debug("GroupMap loaded with {} items", groupMap.keySet().size());
		for (Project p: proxy.getProjectList()) {
			logger.debug("------------{}-----------",p.getName());
			ScanTotals st = proxy.getScanTotals(p.getLastScanId());
			String teamName = getLastItem(groupMap.get(p.getOwningTeamId()),"\\\\");
			ReportRecord rec = new ReportRecord(
					p.getId(),p.getName(),p.getLastScanId(),p.getOwningTeamId(), groupMap.get(p.getOwningTeamId()),
					teamName, st.getTotal(), st.getToVerify(),st.getNotExploitable(),st.getConfirmed(),st.getUrgent(),st.getProposedNotExploitable()
					);
			recs.add(rec);
		}
		outputCsv(recs,config.getReportFile());
		logger.info("Total records written: {}",recs.size());
	}
	
	private ReportConfig getConfiguration(String[] args) {
		ReportConfig config;
		try {
			CLIParser cliParser = new CLIParser();
			config = cliParser.parse(args);
			logger.debug("Config complete. Server={} reportFile={}", config.getServer(), config.getReportFile());
			return config;
		} catch (CLIException e) {
			logger.error(e.getMessage());
			System.exit(1);
		}
		return null;
	}
	private String getLastItem(String input, String delim) {
		if (input == null) { return null; }
		String[] words = input.split(delim);
		return words[words.length -1];
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void outputCsv(List<ReportRecord> recs, String fileName) {
		logger.info("Writing {} records to report file: {}",recs.size(),fileName);
		Writer writer = null;
		try {
			writer = Files.newBufferedWriter(Paths.get(fileName));
			final OpenCSVMappingStrategy<ReportRecord> mappingStrategy = new OpenCSVMappingStrategy<>();
			mappingStrategy.setType(ReportRecord.class);
			StatefulBeanToCsv<ReportRecord> beanToCsv = new StatefulBeanToCsvBuilder(writer)
																	.withQuotechar('"')
																	.withMappingStrategy(mappingStrategy)
																	.build();
			beanToCsv.write(recs);
			writer.close();
		} catch (IOException e) {
			logger.error(e.getMessage());
		} catch (CsvDataTypeMismatchException e) {
			logger.error(e.getMessage());
		} catch (CsvRequiredFieldEmptyException e) {
			logger.error(e.getMessage());
		}
	}
	
	
	
}
