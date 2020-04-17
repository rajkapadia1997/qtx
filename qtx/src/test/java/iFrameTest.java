import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.iFramePageObject;

public class iFrameTest extends TestSuperClass{
  @Test
  public void FormatTest() throws InterruptedException {
	  String indicator = new iFramePageObject(driver, BaseUrl)
			  .navigate()
			  .selectHeading()
			  .getTextIndicator();
	  Assert.assertEquals(indicator, "h1");
  }
}
