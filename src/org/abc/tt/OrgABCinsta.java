package org.abc.tt;
import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrgABCinsta 
{
	WebDriver driver;
	@BeforeMethod
	public void open()
	{
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void close()
	{
		//driver.close();
	}
	
	@Test
	public void login_f()
	{
		
		driver.findElement(By.id("email")).sendKeys("User1");
		driver.findElement(By.name("pass")).sendKeys("Pass1244");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		//driver.close();
		
	}
	@Test
	public void singup()
	{
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("sakshi");
		driver.findElement(By.className("websubmit")).click();
	}

}
