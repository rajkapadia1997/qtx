package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.SuperPageObject;

public class ContactUsPage extends SuperPageObject {

	public ContactUsPage(WebDriver webDriverInstance, String domainNameInstance) {
		super(webDriverInstance, domainNameInstance);
		webDriver.navigate().to(domainName);

	}

	public ContactUsPage navigate(String subdirectory) {
		webDriver.navigate().to(new StringBuilder(domainName).append(subdirectory).toString());
		return this;
	}

	public ContactUsPage SelectHeading(String heading) {
		// Selecting the Web Element
		Select selectHeading = new Select(webDriver.findElement(By.cssSelector("#id_contact")));
		// Setting the test Value
		selectHeading.selectByVisibleText(heading);
		return this;
	}

	public ContactUsPage EnterEmailId(String emailId) {
		WebElement emailTextBox = webDriver.findElement(By.cssSelector("#email"));
		emailTextBox.sendKeys(emailId);
		return this;
	}

	public ContactUsPage EnterMessageText(String message) {
		WebElement messageTextBox = webDriver.findElement(By.cssSelector("#message"));
		messageTextBox.sendKeys(message);
		return this;
	}

	public ContactUsPage SendMessage() {
		WebElement sendButton = webDriver.findElement(By.cssSelector("#submitMessage"));
		sendButton.click();
		return this;
	}

	public String ConfirmationText() {
		WebElement confirmation = webDriver.findElement(By.cssSelector("#center_column > p"));
		String confirmationMessage = confirmation.getText();
		return confirmationMessage;
	}

}
