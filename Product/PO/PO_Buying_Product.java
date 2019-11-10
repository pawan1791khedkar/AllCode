package com.Product.PO;


import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PO_Buying_Product 
{
	WebDriver driver;
	public PO_Buying_Product(WebDriver driver)
	{
		this.driver=driver;
	}
	/*@FindBy(how=How.XPATH,using="//span[@class='hidden-phone']")
	WebElement My_Account;
	@FindBy(how=How.XPATH,using="//a[@data-ca-target-id='login_block4']")
	WebElement Sign_in;
	@FindBy(how=How.ID,using="login_popup4")
	WebElement Username;
	@FindBy(how=How.ID,using="psw_popup4")
	WebElement Password;
	@FindBy(how=How.XPATH,using="//button[@name='dispatch[auth.login]']")
	WebElement Sign_In1;*/
	@FindBy(how=How.XPATH,using="//*[@id='tygh_main_container']/div[2]/div/div[2]/div/div/ul/li[3]/a[2]")
	WebElement Electronic;
	@FindBy(how=How.XPATH,using="//*[@id='slider_31_1']/span[1]")
	WebElement SliderA;
	@FindBy(how=How.XPATH,using="//*[@id='slider_31_1']/span[2]")
	WebElement SliderB;
	@FindBy(how=How.ID,using="det_img_60")
	WebElement AvicZ1;
	/*@FindBy(how=How.ID,using="button_cart_60")
	WebElement Addtocart;*/
	@FindBy(how=How.XPATH,using="//*[@id='opener_call_request_60']/span")
	WebElement OneClick;
	@FindBy(how=How.ID,using="call_data_call_request_60_name")
	WebElement name;
	@FindBy(how=How.ID,using="call_data_call_request_60_phone")
	WebElement phone;
	@FindBy(how=How.ID,using="call_data_call_request_60_email")
	WebElement email;
	@FindBy(how=How.XPATH,using="//button[@class='ty-btn__primary ty-btn__big cm-form-dialog-closer ty-btn ty-btn']")
	WebElement btn;
	
	/*public void My_Account() 
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
	*/
	public void Electronic()
	{
		Electronic.click();

	}
	public void SliderA()
	{
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(SliderA, 50, 0).build().perform();
		 SliderA.click();	 
		 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		}
	
	
	public void SliderB()
	{
		Actions action = new Actions(driver);
		action.dragAndDropBy(SliderB, -90, 0).build().perform();
		 SliderB.click();
		 try
		 {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		 {
			e.printStackTrace();
		}
	}
	 
		public void Avicz1()
		{

			AvicZ1.click();
}
	/*	public void Add()
		{
			Addtocart.click();
		
		}*/
		public void OneClick()
		{
			OneClick.click();

}
		public void Name()
		{
			name.sendKeys("pawan");
		}
		public void Phone()
		{
			phone.sendKeys("9579178117");
		}
		public void Email()
		{
			email.sendKeys("pawankhedkar");
		}
		public void Btn()
		{
			btn.click();
		}
		 }
		 