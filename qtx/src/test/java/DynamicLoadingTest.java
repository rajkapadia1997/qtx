import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.DynamicLoadingExample1;
import com.qtx.pages.DynamicLoadingExample2;

public class DynamicLoadingTest extends TestSuperClass {
	@Test
	public void ElementHidden() {
		String expectedText = "Hello World!";

		String elementText = new DynamicLoadingExample1(driver, BaseUrl)
				.navigate()
				.clickStartButton()
				.waitForTheElementToAppear();

		Assert.assertEquals(elementText, expectedText);
	}

	@Test
	public void ElementRendersAfter() {
		String expectedText = "Hello World!";

		String elementText = new DynamicLoadingExample2(driver, BaseUrl)
				.navigate()
				.clickStartButton()
				.selectElementRendersAfterExample();

		Assert.assertEquals(elementText, expectedText);
	}
}
