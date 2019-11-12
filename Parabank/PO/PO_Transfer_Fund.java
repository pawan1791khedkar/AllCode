package Parabank.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import core.utils.Utils;

public class PO_Transfer_Fund 
{
WebDriver driver;
	public PO_Transfer_Fund(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.ID,using="amount")
	private WebElement txtbx_amount;
	
	@FindBy(how=How.ID,using="fromAccountId")
	private WebElement list_from_account;

	@FindBy(how=How.ID,using="toAccountId")
	private WebElement list_to_account;

	@FindBy(how=How.XPATH,using="//input[@class='button']")
	private WebElement txt_button;
	
	
	public void setamount(String amount)
	{
		try
		{
			
			txtbx_amount.sendKeys(amount);
			Utils.WriteLogs("info","Selected value as "+amount +"in amount textbx");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to Select value as: '"+ amount +"' from FromDropDown: " + e.toString());
		}
	}
	
	public void selct_from_account(String from)
	{
		try
		{
			Select selectFromAccount=new Select(list_from_account);
			selectFromAccount.selectByValue(from);
			Utils.WriteLogs("info","Selected value as :" + from + " from FromDropDown");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to Select value as: '"+ from +"' from FromDropDown: " + e.toString());
		}
	}
	public void selct_to_account(String to)
	{
		try
		{
			Select selectToAccount=new Select(list_to_account);
			selectToAccount.selectByValue(to);
			Utils.WriteLogs("info","Selected value as :" + to + " from ToDropDown");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to Select value as: '"+ to +"' from ToDropDown: " + e.toString());
		}
	}
	public void click_on_submit_button()
	{
		try
		{
			txt_button.click();
			Utils.WriteLogs("info","Clickd on Submit Button");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to Submit button due to exception: " + e.toString());
		}
	}
	public void KW_FillTranferFundPageAndSubmitted(String amount,String from,String to )
	{
		try
		{	
			setamount(amount);
			selct_from_account(from);
			selct_to_account(to);
			
			//validation points
			Assert.assertEquals(txt_button.isDisplayed(),true);
			Assert.assertEquals(list_from_account.isEnabled(),false);
			Utils.WriteLogs("info","Page Navigated to Transfer Funds Verify");
			click_on_submit_button();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to Fill transsfer funds and Submit page: " + e.toString());
		}
	}
}
