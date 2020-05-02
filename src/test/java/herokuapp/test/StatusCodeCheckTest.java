package herokuapp.test;
import org.testng.annotations.Test;

import com.qtx.pages.StstusCodePageObject;

public class StatusCodeCheckTest extends TestSuperClass{
  @Test
  public void CheckStatusCodes() {
	  new StstusCodePageObject(driver, BaseUrl)
	  .navigate()
	  .code200()
	  .code301()
	  .code404()
	  .code500();
	  
  }
}
