package ParabankTestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountTable
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.name("username")).sendKeys("john");
	driver.findElement(By.name("password")).sendKeys("demo");

	driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input")).click();
	
	driver.findElement(By.linkText("Accounts Overview")).click();
	
	 WebElement Account= driver.findElement(By.linkText("Accounts Overview"));
	Account.click();
	
}
}
		