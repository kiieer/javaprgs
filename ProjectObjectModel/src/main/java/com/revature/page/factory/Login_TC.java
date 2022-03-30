package com.revature.page.factory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Login_TC {

static WebDriver driver;
    
public static void main(String[] args) {
        
    System.setProperty("webdriver.chrome.driver", "D:\\\\WebDrivers\\\\chromedriver.exe");
        driver = new ChromeDriver();
        
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/login");
        driver.manage().window().fullscreen();
        
        //Instantiating Login & Profile page using initElements()
        Login loginPg = PageFactory.initElements(driver, Login.class);
        Profile profilePg = PageFactory.initElements(driver, Profile.class);
         
        //Using the methods created in pages class to perform actions
        loginPg.LogIn_Action("gunjankaushik", "Password@123");
        profilePg.verifyUser("gunjankaushik");
        profilePg.logout_Action();
         
        driver.quit();        
                        }

}