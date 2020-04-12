package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShiftContentListPageObject extends SuperPageObject {

	public ShiftContentListPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}

	public ShiftContentListPageObject navigate() {
		Navigate("/shifting_content/list");
		return this;
	}

	public String getContentList() {

		WebElement Content = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div"));
		String content = Content.getText();
		return content;
	}

}
