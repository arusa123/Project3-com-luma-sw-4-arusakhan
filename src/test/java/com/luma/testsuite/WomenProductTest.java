package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.WomenTopPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenProductTest extends BaseTest {
    WomenTopPage womenTopPage = new WomenTopPage();
    HomePage homePage = new HomePage();
    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

//        * Mouse Hover on Women Menu
        homePage.hoverMouseOnWomenMenu();
//                * Mouse Hover on Tops
        homePage.mouseHoverOnWomenTopMenu();
//                * Click on Jackets
        homePage.clickOnWomenJacketMenu();

//* Select Sort By filter “Product Name”
        womenTopPage.productSorter("Product Name ");
//* Verify the products name display in
//        alphabetical order

        Assert.assertEquals(womenTopPage.listBeforeSorting(),womenTopPage.listAfterSorting());
    }

}
