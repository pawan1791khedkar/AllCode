package Parabank.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import core.utils.Utils;

public class PO_Pay_Bills 
{
	WebDriver driver;
	public PO_Pay_Bills(WebDriver driver) 
	{
		this.driver=driver;
	}
	@FindBy(how = How.NAME,using="payee.name")
	WebElement Payee_Name;
	@FindBy(how = How.NAME,using="payee.address.street")
	private WebElement Address;
	@FindBy(how = How.NAME,using="payee.address.city")
	private WebElement City;
	@FindBy(how = How.NAME,using="payee.address.state")
	private WebElement State;
	@FindBy(how = How.NAME,using="payee.address.zipCode")
	private WebElement Zipcode;
	@FindBy(how = How.NAME,using="payee.phoneNumber")
	private WebElement PhoneNo;
	@FindBy(how = How.NAME,using="payee.accountNumber")
	private WebElement AccountNo;
	@FindBy(how = How.XPATH,using="verifyAccount")
	private WebElement VerifyAccount;
	@FindBy(how = How.XPATH,using="//input[@ng-model='amount']")
	private WebElement Amount;
	@FindBy(how = How.NAME,using="fromAccountId")
	private WebElement FromAccount;
	@FindBy(how = How.XPATH,using="//input[@class='button']")
	private WebElement Sub_button;
	
	public void Select_payee_Name( String name)
	{
		try
		{
			Payee_Name.sendKeys(name);
		
			Utils.WriteLogs("info","fill the text as :" + name + " in the box");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to fill text as: '"+ name +"' in the box: " + e.toString());
	}
	}
	public void Select_Address( String Add)
	{
		try
		{
			Payee_Name.sendKeys(Add);
		
			Utils.WriteLogs("info","fill the text as :" + Add + " in the box");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to fill text as: '"+ Add +"' in the box: " + e.toString());
	}	
}
	public void Select_City( String city)
	{
		try
		{
			Payee_Name.sendKeys(city);
		
			Utils.WriteLogs("info","fill the text as :" + city + " in the box");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to fill text as: '"+ city +"' in the box: " + e.toString());
	}
}
	public void Select_State( String state)
	{
		try
		{
			Payee_Name.sendKeys(state);
		
			Utils.WriteLogs("info","fill the text as :" + state + " in the box");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to fill text as: '"+ state +"' in the box: " + e.toString());
	}
	}
	public void Select_Zipcode( String zipcode)
	{
		try
		{
			Payee_Name.sendKeys(zipcode);
		
			Utils.WriteLogs("info","fill the text as :" + zipcode + " in the box");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to fill text as: '"+ zipcode +"' in the box: " + e.toString());
	}
	}
	public void Select_PhoneNo( String phoneno)
	{
		try
		{
			Payee_Name.sendKeys(phoneno);
		
			Utils.WriteLogs("info","fill the text as :" + phoneno + " in the box");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to fill text as: '"+ phoneno +"' in the box: " + e.toString());
	}
	}
	public void Select_AccountNo( String accountno)
	{
		try
		{
			Payee_Name.sendKeys(accountno);
		
			Utils.WriteLogs("info","fill the text as :" + accountno + " in the box");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to fill text as: '"+ accountno +"' in the box: " + e.toString());
	}
	}
	public void Select_VerifyAccountNo( String veraccno)
	{
		try
		{
			Payee_Name.sendKeys(veraccno);
		
			Utils.WriteLogs("info","fill the text as :" + veraccno + " in the box");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to fill text as: '"+ veraccno +"' in the box: " + e.toString());
	}
	}
	public void Select_Amount( String amount)
	{
		try
		{
			Payee_Name.sendKeys(amount);
		
			Utils.WriteLogs("info","fill the text as :" + amount + " in the box");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to fill text as: '"+ amount +"' in the box: " + e.toString());
	}
	}
	public void Select_FromAccount( String fromaccount)
	{
		try
		{
			Select from_account= new  Select(FromAccount);
			from_account.selectByVisibleText(fromaccount);	
			Utils.WriteLogs("info","fill the text as :" + fromaccount + " in the box");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to fill text as: '"+ fromaccount +"' in the box: " + e.toString());
	}
	}
	
	public void Click_On_Sub_button()
	{
		try
		{
			Sub_button.click();
		
			Utils.WriteLogs("info","Clickd on submit Button");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to click on submit button due to exception: " + e.toString());
	}
	}
	public void KW_Fill_Pay_billsandSubmit(String Payee,String Address,String city,String state,String zipcode,String phoneno,String accno,String veraccno,String amt,String fromacc)
	{
		try
		{
			Select_payee_Name( Payee);
			Select_Address(Address);
			Select_City(city);
			Select_State(state);
			Select_Zipcode(zipcode);
			Select_PhoneNo(phoneno);
			Select_AccountNo(accno);
			Select_VerifyAccountNo(veraccno);
			 Select_Amount(amt);
			 Select_FromAccount(fromacc);
			
			//Assertion Point
			Assert.assertEquals(Sub_button.isDisplayed(), true);
			
			Reporter.log("Page Navigated to Pay_Bills Verify");
			Click_On_Sub_button();
			Utils.WriteLogs("info","Page Navigated to Pay_Bills Verify");

			//Checkpoint to validate the Amount
			String expected = "driver.findElement(By.xpath(//input[@id='sp_amount']))";
			String actual = "Amount";
			Assert.assertEquals(actual, expected);

		}catch(Exception e) {
			e.printStackTrace();
			Utils.WriteLogs("fail","Unable to navigate Pay_Bills  and Submit page: " + e.toString());
		}
	}
}