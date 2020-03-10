package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPageObject extends SuperPageObject {

	public DropdownPageObject(WebDriver driverInstance, String url) {

		super(driverInstance, url);

	}
	//Navigate to the page url
	public DropdownPageObject OpenDropdownPage() {
        //Data
		String url = "/dropdown";
		//Act
		Navigate(url);
		return this;

	}
    //Performing DropdownListTest Actions
	public String GetDropdownListValue(String Value) {
		//Selecting the Web Element
		Select selectByValue = new Select(driver.findElement(By.id("dropdown")));
        //Setting the test Value 
		selectByValue.selectByVisibleText(Value);
		//Returning the output text
		String Text = selectByValue.getFirstSelectedOption().getText();
		return Text ;
	}

}
