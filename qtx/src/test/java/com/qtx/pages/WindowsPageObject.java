package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WindowsPageObject extends SuperPageObject{

	public WindowsPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		}

	public WindowsPageObject navigate(String url) {
		Navigate(url);
		return this;
	}

	public String OpenNewWindowAndGetText() {
		String winHandleBefore = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		String text = driver.findElement(By.className("example")).getText();
		
		driver.close();
		driver.switchTo().window(winHandleBefore);
		return text;
	}

	

}
