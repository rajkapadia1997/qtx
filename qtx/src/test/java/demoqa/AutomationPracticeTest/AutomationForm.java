package demoqa.AutomationPracticeTest;

import org.testng.annotations.Test;

public class AutomationForm extends DemoqaTestSuperClass{

	@Test
	public void PrePopulateForm() {
		new AutomationPracticeFormPageObject(driver, BaseUrl)
		.navigate()
		.EnterFirstAndLastName()
		.PopulateOtherDetails();
	}

}
