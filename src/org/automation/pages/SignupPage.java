package org.automation.pages;

import org.automation.utilities.Readpropfile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage 
{
	WebDriver driver;
	
	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;		
	}
	public void click_createnewaccountbtn() throws Exception
	{
		 driver.findElement(By.xpath(Readpropfile.readpropertiesdata("login_createnewaccount_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		 driver.findElement(By.name(Readpropfile.readpropertiesdata("signup_firstname_name"))).sendKeys(fname);
	}
	public void enter_lastname(String lname) throws Exception
	{
		 driver.findElement(By.name(Readpropfile.readpropertiesdata("signup_lasttname_name"))).sendKeys(lname);
	}
	public void select_dob_month(String dob_m) throws Exception
	{
		 Select dob_month = new Select(driver.findElement(By.name(Readpropfile.readpropertiesdata("select_month_name"))));
		 dob_month.selectByVisibleText(dob_m);
		
	}
	public void select_dob_day(String dob_d) throws Exception
	{
		 Select dob_day = new Select(driver.findElement(By.name(Readpropfile.readpropertiesdata("select_day_name"))));
		 dob_day.selectByVisibleText(dob_d);
		
	}
	public void select_dob_year(String dob_y) throws Exception
	{
		 Select dob_year = new Select(driver.findElement(By.name(Readpropfile.readpropertiesdata("select_year_name"))));
		 dob_year.selectByVisibleText(dob_y);
		
	}
	public void click_gen_female() throws Exception
	{
		driver.findElement(By.xpath(Readpropfile.readpropertiesdata("click_gen_female_xpath"))).click();
	}
	public void click_gen_male() throws Exception
	{
		driver.findElement(By.xpath(Readpropfile.readpropertiesdata("click_gen_Male_xpath"))).click();
	}
	public void click_gen_custom() throws Exception
	{
		driver.findElement(By.xpath(Readpropfile.readpropertiesdata("click_gen_custom_xpath"))).click();
	}
	public void enter_mob_email(String mob_email) throws Exception
	{
		 driver.findElement(By.name(Readpropfile.readpropertiesdata("select_mob_email_name"))).sendKeys(mob_email);
	}
	public void enter_npass(String passw) throws Exception
	{
		 driver.findElement(By.name(Readpropfile.readpropertiesdata("signup_npass_name"))).sendKeys(passw);
	}
	public void click_signup() throws Exception
	{
		driver.findElement(By.name(Readpropfile.readpropertiesdata("click_signup_name"))).click();
	}
	

}
