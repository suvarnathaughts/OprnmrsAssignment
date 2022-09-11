package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageLayer.FindPatientRecordPage;
import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.PatientPage;
import com.qa.testBase.TestBase;

public class FindPatientRecordTest extends TestBase {
	@Test
	public void verifyFindPatientRecord() throws InterruptedException
	{   
        logger.info("Home page displayed");
		HomePage home3 = new HomePage();
		
		home3.clickOnFindPatientRecord();
		logger.info("Clicked on find patient record link");
		Thread.sleep(2000);
		
		FindPatientRecordPage page = new FindPatientRecordPage();
		page.enterIntoSearchBox("100K26");
		logger.info("entered patient name in search box");
		
		page.clickOnIdentifier();
		logger.info("clicked on ID of patient");
		Thread.sleep(2000);
		
		logger.info("Patient page displayed");
		PatientPage patient = new PatientPage();
		Thread.sleep(2000);
	
		String actualName = patient.getPatientName();
		String ExpectedName = "Ema";
		Assert.assertEquals(actualName, ExpectedName);
		
		logger.info("Patient record is found");
	}

}
