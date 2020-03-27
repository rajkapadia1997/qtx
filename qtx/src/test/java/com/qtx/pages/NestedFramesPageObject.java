package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPageObject extends SuperPageObject {

	public NestedFramesPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);

	}

	public void navigate(String url) {
		Navigate(url);

	}

	public String GetLeftFrameText() {
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		String text = driver.findElement(By.xpath("/html/body")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		return text;
	}

	public String GetRightFrameText() {
		driver.switchTo().frame(0);
		driver.switchTo().frame(2);
		String text = driver.findElement(By.xpath("/html/body")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		return text;
	}

	public String GetMiddleFrameText() {
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		String text = driver.findElement(By.xpath("/html/body/div")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		return text;
	}

	public String GetBottomFrameText() {
		driver.switchTo().frame(1);
		String text = driver.findElement(By.xpath("/html/body")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		return text;
	}

}
