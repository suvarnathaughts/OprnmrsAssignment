package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageLayer.FindPatientRecordPage;
import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.PatientPage;
import com.qa.pageLayer.RequestAppointmentPage;
import com.qa.testBase.TestBase;

public class BookAppointmentTest extends TestBase{
	@Test
	public void verifyBookAppointment() throws InterruptedException
	
	{   
		logger.info("home page is displayed");
		HomePage home3 = new HomePage();
		
		home3.clickOnFindPatientRecord();
		logger.info("clicked on find patient record successfully");
		Thread.sleep(2000);
		
		FindPatientRecordPage page = new FindPatientRecordPage();
		page.enterIntoSearchBox("Mary Robinson");
		logger.info("name of patient entered into search box");
		Thread.sleep(2000);
		
		page.clickOnIdentifier();
		logger.info("clicked on identifier i.e. ID of patient");
		Thread.sleep(2000);
		
		PatientPage patient = new PatientPage();
		Thread.sleep(2000);
		patient.clickOnRequestAppointment();
		logger.info("clicked On Request Appointment link");
		
		Thread.sleep(2000);
		RequestAppointmentPage appointment = new RequestAppointmentPage();
		appointment.enterIntoAppointmentTypeBox("Gyne");
		logger.info("entered appointment type and clicked on autosuggestion first option");
		
		Thread.sleep(2000);
		appointment.ClickOnSaveButton();
		logger.info("clicked On Save button");
		Thread.sleep(2000);
				                            
		String ExpectedName ="Mary";
		String ActualName = patient.getPatientName();
		Assert.assertEquals(ActualName, ExpectedName);
	}

}
