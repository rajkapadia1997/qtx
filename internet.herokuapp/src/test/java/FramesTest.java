import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.NestedFramesPageObject;

public class FramesTest extends TestSuperClass {
	@Test
  public void NestedFrames() {
	 new NestedFramesPageObject(driver,BaseUrl)
	 .navigate("/nested_frames");
	 
	 
	 String leftFrameText = new NestedFramesPageObject(driver, BaseUrl).GetLeftFrameText();
	 Assert.assertEquals(leftFrameText, "LEFT");
	 
	 String middleFrameText = new NestedFramesPageObject(driver, BaseUrl).GetMiddleFrameText();
     Assert.assertEquals(middleFrameText, "MIDDLE");
			 
	 String rightFrameText = new NestedFramesPageObject(driver, BaseUrl).GetRightFrameText();
	 Assert.assertEquals(rightFrameText, "RIGHT");
					 
	 String bottomFrameText = new NestedFramesPageObject(driver, BaseUrl).GetBottomFrameText();
	 Assert.assertEquals(bottomFrameText, "BOTTOM");
	  
  }

}
