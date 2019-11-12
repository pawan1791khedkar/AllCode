package Parabank.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import core.utils.Utils;

public class PO_login
{
	WebDriver driver;
	public PO_login(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.NAME,using="username")
	private WebElement textbx_username;

	@FindBy(how=How.NAME,using="password")
	private WebElement textbx_password;

	@FindBy(how=How.XPATH,using="//input[@class='button']")
	private WebElement login_button;
	//reusable method under try catch
	public void setUername(String user)
	{
		try
		{
			textbx_username.sendKeys(user);
			Utils.WriteLogs("info","Username set with value as : " + user + " Invoke from method:"
					+ Thread.currentThread().getStackTrace()[1].getMethodName());
		}
		catch(Exception e)
		{
			e.getMessage();
			Utils.WriteLogs("fail","Unable to set user name with value as : user. "
					+ "Run time exception thrown. Exception: " + e.toString());
		}
	}
	public void setPassword(String pass)
	{
		try
		{
			textbx_password.sendKeys(pass);
			Utils.WriteLogs("pass","Password set with value as : " + pass);
		}
		catch(Exception e)
		{
			e.getMessage();
			Utils.WriteLogs("fail","Unable to set Password with value as : pass. "
					+ "Run time exception thrown. Exception: " + e.toString());
		}
	}
	public void click_on_sign_in_button()
	{
		try
		{
			login_button.click();
			Utils.WriteLogs("info","Clicked on Submit Button");

		}
		catch(Exception e)
		{
			e.getMessage();
			Utils.WriteLogs("fail","Unable to Click on Submit Button. "
					+ "Run time exception thrown. Exception: " + e.toString());	
		}

	}
	public void KW_login_into_application(String user, String pass)
	{
		try
		{
			setUername(user);
			setPassword(pass);
			click_on_sign_in_button();
			Utils.WriteLogs("pass","User name and password Set and Submit Button Clicked.");
			String expected="ParaBank | Welcome | Online Banking";
			String actual=driver.getTitle();
			Assert.assertEquals(expected, actual);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to Login in to the Application "
					+ "Run time exception thrown. Exception: " + e.toString());	
		}
		
		
	}

}
