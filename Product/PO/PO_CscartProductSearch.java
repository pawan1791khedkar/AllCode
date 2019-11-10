package com.Product.PO;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Core.UI_Manager;

public class PO_CscartProductSearch 
{
		WebDriver driver;
		
		UI_Manager PO_CscartProductSearch_UI_Manager = new UI_Manager();
		
		public PO_CscartProductSearch (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, PO_CscartProductSearch.class);
		}
		@FindBy(how=How.XPATH,using="//input[@type='text' and @id='search_input']")
		private WebElement Search_Computer_Option;

		@FindBy(how=How.XPATH,using="//button[@class='ty-search-magnifier']")
		private WebElement Submit_Serach_Option;
		
		@FindBy(how=How.XPATH,using="//a[@class='ty-sort-container__views-a cm-ajax active']")
		private WebElement Select_ListBox_For_Add_items_to_cart;
		
		@FindBy(how=How.XPATH,using= "//span[text()='H0217E3OE9']")
		private WebElement Select_Code_of_Asus;
		
		@FindBy(how=How.XPATH,using="//span[text()='610.99']")
		private WebElement Select_Price_of_Asus;
		
		@FindBy(how=How.XPATH,using="//a[@class='cm-increase ty-value-changer__increase']")
		private WebElement Increase_Quantity_of_Asus_Items;
		
		@FindBy(how=How.XPATH,using="//a[@class='cm-decrease ty-value-changer__decrease']")
		private WebElement Decrease_Quantity_of_Asus_Items;
		
		@FindBy(how=How.XPATH,using="//button[@id='button_cart_217']")
		private WebElement AddToCart_Asus_Item;
		
		
		public void SearchProductFromSearchTextBox(String product)
		{
			PO_CscartProductSearch_UI_Manager.SetElementText( Search_Computer_Option, product);
			
		}
		public void Submit_TextBox_Btn()
		{
			PO_CscartProductSearch_UI_Manager.ClickElement(Submit_Serach_Option);
			
			
		}
		public void Thread() throws InterruptedException
		{
		Thread.sleep(2000);	
		}
		
		public void Go_To_ListBox_For_Addtocart_Product()
		{
			PO_CscartProductSearch_UI_Manager.ClickElement(Select_ListBox_For_Add_items_to_cart);
		}
		public void Fetch_the_Code_Of_Asus(String code)
		{
			PO_CscartProductSearch_UI_Manager.SetElementText(Select_Code_of_Asus,code);
		}
		public void Fetch_the_Price_Of_Asus(String value)
		{
			PO_CscartProductSearch_UI_Manager.SetElementText(Select_Price_of_Asus,value);
		}
		
		public void Increase_Quantity_Of_Product()
		{
			try
		{
		 WebDriverWait wait = new WebDriverWait (driver, 15);
		 wait.until(ExpectedConditions.visibilityOf(Increase_Quantity_of_Asus_Items));
		 PO_CscartProductSearch_UI_Manager.ClickElement(Increase_Quantity_of_Asus_Items);
		}
		 catch (Exception e)
			
		{
		 e.printStackTrace();
		}
		}
		 public void Decrease_Quantity_Of_Product()
		 {
			 try
			 {
				 WebDriverWait wait = new WebDriverWait (driver, 15);
				 wait.until(ExpectedConditions.visibilityOf(Decrease_Quantity_of_Asus_Items));
				 PO_CscartProductSearch_UI_Manager.ClickElement(Decrease_Quantity_of_Asus_Items);
			 }
			 catch (Exception e) {
				 e.printStackTrace();
			 }
		 }
		 public void AddToCart_Product()
		 {
			 PO_CscartProductSearch_UI_Manager.ClickElement(AddToCart_Asus_Item);
		 }
}


