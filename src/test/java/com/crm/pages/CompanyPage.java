package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage extends BasePage {


    @FindBy(id = "user-general-search")
    public WebElement search;

    @FindBy(xpath = "(//button[@class ='popup-invoker toggler'])[2]")
    public WebElement dropDownCompanySubType;

    @FindBy(xpath = "(//button[@class ='popup-invoker toggler'])[3]")
    public WebElement dropDownCountry;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement checkBoxAll;

    @FindBy(xpath= "//*[contains(text(),'Merge')]")
    public WebElement mergeButton;

    @FindBy(id = "groups-select")
    public WebElement mergeSelect;

    @FindBy(xpath= "//*[contains(text(),'Delete')]")
    public WebElement deleteButton;

    @FindBy(css="button.yesButton")
    public WebElement yesButton;

    @FindBy(css="button.noButton")
    public WebElement noButton;
    public CompanyPage(){
        PageFactory.initElements(Driver.get(), this);
    }

}
