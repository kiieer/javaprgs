package cucumber.main.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	public static WebDriver driver;

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");

	   // Maximizing window
	   driver.manage().window().fullscreen();
	}

	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Title of the page is " + driver.getTitle());
	}

//	@When("User enters UserName and Password")
//	public void user_enters_user_name_and_password() {
//	    // Write code here that turns the phrase above into concrete actions
//		WebElement uname = driver.findElement(By.id("userName"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.id("login"));
//		uname.sendKeys("testuser");
//		password.sendKeys("Password@123");
//		loginBtn.click();
//	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String un, String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement uname = driver.findElement(By.id("userName"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login"));
		uname.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Successful...");
		driver.quit();
	}
}
