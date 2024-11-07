package org.automation.pages;

import org.automation.utilities.Readpropfile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;	 	
	}
	public void enter_username(String Uname) throws Exception
	{
		 driver.findElement(By.id(Readpropfile.readpropertiesdata("login_username_id"))).sendKeys(Uname);
	}
	public void enter_password(String pass) throws Exception
	{
		 driver.findElement(By.name(Readpropfile.readpropertiesdata("login_password_id"))).sendKeys(pass);
	}
	public void click_loginbtn() throws Exception
	{
		 driver.findElement(By.xpath(Readpropfile.readpropertiesdata("login_loginbtn_xpath"))).click();;
	}

}
