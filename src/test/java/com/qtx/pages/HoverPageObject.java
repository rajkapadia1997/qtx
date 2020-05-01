package com.qtx.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPageObject extends SuperPageObject {

	public HoverPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);

	}

	public HoverPageObject NavigateToPage() {
		String url = "/hovers";
		Navigate(url);
		return this;
	}

	public HoverPageObject HoverOverViewProfile() {
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		Actions action = new Actions(driver);
		WebElement profileImg = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/img"));
        action.moveToElement(profileImg).perform();
        WebElement viewProfile = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/a"));
        action.moveToElement(viewProfile).click().perform();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		return this;
	}

	public String GetProfilUrl() {

		return driver.getCurrentUrl();
	}

}
