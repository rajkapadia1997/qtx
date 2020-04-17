import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.FolatingMenuPageObject;

public class FloatingMenuTest extends TestSuperClass{
  @Test
  public void confirmFloatingMenu() {
	  String expectedPosition = "http://the-internet.herokuapp.com/floating_menu#home";
	  String position = new FolatingMenuPageObject(driver, BaseUrl)
			  .navigate()
			  .scrollPageToBottom()
			  .getMenuPositionAttribute()
			  .clickFloatingMenu();
	  
	  Assert.assertEquals(position, expectedPosition);
  }
}
