package Cross_ParallalTests;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_SocialNetwork extends  Base_TestNGClass 
{
	@Parameters({"url_fb"})
	@Test
	public void t_01_check_fb(String url) {
		driver.get(url);
		Reporter.log(url,true);
	}
	@Parameters({"url_tw"})
	@Test
	public void t_02_check_tw(String url) {
		driver.get(url);
		Reporter.log(url,true);
	}
	
	@Parameters({"url_li"})
	@Test
	public void t_03_check_li(String url) {
		driver.get(url);
		Reporter.log(url,true);
	}
	
	@Parameters({"url_instragram"})
	@Test
	public void t_04_check_instagram(String url) {
		driver.get(url);
		Reporter.log(url,true);
	}
 
 
 
}
