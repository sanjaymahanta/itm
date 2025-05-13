package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id = "username")
	WebElement usernameField;

	@FindBy(xpath = "//span[text()='Continue']") 
	WebElement continueButton;
	
	@FindBy(css = "#password") 
	WebElement passwordField;
	
	@FindBy(css = "button#btnSubmit") 
	WebElement signIn;
	
	

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String username) {
	            usernameField.sendKeys(username);

	}

	public void clickContinue() {
		continueButton.click();
	}
	
	public void enterPassword() {
		
		passwordField.click();
		passwordField.sendKeys("sanjay.kmahanta");
	}
	
	public void clickSignIn() {
		signIn.click();
	}
}
