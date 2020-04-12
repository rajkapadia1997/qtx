package com.qtx.pages;

import static io.restassured.RestAssured.given;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StstusCodePageObject extends SuperPageObject {

	public StstusCodePageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);

	}

	public StstusCodePageObject navigate() {
		Navigate("/status_codes");

		return this;
	}

	public StstusCodePageObject code200() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a")).click();
		System.out.println(given().get(driver.getCurrentUrl()).statusCode());
		driver.navigate().back();

		return this;
	}

	public StstusCodePageObject code301() {
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/a")).click();
		System.out.println(given().redirects().follow(false).get(driver.getCurrentUrl()).statusCode());
		driver.navigate().back();

		return this;
	}

	public StstusCodePageObject code404() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/a")).click();
		System.out.println(given().redirects().follow(false).get(driver.getCurrentUrl()).statusCode());
		driver.navigate().back();

		return this;
	}

	public void code500() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[4]/a")).click();
		System.out.println(given().redirects().follow(false).get(driver.getCurrentUrl()).statusCode());
		driver.navigate().back();

	}

}
