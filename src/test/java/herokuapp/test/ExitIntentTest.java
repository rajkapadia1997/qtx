package herokuapp.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.ExitIntentPageObject;

public class ExitIntentTest extends TestSuperClass{
  @Test
  public void mouseOutOfViewPane() {
	  String text = new ExitIntentPageObject(driver, BaseUrl)
			  .navigate()
			  .hoverMouseOutOfViewPane()
			  .getModelWindowHeaderText();
	  
	  Assert.assertEquals(text, "THIS IS A MODAL WINDOW");
  }
}
