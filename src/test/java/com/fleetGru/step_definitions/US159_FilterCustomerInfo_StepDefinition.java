package com.fleetGru.step_definitions;

import com.fleetGru.pages.BasePage;
import com.fleetGru.pages.FilterCustomerInfoPage_Bema;
import com.fleetGru.utilities.ConfigurationReader;
import com.fleetGru.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class US159_FilterCustomerInfo_StepDefinition {


   BasePage basePage = new BasePage();

   @Given("user logs in with valid credentials")
   public void user_is_already_logged_in_to_fleet_management_app() {
      Driver.getDriver().get(ConfigurationReader.getProperty("url"));
      basePage.loginSalesManager();

   }
   @When("user lands on Dashboard page")
   public void user_lands_on_dashboard_page() {

      Driver.getDriver().findElement(By.xpath("//h1[@class='oro-subtitle']"));


   }
   FilterCustomerInfoPage_Bema filterCustomerInfoPageBema = new FilterCustomerInfoPage_Bema();
   @Then("user hovers over Customers module")
   public void user_hovers_over_customers_module() {
      filterCustomerInfoPageBema.customerModuleBtn.click();


   }
   @Then("user clicks on Account dropdown")
   public void user_clicks_on_account_dropdown() {

   }
   @Then("user must see filter options")
   public void user_must_see_filter_options() {

   }

}