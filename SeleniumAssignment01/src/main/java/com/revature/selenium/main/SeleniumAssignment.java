package com.revature.selenium.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumAssignment {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "D:\\WebDrivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://demoqa.com/login");
	
	driver.findElement(By.cssSelector("#userName")).sendKeys("testuser");
	driver.findElement(By.cssSelector("#password")).sendKeys("Password@123");
	
	WebElement loginButton = driver.findElement(By.cssSelector("#login"));
	loginButton.click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Boolean display = driver.findElement(By.id("submit")).isDisplayed();
	
	driver.close();
	
	if (display == true) {
		System.out.println("Login Successful");
	} else {
		System.out.println("Incorrect Login");
	}
}
}
