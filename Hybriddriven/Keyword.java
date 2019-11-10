package Hybriddriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyword 
{
static WebDriver driver;
public static void openbrowser()
{
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
}
public static void gotolink()
{
	driver.navigate().to("https://www.google.co.in/?gfe_rd=cr&ei=mvzbWOyZNOzs8Af2hbLIDg&gws_rd=ssl"); 
}
public static void enterdata(int t)
{
	WebElement searchbox = driver.findElement(By.xpath(".//*[@id='lst-ib']")); 
	String text = Getdatafromexel.inputdata(0, t, 0);
	searchbox.sendKeys(text);
}
public static void hitenter()
{
Actions act = new Actions(driver);
act.sendKeys(Keys.ENTER).build().perform();
}
public static void goback()
{
driver.navigate().back(); 
}
}

