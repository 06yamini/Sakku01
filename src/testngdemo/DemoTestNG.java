package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG 
{

	@Test(groups="sanity")
	public void printdata()
	{
		int a = 200;
		
		System.out.println(a);
		Assert.assertEquals(200, 2000); 
		
		
	}
	@Test(groups="smoke")
	public void printdata1()
	{
		int b = 2000;
		
		System.out.println(b);
		Assert.assertEquals("Hello", "HelloO");
		
	}
	@Test(dependsOnMethods="printdata1")
	public void printdata2()
	{
		int c = 20000;
		
		System.out.println(c);
		
	}
	@Test(groups="regression")
	public void printdata3()
	{
		int d = 200000;
		
		System.out.println(d);
		
	}
}
