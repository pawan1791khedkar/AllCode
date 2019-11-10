package com.Product.TC;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.Core.BrowserManager;
import com.Core.CmnMethods;
import com.Core.ReportingConfig;
import com.Product.PO.POGoogleForm;
import com.Product.ReUsable.UtilityGoogleForm;
import com.relevantcodes.extentreports.LogStatus;

public class TCGoogleForm  extends ReportingConfig
{
	WebDriver driver;
	@Test()
	public void startbrowser() throws IOException
	{
		
			BrowserManager oBrowserManager = new BrowserManager();
			WebDriver driver = oBrowserManager.GetBrowser("chrome");

			//Navigate
			oBrowserManager.NavigateToPage(driver, "https://docs.google.com/forms/u/0/"); 	
		}
	@Test(dataProvider="googleformtest")
	public void FetchDataInGoogleForm (String question,String option1,String option2,String option3,String option4)throws Exception
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
		
			POGoogleForm  AddQuestionAnswer = PageFactory.initElements(driver, POGoogleForm.class);
			
			AddQuestionAnswer.Set_UserName("pawan1791cool@gmail.com");
			AddQuestionAnswer.ClickOnNext();
			AddQuestionAnswer.Set_Password("pk123456");
			AddQuestionAnswer.ClickOnNext1();
			AddQuestionAnswer.ClickOnBlankPage();
			AddQuestionAnswer.GiveTitle("My_Assesment");
			AddQuestionAnswer.TypeQuestion(question);
			AddQuestionAnswer.SelectOption1(option1);
			AddQuestionAnswer.AddOption2();
			AddQuestionAnswer.SelectOption2(option2);
			AddQuestionAnswer.AddOption3();
			AddQuestionAnswer.SelectOption3(option3);
			AddQuestionAnswer.AddOption4();
			AddQuestionAnswer.SelectOption4(option4);
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
@DataProvider(name="googleformtest")
public Object [][] GoogleFormTest() throws Exception
{

	Object data[][]=UtilityGoogleForm .getData();
	return data;
}

@AfterClass
public void CleanUp()
{
 REPORTS.flush();
}
}