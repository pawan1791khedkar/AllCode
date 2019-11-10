package com.Product.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Search 
{
	WebDriver driver;
	public PO_Search(WebDriver driver)
	{
		this.driver=driver;
}
	@FindBy(how=How.XPATH,using=" //*[@id='tygh_main_container']/div[2]/div/div[1]/div[3]/div/div[1]/div/div/form/button")
	WebElement Search;
	

public void Search() 
{
	Search.click();
	}
}