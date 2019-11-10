package com.Product.ReUsable;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer
{
	int counter=0;
	int totalLimit=1;

	public boolean retry(ITestResult iTestResult) 
	{
		if(!iTestResult.isSuccess())
		{
	if(counter<=totalLimit)
	{
		counter++;
		iTestResult.setStatus(ITestResult.FAILURE);
		
		return true;
	}
	 else 
	{
		iTestResult.setStatus(ITestResult.SUCCESS);
	}
		}
	
		return false;
}
}
