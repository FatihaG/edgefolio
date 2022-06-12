package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="id_username")
    public WebElement userName;

    @FindBy(id="id_password")
    public WebElement password;

    @FindBy(id="submit-id-authlogin")
    public WebElement submitButton;

    @FindBy(css="a.cc-btn.cc-dismiss")
    public WebElement cookieButton;

    @FindBy(id="intercom-frame")
    public WebElement iFrame;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submitButton.click();
    }


}
