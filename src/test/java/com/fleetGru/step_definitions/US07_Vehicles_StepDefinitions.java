package com.fleetGru.step_definitions;

import com.fleetGru.pages.BasePage;
import com.fleetGru.pages.FleetPage_BK;
import com.fleetGru.utilities.BrowserUtils;
import com.fleetGru.utilities.ConfigurationReader;
import com.fleetGru.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

import javax.sql.rowset.BaseRowSet;

public class US07_Vehicles_StepDefinitions{

    BasePage basePage = new BasePage();
    Actions actions = new Actions(Driver.getDriver());
    FleetPage_BK fleetPage = new FleetPage_BK();


    @Given("user is on the homepage")
    public void user_is_on_the_homepage(String user) {
    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        basePage.loginStoreManager();


    }
    @When("user navigates on the {string} option")
    public void user_navigates_on_the_option(String fleetOption) {
        BrowserUtils.sleep(2);
        actions.moveToElement(fleetPage.vehicleOpt).perform();

    }
    @When("user choose {string} option from dropdown menu")
    public void user_choose_option_from_dropdown_menu(String string) {
        BrowserUtils.sleep(2);


    }
    @Then("user should see all unchecked boxes")
    public void user_should_see_all_unchecked_boxes() {


    }

}
