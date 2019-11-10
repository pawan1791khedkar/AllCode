package Extend;



import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtendReport1 
{
	@Test
	public void f1()
	{
		ExtentReports report = new ExtentReports("D:\\eclipse workspace\\ExtendReport\\ExtentTest.html");
		ExtentTest test=report.startTest("my first test case");
		test.log(LogStatus.PASS,"Test Pass");
		report.endTest(test);
		report.flush();
}
	@Test
	public void f2()
	{
		ExtentReports report = new ExtentReports("D:\\eclipse workspace\\ExtendReport\\ExtentTest.html");
		ExtentTest test=report.startTest("my second test case");
		test.log(LogStatus.PASS,"Test Pass1");
		report.endTest(test);
		report.flush();

}
}