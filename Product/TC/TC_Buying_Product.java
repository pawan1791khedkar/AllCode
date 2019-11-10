package com.Product.TC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Product.PO.PO_Buying_Product;
import com.Product.PO.PO_LOGIN;

public class TC_Buying_Product
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
		PO_LOGIN login=PageFactory.initElements(driver, PO_LOGIN.class);
		
		PO_Buying_Product Elect =PageFactory.initElements(driver, PO_Buying_Product.class);
		login.My_Account();
		login.Sign_in();
		login.Username();
		login.Password();
		login.Sign_In_Log();
		Elect.Electronic();
		Elect.SliderA();
		Elect.SliderB();
		Elect.Avicz1();
		/*Elect.Add();*/
		Elect.OneClick();
		Elect.Name();
		Elect.Phone();
		Elect.Email();
		Elect.Btn();	
}
}