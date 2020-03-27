import java.io.IOException;

import org.testng.annotations.Test;

import com.qtx.pages.FileDownloaderPageObject;

public class FileDownloaderTest extends TestSuperClass {
	@Test
	public void DownloadFile() throws IOException {
		String fileName = "test.txt";
		new FileDownloaderPageObject(driver, BaseUrl).navigate()
				.DownloadRequiredFile()
				.FindFileInDir(fileName);

	}
}