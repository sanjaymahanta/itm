package com.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class JsExecutorUtils extends BaseClass {

	public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

  
  
    public static void clickElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    
    public static void scrollAndClick(WebElement element) {
        scrollToElement(element);
        clickElement(element);
    }
}
