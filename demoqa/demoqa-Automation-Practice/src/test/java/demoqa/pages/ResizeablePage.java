package demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ResizeablePage extends ZZSuperPage {

	public ResizeablePage(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);

	}

	public ResizeablePage navigate() {
		Navigate("/resizable");
		return this;
	}

	@FindBy(xpath = "//div[@id='resizable']")
	WebElement resizableElement;

	@FindBy(xpath = "//div[@id='resizable']/div[3]")
	WebElement resizable;

	public ResizeablePage dragAndDrop() {
		Actions action = new Actions(driver);
		action.dragAndDropBy(resizable, 50, 50).build().perform();
		return this;
	}

	public String getConfirmation() {
		System.out.println(resizableElement.getRect().getDimension().toString());
		return resizableElement.getRect().getDimension().toString();
	}

}
