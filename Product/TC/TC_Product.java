package com.Product.TC;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Product.PO.PO_Product;


public class TC_Product
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
		PO_Product Elect =PageFactory.initElements(driver, PO_Product.class);
		Elect.My_Account();
		Elect.Sign_in();
		Elect.Username();
		Elect.Password();
		Elect.Sign_In1();
		Elect.Electronic();
		Elect.SliderA();
		Elect.SliderB();
		Elect.slider();
		Elect.ProfileDetail();
		Elect.Email();
		Elect.Password1();
		Elect.ConfirmPassword();
		Elect.birthday();
		Elect.FirstName();
		Elect.LastName();
		Elect.Phone();
		Elect.City();
		Elect.city();
		Elect.Country();
		Elect.State();
		Elect.ZipCode();
		Elect.Validate();
		Elect.Save();
	}
}