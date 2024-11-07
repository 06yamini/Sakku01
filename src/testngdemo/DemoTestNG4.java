package testngdemo;

import org.testng.annotations.Test;

public class DemoTestNG4 
{

	@Test(groups={"sanity","smoke"})
	public void printdata()
	{
		int a = 200;
		
		System.out.println(a);
		
	}
	@Test(groups="regression")
	public void printdata1()
	{
		int b = 2000;
		
		System.out.println(b);
		
	}
	@Test(groups="smoke")
	public void printdata2()
	{
		int c = 20000;
		
		System.out.println(c);
		
	}
	@Test(groups="sanity")
	public void printdata3()
	{
		int d = 200000;
		
		System.out.println(d);
		
	}
}
