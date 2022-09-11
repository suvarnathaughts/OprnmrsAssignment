
package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.testBase.TestBase;

public class ScreenShots extends TestBase {
	
	static String path ="//Openmrs//Screenshots//";
	
	public static void  TakesSS(String filename) 
	{   try {
		TakesScreenshot ts =  (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File des = new File(path+filename+".png");
		
		FileHandler.copy(src, des);
	}
	catch(IOException e)
	{
		e.printStackTrace();
		System.out.println("please provide correct path");
		
	}
}
}