package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class MensPantsPage extends Utility {
    //declaring the variables
    By cornusYogaPant = (By.xpath("//div[@class='product details product-item-details']"));
    By cornusYogaPantsize = (By.xpath("//div[@class='swatch-attribute size']/div[1]/div"));
    By blackPants = (By.xpath("(//div[@class='swatch-attribute color'])[1]/div/div[1]"));

    By addToCartButton = (By.xpath("(//div[@class='product-item-inner'])[1]/div/div[1]/form/button"));
    By pantsAddedtoCartText = (By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));

    By shoppingCartLink = (By.linkText("shopping cart"));

    By thePantsText = (By.xpath("(//a[contains(.,'Cronus Yoga Pant')])[2]"));
//    By theSizeOfThePants = (By.xpath("//dd[contains(text(),'32')]"));
//
//    By theColourOfThePants = (By.xpath("//dd[contains(text(),'Black')]"));

    //this method will mouse hover on the product
    public void hoverMouseOnTheProduct() {
        mouseHoverToElement(cornusYogaPant);
    }

    //this method will click on the product size
    public void clickOnTheRequiredSize() {
        clickOnElement(cornusYogaPantsize);
    }

    //this method will select the colour
    public void clickOnTheRequiredColour() {
        clickOnElement(blackPants);
    }

    //this method will add the product to cart
    public void clickOnTheAddCartButton() {
        clickOnElement(addToCartButton);
    }

    //this method will get the text
    public String getTheShoppingcartText() {
        return getTextFromElement(pantsAddedtoCartText);
    }

    //this method will click on shopping cart link
    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingCartLink);
    }

    public String getThePantsText() {
        return getTextFromElement(thePantsText);
    }

    //this method will get the size of the pants
//    public String getTheSizeOfThePants() {
//        return getTextFromElement(theSizeOfThePants);
//    }
//
//    public String getTheColourOfThePants() {
//        return getTextFromElement(theColourOfThePants);
//    }


}
