package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPageObject extends SuperPageObject {

	public KeyPressesPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}

	public KeyPressesPageObject navigate() {
		Navigate("/key_presses");
		return this;
	}

	public KeyPressesPageObject enterAKeyPress() {
		driver.findElement(By.id("target")).sendKeys(Keys.COMMAND);
		return this;
	}

	public String getConfirmationMessage() {
		return driver.findElement(By.id("result")).getText();
		
	}

}
