package com.orangeHRM.Testcases;

import com.orangeHRM.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DashBoardTC {
    public static void main(String[] args) {
DashBoardTC DB=new DashBoardTC();
DB.Dashboard_searchTC();
    }
@Test
    public void Dashboard_searchTC(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");


        LoginPage Loginpage=new LoginPage(driver);
        Loginpage.login("Admin","admin123");
    }
}
