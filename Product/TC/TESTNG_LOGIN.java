package com.Product.TC;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Driver.Browser_Manager;
import com.Product.PO.PO_LOGIN;


public class TESTNG_LOGIN 
{
	
	@Test
	public void tc_Log()
	{
		try
		{
		Browser_Manager Browser=new Browser_Manager();
		WebDriver driver=Browser.GetBrowser("Chrome");
		PO_LOGIN Login_Main1 =PageFactory.initElements(driver, PO_LOGIN.class);
		Login_Main1.My_Account();
		Login_Main1.Sign_in();
		Login_Main1.Username();
		Login_Main1.Password();
		Login_Main1.Sign_In_Log();
		Login_Main1.My_Account_Log();
		Login_Main1.Sign_out();
		}
		catch (Exception e) 
		{
		Assert.fail("TC fail due to exception");	
		}
		
	
}
}
