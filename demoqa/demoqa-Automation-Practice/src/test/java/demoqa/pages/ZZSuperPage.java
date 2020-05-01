package demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class ZZSuperPage {
	protected WebDriver driver;
	private String BaseUrl;
	
	protected ZZSuperPage(WebDriver driverInstance, String baseUrl) {
		
		driver = driverInstance;
		PageFactory.initElements(driver, this);
		
		BaseUrl = baseUrl;
	}
	
	protected void Navigate(String url) {
			
		driver.navigate().to(BaseUrl + url);
		
	}
}