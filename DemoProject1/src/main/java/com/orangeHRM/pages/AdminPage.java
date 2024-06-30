package com.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {

    WebDriver driver;
            String usernameLocator="(//input[@class='oxd-input oxd-input--active'])[2]";
            String userRoleLocator="//div[linkedtext='Admin']";

            String SearchButtonLocator="//button[@type='submit']";
    public AdminPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        this.driver.manage().window().maximize();
        this.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        LoginPage loginPage=new LoginPage(driver);
        loginPage.logIn("Admin","admin123");

        Thread.sleep(5000);
        /*DashBoardPage dashBoardPage=new DashBoardPage(driver);
        dashBoardPage.clickAdminButton();

        Thread.sleep(5000);*/
    }

    public void usernameButton(String name){
        WebElement usernameElement= driver.findElement(By.xpath(usernameLocator));
        usernameElement.sendKeys("Admin");
    }

    public void userRoleButton(){
        WebElement dropDownElement=driver.findElement(By.linkText("Admin"));

        Select selectObject=new Select(dropDownElement);
        selectObject.selectByVisibleText("Admin");

    }
    public void searchButton(){
    WebElement searchElement= driver.findElement(By.xpath(SearchButtonLocator));
    searchElement.click();

}


}
