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
	}
}
