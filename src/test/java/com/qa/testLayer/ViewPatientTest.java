package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageLayer.FindPatientRecordPage;
import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.PatientPage;
import com.qa.testBase.TestBase;

public class ViewPatientTest extends TestBase {
	@Test
	public void verifyViewPatient() throws InterruptedException
	{   //Home page
		logger.info("Home page is dispalyed");
		HomePage home3 = new HomePage();
		home3.clickOnFindPatientRecord();
		logger.info("Clicked on find patient record");
		Thread.sleep(2000);
		
		// Find patient record page
		logger.info("Find Patient record page is dispalyed");
		FindPatientRecordPage page = new FindPatientRecordPage();
		page.enterIntoSearchBox("1001RA");
		logger.info("entered ID in to search box");
		Thread.sleep(2000);
		page.clickOnIdentifier();
		logger.info("Clicked on ID");
		Thread.sleep(2000);
		
		//Patient page
		
		PatientPage patient = new PatientPage();
		String ExpectedHeight = "91cm";
		String actHeight=patient.getHeight();
		
		Assert.assertEquals(actHeight, ExpectedHeight);
		logger.info("Assertion for height successfull");
		
		String Expectedweight = "58kg";
		String actualWeight = patient.getWeight();
		
		Assert.assertEquals(actualWeight, Expectedweight);
		logger.info("Assertion for Weight successfull");
		
		String ExpectedBmi = "70.0";
		String ActualBmi = patient.getBMI();
		
		Assert.assertEquals(ActualBmi, ExpectedBmi);
		logger.info("Assertion for BMI successfull");
		
		String ExpectedBP = "71";
		String ActualBP = patient.getBP();
		
		Assert.assertEquals(ActualBP, ExpectedBP);
		logger.info("Assertion for BP successfull");
		
		String ExpectedPulse = "85/min";
		String ActualPulse = patient.getPulse();
		
		Assert.assertEquals(ActualPulse, ExpectedPulse);
		logger.info("Assertion for pulse successfull");
		Thread.sleep(2000);
		
		
	}

}
