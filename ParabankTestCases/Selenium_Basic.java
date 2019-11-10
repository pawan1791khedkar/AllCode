package ParabankTestCases;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Selenium_Basic
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://parabank.parasoft.com/parabank/index.htm");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

WebElement txt_username=driver.findElement(By.name("username"));
txt_username.sendKeys("john");
WebElement txt_password=driver.findElement(By.name("password"));
txt_password.sendKeys("demo");

WebElement btn_submit=driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input"));
btn_submit.click();

 WebElement Account= driver.findElement(By.linkText("Accounts Overview"));
Account.click();
List<WebElement> col=driver.findElements(By.id("accountTable"));
    WebElement tbl_account_table=driver.findElement(By.xpath("// table[@id='accountTable']//td[@class='ng-binding'][2]"));
	boolean s_table_expected=true;
	boolean s_table_actual=tbl_account_table.isDisplayed();
	Assert.assertEquals(s_table_expected, s_table_actual);
	List<WebElement> rows_col=tbl_account_table.findElements(By.tagName("th"));
	for (int i=0;i<rows_col.size();i++)
	{
	List<WebElement> clm_col=rows_col.get(i).findElements(By.tagName("td"));
	{
	for(int j=0;j<clm_col.size();j++)
	{
System.out.println(clm_col.get(j).getText());
	
	}
//Open account***********************

WebElement Open_Account=driver.findElement(By.linkText("Open New Account"));
Open_Account.click();
Select B1 =new Select (driver.findElement(By.id("type")));
B1.selectByVisibleText("SAVINGS");
Select B2 =new Select(driver.findElement(By.id("fromAccountId")));
B2.selectByValue("12678");
Thread.sleep(5000);
WebElement btn_submit2=driver.findElement(By.xpath("//input[@type='submit']"));
btn_submit2.click();

WebElement Transfer_Fund=driver.findElement(By.linkText("Transfer Funds"));
Transfer_Fund.click();

WebElement Amount1=driver.findElement(By.id("amount"));
Amount1.sendKeys("1000");

Select A2 =new Select(driver.findElement(By.id("fromAccountId")));
A2.selectByVisibleText("12567");

Select A =new Select(driver.findElement(By.id("toAccountId")));
 A.selectByVisibleText("12789");

WebElement btn5_submit=driver.findElement(By.xpath("//*[@id='rightPanel']/div/div/form/div[2]/input"));
btn5_submit.click();


WebElement Bill_pay=driver.findElement(By.xpath("//*[@id='leftPanel']/ul/li[4]/a"));
Bill_pay.click();

WebElement name=driver.findElement(By.id("payee.name"));
name.sendKeys("pawan");

WebElement Address=driver.findElement(By.id("payee.address.street"));
Address.sendKeys("wagholi");

WebElement City=driver.findElement(By.id("payee.address.city"));
City.sendKeys("Pune");

WebElement State=driver.findElement(By.id("payee.address.state"));
State.sendKeys("Maharashtra");

WebElement ZipCode=driver.findElement(By.id("payee.address.zipCode"));
ZipCode.sendKeys("444303");

WebElement Phoneno=driver.findElement(By.id("payee.phoneNumber"));
Phoneno.sendKeys("9579178117");

WebElement Accountno=driver.findElement(By.id("payee.accountNumber"));
Accountno.sendKeys("12567");

WebElement Accountvary=driver.findElement(By.id("verifyAccount"));
Accountvary.sendKeys("12567");

WebElement Amount=driver.findElement(By.id("amount"));
Amount.sendKeys("12000");

Select A1 =new Select(driver.findElement(By.id("fromAccountId")));
A1.selectByValue("12456");
A1.getOptions();
WebElement btn_submit3=driver.findElement(By.xpath("//*[@id='billPayForm']/table/tbody/tr[14]/td[2]/input"));
btn_submit3.click();

String title_exp="ParaBank | Bill Pay";
String title_act=driver.getTitle();

if(title_exp.equals(title_act))

{
System.out.println("Balance Transfer Complete");
}
else
{
	System.out.println("Expected Page is unreachable");
}

WebElement Find_Trans=driver.findElement(By.xpath("//*[@id='leftPanel']/ul/li[5]/a"));
Find_Trans.click();

Select Account_num =new Select(driver.findElement(By.id("accountId")));
Account_num.selectByValue("12789");

WebElement Find_Trans_Id=driver.findElement(By.id("payee.address.zipCode"));
Find_Trans_Id.sendKeys("444303");

WebElement Find_By_Date=driver.findElement(By.id("criteria.onDate"));
Find_By_Date.sendKeys("15-10-2018");
WebElement Find1=driver.findElement(By.xpath("//button[@ng-click=\"criteria.searchType = 'DATE'\"]"));
Find1.click();

WebElement Find_By_Range_Bet=driver.findElement(By.id("criteria.fromDate"));
Find_By_Range_Bet.sendKeys("15-09-2018");
WebElement Find_By_Range_and=driver.findElement(By.id("criteria.toDate"));
Find_By_Range_and.sendKeys("15-10-2018");
WebElement Find2=driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[7]/button"));
Find2.click();

WebElement Find_by_Amount=driver.findElement(By.id("criteria.amount"));
Find_by_Amount.sendKeys("100");
WebElement Find3=driver.findElement(By.xpath("//[@id=\"rightPanel\"]/div/div/form/div[9]/button"));
Find3.click();
WebElement Request_Loan=driver.findElement(By.xpath("//[@id='leftPanel']/ul/li[7]/a"));
Request_Loan.click();
WebElement Loan_amt=driver.findElement(By.id("amount"));
Loan_amt.sendKeys("5000");
WebElement Down_payment=driver.findElement(By.id("downPayment"));
Down_payment.sendKeys("7000");
Select A3 =new Select(driver.findElement(By.id("fromAccountId")));
A3.selectByValue("12567");
WebElement btn_submit4=driver.findElement(By.xpath("//[@type='submit']"));
btn_submit4.click();

String title_exp1="ParaBank | Loan Request";
String title_act1=driver.getTitle();

if(title_exp1.equals(title_act1))

{
System.out.println("Loan Request Successful");
}
else
{
	System.out.println("Expected Page is unreachable");
}
	}
	}
	}
	}



