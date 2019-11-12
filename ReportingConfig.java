package com.Core;

import com.Product.ReUsable.DateAndTimeManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ReportingConfig
{
	public static ExtentReports REPORTS;
	public static ExtentTest TEST;
	
	
	public ReportingConfig() {
		//REPORTS=new ExtentReports("D:\\eclipse workspace\\ExtendReport\\ExtentTest.html");
		REPORTS =  new ExtentReports(Config.FW_ROOT + "D:\\eclipse workspace\\ExtendReport\\ExtentTest" + DateAndTimeManager.f_generate_time_based_unique_integer() + ".html");
		//REPORTS =  new ExtentReports(Config.FW_ROOT + "\\HighLevelLogs\\ExtentReport_" + DateAndTimeManager.f_generate_time_based_unique_integer() + ".html");
		
	}//end method
	
	
}//end class

