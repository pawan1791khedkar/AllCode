package com.Product.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_ScreenShot1 
{
	WebDriver driver;
	public PO_ScreenShot1 (WebDriver driver)
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
	WebElement Sign_In1;
	@FindBy(how=How.XPATH,using="//*[@id='tygh_main_container']/div[2]/div/div[2]/div/div/ul/li[3]/a[2]")
	WebElement Electronic;
	@FindBy(how=How.XPATH,using="//*[@id='category_products_11']/ul/li[1]/a/img")
	WebElement Desktop;
	/*@FindBy(how=How.XPATH,using="//*[@id='det_img_227']")
	WebElement shot;*/
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
	public void Sign_In1()
	{
		Sign_In1.click();
	
	}
	public void Electronic()
	{
		Electronic.click();

	}
	public void Desktop()
	{
		Desktop.click();

}
	
}