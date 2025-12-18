package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.demoblaze.com/");
		// driver.get("https://demowebshop.tricentis.com/");
		driver.navigate().to("https://www.demoblaze.com/");
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}
}
