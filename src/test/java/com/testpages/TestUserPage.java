package com.testpages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pages.DashboardPage;
import com.pages.HomePage;
import com.pages.UserPage;
import com.utilities.WaitUtils;

public class TestUserPage extends BaseClass {

	HomePage hp;
	DashboardPage dp;
	UserPage up;

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

	@Test(description = "To Test Deleted user should be reinstated by restore" ,enabled = false)
	public void testRestoreUser() {
		dp.clickUsers();
		UserPage up = new UserPage(driver);
		up.clickSerach();
		up.clickSearchIcon();
		up.hoverOverSettingIcon(driver);
		up.deleteUser();
		up.clickRestoreUser();

	}
	
	

	@Test(description = "To Test Deleted user should not be login in application" )
	public void testDeletedUser()   {
		dp.clickUsers();
		UserPage up = new UserPage(driver);
		up.clickSerach();
		up.clickSearchIcon();
		up.hoverOverSettingIcon(driver);
		up.deleteUser();
		up.applicationLogout();
		
//		hp.enterUsername("sanjay.normaluser");
//		hp.clickContinue();
//		hp.enterPassword();
//		hp.clickSignIn();
		

	}
	
}
