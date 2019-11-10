package ParabankTestCases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank_Logic 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\sachin\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement u_signup=driver.findElement(By.id("signin_button"));
		u_signup.click();
		
		WebElement u_name=driver.findElement(By.id("user_login"));
		u_name.sendKeys("username");
		
		WebElement u_password=driver.findElement(By.id("user_password"));
		u_password.sendKeys("password");
		
		WebElement u_login=driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/input"));
		
		u_login.click();
		
		String title_exp="Zero-Account Summary";
		
		String title_act="driver.gettitle()";
		
		if(title_exp.equals(title_act))
		{
			System.out.println("Expected Page is Displayed");
		}
		else
		{
			System.out.println("Expected Page is unreachable");
		}
//driver.quit();
	}
}
