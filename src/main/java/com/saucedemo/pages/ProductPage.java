package com.saucedemo.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.customlistener.CustomListener;
import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage extends Utility {

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement verifyProduct;

       //Verify the text “PRODUCTS”
    public void verifyTextProducts(){


        String expectedMessage = "Products";
        String actualMessage = getTextFromElement(verifyProduct);
        Assert.assertEquals(expectedMessage,actualMessage);
        CustomListener.test.log(Status.PASS,"verify the product");

    }
    public int verifyProductList()
    {
        CustomListener.test.log(Status.PASS,"Verify text");
        return getSize(By.xpath("//div[@class='inventory_item']"));

    }
}
