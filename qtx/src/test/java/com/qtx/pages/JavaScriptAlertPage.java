package com.qtx.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage extends SuperPageObject{

	public JavaScriptAlertPage(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		Navigate("/javascript_alerts");
	}
	

	public JavaScriptAlertPage ClickJSAlert() {
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
		return this;
	}


	public JavaScriptAlertPage HandleJSAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return this;
	}


	public String ReturnConfirmation() {
		return driver.findElement(By.id("result")).getText();
		
	}


	public JavaScriptAlertPage ClickJSConfirm() {
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
		return this;
	}


	public JavaScriptAlertPage ClickJSPrompt() {
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		return this;
	}


	public JavaScriptAlertPage EnterText(String text) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
		return this;
	}
	

	

}
