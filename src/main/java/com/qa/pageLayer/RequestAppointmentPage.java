package com.qa.pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class RequestAppointmentPage extends TestBase{
	
	public RequestAppointmentPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Appointment time
	
	@FindBy(xpath="//input[@id='appointment-type']")
	private WebElement Appointment_Type;
	
	@FindBy(xpath="//a[@class='ng-scope ng-binding']")
	private WebElement Appointment_autosuggestion;
	
	public void enterIntoAppointmentTypeBox(String type)
	{
		Appointment_Type.sendKeys(type);
		Appointment_autosuggestion.click();
	}
	

	// Save Button
	
	@FindBy(xpath="//input[@id='save-button']")
	private WebElement Save_button;
	
	public void ClickOnSaveButton()
	{
		Save_button.click();
	}
	
	
}
