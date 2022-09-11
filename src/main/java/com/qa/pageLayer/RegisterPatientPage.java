package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testBase.TestBase;

public class RegisterPatientPage extends TestBase {
	
	public RegisterPatientPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//name of Patient
	
	//Given TexBox
	@FindBy(xpath="//input[@name='givenName']")
	private WebElement Given_textBox;
	
	public void enterInToGivenTextBox(String given)
	{   
		Given_textBox.click();
		Given_textBox.sendKeys(given);
	}
	
	//Middle Textbox
	
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement Middle_textBox;
	
	public void enterInToMiddleTextBox(String middle)
	{   
		Middle_textBox.click();
		Middle_textBox.sendKeys(middle);
	}
	
	//FamilyName Textbox
	
	@FindBy(xpath="//input[@name='familyName']")
	private WebElement Family_Name_textBox;
	
	public void enterInToFamilyNameTextBox(String FamilyName)
	{   
		Family_Name_textBox.click();
		Family_Name_textBox.sendKeys(FamilyName);
	}
	
	//nextButton icon
	
	@FindBy(xpath="//icon[@class='fas fa-chevron-right']")
	private WebElement nextButton_icon;
	
	public void clickOnNextButtonIcon()
	{
		nextButton_icon.click();
	}
	
//	//Gender
//	
//	//male
//	@FindBy(xpath="//option[contains(text(),'Male')]")
//	private WebElement male_option;
//	
//	public void clickOnMaleOption()
//	{
//	  male_option.click();
//	}
//    
	//female
	@FindBy(xpath="//option[contains(text(),'Female')]")
	private WebElement female_option;
	public void clickOnFemaleOption()
	{
	  female_option.click();
	}
//	
//	//BirthDate
//	
//	//Day
//	
	@FindBy(xpath="//input[@id='birthdateDay-field']")
	private WebElement Day_textbox;
	
	public void enterIntoDayTextBox(String day)
	{   
		Day_textbox.clear();
		Day_textbox.sendKeys(day);
	}
	
	//Month Dropdown
	
	@FindBy(xpath="//select[@id='birthdateMonth-field']")
	private WebElement Month_dd;
	
	
	public void selectMonthFromDropDown(String month)
	{   
		Select s = new Select(Month_dd);
		s.selectByVisibleText(month);
	}
//	
//	//Year TextBox
//	
	@FindBy(xpath="//input[@id='birthdateYear-field']")
	private WebElement Year_Textbox;
	
	public void enterIntoYearTextbox(String year)
	{
		Year_Textbox.sendKeys(year);
	}
	
//	
//	//Address
//	
//	//Address
//	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement Address_Textbox;
	
	public void enterInToAddressTextBox(String address1)
	{   
		Address_Textbox.clear();
		Address_Textbox.sendKeys(address1); 	
	}
	
	//Address2
	
	@FindBy(xpath="//input[@id='address2']")
	private WebElement Address2_Textbox;
	
	public void enterInToAddress2TextBox(String address2)
	{   
		Address2_Textbox.clear();
		Address2_Textbox.sendKeys(address2); 	
	}
	
	//City/Village
	
	@FindBy(xpath="//input[@id='cityVillage']")
	private WebElement city_textbox;
	
	public void enterIntoCityTextBox(String city)
	{   
		city_textbox.clear();
		city_textbox.sendKeys(city);
	}
	
	//State/province
	
		@FindBy(xpath="//input[@id='stateProvince']")
		private WebElement State_textbox;
		
		public void enterIntoStateTextBox(String city)
		{   
			State_textbox.clear();
		    State_textbox.sendKeys(city);
		}
	
	//Country
		
			@FindBy(xpath="//input[@id='country']")
			private WebElement Country_textbox;
			
			public void enterIntoCountryTextBox(String country)
			{   
				Country_textbox.clear();
				Country_textbox.sendKeys(country);
			}
			
    //Postal code
			@FindBy(xpath="//input[@id='postalCode']")
			private WebElement Postalcode_textbox;
			
			public void enterIntoPostalCodeTextBox(String postalcode)
			{   
				Postalcode_textbox.clear();
				Postalcode_textbox.sendKeys(postalcode);
			}
			
//   //Phone Number
			@FindBy(xpath="//input[@name='phoneNumber']")
			private WebElement PhoneNumber;
			
			public void enterInToPhoneNumber(String args)
			{   PhoneNumber.clear();
				PhoneNumber.sendKeys("1234567892");
			}
			
//  //Relationship
//  //Relative
//  //select Relationship Type
			@FindBy(xpath="//select[@id='relationship_type']")
			private WebElement realtionType_dropdown;
			
			public void selectRelationshipType(String type)
			{   
				Select s1 = new Select(realtionType_dropdown);
				s1.selectByVisibleText(type);
			}
			
//	// person name
			@FindBy(xpath="//input[@class='person-typeahead ng-pristine ng-untouched ng-valid ng-empty']")
			private WebElement Person_Name_textbox;
			
			public void enterInToPersonNameTextBox(String personName)
			{   Person_Name_textbox.clear();
				Person_Name_textbox.sendKeys(personName);
			}
			
//	// confirm button
			@FindBy(xpath="//input[@id='submit']")
			private WebElement confirm_button;
			
			public void clickOnConfirmButton()
			{
				confirm_button.click();
			}
			
	
}
