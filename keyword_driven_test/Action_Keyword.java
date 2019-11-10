package keyword_driven_test;


	
	 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	 
	public class Action_Keyword 
	{
	 
		static WebDriver driver;
		public static void openbrwoser()
		{
		driver = new ChromeDriver();
		}
		public static void navigate()
		{
		driver.navigate().to("http://www.way2testing.com");
		}
		public static void click_df()
		{
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/div[2]/p[2]/a")).click();
		}
		}
