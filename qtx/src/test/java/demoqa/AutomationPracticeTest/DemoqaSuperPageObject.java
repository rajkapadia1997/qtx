package demoqa.AutomationPracticeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class DemoqaSuperPageObject {
	protected WebDriver driver;
	private String BaseUrl;
	
	protected DemoqaSuperPageObject(WebDriver driverInstance, String baseUrl) {
		
		driver = driverInstance;
		PageFactory.initElements(driver, this);
		
		BaseUrl = baseUrl;
	}
	
	protected void Navigate(String url) {
			
		driver.navigate().to(BaseUrl + url);
		
	}
}