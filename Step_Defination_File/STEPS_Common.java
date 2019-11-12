package Step_Defination_File;
import org.openqa.selenium.WebDriver;

import Managers.WebDriverManagerSingleton;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class STEPS_Common
{
	WebDriver driver;
	WebDriverManagerSingleton browserManager;
	Scenario scn ;

	@Before
	public void SetUp(Scenario s) 
	{
		this.scn = s;
	}
	@Given("^navigate to url as \"([^\"]*)\"$")
	public void navigate_to_url_as(String url) 
	{
		driver.get(url);
		scn.write("Navigated to URL: " + url);
	}	
	@Given("^as a user I launch application in \"([^\"]*)\"$")
	public void as_a_user_I_launch_application_in(String browser) 
	{
           if (browser.equalsIgnoreCase("chrome")) 
           {
			browserManager= WebDriverManagerSingleton.getInstanceOfWebDriverManager();
			driver = browserManager.getDriver();
			scn.write("Chrome Driver Invoked");
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", "E:\\_AkashStuff\\Automation\\dependencies\\gecko\\geckodriver.exe");
			//driver =  new FirefoxDriver();
		}
	}
	
	@Then("close the browser")
	public void close_the_browser()
	{
		// Write code here that turns the phrase above into concrete actions
		browserManager.CloseDriver();
		scn.write("Browser Closed");
	}
}
