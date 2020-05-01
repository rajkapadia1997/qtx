package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FolatingMenuPageObject extends SuperPageObject {
	@FindBy(id = "menu")
	WebElement menuPosition;

	public FolatingMenuPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);

	}

	public FolatingMenuPageObject navigate() {
		Navigate("/floating_menu");
		return this;
	}

	public FolatingMenuPageObject scrollPageToBottom() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		return this;
	}

	public FolatingMenuPageObject getMenuPositionAttribute() {
		String position = menuPosition.getAttribute("style");
		System.out.println(position);
		return this;
	}

	public String clickFloatingMenu() {

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a"))).click().perform();

		return driver.getCurrentUrl();
	}

}
