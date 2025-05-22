package com.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.utilities.ActionUtils;
import com.utilities.DropdownUtils;
import com.utilities.WaitUtils;

public class UserPage extends BaseClass {

	@FindBy(css = "div.input-group.table-search-btns input")
	WebElement searchTextbox;

	@FindBy(css = "i.ps-icon.plain-search-icon")
	WebElement searchIcon;

	@FindBy(xpath = "//i[@class='fa fa-cog']")
	WebElement settingIcon;

	@FindBy(xpath = "//i[@class='fa fa-trash']")
	WebElement delete;
	
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement selectOption;
	
	
	@FindBy(xpath = "//button[text()='OK']")
	WebElement promptSucces;
	
	@FindBy(xpath = "//i[@class='ps-icon fa fa-recycle']")
	WebElement showDeletedUserIcon;
	
	@FindBy(css = ".username.hidden-xs")
	WebElement logoutDropdown;
	
	@FindBy(xpath = "//i[@class='demo-pli-unlock']")
	 WebElement logout;
	
	@FindBy(xpath = "//i[@class='fa fa-recycle']")
	WebElement restoringUser;
	
	@FindBy(xpath = "//span[text()='Please enter valid username to continue']")
	WebElement captureMessageDU;
	
	@FindBy(xpath = "//i[@class='ps-icon fa fa-plus']")
	WebElement addUser;
	
	@FindBy(css = "input[placeholder='Enter First Name']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastName;
	
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	
	@FindBy(css = "#location_id")
	WebElement location;
	

	
	
	

	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickSerach() {
		searchTextbox.click();
		searchTextbox.sendKeys("sanjay.normaluser");
	}

	public void clickSearchIcon() {
		searchIcon.click();
	}

	public void hoverOverSettingIcon(WebDriver driver) {
		WaitUtils.waitElement(settingIcon);
		ActionUtils.hoverOverElement(driver, settingIcon);
	}

	public void deleteUser() {
	    WaitUtils.waitUntilClickable(delete);
	    delete.click();
	    WaitUtils.waitUntilClickable(selectOption);
	    selectOption.click();
	    WaitUtils.waitUntilClickable(promptSucces);
	    promptSucces.click();
	}

	
	public void clickRestoreUser() {
		showDeletedUserIcon.click();
		hoverOverSettingIcon(driver);
		restoringUser.click();
	}
	
	
	public void applicationLogout() {
	    try {
	        WaitUtils.waitElement(logoutDropdown);
	        logoutDropdown.click();
	        WaitUtils.waitElement(logout);
	        logout.click();
	    } catch (NoSuchElementException e) {
	        System.out.println("User is probably already logged out or element not found.");
	    }
	}
	
	
	public void checkUserWithRegisteredEmail(String fName, String lName, String uname, String pass, String mail,String locationName) {
		WaitUtils.waitUntilClickable(addUser);
		addUser.click();
		WaitUtils.waitUntilClickable(firstName);
		firstName.click();
		firstName.sendKeys(fName);
		WaitUtils.waitUntilClickable(lastName);
		lastName.click();
		lastName.sendKeys(lName);
		
		WaitUtils.waitUntilClickable(username);
	    username.click();
	    username.sendKeys(uname);
	    
	    WaitUtils.waitUntilClickable(password);
	    password.click();
	    password.sendKeys(pass);
	    
	    WaitUtils.waitUntilClickable(email);
	    email.click();
	    email.sendKeys(mail);
		DropdownUtils.selectByVisibleText(location, locationName);
		
		
	}

}
	
	

