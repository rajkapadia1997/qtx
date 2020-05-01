package demoqa.AutomationPracticeTest;

import org.testng.annotations.Test;

import demoqa.pages.FormPage;

public class AutomationForm extends ZZSuperTest{

	@Test
	public void PrePopulateForm() {
		new FormPage(driver, BaseUrl)
		.navigate()
		.EnterFirstAndLastName()
		.PopulateOtherDetails();
	}

}
