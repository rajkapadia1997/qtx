package com.qtx.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample1 extends SuperPageObject{

	public DynamicLoadingExample1(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		
	}

	@FindBy(tagName = "button")
	static WebElement start;
	
	@FindBy(id = "finish")
	static WebElement finish;
	
	public DynamicLoadingExample1 clickStartButton() {
		start.click();
		return this;
	}

	public DynamicLoadingExample1 navigate() {
		Navigate("/dynamic_loading/1");
		return this;
	}

	public String waitForTheElementToAppear() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(finish));
		return finish.getText();
		
		
	}

}
