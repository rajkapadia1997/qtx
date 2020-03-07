import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.DropdownPageObject;

public class DropdownListTest extends TestSuperClass {

	// As a user
	// I want to access dropdown menu 
	// so that can select one of the option
	
	@Test
	public void selectOption2FromDropdown() {
		
		String expectedBoxText = new String("Option 2");

		// act
		String actualBoxText = new DropdownPageObject(driver, BaseUrl)
				.OpenDropdownPage()
				.GetDropdownList() ;//from DropdownPageObject
		
		// assert
		Assert.assertEquals(actualBoxText, expectedBoxText, "Can not select a dropdown list value!");

	}

}