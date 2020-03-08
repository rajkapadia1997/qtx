import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.SliderPageObject;

public class SliderTest extends TestSuperClass {
	
  @Test
  public void Slidertest() {
	   String slidervalue = new SliderPageObject(driver, BaseUrl).
			  Navigate().
			  SetSliderValue();
	   
	   Assert.assertEquals(slidervalue, "5");
			  
  }
}
