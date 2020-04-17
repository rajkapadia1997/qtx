package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class iFramePageObject extends SuperPageObject{

	public iFramePageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		
	}

	public iFramePageObject navigate() {
		Navigate("/tinymce");
		
		return this;
	}
	@FindBy(id = "mceu_2-open")
	static WebElement formats;
	
	@FindBy(id = "mceu_32-text")
	static WebElement headings;
	
	@FindBy(id = "mceu_37-text")
	static WebElement heading1;

	public iFramePageObject selectHeading() throws InterruptedException {

		formats.click();
		Actions action = new Actions(driver);
		
		action.moveToElement(headings).perform();
		
		action.moveToElement(heading1).click().perform();

		return this;
	}

	public String getTextIndicator() {
		
		return driver.findElement(By.xpath("//*[@id=\"mceu_29-0\"]")).getText();
	}

}
