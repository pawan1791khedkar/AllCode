package Parabank.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import core.utils.Utils;

public class PO_Common 
{
	WebDriver driver;
	
	//parameterized constructr
	public PO_Common(WebDriver driver)
	{
		this.driver=driver;	
	}
	
	//page objects
	
	@FindBy(how=How.LINK_TEXT, using="Transfer Funds")
	private WebElement transfer_funds_link;
	
	public void clickTransferFunds()
	{
		try
		{
			transfer_funds_link.click();
			Utils.WriteLogs("info","Transfer fund is clicked");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to Click on Transfer Funds. Exception: " + e.toString());
		}
	}

	/*@FindBy(how=How.XPATH, using="//a[contains(text(),'Open New Account')]")
	private WebElement account_activity_link;

	public void clickNewAccount()
	{
		try
		{
			account_activity_link.click();
			Utils.WriteLogs("info","Account activity is clicked");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to click on Account Activity. Exception as :"+e.toString());
		}
	}*/
	
	//Bill Pay
	@FindBy(how=How.LINK_TEXT, using="Bill Pay")
	private WebElement bill_pay_link;
	
	public void clickBillPay()
	{
		try
		{
			bill_pay_link.click();
			Utils.WriteLogs("info","Bill Pay is clicked");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to click on Bill Pay. Exception as :"+e.toString());
		}
	}
		
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Request Loan')]")
    private WebElement Request_loan;
	
	public void Request_loan()
	{
		try
		{
			Request_loan.click();
			Utils.WriteLogs("info","My money map is clicked");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to click on money map. Exception as :"+e.toString());
		}
	}

}
