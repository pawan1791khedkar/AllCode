package com.Product.TC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.Product.PO.PO_DataProvider;

public class TC_Data_Provider 
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

	@Test(priority=0,dataProvider="UserloginDataSet")
	public void tc1_login_validate_case_1(String DataUsername,String DataPassword) throws InterruptedException
	{
		PO_DataProvider Elect =PageFactory.initElements(driver,PO_DataProvider.class);
		
		Elect.My_Account();
		Elect.Sign_in();
		Elect.User(DataUsername);
		Elect.Pass(DataPassword);
		Elect.Sign_In1();
		
		{
		try 
		{
			try {
				Thread.sleep(2000);
		Elect.My_Account();
				
				
				
			} catch (Exception e)
			{
				//do nothing
			}
		} catch (Exception e)
		{
			driver.close();
		}
		}	 
		
		String Expected = "SIGN OUT";
		String Actual = driver.findElement(By.xpath("//*[@id=\"account_info_4\"]/div[2]/a")).getText();
		
		System.out.println(Actual);
		Assert.assertEquals(Actual, Expected);;
		Reporter.log("User is successfully login");
}
	@Test(priority=1,dataProvider="UserloginDataSet")
	public void tc1_login_validate_case_2(String DataUsername,String DataPassword) throws InterruptedException
	{	
		PO_DataProvider Elect = PageFactory.initElements(driver, PO_DataProvider.class);
		Elect.My_Account();
		Elect.Sign_in();
		Elect.User(DataUsername);
		Elect.Pass(DataPassword);
		Elect.Sign_In1();
	
		{
		try 
		{
			try {
				Thread.sleep(2000);
				Elect.My_Account();
				
				
				
			} catch (Exception e)
			{
				//do nothing
			}
		} catch (Exception e)
		{
			driver.close();
		}
		}	 
		
		String Expected = "ERROR";
		String Actual = driver.findElement(By.xpath("//*[@id=\"tygh_container\"]/div[3]/div/strong")).getText();
		
		System.out.println(Actual);
		Assert.assertEquals(Actual, Expected);;
		Reporter.log("Invalid User ID with right password is unable to login");
		
		
	}
	
	@Test(priority=2,dataProvider="UserloginDataSet")
	public void tc1_login_validate_case_3(String DataUsername,String DataPassword) throws InterruptedException
	{	
		PO_DataProvider Elect = PageFactory.initElements(driver, PO_DataProvider.class);
		Elect.My_Account();
		Elect.Sign_in();
		Elect.User(DataUsername);
		Elect.Pass(DataPassword);
		Elect.Sign_In1();
	
		{
		try 
		{
			try {
				Thread.sleep(2000);
				Elect.My_Account();
				
				
				
			} catch (Exception e)
			{
				//do nothing
			}
		} catch (Exception e)
		{
			driver.close();
		}
		}	 
		
		String Expected = "The username or password you have entered is invalid. Please try again.";
		String Actual = driver.findElement(By.xpath("//*[@id=\"tygh_container\"]/div[3]/div/text()")).getText();
		System.out.println(Actual);
		System.out.println(Actual);
		Assert.assertEquals(Actual, Expected);;
		Reporter.log("Valid ID with invalid password is unable to login");
	driver.quit();	
		
	}
	@Test
	@DataProvider(name="UserloginDataSet")
	public Object[][] passData()
	{
		Object[][] data=new Object[4][2];
		data[0][0]="customer@example.com";
		data[0][1]="customer";
		
		data[1][0]="custemer@data.com";
		data[1][1]="cotemar";
		
		data[2][0]="ips@shala.com";
		data[2][1]="tomerer";
		
		
		
		return data;
		
				
	}
	
}