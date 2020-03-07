package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPageObject extends SuperPageObject {

	public DropdownPageObject(WebDriver driverInstance, String url) {

		super(driverInstance, url);

	}
	public DropdownPageObject OpenDropdownPage() {

		String url = "/dropdown";

		Navigate(url);
		return this;

	}

	public String GetDropdownList() {
		Select selectByValue = new Select(driver.findElement(By.id("dropdown")));

		selectByValue.selectByVisibleText("Option 2");
		
		String Text = selectByValue.getFirstSelectedOption().getText();
		return Text ;
	}

}
