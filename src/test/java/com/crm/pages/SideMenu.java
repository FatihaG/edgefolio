package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideMenu extends BasePage {
    public SideMenu(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css="a[href='/app/crm/248/companies/']")
    public WebElement companyLink;

    @FindBy(css="a[href='/app/crm/248/contacts/']")
    public WebElement contactsLink;

    @FindBy(css="a[href='/app/crm/248/deals/']")
    public WebElement dealsLink;



}
