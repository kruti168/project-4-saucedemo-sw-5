package com.saucedemo.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.customlistener.CustomListener;
import com.saucedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@name='user-name']")
    WebElement userNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement clickOnLogin;

    //Enter “standard_user” username
    public void enterUserName(){

        sendTextToElement(userNameField,"standard_user");
        CustomListener.test.log(Status.PASS,"Enter username" +userNameField);

       }//* Enter “secret_sauce” password
    public void enterPassword(){

      sendTextToElement(passwordField,"secret_sauce");
      CustomListener.test.log(Status.PASS,"Enter password");

    }//* Click on ‘LOGIN’ button
    public void clickOnLoginButton(){

       clickOnElement(clickOnLogin);
    }
}
