package com.qtx.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfiniteScrollPage extends SuperPageObject {

	public InfiniteScrollPage(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}

	public InfiniteScrollPage navigate() {
		Navigate("/infinite_scroll");
		return this;
	}

	public String ScrollAndGrab() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//js scroll not working//
		
		js.executeScript("window.scrollBy(0,10000000000)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		WebElement Element = driver.findElement(By.cssSelector("#content > div > div > div > div > div:nth-child(2)"));
		String paragraph = Element.getText();
		return paragraph;
	}

}
