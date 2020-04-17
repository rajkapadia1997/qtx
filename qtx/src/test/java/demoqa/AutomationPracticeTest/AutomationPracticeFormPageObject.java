package demoqa.AutomationPracticeTest;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticeFormPageObject extends DemoqaSuperPageObject {

	protected AutomationPracticeFormPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);

	}

	public AutomationPracticeFormPageObject EnterFirstAndLastName() {
		WebElement firstName = driver
				.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/fieldset/div[8]/input"));
		firstName.sendKeys("abc");
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		lastName.sendKeys("xyz");
		return this;
	}

	public void PopulateOtherDetails() {
		driver.findElement(By.xpath("//*[@id=\"sex-0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"exp-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys(new Date().toString());
		driver.findElement(By.xpath("//*[@id=\"profession-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();
		Select continent = new Select(driver.findElement(By.id("continents")));
		continent.selectByValue("NA");

	}

	public AutomationPracticeFormPageObject navigate() {
		Navigate("/automation-practice-form/");
		return this;

	}

}
