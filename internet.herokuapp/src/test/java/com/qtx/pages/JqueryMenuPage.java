package com.qtx.pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JqueryMenuPage extends SuperPageObject {

	public JqueryMenuPage(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		Navigate("/jqueryui/menu#");

	}

	public JqueryMenuPage ClickItemByMenuPath(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@class='ui-menu-item']//*[text()='" + strings[i] + "']")).click();

		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return this;
	}

	public String getDownloadedFile() {
		File dir = new File("/Users/rajkapadia/Downloads");
		File[] dirContents = dir.listFiles();

		for (int i = 0; i < dirContents.length; i++) {
			if (dirContents[i].getName().equals("menu.xls")) {
				// File has been found, it can now be deleted:
				dirContents[i].delete();
				return dirContents[i].getName();
			}

		}
		return "file not found";

	}
}
