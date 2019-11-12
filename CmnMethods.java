package com.Core;

import com.relevantcodes.extentreports.LogStatus;

public class CmnMethods extends ReportingConfig
{
	public static void WriteLog(String logtype, String msg) 
	{
		 //TEST =  REPORTS.startTest();
		String stepName = Thread.currentThread().getStackTrace()[1].getMethodName();
		if (logtype.equalsIgnoreCase("pass")) 
		{
			TEST.log(LogStatus.PASS, msg);
		}
		else if (logtype.equalsIgnoreCase("fail"))
		{
			TEST.log(LogStatus.FAIL, msg);
		}
		else if (logtype.equalsIgnoreCase("warn")) 
		{
			TEST.log(LogStatus.WARNING, msg);
		}
		
		System.out.println(logtype+ " " + msg);
	}
	


	
}

