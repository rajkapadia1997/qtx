package com.qtx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TablesPageObject extends SuperPageObject{

	public TablesPageObject(WebDriver driverInstance, String baseUrl) {
		super(driverInstance, baseUrl);
		}

	public TablesPageObject navigate(String url) {
		Navigate(url);
		return this;
	}

	public String FindTheElement(String Email) {
		for(int numberOfRows=1; numberOfRows<=4; numberOfRows++)
		{
			String confirmEmail = driver.findElement(By.xpath("/html/body/div[2]/div/div/table[1]/tbody/tr["+numberOfRows+"]/td[3]")).getText();
			System.out.println(confirmEmail);
			
			//not able to compare two string
			
			if(confirmEmail == "jdoe@hotmail.com") {
				String dueAmount = driver.findElement(By.xpath("/html/body/div[2]/div/div/table[1]/tbody/tr["+numberOfRows+"]/td[4]")).getText();
				System.out.println(dueAmount);
				return dueAmount;
			}
		}
		return "Email not found";
		
	}

}
