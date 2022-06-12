package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends BasePage{

    @FindBy(xpath="//*[contains(text(),'Export Selected Contacts')]")
    public WebElement exportLink;

    public ContactsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

}
