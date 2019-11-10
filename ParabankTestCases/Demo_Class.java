package ParabankTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Demo_Class 
{
	WebDriver driver;
	public Demo_Class(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Test1()
	{
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


		WebElement btn_submit2=driver.findElement(By.xpath("//*[@id='billPayForm']/table/tbody/tr[14]/td[2]/input"));
		btn_submit2.click();

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

		
}
}