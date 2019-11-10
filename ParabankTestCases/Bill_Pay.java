package ParabankTestCases;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Bill_Pay 
{
	@Test
public void login()

{
		System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();

		Page_Object_Module t1=new Page_Object_Module(driver);
		t1.Log_In();
		Demo_Class t2=new Demo_Class(driver);
		t2.Test1();
		Find_Trans t3=new Find_Trans(driver);
		t3.Test2();
		Request_loan t4=new Request_loan(driver);
		t4.Test4();
		
}
}
