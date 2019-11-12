package Step_Defination_File;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Managers.WebDriverManagerSingleton;
import PO.PO_cscartlogin;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefn_cscartlogin 
{
	WebDriverManagerSingleton browserManager = WebDriverManagerSingleton.getInstanceOfWebDriverManager();
	WebDriver driver = browserManager.getDriver();
	PO_cscartlogin po_login=PageFactory.initElements(driver,PO_cscartlogin.class);
	Scenario scn ;
	@Before
	public void SetUp(Scenario s) 
	{
		this.scn = s;
	}
	
	@When("I click on My account link at the top right")
	public void I_click_on_My_account_link_at_the_top_right() 
	{	
	    po_login.Click_on_My_account();
	}
	@And("click on Sign in button")
	public void and_click_on_Sign_in_button() 
	{	
		po_login.click_on_signin_button();
	}
	@When("^Enter username \"([^\"]*)\"$")
	public void Enter_username(String u)
	{
		po_login.Enter_username(u);
	}
	@When("^Enter password \"([^\"]*)\"$")
	public void Enetr_pasword(String p)
	{
		po_login.Enter_password(p);
	}
	@When("I click on sign in button")
	public void I_click_on_sign_in_button() 
	{
		po_login.click_on_signin();
	}

	@Then("I am logged in to the application")
	public void i_am_logged_in_to_the_application() 
	{
	   String actual="Shopping Cart Software & Ecommerce Software Solutions by CS-Cart";
	   String expected=driver.getTitle();
	   Assert.assertEquals(expected, actual);
	}
}
