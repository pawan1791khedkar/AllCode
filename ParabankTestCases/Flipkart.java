package ParabankTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");

	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("iphone");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	
	List<WebElement> product=driver.findElements(By.xpath("//div[@class='_3wU53n']"));
	List<WebElement> price=driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
	String pn;
	String pp;
	int ppsap=0;
	int pptotal=0;
	for(int i=0;i<product.size();i++)
	{
		pn=product.get(i).getText();
		pp=price.get(i).getText();
		pp=pp.replaceAll("[^0-9]", "");
		ppsap=Integer.parseInt(pp);
		pptotal=ppsap+pptotal;
        System.out.println(pn);
	    System.out.println(pptotal);
	    int a=pptotal/2;
	    System.out.println(a);
}
}
}