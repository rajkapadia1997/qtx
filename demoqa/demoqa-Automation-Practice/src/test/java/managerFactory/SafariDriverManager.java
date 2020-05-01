package managerFactory;

import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverManager extends DriverManager {

	@Override
	protected void createDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/rajkapadia/Downloads/safaridriver");
		driver = new SafariDriver();

	}

}
