package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class PatientPage extends TestBase {
	
	public PatientPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// name of patient
	
	@FindBy(xpath="//span[@class='PersonName-givenName']")
	private WebElement patientName;
	
	public String getPatientName()
	{
		 String patient = patientName.getText();
		 return patient;
	}
	
	//id of patient
	
	@FindBy(xpath="//span[contains(text(),'100Y4N')]")
	private WebElement id;
	
	public String getID()
	{
		String Id = id.getText();
		return Id;
	}
	
	//Height of patient
	
	@FindBy(xpath="//span[@id='height']")
	private WebElement Height;
	
	public String getHeight()
	{
		String height = Height.getText();
		return height;
	}
	
	// weight of patient
	
	@FindBy(xpath="//span[@id='weight']")
	private WebElement weight;
	
	public String getWeight()
	{
		String Weight = weight.getText();
		return Weight;
	}
    
	//BMI of patient
	
	@FindBy(xpath="//span[@id='calculated-bmi']")
	private WebElement BMI;
	
	public String getBMI()
	{
		String bmi = BMI.getText();
		return bmi;
	}
	
	//Blood Pressure of patient
	
	@FindBy(xpath="//span[@id='bp_systolic']")
	private WebElement bp;
	
	public String getBP()
	{
		String BP = bp.getText();
		return BP;
	}
	
	//Heart Rate(pulse)
	
	@FindBy(xpath="//span[@id='heart_rate']")
	private WebElement pulse;
	
	public String getPulse()
	{
		String Pulse = pulse.getText();
		return Pulse;
	}
	
	// Delete Patient
	
	@FindBy(xpath="//div[contains(text(),'Delete Patient')]")
	private WebElement Delete_link;
	
	public void clickOnDeleteLink()
	{
		Delete_link.click();
	}
	
	// Reason for deleting patient box
	
	@FindBy(xpath="//input[@id='delete-reason']")
	private WebElement Reason_textBox;
	
	public void enterIntoReasonTextBox(String msg)
	{
		Reason_textBox.sendKeys(msg);
	}
	
	// Confirm button
	
	@FindBy(xpath="(//button[@class='confirm right'])[6]")
	private WebElement confirmButton;
	
	public void clickOnConfirmButton()
	{
		confirmButton.click();
	}
	
	// Attachment link
	
	@FindBy(xpath="(//div[@class='col-11 col-lg-10'])[10]")
	private WebElement Attachment_link;
	
	public void clickOnAttachment()
	{
		Attachment_link.click();
	}
	
	// Request appointment link
	
	@FindBy(xpath="//div[contains(text(),'Request Appointment')]")
	private WebElement Request_appointment_link;
	
	public void clickOnRequestAppointment()
	{
		Request_appointment_link.click();
	}
	
	// Appointments
	
	@FindBy(xpath="//ul[ @id='miniPatientAppointmentRequests']/li[3]")
	private WebElement appointment_text;
	
	public String getAppointmentText()
	{
		String text = appointment_text.getText();
		return text;
	}
	
	// Success msg after deleting patient
	
	@FindBy(xpath="//p[text()='Patient has been deleted successfully']")
	private WebElement msg;
	
	public String getDeleteSuccessMsg()
	{
		String SuccessMsg = msg.getText();
		return SuccessMsg;
	}
} 
