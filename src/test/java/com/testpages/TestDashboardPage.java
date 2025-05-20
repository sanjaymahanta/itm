package com.testpages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pages.DashboardPage;
import com.pages.HomePage;

public class TestDashboardPage extends BaseClass {

	HomePage hp;
	DashboardPage dp;

	@BeforeMethod
	public void setup() {
		initialization();
		reportInit();
		loginToDashboard();
	}

	public void loginToDashboard() {
		hp = new HomePage(driver);
		hp.enterUsername("sanjay.kmahanta");
		hp.clickContinue();
		hp.enterPassword();
		hp.clickSignIn();
		dp = new DashboardPage(driver);
		
	}
	
	
	@Test(description = "to test user is reinstated")
	public void clickUsers() {
		
	dp.clickUsers();
	}

	
}
