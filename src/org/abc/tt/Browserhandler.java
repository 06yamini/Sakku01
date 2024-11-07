package org.abc.tt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Browserhandler 
{
	WebDriver driver;
	
	@Test
	public void calender() throws Exception
	{
		driver = new EdgeDriver();
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).sendKeys("06/01/1989");
		driver.findElement(By.xpath("//a[text()='1']")).click();
	}
	
	@Test(enabled=false)
	public void diffbuttons() throws Exception
	{
		driver = new EdgeDriver();
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().window().maximize();
		driver.findElement(By.name("fld_username")).sendKeys("Sakshi");
		Thread.sleep(5000);
		driver.findElement(By.name("fld_email")).sendKeys("06Sakshi.ss@gmail.com");
		driver.findElement(By.name("fld_password")).sendKeys("123456789");
		driver.findElement(By.name("fld_cpassword")).sendKeys("123456789");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[value='home']")).click();
		driver.findElement(By.name("terms"));
		driver.findElement(By.className("displayPopup")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[class='close']")).click();
		Select gen = new Select(driver.findElement(By.name("sex")));
		//gen.selectByIndex(2);
		//gen.selectByValue("2");
		gen.selectByVisibleText("Female");
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		//con.selectByIndex(2);
		//con.selectByValue("10");
		Select sta = new Select(driver.findElement(By.name("state")));
		sta.selectByVisibleText("Washington");
		Select cit = new Select(driver.findElement(By.name("city")));
		cit.selectByVisibleText("Redmond");
		driver.findElement(By.name("zip")).sendKeys("98052");
		
		
		//driver.close();
		
		
	}
	@Test(enabled=false)
	public void logindata() throws Exception
	{
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("User1");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("User2");
		
	}
	@Test(enabled=false)
	public void browser() throws Exception
	{
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
	}
	

}
