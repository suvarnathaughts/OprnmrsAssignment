package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.PatientPage;
import com.qa.pageLayer.RegisterPatientPage;
import com.qa.testBase.TestBase;

public class RegisterPatientTest extends TestBase{
	@Test
	public void verifyRegisterPatient() throws InterruptedException
	
	{   
		logger.info("Home page is dispalyed");
		Thread.sleep(2000);
		HomePage home1 = new HomePage();
		home1.clickOnRegisterPatientLink();
		logger.info("Clicked on register patient link");
	    
		// patient name   Try To give some different name or data for each execution because , after every execution  patient  got registred
		logger.info("entering patient Name started");
		registerPatient.enterInToGivenTextBox("Ema");
		Thread.sleep(2000);
		registerPatient.enterInToMiddleTextBox("John");
		registerPatient.enterInToFamilyNameTextBox("Clark");
		registerPatient.clickOnNextButtonIcon();
		
		logger.info(" patient Name started successfully");
		Thread.sleep(2000);
		
		// patient gender
		registerPatient.clickOnFemaleOption();
		logger.info("Patient gender get selected");
		
		registerPatient.clickOnNextButtonIcon();
		
		//patient Birthdate
		logger.info("started entering patient Birthdate");
		registerPatient.enterIntoDayTextBox("20");
		registerPatient.selectMonthFromDropDown("May");
		registerPatient.enterIntoYearTextbox("1999");
		registerPatient.clickOnNextButtonIcon();
		logger.info("entered patient Birthdate ");
		Thread.sleep(2000);
		
		// Address of patient
		logger.info("Started entering patient Address");
		registerPatient.enterInToAddressTextBox("USA");
		registerPatient.enterInToAddress2TextBox("Chicago");
		registerPatient.enterIntoCityTextBox("Chicago");
		registerPatient.enterIntoStateTextBox("Chicago");
		registerPatient.enterIntoCountryTextBox("USA");
		registerPatient.enterIntoPostalCodeTextBox("11111");
		registerPatient.clickOnNextButtonIcon();
		logger.info("entered patient Address");
		Thread.sleep(2000);
		
		// Phone number
		logger.info("Started entering patient phone number ");
		registerPatient.enterInToPhoneNumber("1234567886");
		registerPatient.clickOnNextButtonIcon();
		logger.info("entered patient phone number");
		Thread.sleep(2000);
		
		// Realation with patient
		logger.info("entering relation with patient");
		registerPatient.selectRelationshipType("Parent");
		registerPatient.enterInToPersonNameTextBox("nina");
		registerPatient.clickOnNextButtonIcon();
		logger.info("entered relation");
		registerPatient.clickOnConfirmButton();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		// For assertion try to use same name which you have use during record generation
		String ExpectedName = "Ema";
		
		PatientPage patient = new PatientPage();
		Thread.sleep(2000);
		String actualName = patient.getPatientName();
		Assert.assertEquals(actualName, ExpectedName);
		
	}

}
