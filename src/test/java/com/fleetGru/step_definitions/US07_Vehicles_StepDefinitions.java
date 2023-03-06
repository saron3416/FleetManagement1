package com.fleetGru.step_definitions;

import com.fleetGru.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US07_Vehicles_StepDefinitions {

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get("url");

    }
    @When("user clicks on the {string} option")
    public void user_clicks_on_the_option(String string) {


    }
    @When("user choose {string} option from dropdown menu")
    public void user_choose_option_from_dropdown_menu(String string) {


    }
    @Then("user should see all unchecked boxes")
    public void user_should_see_all_unchecked_boxes() {


    }

}
