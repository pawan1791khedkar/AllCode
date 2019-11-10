package com.Product.TC;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Product.PO.PO_REGISTER;
import com.Product.ReUsable.Properties_File;
import com.Product.ReUsable.ScreenShotDate;

public class TESTNG_REGISTER 
{
	WebDriver driver;

	@BeforeMethod
	public void beforemethod()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.get("https://demo.cs-cart.com");
		driver.get(Properties_File.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void Registration()
	{
		PO_REGISTER  LogIn_Page=PageFactory.initElements(driver, PO_REGISTER .class);
		LogIn_Page.My_Account();
		LogIn_Page.Register();
		LogIn_Page.Email(Properties_File.getProperty("Email"));
		LogIn_Page.Password(Properties_File.getProperty("Password"));
		LogIn_Page.Passconfirm(Properties_File.getProperty("Passconfirm"));
		LogIn_Page.Birthday();
		LogIn_Page.Date();
		LogIn_Page.Month();
		LogIn_Page.Year();
		ScreenShotDate.getscreenshot(driver,"data");
		LogIn_Page.btn();
}

}
