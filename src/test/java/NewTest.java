import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import qtx.Managerfactory.DriverManagerFactory;
import qtx.Managerfactory.DriverType;

public class NewTest {
	protected WebDriver driver;

	protected String BaseUrl;

	@BeforeTest
	public void beforeTest() {
		driver = DriverManagerFactory.getManager(DriverType.CHROME).getDriver();
		BaseUrl = "http://automationpractice.com/index.php";
		driver.navigate().to(BaseUrl);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	@Test
	public void f() {
		driver.findElement(By.id("homeslider")).getAttribute("style");
	}
}
