package Step_Defination_File;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Managers.WebDriverManagerSingleton;
import PO.PO_Header;
import PO.PO_Search;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class STEPS_CsCartHomeSearch 
{
	WebDriverManagerSingleton browserManager = WebDriverManagerSingleton.getInstanceOfWebDriverManager();
	WebDriver driver = browserManager.getDriver();
	PO_Header po_header=PageFactory.initElements(driver, PO_Header.class);
	PO_Search po_search=PageFactory.initElements(driver, PO_Search.class);
	Scenario scn ;

	@Before
	public void SetUp(Scenario s) 
	{
		this.scn = s;
	}
	
	@When("I enter \"(.*)\" in top search box")
	public void i_enter_product_in_top_search_box(String productname)
	{
	  po_header.SetSearchBox(productname);
	  scn.write("Product entered in the Search box: " + productname);
		
	}

	@When("click on search submit button")
	public void click_on_search_submit_button() {
		  po_header.ClickSearchSumitButton();
		  scn.write("Clicked on Search Button");	  
	}

	@Then("page navigates to product search results")
	public void page_navigates_to_product_search_results() {
		String expected = "Search results";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
		scn.write("validation of the page title is successfull");
	}

	@Then("proudct results are displayed")
	public void proudct_results_are_displayed()
	{
		scn.write("validating the Search results");
		po_search.validate_search_results();
		scn.write("validation of the Search results is successfull");
	}
}
