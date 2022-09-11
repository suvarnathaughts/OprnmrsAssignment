package com.qa.testLayer;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageLayer.AttachmentPage;
import com.qa.pageLayer.FindPatientRecordPage;
import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.PatientPage;
import com.qa.testBase.TestBase;
import com.qa.utilities.FileUploading;


public class AddAttachmentOfPatient extends TestBase{
	@Test
	public void verifyAddAttachmentOfPatient() throws InterruptedException, AWTException
	{   
		logger.info("home is displayed");
		HomePage home3 = new HomePage();
		
		home3.clickOnFindPatientRecord();
		logger.info("Clicked on Find Patient Record link");
		Thread.sleep(2000);
		
		logger.info("we are on Find Patient record page");
		FindPatientRecordPage page = new FindPatientRecordPage();
		
		page.enterIntoSearchBox("100J7W");
		logger.info("entered ID  in search box");
		Thread.sleep(2000);
		
		page.clickOnIdentifier();
		logger.info("clicked on identifier");
		Thread.sleep(2000);
		
		logger.info("Patient page is dispalyed");
		PatientPage patient = new PatientPage();
		Thread.sleep(2000);
		patient.clickOnAttachment();
		logger.info("Clicked on attachment link");
		
		Thread.sleep(2000);
		
		logger.info("Attachment page is displayed");
		AttachmentPage attach = new AttachmentPage();
		
		attach.clickOnClickAndDrop();
		logger.info("clicked on click and drop link successfully");
		FileUploading upload = new FileUploading();
		
		upload.uploadFile();
		logger.info("File uploaded");
		
		attach.enterIntoCaptionTextAreaBox("I have uploaded file");
		logger.info("Entered text into Caption text area");
		
		attach.clickOnUploadFileButton();
		logger.info("clicked on file upload button successfully");
		Thread.sleep(2000);
		
		String ExpectedSuccessMsg = "The attachment was successfully uploaded.";
		String ActualSuccessMsg = attach.getSuccessMsg();
		Assert.assertEquals(ActualSuccessMsg, ExpectedSuccessMsg);
		
		
		
	}

}
