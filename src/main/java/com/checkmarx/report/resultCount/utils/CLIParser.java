package com.checkmarx.report.resultCount.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CLIParser {
	private Options opts = new Options();
	
	public CLIParser() {
		Option cxUser = Option.builder("cxUser").desc("CxSAST User Name").hasArg().required(true).build();
		opts.addOption(cxUser);
		Option cxPassword = Option.builder("cxPassword").desc("CxSAST Password").hasArg().required(true).build();
		opts.addOption(cxPassword);
		Option server = Option.builder("server").desc("CxSAST Server Base URL").hasArg().required(true).build();
		opts.addOption(server);
		Option reportFile = Option.builder("file").desc("Report File Name").hasArg().required(true).build();
		opts.addOption(reportFile);
	}
	public ReportConfig parse(String[] args) throws CLIException {
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd;
		try {
			cmd = parser.parse(opts, args);
		} catch (ParseException e) {
			HelpFormatter formatter = new HelpFormatter();
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			pw.println(e.getMessage());
			formatter.printOptions(pw,80,opts,2,2);
			throw new CLIException(sw.toString());
		}
		
		ReportConfig config = new ReportConfig(
				cmd.getOptionValue("server"),
					cmd.getOptionValue("cxUser"),
					cmd.getOptionValue("cxPassword"),
					cmd.getOptionValue("file"));
		
		return config;
	}
	
}