package Cross_ParallalTests;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_Telecom extends  Base_TestNGClass
{
	@Parameters({"url_airtel"})
	@Test
	public void t_01_check_airtel(String url) {
		driver.get(url);
		Reporter.log(url,true);
	}
	@Parameters({"url_idea"})
	@Test
	public void t_02_check_idea(String url) {
		driver.get(url);
		Reporter.log(url,true);
	}
	
	@Parameters({"url_vodafone"})
	@Test
	public void t_03_check_vodafone(String url) {
		driver.get(url);
		Reporter.log(url,true);
	}
	
	@Parameters({"url_tata"})
	@Test
	public void t_04_check_tata(String url) {
		driver.get(url);
		Reporter.log(url,true);
	}
 
 
 
}
