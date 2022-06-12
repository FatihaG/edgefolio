package com.crm.step_definitions;

import com.crm.pages.SideMenu;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DealsStepDefs {

    @When("the user clicks on deals menu")
    public void the_user_clicks_on_deals_menu() {
       SideMenu sideMenu = new SideMenu();
       sideMenu.dealsLink.click();
        BrowserUtils.waitFor(2);
    }
    @Then("the user is on deals page")
    public void the_user_is_on_deals_page() {
        String currentUrl = Driver.get().getCurrentUrl().toString();
        Assert.assertEquals("https://demo.fundportal-staging.com/app/crm/248/deals/", currentUrl);
    }
}
