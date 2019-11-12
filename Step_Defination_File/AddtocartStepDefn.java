package Step_Defination_File;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Managers.WebDriverManagerSingleton;
import PO.PO_Addtocart;
import PO.PO_cscartlogin;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddtocartStepDefn
{
	
	WebDriverManagerSingleton browserManager = WebDriverManagerSingleton.getInstanceOfWebDriverManager();
	WebDriver driver = browserManager.getDriver();
	PO_cscartlogin po_login=PageFactory.initElements(driver,PO_cscartlogin.class);
	PO_Addtocart addtocart=PageFactory.initElements(driver,PO_Addtocart.class);
	Scenario scn ;
	@Before
	public void SetUp(Scenario s) 
	{
		this.scn = s;
	}
	@When("I enter /. in top search box")
	public void I_enter_computer_in_top_search_box(String c)
	{	
	  addtocart.SearchProductFromSearchTextBox(c);
	}
	@And("click on search submit button")
	public void click_on_search_submit_button() 
	{
		addtocart.Submit_TextBox_Btn();
	}

	@Then("page navigates to product search results")
	public void page_navigates_to_product_search_results() 
	{
		String expected = "Search results";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
		scn.write("validation of the page title is successfull");
	}

	@Then("product results are displayed")
	public void product_results_are_displayed() 
	{
		scn.write("validating the Search results");
		addtocart.validate_search_results();
		scn.write("validation of the Search results is successfull");
	}

	@When("I click on list view button")
	public void i_click_on_list_view_button()
	{	
		addtocart.Go_To_ListBox_For_Addtocart_Product();
	}

     @Then("products are displayed in list view")
	public void products_are_displayed_in_list_view() 
	{
 		scn.write("validating the computer Search results");
 		addtocart.validate_search_product_results();
 		scn.write("validation of the computer Search results is successfull");
	}

	@When("I click add to cart for product code H0217E3OE9")
	public void i_click_add_to_cart_for_product_code_H_0_2_1_7_E_3_O_E_9()
	{
		addtocart.Fetch_the_Code_Of_Asus();
	}

	@Then("^my cart is updated with product quantity as and correct total price$")
	public void my_cart_is_updated_with_product_quantity_1_as_and_correct_total_price() 
	{
	    
	}
}
