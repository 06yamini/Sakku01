package org.abc.tt;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Rresultsscreenshot 
{
	  public static void capturescreen( WebDriver driver ,String name) throws Exception
	  {
		   TakesScreenshot ts = (TakesScreenshot) driver;
		   File f = ts.getScreenshotAs(OutputType.FILE);
		   File fd = new File("./results/" + name +".png");
		   FileUtils.copyFile(f, fd);
		    	   
	  }

}
