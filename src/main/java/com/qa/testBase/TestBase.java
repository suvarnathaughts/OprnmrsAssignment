package com.qa.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.LogInPage;
import com.qa.pageLayer.PatientPage;
import com.qa.pageLayer.RegisterPatientPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static LogInPage login;
//	public static HomePage home;
	public  RegisterPatientPage registerPatient;
//	public static PatientPage patient;
	public Logger logger;
	@BeforeClass
    public void start()
    {
	   	logger =  Logger.getLogger("Openmrs");
	   	PropertyConfigurator.configure("Log4j.properties");
	   	logger.info("*********************Execution Started**************************");
    }
    @AfterClass
   public void stop()
   {
   	
   	 logger.info("************************Execution stopped**************************");
   }
	
	
	
	
	@Parameters("browser")
	@BeforeMethod
	public void SetUp(String browser)
	{  
	   
       if(browser.equalsIgnoreCase("chrome"))
       {   logger.info("Chrome Browser invoked");
    	   WebDriverManager.chromedriver().setup();
    	   driver= new ChromeDriver();
       }
       else if(browser.equalsIgnoreCase("firefox"))
       {   logger.info("Firefox Browser invoked");
    	   WebDriverManager.firefoxdriver().setup();
    	   driver = new FirefoxDriver();
       }
       else if(browser.equalsIgnoreCase("edge"))
       {   logger.info("Edge Browser invoked");
    	   WebDriverManager.edgedriver().setup();
    	   driver = new EdgeDriver();
       }
       else
       {   logger.info("Chrome Browser invoked");
    	   WebDriverManager.chromedriver().setup();
    	   driver= new ChromeDriver();
       }
       
       logger.info("browser invoked successfully");
       
       driver.get("https://demo.openmrs.org/openmrs/");
       logger.info("url launched successfully");
       
       driver.manage().window().maximize();
       logger.info("window get maximized");
       
       driver.manage().deleteAllCookies();
       logger.info("Cookies deleted successfully");
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       logger.info("implicit wait get applied");
       
       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
       logger.info("pade loading timeout applied");
       
       login = new LogInPage();
       logger.info("we are on login page ");
       
       login.enterInToUsernameTextBox("Admin");
       logger.info("Username entered successfully");
       
	   login.enterInToPasswordTextBox("Admin123");
	   logger.info("Password entered successfully");
	   
	   login.clickOnInPatientWard();
	   logger.info("Clicked on InpatientWard option");
	   
	   login.clickOnLogInButton();
	   logger.info("Clicked on login button");
	   

      
       //home = new HomePage();
       registerPatient = new RegisterPatientPage();
      // patient = new PatientPage();
	}
	
	@AfterMethod
	public void tearDown()
	{   
		driver.quit();
		logger.info("all windows get closed of open browser");
	}
	
	

}
