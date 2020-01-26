package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.SQLOutput;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enter the driver information")
    public void the_user_enter_the_driver_information() {
        BrowserUtils.waitFor(2);
        LoginPage loginPage= new LoginPage();
        String username= ConfigurationReader.get("driver_username");
        String password= ConfigurationReader.get("driver_password");
        loginPage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(2);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);
    }

    @When("the user enter the sales manager information")
    public void the_user_enter_the_sales_manager_information() {
        LoginPage loginPage= new LoginPage();
        String username= ConfigurationReader.get("sales_manager_username");
        String password= ConfigurationReader.get("sales_manager_password");
        loginPage.login(username,password);
    }

    @When("the user enter the store manager information")
    public void the_user_enter_the_store_manager_information() {
        LoginPage loginPage= new LoginPage();
        String username= ConfigurationReader.get("store_manager_username");
        String password= ConfigurationReader.get("store_manager_password");
        loginPage.login(username,password);
    }
    @When("The user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        LoginPage loginPage= new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the title should contain {string}")
    public void the_title_should_contain(String string) {
        BrowserUtils.waitFor(7);
        Assert.assertEquals(string, Driver.get().getTitle());
    }

}
