import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.DynamicControlsPageObject;

public class DynamicControlsTest extends TestSuperClass {
	@Test
	public void EnableDisableTextBox() {
		String confirmationText = new DynamicControlsPageObject(driver, BaseUrl)
				.navigate()
				.enableTextBox()
				.confirmTextBoxAndSendKeys();
		Assert.assertEquals(confirmationText, "It's enabled!");
	}

	@Test
	public void AddRemoveCheckBox() {
		String confirmationMessage = new DynamicControlsPageObject(driver, BaseUrl)
				.navigate()
				.clickCheckBox()
				.removeCheckBox()
				.getConfirmationMessage();
		Assert.assertEquals(confirmationMessage, "It's gone!");
	}
}
