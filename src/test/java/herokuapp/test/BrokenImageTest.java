package herokuapp.test;
import org.testng.annotations.Test;

import com.qtx.pages.BrokenImagePageObject;

public class BrokenImageTest extends TestSuperClass{
  @Test
  public void GetImage() {
	  new BrokenImagePageObject(driver, BaseUrl)
	  .navigate()
	  .getImage();
  }
}
