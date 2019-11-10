package ScreenFailshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot
{	
	static WebDriver driver;
		public void initializetest()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		}
		public void failedtestscreenshot(String name)
		{
			
			TakesScreenshot shot=(TakesScreenshot)driver;
			File src=shot.getScreenshotAs(OutputType.FILE);
			File dest=new File("D:\\eclipse workspace\\Automation_Framework\\src\\com\\Product\\screenshotPics"+name+".png");
			try
			{
				FileUtils.copyFile(src, dest);
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}


