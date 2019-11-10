package com.Product.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_MegaMenu
{
	WebDriver driver;
public PO_MegaMenu(WebDriver driver)
{
	this.driver=driver;	
}

@FindBy(how=How.XPATH,using="//*[@id='tygh_main_container']/div[2]/div/div[2]/div/div/ul/li[3]/a[2]")
WebElement Elect1;
@FindBy(how=How.XPATH,using="//*[@id='tygh_main_container]/div[2]/div/div[2]/div/div/ul/li[4]/a[2]")
WebElement apprel;
@FindBy(how=How.XPATH,using="//*[@id='tygh_main_container']/div[2]/div/div[2]/div/div/ul/li[5]/a[2]")
WebElement SportOutdoor;
@FindBy(how=How.XPATH,using="//*[@id='tygh_main_container']/div[2]/div/div[2]/div/div/ul/li[5]/a[2]")
WebElement OfficeSupplies;
@FindBy(how=How.XPATH,using="//*[@id='tygh_main_container']/div[2]/div/div[2]/div/div/ul/li[8]/a")
WebElement Brand;
public void Electrical()
{
	Actions action=new Actions(driver);
	action.moveToElement(Elect1).build().perform();
	
	}
public void Apprel()
{
	Actions action=new Actions(driver);
	action.moveToElement(apprel).build().perform();
	
	}

public void SportOutdoor()
{
	Actions action=new Actions(driver);
	action.moveToElement(SportOutdoor).build().perform();
	
	}
public void OfficeSupplies()
{
	Actions action=new Actions(driver);
	action.moveToElement(OfficeSupplies).build().perform();
	
}
public void brand()
{
	Actions action=new Actions(driver);
	action.moveToElement(Brand).build().perform();
	
	}
}