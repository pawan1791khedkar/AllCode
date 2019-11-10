package com.Product.TC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Product.PO.PO_Product_Add;
import com.relevantcodes.extentreports.LogStatus;



public class TC_Product_Add extends Base
{
	WebDriver driver;

	@Test
	public void TC_Product()
	{
		PO_Product_Add Elect =PageFactory.initElements(driver, PO_Product_Add.class);
		test=reports.startTest("TC_Product");

		Elect.My_Account();
		 test.log(LogStatus.PASS, "My_Account");
		Elect.Sign_in();
		 test.log(LogStatus.PASS, "Sign_in");
		Elect.Username();
		 test.log(LogStatus.PASS, "Username");
		Elect.Password();
		 test.log(LogStatus.PASS, "Password");
		Elect.Sign_In1();
		 test.log(LogStatus.PASS, "Sign_In1");
		Elect.Electronic();
		 test.log(LogStatus.PASS, "Electronic");
		Elect.Desktop();
		 test.log(LogStatus.PASS, "Desktop");
		Elect.Acer();
		 test.log(LogStatus.PASS, "Acer");
		Elect.Add();
		 test.log(LogStatus.PASS, "Add");
		
		reports.endTest(test);
		reports.flush();
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.cs-cart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
}

