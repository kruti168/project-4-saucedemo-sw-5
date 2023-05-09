package com.saucedemo.testsuite;

import com.saucedemo.customlistener.CustomListener;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)

public class LoginTest extends BaseTest {

    LoginPage loginPage;
    ProductPage productPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt(){

        loginPage = new LoginPage();
        productPage = new ProductPage();

    }@Test(groups = {"sanity","smoke","regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();


    }@Test(groups = {"smoke","regression"})
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUserName();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        productPage.verifyTextProducts();
        productPage.verifyProductList();


    }
}
