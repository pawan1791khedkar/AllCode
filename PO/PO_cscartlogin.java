package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_cscartlogin 
{
WebDriver driver;
	
	public PO_cscartlogin(WebDriver driver) 
	{
		this.driver = driver;
	}
	@FindBy(how = How.XPATH,using = "//span[@class='hidden-phone']")
	private WebElement My_account_link;
	
	@FindBy(how = How.XPATH,using = "//a[@class='cm-dialog-opener cm-dialog-auto-size ty-btn ty-btn__secondary']")
	private WebElement Sign_in_button;
	
	@FindBy(how = How.XPATH,using = "//input[@id='login_popup4']")
	private WebElement Enter_username;
	
	@FindBy(how = How.XPATH,using ="//input[@id='psw_popup4']")
	private WebElement Enter_password;

	@FindBy(how = How.XPATH,using ="//button[@class='ty-btn__login ty-btn__secondary ty-btn']")
	private WebElement click_on_signin;

	public void Click_on_My_account() 
	{
		Actions action=new Actions(driver);
		action.moveToElement(My_account_link).build().perform();
		My_account_link.click();
	}
	public void click_on_signin_button() 
	{
		Sign_in_button.click();
	}
	public void Enter_username(String user)
	{
		Enter_username.clear();
		Enter_username.sendKeys(user);
	}
	public void Enter_password(String pass)
	{
		Enter_password.clear();
		Enter_password.sendKeys(pass);
	}
	public void click_on_signin()
	{
		click_on_signin.click();
	}
	
}