package demoqa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeWindowsPage extends ZZSuperPage {

	public PracticeWindowsPage(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);

	}

	public PracticeWindowsPage navigate() {
		Navigate("/automation-practice-switch-windows-2");
		return this;
	}

	@FindBy(id = "button1")
	WebElement browserWindow;

	public PracticeWindowsPage openBrowserWindow() {
		browserWindow.click();
		return this;
	}

	public PracticeWindowsPage switchFocus() {
		for (String window : driver.getWindowHandles()) {
			driver.switchTo().window(window);
		}
		return this;

	}
	
	@FindBy(css = "button[onclick='newMsgWin()']")
	WebElement messageWindow;

	public PracticeWindowsPage openMessageWindow() {
		messageWindow.click();
		return this;
	}

	public String getUrl() {
		return driver.getCurrentUrl();
		
	}

	public String getContent() {
		return driver.findElement(By.tagName("body")).getText();
		
	}
	
	@FindBy(css = "button[onclick='newBrwTab()']")
	WebElement browserTab;
	
	public PracticeWindowsPage openBrowserTab() {
		browserTab.click();
		return this;
	}
	
	@FindBy(id = "alert")
	WebElement jsAlert;
	
	@FindBy(id = "timingAlert")
	WebElement timedJSAlert;

	public PracticeWindowsPage openJSAlert(String type) {
		if(type.equals("timedAlert")) {
			timedJSAlert.click();
			return this;
		}else {
			jsAlert.click();
			return this;
		}
	}
	
	public String getAlertMsg() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert();
		String content = alert.getText();
		alert.accept();
		return content;
	}

	
	@FindBy(id = "colorVar")
	WebElement colorVar;
	
	@FindBy(id = "doubleClick")
	WebElement doubleClick;
	
	public String waitUntilColorChange() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.attributeToBe(colorVar, "style", "color: red;"));
		return colorVar.getAttribute("style");
	}

	public String doubleClickToChangeColor() {
		Actions action = new Actions(driver);
		action.moveToElement(doubleClick).doubleClick(doubleClick).build().perform();
		return doubleClick.getAttribute("style");
	}

	public PracticeWindowsPage refresh() {
		driver.navigate().refresh();
		return this;
	}
	
	@FindBy(id = "disabledElement")
	WebElement disabledElement;
	
	@FindBy(id = "invisibility")
	WebElement invisibility;

	public String waitUntilElementIsEnabled() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(disabledElement, "enabled"));
		return disabledElement.getText();
	}

	public String waitUntilElementIsVisible() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.attributeToBe(invisibility, "style", "color: black; visibility: visible;"));
		return invisibility.getAttribute("style");
	}
}
