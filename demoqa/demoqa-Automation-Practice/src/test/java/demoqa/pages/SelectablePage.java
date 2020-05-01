package demoqa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectablePage extends ZZSuperPage {

	public SelectablePage(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);

	}

	public SelectablePage navigate() {
		Navigate("/selectable");
		return this;
	}

	@FindBy(id = "selectable")
	WebElement selectable;

	public String selectElementByName(String itemName) {
		List<WebElement> items = selectable.findElements(By.tagName("li"));
		for (WebElement element : items) {
			if (element.getText().equals(itemName)){
				element.click();
				return getVerification(element);
				
			}
		}
		return itemName+" Not available for selection";
		
	}

	public String getVerification(WebElement element) {
		return element.getAttribute("class");
	}

}
