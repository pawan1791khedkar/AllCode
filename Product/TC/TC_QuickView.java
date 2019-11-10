package com.Product.TC;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.Core.BrowserManager;
import com.Core.CmnMethods;
import com.Core.ReportingConfig;
import com.Product.PO.PO_QuickView;
import com.relevantcodes.extentreports.LogStatus;



public class TC_QuickView extends  ReportingConfig
{
	@Test(groups="smoke",description="Smoke Test For Login",enabled=true)
	public void tc1_Quickview()
	{ 
	{
		try 
		{
			
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
			
			PO_QuickView  Tc_View =PageFactory.initElements(driver, PO_QuickView .class);
			Tc_View.Search_Box("computer");
			Tc_View.Submit_Btn();
			Tc_View.QuickView();
			Tc_View.Click_Increase_Btn();
			Tc_View.Click_Decrease_Btn();
			Tc_View.Click_Next_Btn();
			Tc_View.Click_Privious_Btn();
			Tc_View.Add_to_Cart_Btn();

		}
		catch(Exception e) 
		{
			CmnMethods.WriteLog("fail", "Test Failed due to exception. " + e.getMessage());
		}

		//************************************************************************
		//**********************Clean Up******************************************
		//************************************************************************
		REPORTS.endTest(TEST);


	}//end method
	
	}


@AfterClass
public void CleanUp()
{

	REPORTS.flush();
	
}


}//end Class


