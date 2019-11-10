package ParabankTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Page_Object_Module 
{
	WebDriver driver;
	public Page_Object_Module(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Log_In()
	{
		By txt_username=By.name("username");
		driver.findElement(txt_username).sendKeys("john");
		By txt_password=By.name("password");
		driver.findElement(txt_password).sendKeys("demo");
		By txt_btn=By.xpath("//*[@id='loginPanel']/form/div[3]/input");
		driver.findElement(txt_btn).click();
	}
	
	
	}
	
	

