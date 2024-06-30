package Amazon.comTestCases;

import Amazon.comPages.AmazonHomePage;
import Amazon.comPages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPageTestCase {
    public static void main(String[] args) throws InterruptedException {
        SearchPageTestCase searchPageTestCase=new SearchPageTestCase();
        searchPageTestCase.searchTestCase();
    }

    public void searchTestCase() throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        AmazonHomePage amazonHomePage=new AmazonHomePage(driver);
        amazonHomePage.mobileMenuClick();
        driver.get("https://www.amazon.in/");


         SearchPage searchPage=new SearchPage(driver);
        searchPage.searchLaptop();
        searchPage.searchLocation();

        driver.get("https://www.amazon.in/");
       Thread.sleep(2000);
    }


}
