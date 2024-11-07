package org.automation.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Readpropfile 
{
	public static String readconfigdata(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/config.properties");
		Properties pro = new Properties();
		pro.load(fr);
		return pro.get(key).toString();
	}
	
	public static String readpropertiesdata(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/element.properties");
		Properties pro = new Properties();
		pro.load(fr);
		return pro.get(key).toString();
	}

}
