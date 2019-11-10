package ParabankTestCases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Flipkart1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver ;
	System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	String exp="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	String act=driver.getTitle();
	Assert.assertEquals(act, exp);
	
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	Thread.sleep(2000);
	WebElement searchbx =driver.findElement(By.xpath("//input[@class='LM6RPg']"));
	Assert.assertEquals(searchbx.isDisplayed(), true);
	searchbx.sendKeys("tvs");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	
	List<WebElement> product=driver.findElements(By.xpath("//div[@class='_3wU53n']"));
	List<WebElement> price=driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
	
	String pn;
	Integer pp;
	
	HashMap<Integer,String> list=new HashMap<>();
	for(int i=0;i<=product.size()-1;i++)
	{
		pn=product.get(i).getText();
		pp=Integer.parseInt(price.get(i).getText().replaceAll("[^0-9]",""));
		System.out.println(pp);
		System.out.println(pn);
		list.put(pp, pn);
	}	
	Set<Integer> set=list.keySet();
	ArrayList<Integer> arraylist=new ArrayList<Integer>(set);
	Collections.sort(arraylist);
	//System.out.println(arraylist.size());
	int high_price=arraylist.get(arraylist.size()-1);
	int low_price=arraylist.get(0);
	System.out.println(list.get(high_price));
	System.out.println(list.get(low_price));
	}
     
}

