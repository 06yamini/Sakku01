package org.automationbase;

import java.time.Duration;

import org.automation.utilities.Readpropfile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Initiatebrowser 
{
	public WebDriver driver;
	
    @BeforeMethod
	public void lounchbrowser() throws Exception
	{
    	if (Readpropfile.readconfigdata("BrowserName").equalsIgnoreCase("Chrome"))
    	{
    		driver = new ChromeDriver();
    	}
    	else if (Readpropfile.readconfigdata("BrowserName").equalsIgnoreCase("Edge"))
    	{
    		driver = new EdgeDriver();
    	}
    	else
    	{
    		driver = new ChromeDriver();
    	}
    	driver.get(Readpropfile.readconfigdata("LoginUrl"));
    	driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	
    	
	}
	
    
    @AfterMethod
	public void closehbrowser()
	{
    	//driver.quit();
		
	}
}
