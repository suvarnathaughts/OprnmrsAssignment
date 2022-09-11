package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase {
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// LogOut icon link
	@FindBy(xpath="//i[@class='icon-signout small']")
	private WebElement logout_link ;
	
	public void clickOnLogOutLink()
	{
		logout_link.click();
	}
	
	//Register a Patient Link
	
	@FindBy(xpath="//i[@class='icon-user']")
	private WebElement Register_Patient_Link;
	
	public void clickOnRegisterPatientLink()
	{
		Register_Patient_Link.click();
	}
	
	//Find Patient Record Link 
	
	@FindBy(xpath="//i[@class='icon-search']")
	private WebElement Find_patient_record;
	
	public void clickOnFindPatientRecord()
	{
		Find_patient_record.click();	
	}
}
