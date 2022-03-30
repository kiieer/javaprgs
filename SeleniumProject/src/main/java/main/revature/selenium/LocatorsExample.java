package main.revature.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {
	public static void main(String[] args) {
		// Instantiate WebDriver using Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("https:\\demoqa.com\\");

		/**
		 * Locate by ID Attribute URL - https://demoqa.com/automation-practice-form
		 */
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName"));

		/**
		 * Locate by Name attribute URL - https://demoqa.com/automation-practice-form
		 */

		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.name("gender"));
		/**
		 * Locate by className attribute URL -
		 * https://demoqa.com/automation-practice-form
		 */

		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.className("practice-form-wrapper"));

		/**
		 * Locate by linkText and ParticalLinkText attribute URL -
		 * https://demoqa.com/links
		 */

		driver.get("https://demoqa.com/links");
		// linkText
		driver.findElement(By.linkText("Home"));
		// partialLinkText
		driver.findElement(By.partialLinkText("Ho"));
		/**
		 * Locate by tagName attribute URL - https://demoqa.com/links
		 */

		driver.get("https://demoqa.com/links");
		List<WebElement> list = driver.findElements(By.tagName("a"));

		/**
		 * Locate by cssSelector attribute URL - https://demoqa.com/text-box
		 */

		driver.get("https://demoqa.com/text-box");
		// driver.findElement(By.cssSelector("input[id= 'userName']"));
		driver.findElement(By.cssSelector("#userName")).sendKeys("Hello");

		/**
		 * Locate by xpath attribute URL - https://demoqa.com/text-box
		 */

		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//input[@id='userName']"));

	}
}