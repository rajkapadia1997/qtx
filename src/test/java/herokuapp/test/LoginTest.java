package herokuapp.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.LoginPageObject;

public class LoginTest extends TestSuperClass{


	// As a user
	// I want to log in
	// So users can do stuff
	@Test
	public void canLogIn() {
		
		// arrange
		String userName = new String("tomsmith");
		String password = new String("SuperSecretPassword!");
		String expectedGreenBoxText = new String("You logged into a secure area!\n×");

		// act
		String actualGreenBoxText = new LoginPageObject(driver, BaseUrl)
				.OpenLoginPage() //from LoginPageObject
				.login(userName, password) //from LoginPageObject
				.getLoginConfirmationMessage(); // from SecurePageObject
		
		// assert
		Assert.assertEquals(actualGreenBoxText , expectedGreenBoxText, "Can not Log in!");

	}

}