package herokuapp.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtx.pages.JqueryMenuPage;

public class JQueryUI extends TestSuperClass {
	@Test
	public void JQueryUIDownloads() {
		String downloadedFile = new JqueryMenuPage(driver, BaseUrl)
				.ClickItemByMenuPath(new String[] { "Enabled", "Downloads", "Excel" }).getDownloadedFile();

		Assert.assertEquals(downloadedFile, "menu.xls");
	}
}
