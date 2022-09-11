package com.qa.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import com.qa.testBase.TestBase;

public class FileUploading extends TestBase{
	
	public void uploadFile() throws AWTException
	{
		Robot rb = new Robot();
		rb.delay(2000);
		
		//put path to file in clipboard
		
		StringSelection ss = new StringSelection("\"C:\\Users\\bhama\\OneDrive\\Desktop\\Book1.xlsx\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		
		// ctrl+v
		
		rb.keyPress(KeyEvent.VK_CONTROL);  //CTRL
		rb.keyPress(KeyEvent.VK_V);        //PASTE
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL); //releasing keys
		rb.keyRelease(KeyEvent.VK_V);       
		rb.delay(2000);
		
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(2000);
		
	}

}
