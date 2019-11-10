package ScreenFailshot;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


//@Listeners(listeners_Demo.TestNg_Listeners.class)
public class MyFirstcase extends ScreenShot
{
	@BeforeMethod
	public void setup()
	{
		initializetest();
		
	}
	@Test
	public void Testone()
	{
		System.out.println("Testone");
		Assert.assertTrue(true);
}
	@Test
	public void Testsecond()
	{
		System.out.println("Testsecond");
		Assert.assertTrue(false);
}
	@Test
	public void TestThird()
	{
		System.out.println("TestThird");
		Assert.assertTrue(false);
}
}