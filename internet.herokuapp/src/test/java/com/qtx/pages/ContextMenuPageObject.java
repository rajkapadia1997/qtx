package com.qtx.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPageObject extends SuperPageObject{

	public ContextMenuPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);

	}

	public ContextMenuPageObject navigate() {
		Navigate("/context_menu");
		return this;
	}

	public ContextMenuPageObject RightClickOnTheBox() {
		WebElement Box = driver.findElement(By.id("hot-spot"));
		Actions action = new Actions(driver);
		action.moveToElement(Box).contextClick().perform();
		
		return this;
	}

	public String HandleJSAlert() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		return text;
		
	}

}
