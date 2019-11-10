package com.Product.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PO_REGISTER 
{
	WebDriver driver;
	public PO_REGISTER(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//div[@class='ty-dropdown-box__title cm-combination unlogged']")
	WebElement My_Account;
	@FindBy(how=How.XPATH,using="//a[@class='ty-btn ty-btn__primary']")
	WebElement Register;
	@FindBy(how=How.ID,using="email")
	WebElement Email;
	@FindBy(how=How.ID,using="password1")
	WebElement Password;
	@FindBy(how=How.ID,using="password2")
	WebElement Passconfirm;
	@FindBy(how=How.ID,using="birthday")
	WebElement Birthday;
	@FindBy(how=How.XPATH,using="//a[@class='ui-state-default']")
	WebElement Date;
	@FindBy(how=How.XPATH,using="//select[@class='ui-datepicker-month']")
	WebElement Month;
	@FindBy(how=How.XPATH,using="//select[@class='ui-datepicker-year']")
	WebElement Year;
	@FindBy(how=How.XPATH,using="//button[@class='ty-btn__secondary ty-btn']")
	WebElement btn;
	

	public void My_Account()
	{
		My_Account.click();
	}
	public void Register()
	{
		Register.click();
	}
	public void Email(String email)
	{
		Email.sendKeys(email);
}
	public void Password(String pass)
	{
		Password.sendKeys(pass);
	}
	public void Passconfirm(String passconf)
	{
		Passconfirm.sendKeys(passconf);
	}
	public void Birthday()
	{
		Birthday.click();
	}
	public void Date()
	{
		Date.click();
	}
	public void Month()
	{
		Select mon=new Select(Month);
	 	mon.selectByVisibleText("Apr");
	 	Month.click();
	}
	
	public void Year()
	{
		Select yer=new Select(Year);
	 	yer.selectByVisibleText("1995");
	 	Year.click();
	}
	
	public void btn()
	{
		btn.click();
	}	
	
	}

