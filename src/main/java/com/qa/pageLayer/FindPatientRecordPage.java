package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class FindPatientRecordPage extends TestBase{
	
	public FindPatientRecordPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Serach box
	
	@FindBy (xpath="//input[@id='patient-search']")
	private WebElement search_box;
	
	public void enterIntoSearchBox(String name)
	{
		search_box.sendKeys(name);
	}
	
	// id of patient 
	
	@FindBy(xpath="//tbody/tr[1]/td[1]")
	private WebElement Ientifier;
	
	public void clickOnIdentifier()
	{
		Ientifier.click();
	}

}
