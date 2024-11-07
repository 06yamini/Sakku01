package org.abc.tt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Waitswebdriver 
{
	WebDriver driver;
	@Test
	public void logindata() throws Exception
	{
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		driver.manage().window().maximize();
		/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.linkText("Already have an account?")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("email")).sendKeys("Ymukherjee6@gmail.com ");
		driver.findElement(By.name("pass")).sendKeys("9501281809$Ss");
		driver.findElement(By.name("login")).click(); 
		*/
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("sakshi");
		driver.findElement(By.name("lastname")).sendKeys("Sakku");
		Select date = new Select(driver.findElement(By.id("month")));
		date.selectByVisibleText("Jan");
		Select da = new Select(driver.findElement(By.id("day")));
		da.selectByValue("6");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1989");
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(30));
		//w.until(ExpectedConditions.textMatches(driver.findElement(By.id("month"), "Dec"));
	
		
		w.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("month")), "Dec"));
		date.deselectByVisibleText("Jan");
		 
		
		
	} 

}
