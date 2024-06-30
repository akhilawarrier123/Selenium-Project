package OrangHrm.comPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    String usernameLocator="username";
    String passwordLocator="password";
    String loginLocator="//button[@type='submit']";

    public  LoginPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        this.driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);


    }

    public void logIn(String username,String password) {
        WebElement usernameElement = driver.findElement(By.name(usernameLocator));
        usernameElement.sendKeys(username);

        WebElement passwordElement = driver.findElement(By.name(passwordLocator));
        passwordElement.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath(loginLocator));
        loginButton.click();
    }
}


