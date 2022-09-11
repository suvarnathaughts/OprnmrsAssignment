package com.qa.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class ListnerSetUp extends TestBase implements ITestListener {
   
	Logger	logger =  Logger.getLogger("Openmrs");
   	
	@Override
	public void onTestStart(ITestResult result) {
		
		logger.info("Test Execution Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		logger.info("Test Execution Completed");

		
			}

	@Override
	public void onTestFailure(ITestResult result) {
		
		logger.info("Test Execution Failed");
		
	    ScreenShots.TakesSS(result.getName()+System.currentTimeMillis());

			}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		logger.info("Test Execution Skipped");

			}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
			}

	@Override
	public void onFinish(ITestContext context) {
			}
	
	
        
	
	
	

}
