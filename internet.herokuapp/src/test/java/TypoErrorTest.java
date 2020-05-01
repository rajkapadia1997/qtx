import org.testng.annotations.Test;

import com.qtx.pages.TypoErrorPageObject;

public class TypoErrorTest extends TestSuperClass {
	@Test
	public void TypoErrorVerification() {
		boolean noTypoError = false ;
		boolean typoError = false ;

		do {
			String typoText = new TypoErrorPageObject(driver, BaseUrl)
					.navigate()
					.findAndGetTypotest();
			System.out.println(typoText);

			if (typoText.equals("Sometimes you'll see a typo, other times you won't.")){
				noTypoError = true;
				System.out.println("noTypoError = " + noTypoError);
			}

			else if (typoText.equals("Sometimes you'll see a typo, other times you won,t.")) {
				typoError = true;
				System.out.println("typoError = " + typoError);
			}

		} while (noTypoError == false || typoError == false);
	}
}
