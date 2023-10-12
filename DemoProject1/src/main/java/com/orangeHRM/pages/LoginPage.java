package com.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
   WebDriver driver;
    String username_locator="//input[@name='username']";
    String password_locator="//input[@name='password']";
    String login_Locator="//button[@type='submit']";
    String title_locator="//div[@class='orangehrm-login-container']";
    public  LoginPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
    }

    public void login(String username,String password) {
        WebElement usernameElement = driver.findElement(By.xpath(username_locator));
        usernameElement.sendKeys(username);

        WebElement passwordElement = driver.findElement(By.xpath(password_locator));
        passwordElement.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath(login_Locator));
        loginButton.click();
    }


    }



