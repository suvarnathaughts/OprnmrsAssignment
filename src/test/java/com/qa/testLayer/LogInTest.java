package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageLayer.LogInPage;
import com.qa.testBase.TestBase;

public class LogInTest extends TestBase {
	@Test
	public void VerifyLogIn()
	
	{   // Whenever you want to execute login first hide the login code inside testbase and then execute this testscript
		
//		LogInPage login = new LogInPage();
//	   	login.enterInToUsernameTextBox("Admin");
//	   	login.enterInToPasswordTextBox("Admin123");
//	   	login.clickOnInPatientWard();
//	   	login.clickOnLogInButton();
	   	String ExpectedTitle =  "Home";
	   	String ActualTitle = driver.getTitle();
	   	Assert.assertEquals(ActualTitle, ExpectedTitle);
	   	
	}

}
