package com.atmecs.project.report;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.atmecs.project.constants.Constants;


/**
 * Which keeps track of the record when any event happens or any software run.
 * @author ranjitha.selvam
 *
 */
public class LoggerReportInfo {
	
		static Logger logger = null;

		public static void logReporter(String message) {
			PropertyConfigurator.configure(Constants.log_file);
			logger = Logger.getLogger(LoggerReportInfo.class.getName());
	        logger.info(message);
		}


}
