package com.crm.step_definitions;

import com.crm.pages.ContactsPage;
import com.crm.pages.SideMenu;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.junit.Assert;

import java.io.File;

public class ContactsStepDefs {

    @Given("the user clicks on contacts menu")
    public void the_user_clicks_on_contacts_menu() {
        SideMenu sideMenu = new SideMenu();
        sideMenu.contactsLink.click();
        BrowserUtils.waitFor(3);
    }
    @When("the user lands on contacts page and click export button")
    public void the_user_lands_on_contacts_page_and_click_export_button() {
        ContactsPage contactsPage = new ContactsPage();
        String currentUrl = Driver.get().getCurrentUrl().toString();
        Assert.assertEquals("https://demo.fundportal-staging.com/app/crm/248/contacts/",currentUrl);
        contactsPage.exportLink.click();
        BrowserUtils.waitFor(10);
    }
    @Then("excel file is downloaded on the local machine")
    public void excel_file_is_downloaded_on_the_local_machine() throws Exception {
         Assert.assertTrue("Downloaded",isFileDownloaded());
    }

    public boolean isFileDownloaded() throws Exception {
        final int SLEEP_TIME_MILLIS = 1000;
        File file = new File("/Users/kerimbalci/Downloads/contacts_2022-06-12.xlsx");
        final int timeout = 60* SLEEP_TIME_MILLIS;
        int timeElapsed = 0;
        while (timeElapsed<timeout){
            if (file.exists()) {
                return true;
            } else {
                timeElapsed +=SLEEP_TIME_MILLIS;
                Thread.sleep(SLEEP_TIME_MILLIS);
            }
        }
        return false;
    }

}
