package com.Product.TC;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Driver.Browser_Manager;
import com.Product.PO.PO_LOGIN;
import com.Product.PO.PO_MegaMenu;

public class TC_MegaMenu 
{
	
	@Test
	public void tc_Mega()
	{
		try
		{
		Browser_Manager Browser=new Browser_Manager();
		WebDriver driver=Browser.GetBrowser("Chrome");
		PO_LOGIN Login_Main1 =PageFactory.initElements(driver, PO_LOGIN.class);
		PO_MegaMenu mega=PageFactory.initElements(driver, PO_MegaMenu.class);
		Login_Main1.My_Account();
		Login_Main1.Sign_in();
		Login_Main1.Username();
		Login_Main1.Password();
		Login_Main1.Sign_In_Log();
		mega.Electrical();
		String Act_Menu="Shopping Cart Software & Ecommerce Software Solutions by CS-Cart";
		String Exp_Menu=driver.getTitle();
		SoftAssert Assert=new SoftAssert();
		Assert.assertEquals(Act_Menu, Exp_Menu);
		Reporter.log("Electrical menu is working properly");
		System.out.println("Electrical properly working");
		}
		catch (Exception e) 
		{
			Assert.fail("TC fail due to exception");	
		}
	}
	@Test
	public void tc_Mega1()
	{
	try
	{
		Browser_Manager Browser=new Browser_Manager();
		WebDriver driver=Browser.GetBrowser("Chrome");
		PO_MegaMenu mega=PageFactory.initElements(driver, PO_MegaMenu.class);
		PO_LOGIN Login_Main1 =PageFactory.initElements(driver, PO_LOGIN.class);
		Login_Main1.My_Account();
		Login_Main1.Sign_in();
		Login_Main1.Username();
		Login_Main1.Password();
		Login_Main1.Sign_In_Log();
		mega.Apprel();
		String Act_Menu="Shopping Cart Software & Ecommerce Software Solutions by CS-Cart";
		String Exp_Menu=driver.getTitle();
		SoftAssert Assert=new SoftAssert();
		Assert.assertEquals(Act_Menu, Exp_Menu);
		Reporter.log("Apprel menu is working properly");
		System.out.println("Apprel properly working");
	}
	catch (Exception e) {
		Assert.fail("TC fail due to exception");
	}
	}
		
		@Test
		public void tc_Mega2()
		{
			Browser_Manager Browser=new Browser_Manager();
			WebDriver driver=Browser.GetBrowser("Chrome");
			PO_LOGIN Login_Main1 =PageFactory.initElements(driver, PO_LOGIN.class);
			PO_MegaMenu mega=PageFactory.initElements(driver, PO_MegaMenu.class);
			Login_Main1.My_Account();
			Login_Main1.Sign_in();
			Login_Main1.Username();
			Login_Main1.Password();
			Login_Main1.Sign_In_Log();
			mega.SportOutdoor();
			String Act_Menu="Shopping Cart Software & Ecommerce Software Solutions by CS-Cart";
			String Exp_Menu=driver.getTitle();
			SoftAssert Assert=new SoftAssert();
			Assert.assertEquals(Act_Menu, Exp_Menu);
			Reporter.log("SportOutdoor menu is working properly");
			System.out.println("SportOutdoor properly working");
		}
		
		@Test
		public void tc_Mega3()
		{
			Browser_Manager Browser=new Browser_Manager();
			WebDriver driver=Browser.GetBrowser("Chrome");
			PO_LOGIN Login_Main1 =PageFactory.initElements(driver, PO_LOGIN.class);
			PO_MegaMenu mega=PageFactory.initElements(driver, PO_MegaMenu.class);
			Login_Main1.My_Account();
			Login_Main1.Sign_in();
			Login_Main1.Username();
			Login_Main1.Password();
			Login_Main1.Sign_In_Log();
			mega.OfficeSupplies();
			String Act_Menu="Shopping Cart Software & Ecommerce Software Solutions by CS-Cart";
			String Exp_Menu=driver.getTitle();
			SoftAssert Assert=new SoftAssert();
			Assert.assertEquals(Act_Menu, Exp_Menu);
			Reporter.log("OfficeSupplies menu is working properly");
			System.out.println("OfficeSupplies properly working");
	}
		@Test
		public void tc_Mega4()
		{
			Browser_Manager Browser=new Browser_Manager();
			WebDriver driver=Browser.GetBrowser("Chrome");
			PO_LOGIN Login_Main1 =PageFactory.initElements(driver, PO_LOGIN.class);
			PO_MegaMenu mega=PageFactory.initElements(driver, PO_MegaMenu.class);
			Login_Main1.My_Account();
			Login_Main1.Sign_in();
			Login_Main1.Username();
			Login_Main1.Password();
			Login_Main1.Sign_In_Log();
			mega.brand();
			String Act_Menu="Shopping Cart Software & Ecommerce Software Solutions by CS-Cart";
			String Exp_Menu=driver.getTitle();
			SoftAssert Assert=new SoftAssert();
			Assert.assertEquals(Act_Menu, Exp_Menu);
			Reporter.log("Brand menu is working properly");
			System.out.println("Brand properly working");
		}
	@AfterMethod
	public void aftermethod()
	{
		Browser_Manager Browser=new Browser_Manager();
		WebDriver driver=Browser.GetBrowser("Chrome");
		driver.close();
}
}