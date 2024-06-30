package OrangeHrmTestCases;

import OrangHrm.comPages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPageTC {

    public static void main(String[] args) throws InterruptedException {
        LoginPageTC loginTC=new LoginPageTC();
        loginTC.TC1_login_Valid_Username_and_Password(); ;

    }


    public void TC1_login_Valid_Username_and_Password() throws InterruptedException {


        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);


        LoginPage Loginpage=new LoginPage(driver);
        Loginpage.logIn("Admin","admin123");
        Thread.sleep(1000);


        System.out.println(driver.getCurrentUrl());
    }

}
