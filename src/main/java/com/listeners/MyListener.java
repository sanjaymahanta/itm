package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import com.aventstack.extentreports.Status;
import com.baseclass.BaseClass;
import com.utilities.DriverUtils;

public class MyListener extends BaseClass  implements ITestListener{

	
	@Override
	public void onTestStart(ITestResult result) {
	test = report.createTest(result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	test.log(Status.PASS, "testcase is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "testcase is failed");
		String path =DriverUtils.getScreenshot(result.getName());
		test.addScreenCaptureFromPath(path);
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "testcase is skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}

	@Override
	public void onStart(ITestContext context) {
	
		
	}

	@Override
	public void onFinish(ITestContext context) {
	report.flush();
		
	}
}
