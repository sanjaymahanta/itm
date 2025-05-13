package com.testpages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pages.DashboardPage;
import com.pages.HomePage;

public class TestDashboardPage extends BaseClass{

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
        hp.enterUsername("sanjay.normaluser");
        hp.clickContinue();
        hp.enterPassword();
        hp.clickSignIn();
        dp = new DashboardPage(driver);
    }

    @Test(description = "To Test Deleted user should be reinstated by restore")
    public void testRestoreUser() {
        dp.clickUsers();
        
    }
}

	
	
	

