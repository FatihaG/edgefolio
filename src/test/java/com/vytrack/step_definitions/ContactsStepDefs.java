package com.vytrack.step_definitions;

import com.vytrack.pages.ContactInfoPage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {

    @Then("the user should see following menu options")
    public void the_user_should_see_following_menu_options(List<String> menuOptions) {
        System.out.println(menuOptions);

        BrowserUtils.waitFor(3);
        DashboardPage dashboardPage = new DashboardPage();
        List<String> actualMenuOptions = BrowserUtils.getElementsText(dashboardPage.menuOptions);
        System.out.println(actualMenuOptions);

        Assert.assertEquals(menuOptions, actualMenuOptions);
    }

    @Then("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String, String> userData) {
        new LoginPage().login(userData.get("username"), userData.get("password"));

    }
    @Then("the users name should be displayed as such")
    public void the_users_name_should_be_displayed_as_such(Map<String, String> userData) {
        DashboardPage dashboardPage= new DashboardPage();
        String actualUserName= dashboardPage.getUserName();
        dashboardPage.waitUntilLoaderScreenDisappear();
        String expectedUserName= userData.get("firstname")+" "+userData.get("lastname");
        Assert.assertEquals(expectedUserName,actualUserName);
    }

    @When("the user clicks the {string} from contacts")
    public void the_user_clicks_the_from_contacts(String email) {
        BrowserUtils.waitFor(3);
        ContactsPage contactsPage= new ContactsPage();
        contactsPage.getContactEmail(email).click();
        BrowserUtils.waitFor(3);
    }

    @Then("the information should be same with the database")
    public void the_information_should_be_same_with_the_database() {
        BrowserUtils.waitFor(3);
        ContactInfoPage contactInfoPage= new ContactInfoPage();
        String fullname = contactInfoPage.contactFullName.getText();
        String email = contactInfoPage.email.getText();
        String phone = contactInfoPage.phone.getText();


        System.out.println("userNameText = " +  fullname);
        System.out.println("phoneNumber = " + phone);
        System.out.println("email = " + email);

    }

}