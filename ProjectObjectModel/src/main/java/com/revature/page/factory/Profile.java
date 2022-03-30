package com.revature.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Profile {

final WebDriver driver;
    
    //Constructor, as every page needs a Webdriver to find elements
    public Profile(WebDriver driver){
            this.driver=driver;
        }
        
    
        @FindBy(id="userName-value")
    WebElement user;
    
    
    @FindBy(id="submit")
    WebElement logoutBtn;
    
    //Method to check logged in username
    public void verifyUser(String usrNm){

        if(user.getText().equalsIgnoreCase(usrNm))
            System.out.println("Correct username, ie " +user.getText());
        
        else
            System.out.println("Incorrect username..." +user.getText());
    }
    
    //method to logout
    public void logout_Action(){
        System.out.println("Let's log off now!!!!");
        logoutBtn.click();
    }
}