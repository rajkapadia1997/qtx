package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPageObject extends SuperPageObject{

	public EntryAdPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		
	}

	public EntryAdPageObject navigate() {
		Navigate("/entry_ad");
		return this;
	}

	public String waitForAdPopupAndGetAdHeaderMessage() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"modal\"][contains(@style, 'display: block')]")));
		String headerMessage = driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div[1]/h3")).getText();
		return headerMessage;
	}

}
