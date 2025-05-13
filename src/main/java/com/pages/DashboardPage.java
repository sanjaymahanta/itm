package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.JsExecutorUtils;
import com.utilities.WaitUtils;

public class DashboardPage {

	
	
	

	@FindBy(xpath = "//strong[text()='Users']") 
	WebElement usersField;
	
	@FindBy(css = "div.input-group.table-search-btns input") 
	WebElement searchTextbox;
	
	@FindBy(css = "i.ps-icon.plain-search-icon") 
	WebElement searchIcon;
	
	@FindBy(css = "//i[@class='fa fa-cog']") 
	WebElement settingIcon;
	
	@FindBy(css = "//i[@class='fa fa-trash']") 
	WebElement delete;

	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickUsers( ) {
		WaitUtils.waitElement(usersField);
		JsExecutorUtils.scrollAndClick(usersField);
	        

	}

	public void clickSerach() {
		searchTextbox.click();
		searchTextbox.sendKeys("sanjay.normaluser");
	}
	
	public void clickSearchIcon() {
		searchIcon.click();
	}
	
	public void clickSettingIcon() {
		settingIcon.click();
	}
	
	public void deleteUser() {
		delete.click();
	}
}
