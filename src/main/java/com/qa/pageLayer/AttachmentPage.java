package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class AttachmentPage extends TestBase{
	
	public AttachmentPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Click and drop here button
	
	@FindBy(xpath="//div[contains(text(),'Click or drop a file here.')]")
	private WebElement click_and_drop_here;
	
	public void clickOnClickAndDrop()
	{
		click_and_drop_here.click();
	}
	
	
    // Upload file button
	
	@FindBy(xpath="//button[contains(text(),'Upload file')]")
	private WebElement upload_file_button;
	
	public void clickOnUploadFileButton()
	{
		upload_file_button.click();
	}
	
	// Caption textbox
	
	@FindBy(xpath="//textarea[@placeholder='Enter a caption']")
	private WebElement Caption_textBox;
	
	public void enterIntoCaptionTextAreaBox(String msg)
	{
		Caption_textBox.sendKeys(msg);
	}
	
	// file uploaded successfully popup
	
	@FindBy(xpath="//p[text()='The attachment was successfully uploaded.']")
	private WebElement suceess_popup;
	
	public String getSuccessMsg()
	{
		String msg = suceess_popup.getText();
		return msg;
	}
	
	
	
	
	
}
