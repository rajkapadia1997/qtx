package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputsPageObject extends SuperPageObject {


	public InputsPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}

	public  InputsPageObject OpenInputsPage() {
		String url = "/inputs";
		Navigate(url);
				
		return this;
	}

	public String SetInputValue (String i) {
		WebElement numberTextBox = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/input"));
		numberTextBox.sendKeys(i);
		numberTextBox.sendKeys(Keys.RETURN);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String number = numberTextBox.getAttribute("value");
		
		numberTextBox.clear();
		return number; 
	}

}
