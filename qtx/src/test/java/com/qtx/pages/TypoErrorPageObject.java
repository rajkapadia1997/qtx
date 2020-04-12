package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TypoErrorPageObject extends SuperPageObject {

	public TypoErrorPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		
	}

	public String findAndGetTypotest() {
		return driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]")).getText();
	}

	public TypoErrorPageObject navigate() {
		Navigate("/typos");
		return this;
	}

	

}
