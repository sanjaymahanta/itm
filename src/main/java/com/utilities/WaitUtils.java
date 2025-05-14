package com.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.BaseClass;


public class WaitUtils extends BaseClass {


		public static void waitElement( WebElement element ) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				 wait.until(ExpectedConditions.elementToBeClickable(element));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		  }
		  
		  public static void waitApplication() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  }
	
		  
}
