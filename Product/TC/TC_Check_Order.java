package com.Product.TC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Product.PO.PO_Check_Order;


public class TC_Check_Order 
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
		Reporter.log(" default log run");
	}
	@Test
	public void tc_Order()
	{
		PO_Check_Order PO_Order =PageFactory.initElements(driver,PO_Check_Order.class);
		PO_Order.My_Account();
		PO_Order.Check_Order();
		PO_Order.btn();
	}
}