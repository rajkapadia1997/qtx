package com.qtx.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class SuperPageObject {
	protected WebDriver driver;
	private String BaseUrl;
	
	protected SuperPageObject(WebDriver driverInstance, String baseUrl) {
		
		driver = driverInstance;
		PageFactory.initElements(driver, this);
		
		BaseUrl = baseUrl;
	}
	
	protected void Navigate(String url) {
			
		driver.navigate().to(BaseUrl + url);
		
	}
}