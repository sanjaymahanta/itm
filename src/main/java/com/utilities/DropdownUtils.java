package com.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;

public class DropdownUtils extends BaseClass{

	
	

	  
	    public static void selectByVisibleText(WebElement element, String text) {
	        Select select = new Select(element);
	        select.selectByVisibleText(text);
	    }

	 
	    public static void selectByValue(WebElement element, String value) {
	        Select select = new Select(element);
	        select.selectByValue(value);
	    }
}
