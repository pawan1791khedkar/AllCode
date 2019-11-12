package PO;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Addtocart
{
WebDriver driver;
PO_Addtocart(WebDriver driver)
{
	this.driver=driver;
}
@FindBy(how = How.XPATH,using = "//input[@id='search_input']")
private WebElement Search_computer;

@FindBy(how = How.XPATH,using = "//button[@class='ty-search-magnifier']")
private WebElement Clickonsubmitbutton;

@FindBy(how=How.XPATH,using="//a[@class='ty-sort-container__views-a cm-ajax active']")
private WebElement Select_ListBox_For_Add_items_to_cart;

@FindBy(how=How.XPATH,using= "//span[text()='H0217E3OE9']")
private WebElement Select_Code_of_Asus;

@FindBy(how=How.XPATH,using="//button[@id='button_cart_217']")
private WebElement AddToCart_Asus_Item;

public void SearchProductFromSearchTextBox(String comp)
{
	Search_computer.sendKeys(comp);
}
public void Submit_TextBox_Btn()
{
	Clickonsubmitbutton.click();
	String Search=Clickonsubmitbutton.getText();
	System.out.println(Search);
	Assert.assertEquals("Computer Search", Search);
}

public void validate_search_results() 
{
	Assert.assertEquals(true, Search_computer.isDisplayed());
}
public void Go_To_ListBox_For_Addtocart_Product()
{
	Select_ListBox_For_Add_items_to_cart.click();
	Select_ListBox_For_Add_items_to_cart.isDisplayed();
}
public void validate_search_product_results() 
{
	Assert.assertEquals(true, Select_ListBox_For_Add_items_to_cart.isDisplayed());
}
public void Fetch_the_Code_Of_Asus()
{
	Select_Code_of_Asus.sendKeys("H0217E3OE9");
}
public void AddToCart_Product()
{
	AddToCart_Asus_Item.click();
}
}
