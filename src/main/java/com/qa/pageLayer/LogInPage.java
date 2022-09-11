package com.qa.pageLayer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.testBase.TestBase;

public class LogInPage extends TestBase{
	
	public LogInPage()
	{
		PageFactory.initElements(driver, this);
	}
	// Username Textbox
	@FindBy(xpath="//input[@id='username']")
	private WebElement Username_textBox;
	
	public void enterInToUsernameTextBox(String username)
	{   
		Username_textBox.clear();
		Username_textBox.sendKeys(username);
	}
    
	//Password TextBox
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password_textBox;
	
	public void enterInToPasswordTextBox(String password)
	{   
		Password_textBox.clear();
		Password_textBox.sendKeys(password);
	}
	
	//Location for this session InPatient Ward
	
	@FindBy(xpath="//li[@id='Inpatient Ward']")
	private WebElement InPatientWard;
	
	public void clickOnInPatientWard()
	{
		InPatientWard.click();
	}
	
	//LogIn button
	
	@FindBy(xpath="//input[@id='loginButton']")
	private WebElement logIn_Button;
	
	public void clickOnLogInButton()
	{
		logIn_Button.click();
	}
	
	
	 
	 
}
