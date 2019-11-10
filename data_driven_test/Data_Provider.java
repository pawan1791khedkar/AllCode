package data_driven_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider="parabankdata")
public class Data_Provider
{
	public static WebDriver driver;
	@Test(dataProvider="para_login")
	public void login (String Username, String Password)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input")).click();
	
	//driver.quit();
		}
		

	@DataProvider(name="para_login")
	public Object [][] para_login() throws Exception 
	{
		
	Object data[][]=Utility.getData();
		
	return data;
	}
	}



			

