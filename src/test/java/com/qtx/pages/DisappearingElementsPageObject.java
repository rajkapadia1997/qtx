package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DisappearingElementsPageObject extends SuperPageObject {

	public DisappearingElementsPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}

	public DisappearingElementsPageObject navigate() {
		Navigate("/disappearing_elements");
		return this;
	}

	public String findElementPresence() {
		int i = 0;
		while (i <= 5) {
			try {
				String element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[5]/a")).getText();
				if (element.equals("Gallery")) {
					String confirmation = "Element Presence Detected";
					System.out.println(confirmation);
					driver.navigate().refresh();
					return confirmation;

				}
			} catch (Exception ElementNotFound) {
				System.out.println("...");
				driver.navigate().refresh();
			}
		}
		return "Element Absent";

	}

	public String findElementAbsence() {
		int i = 0;
		while (i <= 5) {
			try {
				WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[5]/a"));
				if (element.isDisplayed() == true) {
					System.out.println("...");
					driver.navigate().refresh();
				}
			} catch (Exception ElementNotFound) {

				String confirmation = "Element Absence Detected";
				System.out.println(confirmation);
				driver.navigate().refresh();
				return confirmation;

			}
		}
		return "Element Present";

	}

}
