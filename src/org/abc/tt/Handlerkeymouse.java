package org.abc.tt;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Handlerkeymouse 
{

	WebDriver driver;
	@Test(enabled=false)
	public void keybord() throws Exception
	{
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Actions act =new Actions(driver);
		act.sendKeys("sakku").perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.BACK_SPACE).perform();
		act.sendKeys("sakshi").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("123456").perform();
		act.sendKeys(Keys.ENTER).perform();
		Rresultsscreenshot.capturescreen(driver ,"keybord");
	
	}
	@Test(enabled=true)
	public void mouse() throws Exception
	{
		driver = new EdgeDriver();
		driver.get("https://www.mphasis.com/home.html");
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		
		//act.moveToElement(driver.findElement(By.xpath("//a[text()=\"Careers\"]"))).perform();
		//act.click(driver.findElement(By.xpath("//a[text()=\"Our Approach\"]"))).perform();
		//act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality Services')]"))).perform();
		//act.click(driver.findElement(By.xpath("//span[text()=\" Insurance \"]"))).perform();
		
		driver.findElement(By.xpath("//a[text()='Careers']")).click();
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[contains(text(),' Click Here to Know More ')]")).click();
		//driver.findElement(By.xpath("//a[text()=\"Explore Jobs\"]")).click();
		act.moveToElement(driver.findElement(By.xpath("//a[text()=\"Explore Jobs\"]"))).perform();
		
		
		
		//driver.findElement(By.id("[id='searchJob']")).click();
		/*
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[text()=\" Hi-Tech \"]"))).keyDown(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality Services')]"))).keyUp(Keys.CONTROL).perform();
		Set<String> wins = driver.getWindowHandles();
		Iterator<String> itr = wins.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		String win3 = itr.next();
		driver.switchTo().window(win2);
		Thread.sleep(5000);
		driver.switchTo().window(win3);
		Thread.sleep(5000);
		driver.switchTo().window(win1);
		Thread.sleep(5000);
		driver.switchTo().window(win2);
		Thread.sleep(5000);
		driver.switchTo().window(win3);
		Thread.sleep(5000);
		driver.switchTo().window(win1);*/
		
		}
	@Test(enabled=false)
	public void alerthandlers()
	{
		driver = new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.className("signinbtn")).click();
		driver.switchTo().alert().accept();
	}
	@Test(enabled=false)
	public void frame() throws Exception
	{
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/frames#google_vignette");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample')]")).getText());
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).getText());
		Rresultsscreenshot.capturescreen(driver ,"frame");
	}
	
	
}
