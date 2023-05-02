package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.MensPantsPage;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenProductTest extends BaseTest {
    HomePage homePage = new HomePage();
    MensPantsPage mensPantsPage = new MensPantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {
        //* Mouse Hover on Men Menu
        homePage.hoverMouseOnMenMenu();
        // Mouse Hover on Bottoms
        homePage.hoverMouseOnMenBottom();
        //* Click on Pants
        homePage.clickOnMenPantsMenu();
        //* Mouse Hover on product name
        mensPantsPage.hoverMouseOnTheProduct();

        //‘Cronus Yoga Pant’ and click on size 32.
        mensPantsPage.clickOnTheRequiredSize();
        //‘Cronus Yoga Pant’ and click on colour Black.
        mensPantsPage.clickOnTheRequiredColour();
        //‘Cronus Yoga Pant’ and click on add to cart button
        mensPantsPage.clickOnTheAddCartButton();
        //* Verify the text
        Assert.assertEquals(mensPantsPage.getTheShoppingcartText(), "You added Cronus Yoga Pant to your shopping cart.", "Error");
        //* Click on ‘shopping cart’ Link into message
        mensPantsPage.clickOnShoppingCartLink();
        //* Verify the text ‘Shopping Cart.’
        Assert.assertEquals(shoppingCartPage.getTheShoppingCartPageTitle(), "Shopping Cart", "Incorrect name");
        //* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(mensPantsPage.getThePantsText(), "Cronus Yoga Pant", "Incorrect name");
        //* Verify the product size ‘32’
    Assert.assertEquals(shoppingCartPage.getTheSizeOfThePants(),"32","Incorrect size");
        //* Verify the product colour ‘Black’
        Assert.assertEquals(shoppingCartPage.getTheColourOfThePants(),"Black","Incorrect colour");
    }
}
