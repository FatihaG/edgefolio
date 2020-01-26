package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer ePageNumber) {
        ContactsPage contactsPage =new ContactsPage();
        contactsPage.waitUntilLoaderScreenDisappear();
        Integer actualPageNumber= Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));
        Assert.assertEquals(ePageNumber,actualPageNumber);
        
    }
    @When("User should be able to navigate from Fleet to Vehicles")
    public void user_should_be_able_to_navigate_from_Fleet_to_Vehicles() {
        System.out.println("User should be able to navigate from Fleet to Vehicles");
    }

    @When("User should be able to navigate from Marketing to Campaigns")
    public void user_should_be_able_to_navigate_from_Marketing_to_Campaigns() {
        System.out.println("User should be able to navigate from Marketing to Campaigns");
    }

    @When("User should be able to navigate from Activities to Calendar Events")
    public void user_should_be_able_to_navigate_from_Activities_to_Calendar_Events() {
        System.out.println("User should be able to navigate from Activites to Calendar Events");
    }

    @Then("User should see fleet url")
    public void user_should_see_fleet_url() {
        System.out.println("Verify that user is on the correct page");
    }

    @Then("User should see campaign url")
    public void user_should_see_campaign_url() {
        System.out.println("Verify that user is on the correct page");
    }

    @Then("User should see calender events url")
    public void user_should_see_calender_events_url() {
        System.out.println("Verify that user is on the correct page");
    }

    @Given("the user logged in as a driver")
    public void the_user_logged_in_as_a_driver() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username,password);
    }

    @Given("the user logged in as a {string}")
    public void the_user_logged_in_as_a(String user) {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        String username = null;
        String password = null;

        if(user.equals("driver")){
            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");
        }else if(user.equals("sales manager")){
            username = ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");
        }else if(user.equals("store manager")){
            username = ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");
        }

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

}
