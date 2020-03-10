import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.CheckboxPageobject;

public class CheckBoxTest extends TestSuperClass{
	@Test
	public void CheckBoxSelect() {
		//act
		boolean allCheckboxValue= new CheckboxPageobject (driver,BaseUrl)
				.OpenCheckboxPage()
				.SelectCheckboxs();
		//assertion
		Assert.assertEquals(allCheckboxValue, true, "Checkboxes are not Selected!");
		
		
	}

}
