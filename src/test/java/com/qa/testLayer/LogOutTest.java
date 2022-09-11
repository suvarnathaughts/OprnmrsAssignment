package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageLayer.HomePage;
import com.qa.testBase.TestBase;

public class LogOutTest extends TestBase{
	@Test
	public void verifyLogOut()
	
	{ 
		
		logger.info("We are on HomePage now");
		HomePage home = new HomePage();
		home.clickOnLogOutLink();
		logger.info("Clicked on logout link");
		logger.info("We are on Login page Now");
		String ExpecetedTitle = "Login";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, ExpecetedTitle);
		logger.info("Assertion get passed");
	}

}
