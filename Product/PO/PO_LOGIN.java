package com.Product.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class PO_LOGIN 
{
	WebDriver driver;
	public PO_LOGIN(WebDriver driver)
	{
		this.driver=driver;
}
	@FindBy(how=How.XPATH,using="//span[@class='hidden-phone']")
	WebElement My_Account;
	@FindBy(how=How.XPATH,using="//a[@data-ca-target-id='login_block4']")
	WebElement Sign_in;
	@FindBy(how=How.ID,using="login_popup4")
	WebElement Username;
	@FindBy(how=How.ID,using="psw_popup4")
	WebElement Password;
	@FindBy(how=How.XPATH,using="//button[@name='dispatch[auth.login]']")
	WebElement Sign_In_Log;
	@FindBy(how=How.XPATH,using="//span[@class='hidden-phone']")
	WebElement My_Account_Log;
	@FindBy(how=How.XPATH,using="//a[@class='ty-btn ty-btn__primary']")
	WebElement Sign_out;
	

	public void My_Account() 
	{
		My_Account.click();
		}
	public void Sign_in()
	{
		Sign_in.click();
		}
	public void Username()
	{
		Username.clear();
		Username.sendKeys("customer@example.com");
	}

	public void Password()
	{
		Password.clear();
		Password.sendKeys("customer");
	}
	public void Sign_In_Log()
	{
		Sign_In_Log.click();
	}
	public void My_Account_Log()
	{
		My_Account_Log.click();
	}
	public void Sign_out()
	{
		Sign_out.click();

	}
	
}
