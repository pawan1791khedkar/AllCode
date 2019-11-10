package ParabankTestCases;

import java.text.DecimalFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tabledataremovedoller 
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

	WebElement btn_submit=driver.findElement(By.xpath("//input[@type='submit']"));
	btn_submit.click();

	WebElement Account= driver.findElement(By.linkText("Accounts Overview"));
	Account.click();
	List<WebElement> tbl=driver.findElements(By.xpath("//td[@class='ng-binding'][1]"));
	String s;
	double a=0;//total amount
	double b=0 ;//separate amount
	
		for (int i=0;i<tbl.size();i++)
		{
	    	s=tbl.get(i).getText();
			s=s.replace("$", "");
			b=Double.parseDouble(s);
			a=a+b;	
			System.out.println(b);
			
	        //System.out.println(tbl.get(i).getText());
    }
		
		DecimalFormat f=new DecimalFormat("##.00");
		
		System.out.println(f.format(a));
		WebElement tbl1=driver.findElement(By.xpath("//b[text()='$1692.67']"));
		String p;
		p=tbl1.getText();
		p=p.replace("$", "");
		if(p.equals(f.format(a)))
		{
			System.out.println("test pass  "+f.format(a)+"  "+p);
		}
		else
		{
			System.out.println("test fail");
		}
	}
	}
	
