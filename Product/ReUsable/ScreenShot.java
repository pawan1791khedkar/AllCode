package com.Product.ReUsable;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot
{	
	public static void getscreenshot(WebDriver driver,String name) 
	{
		TakesScreenshot shot=(TakesScreenshot)driver;
		File src=shot.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\eclipse workspace\\Automation_Framework\\src\\com\\Product\\screenshotPics   "+name+".png");
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


