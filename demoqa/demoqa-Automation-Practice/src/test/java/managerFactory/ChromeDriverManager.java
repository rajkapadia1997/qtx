package managerFactory;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

	@Override
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/rajkapadia/Downloads/chromedriver");
		driver = new ChromeDriver();
	}

}
