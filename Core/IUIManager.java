package com.Core;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface IUIManager
{
	public void ClickElement(WebElement _locator);
	public void SetElementText(WebElement _locator,String text);
	public String GetElementText(WebElement _locator);
	public String GetElementAttribute(WebElement _locator,String text);
	public HashMap<Integer,HashMap<Integer,String>> GetUITableText(WebElement _locator);
	public int[] GetUITableRowClmWithCellText(WebElement _locator, String s_expected_text);
	public List<WebElement> GetUITableChildItemsWithRowAndClm(WebElement _locator,int row, int clm, By desc);
	public String TakeScreenShot(WebDriver driver);
}
