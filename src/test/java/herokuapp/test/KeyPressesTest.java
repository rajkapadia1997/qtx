package herokuapp.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.KeyPressesPageObject;

public class KeyPressesTest extends TestSuperClass{
  @Test
  public void KeyPress() {
	  String message = new KeyPressesPageObject(driver, BaseUrl)
			  .navigate()
			  .enterAKeyPress()
			  .getConfirmationMessage();
	  
	  Assert.assertEquals(message, "You entered: WIN");
  }
}
