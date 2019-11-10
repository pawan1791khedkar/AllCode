package ParabankTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Request_loan
{
	WebDriver driver;
public  Request_loan(WebDriver driver)
{
	this.driver=driver;
}
public void Test4()
{
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
	WebElement Request=driver.findElement(By.xpath("//*[@id='leftPanel']/ul/li[7]/a"));
	Request.click();

	

}
}