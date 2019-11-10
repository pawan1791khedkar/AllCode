package com.Product.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Core.UI_Manager;

public class Po_Cscart_ProductType
{
WebDriver driver;
UI_Manager Po_Cscart_ProductType_UI_Manager = new UI_Manager();
public Po_Cscart_ProductType(WebDriver driver)
{
	this.driver=driver;
	
}
@FindBy(how=How.XPATH,using="//input[@id='search_input']")
private WebElement Search_Computer;

@FindBy(how=How.XPATH,using="//button[@title='Search']")
private WebElement Click_On_Computer;

@FindBy(how=How.XPATH,using="//*[@id='sw_elm_filter_10']")
private WebElement Click_on_Brand;

@FindBy(how=How.XPATH,using="//input [@class='cm-product-filters-checkbox' and @name='product_filters[10]' and @id='elm_checkbox_39_10_88']")
private WebElement ClickOn_Asus;

@FindBy(how=How.XPATH,using="//*[@id='sw_elm_filter_1']")
private WebElement Click_On_Price;

@FindBy(how=How.XPATH,using="//*[@id='slider_39_1']/span[1]")
private WebElement SliderA;

@FindBy(how=How.XPATH,using="//*[@id='slider_39_1']/span[2]")
private WebElement SliderB;

@FindBy(how=How.XPATH,using="//div[@id='sw_elm_filter_7']")
private WebElement Click_On_Os;

@FindBy(how=How.XPATH,using="//*[@id='elm_checkbox_39_7_66']")
private WebElement Click_On_Android;

@FindBy(how=How.XPATH,using="//div[@id='sw_elm_filter_8']")
private WebElement Click_On_Display;

@FindBy(how=How.XPATH,using="//input[@class='cm-product-filters-checkbox' and @type='checkbox' and @id='elm_checkbox_39_8_63']")
private WebElement Click_On_Size;

@FindBy(how=How.XPATH,using="//div[@id='sw_elm_filter_9']")
private WebElement Click_On_StorageCapacity;

@FindBy(how=How.XPATH,using="//*[@id='elm_checkbox_39_9_45]")
private WebElement ClickOn_Capacity;


public void Search_Computer(String product)
{
	 Po_Cscart_ProductType_UI_Manager.SetElementText(Search_Computer, product);
}
public void Click_On_Computer()
{
	Po_Cscart_ProductType_UI_Manager.ClickElement(Click_On_Computer);
}
public void Click_on_Brand()
{
	Po_Cscart_ProductType_UI_Manager.ClickElement(Click_on_Brand);
}
public void ClickOn_Asus()
{
	Po_Cscart_ProductType_UI_Manager.ClickElement(ClickOn_Asus);
	
}
public void  Click_On_Price()
{
	Po_Cscart_ProductType_UI_Manager.ClickElement(Click_On_Price);
}
public void Pause()
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	SliderA=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all']")));
	Po_Cscart_ProductType_UI_Manager.ClickElement(SliderA);
}
public void SliderA()
{
	Actions action = new Actions(driver);
	
	action.dragAndDropBy(SliderA, 50, 0).build().perform();
	Po_Cscart_ProductType_UI_Manager.ClickElement(SliderA);	 
	 
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
	Po_Cscart_ProductType_UI_Manager.ClickElement(SliderB);	
	 try
	 {
		Thread.sleep(2000);
	} catch (InterruptedException e) 
	 {
		e.printStackTrace();
	}
}

public void  Click_On_Os()
{
	Po_Cscart_ProductType_UI_Manager.ClickElement(Click_On_Os);
}

public void  Click_On_Android()
{
	Po_Cscart_ProductType_UI_Manager.ClickElement(Click_On_Android);
}
public void  Click_On_Display()
{
	Po_Cscart_ProductType_UI_Manager.ClickElement( Click_On_Display);
	Po_Cscart_ProductType_UI_Manager.ClickElement( Click_On_Size);
	
}
public void  Click_On_StorageCapacity()
{
	Po_Cscart_ProductType_UI_Manager.ClickElement( Click_On_StorageCapacity);
	Po_Cscart_ProductType_UI_Manager.ClickElement( ClickOn_Capacity);
	
}
}

