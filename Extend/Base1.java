package Extend;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base1 
{
	public class NewTest2 extends Base
	{
		
		  ExtentReports reports;
		  ExtentTest test;
		  
		  @BeforeClass
		  public void startUp() {
			reports = new ExtentReports("D:\\eclipse workspace\\ExtendReport\\ExtentTest.html");
			//System.out.println(System.getProperty("user.dir") + "\\NewReport.html");
		  }
		  
		  @Test
		  public void f5() {

			 test =  reports.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			 test.log(LogStatus.PASS, "test passed");
			 reports.endTest(test);

		  }
		  
		  
		 @Test
		  public void f6() {
				 test =  reports.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
				 test.log(LogStatus.PASS, "test passed");
				 reports.endTest(test);
				
		  }
		  
		 @Test
		  public void f7() {
				 test =  reports.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
				 test.log(LogStatus.PASS, "test passed");
				 reports.endTest(test);
			
		  }	 
		  
		  @Test
		  public void f8() {
				 test =  reports.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
				
				 test.log(LogStatus.FAIL,  test.addScreenCapture("E:\\pan.png") + "test fail");
				 reports.endTest(test);
				 
				 
		  }
		  
		  @AfterClass
		  public void AfterTest() {
			  reports.flush();
		  }
		  
		  
		  
		}
}
