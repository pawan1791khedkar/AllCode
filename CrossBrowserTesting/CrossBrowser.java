package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser 
{
WebDriver driver;

@Test
@Parameters("browser")
public void VerifyTitle(String browserName) throws InterruptedException
{
	if(browserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "D:\\sachin\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("IE"))
	{
		System.setProperty("webdriver.IE.driver", "D:\\sachin\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	driver.get("http://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement txt_username=driver.findElement(By.name("username"));
	txt_username.sendKeys("john");
	WebElement txt_password=driver.findElement(By.name("password"));
	txt_password.sendKeys("demo");
	WebElement btn_submit=driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input"));
	btn_submit.click();
	WebElement Open_Account=driver.findElement(By.linkText("Open New Account"));
	Open_Account.click();
	Select B1 =new Select(driver.findElement(By.id("type")));
	B1.selectByVisibleText("SAVINGS");
	Select B2 =new Select(driver.findElement(By.id("fromAccountId")));
	B2.selectByValue("12678");
	Thread.sleep(5000);
	WebElement btn_submit2=driver.findElement(By.xpath("//input[@type='submit']"));
	btn_submit2.click();
}

}
