package com.Product.TC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.Product.PO.PO_ScreenShot1;
import com.Product.ReUsable.ScreenShot;

public class Tc_ScreenShot
{
	WebDriver driver;

	@BeforeMethod
	public void beforemethod()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.cs-cart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void tc_Electr()
	{
		PO_ScreenShot1 Elect =PageFactory.initElements(driver, PO_ScreenShot1.class);
		Elect.My_Account();
		Elect.Sign_in();
		Elect.Username();
		Elect.Password();
		Elect.Sign_In1();
		ScreenShot.getscreenshot(driver, "Login");
		Elect.Electronic();
		Elect.Desktop();
		//Elect.shot();
		ScreenShot.getscreenshot(driver, "capture");
		
		
}
}