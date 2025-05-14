package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.WaitUtils;

public class DashboardPage {

	

	@FindBy(xpath = "//strong[text()='Users']") 
	WebElement usersField;
	
	
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickUsers( ) {
		WaitUtils.waitElement(usersField);
	 
	}
	
}
