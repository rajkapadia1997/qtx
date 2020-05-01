package qtx.Managerfactory;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

	@Override
	protected void startService() {
		// TODO Auto-generated method stub

	}

	protected void stopService() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void createDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/rajkapadia/Downloads/chromedriver");
		driver = new ChromeDriver();

	}

}
