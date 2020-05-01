import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.HoverPageObject;

public class HoverTest extends TestSuperClass{
  @Test
  public void ViewProfile() {
	  String expected = "http://the-internet.herokuapp.com/users/3";
	  String profilUrl = new HoverPageObject(driver, BaseUrl)
			  .NavigateToPage()
			  .HoverOverViewProfile()
			  .GetProfilUrl();
	  
	  Assert.assertEquals(profilUrl, expected);
  }
}
