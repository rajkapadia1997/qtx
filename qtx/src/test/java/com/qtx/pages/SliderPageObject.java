package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SliderPageObject extends SuperPageObject {

	public SliderPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}

	public SliderPageObject Navigate() {
		String url = "/horizontal_slider";

		Navigate(url);
		return this;
	}

	public String SetSliderValue() {
		//grabbing the slider element
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/input"));
        
		int width = slider.getSize().getWidth();  //getting the width of the slider
		Actions action = new Actions(driver);  
		action.dragAndDropBy(slider, (width * 100)/100, 0).perform();  //perform drag and drop 
		WebElement rangeValue = driver.findElement(By.id("range"));   
		String value = rangeValue.getText();  //getting the range value

		return value;
	}

}
