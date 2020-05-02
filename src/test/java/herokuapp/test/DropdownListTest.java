package herokuapp.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.DropdownPageObject;

public class DropdownListTest extends TestSuperClass {

	// As a user
	// I want to access dropdown menu 
	// so that can select one of the option
	
	@Test
	public void selectOption2FromDropdown() {
		//Test Data
		String Value = "Option 2";

		// act
		String actualBoxText = new DropdownPageObject(driver, BaseUrl)
				.OpenDropdownPage() //to DropdownPageObject
				.GetDropdownListValue(Value) ;//from DropdownPageObject
		
		// assert
		Assert.assertEquals(actualBoxText, Value, "Can not select a dropdown list value!");

	}

}