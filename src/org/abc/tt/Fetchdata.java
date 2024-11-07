package org.abc.tt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Fetchdata 
{
	WebDriver driver;
	@Test
	public void logindata() throws Exception
	{
		driver = new EdgeDriver();
		
		
		String ExpURL = "https://www.facebook.com/";
		driver.get(ExpURL);
		
		boolean x = driver.findElement(By.cssSelector("[type='submit']")).isEnabled();
		System.out.println(x);
		
		Assert.assertEquals(x, true);
				
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		Assert.assertEquals(ActURL, ExpURL);
	
		String ExpTitle ="Login & Signup Form";
		String ActTitle = driver.getTitle();
		Assert.assertEquals(ActTitle, ExpTitle);
		
		
		
	} 

}
