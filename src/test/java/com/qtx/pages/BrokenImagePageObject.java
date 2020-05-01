package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenImagePageObject extends SuperPageObject {

	public BrokenImagePageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		
	}

	public BrokenImagePageObject navigate() {
		Navigate("/broken_images");
		return this;
	}

	public void getImage() {
		for (WebElement image : driver.findElements(By.cssSelector("img")))
		{
			if (image.getAttribute("naturalWidth").equals("0"))
		    {
		        System.out.println(image.getAttribute("outerHTML") + " is broken.");
		    }
		}
		
	}

}
