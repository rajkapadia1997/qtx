package demoqa.AutomationPracticeTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import demoqa.pages.PracticeWindowsPage;

public class PracticeWindowsTest extends ZZSuperTest {

	@Test
	public void NewBrowserWindow() {
		String expectedUrl = "https://www.toolsqa.com/";
		String getUrl = new PracticeWindowsPage(driver, BaseUrl)
				.navigate()
				.openBrowserWindow()
				.switchFocus()
				.getUrl();

		Assert.assertEquals(getUrl, expectedUrl);
	}
	
	@Test
	// not able to get content from the new window
	public void NewMessageWindow() {
		
		String getContent = new PracticeWindowsPage(driver, BaseUrl)
				.navigate()
				.openMessageWindow()
				.switchFocus()
				.getContent();

		System.out.println(getContent);
	}
	
	@Test
	public void NewBrowserTab() {
		String expectedUrl = "https://www.toolsqa.com/";
		String getUrl = new PracticeWindowsPage(driver, BaseUrl)
				.navigate()
				.openBrowserTab()
				.switchFocus()
				.getUrl();

		Assert.assertEquals(getUrl, expectedUrl);
	}
	
	@Test
	public void JavaScriptAlert() {
		String expectedUrl = "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.";
		String getUrl = new PracticeWindowsPage(driver, BaseUrl)
				.navigate()
				.openJSAlert("")
				.getAlertMsg();

		Assert.assertEquals(getUrl, expectedUrl);
	}
	
	@Test
	public void TimingJavaScriptAlert() {
		String expectedUrl = "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.";
		String getUrl = new PracticeWindowsPage(driver, BaseUrl)
				.navigate()
				.openJSAlert("timedAlert")
				.getAlertMsg();

		Assert.assertEquals(getUrl, expectedUrl);
	}
	
	@Test
	public void JavaScriptTimingTests() {
		String changeColorWait = new PracticeWindowsPage(driver, BaseUrl)
				.navigate()
				.waitUntilColorChange();
		
		String dissabledElement = new PracticeWindowsPage(driver, BaseUrl)
				.refresh()
				.waitUntilElementIsEnabled();
		
		String invisibility = new PracticeWindowsPage(driver, BaseUrl)
				.refresh()
				.waitUntilElementIsVisible();
				
		String changeColorClick = new PracticeWindowsPage(driver, BaseUrl)
				.refresh()
				.doubleClickToChangeColor();
				
		Assert.assertEquals(changeColorWait, "color: red;");
		Assert.assertEquals(dissabledElement, "enabled");
		Assert.assertEquals(invisibility, "color: black; visibility: visible;");
		Assert.assertEquals(changeColorClick, "color: orange;");
	}
	
}
