import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.SliderPageObject;

public class SliderTest extends TestSuperClass {
	
  @Test
  public void Slidertest() {
	  //act
	   String slidervalue = new SliderPageObject(driver, BaseUrl). //to SliderPageObject
			  Navigate().  //Open the browser page
			  SetSliderValue();  //set value to max and return the value
	   //assertion
	   Assert.assertEquals(slidervalue, "5");
			  
  }
}
