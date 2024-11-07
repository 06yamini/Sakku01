package org.automation.testcases;

import org.automation.datagenerator.TestdataGenarator;
import org.automation.pages.LoginPage;
import org.automationbase.Initiatebrowser;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Loginsenario extends Initiatebrowser 
{
	@Test(dataProvider="DDF",dataProviderClass=TestdataGenarator.class)
	public void tc01_validate_validcredntl_loginfunc(String username,String password) throws Exception
	{
		
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbtn();
	}
	

}
