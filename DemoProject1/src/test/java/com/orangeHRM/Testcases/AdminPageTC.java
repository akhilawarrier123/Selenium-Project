package com.orangeHRM.Testcases;

import com.orangeHRM.pages.AdminPage;
import com.orangeHRM.pages.DashBoardPage;
import com.orangeHRM.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminPageTC {
    public static void main(String[] args) throws InterruptedException {
        AdminPageTC adminPageTC=new AdminPageTC();

        adminPageTC.testCaseAdmin();
    }



    public void testCaseAdmin() throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
       Thread.sleep(5000);



        AdminPage adminPage = new AdminPage(driver);
        adminPage.usernameButton("Admin");
        Thread.sleep(5000);
        adminPage.userRoleButton();
        Thread.sleep(5000);
        adminPage.searchButton();
        Thread.sleep(5000);


    }

}

