package ParabankTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginparabank
{
	WebDriver driver;
	public void ACT(){
		System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://parabank.parasoft.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='username']"));
		driver.findElement(By.xpath("//input[@type='password']"));
		driver.findElement(By.xpath("//input[@type='submit']"));
		
		

}
}