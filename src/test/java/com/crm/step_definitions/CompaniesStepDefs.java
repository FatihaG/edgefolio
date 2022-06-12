package com.crm.step_definitions;
import com.crm.pages.CompanyPage;

import com.crm.pages.SideMenu;

import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.*;


public class CompaniesStepDefs {

    @Given("the user is logged in successfully")
    public void the_user_is_logged_in_successfully() {

        String currentUrl = Driver.get().getCurrentUrl().toString();
        Assert.assertEquals("https://demo.fundportal-staging.com/app/portals/248/home/",currentUrl);

    }
    @Given("the user clicks on companies menu")
    public void the_user_clicks_on_companies_menu() {
        SideMenu sideMenu = new SideMenu();
        sideMenu.companyLink.click();
    }
    @Then("the list shows only first {int} companies")
    public void the_list_shows_only_first_companies(int count) {
        CompanyPage companyPage = new CompanyPage();
        BrowserUtils.waitFor(3);
        List<WebElement> numRows = Driver.get().findElements(By.xpath("//table[@class='table companies']/tbody/tr"));
        Assert.assertEquals(count, numRows.size());
    }

    @When("with given keyword number of companies should be as below")
    public void with_given_keyword_number_of_companies_should_be_as_below(Map<String,String> searchData) {
        CompanyPage companyPage = new CompanyPage();
        companyPage.search.clear();
        companyPage.search.sendKeys(searchData.get("keyword"));
        companyPage.search.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(3);

        int i = 0;
        List<WebElement> rows = Driver.get().findElements(By.xpath("//table[@class='table companies']/tbody/tr"));
        for(WebElement row: rows){
            if(row.isDisplayed())
                i++;
        }
        int count = Integer.valueOf(searchData.get("count"));
        Assert.assertEquals(count, i);
    }

    @When("number of companies should be as below with given company type and country")
    public void number_of_companies_should_be_as_below_with_given_company_type_and_country(Map<String, String> companyData) {
        SideMenu sideMenu = new SideMenu();
        sideMenu.companyLink.click();
        BrowserUtils.waitFor(1);
        CompanyPage companyPage = new CompanyPage();
        companyPage.dropDownCompanySubType.click();
        BrowserUtils.waitFor(1);
        String xpath = "//label[contains(text(),'"+companyData.get("companySubType")+"')]";
        Driver.get().findElement(By.xpath(xpath)).click();
        BrowserUtils.waitFor(1);
        new Actions(Driver.get()).moveToElement(companyPage.dropDownCompanySubType,1,1).click().perform();

        companyPage.dropDownCountry.click();
        BrowserUtils.waitFor(1);
        xpath = "//label[contains(text(),'"+companyData.get("country")+"')]";
        Driver.get().findElement(By.xpath(xpath)).click();
        BrowserUtils.waitFor(1);
        new Actions(Driver.get()).moveToElement(companyPage.dropDownCountry,1,1).click().perform();

        int i = 0;
        List<WebElement> rows = Driver.get().findElements(By.xpath("//table[@class='table companies']/tbody/tr"));
        for(WebElement row: rows){
            if(row.isDisplayed())
                i++;
        }
        int count = Integer.valueOf(companyData.get("count"));
        Assert.assertEquals(count,i);
    }
    @Given("the user is on companies page and search for {string}")
    public void the_user_is_on_companies_page_and_search_for(String companyName) {
        SideMenu sideMenu = new SideMenu();
        sideMenu.companyLink.click();
        BrowserUtils.waitFor(1);
        CompanyPage companyPage = new CompanyPage();
        companyPage.search.sendKeys(companyName);
        companyPage.search.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(1);

    }

    @Given("the user selects all in the results")
    public void the_user_selects_all_in_the_results() {
        CompanyPage companyPage = new CompanyPage();
        companyPage.checkBoxAll.click();
    }
    @Then("the user clicks delete button and deletes all the companies in one")
    public void the_user_clicks_delete_button_and_deletes_all_the_companies_in_one() {
        CompanyPage companyPage = new CompanyPage();
        BrowserUtils.waitFor(1);
        companyPage.deleteButton.click();
        BrowserUtils.waitFor(1);
        companyPage.noButton.click();

    }


    @Given("the user is on companies page and search for a {string}")
    public void the_user_is_on_companies_page_and_search_for_(String companyName) {
        CompanyPage companyPage = new CompanyPage();
        companyPage.checkBoxAll.click();
        companyPage.mergeButton.click();
        BrowserUtils.waitFor(1);
        companyPage.mergeSelect.click();
        BrowserUtils.waitFor(1);
        Select options = new Select(companyPage.mergeSelect);
        System.out.println(options.getWrappedElement().getText());

    }


    @Then("the user clicks merge button and merges all the companies in one")
    public void the_user_clicks_merge_button_and_merges_all_the_companies_in_one() {

    }


}