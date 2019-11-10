package CrossBrowserTesting;

import org.testng.annotations.Test;

public class Group_Testing
{
@Test(groups={"windows.sanity-group"})
public void testone()
{
	System.out.println("Test belongs to sanity test");
}
@Test(groups={"smoke-group"})
public void testtwo()
{
	System.out.println("Test belongs to smoke test");
}
@Test(groups={"regression-group"})
public void testthree()
{
	System.out.println("Test belongs to regression test");
}
@Test(groups={"sanity-group"})
public void testfour()
{
	System.out.println("Test belongs to regression test one");
}

}
