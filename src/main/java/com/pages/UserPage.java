package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
import com.utilities.ActionUtils;
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
		delete.click();
		selectOption.click();
		promptSucces.click();
		
	}
	
	public void clickRestoreUser() {
		showDeletedUserIcon.click();
		hoverOverSettingIcon(driver);
		restoringUser.click();
	}
	
	
	public void applicationLogout()  {
		WaitUtils.waitElement(logoutDropdown);
		logoutDropdown.click();
		WaitUtils.waitElement(logout);
		logout.click();
	}
	
	}
	

