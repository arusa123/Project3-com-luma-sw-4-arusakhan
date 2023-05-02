package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ShoppingCartPage extends Utility {
    //declaring the elements variable
    By verifyTheProductName = (By.xpath("(//div[@class='product-item-details'])[2]/strong/a"));

    By quantityField = (By.xpath("//input[@class='input-text qty']"));
    By verifyTheProductPrice = (By.xpath("//span[@data-bind='text: getValue()'][normalize-space()='$135.00']"));

    By clickOnupdateShoppingCart = (By.xpath("//button[@class='action update']"));

    By verifytheUpdatedPrice = (By.xpath("(//span[@class='cart-price'])[2]"));
    By shoppingCartText = (By.xpath("//span[@class='base']"));


    By theSizeOfThePants = (By.xpath("//dd[contains(text(),'32')]"));

    By theColourOfThePants = (By.xpath("//dd[contains(text(),'Black')]"));


    //this method will verify the product name
    public String verifyTheProdutsName() {
        return getTextFromElement(verifyTheProductName);
    }

    //this method will verify the quanity of the bag
    public String getQuantityOfProduct() {
        String quantity = driver.findElement(quantityField).getAttribute("value");
        return quantity;
    }

    //this method will verify the product price
    public String getPriceOfTheProduct() {
        return getTextFromElement(verifyTheProductPrice);

    }

    //this method will change the quantity
    public void changeTheQuanitytOfTheBag(String qty) {
        driver.findElement(quantityField).sendKeys(Keys.DELETE);
        sendTextToElement(quantityField, qty);
    }

    //this method will update the shopping cart
    public void updateTheShoppingCart() {
        clickOnElement(clickOnupdateShoppingCart);
    }

    //this method will verify the updated price
    public String UpdatedProductPrice() {
        waitUntilVisibilityOfElementLocated(verifytheUpdatedPrice, 20);
        return getTextFromElement(verifytheUpdatedPrice);
    }

    public String getTheShoppingCartPageTitle() {
        return getTextFromElement(shoppingCartText);
    }
    public String getTheSizeOfThePants() {
        return getTextFromElement(theSizeOfThePants);
    }

    public String getTheColourOfThePants() {
        return getTextFromElement(theColourOfThePants);
    }


}
