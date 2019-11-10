package com.Product.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_DataProvider 
{
	WebDriver driver;
	/*public PO_DataProvider(WebDriver driver)
	{
		this.driver=driver;
	}*/
	@FindBy(how=How.XPATH,using="//span[@class='hidden-phone']")
	WebElement My_Account;
	@FindBy(how=How.XPATH,using="//a[@data-ca-target-id='login_block4']")
	WebElement Sign_in;
	@FindBy(how=How.ID,using="login_popup4")
	WebElement Username1;
	@FindBy(how=How.ID,using="psw_popup4")
	WebElement Password1;
	@FindBy(how=How.XPATH,using="//button[@name='dispatch[auth.login]']")
	WebElement Sign_In1;

public void My_Account() 
{
	My_Account.click();
	}
public void Sign_in()
{
	Sign_in.click();
	}

public void User(String Username)
{
	Username1.clear();
	Username1.sendKeys(Username);
}
public void Pass(String Password)
{
	Password1.clear();
	Password1.sendKeys(Password);
}

public void Sign_In1()
{
	Sign_In1.click();

}
}