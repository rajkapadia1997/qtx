import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.InputsPageObject;

public class MultipleInputsTest extends TestSuperClass{
  @Test
  public void InputNumbersfromArray () {
	  //data
	  String intArray[] = { "1","2","3","4","5" };
	  //act
	  for (int i = 0; i < intArray.length; i++) {
		  String number = new InputsPageObject(driver, BaseUrl).
				  OpenInputsPage().
				  SetInputValue(intArray[i]);
				  
		  Assert.assertEquals(number, intArray[i]);
				  
	  }
  }
}
