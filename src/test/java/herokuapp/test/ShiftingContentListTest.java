package herokuapp.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.ShiftContentListPageObject;

public class ShiftingContentListTest extends TestSuperClass {
	@Test
	public void ListContentCheck() {
		String content = new ShiftContentListPageObject(driver, BaseUrl).navigate().getContentList();
		System.out.println(content);

		Assert.assertEquals(content.contains("Sed deleniti blanditiis odio laudantium."), true);
	}
}
