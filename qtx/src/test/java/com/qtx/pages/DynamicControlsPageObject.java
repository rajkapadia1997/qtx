package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControlsPageObject extends SuperPageObject {

	public DynamicControlsPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}

	public DynamicControlsPageObject navigate() {
		Navigate("/dynamic_controls?");
		return this;
	}

	public DynamicControlsPageObject enableTextBox() { 
		WebElement form = driver.findElement(By.id("input-example"));
		form.findElement(By.tagName("button")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		return this;
	}

	public String confirmTextBoxAndSendKeys() {
		String confirmationText = driver.findElement(By.xpath("//*[@id=\"message\"]")).getText();
		driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).sendKeys("Test"+Keys.ENTER);
		return confirmationText;
	}

	public DynamicControlsPageObject clickCheckBox() {
		driver.findElement(By.xpath("//*[@id=\"checkbox\"]/input")).click();
		
		return this;
	}

	public DynamicControlsPageObject removeCheckBox() {
		WebElement form = driver.findElement(By.id("checkbox-example"));
		form.findElement(By.tagName("button")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		return this;
	}

	public String getConfirmationMessage() {
		String confirmationText = driver.findElement(By.xpath("//*[@id=\"message\"]")).getText();
		
		return confirmationText;
	}

}
