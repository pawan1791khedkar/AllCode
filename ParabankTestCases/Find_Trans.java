package ParabankTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Find_Trans 
{
WebDriver driver;
public Find_Trans (WebDriver driver)
{
	this.driver=driver;
}
public void Test2()
{
	
	WebElement Find_Trans=driver.findElement(By.xpath("//*[@id='leftPanel']/ul/li[5]/a"));
	Find_Trans.click();

	Select Account_num =new Select(driver.findElement(By.id("accountId")));
	Account_num.selectByValue("12789");

	/*WebElement Find_Trans_Id=driver.findElement(By.id("payee.address.zipCode"));
	Find_Trans_Id.sendKeys("444303");*/

	WebElement Find_By_Date=driver.findElement(By.id("criteria.onDate"));
	Find_By_Date.sendKeys("15-10-2018");
	WebElement Find1=driver.findElement(By.xpath("//button[@ng-click=\"criteria.searchType = 'DATE'\"]"));
	Find1.click();
}
}