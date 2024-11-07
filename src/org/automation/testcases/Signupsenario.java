package org.automation.testcases;

import org.automation.pages.SignupPage;
import org.automationbase.Initiatebrowser;
import org.testng.annotations.Test;

public class Signupsenario extends Initiatebrowser
{
	@Test
	public void tc02_signup_registration_validation() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccountbtn();
		sign.enter_firstname("sakshi");
		sign.enter_lastname("fnu");
		sign.select_dob_month("Jan");
		sign.select_dob_day("6");
		sign.select_dob_year("1989");
		sign.click_gen_female();
		//sign.click_gen_male();
		//sign.click_gen_custom();
		sign.enter_mob_email("4255085697");
		sign.enter_npass("123456789");
		sign.click_signup();
	}

}
