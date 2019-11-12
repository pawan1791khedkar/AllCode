package Step_Defination_File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Defination_login 
{
	WebDriver driver;
	@Given("^user allready on login page$") 
	public void user_allready_on_login_page() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://parabank.parasoft.com");	
	}
	@When("^user enters username and password$")
	public void user_enters_username_and_password() 
	{
		WebElement txt_username=driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[1]/input"));
		txt_username.sendKeys("john");
		WebElement txt_password=driver.findElement(By.name("password"));
		txt_password.sendKeys("demo");
	}
	@Then("^user click on login button$")
	public void user_click_on_login_button() 
	{
		WebElement  loginbutton=driver.findElement(By.xpath("//input[@class='button']"));
		loginbutton.click();
		
	}
	
	@Given("^user is on homepage$")
	public void user_is_on_homepage() 
	{
		driver.findElement(By.xpath("//a[text()='Bill Pay']")).click();
	}
	@When("^payee name is enter$")
	public void payee_name_is_enter() 
	{
		driver.findElement(By.name("payee.name")).sendKeys("pawan");
	}	
	@And("^address of payee is enter$")
	public void address_of_payee_is_enter() 
	{
		driver.findElement(By.name("payee.address.street")).sendKeys("wagholi");
	}
	@And("^city of payee is enter$")
	public void city_of_payee_is_enter() 
	{
		driver.findElement(By.name("payee.address.city")).sendKeys("pune");
	}
	@And("^state of payee is enter$")
	public void state_of_payee_is_enter() 
	{ 
		driver.findElement(By.name("payee.address.state")).sendKeys("mharashtra");
	}
	@And("^zipcode of payee is enter$")
	public void zipcode_of_payee_is_enter() 
	{
		driver.findElement(By.name("payee.address.zipCode")).sendKeys("444303");
	}
	@And("^phone no of payee is enter$")
	public void phone_no_of_payee_is_enter() 
	{
		driver.findElement(By.name("payee.phoneNumber")).sendKeys("9579178117");
	}
	@And("^account no of payee is enter$")
	public void account_no_of_payee_is_enter() 
	{
		driver.findElement(By.name("payee.accountNumber")).sendKeys("95785425254");
	}
	@And("^verify account of payee is enter$")
	public void verify_account_of_payee_is_enter() 
	{
		driver.findElement(By.name("verifyAccount")).sendKeys("95785425254");
	}
	@And("^amount of payee is enter$")
	public void amount_of_payee_is_enter() 
	{
		driver.findElement(By.name("amount")).sendKeys("2000");
	}
	@And("^select From account$")
	public void select_From_account() 
	{
		Select sel=new Select(driver.findElement(By.name("fromAccountId")));
		sel.selectByValue("12456");

	}
	@Then("^user click on send payment$")
	public void user_click_send_payment() 
	{
		driver.findElement(By.xpath("//input[@class='button']")).click();
	}
	@Given("^user click on TransFund page$")
	public void user_click_on_TransFund_page()
	{
		driver.findElement(By.linkText("Transfer Funds")).click();
	}
	@When("^user select from account$")
	public void user_select_from_account()
	{
		Select sel=new Select(driver.findElement(By.id("fromAccountId")));
		sel.selectByValue("12567");
	}
	@And("^user select to account$")
	public void user_select_to_account()
	{
		Select sel=new Select(driver.findElement(By.id("toAccountId")));
		sel.selectByValue("12678");
	}
	@Then("^user click on Transfer$")
	public void user_click_on_Transfer()
	{
	driver.findElement(By.id("user click on Transfer")).click();
	}
	@Given("^user click on find transaction$")
	public void user_click_on_find_transaction() 
	{
		driver.findElement(By.linkText("Find Transactions")).click();
	}
	@When("^user enter amount$")
	public void user_enter_amount()
	{
	driver.findElement(By.id("amount")).sendKeys("2000");
	}
	@And("^user select account Id$")
	public void user_select_account_Id()
	{
		Select sel=new Select(driver.findElement(By.id("accountId")));
		sel.selectByValue("12567");
	}
	@And("^user is enter Transaction Id$")
	public void user_is_enter_Transaction_Id()
	{
		driver.findElement(By.id("criteria.transactionId")).sendKeys("12563");
	}
	@Then("^user click on Find Transaction Id$")
	public void user_click_on_Find_Transaction_Id()
	{
		driver.findElement(By.xpath("//*[@id='rightPanel']/div/div/form/div[3]/button")).click();
	}
	@And("^user is enter Find by date$")
	public void user_is_enter_Find_by_date()
	{
		driver.findElement(By.id("criteria.onDate")).sendKeys("25-06-2018");
	}
	@Then("^user click on Find Transaction date$")
	public void user_click_on_Find_Transaction_date()
	{
		driver.findElement(By.xpath("//*[@id='rightPanel']/div/div/form/div[5]/button")).click();
	}
	@And("^user is enter Find by date range from date$")
	public void user_is_enter_Find_by_date_range_from_date()
	{
		driver.findElement(By.id("criteria.fromDate")).sendKeys("12-05-2018");
	}
	@And("^user is enter Find by date range to date$")
	public void user_is_enter_Find_by_date_range_to_date()
	{
		driver.findElement(By.id("criteria.toDate")).sendKeys("12-06-2018");
	}
	@Then("^user click on Find Transaction date range$")
	public void user_click_on_Find_Transaction_date_range()
	{
		driver.findElement(By.xpath("//button[@ng-click='criteria.searchType = 'DATE_RANGE'']")).click();
	}
	@And("^user is enter Find by amount$")
	public void user_is_enter_Find_by_amount()
	{
		driver.findElement(By.id("criteria.amount")).sendKeys("20000");
	}
	@Then("^user click on Find Transaction amount$")
	public void user_click_on_Find_Transaction_amount()
	{
		driver.findElement(By.xpath("//button[@ng-click='criteria.searchType = 'AMOUNT'']")).click();
	}
}


