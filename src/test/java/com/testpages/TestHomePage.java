package com.testpages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pages.HomePage;

public class TestHomePage extends BaseClass {

	HomePage hp = null;
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		reportInit();
		hp = new HomePage(driver);
		
	}
	
	
	@Test(description = "verify correct username and password login details ")
public void testUsername() {
	hp.enterUsername("sanjay.normaluser");
		hp.clickContinue();
		hp.enterPassword();
		hp.clickSignIn();
		
	}
                           
	
}
