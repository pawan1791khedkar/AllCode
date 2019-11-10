package com.Product.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Check_Order 
{
	WebDriver driver;
	public PO_Check_Order(WebDriver driver)
	{
		this.driver=driver;
}
	@FindBy(how=How.XPATH,using="//span[@class='hidden-phone']")
	WebElement My_Account;
	@FindBy(how=How.XPATH,using="//*[@id='account_info_4']/ul/li[1]/a")
	WebElement Check_Order;
	@FindBy(how=How.ID,using="login_main_login")
	WebElement Username;
	@FindBy(how=How.ID,using="psw_main_login")
	WebElement Password;
	@FindBy(how=How.XPATH,using="//*[@id='tygh_main_container']/div[3]/div/div[2]/div[1]/div/div/div/form/div[3]/div[1]/button")
	WebElement btn;
	
	public void My_Account()
	{
		My_Account.click();
	}
public void Check_Order()
{
	Check_Order.click();
}
public void Username()
{
	Username.clear();
	Username.sendKeys();
}
public void Password()
{
	Password.clear();
	Password.click();
}
public void btn()
{
	btn.click();
}
}