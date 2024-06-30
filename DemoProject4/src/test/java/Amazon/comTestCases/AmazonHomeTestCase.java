package Amazon.comTestCases;

import Amazon.comPages.AmazonHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomeTestCase {
    public static void main(String[] args) throws InterruptedException {
        AmazonHomeTestCase amazonHomeTestCase=new AmazonHomeTestCase();

        amazonHomeTestCase.amazonHomeTestCase();


    }


    public void amazonHomeTestCase() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);

        AmazonHomePage amazonHomePage=new AmazonHomePage(driver);
        amazonHomePage.mobileMenuClick();
    }

}
