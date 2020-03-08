package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxPageobject extends SuperPageObject {

	public CheckboxPageobject(WebDriver driverInstance, String url) {

		super(driverInstance, url);

	}

	public CheckboxPageobject OpenCheckboxPage() {

		String url = "/checkboxes";

		Navigate(url);
		return this;

	}

	public boolean SelectCheckboxs() {
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));

		
		if (!checkbox1.isSelected()) {
			checkbox1.click();
		}
		if (!checkbox2.isSelected()) {
			checkbox2.click();
		}	
		if (checkbox1.isSelected() && checkbox2.isSelected()) 
			return true;
		else
			return false;
		
	}
}
