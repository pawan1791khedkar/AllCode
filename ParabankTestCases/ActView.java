package ParabankTestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ActView 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://parabank.parasoft.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		/*driver.findElement(By.id("Accounts Overview")).click();
		List<WebElement> col=driver.findElements(By.id("accountTable"));
		col.get(0).sendKeys("john");
		col.get(1).sendKeys("demo");
		col.get(2).click();
		*/
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("john");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@class='button' ]")).click();
		WebElement Account= driver.findElement(By.linkText("Accounts Overview"));
		Account.click();
		//List<WebElement> coll=driver.findElements(By.id("accountTable"));
		WebElement tbl_account_table=driver.findElement(By.id("accountTable"));
		boolean s_table_expected=true;
		boolean s_table_actual=tbl_account_table.isDisplayed();
		Assert.assertEquals(s_table_expected, s_table_actual);
		List<WebElement> rows_col=tbl_account_table.findElements(By.xpath("//table[@id='accountTable']//tbody//tr[@ng-repeat='account in accounts'][2]"));
		for (int i=0;i<rows_col.size();i++)
		{
			System.out.println(rows_col.get(i).getText());
			/*List<WebElement> clm_col=rows_col.get(i).findElements(By.tagName("th"));
			{
				for(int j=0;j<clm_col.size();j++)
				{
					System.out.println(clm_col.get(j).getText());

				}*/
			}
		}
	}

