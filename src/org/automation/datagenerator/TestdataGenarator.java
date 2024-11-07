package org.automation.datagenerator;

import org.testng.annotations.DataProvider;

public class TestdataGenarator 
{
	@DataProvider(name="DDF")
	public Object[][] testdata()
	{
		Object [] [] data1= {{"user1","pass1"},{"user1","pass1"},{"user1","pass1"},{"user1","pass1"}};
		return data1;
	}

}
