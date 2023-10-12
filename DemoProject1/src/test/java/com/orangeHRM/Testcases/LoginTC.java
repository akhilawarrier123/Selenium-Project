package com.orangeHRM.Testcases;

import com.orangeHRM.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static java.lang.reflect.Array.set;

public class LoginTC {
    public static void main(String[] args) throws InterruptedException {
        LoginTC loginTC=new LoginTC();
        loginTC.TC1_login_Valid_Username_and_Password();

    }

    @Test
    public void TC1_login_Valid_Username_and_Password() throws InterruptedException {


        WebDriver driver=new ChromeDriver();


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       Thread.sleep(1000);


        LoginPage Loginpage=new LoginPage(driver);
        Loginpage.login("Admin","admin123");


    }

}
