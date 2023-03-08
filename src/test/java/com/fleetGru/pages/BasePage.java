package com.fleetGru.pages;


import com.fleetGru.utilities.ConfigurationReader;
import com.fleetGru.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

   public BasePage(){

       PageFactory.initElements(Driver.getDriver(),this);

   }

@FindBy(xpath = "//input[@type='text']")
public WebElement userName;

@FindBy(xpath = "//input[@type='password']")
public WebElement password;

@FindBy(xpath = "//button[@type='submit']")
public WebElement Login_Btn;



//we can try this method for all users to login
    public void loginManager(String user){
        String user_name = ConfigurationReader.getProperty(user+"_username");
        String userPassword = ConfigurationReader.getProperty(user+"_password");
        password.sendKeys(userPassword);
        Login_Btn.click();
        userName.sendKeys(user_name);



    }


/*
public void loginStoreManager() {
    this.userName.sendKeys("storemanager51");
    this.password.sendKeys("UserUser123");
    this.Login_Btn.click();

}


  public void loginSalesManager(){
    this.userName.sendKeys("salesmanager101");
    this.password.sendKeys("UserUser123");
    this.Login_Btn.click();
}


    public void loginDriver(){
        this.userName.sendKeys("user1");
        this.password.sendKeys("UserUser123");
        this.Login_Btn.click();
    }

 */


}
