package Parabank.TC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Parabank.PO.PO_Common;
import Parabank.PO.PO_Pay_Bills;
import Parabank.PO.PO_Transfer_Fund;
import Parabank.PO.PO_login;
import core.utils.Utils;

public class TC_Smoke 
{
	WebDriver driver;
	PO_login po_login;
	@Parameters({"url","browserType"})
	@Test
	public void tc_01_validate_login_functionality(String url, String browserType)
	{
		try
		{
			//url = "https://parabank.parasoft.com/parabank/index.htm";
		    driver= Utils.InvokeBrowser(browserType, url);
			po_login=PageFactory.initElements(driver, PO_login.class);
			po_login.KW_login_into_application("john", "demo");
			Utils.WriteLogs("pass","Test Case completed");
		}
		catch(Exception e)
		{
			Utils.WriteLogs("fail","Test failed");
			Assert.assertFalse(false);
		}
	}
		@Parameters({"url","browserType"})
		@Test
		public void tc_02_check_transfer_fund(String url,String browserType)
		{
		   // url = "https://parabank.parasoft.com/parabank/index.htm";
		    driver=Utils.InvokeBrowser(browserType, url);
			//login into page
			po_login=PageFactory.initElements(driver, PO_login.class);
			po_login.KW_login_into_application("john", "demo");
		
			//click on transfer funds
			PO_Common po=PageFactory.initElements(driver, PO_Common.class);
			po.clickTransferFunds();
			//Transfer funds
			PO_Transfer_Fund  transfer_funds=PageFactory.initElements(driver, PO_Transfer_Fund.class);
			String amount="1000";
			String from="200";
			String to="100";
			
			transfer_funds.KW_FillTranferFundPageAndSubmitted(amount,from,to);
		}
	
@Parameters({"url","browserType"})
@Test
public void Tc03_validate_PayBills(String url,String browserType) 
{
	//url = "http://zero.webappsecurity.com/login.html";
     driver = Utils.InvokeBrowser(browserType, url);
	//Init Page Object
	PO_login Po_Login = PageFactory.initElements(driver, PO_login.class);
	Po_Login.KW_login_into_application("john", "demo");
	
	PO_Common po_common=PageFactory.initElements(driver, PO_Common.class);
	po_common.clickBillPay();
	//Pay_Bills
	PO_Pay_Bills PO_paybills= PageFactory.initElements(driver, PO_Pay_Bills.class);
	String Payee = " Pawan";
	String Address = "Wagholi";
	String city = "Pune";
	String state = "Maharashtra";
	String zipcode="444303";
	String phoneno ="9579178117";
	String  accno="321456";
	String veraccno="321456";
	String amt="2000";
	String fromacc="12567";
	PO_paybills.KW_Fill_Pay_billsandSubmit(Payee, Address, city, state,zipcode,phoneno,accno, veraccno,amt,fromacc);
	Utils.WriteLogs("pass","Test Case completed");
}
}