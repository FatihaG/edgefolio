package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDefs {

    @Given("cookie pop-up disappears")
    public void cookie_pop_up_disappears() {
        LoginPage loginPage= new LoginPage();
        loginPage.cookieButton.click();
        BrowserUtils.waitFor(2);
        //Driver.get().switchTo().frame(1);
        BrowserUtils.waitFor(2);

    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user enter the login information")
    public void the_user_enter_the_login_information() {
        BrowserUtils.waitFor(2);
        LoginPage loginPage= new LoginPage();
        String username= ConfigurationReader.get("username");
        String password= ConfigurationReader.get("password");
        loginPage.login(username,password);
    }
    @Then("the user should be able to login to crm page")
    public void the_user_should_be_able_to_login_to_crm_page() {
        BrowserUtils.waitFor(2);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Edgefolio", actualTitle);
    }


}
