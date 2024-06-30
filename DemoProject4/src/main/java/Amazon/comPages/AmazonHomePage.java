package Amazon.comPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonHomePage {
    WebDriver driver;
    String mobileMenuLocator = "//*[@id=\"nav-xshop\"]/a[5]";
    String searchLocator="twotabsearchtextbox";
    String searchElementLocator="nav-search-submit-button";

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        this.driver.get("https://www.amazon.in/");

    }


    public void mobileMenuClick() {
        WebElement mobileMenuElement = driver.findElement(By.xpath(mobileMenuLocator));

        Actions actions = new Actions(driver);
        actions.moveToElement(mobileMenuElement).click().build().perform();
        List<WebElement> elements = driver.findElements(By.className("spacious"));

        System.out.println("Menu Items are: ");
        //iterate through list
        for (WebElement numberOfElements : elements) {
            System.out.println(numberOfElements.getText());


            System.out.println("Size :" + numberOfElements.getSize());


            WebElement searchElement=driver.findElement(By.id(searchLocator));
            searchElement.sendKeys("Gaming Laptop");

            WebElement searchButtonElement=driver.findElement(By.id(searchElementLocator));
            searchButtonElement.click();
            driver.navigate().forward();
        }
    }
}

