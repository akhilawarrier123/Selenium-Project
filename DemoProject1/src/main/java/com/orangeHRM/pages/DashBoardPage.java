package com.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoardPage {
    WebDriver driver;

    String SearchLocator="//input[@class='oxd-input oxd-input--active']";
    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }
    public void dashboard_search() {
        WebElement Searchbutton = driver.findElement(By.xpath("SearchLocator"));
        Searchbutton.click();

    }

}
