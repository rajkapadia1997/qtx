import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.TablesPageObject;

public class TablesTest extends TestSuperClass{
  @Test
  public void GetRequiredInfo() {
	  String Email = "jdoe@hotmail.com";
	  String expectedDueAmount = "$100.00";
	  String url = "/tables";
	  String dueAmount = new TablesPageObject(driver, BaseUrl)
			  .navigate(url)
			  .FindTheElement(Email);
	  Assert.assertEquals(dueAmount, expectedDueAmount);
			  
  }
}
