package ParabankTestCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabledata
{
public static void main(String[]args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("john");
	driver.findElement(By.name("password")).sendKeys("demo");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//a[text()='Accounts Overview']")).click();
	
	for(WebElement table:driver.findElements(By.xpath("// table[@id='accountTable']//td[@class='ng-binding'][2]")))
	{
		System.out.println(table.getText());
	}
}
}	


