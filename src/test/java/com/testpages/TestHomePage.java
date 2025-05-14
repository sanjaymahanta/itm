package com.testpages;

import org.testng.Assert;
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
	hp.enterUsername("sanjay.kmahanta");
		hp.clickContinue();
		hp.enterPassword();
		hp.clickSignIn();
		
		String actualUrl = driver.getCurrentUrl();
	    String expectedUrl = "https://itassetmanagementsoftware.com/rolepermission/dashboard";
	    Assert.assertEquals(actualUrl, expectedUrl, "User did not land on the correct dashboard URL!");
		
	}
                           
	
}
