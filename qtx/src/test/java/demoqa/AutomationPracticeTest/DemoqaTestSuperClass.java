package demoqa.AutomationPracticeTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import qtx.Managerfactory.DriverManagerFactory;
import qtx.Managerfactory.DriverType;


public abstract class DemoqaTestSuperClass {

	protected WebDriver driver;
	
	protected String BaseUrl;

	@BeforeTest
	public void beforeTest() {
		driver = DriverManagerFactory.getManager(DriverType.CHROME).getDriver();
		BaseUrl = "https://demoqa.com";
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}


		