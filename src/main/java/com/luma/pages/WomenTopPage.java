package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTopPage extends Utility {

    By productList = By.xpath("//ol[@class='products list items product-items']/li/div/div/strong");
    By productSorter = (By.xpath("//select[@id='sorter']"));


    public ArrayList<String> listBeforeSorting() {
        List<WebElement> listOrder = driver.findElements(productList);
        ArrayList<String> originalList = new ArrayList<>();
        for (WebElement e : listOrder) {
            originalList.add(e.getText());
        }
        return originalList;
    }

    public ArrayList<String> listAfterSorting() {

        Collections.sort(listBeforeSorting());
//        Select Sort By filter “Product Name”

//           Verify the products name display in
//        alphabetical order
        List<WebElement> listSorted = driver.findElements(productList);
        ArrayList<String> sortedList = new ArrayList<>();
        for (WebElement e : listSorted) {
            sortedList.add(e.getText());
        }
        return sortedList;
    }

    public void productSorter(String sort) {
        selectByVisibleTextFromDropDown(productSorter, sort);

    }
}