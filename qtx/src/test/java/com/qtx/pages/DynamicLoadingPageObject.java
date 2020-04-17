package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicLoadingPageObject extends SuperPageObject{

	public DynamicLoadingPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		
	}

	public DynamicLoadingPageObject navigate() {
		Navigate("/dynamic_loading");
		return this;
	}
	
	@FindBy(className = "example")
	WebElement example;

	public DynamicLoadingPageObject selectHiddenElementExample() {
		example.findElement(By.partialLinkText("Example 1")).click();
		driver.switchTo().window(driver.getWindowHandle());
		return this;
		
		
	}

	public DynamicLoadingPageObject selectElementRendersAfterExample() {
		example.findElement(By.partialLinkText("Example 2")).click();
		driver.switchTo().window(driver.getWindowHandle());
		return this;
		
	}

}
