package ParabankTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightClass
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


	WebElement txt_username=driver.findElement(By.name("username"));
	txt_username.sendKeys("john");
	Highlighter.Highlight(driver, txt_username);
	WebElement txt_password=driver.findElement(By.name("password"));
	txt_password.sendKeys("demo");
	Highlighter.Highlight(driver, txt_password);
	WebElement btn_submit=driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input"));
	btn_submit.click();
}
	
}