import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.DisappearingElementsPageObject;

public class DisappearingElementsTest extends TestSuperClass{
  @Test
  public void CheckElementPresence() {
	  String confirmationtext = new DisappearingElementsPageObject(driver, BaseUrl)
			  .navigate()
			  .findElementPresence();
	  Assert.assertEquals(confirmationtext, "Element Presence Detected");
  }
  @Test
  public void CheckElementAbsence() {
	  String confirmationtext = new DisappearingElementsPageObject(driver, BaseUrl)
			  .navigate()
			  .findElementAbsence();
	  Assert.assertEquals(confirmationtext, "Element Absence Detected");

  }
}
