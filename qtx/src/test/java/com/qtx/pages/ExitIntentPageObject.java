package com.qtx.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ExitIntentPageObject extends SuperPageObject {

	public ExitIntentPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
	}

	public ExitIntentPageObject hoverMouseOutOfViewPane() {
		WebElement initialElement = driver.findElement(By.className("example"));
		Actions action = new Actions(driver);
		action.moveToElement(initialElement).build().perform();

		return this;
	}
	@FindBy (className="example")
	WebElement example;
	
	@FindBy (id="ouibounce-modal")
	WebElement window;

	public String getModelWindowHeaderText() {
		String attribute = new String();
		Robot bot = null;
		try {
			new Robot().mouseMove((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2, (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2);
			bot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
		do {
			attribute = window.getAttribute("style");
			System.out.println(attribute);
			if (attribute.equals("display: block;")) {
				return window.findElement(By.className("modal-title")).getText();
			}
			else {
				
					
					bot.mouseMove((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2, 90);
				
					
				
				}
			
		}while (attribute != "display: block;");
		return "window NOT found";
	}

	public ExitIntentPageObject navigate() {
		Navigate("/exit_intent");
		driver.manage().window().maximize();
		return this;
	}

}
