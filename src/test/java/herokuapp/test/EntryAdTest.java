package herokuapp.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.EntryAdPageObject;

public class EntryAdTest extends TestSuperClass{
  @Test
  public void AdTest() {
	  String adText = new EntryAdPageObject(driver, BaseUrl)
			  .navigate()
			  .waitForAdPopupAndGetAdHeaderMessage();
	  
	  Assert.assertEquals(adText, "THIS IS A MODAL WINDOW");
  }
}
