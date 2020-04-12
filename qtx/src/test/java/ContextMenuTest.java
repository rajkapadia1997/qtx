import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.ContextMenuPageObject;

public class ContextMenuTest extends TestSuperClass{
  @Test
  public void JSAlertPopup() {
	  String alertText = new ContextMenuPageObject(driver, BaseUrl)
	  .navigate()
	  .RightClickOnTheBox()
	  .HandleJSAlert();
	  
	  Assert.assertEquals(alertText, "You selected a context menu");
  }
}
