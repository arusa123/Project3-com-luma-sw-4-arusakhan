package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class GearBagPage extends Utility {
    By overnightDuffle = (By.xpath("//a[normalize-space()='Overnight Duffle']"));

    By bagTitle = (By.xpath("//span[contains(.,'Overnight Duffle')]"));

    By quantityField = (By.xpath("//input[@id='qty']"));

    By addToCartButton = (By.id("product-addtocart-button"));

    By addedSuccfullyText = (By.xpath("//div[contains(@data-bind,'html: $parent.prepareMessageForHtml(message.text)')]"));

    By clickOnShoppingLink = (By.linkText("shopping cart"));


    //this method will click on the bag
    public void clickOnNightDuffleBag() {
        clickOnElement(overnightDuffle);

    }

    //this method will verify the text
    public String verifyTheBagText() {
        return getTextFromElement(bagTitle);

    }

    //this method will change the quantity
    public void changeTheQuanityOfTheBag(String qty) {
        driver.findElement(quantityField).sendKeys(Keys.DELETE);
        sendTextToElement(quantityField, qty);
    }

    //this method will click on cart
    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    //this method will get the added to cart successfully  text
    public String bagAddedToCartSuccessfullyMessage() {
        return getTextFromElement(addedSuccfullyText);
    }

    //this method will click on shopping link
    public void clickOnShoppingCartLink() {
        clickOnElement(clickOnShoppingLink);
    }


}
