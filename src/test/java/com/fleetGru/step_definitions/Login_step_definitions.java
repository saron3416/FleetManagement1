package com.fleetGru.step_definitions;
import com.fleetGru.pages.BasePage;
import com.fleetGru.utilities.BrowserUtils;
import com.fleetGru.utilities.ConfigurationReader;
import com.fleetGru.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Login_step_definitions {


    BasePage basePage = new BasePage();

    @Given("the user is on the log in page")
    public void the_user_is_on_the_log_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }

    @When("the user enter valid username")
    public void the_user_enter_valid_username() {
        basePage.userName.sendKeys("storemanager51");

    }

    @When("the user enter valid password")
    public void the_user_enter_valid_password() {
        basePage.password.sendKeys("UserUser123");

    }

    @When("the user clicks the log in button")
    public void the_user_clicks_the_log_in_button() {

        basePage.Login_Btn.click();

    }

    @Then("the user should be able to log in")
    public void the_user_should_be_able_to_log_in() {
    }
}