package sakkujava2;

import org.testng.annotations.Test;

public class DemoTestNG6 
{

	@Test
	public void printdata()
	{
		int a = 200;
		
		System.out.println(a);
		
	}
	@Test(groups="sanity")
	public void printdata1()
	{
		int b = 2000;
		
		System.out.println(b);
		
	}
	@Test
	public void printdata2()
	{
		int c = 20000;
		
		System.out.println(c);
		
	}
	@Test
	public void printdata3()
	{
		int d = 200000;
		
		System.out.println(d);
		
	}
}
