package com.Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Manager
{
	WebDriver driver;
	public WebDriver GetBrowser(String s)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.cs-cart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
}
}