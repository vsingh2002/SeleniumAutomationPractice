package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchStore = driver.findElement(By.xpath("//input[@value='Search store']"));
		System.out.println(searchStore.isDisplayed()); // To check element is display or not
		System.out.println(searchStore.isEnabled()); // to check is element enabled to enter data
		// is selected()
		WebElement checkRadioButton1 = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
		System.out.println(checkRadioButton1.isSelected());
		WebElement checkRadiobutton2 = driver.findElement(By.xpath("//input[@id='pollanswers-2']"));
		System.out.println("Before selecting : " + checkRadiobutton2.isSelected());
		checkRadiobutton2.click();
		System.out.println("After selecting : " + checkRadiobutton2.isSelected());

	}

}
