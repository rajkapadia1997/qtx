import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.WindowsPageObject;

public class OpenNewWindowTest extends TestSuperClass{
  @Test
  public void OpenNewWindow() {
	  String expectedText = "New Window";
	  String url = "/windows";
	  String newWindowText = new WindowsPageObject(driver,BaseUrl)
			  .navigate(url)
			  .OpenNewWindowAndGetText();
	  Assert.assertEquals(newWindowText, expectedText);
  }
}
