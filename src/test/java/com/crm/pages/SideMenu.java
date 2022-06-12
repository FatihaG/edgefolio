package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideMenu extends BasePage {

    @FindBy(css="a[href='/app/crm/248/companies/']")
    public WebElement companyLink;



}
