package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageLayer.FindPatientRecordPage;
import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.PatientPage;
import com.qa.testBase.TestBase;

public class DeletePatientTest extends TestBase {
	@Test
	public void verifyDeletePatient() throws InterruptedException
	{   
		logger.info("Home page is displayed");
		HomePage home3 = new HomePage();
		
		home3.clickOnFindPatientRecord();
		logger.info("clicked On Find Patient record link");
		Thread.sleep(2000);
		
		FindPatientRecordPage page = new FindPatientRecordPage();
		
		// Try to Use different Id for each execution beacuse after execution record get deleted
		
		page.enterIntoSearchBox("100K6X"); 
		logger.info("entered patient ID into search box on Find patient record page");
		
		page.clickOnIdentifier();
		logger.info("clicked On ID displayed in Records of patient ");
		
		Thread.sleep(2000);
		
		PatientPage patient = new PatientPage();
		patient.clickOnDeleteLink();
		logger.info("clicked On Delete link on Patient Page");
		
		patient.enterIntoReasonTextBox("not needed");
		logger.info("enter reason in textbox displayed after clicking delete patient link");
		
		patient.clickOnConfirmButton();
		logger.info("Clicked on confirm button");
		//Thread.sleep(2000);
		 
		Thread.sleep(2000);
		String ExpectedMsg = "Patient has been deleted successfully";
		String ActualMsg = patient.getDeleteSuccessMsg();
		
		Assert.assertEquals(ActualMsg, ExpectedMsg);
	}

}
