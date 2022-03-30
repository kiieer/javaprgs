package main.revature.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstExample {
	public static void main(String[] args) {
		//Load the driver or tell the program which driver you are using.
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		
		//driver object to perform Chrome-specific tasks
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().fullscreen();
		
		//opens the website
		//driver.get("https://www.google.com");
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.id("js-link-box-en")).click();
		
//		WebElement searchBox = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
//		searchBox.sendKeys("Love Like You");
//		
//		WebElement searchButton = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]"));
//		searchButton.click();
		//returns the title of the webpage
		//System.out.println(driver.getTitle());
		
		//Closes the current driver
		//driver.close();
		
		//Quits
		//driver.quit();
	}
}
