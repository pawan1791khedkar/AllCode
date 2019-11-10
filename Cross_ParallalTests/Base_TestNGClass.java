package Cross_ParallalTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_TestNGClass
{
	WebDriver driver;
	
	@BeforeClass
	public void SetUpClassLevel() {
		//System.setProperty("webdriver.IE.driver", "D:\\sachin\\IEDriverServer.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\sachin\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
	}
	
	@Parameters({"browser_name"})
	@BeforeMethod
	public void beforeMethod(String browser_name) 
	{
		if (browser_name.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
		}
		else if (browser_name.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		/*else if (browser_name.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}*/
 
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}