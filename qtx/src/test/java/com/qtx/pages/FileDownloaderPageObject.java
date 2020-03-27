package com.qtx.pages;

import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileDownloaderPageObject extends SuperPageObject {

	public FileDownloaderPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);

	}

	public FileDownloaderPageObject DownloadRequiredFile() {

		driver.findElement(By.xpath("/html/body/div[2]/div/div/a[3]")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
		}

		return this;
	}

	public FileDownloaderPageObject FindFileInDir(String fileName) throws IOException {

		FileReader newFile = new FileReader("/Users/rajkapadia/Downloads/" + fileName);

		int i;
		while ((i = newFile.read()) != -1)
			System.out.print((char) i);

		newFile.close();

		return this;
	}

	public FileDownloaderPageObject navigate() {
		Navigate("/download");
		return this;

	}

}
