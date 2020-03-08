package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SliderPageObject extends SuperPageObject{
	
	
	public SliderPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}
	
	public SliderPageObject Navigate() {
		String url = "/horizontal_slider";

		Navigate(url);
		return this;
	}

	public String SetSliderValue() {
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/input"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 100, 0).perform();
		WebElement rangeValue = driver.findElement(By.id("range"));
		String value = rangeValue.getText();
		
		return value;
	}

	
	
	

}
