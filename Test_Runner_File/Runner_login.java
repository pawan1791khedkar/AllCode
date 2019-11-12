package Test_Runner_File;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions
(features="D:\\eclipse workspace\\CucumberProject\\src\\main\\java\\Features\\cscartlogin.feature",
glue={"Step_Defination_File"},
//tags=//or{"@test","@logic"}//and{"@smoke,@test"}//
tags={"~@Test1","~@Test2","~@Test3"},//ignore
format={"pretty","html:test-output"},
monochrome=true,
dryRun=false)

public class Runner_login
{
	
}
