package com.Product.TC;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Core.BrowserManager;
import com.Core.CmnMethods;
import com.Core.ReportingConfig;

import com.Product.PO.Po_Cscart_ProductType;
import com.Product.ReUsable.ScreenShot;
import com.relevantcodes.extentreports.LogStatus;


public class TC_Cscart_ProductType extends ReportingConfig
{
	 
	@Test(groups="smoke",description="Smoke Test For SearchBrand",enabled=true)
	public void tc1_SearchBrand()
	{
		try {
			
			//************************************************************************
			//**********************Init**********************************************
			//************************************************************************
			TEST =  REPORTS.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			TEST.log(LogStatus.INFO, "Test Started");

			//************************************************************************
			//**********************Steps**********************************************
			//************************************************************************
			BrowserManager oBrowserManager = new BrowserManager();
			WebDriver driver = oBrowserManager.GetBrowser("chrome");

			//Navigate
			oBrowserManager.NavigateToPage(driver, "https://demo.cs-cart.com"); 
			Po_Cscart_ProductType PO_Brand = PageFactory.initElements(driver, Po_Cscart_ProductType.class);
			
			PO_Brand.Search_Computer("computer");
			PO_Brand.Click_On_Computer();
			PO_Brand.Click_on_Brand();
			PO_Brand.ClickOn_Asus();
			//ScreenShot.getscreenshot(driver,"data");
			
		}
		catch(Exception e) 
		{
			CmnMethods.WriteLog("fail", "Test Failed due to exception. " + e.getMessage());
		}

		//************************************************************************
		//**********************Clean Up******************************************
		//************************************************************************
		REPORTS.endTest(TEST);


	}
	

	@Test(groups="smoke",description="Smoke Test For SearchPrice",enabled=true)
	public void tc2_SearchPrice()
	
	{
		try {
			
			//************************************************************************
			//**********************Init**********************************************
			//************************************************************************
			TEST =  REPORTS.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			TEST.log(LogStatus.INFO, "Test Started");

			//************************************************************************
			//**********************Steps**********************************************
			//************************************************************************
			BrowserManager oBrowserManager = new BrowserManager();
			WebDriver driver = oBrowserManager.GetBrowser("chrome");

			//Navigate
			oBrowserManager.NavigateToPage(driver, "https://demo.cs-cart.com"); 
			Po_Cscart_ProductType PO_Brand = new Po_Cscart_ProductType(driver);

			PO_Brand.Click_On_Computer();
			PO_Brand.Click_On_Price();
			PO_Brand.Pause();
			PO_Brand.SliderA();
			PO_Brand.SliderB();

			
		}
		catch(Exception e) 
		{
			CmnMethods.WriteLog("fail", "Test Failed due to exception. " + e.getMessage());
		}

		//************************************************************************
		//**********************Clean Up******************************************
		//************************************************************************
		REPORTS.endTest(TEST);

	}

	@Test(groups="smoke",description="Smoke Test For SearchOs",enabled=true)
	public void tc3_SearchOs() 
	
	{
		try {
			
			//************************************************************************
			//**********************Init**********************************************
			//************************************************************************
			TEST =  REPORTS.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			TEST.log(LogStatus.INFO, "Test Started");

			//************************************************************************
			//**********************Steps**********************************************
			//************************************************************************
			BrowserManager oBrowserManager = new BrowserManager();
			WebDriver driver = oBrowserManager.GetBrowser("chrome");

			//Navigate
			oBrowserManager.NavigateToPage(driver, "https://demo.cs-cart.com"); 
			Po_Cscart_ProductType PO_Brand = new Po_Cscart_ProductType(driver);
             
			PO_Brand. Click_On_Os();
			PO_Brand.Click_On_Android();
            //ScreenShot.getscreenshot(driver,"data2");
		
		}
		catch(Exception e) 
		{
			CmnMethods.WriteLog("fail", "Test Failed due to exception. " + e.getMessage());
		}

		//************************************************************************
		//**********************Clean Up******************************************
		//************************************************************************
		REPORTS.endTest(TEST);
	}
	
	
	
	@Test(groups="smoke",description="Smoke Test For SearchDisplay",enabled=true)
	public void tc4_SearchDisplay() {
		try {
			
			//************************************************************************
			//**********************Init**********************************************
			//************************************************************************
			TEST =  REPORTS.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			TEST.log(LogStatus.INFO, "Test Started");

			//************************************************************************
			//**********************Steps**********************************************
			//************************************************************************
			BrowserManager oBrowserManager = new BrowserManager();
			WebDriver driver = oBrowserManager.GetBrowser("chrome");

			//Navigate
			oBrowserManager.NavigateToPage(driver, "https://demo.cs-cart.com"); 
			
			Po_Cscart_ProductType PO_Brand = new Po_Cscart_ProductType(driver);
			PO_Brand.Click_On_Display();
            //ScreenShot.getscreenshot(driver,"data3");
		}
		catch(Exception e) 
		{
			CmnMethods.WriteLog("fail", "Test Failed due to exception. " + e.getMessage());
		}

		//************************************************************************
		//**********************Clean Up******************************************
		//************************************************************************
		REPORTS.endTest(TEST);
	}
	

	@Test(groups="smoke",description="Smoke Test For SearchStorageCapacity",enabled=true)
	public void tc5_SearchStorageCapacity() {
		try {
			
			//************************************************************************
			//**********************Init**********************************************
			//************************************************************************
			TEST =  REPORTS.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
			TEST.log(LogStatus.INFO, "Test Started");

			//************************************************************************
			//**********************Steps**********************************************
			//************************************************************************
			BrowserManager oBrowserManager = new BrowserManager();
			WebDriver driver = oBrowserManager.GetBrowser("chrome");

			//Navigate
			oBrowserManager.NavigateToPage(driver, "https://demo.cs-cart.com"); 
			Po_Cscart_ProductType PO_Brand = new Po_Cscart_ProductType(driver);
			PO_Brand.Click_On_StorageCapacity();	
			//ScreenShot.getscreenshot(driver,"data4");
		}
		catch(Exception e) 
		{
			CmnMethods.WriteLog("fail", "Test Failed due to exception. " + e.getMessage());
		}

		//************************************************************************
		//**********************Clean Up******************************************
		//************************************************************************
		REPORTS.endTest(TEST);
	}

	@AfterClass
	public void CleanUp()
	{

		REPORTS.flush();
		
	}
	
}
//end Class

/*@AfterMethod
public static void aftermethod(ITestResult result)
{
	if(ITestResult.FAILURE==result.getStatus());
	{
	try
	{
ScreenShot.getscreenshot(WebDriver driver,result.getName());
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	}
}*/


