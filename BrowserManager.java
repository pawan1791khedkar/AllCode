package com.Core;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class BrowserManager 

{// implements ILogAndReport {
	
	//final Logger logger = Logger.getLogger(BrowserManager.class);

	public WebDriver GetBrowser(String _sBrowserName) throws IOException{
		String CHROME_DRIVER_EXE_PATH = Config.FetchConfigData("CHROME_DRIVER_EXE_PATH");
		String FIREFOX_DRIVER_EXE_PATH = Config.FetchConfigData("FIREFOX_DRIVER_EXE_PATH");
		
		WebDriver driver= null;
		
		switch(_sBrowserName.toLowerCase()){
		case "chrome" :
			
			if (System.getProperty("os.name").equals("Mac OS X"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
			}
			else
			{
				System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_EXE_PATH);
			}  
			
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", FIREFOX_DRIVER_EXE_PATH);
			driver = new FirefoxDriver();
			break;
		}
		
		driver.manage().timeouts().implicitlyWait(Config.TIME_OUT_MAX, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//WriteLogAndReport(logger, "info", "pass", "Browser Invoked. Type: " + _sBrowserName );
		CmnMethods.WriteLog("info","Get Browser");
		return driver;
	}//end method
	
	public boolean NavigateToPage(WebDriver driver, String url)
	{
		CmnMethods.WriteLog("info","Navigating to URL: " + url);
		String oldUrl = driver.getCurrentUrl();
		driver.navigate().to(url);
		String newURL = driver.getCurrentUrl();
		Assert.assertNotEquals(oldUrl, newURL,"oldURL matched with new URL indicating page did not navaigate succesfully.");
		if (!(oldUrl.equalsIgnoreCase(newURL))){
			CmnMethods.WriteLog("pass","Navigation to URL Successfull.");
		}
		else 
		{
			CmnMethods.WriteLog("fail", "Navigation to URL Failed. " + url);
		}
		
		//WriteLogAndReport(logger, "info", "pass", "Navigation to Url successfull : " + url);
		return true;
	}//end method
	
	
}//end class

