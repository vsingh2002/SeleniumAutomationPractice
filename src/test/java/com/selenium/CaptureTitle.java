package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Capture Title of the page
public class CaptureTitle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String pageTitle = driver.getTitle();
		System.out.println("Page title is :" + pageTitle);

	}

}
