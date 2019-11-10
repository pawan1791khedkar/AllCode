import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest 
{
  @Test
  public void f() 
  {
	  System.out.println("testA");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("testB");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("testc");
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("testd");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("teste");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("testf");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("testg");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("testh");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("testi");
  }

}
