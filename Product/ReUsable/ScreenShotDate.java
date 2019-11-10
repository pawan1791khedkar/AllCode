package com.Product.ReUsable;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotDate
{
	public static void getscreenshot(WebDriver driver,String name) 
	{
		TakesScreenshot shot=(TakesScreenshot)driver;
		File src=shot.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\eclipse workspace\\Automation_Framework\\src\\com\\Product\\screenshotPics"+timetamp()+".png");
		try
		{
			FileUtils.copyFile(src, dest);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
		public static String timetamp()
		{
			return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		}
	}
	




