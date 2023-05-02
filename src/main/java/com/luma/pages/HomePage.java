package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By menMenu = By.id("ui-id-5");

    By gearMenu = By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-corner-all']/li[4]");

    By womenTopMenu = By.xpath("//a[@id='ui-id-9']");

    By womenJacketMenu = By.id("ui-id-11");

    By menBottomMenu = (By.id("ui-id-18"));

    By menPantsMenu = (By.linkText("Pants"));

    By gearBagMenu = (By.xpath("//span[normalize-space()='Bags']"));

    public void hoverMouseOnWomenMenu() throws InterruptedException {
        Thread.sleep(2000);
        mouseHoverToElement(womenMenu);

    }

    public void mouseHoverOnWomenTopMenu() {
        mouseHoverToElement(womenTopMenu);
    }

    public void clickOnWomenJacketMenu() {
        clickOnElement(womenJacketMenu);
    }

    public void hoverMouseOnMenMenu() {
        mouseHoverToElement(menMenu);
    }

    public void hoverMouseOnMenBottom() {
        mouseHoverToElement(menBottomMenu);
    }

    public void clickOnMenPantsMenu() {
        clickOnElement(menPantsMenu);
    }

    public void hoverMouseOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBagMenu() {
        clickOnElement(gearBagMenu);
    }

}
