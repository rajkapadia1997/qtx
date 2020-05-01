package demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DroppablePage extends ZZSuperPage {

	public DroppablePage(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);

	}

	public DroppablePage navigate() {
		Navigate("/droppable");
		return this;
	}

	@FindBy(id = "draggable")
	WebElement draggable;

	@FindBy(id = "droppable")
	WebElement droppable;

	public DroppablePage dragAndDrop() {
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable, droppable).build().perform();
		return this;
	}

	public String getConfirmation() {
		return droppable.getText();
	}

}
