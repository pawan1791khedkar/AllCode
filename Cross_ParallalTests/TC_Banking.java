package Cross_ParallalTests;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_Banking extends Base_TestNGClass 
{
	@Parameters({"url_icici"})
	@Test
	public void t_01_check_icici(String url) {
		driver.get(url);
		Reporter.log(url,true);
	}
	@Parameters({"url_sbi"})
	@Test
	public void t_02_check_sbi(String url) {
		driver.get(url);
		Reporter.log(url,true);
	}
	
	@Parameters({"zeroapp_username","zeroapp_password","url_zeroapp"})
	@Test
	public void t_03_check_zeroapp(String uname, String pass, String url) {
		driver.get(url);
		Reporter.log(uname + " " + pass + " " + url,true);
	}
	
	@Parameters({"parabank_username","parabank_password","url_parabank"})
	@Test
	public void t_04_check_parabank(String uname, String pass, String url) {
		driver.get(url);
		Reporter.log(uname + " " + pass + " " + url,true);
	}
 
}
