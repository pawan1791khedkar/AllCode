package com.Product.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Core.UI_Manager;

public class PO_QuickView 
{
	WebDriver driver;
	UI_Manager PO_QuickView_UI_Manager = new UI_Manager();
	
	static WebDriverWait wait; //Creating WebDriverWait reference variable


	public  PO_QuickView(WebDriver QuickView)
	{
		this.driver=QuickView;
		
	}
	//address of Search_box
	@FindBy(how=How.XPATH,using="//input[@id='search_input']")
	private WebElement Search_Box;

	//Address of Submit_btn
	@FindBy(how=How.XPATH,using="//button[@class='ty-search-magnifier']")
	private WebElement Submit_Btn;

	//Address of QuickView
	@FindBy(how=How.XPATH,using="//a[@class='ty-btn ty-btn__secondary ty-btn__big cm-dialog-opener cm-dialog-auto-size' and @data-ca-view-id='217']")
	private WebElement QuickView;

	//Address of Click_Increase_Btn
	@FindBy(how=How.XPATH,using="//a[@class='cm-increase ty-value-changer__increase']")
	private WebElement Click_Increase_Btn;

	//Address of Click_Decrease_Btn
	@FindBy(how=How.XPATH,using="//a[@class='cm-decrease ty-value-changer__decrease']")
	private WebElement Click_Decrease_Btn;


	//Address of Click_Next_Btn
	@FindBy(how=How.XPATH,using="//i[@class='ty-product-switcher__icon ty-icon-right-circle']")
	private WebElement Click_Next_Btn;

	//Address of Click_Privious_Btn
	@FindBy(how=How.XPATH,using="//i[@class='ty-product-switcher__icon ty-icon-left-circle']")
	private  WebElement Click_Privious_Btn;

	//Address of Add_to_Cart_Btn
	@FindBy(how=How.XPATH,using="//button[@id='button_cart_ajax217']")
	private WebElement Add_to_Cart_Btn;

	//Address of Continue_Shopping_Btn
	@FindBy(how=How.XPATH,using="//a[@class='ty-btn ty-btn__secondary cm-notification-close']")
	private WebElement Continue_Shopping_Btn;

	
	public void Search_Box(String product)
	{
		PO_QuickView_UI_Manager.SetElementText(Search_Box,product);
	}
	public void Submit_Btn()
	{
		PO_QuickView_UI_Manager.ClickElement(Submit_Btn);
	}
	public void QuickView()
	{
		Actions Act=new Actions(driver);
		Act.moveToElement( QuickView).perform();
		PO_QuickView_UI_Manager.ClickElement(QuickView);
	}

	public void Click_Increase_Btn()
	{
		try {
			wait=new WebDriverWait(driver,5);

			wait.until(ExpectedConditions.visibilityOf(Click_Increase_Btn));

			PO_QuickView_UI_Manager.ClickElement(Click_Increase_Btn);


		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	public void Click_Decrease_Btn()
	{
		try {
			wait=new WebDriverWait(driver,5);

			wait.until(ExpectedConditions.visibilityOf( Click_Decrease_Btn));

			PO_QuickView_UI_Manager.ClickElement(Click_Decrease_Btn);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

	public void Click_Next_Btn()
	{  

		try
		{

			wait=new WebDriverWait(driver,50);


			wait.until(ExpectedConditions.visibilityOf(Click_Next_Btn));

			PO_QuickView_UI_Manager.ClickElement(Click_Next_Btn);


		} catch (Exception e)
		{
			e.printStackTrace();
		}


	}
	public void Click_Privious_Btn()
	{
		try
		{

			wait=new WebDriverWait(driver,5);


			wait.until(ExpectedConditions.visibilityOf(Click_Privious_Btn));

			PO_QuickView_UI_Manager.ClickElement(Click_Privious_Btn);


		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void Add_to_Cart_Btn()
	{

		try
		{
			wait=new WebDriverWait(driver,5);

			wait.until(ExpectedConditions.visibilityOf(Add_to_Cart_Btn));

			PO_QuickView_UI_Manager.ClickElement(Add_to_Cart_Btn);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	public void Continue_Shopping_Btn()
	{   			
		try 
		{
			// Inserting WebdriverWait with "driver" reference and timeout for 5 Seconds
			wait = new WebDriverWait(driver, 5);


			wait.until(ExpectedConditions.visibilityOf(Continue_Shopping_Btn));

			// clicking on WebElement
			PO_QuickView_UI_Manager.ClickElement(Click_Increase_Btn);

		}
		catch (Exception NoSuchElementException) 
		{
			NoSuchElementException.getMessage();
		}
	}


}



